package com.example.topaz.adddeletedbjpaproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EntityController {

    @Autowired
    private CustomEntityRepository customEntityRepo;

    public EntityController(CustomEntityRepository customEntityRepo) {
        this.customEntityRepo = customEntityRepo;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<CustomEntity> entities= (List<CustomEntity>) customEntityRepo.findAll();
        model.addAttribute("customEntities", entities);

//        List<CustomEntity> test= (List<CustomEntity>) model.getAttribute("customEntities");
//        for(CustomEntity t: test) {
//            System.out.println(t.getTitle());
//        }

        return "home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("customEntity", new CustomEntity());

        System.out.println(((CustomEntity)model.getAttribute("customEntity")).getId());

        return "add";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("customEntity") CustomEntity customEntity) {
        System.out.println(customEntity.getId());
        this.customEntityRepo.save(customEntity);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomEntity(@PathVariable("id") long customEntityId) {
        if (this.customEntityRepo.existsById(customEntityId)) {
            this.customEntityRepo.deleteById(customEntityId);
        }

        return "redirect:/";
    }

    @GetMapping("/login")
    public ModelAndView login(@RequestParam(value="error", defaultValue = "false") boolean error, Model model) {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("error", error);
        return modelAndView;
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }



}
