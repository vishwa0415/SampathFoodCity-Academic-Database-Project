/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.SampathFoodCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author a
 */
public class Vishwa_1031130_SampathDDD extends JFrame {

    Vishwa_1031130_SampathDDD() {

        JLabel l1 = new JLabel("SAMPATH FOOD CITY");
        l1.setBounds(90, 20, 500, 50);
        l1.setForeground(Color.GRAY);
        add(l1);
        Font ff = new Font("CheddarGothicRough", Font.BOLD, 40);
        l1.setFont(ff);
        JButton b1 = new JButton("Customer");
        b1.setBounds(400,90,150,25);
        add(b1);
        JButton b2 = new JButton("Order");
        b2.setBounds(400,150,150,25);
         
        add(b2);
        JButton b3 = new JButton("Payment");
        b3.setBounds(400,200,150,25);
         
        add(b3);
        JButton b4 = new JButton("Supplier");
        b4.setBounds(400,250,150,25);
        
        add(b4);
        JButton b5 = new JButton("Product");
        b5.setBounds(400,300,150,25);
        
        add(b5);
        JButton b6 = new JButton("Category");
        b6.setBounds(400,350,150,25);
         add(b6);
       
        
       
          b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Cus_manage Frame = new Cus_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 
             b2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Order_manage Frame = new Order_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 
              b3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Pay_manage Frame = new Pay_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 
                b4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Supplier_manage Frame = new Supplier_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 
                  b5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Product_manage Frame = new Product_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 
                    b6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Cate_manage Frame = new Cate_manage();
   Frame.setVisible(true);
   dispose();
     
           
      }
  }); 

       
        setLayout(null);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Vishwa_1031130_SampathDDD JFrame = new Vishwa_1031130_SampathDDD();

    }
}
