package br.com.fiap.pet_techs.pet_techs.controller.exception;

public class ControllerNotFoundException extends RuntimeException{

    public ControllerNotFoundException(String message){
        super(message);
    }
}
