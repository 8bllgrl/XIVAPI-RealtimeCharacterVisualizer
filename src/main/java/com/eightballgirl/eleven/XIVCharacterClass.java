package com.eightballgirl.eleven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties
public class XIVCharacterClass {


    @JsonProperty("Character")
    private Character Character;

    public Character getCharacter() {
        return Character;
    }

    public void setCharacter(Character Character) {
        this.Character = Character;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Character {
        @JsonProperty("Tribe")
        private int Tribe;
        @JsonProperty("Town")
        private int Town;
        @JsonProperty("TitleTop")
        private boolean TitleTop;
        @JsonProperty("Title")
        private int Title;
        @JsonProperty("Server")
        private String Server;
        @JsonProperty("Race")
        private int Race;
        @JsonProperty("Portrait")
        private String Portrait;
        @JsonProperty("ParseDate")
        private int ParseDate;
        @JsonProperty("Nameday")
        private String Nameday;
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("GuardianDeity")
        private int GuardianDeity;
        @JsonProperty("GrandCompany")
        private GrandCompany GrandCompany;
        @JsonProperty("Gender")
        private int Gender;
        @JsonProperty("GearSet")
        private GearSet GearSet;
        @JsonProperty("FreeCompanyName")
        private String FreeCompanyName;
        @JsonProperty("FreeCompanyId")
        private String FreeCompanyId;
        @JsonProperty("DC")
        private String DC;
        @JsonProperty("ClassJobsElemental")
        private ClassJobsElemental ClassJobsElemental;
        @JsonProperty("ClassJobsBozjan")
        private ClassJobsBozjan ClassJobsBozjan;
        @JsonProperty("ClassJobs")
        private List<ClassJobs> ClassJobs;
        @JsonProperty("Bio")
        private String Bio;
        @JsonProperty("Avatar")
        private String Avatar;
        @JsonProperty("ActiveClassJob")
        private ActiveClassJob ActiveClassJob;

        public int getTribe() {
            return Tribe;
        }

        public void setTribe(int Tribe) {
            this.Tribe = Tribe;
        }

        public int getTown() {
            return Town;
        }

        public void setTown(int Town) {
            this.Town = Town;
        }

        public boolean getTitleTop() {
            return TitleTop;
        }

        public void setTitleTop(boolean TitleTop) {
            this.TitleTop = TitleTop;
        }

        public int getTitle() {
            return Title;
        }

        public void setTitle(int Title) {
            this.Title = Title;
        }

        public String getServer() {
            return Server;
        }

        public void setServer(String Server) {
            this.Server = Server;
        }

        public int getRace() {
            return Race;
        }

        public void setRace(int Race) {
            this.Race = Race;
        }

        public String getPortrait() {
            return Portrait;
        }

        public void setPortrait(String Portrait) {
            this.Portrait = Portrait;
        }

        public int getParseDate() {
            return ParseDate;
        }

        public void setParseDate(int ParseDate) {
            this.ParseDate = ParseDate;
        }

        public String getNameday() {
            return Nameday;
        }

        public void setNameday(String Nameday) {
            this.Nameday = Nameday;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getGuardianDeity() {
            return GuardianDeity;
        }

        public void setGuardianDeity(int GuardianDeity) {
            this.GuardianDeity = GuardianDeity;
        }

        public GrandCompany getGrandCompany() {
            return GrandCompany;
        }

        public void setGrandCompany(GrandCompany GrandCompany) {
            this.GrandCompany = GrandCompany;
        }

        public int getGender() {
            return Gender;
        }

        public void setGender(int Gender) {
            this.Gender = Gender;
        }

        public GearSet getGearSet() {
            return GearSet;
        }

        public void setGearSet(GearSet GearSet) {
            this.GearSet = GearSet;
        }

        public String getFreeCompanyName() {
            return FreeCompanyName;
        }

        public void setFreeCompanyName(String FreeCompanyName) {
            this.FreeCompanyName = FreeCompanyName;
        }

        public String getFreeCompanyId() {
            return FreeCompanyId;
        }

        public void setFreeCompanyId(String FreeCompanyId) {
            this.FreeCompanyId = FreeCompanyId;
        }

        public String getDC() {
            return DC;
        }

        public void setDC(String DC) {
            this.DC = DC;
        }

        public ClassJobsElemental getClassJobsElemental() {
            return ClassJobsElemental;
        }

        public void setClassJobsElemental(ClassJobsElemental ClassJobsElemental) {
            this.ClassJobsElemental = ClassJobsElemental;
        }

        public ClassJobsBozjan getClassJobsBozjan() {
            return ClassJobsBozjan;
        }

        public void setClassJobsBozjan(ClassJobsBozjan ClassJobsBozjan) {
            this.ClassJobsBozjan = ClassJobsBozjan;
        }

        public List<ClassJobs> getClassJobs() {
            return ClassJobs;
        }

        public void setClassJobs(List<ClassJobs> ClassJobs) {
            this.ClassJobs = ClassJobs;
        }

        public String getBio() {
            return Bio;
        }

        public void setBio(String Bio) {
            this.Bio = Bio;
        }

        public String getAvatar() {
            return Avatar;
        }

        public void setAvatar(String Avatar) {
            this.Avatar = Avatar;
        }

        public ActiveClassJob getActiveClassJob() {
            return ActiveClassJob;
        }

        public void setActiveClassJob(ActiveClassJob ActiveClassJob) {
            this.ActiveClassJob = ActiveClassJob;
        }
    }

    public static class Achievements{

    }
    public static class AchievementsPublic{

    }
    @JsonIgnoreProperties
    public static class GrandCompany {
        @JsonProperty("RankID")
        private int RankID;
        @JsonProperty("NameID")
        private int NameID;

        public int getRankID() {
            return RankID;
        }

        public void setRankID(int RankID) {
            this.RankID = RankID;
        }

        public int getNameID() {
            return NameID;
        }

        public void setNameID(int NameID) {
            this.NameID = NameID;
        }
    }
    @JsonIgnoreProperties
    public static class GearSet {
        @JsonProperty("Level")
        private int Level;
        @JsonProperty("JobID")
        private int JobID;
        @JsonProperty("GearKey")
        private String GearKey;
        @JsonProperty("Gear")
        private Gear Gear;
        @JsonProperty("ClassID")
        private int ClassID;
        @JsonProperty("Attributes")
        private Attributes Attributes;

        public int getLevel() {
            return Level;
        }

        public void setLevel(int Level) {
            this.Level = Level;
        }

        public int getJobID() {
            return JobID;
        }

        public void setJobID(int JobID) {
            this.JobID = JobID;
        }

        public String getGearKey() {
            return GearKey;
        }

        public void setGearKey(String GearKey) {
            this.GearKey = GearKey;
        }

        public Gear getGear() {
            return Gear;
        }

        public void setGear(Gear Gear) {
            this.Gear = Gear;
        }

        public int getClassID() {
            return ClassID;
        }

        public void setClassID(int ClassID) {
            this.ClassID = ClassID;
        }

        public Attributes getAttributes() {
            return Attributes;
        }

        public void setAttributes(Attributes Attributes) {
            this.Attributes = Attributes;
        }
    }
    @JsonIgnoreProperties
    public static class Gear {
        @JsonProperty("Ring2")
        private Ring2 Ring2;
        @JsonProperty("Ring1")
        private Ring1 Ring1;
        @JsonProperty("Necklace")
        private Necklace Necklace;
        @JsonProperty("MainHand")
        private MainHand MainHand;
        @JsonProperty("Legs")
        private Legs Legs;
        @JsonProperty("Head")
        private Head Head;
        @JsonProperty("Hands")
        private Hands Hands;
        @JsonProperty("Feet")
        private Feet Feet;
        @JsonProperty("Earrings")
        private Earrings Earrings;
        @JsonProperty("Bracelets")
        private Bracelets Bracelets;
        @JsonProperty("Body")
        private Body Body;

        public Ring2 getRing2() {
            return Ring2;
        }

        public void setRing2(Ring2 Ring2) {
            this.Ring2 = Ring2;
        }

        public Ring1 getRing1() {
            return Ring1;
        }

        public void setRing1(Ring1 Ring1) {
            this.Ring1 = Ring1;
        }

        public Necklace getNecklace() {
            return Necklace;
        }

        public void setNecklace(Necklace Necklace) {
            this.Necklace = Necklace;
        }

        public MainHand getMainHand() {
            return MainHand;
        }

        public void setMainHand(MainHand MainHand) {
            this.MainHand = MainHand;
        }

        public Legs getLegs() {
            return Legs;
        }

        public void setLegs(Legs Legs) {
            this.Legs = Legs;
        }

        public Head getHead() {
            return Head;
        }

        public void setHead(Head Head) {
            this.Head = Head;
        }

        public Hands getHands() {
            return Hands;
        }

        public void setHands(Hands Hands) {
            this.Hands = Hands;
        }

        public Feet getFeet() {
            return Feet;
        }

        public void setFeet(Feet Feet) {
            this.Feet = Feet;
        }

        public Earrings getEarrings() {
            return Earrings;
        }

        public void setEarrings(Earrings Earrings) {
            this.Earrings = Earrings;
        }

        public Bracelets getBracelets() {
            return Bracelets;
        }

        public void setBracelets(Bracelets Bracelets) {
            this.Bracelets = Bracelets;
        }

        public Body getBody() {
            return Body;
        }

        public void setBody(Body Body) {
            this.Body = Body;
        }
    }
    @JsonIgnoreProperties
    public static class Ring2 {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }
    @JsonIgnoreProperties
    public static class Ring1 {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }
    @JsonIgnoreProperties
    public static class Necklace {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getDye() {
            return Dye;
        }
        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }
    @JsonIgnoreProperties
    public static class MainHand {
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Dye")
        private int Dye;
        @JsonProperty("ID")
        private int ID;


        public int getDye() {
            return Dye;
        }
        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getMirage() {
            return Mirage;
        }
    }
    @JsonIgnoreProperties
    public static class Legs {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public int getDye() {
            return Dye;
        }
    }
    @JsonIgnoreProperties
    public static class Head {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public int getDye() {
            return Dye;
        }
    }
    @JsonIgnoreProperties
    public static class Hands {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getDye() {
            return Dye;
        }

        public void setDye(int Dye) {
            this.Dye = Dye;
        }
    }
    @JsonIgnoreProperties
    public static class Feet {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public int getDye() {
            return Dye;
        }

    }
    @JsonIgnoreProperties
    public static class Earrings {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public int getDye() {
            return Dye;
        }
    }
    @JsonIgnoreProperties
    public static class Bracelets {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public int getDye() {
            return Dye;
        }
    }
    @JsonIgnoreProperties
    public static class Body {
        @JsonProperty("Mirage")
        private int Mirage;
        @JsonProperty("Materia")
        private List<String> Materia;
        @JsonProperty("ID")
        private int ID;
        @JsonProperty("Dye")
        private int Dye;

        public int getMirage() {
            return Mirage;
        }

        public void setMirage(int Mirage) {
            this.Mirage = Mirage;
        }

        public List<String> getMateria() {
            return Materia;
        }

        public void setMateria(List<String> Materia) {
            this.Materia = Materia;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getDye() {
            return Dye;
        }

        public void setDye(int Dye) {
            this.Dye = Dye;
        }
    }
    @JsonIgnoreProperties
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

        public int getFortysix() {
            return fortysix;
        }

        public int getFortyfive() {
            return fortyfive;
        }

        public int getFortyfour() {
            return fortyfour;
        }

        public int getThirtyfour() {
            return thirtyfour;
        }

        public int getThirtyThree() {
            return thirtyThree;
        }

        public int getTwentySeven() {
            return twentySeven;
        }

        public int getTwentyfour() {
            return twentyfour;
        }

        public int getTwentytwo() {
            return twentytwo;
        }

        public int getTwentyone() {
            return twentyone;
        }

        public int getTwenty() {
            return twenty;
        }

        public int getNineteen() {
            return nineteen;
        }

        public int getEight() {
            return eight;
        }

        public int getSeven() {
            return seven;
        }

        public int getSix() {
            return six;
        }

        public int getFive() {
            return five;
        }

        public int getFour() {
            return four;
        }

        public int getThree() {
            return three;
        }

        public int getTwo() {
            return two;
        }

        public int getOne() {
            return one;
        }
    }
    @JsonIgnoreProperties
    public static class ClassJobsElemental {
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("Level")
        private int Level;
        @JsonProperty("ExpLevelTogo")
        private int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        private int ExpLevelMax;
        @JsonProperty("ExpLevel")
        private int ExpLevel;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getLevel() {
            return Level;
        }

        public void setLevel(int Level) {
            this.Level = Level;
        }

        public int getExpLevelTogo() {
            return ExpLevelTogo;
        }

        public void setExpLevelTogo(int ExpLevelTogo) {
            this.ExpLevelTogo = ExpLevelTogo;
        }

        public int getExpLevelMax() {
            return ExpLevelMax;
        }

        public void setExpLevelMax(int ExpLevelMax) {
            this.ExpLevelMax = ExpLevelMax;
        }

        public int getExpLevel() {
            return ExpLevel;
        }

        public void setExpLevel(int ExpLevel) {
            this.ExpLevel = ExpLevel;
        }
    }
    @JsonIgnoreProperties
    public static class ClassJobsBozjan {
        @JsonProperty("Name")
        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }
    }
    @JsonIgnoreProperties
    public static class ClassJobs {
        @JsonProperty("UnlockedState")
        private UnlockedState UnlockedState;
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("Level")
        private int Level;
        @JsonProperty("JobID")
        private int JobID;
        @JsonProperty("IsSpecialised")
        private boolean IsSpecialised;
        @JsonProperty("ExpLevelTogo")
        private int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        private int ExpLevelMax;
        @JsonProperty("ExpLevel")
        private int ExpLevel;
        @JsonProperty("ClassID")
        private int ClassID;

        public UnlockedState getUnlockedState() {
            return UnlockedState;
        }

        public void setUnlockedState(UnlockedState UnlockedState) {
            this.UnlockedState = UnlockedState;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getLevel() {
            return Level;
        }

        public void setLevel(int Level) {
            this.Level = Level;
        }

        public int getJobID() {
            return JobID;
        }

        public void setJobID(int JobID) {
            this.JobID = JobID;
        }

        public boolean getIsSpecialised() {
            return IsSpecialised;
        }

        public void setIsSpecialised(boolean IsSpecialised) {
            this.IsSpecialised = IsSpecialised;
        }

        public int getExpLevelTogo() {
            return ExpLevelTogo;
        }

        public void setExpLevelTogo(int ExpLevelTogo) {
            this.ExpLevelTogo = ExpLevelTogo;
        }

        public int getExpLevelMax() {
            return ExpLevelMax;
        }

        public void setExpLevelMax(int ExpLevelMax) {
            this.ExpLevelMax = ExpLevelMax;
        }

        public int getExpLevel() {
            return ExpLevel;
        }

        public void setExpLevel(int ExpLevel) {
            this.ExpLevel = ExpLevel;
        }

        public int getClassID() {
            return ClassID;
        }

        public void setClassID(int ClassID) {
            this.ClassID = ClassID;
        }
    }
    @JsonIgnoreProperties
    public static class UnlockedState {
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("ID")
        private int ID;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }
    @JsonIgnoreProperties
    public static class ActiveClassJob {
        @JsonProperty("UnlockedState")
        private UnlockedState UnlockedState;
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("Level")
        private int Level;
        @JsonProperty("JobID")
        private int JobID;
        @JsonProperty("IsSpecialised")
        private boolean IsSpecialised;
        @JsonProperty("ExpLevelTogo")
        private int ExpLevelTogo;
        @JsonProperty("ExpLevelMax")
        private int ExpLevelMax;
        @JsonProperty("ExpLevel")
        private int ExpLevel;
        @JsonProperty("ClassID")
        private int ClassID;

        public UnlockedState getUnlockedState() {
            return UnlockedState;
        }

        public void setUnlockedState(UnlockedState UnlockedState) {
            this.UnlockedState = UnlockedState;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getLevel() {
            return Level;
        }

        public void setLevel(int Level) {
            this.Level = Level;
        }

        public int getJobID() {
            return JobID;
        }

        public void setJobID(int JobID) {
            this.JobID = JobID;
        }

        public boolean getIsSpecialised() {
            return IsSpecialised;
        }

        public void setIsSpecialised(boolean IsSpecialised) {
            this.IsSpecialised = IsSpecialised;
        }

        public int getExpLevelTogo() {
            return ExpLevelTogo;
        }

        public void setExpLevelTogo(int ExpLevelTogo) {
            this.ExpLevelTogo = ExpLevelTogo;
        }

        public int getExpLevelMax() {
            return ExpLevelMax;
        }

        public void setExpLevelMax(int ExpLevelMax) {
            this.ExpLevelMax = ExpLevelMax;
        }

        public int getExpLevel() {
            return ExpLevel;
        }

        public void setExpLevel(int ExpLevel) {
            this.ExpLevel = ExpLevel;
        }

        public int getClassID() {
            return ClassID;
        }

        public void setClassID(int ClassID) {
            this.ClassID = ClassID;
        }
    }
    @JsonIgnoreProperties
    public static class UnlockedStateSecond {
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("ID")
        private int ID;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }
}
