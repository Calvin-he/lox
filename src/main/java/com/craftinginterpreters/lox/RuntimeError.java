package com.craftinginterpreters.lox;

class RuntimeError extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = -874367121191485468L;
    final Token token;

  RuntimeError(Token token, String message) {
    super(message);                          
    this.token = token;                      
  }                                          
}     