package com.example.SpringWebApplicationDemo.controller;

import com.example.SpringWebApplicationDemo.Notification;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormatSymbols;
import java.util.Calendar;

@Controller
public class HelloController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    @GetMapping("/add1")
    public String add1(HttpServletRequest request, HttpSession session) {
        int firstNum = Integer.parseInt(request.getParameter("num1"));
        int secondNum = Integer.parseInt(request.getParameter("num2"));
        int result = firstNum + secondNum;
        session.setAttribute("result", result);
        return "result";
    }

    @GetMapping("/add2")
    public String add2(@RequestParam("num1") int firstNum, @RequestParam("num2") int secondNum, HttpSession session) {
//        int firstNum = Integer.parseInt(request.getParameter("num1"));
//        int secondNum = Integer.parseInt(request.getParameter("num2"));
        int result = firstNum + secondNum;
        session.setAttribute("result", result);
        return "result";
    }

    @GetMapping("/add3")
    public String add3(@RequestParam("num1") int firstNum, @RequestParam("num2") int secondNum, Model model) {
//        int firstNum = Integer.parseInt(request.getParameter("num1"));
//        int secondNum = Integer.parseInt(request.getParameter("num2"));
        int result = firstNum + secondNum;
       // session.setAttribute("result", result);
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/additions")
    public ModelAndView add(@RequestParam("num1") int firstNum, @RequestParam("num2") int secondNum, ModelAndView modelAndView) {
//        int firstNum = Integer.parseInt(request.getParameter("num1"));
//        int secondNum = Integer.parseInt(request.getParameter("num2"));
        int result = firstNum + secondNum;
        // session.setAttribute("result", result);
        // model.addAttribute("result", result);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");
        return modelAndView;
    }


    @GetMapping("/notification")
    public String notification() {
        return "notification";
    }

    @GetMapping("/addNotification1")
    public ModelAndView addNotification1(@RequestParam("type") String type, @RequestParam("message") String message, ModelAndView modelAndView) {
        Notification notification = new Notification();
        notification.setMessage(message);
        notification.setType(type);
        modelAndView.addObject("result", notification);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @GetMapping("/addNotification3")
    public String addNotification4(@ModelAttribute("notify") Notification notification) {
//        Notification notification = new Notification();
//        notification.setMessage(message);
//        notification.setType(type);
//        modelAndView.addObject("result", notification);
//        modelAndView.setViewName("result");
        return "result";
    }

    @GetMapping("/addNotification")
    public String addNotification(Notification notification) {
//        Notification notification = new Notification();
//        notification.setMessage(message);
//        notification.setType(type);
//        modelAndView.addObject("result", notification);
//        modelAndView.setViewName("result");
        return "result";
    }

    @ModelAttribute("today")
    public String getTodayDay() {
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        return dayNames[date.get(Calendar.DAY_OF_WEEK)];
    }

}
