package org.cinema.genres;

import org.cinema.interfaces.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Pop song";
    }
}
