package com.endlessway.designprinciples7;

/**
 * 开闭原则
 */
public class OCPDemo {
    public static void main(String[] args) {
        AbstractSubject subject1 = new Subject1();
        subject1.display("背景1","颜色1");
    }
}

/**
 * Windows桌面主题
 */
abstract class AbstractSubject {
    abstract void display(String backgroundPicture,String backgroundColor);
}

class Subject1 extends AbstractSubject{
    @Override
    void display(String backgroundPicture, String backgroundColor) {
        System.out.println("桌面背景图片："+backgroundPicture);
        System.out.println("桌面背景颜色："+backgroundColor);
    }
}
class Subject2 extends AbstractSubject{
    @Override
    void display(String backgroundPicture, String backgroundColor) {
        System.out.println("桌面背景图片："+backgroundPicture);
        System.out.println("桌面背景颜色："+backgroundColor);
    }
}
