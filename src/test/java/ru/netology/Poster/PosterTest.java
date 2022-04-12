package ru.netology.Poster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
    PosterManager manager = new PosterManager();

    @Test
    public void addNewFilm() {
        PosterManager manager = new PosterManager();
        Poster first = new Poster(1, "Bloodshot", "action");
        Poster second = new Poster(2, "Forward", "cartoon");
        Poster third = new Poster(3, "Hotel Belgrade", "comedy");
        Poster fourth = new Poster(4, "Gentlemen", "action");
        Poster fifth = new Poster(5, "Invisible Man", "horror");
        Poster sixth = new Poster(6, "Trolls", "cartoon");
//

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.add(sixth);

        Poster[] expected = new Poster[]{first, second, third, fourth, fifth, sixth};
        Poster[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindTwoLastFilms() {
        PosterManager manager = new PosterManager(4);
        Poster first = new Poster(1, "Bloodshot", "action");
        Poster second = new Poster(2, "Forward", "cartoon");
        Poster third = new Poster(3, "Hotel Belgrade", "comedy");
        Poster fourth = new Poster(4, "Gentlemen", "action");
        Poster fifth = new Poster(5, "Invisible Man", "horror");
        Poster sixth = new Poster(6, "Trolls", "cartoon");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);

        Poster[] expected = new Poster[]{sixth, fifth, fourth, third};
        Poster[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindAllFilms() {
        PosterManager manager = new PosterManager();
        Poster first = new Poster(1, "Bloodshot", "action");
        Poster second = new Poster(2, "Forward", "cartoon");
        Poster third = new Poster(3, "Hotel Belgrade", "comedy");
        Poster fourth = new Poster(4, "Gentlemen", "action");
        Poster fifth = new Poster(5, "Invisible Man", "horror");
        Poster sixth = new Poster(6, "Trolls", "cartoon");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);

        Poster[] expected = new Poster[]{first, second, third, fourth, fifth, sixth};
        Poster[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

}
