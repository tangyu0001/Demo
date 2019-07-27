package com.ty.singleton;

import java.io.*;

public class SeriableSingletonTest {



    public static void main(String[] args) {
        EnumSingleton e1 = null;
        EnumSingleton e2 = EnumSingleton.getInstance();
        e2.setData(new Object());
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e1.getData() == e2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        HungrySingleton h1 = null;
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h2);
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("HungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            h1 = (HungrySingleton) ois.readObject();
            ois.close();
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h1 == h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
