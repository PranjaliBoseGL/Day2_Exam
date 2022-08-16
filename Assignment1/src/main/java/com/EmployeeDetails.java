package com;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class EmployeeDetails
{
	
  @RequestMapping("/employee")

  public String display(@RequestParam("empno") String empno, @RequestParam("empname") String empname,@RequestParam("gender") String gender, @RequestParam("des") String des, @RequestParam("sal") String sal, @RequestParam("phno") String phno,@RequestParam("address") String address,Model m) throws Exception
  {

	
	 
      
           //add a message to the model

      m.addAttribute("empno", empno);
      m.addAttribute("empname", empname);
      m.addAttribute("gender", gender);
      m.addAttribute("des", des);
      m.addAttribute("sal", sal);
      m.addAttribute("phno", phno);
      m.addAttribute("address", address);
      

      return "viewpage";

   

  }

}








