package com.alevel.adv.lesson2;
//Создать класс, который будет выводить на экран меньшее по модулю из трёх хранящихся в классе вещественных чисел.
//Для вычисления модуля используйте тернарную операцию.
public class Lesson2Dz2 {
    public static void main(String[] args) {
        double first=1.2d, second=-4.5d, third=2.3d;
        double absFirst=first>0?first:-first, absSecond=second>0?second:-second, absThird=third>0?third:-third;
        if (absFirst<absSecond && absFirst<absThird){
            System.out.println(absFirst);
        } else if (absSecond<absFirst && absSecond<absThird){
            System.out.println(absSecond);
        } else if (absThird<absFirst && absThird<absSecond){
            System.out.println(absThird);
        }

    }
}
