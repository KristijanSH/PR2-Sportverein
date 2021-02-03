package a01563679;

import java.math.BigDecimal;
import java.util.*;

public class MainB {

    public static void main(String[] args) {
        // Entkommentieren Sie die Zeilen in den jeweiligen Methoden, um Ihre Lösung zu Überprüfen!

        System.out.println("Works");

        task1();

        //task2();

        //task3();

        //task4();
    }


    // TASK 1 BEGIN
    private static void task1() {
        
        System.out.println("\n★ TASK 1");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member anna = new Member("Anna", Map.of(Sports.CLIMBING, Level.ADVANCED, Sports.GOLF, Level.BEGINNER));
        System.out.println(anna);
        Member peter = new Member("Peter", Map.of(Sports.ARCHERY, Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));
        System.out.println(peter);
        Member paul = new Trainer("Paul", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.GOLF, Level.BEGINNER, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        System.out.println(paul);
         

        /*
         * Expected Output (Reihenfolge der Elemente in sports/accreditations kann variieren)
         * name: Anna, sports: {GOLF_/=Anfänger, CLIMBING=Fortgeschritten}
         * name: Peter, sports: {archery=Anfänger, BASKETBALL=Profi}
         * name: Paul, sports: {GOLF_/=Anfänger, football=Normal, HANDBALL=Profi, DIVING=Profi}, accreditations: {golf_/=Anfänger, FOOTBALL=Normal, HANDBALL=Profi, diving=Profi}
         */
    }


    // TASK 2 BEGIN
    private static void task2() {
        /*
        System.out.println("\n★ TASK 2");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member anna = new Member("Anna", Map.of(Sports.CLIMBING, Level.ADVANCED));
        System.out.printf("%.2f EUR%n", anna.calculateAthleticWorth());
        Member peter = new Member("Peter", Map.of(Sports.ARCHERY, Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));
        System.out.printf("%.2f EUR%n", peter.calculateAthleticWorth());
        Member paulm = new Member("PaulMember", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        System.out.printf("%.2f EUR%n", paulm.calculateAthleticWorth());
        Member pault = new Trainer("PaulTrainer", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        System.out.printf("%.2f EUR%n", pault.calculateAthleticWorth());
         */

        /*
         * Expected Output
         * 1200.00 EUR
         * 2000.00 EUR
         * 3800.00 EUR
         * 4100.00 EUR
         */
    }


    // TASK 3 BEGIN
    private static void task3() {
        /*
        System.out.println("\n★ TASK 3");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member paul = new Trainer("Paul", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        Member lara = new Trainer("Lara", Map.of(Sports.HOCKEY, Level.NORMAL, Sports.MOUNTAINBIKING, Level.PROFESSIONAL, Sports.CLIMBING, Level.ADVANCED));
        Member anna = new Member("Anna", Map.of(Sports.PARKOUR, Level.ADVANCED));
        Member peter = new Member("Peter", Map.of(Sports.FOOTBALL, Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));

        SportsClub hinterdupfingen = new SportsClub("SC Hinterdupfingen", new BigDecimal("2"));

        try {
            removeBelowAvg(null);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ null check");
        }

        try {
            removeBelowAvg(hinterdupfingen);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ empty members");
        }

        hinterdupfingen.addMember(paul);
        hinterdupfingen.addMember(lara);
        hinterdupfingen.addMember(anna);
        hinterdupfingen.addMember(peter);

        System.out.println(removeBelowAvg(hinterdupfingen));
        System.out.println(hinterdupfingen.getMembers().size());

        hinterdupfingen.addMember(new Member("Martin", Map.of(Sports.ARCHERY, Level.NORMAL)));
        hinterdupfingen.addMember(new Member("Paula", Map.of(Sports.HANDBALL, Level.PROFESSIONAL, Sports.HOCKEY, Level.BEGINNER, Sports.MOUNTAINBIKING, Level.NORMAL)));
        System.out.println(removeBelowAvg(hinterdupfingen));
        System.out.println(hinterdupfingen.getMembers().size());

        SportsClub scTrainer = new SportsClub("SC Trainerful", BigDecimal.TEN);
        scTrainer.addMember(new Member("M", Map.of(Sports.GOLF, Level.BEGINNER, Sports.DIVING, Level.BEGINNER, Sports.FOOTBALL, Level.BEGINNER)));
        scTrainer.addMember(new Trainer("T1", Map.of(Sports.GOLF, Level.ADVANCED)));
        scTrainer.addMember(new Trainer("T2", Map.of(Sports.DIVING, Level.BEGINNER, Sports.FOOTBALL, Level.PROFESSIONAL)));

        System.out.println(removeBelowAvg(scTrainer));
        System.out.println(scTrainer.getMembers().size());
         */

        /*
         * Expected Output (Ausgabe kann nach TASK 1 ggfs leicht abweichen)
         * ✓ null check
         * ✓ empty members
         * [name: Anna, sports: {PARKOUR=Fortgeschritten}]
         * 3
         * [name: Martin, sports: {ARCHERY=Normal}]
         * 4
         * []
         * 3
         */
    }


    // TASK 4 BEGIN
    private static void task4() {
        /*
        System.out.println("\n★ TASK 4");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member paul = new Trainer("Paul", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        paul.learn(Sports.ARCHERY, Level.BEGINNER);
        Member lara = new Trainer("Lara", Map.of(Sports.HOCKEY, Level.NORMAL, Sports.MOUNTAINBIKING, Level.PROFESSIONAL, Sports.CLIMBING, Level.ADVANCED));
        Member anna = new Member("Anna", Map.of(Sports.CLIMBING, Level.ADVANCED));
        Member peter = new Member("Peter", Map.of(Sports.FOOTBALL, Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL, Sports.ARCHERY, Level.BEGINNER));
        Member pinar = new Member("Pinar", Map.of(Sports.DIVING, Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL, Sports.ARCHERY, Level.BEGINNER));
        Member laura = new Trainer("Laura", Map.of(Sports.HOCKEY, Level.NORMAL, Sports.MOUNTAINBIKING, Level.PROFESSIONAL, Sports.CLIMBING, Level.ADVANCED));

        List<Member> me = new ArrayList<Member>(Arrays.asList(paul, lara, anna, peter, pinar, laura));
        System.out.println(categorize(me));
        */

        /*
         * Expected Output (Ausgabe kann nach TASK 1 ggfs leicht abweichen)
         * {[DIVING, HANDBALL, FOOTBALL, ARCHERY]=2, [CLIMBING]=1, [MOUNTAINBIKING, CLIMBING, HOCKEY]=2, [BASKETBALL, ARCHERY, FOOTBALL]=1}
         */
    }

    /**
     * check the base implementation - ☠ must not be changed / edited / deleted ☠
     */
    private static final String EXCEPTION_MSG = "⚠ Fehler Basisimplementierung";
    private static void checkBase() {
        //--- Member / Trainer
        try {
            new Member(null);
            throw new RuntimeException(EXCEPTION_MSG);
        } catch(IllegalArgumentException ignored) {}

        try {
            new Member("");
            throw new RuntimeException(EXCEPTION_MSG);
        } catch(IllegalArgumentException ignored) {}

        try {
            new Trainer("Hannah", Collections.emptyMap());
            throw new RuntimeException(EXCEPTION_MSG);
        } catch(IllegalArgumentException ignored) {}

        //--- Level
        if(Level.PROFESSIONAL.next() != Level.PROFESSIONAL) throw new RuntimeException(EXCEPTION_MSG);
        if(Level.BEGINNER.next() != Level.NORMAL) throw new RuntimeException(EXCEPTION_MSG);

        //--- SportsClub
        Member trainerAdv = new Trainer("Trainer ADV", Map.of(Sports.ARCHERY, Level.ADVANCED));
        Member trainerBeg = new Trainer("Trainer BEG",  Map.of(Sports.ARCHERY, Level.BEGINNER, Sports.BASKETBALL, Level.ADVANCED));

        SportsClub sportsClub = new SportsClub("Testing SC", BigDecimal.TEN);
        if(!sportsClub.getFeePerSports().equals(BigDecimal.TEN)) throw new RuntimeException(EXCEPTION_MSG);

        if(!sportsClub.addMember(trainerAdv)) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.getSports().size() != 1 || !sportsClub.getSports().contains(Sports.ARCHERY))  throw new RuntimeException(EXCEPTION_MSG);

        if(!sportsClub.addMember(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.addMember(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.getMembers().size() != 2) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.getSports().size() != 2 || !sportsClub.getSports().containsAll(Arrays.asList(Sports.ARCHERY, Sports.BASKETBALL)))  throw new RuntimeException(EXCEPTION_MSG);

        //--- SportsClub registerSports
        try {
            sportsClub.registerSports(new Member("NoMember"), Sports.DIVING, Level.BEGINNER);
            throw new RuntimeException(EXCEPTION_MSG);
        } catch(IllegalArgumentException ignored) {}

        // --- Trainer for Level.PROFESSIONAL unavailable
        if(sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.PROFESSIONAL)) throw new RuntimeException(EXCEPTION_MSG);
        // --- Trainer available, wanted: Level.NORMAL, Member#learn returns Level.BEGINNER
        if(sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.NORMAL)) throw new RuntimeException(EXCEPTION_MSG);
        // --- Trainer available, wanted: Level.NORMAL, Member#learn returns Level.NORMAL
        if(!sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.NORMAL)) throw new RuntimeException(EXCEPTION_MSG);

        if(!sportsClub.getMembers().remove(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.getMembers().size() != 2) throw new RuntimeException(EXCEPTION_MSG);
        if(!sportsClub.removeMember(trainerBeg))  throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.getSports().size() != 1 || !sportsClub.getSports().contains(Sports.ARCHERY))  throw new RuntimeException(EXCEPTION_MSG);
        if(!sportsClub.removeMember(trainerAdv))  throw new RuntimeException(EXCEPTION_MSG);
        if(!sportsClub.getSports().isEmpty() || !sportsClub.getMembers().isEmpty())  throw new RuntimeException(EXCEPTION_MSG);
    }

}

