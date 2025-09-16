package com.tallerantlr.simple.interprete.ast;

import java.util.Map;

public class Sumaplicacion implements ASTNode {
    private final ASTNode left;
    private final ASTNode right;

    public Sumaplicacion(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object aObj = left.execute(symbolTable);
        Object bObj = right.execute(symbolTable);

        // Asumimos enteros, igual que Addition/Multiplication.
        // (Si quieres mensajes de error más claros, puedes chequear tipos aquí.)
        int a = (int) aObj;
        int b = (int) bObj;

        // a @ b = a + b + (a * b)
        return a + b + (a * b);
    }
}