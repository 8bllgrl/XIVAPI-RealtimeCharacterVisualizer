//package com.eightballgirl.thirteen;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import java.util.List;
//
////https://xivapi.com/character/1?extended=1
//public class XivCharacterExtended {
//
//
//    @JsonProperty("Character")
//    private Character Character;
//
//    public Character getCharacter() {
//        return Character;
//    }
//
//    public void setCharacter(Character Character) {
//        this.Character = Character;
//    }
//
//    public static class Character {
//        @JsonProperty("Tribe")
//        private Tribe Tribe;
//        @JsonProperty("Town")
//        private Town Town;
//        @JsonProperty("TitleTop")
//        private boolean TitleTop;
//        @JsonProperty("Title")
//        private Title Title;
//        @JsonProperty("Server")
//        private String Server;
//        @JsonProperty("Race")
//        private Race Race;
//        @JsonProperty("Portrait")
//        private String Portrait;
//        @JsonProperty("ParseDate")
//        private int ParseDate;
//        @JsonProperty("Nameday")
//        private String Nameday;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("GuardianDeity")
//        private GuardianDeity GuardianDeity;
//        @JsonProperty("GrandCompany")
//        private GrandCompany GrandCompany;
//        @JsonProperty("GenderID")
//        private int GenderID;
//        @JsonProperty("Gender")
//        private int Gender;
//        @JsonProperty("GearSet")
//        private GearSet GearSet;
//        @JsonProperty("FreeCompanyName")
//        private String FreeCompanyName;
//        @JsonProperty("FreeCompanyId")
//        private String FreeCompanyId;
//        @JsonProperty("DC")
//        private String DC;
//        @JsonProperty("ClassJobsElemental")
//        private ClassJobsElemental ClassJobsElemental;
//        @JsonProperty("ClassJobsBozjan")
//        private ClassJobsBozjan ClassJobsBozjan;
//        @JsonProperty("ClassJobs")
//        private List<ClassJobs> ClassJobs;
//        @JsonProperty("Bio")
//        private String Bio;
//        @JsonProperty("Avatar")
//        private String Avatar;
//        @JsonProperty("ActiveClassJob")
//        private ActiveClassJob ActiveClassJob;
//
//        public Tribe getTribe() {
//            return Tribe;
//        }
//
//        public void setTribe(Tribe Tribe) {
//            this.Tribe = Tribe;
//        }
//
//        public Town getTown() {
//            return Town;
//        }
//
//        public void setTown(Town Town) {
//            this.Town = Town;
//        }
//
//        public boolean getTitleTop() {
//            return TitleTop;
//        }
//
//        public void setTitleTop(boolean TitleTop) {
//            this.TitleTop = TitleTop;
//        }
//
//        public Title getTitle() {
//            return Title;
//        }
//
//        public void setTitle(Title Title) {
//            this.Title = Title;
//        }
//
//        public String getServer() {
//            return Server;
//        }
//
//        public void setServer(String Server) {
//            this.Server = Server;
//        }
//
//        public Race getRace() {
//            return Race;
//        }
//
//        public void setRace(Race Race) {
//            this.Race = Race;
//        }
//
//        public String getPortrait() {
//            return Portrait;
//        }
//
//        public void setPortrait(String Portrait) {
//            this.Portrait = Portrait;
//        }
//
//        public int getParseDate() {
//            return ParseDate;
//        }
//
//        public void setParseDate(int ParseDate) {
//            this.ParseDate = ParseDate;
//        }
//
//        public String getNameday() {
//            return Nameday;
//        }
//
//        public void setNameday(String Nameday) {
//            this.Nameday = Nameday;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public GuardianDeity getGuardianDeity() {
//            return GuardianDeity;
//        }
//
//        public void setGuardianDeity(GuardianDeity GuardianDeity) {
//            this.GuardianDeity = GuardianDeity;
//        }
//
//        public GrandCompany getGrandCompany() {
//            return GrandCompany;
//        }
//
//        public void setGrandCompany(GrandCompany GrandCompany) {
//            this.GrandCompany = GrandCompany;
//        }
//
//        public int getGenderID() {
//            return GenderID;
//        }
//
//        public void setGenderID(int GenderID) {
//            this.GenderID = GenderID;
//        }
//
//        public int getGender() {
//            return Gender;
//        }
//
//        public void setGender(int Gender) {
//            this.Gender = Gender;
//        }
//
//        public GearSet getGearSet() {
//            return GearSet;
//        }
//
//        public void setGearSet(GearSet GearSet) {
//            this.GearSet = GearSet;
//        }
//
//        public String getFreeCompanyName() {
//            return FreeCompanyName;
//        }
//
//        public void setFreeCompanyName(String FreeCompanyName) {
//            this.FreeCompanyName = FreeCompanyName;
//        }
//
//        public String getFreeCompanyId() {
//            return FreeCompanyId;
//        }
//
//        public void setFreeCompanyId(String FreeCompanyId) {
//            this.FreeCompanyId = FreeCompanyId;
//        }
//
//        public String getDC() {
//            return DC;
//        }
//
//        public void setDC(String DC) {
//            this.DC = DC;
//        }
//
//        public ClassJobsElemental getClassJobsElemental() {
//            return ClassJobsElemental;
//        }
//
//        public void setClassJobsElemental(ClassJobsElemental ClassJobsElemental) {
//            this.ClassJobsElemental = ClassJobsElemental;
//        }
//
//        public ClassJobsBozjan getClassJobsBozjan() {
//            return ClassJobsBozjan;
//        }
//
//        public void setClassJobsBozjan(ClassJobsBozjan ClassJobsBozjan) {
//            this.ClassJobsBozjan = ClassJobsBozjan;
//        }
//
//        public List<ClassJobs> getClassJobs() {
//            return ClassJobs;
//        }
//
//        public void setClassJobs(List<ClassJobs> ClassJobs) {
//            this.ClassJobs = ClassJobs;
//        }
//
//        public String getBio() {
//            return Bio;
//        }
//
//        public void setBio(String Bio) {
//            this.Bio = Bio;
//        }
//
//        public String getAvatar() {
//            return Avatar;
//        }
//
//        public void setAvatar(String Avatar) {
//            this.Avatar = Avatar;
//        }
//
//        public ActiveClassJob getActiveClassJob() {
//            return ActiveClassJob;
//        }
//
//        public void setActiveClassJob(ActiveClassJob ActiveClassJob) {
//            this.ActiveClassJob = ActiveClassJob;
//        }
//    }
//
//    public static class Tribe {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class Town {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class Title {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class Race {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class GuardianDeity {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class GrandCompany {
//    }
//
//    public static class GearSet {
//        @JsonProperty("Level")
//        private int Level;
//        @JsonProperty("Job")
//        private Job_B Job_B;
//        @JsonProperty("GearKey")
//        private String GearKey;
//        @JsonProperty("Gear")
//        private Gear Gear;
//        @JsonProperty("Class")
//        private Class_B Class_B;
////        @JsonProperty("Attributes")
////        private List<Attributes> Attributes;
//
//        public int getLevel() {
//            return Level;
//        }
//
//        public void setLevel(int Level) {
//            this.Level = Level;
//        }
//
//        public Job_B getJob() {
//            return Job_B;
//        }
//
//        public void setJob(Job_B Job_B) {
//            this.Job_B = Job_B;
//        }
//
//        public String getGearKey() {
//            return GearKey;
//        }
//
//        public void setGearKey(String GearKey) {
//            this.GearKey = GearKey;
//        }
//
//        public Gear getGear() {
//            return Gear;
//        }
//
//        public void setGear(Gear Gear) {
//            this.Gear = Gear;
//        }
//
//        public Class_B getClass_B() {
//            return Class_B;
//        }
//
//        public void setClass(Class_B Class_B) {
//            this.Class_B = Class_B;
//        }
//
////        public List<Attributes> getAttributes() {
////            return Attributes;
////        }
////
////        public void setAttributes(List<Attributes> Attributes) {
////            this.Attributes = Attributes;
////        }
//    }
//
//    public static class Job {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("Abbreviation")
//        private String Abbreviation;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public String getAbbreviation() {
//            return Abbreviation;
//        }
//
//        public void setAbbreviation(String Abbreviation) {
//            this.Abbreviation = Abbreviation;
//        }
//    }
//
//    public static class Gear {
//        @JsonProperty("Ring2")
//        private Ring2 Ring2;
//        @JsonProperty("Ring1")
//        private Ring1 Ring1;
//        @JsonProperty("OffHand")
//        private OffHand OffHand;
//        @JsonProperty("Necklace")
//        private Necklace Necklace;
//        @JsonProperty("MainHand")
//        private MainHand MainHand;
//        @JsonProperty("Legs")
//        private Legs Legs;
//        @JsonProperty("Hands")
//        private Hands Hands;
//        @JsonProperty("Feet")
//        private Feet Feet;
//        @JsonProperty("Earrings")
//        private Earrings Earrings;
//        @JsonProperty("Bracelets")
//        private Bracelets Bracelets;
//        @JsonProperty("Body")
//        private Body Body;
//
//        public Ring2 getRing2() {
//            return Ring2;
//        }
//
//        public void setRing2(Ring2 Ring2) {
//            this.Ring2 = Ring2;
//        }
//
//        public Ring1 getRing1() {
//            return Ring1;
//        }
//
//        public void setRing1(Ring1 Ring1) {
//            this.Ring1 = Ring1;
//        }
//
//        public OffHand getOffHand() {
//            return OffHand;
//        }
//
//        public void setOffHand(OffHand OffHand) {
//            this.OffHand = OffHand;
//        }
//
//        public Necklace getNecklace() {
//            return Necklace;
//        }
//
//        public void setNecklace(Necklace Necklace) {
//            this.Necklace = Necklace;
//        }
//
//        public MainHand getMainHand() {
//            return MainHand;
//        }
//
//        public void setMainHand(MainHand MainHand) {
//            this.MainHand = MainHand;
//        }
//
//        public Legs getLegs() {
//            return Legs;
//        }
//
//        public void setLegs(Legs Legs) {
//            this.Legs = Legs;
//        }
//
//        public Hands getHands() {
//            return Hands;
//        }
//
//        public void setHands(Hands Hands) {
//            this.Hands = Hands;
//        }
//
//        public Feet getFeet() {
//            return Feet;
//        }
//
//        public void setFeet(Feet Feet) {
//            this.Feet = Feet;
//        }
//
//        public Earrings getEarrings() {
//            return Earrings;
//        }
//
//        public void setEarrings(Earrings Earrings) {
//            this.Earrings = Earrings;
//        }
//
//        public Bracelets getBracelets() {
//            return Bracelets;
//        }
//
//        public void setBracelets(Bracelets Bracelets) {
//            this.Bracelets = Bracelets;
//        }
//
//        public Body getBody() {
//            return Body;
//        }
//
//        public void setBody(Body Body) {
//            this.Body = Body;
//        }
//    }
//
//    public static class Ring2 {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
////    public static class Item {
////        @JsonProperty("Rarity")
////        private int Rarity;
////        @JsonProperty("Name")
////        private String Name;
////        @JsonProperty("LevelItem")
////        private int LevelItem;
////        @JsonProperty("LevelEquip")
////        private int LevelEquip;
////        @JsonProperty("ItemUICategory")
////        private ItemUICategory_A ItemUICategory_A;
////        @JsonProperty("Icon")
////        private String Icon;
////        @JsonProperty("ID")
////        private int ID;
////        @JsonProperty("ClassJobCategory")
////        private ClassJobCategory_A ClassJobCategory_A;
////
////        public int getRarity() {
////            return Rarity;
////        }
////
////        public void setRarity(int Rarity) {
////            this.Rarity = Rarity;
////        }
////
////        public String getName() {
////            return Name;
////        }
////
////        public void setName(String Name) {
////            this.Name = Name;
////        }
////
////        public int getLevelItem() {
////            return LevelItem;
////        }
////
////        public void setLevelItem(int LevelItem) {
////            this.LevelItem = LevelItem;
////        }
////
////        public int getLevelEquip() {
////            return LevelEquip;
////        }
////
////        public void setLevelEquip(int LevelEquip) {
////            this.LevelEquip = LevelEquip;
////        }
////
////        public ItemUICategory_A getItemUICategory() {
////            return ItemUICategory_A;
////        }
////
////        public void setItemUICategory(ItemUICategory_A ItemUICategory_A) {
////            this.ItemUICategory_A = ItemUICategory_A;
////        }
////
////        public String getIcon() {
////            return Icon;
////        }
////
////        public void setIcon(String Icon) {
////            this.Icon = Icon;
////        }
////
////        public int getID() {
////            return ID;
////        }
////
////        public void setID(int ID) {
////            this.ID = ID;
////        }
////
////        public ClassJobCategory_A getClassJobCategory() {
////            return ClassJobCategory_A;
////        }
////
////        public void setClassJobCategory(ClassJobCategory_A ClassJobCategory_A) {
////            this.ClassJobCategory_A = ClassJobCategory_A;
////        }
////    }
//
//
//    public static class Ring1 {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//    public static class Item {
//        @JsonProperty("Rarity")
//        private int Rarity;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("LevelItem")
//        private int LevelItem;
//        @JsonProperty("LevelEquip")
//        private int LevelEquip;
//        @JsonProperty("ItemUICategory")
//        private ItemUICategory ItemUICategory;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("ClassJobCategory")
//        private ClassJobCategory ClassJobCategory_A;
//
//        public int getRarity() {
//            return Rarity;
//        }
//
//        public void setRarity(int Rarity) {
//            this.Rarity = Rarity;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getLevelItem() {
//            return LevelItem;
//        }
//
//        public void setLevelItem(int LevelItem) {
//            this.LevelItem = LevelItem;
//        }
//
//        public int getLevelEquip() {
//            return LevelEquip;
//        }
//
//        public void setLevelEquip(int LevelEquip) {
//            this.LevelEquip = LevelEquip;
//        }
//
//        public ItemUICategory getItemUICategory() {
//            return ItemUICategory;
//        }
//
//        public void setItemUICategory(ItemUICategory ItemUICategory) {
//            this.ItemUICategory = ItemUICategory;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public ClassJobCategory getClassJobCategory() {
//            return ClassJobCategory_A;
//        }
//
//        public void setClassJobCategory(ClassJobCategory ClassJobCategory_A) {
//            this.ClassJobCategory_A = ClassJobCategory_A;
//        }
//    }
//
//    public static class ItemUICategory {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class ClassJobCategory {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class OffHand {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//
//    public static class Necklace {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//
//    public static class MainHand {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//
//    public static class Legs {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//        @JsonProperty("Dye")
//        private Dye Dye;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//
//        public Dye getDye() {
//            return Dye;
//        }
//
//        public void setDye(Dye Dye_A) {
//            this.Dye = Dye_A;
//        }
//    }
//
//
//    public static class Dye {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class Hands {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//        @JsonProperty("Dye")
//        private Dye Dye;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//
//        public Dye getDye() {
//            return Dye;
//        }
//
//        public void setDye(Dye Dye_A) {
//            this.Dye = Dye_A;
//        }
//    }
//
////    public static class Dye_A {
////        @JsonProperty("Name")
////        private String Name;
////        @JsonProperty("Icon")
////        private String Icon;
////        @JsonProperty("ID")
////        private int ID;
////
////        public String getName() {
////            return Name;
////        }
////
////        public void setName(String Name) {
////            this.Name = Name;
////        }
////
////        public String getIcon() {
////            return Icon;
////        }
////
////        public void setIcon(String Icon) {
////            this.Icon = Icon;
////        }
////
////        public int getID() {
////            return ID;
////        }
////
////        public void setID(int ID) {
////            this.ID = ID;
////        }
////    }
//
//    public static class Feet {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//        @JsonProperty("Dye")
//        private Dye Dye;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//
//        public Dye getDye() {
//            return Dye;
//        }
//
//        public void setDye(Dye Dye_A) {
//            this.Dye = Dye_A;
//        }
//    }
//
//
//    public static class Earrings {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//
//    public static class Bracelets {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//
//    public static class Body {
//        @JsonProperty("Materia")
//        private List<String> Materia;
//        @JsonProperty("Item")
//        private Item Item;
//
//        public List<String> getMateria() {
//            return Materia;
//        }
//
//        public void setMateria(List<String> Materia) {
//            this.Materia = Materia;
//        }
//
//        public Item getItem() {
//            return Item;
//        }
//
//        public void setItem(Item Item) {
//            this.Item = Item;
//        }
//    }
//
//    public static class Class {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("Abbreviation")
//        private String Abbreviation;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public String getAbbreviation() {
//            return Abbreviation;
//        }
//
//        public void setAbbreviation(String Abbreviation) {
//            this.Abbreviation = Abbreviation;
//        }
//    }
//
////    public static class Attributes {
////        @JsonProperty("Value")
////        private int Value;
////        @JsonProperty("Attribute")
////        private Attribute Attribute;
////
////        public int getValue() {
////            return Value;
////        }
////
////        public void setValue(int Value) {
////            this.Value = Value;
////        }
////
////        public Attribute getAttribute() {
////            return Attribute;
////        }
////
////        public void setAttribute(Attribute Attribute) {
////            this.Attribute = Attribute;
////        }
////    }
////
////    public static class Attribute {
////        @JsonProperty("Name")
////        private String Name;
////        @JsonProperty("ID")
////        private int ID;
////
////        public String getName() {
////            return Name;
////        }
////
////        public void setName(String Name) {
////            this.Name = Name;
////        }
////
////        public int getID() {
////            return ID;
////        }
////
////        public void setID(int ID) {
////            this.ID = ID;
////        }
////    }
//
//    public static class ClassJobsElemental {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Level")
//        private int Level;
//        @JsonProperty("ExpLevelTogo")
//        private int ExpLevelTogo;
//        @JsonProperty("ExpLevelMax")
//        private int ExpLevelMax;
//        @JsonProperty("ExpLevel")
//        private int ExpLevel;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getLevel() {
//            return Level;
//        }
//
//        public void setLevel(int Level) {
//            this.Level = Level;
//        }
//
//        public int getExpLevelTogo() {
//            return ExpLevelTogo;
//        }
//
//        public void setExpLevelTogo(int ExpLevelTogo) {
//            this.ExpLevelTogo = ExpLevelTogo;
//        }
//
//        public int getExpLevelMax() {
//            return ExpLevelMax;
//        }
//
//        public void setExpLevelMax(int ExpLevelMax) {
//            this.ExpLevelMax = ExpLevelMax;
//        }
//
//        public int getExpLevel() {
//            return ExpLevel;
//        }
//
//        public void setExpLevel(int ExpLevel) {
//            this.ExpLevel = ExpLevel;
//        }
//    }
//
//    public static class ClassJobsBozjan {
//        @JsonProperty("Name")
//        private String Name;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//    }
//
//    public static class ClassJobs {
//        @JsonProperty("UnlockedState")
//        private UnlockedState_B UnlockedState_B;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Level")
//        private int Level;
//        @JsonProperty("Job")
//        private Job_B Job_B;
//        @JsonProperty("IsSpecialised")
//        private boolean IsSpecialised;
//        @JsonProperty("ExpLevelTogo")
//        private int ExpLevelTogo;
//        @JsonProperty("ExpLevelMax")
//        private int ExpLevelMax;
//        @JsonProperty("ExpLevel")
//        private int ExpLevel;
//        @JsonProperty("Class")
//        private Class_B Class_B;
//
//        public UnlockedState_B getUnlockedState() {
//            return UnlockedState_B;
//        }
//
//        public void setUnlockedState(UnlockedState_B UnlockedState_B) {
//            this.UnlockedState_B = UnlockedState_B;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getLevel() {
//            return Level;
//        }
//
//        public void setLevel(int Level) {
//            this.Level = Level;
//        }
//
//        public Job_B getJob() {
//            return Job_B;
//        }
//
//        public void setJob(Job_B Job_B) {
//            this.Job_B = Job_B;
//        }
//
//        public boolean getIsSpecialised() {
//            return IsSpecialised;
//        }
//
//        public void setIsSpecialised(boolean IsSpecialised) {
//            this.IsSpecialised = IsSpecialised;
//        }
//
//        public int getExpLevelTogo() {
//            return ExpLevelTogo;
//        }
//
//        public void setExpLevelTogo(int ExpLevelTogo) {
//            this.ExpLevelTogo = ExpLevelTogo;
//        }
//
//        public int getExpLevelMax() {
//            return ExpLevelMax;
//        }
//
//        public void setExpLevelMax(int ExpLevelMax) {
//            this.ExpLevelMax = ExpLevelMax;
//        }
//
//        public int getExpLevel() {
//            return ExpLevel;
//        }
//
//        public void setExpLevel(int ExpLevel) {
//            this.ExpLevel = ExpLevel;
//        }
//
//        public Class_B getClass_B() {
//            return Class_B;
//        }
//
//        public void setClass(Class_B Class_B) {
//            this.Class_B = Class_B;
//        }
//    }
//
//    public static class UnlockedState {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//
//    public static class Class_B {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("ClassJobCategory")
//        private ClassJobCategory ClassJobCategory_A;
//        @JsonProperty("Abbreviation")
//        private String Abbreviation;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public ClassJobCategory getClassJobCategory() {
//            return ClassJobCategory_A;
//        }
//
//        public void setClassJobCategory(ClassJobCategory ClassJobCategory_A) {
//            this.ClassJobCategory_A = ClassJobCategory_A;
//        }
//
//        public String getAbbreviation() {
//            return Abbreviation;
//        }
//
//        public void setAbbreviation(String Abbreviation) {
//            this.Abbreviation = Abbreviation;
//        }
//    }
//
//
//    public static class ActiveClassJob {
//        @JsonProperty("UnlockedState")
//        private UnlockedState_B UnlockedState_B;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Level")
//        private int Level;
//        @JsonProperty("Job")
//        private Job_B Job_B;
//        @JsonProperty("IsSpecialised")
//        private boolean IsSpecialised;
//        @JsonProperty("ExpLevelTogo")
//        private int ExpLevelTogo;
//        @JsonProperty("ExpLevelMax")
//        private int ExpLevelMax;
//        @JsonProperty("ExpLevel")
//        private int ExpLevel;
//        @JsonProperty("Class")
//        private Class_B Class_B;
//
//        public UnlockedState_B getUnlockedState() {
//            return UnlockedState_B;
//        }
//
//        public void setUnlockedState(UnlockedState_B UnlockedState_B) {
//            this.UnlockedState_B = UnlockedState_B;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getLevel() {
//            return Level;
//        }
//
//        public void setLevel(int Level) {
//            this.Level = Level;
//        }
//
//        public Job_B getJob() {
//            return Job_B;
//        }
//
//        public void setJob(Job_B Job_B) {
//            this.Job_B = Job_B;
//        }
//
//        public boolean getIsSpecialised() {
//            return IsSpecialised;
//        }
//
//        public void setIsSpecialised(boolean IsSpecialised) {
//            this.IsSpecialised = IsSpecialised;
//        }
//
//        public int getExpLevelTogo() {
//            return ExpLevelTogo;
//        }
//
//        public void setExpLevelTogo(int ExpLevelTogo) {
//            this.ExpLevelTogo = ExpLevelTogo;
//        }
//
//        public int getExpLevelMax() {
//            return ExpLevelMax;
//        }
//
//        public void setExpLevelMax(int ExpLevelMax) {
//            this.ExpLevelMax = ExpLevelMax;
//        }
//
//        public int getExpLevel() {
//            return ExpLevel;
//        }
//
//        public void setExpLevel(int ExpLevel) {
//            this.ExpLevel = ExpLevel;
//        }
//
//        public Class_B getClass_B() {
//            return Class_B;
//        }
//
//        public void setClass(Class_B Class_B) {
//            this.Class_B = Class_B;
//        }
//    }
//
//    public static class UnlockedState_B {
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("ID")
//        private int ID;
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//    }
//
//    public static class Job_B {
//        @JsonProperty("Url")
//        private String Url;
//        @JsonProperty("Name")
//        private String Name;
//        @JsonProperty("Icon")
//        private String Icon;
//        @JsonProperty("ID")
//        private int ID;
//        @JsonProperty("Abbreviation")
//        private String Abbreviation;
//
//        public String getUrl() {
//            return Url;
//        }
//
//        public void setUrl(String Url) {
//            this.Url = Url;
//        }
//
//        public String getName() {
//            return Name;
//        }
//
//        public void setName(String Name) {
//            this.Name = Name;
//        }
//
//        public String getIcon() {
//            return Icon;
//        }
//
//        public void setIcon(String Icon) {
//            this.Icon = Icon;
//        }
//
//        public int getID() {
//            return ID;
//        }
//
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//
//        public String getAbbreviation() {
//            return Abbreviation;
//        }
//
//        public void setAbbreviation(String Abbreviation) {
//            this.Abbreviation = Abbreviation;
//        }
//    }
//
//
//}
