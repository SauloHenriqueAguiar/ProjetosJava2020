
package com.mycompany.interfacespraticas;

public class Players implements Comparable<Players>{
    private int id;
    private String username;
    private float points;

    public Players(int id, String username, float points) {
        this.id = id;
        this.username = username;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Players{" + "id=" + id + ", username=" + username + ", points=" + points + '}';
    }

    
    @Override
    public int compareTo(Players other ) {
        if(this.points > other.points){
            return -1;
        }
        else if(this.points < other.points){
            return 1;
        }
        else{
                return this.username.compareTo(other.username);//se o numero de pontos for igual usa como critério de desempate ordem alfabética.
                }
        }

    
    
}
   
    
    
    
    


