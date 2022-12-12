package com.eightballgirl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class XIVCharacter {


    @JsonProperty("Character")
    public Character Character;

    public static class Character {
        @JsonProperty("Tribe")
        public int Tribe;
        @JsonProperty("Town")
        public int Town;
        @JsonProperty("TitleTop")
        public boolean TitleTop;
        @JsonProperty("Title")
        public int Title;
        @JsonProperty("Server")
        public String Server;
        @JsonProperty("Race")
        public int Race;
        @JsonProperty("Portrait")
        public String Portrait;
        @JsonProperty("ParseDate")
        public int ParseDate;
        @JsonProperty("Nameday")
        public String Nameday;
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("ID")
        public int ID;
        @JsonProperty("GuardianDeity")
        public int GuardianDeity;
        @JsonProperty("GrandCompany")
        public GrandCompany GrandCompany;
        @JsonProperty("Gender")
        public int Gender;
        @JsonProperty("GearSet")
        public GearSet GearSet;
        @JsonProperty("FreeCompanyName")
        public String FreeCompanyName;
        @JsonProperty("FreeCompanyId")
        public String FreeCompanyId;
        @JsonProperty("DC")
        public String DC;
        @JsonProperty("ClassJobsElemental")
        public ClassJobsElemental ClassJobsElemental;
        @JsonProperty("ClassJobsBozjan")
        public ClassJobsBozjan ClassJobsBozjan;
        @JsonProperty("ClassJobs")
        public List<ClassJobs> ClassJobs;
        @JsonProperty("Bio")
        public String Bio;
        @JsonProperty("Avatar")
        public String Avatar;
        @JsonProperty("ActiveClassJob")
        public ActiveClassJob ActiveClassJob;
    }

    public static class GrandCompany {
        @JsonProperty("RankID")
        public int RankID;
        @JsonProperty("NameID")
        public int NameID;
    }

    public static class GearSet {
        @JsonProperty("Level")
        public int Level;
        @JsonProperty("JobID")
        public int JobID;
        @JsonProperty("GearKey")
        public String GearKey;
        @JsonProperty("Gear")
        public Gear Gear;
        @JsonProperty("ClassID")
        public int ClassID;
        @JsonProperty("Attributes")
        public Attributes Attributes;
    }

    public static class Gear {
        @JsonProperty("Ring2")
        public Ring2 Ring2;
        @JsonProperty("Ring1")
        public Ring1 Ring1;
        @JsonProperty("Necklace")
        public Necklace Necklace;
        @JsonProperty("MainHand")
        public MainHand MainHand;
        @JsonProperty("Legs")
        public Legs Legs;
        @JsonProperty("Head")
        public Head Head;
        @JsonProperty("Hands")
        public Hands Hands;
        @JsonProperty("Feet")
        public Feet Feet;
        @JsonProperty("Earrings")
        public Earrings Earrings;
        @JsonProperty("Bracelets")
        public Bracelets Bracelets;
        @JsonProperty("Body")
        public Body Body;
    }

    public static class Ring2 {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Ring1 {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Necklace {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class MainHand {
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Legs {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Head {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Hands {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
        @JsonProperty("Dye")
        public int Dye;
    }

    public static class Feet {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Earrings {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Bracelets {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
    }

    public static class Body {
        @JsonProperty("Mirage")
        public int Mirage;
        @JsonProperty("Materia")
        public List<String> Materia;
        @JsonProperty("ID")
        public int ID;
        @JsonProperty("Dye")
        public int Dye;
    }

    public static class Attributes {
        @JsonProperty("46")
        public int fortysix = 46;
        @JsonProperty("45")
        public int fortyfive = 45;
        @JsonProperty("44")
        public int fortyfour = 44;
        @JsonProperty("34")
        public int thirtyfour = 34;
        @JsonProperty("33")
        public int thirtyThree = 33;
        @JsonProperty("27")
        public int twentySeven = 27;
        @JsonProperty("24")
        public int twentyfour = 24;
        @JsonProperty("22")
        public int twentytwo = 22;
        @JsonProperty("21")
        public int twentyone=21;
        @JsonProperty("20")
        public int twenty=20;
        @JsonProperty("19")
        public int nineteen=19;
        @JsonProperty("8")
        public int eight=8;
        @JsonProperty("7")
        public int seven=7;
        @JsonProperty("6")
        public int six=6;
        @JsonProperty("5")
        public int five=5;
        @JsonProperty("4")
        public int four=4;
        @JsonProperty("3")
        public int three=3;
        @JsonProperty("2")
        public int two=2;
        @JsonProperty("1")
        public int one=1;
    }

    public static class ClassJobsElemental {
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("Level")
        public int Level;
        @JsonProperty("ExpLevelTogo")
        public int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        public int ExpLevelMax;
        @JsonProperty("ExpLevel")
        public int ExpLevel;
    }

    public static class ClassJobsBozjan {
        @JsonProperty("Name")
        public String Name;
    }

    public static class ClassJobs {
        @JsonProperty("UnlockedState")
        public UnlockedStateAgain UnlockedState;
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("Level")
        public int Level;
        @JsonProperty("JobID")
        public int JobID;
        @JsonProperty("IsSpecialised")
        public boolean IsSpecialised;
        @JsonProperty("ExpLevelTogo")
        public int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        public int ExpLevelMax;
        @JsonProperty("ExpLevel")
        public int ExpLevel;
        @JsonProperty("ClassID")
        public int ClassID;
    }

    public static class UnlockedState {
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("ID")
        public int ID;
    }

    public static class ActiveClassJob {
        @JsonProperty("UnlockedState")
        public UnlockedStateAgain UnlockedState;
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("Level")
        public int Level;
        @JsonProperty("JobID")
        public int JobID;
        @JsonProperty("IsSpecialised")
        public boolean IsSpecialised;
        @JsonProperty("ExpLevelTogo")
        public int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        public int ExpLevelMax;
        @JsonProperty("ExpLevel")
        public int ExpLevel;
        @JsonProperty("ClassID")
        public int ClassID;
    }

    public static class UnlockedStateAgain {
        @JsonProperty("Name")
        public String Name;
        @JsonProperty("ID")
        public int ID;
    }


}

//@JsonProperty("46")
//        public int fortysix = 46;
//        @JsonProperty("45")
//        public int fortyfive = 45;
//        @JsonProperty("44")
//        public int fortyfour = 44;
//        @JsonProperty("34")
//        public int thirtyfour = 34;
//        @JsonProperty("33")
//        public int thirtyThree = 33;
//        @JsonProperty("27")
//        public int twentySeven = 27;
//        @JsonProperty("24")
//        public int twentyfour = 24;
//        @JsonProperty("22")
//        public int twentytwo = 22;
//        @JsonProperty("21")
//        public int twentyone=21;
//        @JsonProperty("20")
//        public int twenty=20;
//        @JsonProperty("19")
//        public int nineteen=19;
//        @JsonProperty("8")
//        public int eight=8;
//        @JsonProperty("7")
//        public int seven=7;
//        @JsonProperty("6")
//        public int six=6;
//        @JsonProperty("5")
//        public int five=5;
//        @JsonProperty("4")
//        public int four=4;
//        @JsonProperty("3")
//        public int three=3;
//        @JsonProperty("2")
//        public int two=2;
//        @JsonProperty("1")
//        public int one=1;