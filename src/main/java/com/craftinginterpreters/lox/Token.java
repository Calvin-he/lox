package com.craftinginterpreters.lox;

enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // One or two character tokens.
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,

    // Keywords.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR, PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}

class Token {                                                     
  final TokenType type;                                           
  final String lexeme;                                            
  final Object literal;                                           
  final int line;

  Token(TokenType type, String lexeme, Object literal, int line) {
    this.type = type;                                             
    this.lexeme = lexeme;                                         
    this.literal = literal;                                       
    this.line = line;                                             
  }                                                               

  public String toString() {                                      
    return type + " " + lexeme + " " + literal;                   
  }                                                               
}