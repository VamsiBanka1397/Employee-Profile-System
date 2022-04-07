package com.example.Employee.Profile.System;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private EmpService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<EmpSystem> listofemployees = service.listAll();
        model.addAttribute("listofemployees", listofemployees);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewEmployee(Model model) {
        EmpSystem empSystem = new EmpSystem();
        model.addAttribute("EmpSystem", empSystem);

        return "new_employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("EmpSystem") EmpSystem empSystem) {
        service.save(empSystem);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditemployee(@PathVariable(name = "EmployeeCode") long EmployeeCode) {
        ModelAndView mav = new ModelAndView("edit_employee");
        EmpSystem empSystem = service.get(EmployeeCode);
        mav.addObject("EmpSystem", empSystem);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(name = "EmployeeCode") long EmployeeCode) {
        service.delete(EmployeeCode);
        return "redirect:/";
    }
}

