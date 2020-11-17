package ge.edu.btu.chat.shared;

import java.io.Serializable;

public class Text implements Serializable {
    private String text;

    public Text() {

    }

    public Text(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setQuestion(String text) {
        this.text = text;
    }
}
