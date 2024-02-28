//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double movieGradeAverage = (9.8 + 6.3 + 8.0) /3;
        int releaseYear = 2022;
        int classification = (int) (movieGradeAverage /2);
        boolean includedInPlan = false;
        String synopsis = "Filme de Aventura";
        String film;

        System.out.println(
                """
                        ╭━━━╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╮╭━╮╱╱╭╮╱╱╱╭╮
                        ┃╭━╮┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃╰╯┃┃╱╭╯╰╮╱╱┃┃
                        ┃╰━━┳━━┳━┳━━┳━━┳━╮╱┃╭╮╭╮┣━┻╮╭╋━━┫╰━╮
                        ╰━━╮┃╭━┫╭┫┃━┫┃━┫╭╮╮┃┃┃┃┃┃╭╮┃┃┃╭━┫╭╮┃
                        ┃╰━╯┃╰━┫┃┃┃━┫┃━┫┃┃┃┃┃┃┃┃┃╭╮┃╰┫╰━┫┃┃┃
                        ╰━━━┻━━┻╯╰━━┻━━┻╯╰╯╰╯╰╯╰┻╯╰┻━┻━━┻╯╰╯
                        """);

        film = """
                Top Gun: Maverick
                Ano de Lançamento: %d
                Nota: %f
                Sinopse: %s
                Classificação: %d
                """
                .formatted(releaseYear, movieGradeAverage,
                        synopsis, classification);

        System.out.println(film);
    }
}