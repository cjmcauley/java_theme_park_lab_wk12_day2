import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

private ArrayList<IReviewed> reviews;
private String name;

    public ThemePark(String name, ArrayList reviews){
        this.name = name;
        this.reviews = reviews;
    }

    public ArrayList getAllReviewed(){
        return this.reviews;
    }

}
