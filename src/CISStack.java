import java.util.LinkedList;

public class CISStack {

    LinkedList<Integer> list;
    int size;
    public CISStack(){
        list = new LinkedList<Integer>();
        size = 0;
    }

    public void push(int value){
        list.addLast(value);
        size++;
    }
    public Integer pop(){
        Integer result = list.getLast();
        list.removeLast();
        size--;
        return result;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public int size (){
        return size;
    }

    public String toString(){
        if (isEmpty()){
            return "CISStack{stack=[], size=0}";
        }
        else {
            String result = "CISStack{stack=[";
            for (var value : list){
                result += "" + value + ", ";
            }
            result = result.substring(0,result.length()-2);
            result += "], size=" + size + "}";
            return result;
        }
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}

}
