package Lesson48;

public enum Animal {
    DOG("cобака"),CAT("кошка"),FROG("лягушка");

    private String translation;



     Animal(String translation){
         this.translation=translation;

    }

    public String getTranslation(){
         return translation;
    }
    public String toString(){
         return "Перевод на русский язык- "+translation;
    }
}
