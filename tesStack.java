package tugas_strukdat;
public class tesStack {
    private String data[];
    private int Size;
    private int Top;

    
    public static void main(String[] args) {
        tesStack s = new tesStack(10);
        s.push("Buku");
        s.push("Pena");
        s.push("penggaris");
        s.pop();
        s.pop();
        System.out.println("");
        s.infoStack();
    }

    public tesStack (int kapasitas){
        Size = kapasitas;
        Top = -1;
        data = new String [Size];


    }

    public boolean isEmpty(){
        return Top==-1;

    }
    public boolean isFull(){
        return Top == Size-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("Ransel telah penuh");
        } else {
            data[++Top]= input;
            System.out.println(input+ " Dimasukkan ke dalam Ransel ");


        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println(" Ransel kosong");
        } else {

            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println(temp+ " DIkeluarkan dari dalam Ransel");

        }
    }

    public void infoStack(){
        System.out.println(" Barang yang tersisa dalam ransel: ");
        for(int i =0; i<=Top;i++){

            System.out.println("*" +data[i]);
        }






    }
    
}


    

