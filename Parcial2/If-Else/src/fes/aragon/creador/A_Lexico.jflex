package fes.aragon.compilador;
import java_cup.runtime.*;
import java.util.LinkedList;

%%
%{
    public static LinkedList<TError> TablaEL = new LinkedList<TError>();
     public Analizador_Lexico(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
      }
%}

%public
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

numero = [0-9]+
letra = [a-zA-Z]
id={letra}({letra}|{numero})*

%%


/*------------  3ra Area: Reglas Lexicas ---------*/


<YYINITIAL> "if"         { System.out.println("Reconocio "+yytext()+" if"); return new Symbol(Simbolos.IF, yycolumn, yyline, yytext()); }
<YYINITIAL> "else"         { System.out.println("Reconocio "+yytext()+" else"); return new Symbol(Simbolos.ELSE, yycolumn, yyline, yytext()); }
<YYINITIAL> "<"         { System.out.println("Reconocio "+yytext()+" menorA"); return new Symbol(Simbolos.menorA, yycolumn, yyline, yytext()); }
<YYINITIAL> ">"         { System.out.println("Reconocio "+yytext()+" mayorA"); return new Symbol(Simbolos.mayorA, yycolumn, yyline, yytext()); }
<YYINITIAL> "<="         { System.out.println("Reconocio "+yytext()+" menorIgual"); return new Symbol(Simbolos.menorIgual, yycolumn, yyline, yytext()); }
<YYINITIAL> ">="         { System.out.println("Reconocio "+yytext()+" mayorIgual"); return new Symbol(Simbolos.mayorIgual, yycolumn, yyline, yytext()); }
<YYINITIAL> "=="         { System.out.println("Reconocio "+yytext()+" igualA"); return new Symbol(Simbolos.igualA, yycolumn, yyline, yytext()); }
<YYINITIAL> ";"         { System.out.println("Reconocio "+yytext()+" semi"); return new Symbol(Simbolos.semi, yycolumn, yyline, yytext()); }
<YYINITIAL> "("         { System.out.println("Reconocio "+yytext()+" parA"); return new Symbol(Simbolos.parA, yycolumn, yyline, yytext()); }
<YYINITIAL> ")"         { System.out.println("Reconocio "+yytext()+" parC"); return new Symbol(Simbolos.parC, yycolumn, yyline, yytext()); }
<YYINITIAL> "{"         { System.out.println("Reconocio "+yytext()+" llaveA"); return new Symbol(Simbolos.llaveA, yycolumn, yyline, yytext()); }
<YYINITIAL> "}"         { System.out.println("Reconocio "+yytext()+" llaveC"); return new Symbol(Simbolos.llaveC, yycolumn, yyline, yytext()); }
<YYINITIAL> ":="         { System.out.println("Reconocio "+yytext()+" asig"); return new Symbol(Simbolos.asig, yycolumn, yyline, yytext()); }

<YYINITIAL> {numero}    { System.out.println("Reconocio "+yytext()+" num"); return new Symbol(Simbolos.num, yycolumn, yyline, yytext()); }
<YYINITIAL> {id}    { System.out.println("Reconocio "+yytext()+" id"); return new Symbol(Simbolos.id, yycolumn, yyline, yytext()); }

[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

.                       { System.out.println("Error Lexico"+yytext()+" Linea "+yyline+" Columna "+yycolumn);
                          TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                          TablaEL.add(datos);}

