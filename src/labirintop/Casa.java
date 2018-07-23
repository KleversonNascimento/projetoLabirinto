package labirintop;

public class Casa {

    static final public char CAMINHO = 'o';
    static final public char MURO = '-';
    static final public char INICIO = 'P';
    static final public char FIM = 'C';
    private int x;
    private int y;
    private char tipo;

    public Casa(int x, int y, char tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
