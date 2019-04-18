package com.example.intent;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    private String ten;
    private String tuoi;

    public Animal(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    protected Animal(Parcel in) {
        ten = in.readString();
        tuoi = in.readString();
    }
//    Rxandroid , Rxjava
    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ten);
        dest.writeString(tuoi);
    }
}
