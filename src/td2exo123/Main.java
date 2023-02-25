package td2exo123;

class A {
    protected int a = 5; 
    public A(int a) { this.a = a;}
    public void afficherClasse() {System.out.println("Classe A");}
    public void afficherVariables() {System.out.println("a = " + a);}
    }
    class B extends A { 
    protected int b = 6; 
    public B(int b){super(2 * b);a = b;}
    public void afficherClasse() { super.afficherClasse(); 
     System.out.println("Classe B");} 
    public void afficherVariables() { super.afficherVariables(); 
     System.out.println("b = " + b);}
    }
    class C extends B { 
    protected int b = 7; protected int c = 8; 
    public C(int c) { super(3 * c);b = c;}
    public void afficherClasse() { super.afficherClasse(); 
     System.out.println("Classe C");}
    public void afficherVariables() { super.afficherVariables(); 
     System.out.println("c = " + c);}
    }
    class Alphabet {
    public static void main(String args[]) {
    A[] as = new A[3];
    as[0] = new A(1);
    as[1] = new B(2);
    as[2] = new C(3); 
    for (int i = 0; i < as.length; i++) {
     as[i].afficherClasse();
     System.out.println("-----");
     }
    for (int i = 0; i < as.length; i++) {
     as[i].afficherVariables();
     System.out.println("-----");}
     }}
