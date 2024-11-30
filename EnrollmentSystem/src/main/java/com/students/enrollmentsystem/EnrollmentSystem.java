/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.students.enrollmentsystem;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class EnrollmentSystem {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame frame = new Main();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
        
    }
}
