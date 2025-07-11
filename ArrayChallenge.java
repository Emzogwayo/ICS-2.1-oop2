

public class ArrayChallenge{
    public static void main(String[] args) {
        String[] orderId = {"E485","G000","E345","G786","F965","F126","E686","G709","F888","H089","E555"};

        for (String item : orderId){
            if (item.startsWith("E")){
                System.out.println(item);
            }
        }
    }
}