/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.project;

/**
 *
 * @author maithaalhayyas
 */
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class XandO extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public xPanel pan;
	public XandO(){
		pan = new xPanel();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int sx,sy;
		sx=(int) dim.getWidth()/3;
		sy=(int) dim.getHeight()/4;
		this.setSize(416,436);
		this.setLocation(sx, sy);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.add(pan);

		
	}

	public static void main(String args[]){
		new XandO();
		
		
	}
}

