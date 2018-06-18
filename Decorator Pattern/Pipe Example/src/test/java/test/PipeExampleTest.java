package test;

import component.Pipe;
import component.SteamPipe;
import component.WaterPipe;
import decorator.NanotubesReinforcementDecorator;
import decorator.RubberSealPipeDecorator;
import decorator.SteelReinforcementDecorator;
import org.junit.Test;

public class PipeExampleTest {

    @Test
    public void testWaterPipe() {

        Pipe waterPipe = new WaterPipe(); // 100

        System.out.println("Current max pressure is: " + waterPipe.getMaxPressure() + " units!");

        waterPipe = new NanotubesReinforcementDecorator(waterPipe); // + 70
        waterPipe = new RubberSealPipeDecorator(waterPipe); // + 30

        System.out.println("Current max pressure is: " + waterPipe.getMaxPressure() + " units!");
    }

    @Test
    public void testSteamPipe() {

        Pipe steamPipe = new SteamPipe();

        System.out.println("Current max pressure is: " + steamPipe.getMaxPressure() + " units!"); // 150

        steamPipe = new SteelReinforcementDecorator(steamPipe); // +45
        steamPipe = new RubberSealPipeDecorator(steamPipe); // +30

        System.out.println("Current max pressure is: " + steamPipe.getMaxPressure() + " units!");
    }

}
