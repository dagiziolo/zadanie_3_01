class GamesLibrary {
    public static void main(String[] args) {
        Games game1 = new Games("Spider-man","PS4", 1, 16);
        Games game2 = new Games("Minecraft","Xbox 360", 4,7);
        Games game3 = new Games("Knack II","PS4",2,7);

        System.out.println("W mojej bibliotece gier mam już");
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek: %d lat\n"
                , game1.title, game1.typeConsole, game1.maxPlayer, game1.minAge);
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek:  %d lat\n"
                , game2.title, game2.typeConsole, game2.maxPlayer, game2.minAge);
        System.out.printf("\"%s\" na konsolę %s, max graczy: %d, min wiek:  %d lat\n"
                , game3.title, game3.typeConsole, game3.maxPlayer, game3.minAge);
    }

}
