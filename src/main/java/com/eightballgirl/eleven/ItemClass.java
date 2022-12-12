package com.eightballgirl.eleven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemClass {

    @JsonProperty("Plural_fr")
    private String Plural_fr;
    @JsonProperty("Plural_en")
    private String Plural_en;
    @JsonProperty("Plural_de")
    private String Plural_de;
    @JsonProperty("Plural")
    private String Plural;
    @JsonProperty("Name_ja")
    private String Name_ja;
    @JsonProperty("Name_fr")
    private String Name_fr;
    @JsonProperty("Name_en")
    private String Name_en;
    @JsonProperty("Name_de")
    private String Name_de;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("ItemSeries")
    private ItemSeries ItemSeries;

    public String getPlural_fr() {
        return Plural_fr;
    }

    public void setPlural_fr(String Plural_fr) {
        this.Plural_fr = Plural_fr;
    }

    public String getPlural_en() {
        return Plural_en;
    }

    public void setPlural_en(String Plural_en) {
        this.Plural_en = Plural_en;
    }

    public String getPlural_de() {
        return Plural_de;
    }

    public void setPlural_de(String Plural_de) {
        this.Plural_de = Plural_de;
    }

    public String getPlural() {
        return Plural;
    }

    public void setPlural(String Plural) {
        this.Plural = Plural;
    }

    public String getName_ja() {
        return Name_ja;
    }

    public void setName_ja(String Name_ja) {
        this.Name_ja = Name_ja;
    }

    public String getName_fr() {
        return Name_fr;
    }

    public void setName_fr(String Name_fr) {
        this.Name_fr = Name_fr;
    }

    public String getName_en() {
        return Name_en;
    }

    public void setName_en(String Name_en) {
        this.Name_en = Name_en;
    }

    public String getName_de() {
        return Name_de;
    }

    public void setName_de(String Name_de) {
        this.Name_de = Name_de;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ItemSeries getItemSeries() {
        return ItemSeries;
    }

    public void setItemSeries(ItemSeries ItemSeries) {
        this.ItemSeries = ItemSeries;
    }

    public static class ItemSeries {
        @JsonProperty("Name_ja")
        private String Name_ja;
        @JsonProperty("Name_fr")
        private String Name_fr;
        @JsonProperty("Name_en")
        private String Name_en;
        @JsonProperty("Name_de")
        private String Name_de;
        @JsonProperty("Name")
        private String Name;
        @JsonProperty("ID")
        private int ID;

        public String getName_ja() {
            return Name_ja;
        }

        public void setName_ja(String Name_ja) {
            this.Name_ja = Name_ja;
        }

        public String getName_fr() {
            return Name_fr;
        }

        public void setName_fr(String Name_fr) {
            this.Name_fr = Name_fr;
        }

        public String getName_en() {
            return Name_en;
        }

        public void setName_en(String Name_en) {
            this.Name_en = Name_en;
        }

        public String getName_de() {
            return Name_de;
        }

        public void setName_de(String Name_de) {
            this.Name_de = Name_de;
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
    }
}
