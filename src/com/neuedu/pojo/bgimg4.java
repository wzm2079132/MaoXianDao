package com.neuedu.pojo;

import com.neuedu.utils.GameUtil;

import java.awt.*;

public class bgimg4 {
    private Image image;
    private int x;
    private int y;
    private int height;


    public bgimg4(){
        this.image= GameUtil.getImg("com/neuedu/img/bg13.png");
        this.x=1085;
        this.height=image.getHeight(null);
        this.y=282;

    }

    public void draw(Graphics g){
        g.drawImage(this.image,x,y,null);
    }
}
