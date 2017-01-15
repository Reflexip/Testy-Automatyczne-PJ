package pl.tau.lab04.model;

import java.util.Random;

public class SimpleUser {
    
    private String name;
    private String login;
    private String password;
    private String email;
    private int id;
    private String gameTitle;
    private String commentText;
    
    public SimpleUser(){
        id = generateID();
        name = "testName";
        login = name + id;
        password = "pass123";
        email = login + "@gmail.com";    
        gameTitle = "Cluedo: Game of Thrones";
        commentText = "Test simple comment text";
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    
    public int generateID(){
        Random value = new Random();
        return value.nextInt(9999);    
    }
}
