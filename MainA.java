package a01563679;

import java.math.BigDecimal;
import java.util.*;

public class MainA {

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

//        Member anna = new Member("Anna", Map.of(Sports.CLIMBING,Level.ADVANCED));
//        System.out.println(anna);
//        Member peter = new Member("Peter", Map.of(Sports.ARCHERY,Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));
//        System.out.println(peter);
//        Member paul = new Trainer("Paul", Map.of(Sports.DIVING,Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
//        System.out.println(paul);
         

        /*
         * Expected Output (Reihenfolge der Elemente in sports/accreditations kann variieren)
         * name: Anna, sports: {CLIMBING=Fortgeschritten(1)}
         * name: Peter, sports: {ARCHERY=Anfänger(2), BASKETBALL=*Profi(3)*}
         * name: Paul, sports: {HANDBALL=*Profi(4)*, DIVING=*Profi(5)*, FOOTBALL=Normal(6)}, accreditations: {HANDBALL=*Profi(7)*, DIVING=*Profi(8)*, FOOTBALL=Normal(9)}
         */
    }


    // TASK 2 BEGIN
    private static void task2() {
        /*
        System.out.println("\n★ TASK 2");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member anna = new Member("Anna", Map.of(Sports.CLIMBING,Level.ADVANCED));
        System.out.println(anna.calculateExpertise());
        Member peter = new Member("Peter", Map.of(Sports.ARCHERY,Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));
        System.out.println(peter.calculateExpertise());
        Member paulm = new Member("PaulMember", Map.of(Sports.DIVING,Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        System.out.println(paulm.calculateExpertise());
        Member pault = new Trainer("PaulTrainer", Map.of(Sports.DIVING,Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        System.out.println(pault.calculateExpertise());
        */

        /*
         * Expected Output
         * 3.0
         * 5.0
         * 10.0
         * 11.0
         */
    }


    // TASK 3 BEGIN
    private static void task3() {
        /*
        System.out.println("\n★ TASK 3");
        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member paul = new Trainer("Paul", Map.of(Sports.DIVING,Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        Member lara = new Trainer("Lara", Map.of(Sports.HOCKEY,Level.NORMAL, Sports.MOUNTAINBIKING, Level.PROFESSIONAL, Sports.CLIMBING,Level.ADVANCED));
        Member anna = new Member("Anna", Map.of(Sports.CLIMBING,Level.ADVANCED));
        Member peter = new Member("Peter", Map.of(Sports.FOOTBALL,Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL));

        SportsClub hinterdupfingen = new SportsClub("SC Hinterdupfingen", new BigDecimal("2"));

        try {
            Main.remove(null, BigDecimal.TEN);
        } catch(IllegalArgumentException e) {
            System.out.println("✓ null check");
        }

        try {
            Main.remove(hinterdupfingen, BigDecimal.TEN);
        } catch(IllegalArgumentException e) {
            System.out.println("✓ empty members");
        }

        hinterdupfingen.addMember(paul);
        hinterdupfingen.addMember(lara);
        hinterdupfingen.addMember(anna);
        hinterdupfingen.addMember(peter);

        try {
            Main.remove(hinterdupfingen, BigDecimal.TEN.negate());
        } catch(IllegalArgumentException e) {
            System.out.println("✓ negative percentage");
        }

        try {
            Main.remove(hinterdupfingen, new BigDecimal("100.1"));
        } catch(IllegalArgumentException e) {
            System.out.println("✓ percentage out-of-range");
        }

        System.out.println(Main.remove(hinterdupfingen, new BigDecimal("1")));
        System.out.println(hinterdupfingen.getMembers().size());

        System.out.println(Main.remove(hinterdupfingen, new BigDecimal("50")));
        System.out.println(hinterdupfingen.getMembers().size());

        SportsClub scTrainer = new SportsClub("SC Trainerful", BigDecimal.TEN);
        scTrainer.addMember(new Member("M", Map.of(Sports.GOLF, Level.BEGINNER, Sports.DIVING, Level.BEGINNER, Sports.FOOTBALL, Level.BEGINNER)));
        scTrainer.addMember(new Trainer("T1", Map.of(Sports.GOLF, Level.ADVANCED)));
        scTrainer.addMember(new Trainer("T2", Map.of(Sports.DIVING, Level.BEGINNER, Sports.FOOTBALL, Level.PROFESSIONAL)));

        System.out.println(Main.remove(scTrainer, new BigDecimal("100")));
        System.out.println(scTrainer.getMembers().size());
        */

        /*
         * Expected Output (Ausgabe kann nach TASK 1 ggfs leicht abweichen)
         * ✓ null check
         * ✓ empty members
         * ✓ negative percentage
         * ✓ percentage out-of-range
         * []
         * 4
         * [name: Peter, sports: {FOOTBALL=Anfänger, BASKETBALL=Profi}]
         * 3
         * []
         * 3
         */

    }


    // TASK 4 BEGIN
    private static void task4() {
        /*
        System.out.println("\n★ TASK 4");

        checkBase(); // checkBase call - ☠ must not be changed / edited / deleted ☠

        Member paul = new Trainer("Paul", Map.of(Sports.DIVING,Level.PROFESSIONAL, Sports.HANDBALL, Level.PROFESSIONAL, Sports.FOOTBALL, Level.NORMAL));
        paul.learn(Sports.ARCHERY, Level.BEGINNER);
        Member lara = new Trainer("Lara", Map.of(Sports.HOCKEY,Level.NORMAL, Sports.MOUNTAINBIKING, Level.PROFESSIONAL, Sports.CLIMBING,Level.ADVANCED));
        Member anna = new Member("Anna", Map.of(Sports.CLIMBING,Level.ADVANCED));
        Member peter = new Member("Peter", Map.of(Sports.FOOTBALL,Level.BEGINNER, Sports.BASKETBALL, Level.PROFESSIONAL, Sports.ARCHERY, Level.BEGINNER));

        List<Member> me = new ArrayList<Member>(Arrays.asList(paul,lara,anna,peter));
        System.out.println(categorize(me));
        */

        /*
         * Expected Output
         * {1=[Anna], 3=[Lara, Peter], 4=[Paul]}
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
        //
        Member trainerOvaj = new Trainer("Trainer Ovaj", Map.of(Sports.ARCHERY, Level.ADVANCED));
        Member trainerOnaj = new Trainer("Trainer Onaj", Map.of(Sports.ARCHERY, Level.ADVANCED, Sports.GOLF, Level.ADVANCED));
        Member zaba = new Member("Zhaba", Map.of(Sports.PARKOUR,Level.BEGINNER));
        //

        
        SportsClub sportsClub = new SportsClub("Testing SC", BigDecimal.TEN);
        if(!sportsClub.getFeePerSports().equals(BigDecimal.TEN)) throw new RuntimeException(EXCEPTION_MSG);

        //
        if(!sportsClub.addMember(trainerOvaj)) throw new RuntimeException(EXCEPTION_MSG);
        if(!sportsClub.addMember(trainerOnaj)) throw new RuntimeException(EXCEPTION_MSG);
        //
        if(!sportsClub.addMember(trainerAdv)) throw new RuntimeException(EXCEPTION_MSG);
        if(!sportsClub.addMember(zaba)) throw new RuntimeException(EXCEPTION_MSG);
    //    if(!sportsClub.addMember(zirafa)) throw new RuntimeException(EXCEPTION_MSG);
     //   if(sportsClub.getSports().size() != 2 || !sportsClub.getSports().contains(Sports.ARCHERY))  throw new RuntimeException(EXCEPTION_MSG); //bilo 1

        if(!sportsClub.addMember(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
        if(sportsClub.addMember(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
//        if(sportsClub.getMembers().size() != 4) throw new RuntimeException(EXCEPTION_MSG);	//bilo 2
//        if(sportsClub.getSports().size() != 3 || !sportsClub.getSports().containsAll(Arrays.asList(Sports.ARCHERY, Sports.BASKETBALL)))  throw new RuntimeException(EXCEPTION_MSG);	//bilo 2

        //--- SportsClub registerSports
        try {
            sportsClub.registerSports(new Member("NoMember"), Sports.DIVING, Level.BEGINNER);
            throw new RuntimeException(EXCEPTION_MSG);
        } catch(IllegalArgumentException ignored) {}

        // --- Trainer for Level.PROFESSIONAL unavailable
        if(sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.PROFESSIONAL)) throw new RuntimeException(EXCEPTION_MSG);
        // --- Trainer available, wanted: Level.NORMAL, Member#learn returns Level.BEGINNER
      //  if(sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.NORMAL)) throw new RuntimeException(EXCEPTION_MSG);
        // --- Trainer available, wanted: Level.NORMAL, Member#learn returns Level.NORMAL
      //  if(!sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.NORMAL)) throw new RuntimeException(EXCEPTION_MSG);

        

        sportsClub.registerSports(zaba, Sports.DIVING, Level.NORMAL);
        sportsClub.registerSports(trainerAdv, Sports.BASKETBALL, Level.ADVANCED);

        // Vraca golf.BEGINNER al ko ce znat zasto
        Member TreinerJohn = new Trainer("John Doe",  Map.of(Sports.GOLF, Level.NORMAL, Sports.DIVING, Level.PROFESSIONAL));
        Member memberMax = new Member("Max Musterman", Map.of(Sports.MOUNTAINBIKING,Level.NORMAL, Sports.BASKETBALL, Level.PROFESSIONAL));

       sportsClub.addMember(TreinerJohn);
       sportsClub.addMember(memberMax);
       
       sportsClub.registerSports(memberMax, Sports.GOLF, Level.ADVANCED);
       
       System.out.println(memberMax.getSports());
        
       // 
        
        
        if(!sportsClub.getMembers().remove(trainerBeg)) throw new RuntimeException(EXCEPTION_MSG);
//        if(sportsClub.getMembers().size() != 4) throw new RuntimeException(EXCEPTION_MSG);	//bilo 2
        if(!sportsClub.removeMember(trainerBeg))  throw new RuntimeException(EXCEPTION_MSG);
//        if(sportsClub.getSports().size() != 2 || !sportsClub.getSports().contains(Sports.ARCHERY))  throw new RuntimeException(EXCEPTION_MSG); //bilo 1
        if(!sportsClub.removeMember(trainerAdv))  throw new RuntimeException(EXCEPTION_MSG);
      //  if(!sportsClub.getSports().isEmpty() || !sportsClub.getMembers().isEmpty())  throw new RuntimeException(EXCEPTION_MSG);
    }

}

