package com.zdran.btmovie.provider.domain;

public class MovieInfo {
    private String movieId;

    private String movieName;

    private String movieBt;

    private String moviePoster;

    private String movieDetail;

    private String movieScore;

    private String movieType;

    private String movieStarring;

    private String movieArea;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMovieBt() {
        return movieBt;
    }

    public void setMovieBt(String movieBt) {
        this.movieBt = movieBt == null ? null : movieBt.trim();
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster == null ? null : moviePoster.trim();
    }

    public String getMovieDetail() {
        return movieDetail;
    }

    public void setMovieDetail(String movieDetail) {
        this.movieDetail = movieDetail == null ? null : movieDetail.trim();
    }

    public String getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(String movieScore) {
        this.movieScore = movieScore == null ? null : movieScore.trim();
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType == null ? null : movieType.trim();
    }

    public String getMovieStarring() {
        return movieStarring;
    }

    public void setMovieStarring(String movieStarring) {
        this.movieStarring = movieStarring == null ? null : movieStarring.trim();
    }

    public String getMovieArea() {
        return movieArea;
    }

    public void setMovieArea(String movieArea) {
        this.movieArea = movieArea == null ? null : movieArea.trim();
    }
}