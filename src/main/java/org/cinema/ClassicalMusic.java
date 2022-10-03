package org.cinema;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void onInit() {
        System.out.println("Do my init!");
    }

    public void onDestroy() {
        System.out.println("Do my destroy!");
    }

    @Override
    public String getSong() {
        return "Angels of Sorrow";
    }
}
