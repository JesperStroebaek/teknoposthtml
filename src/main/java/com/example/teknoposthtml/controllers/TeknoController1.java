package com.example.teknoposthtml.controllers;
import com.example.teknoposthtml.models.Bil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeknoController1 {

    private Bil bil;

    // Controller
    public TeknoController1() {
        this.bil = bil;
    }

    // Metode
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("5", bil);
        return "Hello";
    }
    @GetMapping("/formpage")
    public String formpage(){
        return "formpage";
    }

    @PostMapping("/formpage")
    public String formpage(@ModelAttribute Bil bil){
        this.bil = bil;
        return "redirect:/";
    }
}
