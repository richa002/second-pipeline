import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection c=null;


        List<String> list=new ArrayList<String>();

        list.add("richa");
        //  list.add(null);
        list.add("seema");
        // list.add(null);

        list.add("kavita");
        list.add("richa");
        Iterator<String> it =list.iterator();
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("seema")) {
                //  list.remove("seema");// with this line it will give concurrent modification error
                it.remove();
            }
        }
        System.out.println("showing iterator remove method : iterator is not failing with its own remove method: "+list);
        System.out.println(list);
        // System.out.println("whether two lists are equal or not"+list.equals(Arrays.asList("seema","richa","kavita","richa")));
        //System.out.println("whether two lists are equal or not"+list.equals(Arrays.asList("richa","seema","kavita","richa")));
        // System.out.println("whether list1 contains list 2"+list.containsAll(Arrays.asList("kavita","seema")));

        System.out.println(list);
        list.add(1,"priyanka");
        System.out.println("list after adding priyanka at 1 index"+list);
        List<String> l= Arrays.asList("name1","name2");
        list.addAll(2,l);
        System.out.println("list after another list at index 2"+list);
        // System.out.println(list.remove("name1"));
        //  ((ArrayList<String>)list).get(0);
        System.out.println("removed all richa from list");
        list.removeAll(Arrays.asList("richa"));
        System.out.println(list);

      //  list.replaceAll(p->p.substring(0,1
       // ));
        System.out.println(list);
        System.out.println("getting index 1 element:"+list.get(1));
        System.out.println(list.containsAll(Arrays.asList("priyanka","kavita" +
                "")));


       // System.out.println(list.stream().filter(p->p.equals("p")).findFirst().get());
    }

}
