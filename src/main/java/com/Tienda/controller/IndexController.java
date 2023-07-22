/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.dao.UsuarioDao;
import com.Tienda.domain.Usuario;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author joel
 */

@Controller
@RequestMapping("/")
@Slf4j
public class IndexController {
    
    @Autowired
    public UsuarioDao usuarioDao;
    
    @GetMapping("/")
    public String home(Model model, HttpSession httpSession) {
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        UserDetails user = null;
//        
//        if (principal instanceof UserDetails) user = (UserDetails) principal;
//        
//        if(user != null) {
//            Usuario usuario = usuarioDao.findByUsername(user.getUsername());
//            httpSession.setAttribute("Email", usuario.getCorreo());
//        }
        
        return "redirect:/categoria/listado";
    }
    
}   
