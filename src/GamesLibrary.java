class GamesLibrary {
    public static void main(String[] args) {
        Games game1 = new Games();
        game1.title = "Spider-man";
        game1.typeConsole = "PS4";
        game1.maxPlayer = 1;
        game1.minAge = 16;

        Games game2 = new Games();
        game2.title = "Minecraft";
        game2.typeConsole = "Xbox 360";
        game2.maxPlayer = 4;
        game2.minAge = 7;

        Games game3 = new Games();
        game3.title = "Knack II";
        game3.typeConsole = "PS4";
        game3.maxPlayer = 2;
        game3.minAge = 7;

        System.out.println("W mojej bibliotece gier mam już");
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek: %d lat\n"
                , game1.title, game1.typeConsole, game1.maxPlayer, game1.minAge);
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek:  %d lat\n"
                , game2.title, game2.typeConsole, game2.maxPlayer, game2.minAge);
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek:  %d lat\n"
                , game3.title, game3.typeConsole, game3.maxPlayer, game3.minAge);
    }

}
