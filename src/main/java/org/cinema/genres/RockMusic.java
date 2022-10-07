package org.cinema.genres;

import org.cinema.interfaces.Music;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Marry";
    }
}
