package Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        int person = 5;
        System.out.println(paired(person));
    }

    public static int paired(int person) {
        if (person == 1 || person == 2) {
            return person;
        }

        return paired(person - 1) + (person - 1) * paired(person - 2);

    }
}
