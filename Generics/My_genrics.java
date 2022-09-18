package Generics;
/*
* In this class in will accept any type ob object and this class can return any type of object*/

public class My_genrics <T>{
    T data;
    My_genrics(T t){
        this.data =t;
    }
    T get() {
        return  this.data;
    }
}
