public class PilhaEncadeada<T> {
    private No<T> topo;
    private int size;


    public PilhaEncadeada(){
        this.topo = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.topo == null;
    }

    public boolean push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setProximo(this.topo);
        this.topo = novoNo;
        this.size++;
        return true;
    }

}