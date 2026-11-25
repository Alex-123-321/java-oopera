public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 170.0);
        Actor actor2 = new Actor("Тимур", "Петров", Gender.MALE, 173.0);
        Actor actor3 = new Actor("Ирина", "Зимова", Gender.FEMALE, 168.0);

        Director director1 = new Director("Полина", "Глазова", Gender.FEMALE, 12);
        Director director2 = new Director("Дмитрий", "Кириешкин", Gender.MALE, 7);

        Person musicAuthor = new Person("Василий", "Дроздов", Gender.MALE);

        Person choreographer = new Person("Наталья", "Морская", Gender.FEMALE);

        Show regularShow = new Show("Грустный хомяк", 120, director1);
        Opera opera = new Opera("Булка", 175, director2, musicAuthor, "Текст либретто оперы...", 40);
        Ballet ballet = new Ballet("Маяк", 130, director1, musicAuthor, "Текст либретто балета...", choreographer);

        regularShow.addActor(actor1);
        regularShow.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актёры спектакля «Грустный хомяк»");
        regularShow.printActors();
        System.out.println("Актёры оперы «Булка»");
        opera.printActors();
        System.out.println("Актёры балета «Маяк»");
        ballet.printActors();

        regularShow.replaceActor(actor2, "Иванов");//Замена актёра
        System.out.println("Актёры спектакля «Грустный хомяк» после замены:");
        regularShow.printActors();

        opera.replaceActor(actor1, "Кукушкин");//Попытка замены актёра

        System.out.println("Либретто");
        opera.printLibretto();
        ballet.printLibretto();
    }
}
