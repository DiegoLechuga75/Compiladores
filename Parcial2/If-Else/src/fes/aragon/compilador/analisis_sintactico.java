
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package fes.aragon.compilador;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class analisis_sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public analisis_sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public analisis_sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public analisis_sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\007\000\002\003\013\000\002\004\005" +
    "\000\002\004\004\000\002\004\007\000\002\004\006\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\004\004\006\001\002\000\006\002\uffff\004" +
    "\uffff\001\002\000\006\002\053\004\006\001\002\000\010" +
    "\015\012\021\011\022\007\001\002\000\022\006\ufff2\007" +
    "\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\016\ufff2\017\ufff2" +
    "\001\002\000\016\006\021\007\017\010\014\011\015\012" +
    "\016\017\027\001\002\000\022\006\ufff1\007\ufff1\010\ufff1" +
    "\011\ufff1\012\ufff1\013\ufff1\016\ufff1\017\ufff1\001\002\000" +
    "\010\015\012\021\011\022\007\001\002\000\016\006\021" +
    "\007\017\010\014\011\015\012\016\016\020\001\002\000" +
    "\010\015\012\021\011\022\007\001\002\000\010\015\012" +
    "\021\011\022\007\001\002\000\010\015\012\021\011\022" +
    "\007\001\002\000\010\015\012\021\011\022\007\001\002" +
    "\000\022\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013" +
    "\ufff3\016\ufff3\017\ufff3\001\002\000\010\015\012\021\011" +
    "\022\007\001\002\000\022\006\ufff8\007\ufff8\010\014\011" +
    "\015\012\016\013\ufff8\016\ufff8\017\ufff8\001\002\000\022" +
    "\006\ufff7\007\ufff7\010\014\011\015\012\016\013\ufff7\016" +
    "\ufff7\017\ufff7\001\002\000\022\006\ufff4\007\ufff4\010\ufff4" +
    "\011\ufff4\012\ufff4\013\ufff4\016\ufff4\017\ufff4\001\002\000" +
    "\022\006\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5" +
    "\016\ufff5\017\ufff5\001\002\000\022\006\ufff6\007\ufff6\010" +
    "\ufff6\011\ufff6\012\ufff6\013\ufff6\016\ufff6\017\ufff6\001\002" +
    "\000\010\015\012\021\032\022\007\001\002\000\012\015" +
    "\012\020\037\021\041\022\007\001\002\000\016\006\021" +
    "\007\017\010\014\011\015\012\016\013\036\001\002\000" +
    "\020\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1" +
    "\014\033\001\002\000\004\022\034\001\002\000\004\013" +
    "\035\001\002\000\012\015\ufff9\020\ufff9\021\ufff9\022\ufff9" +
    "\001\002\000\012\015\ufffb\020\ufffb\021\ufffb\022\ufffb\001" +
    "\002\000\010\002\ufffe\004\ufffe\005\046\001\002\000\016" +
    "\006\021\007\017\010\014\011\015\012\016\013\045\001" +
    "\002\000\020\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1" +
    "\013\ufff1\014\042\001\002\000\004\022\043\001\002\000" +
    "\004\013\044\001\002\000\012\015\ufffa\020\ufffa\021\ufffa" +
    "\022\ufffa\001\002\000\012\015\ufffc\020\ufffc\021\ufffc\022" +
    "\ufffc\001\002\000\004\017\047\001\002\000\010\015\012" +
    "\021\032\022\007\001\002\000\012\015\012\020\051\021" +
    "\041\022\007\001\002\000\006\002\ufffd\004\ufffd\001\002" +
    "\000\006\002\001\004\001\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\004\003\051\001\001\000\004\005\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\012\001\001\000\002\001\001\000\004\005\025" +
    "\001\001\000\004\005\024\001\001\000\004\005\023\001" +
    "\001\000\004\005\022\001\001\000\002\001\001\000\004" +
    "\005\021\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\004\027\005\030\001\001\000\004\005\037\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\047\005\030\001\001\000\004" +
    "\005\037\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$analisis_sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$analisis_sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$analisis_sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado="";
    public String variable="";
    public static LinkedList<TError> TablaES = new LinkedList<TError>();
    public ArrayList<String> datos=new ArrayList<>();
    public HashMap<String, String> variables = new HashMap<String, String>();

    public void imprimir(String e){
        System.out.println("Valor= "+e);
    }

    public void imprimirVariable(String e, String a){
        System.out.println("ID: " + e + " - Valor: " + a);
    }
    public void syntax_error(Symbol s)
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!Error Sintactico Recuperado!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

        TError datos = new TError(lexema,fila,columna,"Error Sintactico","Caracter no esperado");
        TablaES.add(datos);
       
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!Error Sintactico");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

         TError datos = new TError(lexema,fila,columna,"Error Sintactico","Caracter no esperado");
        TablaES.add(datos);
     
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$analisis_sintactico$actions {


        public void imprimirInterno(String e){
            System.out.println("Valor_i= "+e);
        }

        public void imprimirVariableInterno(String e, String a){
                System.out.println("ID: " + e + " - Valor: " + a);
            }


  private final analisis_sintactico parser;

  /** Constructor */
  CUP$analisis_sintactico$actions(analisis_sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action_part00000000(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$analisis_sintactico$result;

      /* select the action based on the action number */
      switch (CUP$analisis_sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= INICIO SENTENCIAIFELSE 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		RESULT = start_val;
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$analisis_sintactico$parser.done_parsing();
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= SENTENCIAIFELSE 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIAIFELSE ::= IF E llaveA EXPRESION llaveC 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).value;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIAIFELSE",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIAIFELSE ::= IF E llaveA EXPRESION llaveC ELSE llaveA EXPRESION llaveC 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-7)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-7)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-7)).value;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIAIFELSE",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-8)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXPRESION ::= EXPRESION E semi 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		
                resultado=a;
                imprimir(a);
                imprimirInterno(a);
                datos.add(a);
            
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXPRESION ::= E semi 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		
                resultado=a;
                imprimir(a);
                imprimirInterno(a);
                datos.add(a);
             
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXPRESION ::= EXPRESION id asig num semi 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).right;
		String a = (String) ((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String b = (String) ((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		
                variable=a;
                imprimirVariable(a,b);
                imprimirVariableInterno(a,b);
                variables.put(a,b);
            
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXPRESION ::= id asig num semi 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		
                variable=a;
                imprimirVariable(a,b);
                imprimirVariableInterno(a,b);
                variables.put(a,b);
            
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E ::= E menorA E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    boolean r = val1<val2;
                    RESULT = Boolean.toString(r); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E ::= E mayorA E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                      int val2= Integer.parseInt(b);
                    boolean r = val1>val2;
                    RESULT = Boolean.toString(r); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E ::= E menorIgual E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    boolean r = val1<=val2;
                    RESULT = Boolean.toString(r); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E ::= E mayorIgual E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    boolean r = val1>=val2;
                    RESULT = Boolean.toString(r); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E ::= E igualA E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                        int val2= Integer.parseInt(b);
                        boolean r = val1==val2;
                        RESULT = Boolean.toString(r); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E ::= parA E parC 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E ::= num 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String) ((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // E ::= id 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String) ((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
            variable=a;
            imprimirVariable(a,"null");
            imprimirVariableInterno(a,"null");
            variables.put(a,"null");
            RESULT = variables.get(a); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$analisis_sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
              return CUP$analisis_sintactico$do_action_part00000000(
                               CUP$analisis_sintactico$act_num,
                               CUP$analisis_sintactico$parser,
                               CUP$analisis_sintactico$stack,
                               CUP$analisis_sintactico$top);
    }
}

}
