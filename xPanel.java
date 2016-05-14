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
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class xPanel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	
	public boolean turn;
	public boolean turn11;
	public boolean turn12;
	public boolean turn13;
	public boolean turn21;
	public boolean turn22;
	public boolean turn23;
	public boolean turn31;
	public boolean turn32;
	public boolean turn33;
	
	public boolean done11;
	public boolean done12;
	public boolean done13;
	public boolean done21;
	public boolean done22;
	public boolean done23;
	public boolean done31;
	public boolean done32;
	public boolean done33;
	
	public int count11;
	public int count12;
	public int count13;
	public int count21;
	public int count22;
	public int count23;
	public int count31;
	public int count32;
	public int count33;
	
	public int player;
	
	public int m11;
	public int m12;
	public int m13;
	public int m21;
	public int m22;
	public int m23;
	public int m31;
	public int m32;
	public int m33;
	
	public int m111;
	public int m112;
	public int m121;
	public int m122;
	public int m131;
	public int m132;
	
	
	
	Image image;
	ImageIcon icon; // these are for the images of the x an o s
	Image image2;
	ImageIcon icon2;
	
	Rectangle rect1;
	Rectangle rect2;
	Rectangle rect3;
	Rectangle rect4;
	Rectangle rect5;
	Rectangle rect6;
	Rectangle rect7;
	Rectangle rect8;
	Rectangle rect9;
	
	
	public xPanel(){
		this.setSize(300,300);
		this.setVisible(true);
		icon = new ImageIcon("images/O.png"); // thats the images 
		image = icon.getImage();
		icon2 = new ImageIcon("images/X.png");
		image2 = icon2.getImage();
		
		turn=false;
		player=1;
		
		
		rect1 = new Rectangle(50,50,100,100);
		rect2 = new Rectangle(50,150,100,100);
		rect3 = new Rectangle(50,250,100,100);
		rect4 = new Rectangle(150,50,100,100);
		rect5 = new Rectangle(150,150,100,100);
		rect6 = new Rectangle(150,250,100,100);
		rect7 = new Rectangle(250,50,100,100);
		rect8 = new Rectangle(250,150,100,100);
		rect9 = new Rectangle(250,250,100,100);
		
		m11=0; 
		m12=0; //m112=0;
		m13=0;
		m21=0;
		m22=0;
		m23=0;
		m31=0;
		m32=0;
		m33=0;
		
		done11 = false;
		done12= false;
		done13= false;
		done21= false;
		done22= false;
		done23= false;
		done31= false;
		done32= false;
		done33= false;
		
		count11=0;
		count12=0;
		count13=0;
		count21=0;
		count22=0;
		count23=0;
		count31=0;
		count32=0;
		count33=0;
		
		addMouseListener(this);
		
		

	}
	/*
	 * The win method write win on the screen when 3 0s or Xs have been connected, it also draws a line in red
	 * to show where the connection has been made.
	 * It  also checks all the winning positions for a win before declaring a win.
	 */
	public void win(Graphics g){
		if(m11==1&&m12==1&&m13==1){
			g.setColor(Color.red);
			g.fillRect(47+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);
		}
		if(m11==2&&m12==2&&m13==2){
			g.setColor(Color.red);
			g.fillRect(47+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);
		}
		
		if(m21==1&&m22==1&&m23==1){
			g.setColor(Color.red);
			g.fillRect(148+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		
		if(m21==2&&m22==2&&m23==2){
			g.setColor(Color.red);
			g.fillRect(148+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		
		if(m31==1&&m32==1&&m33==1){
			g.setColor(Color.red);
			g.fillRect(247+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m31==2&&m32==2&&m33==2){
			g.setColor(Color.red);
			g.fillRect(247+50, 20+50, 2, 260);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		
		if(m11==1&&m21==1&&m31==1){
			g.setColor(Color.red);
			g.fillRect(20+50, 47+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m11==2&&m21==2&&m31==2){
			g.setColor(Color.red);
			g.fillRect(20+50, 47+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m12==1&&m22==1&&m32==1){
			g.setColor(Color.red);
			g.fillRect(20+50, 148+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m12==2&&m22==2&&m32==2){
			g.setColor(Color.red);
			g.fillRect(20+50, 148+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m13==1&&m23==1&&m33==1){
			g.setColor(Color.red);
			g.fillRect(20+50, 247+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);}
		if(m13==2&&m23==2&&m33==2){
			g.setColor(Color.red);
			g.fillRect(20+50, 247+50, 260, 2);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);
		}
		// the 2 diagonals
		if(m11==1&&m22==1&&m33==1){
			g.setColor(Color.red);
			g.drawLine(30+50, 30+50, 262+50, 262+50);
			g.drawLine(31+50, 31+50, 263+50, 263+50);
			g.drawLine(29+50, 29+50, 261+50, 261+50);
			g.drawLine(32+50, 32+50, 264+50, 264+50);
			g.drawLine(28+50, 28+50, 260+50, 260+50);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);
		}
		if(m11==2&&m22==2&&m33==2){
			g.setColor(Color.red);
			g.drawLine(30+50, 30+50, 262+50, 262+50);
			g.drawLine(31+50, 31+50, 263+50, 263+50);
			g.drawLine(29+50, 29+50, 261+50, 261+50);
			g.drawLine(32+50, 32+50, 264+50, 264+50);
			g.drawLine(28+50, 28+50, 260+50, 260+50);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!!", 130, 35);
		}
		
		if(m13==1&&m22==1&&m31==1){
			g.setColor(Color.red);
			g.drawLine(28+50, 260+50, 260+50, 28+50);
			g.drawLine(29+50, 261+50, 261+50, 29+50);
			g.drawLine(30+50, 262+50, 262+50, 30+50);
			g.drawLine(31+50, 263+50, 263+50, 31+50);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
			g.drawString("YOU WIN!", 130, 35);
		}
		if(m13==2&&m22==2&&m31==2){
			g.setColor(Color.red);
			g.drawLine(28+50, 260+50, 260+50, 28+50);
			g.drawLine(29+50, 261+50, 261+50, 29+50);
			g.drawLine(30+50, 262+50, 262+50, 30+50);
			g.drawLine(31+50, 263+50, 263+50, 31+50);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.setColor(Color.yellow);
		g.drawString("YOU WIN!", 130, 35);
		}
	}
		/*
		 * the paint function draws the background and 4 black lines.
		 * it also paints the images of 0 or X for the squares
		 * 
		 */
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.cyan);
		g.fillRect(50, 50, 300, 300);
		
		win(g);// calling the win method
			if(m11==1&&done11==false){
			
				g.drawImage(image,50,50,this);
				turn11=false;
				done11=true;
				m111=1;
				
				
			}
			if(m11==1&&done11==true){
				
				g.drawImage(image,50,50,this);//pink
				turn11=true;
				done11=true;
				
				
			}
		
		
		
			if(m11==2&&done11==false){
				
				g.drawImage(image2,50,50,this);
				turn11=false;
				done11=true;
				
			}
			if(m11==2&&done11==true){
				
				g.drawImage(image2,50,50,this);//blue
				turn11=true;
				done11=true;
				
			
			}
			
		//m11 m12 m13 - m21 m22 m23 - m31 m32 m33
		if(m12==1){
			g.drawImage(image,50,150,this);
			turn12=false;

		}
		if(m12==2){
			g.drawImage(image2,50,150,this);
			turn12=true;
		}
		if(m13==1){
			g.drawImage(image,50,250,this);
			turn13=false;
		}
		if(m13==2){
			g.drawImage(image2,50,250,this);
			turn13=false;
		}
		if(m21==1){
			g.drawImage(image,150,50,this);
			turn21=false;
		}
		if(m21==2){
			g.drawImage(image2,150,50,this);
			turn21=false;
		}
		
		if(m22==1){
			g.drawImage(image,150,150,this);
			turn22=false;
		}
		if(m22==2){
			g.drawImage(image2,150,150,this);
			turn22=false;
		}
		
		if(m23==1){
			g.drawImage(image,150,250,this);
			turn23=false;
		}
		if(m23==2){
			g.drawImage(image2,150,250,this);
			turn23=false;
		}
		
		if(m31==1){
			g.drawImage(image,250,50,this);
			turn31=false;
		}
		if(m31==2){
			g.drawImage(image2,250,50,this);
			turn31=false;
		}
		
		if(m32==1){
			g.drawImage(image,250,150,this);
			turn32=false;
		}
		if(m32==2){
			g.drawImage(image2,250,150,this);
			turn32=false;
		}
		
		if(m33==1){
			g.drawImage(image,250,250,this);
			turn33=false;
		}
		if(m33==2){
			g.drawImage(image2,250,250,this);
			turn33=false;
		}
		
		g.setColor(Color.black);
		g.fillRect(148, 50, 4, 300);
		g.fillRect(248, 50, 4, 300);
		g.fillRect(50, 148, 300, 4);
		g.fillRect(50, 248, 300, 4);
		win(g);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		player++;
		if(player%2==1){
			turn=true;
		}
		else{
			turn=false;
		}
		if(rect1.x < e.getX()&&rect1.x+rect1.width> e.getX()&&rect1.y < e.getY()&&rect1.y+rect1.height> e.getY()){
			count11++;
			
			if(count11==1){
				
			if(turn==false){
				m11=1;
			}else{
				m11=2;
			}
			
			repaint();
			
			}
			if(count11>1){
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect2.x < e.getX()&&rect2.x+rect2.width> e.getX()&&rect2.y < e.getY()&&rect2.y+rect2.height> e.getY()){
			count12++;
			if(count12==1){
			if(turn==false){
				m12=1;
			}else{
				m12=2;
			}
			repaint();
			}
			if(count12>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect3.x < e.getX()&&rect2.x+rect3.width> e.getX()&&rect3.y < e.getY()&&rect3.y+rect3.height> e.getY()){
			count13++;
			if(count13==1){
			if(turn==false){
				m13=1;
			}else{
				m13=2;
			}
			repaint();
			}
			if(count13>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}

		}
		if(rect4.x < e.getX()&&rect4.x+rect4.width> e.getX()&&rect4.y < e.getY()&&rect4.y+rect4.height> e.getY()){
			count21++;
			if(count21==1){
			if(turn==false){
				m21=1;
			}else{
				m21=2;
			}
			repaint();
			}
			if(count21>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect5.x < e.getX()&&rect5.x+rect5.width> e.getX()&&rect5.y < e.getY()&&rect5.y+rect5.height> e.getY()){
			count22++;
			if(count22==1){
			if(turn==false){
				m22=1;
			}else{
				m22=2;
			}
			repaint();
			}
			if(count22>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect6.x < e.getX()&&rect6.x+rect6.width> e.getX()&&rect6.y < e.getY()&&rect6.y+rect6.height> e.getY()){
			count23++;
			if(count23==1){
			if(turn==false){
				m23=1;
			}else{
				m23=2;
			}
			repaint();
			}
			if(count23>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
			
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect7.x < e.getX()&&rect7.x+rect7.width> e.getX()&&rect7.y < e.getY()&&rect7.y+rect7.height> e.getY()){
			count31++;
			if(count31==1){
			if(turn==false){
				m31=1;
			}else{
				m31=2;
			}
			repaint();
			}
			if(count31>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect8.x < e.getX()&&rect8.x+rect8.width> e.getX()&&rect8.y < e.getY()&&rect8.y+rect8.height> e.getY()){
			count32++;
			if(count32==1){
			if(turn==false){
				m32=1;
			}else{
				m32=2;
			}
			repaint();
			}
			if(count32>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}
		if(rect9.x < e.getX()&&rect9.x+rect9.width> e.getX()&&rect9.y < e.getY()&&rect9.y+rect9.height> e.getY()){
			count33++;
			if(count33==1){
			if(turn==false){
				m33=1;
			}else{
				m33=2;
			}
			repaint();
			}
			if(count33>1){  //this is what keeps the oder of play correct even if player clicks box already marked.
				
				player-=1;
				//count11=count11-1;
			}
		}



	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
