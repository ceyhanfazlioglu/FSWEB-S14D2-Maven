package org.example;

import org.example.enums.LampType;
import org.example.enums.PaintColor;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Double", 2, 60, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 4);
        Wardrobe wardrobe = new Wardrobe(150, 200, 80.5);
        Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom("My Bedroom", northWall, southWall, eastWall, westWall,
                ceiling, bed, lamp, wardrobe, carpet);

        // Kompozisyon sayesinde iç objelerin metotlarını tetikliyoruz
        System.out.println("Bedroom Name: " + bedroom.getName());
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}