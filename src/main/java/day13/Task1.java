package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
//        user1.subscribe(user2);
//        user2.subscribe(user1);
//        System.out.println(user1.isSubscribed(user2));
//        System.out.println(user2.isSubscribed(user1));
//        System.out.println(user1.isFriend(user2));

        user1.sendMessage(user2, "Привет user2");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет user1");
        user2.sendMessage(user1, "Мои дела отлично!!!Спасибо что спросил:)");
        user2.sendMessage(user1, "А как твоя жизнь?");
        user3.sendMessage(user1, "Привет User1");
        user3.sendMessage(user1, "Как твои выходные?");
        user3.sendMessage(user1, "Ты все успел сделать свои дела?");
        user1.sendMessage(user3, "Привет User3");
        user1.sendMessage(user3, "Выходные супер");
        user1.sendMessage(user3, "Да, все дела успел сделать");
        user3.sendMessage(user1, "Понятно,еще увидимся:)");

        MessageDatabase.showDialog(user1, user3);


    }
}
