package ru.netology.Poster;

public class PosterManager {
    int limit = 10;
    private Poster[] films = new Poster[0];

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void save(Poster film) {
        int length = films.length+1;
        Poster[] tmp = new Poster[length];
        //System.arraycopy(films, 0, tmp, 0, films.length);
        for (int i = 0; i < films.length; i++){
            tmp[i] = films[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;
    }
    public void add(Poster film) { save (film); }

    public Poster[] findAll() { return films; }

    public Poster[] findLast() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }



}
