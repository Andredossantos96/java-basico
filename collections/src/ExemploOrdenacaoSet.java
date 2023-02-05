import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        
        System.out.println("--Ordem aleatória--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Supernatural", "terror", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Bleach", "anime", 25));
            
        }};
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() +  " - " + 
            serie.getTempoEpisodio());
        }


        System.out.println("--Ordem inserção--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("supernatural", "terror", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Bleach", "anime", 25));
            
        }};
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() +  " - " + 
            serie.getTempoEpisodio());
        }


        System.out.println("--Ordem natural (TempoEpisodio)--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() +  " - " + 
            serie.getTempoEpisodio());
        }

        System.out.println("--Ordem Nome/Gênero/TempoEpisodio--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() +  " - " + 
            serie.getTempoEpisodio());
        }

    }
}




