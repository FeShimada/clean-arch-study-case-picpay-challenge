package br.com.project.core.exception;

public class InternalServerErrorException extends Exception{

    private String code;

    public InternalServerErrorException(String message, String code) {
        super(message);
        this.code = code;
    }
}
