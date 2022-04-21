package com.netcracker.chapter3.person;

public class Person {
    private String name;
    private String namesOfFriends = "";


    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getCountFriend(){
    int count = 0;
    char[] names = namesOfFriends.toCharArray();
        for (int i = 0; i < names.length; i++) {
            if(names[i] == ' ') count++;
        }


        return count + 1;
    }

    public void befrined(Person person){
        namesOfFriends += person.getName() + " ";
    }

    public void unfriend(Person person){
        namesOfFriends = namesOfFriends.replaceFirst(person.getName() + " ", "");
    }

    public String getFieldNames(){
        return namesOfFriends;
    }

}
