package com.ltp.globalsuperstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StoreController {
    List<Inventory> inventories = new ArrayList<>();
    
    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("inventories", inventories);
        return "inventory";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Inventory inventory) {
        return "redirect:/inventory";
    }
    

}
