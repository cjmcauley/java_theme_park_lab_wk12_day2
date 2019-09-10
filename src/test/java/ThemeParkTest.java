import attractions.Dodgems;
import attractions.Playground;
import behaviours.IReviewed;
import org.junit.Before;
import stalls.CandyflossStall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static stalls.ParkingSpot.A1;
import static stalls.ParkingSpot.A2;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Playground playground;
    CandyflossStall candyflossStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumber Cars", 4);
        playground = new Playground("Fun Park", 3);
        candyflossStall = new CandyflossStall("Candy Floss", "Raymond", A1, 5);
        tobaccoStall = new TobaccoStall("Cigs", "Tony", A2, 2);
    }

}
