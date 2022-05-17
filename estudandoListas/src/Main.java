import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");
        list.remove("Ana");


        //remover por predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("Indice de Bob:" + list.indexOf("Bob"));

        for(String x : list){
            System.out.println(x);
        }

        System.out.println(list.size());

        //Filtrar a lista para ficar só os elementos que começam com A
        List<String>result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        //encontrar o elemento da lista que atenda ao predicado
        System.out.println("-------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
