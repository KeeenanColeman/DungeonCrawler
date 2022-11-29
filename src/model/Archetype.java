/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author Sawyer Neal
 */
public class Archetype {
    private String name;
    private int XP;
    private int level;
    
    public Archetype(String newName) {
        name = newName;
        XP = 0;
        level = 1;
    }
    
    public void levelUp() {
        if (XP >= 100) {
            level++;
            XP = XP - 100;
        }
    }
}