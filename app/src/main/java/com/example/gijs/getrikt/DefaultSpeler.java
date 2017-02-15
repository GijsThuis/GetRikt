/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gijs.getrikt;

import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 * @author Gijs
 */
public class DefaultSpeler extends Speler implements Parcelable{
    
    DefaultSpeler(String spelersnaam){
        setNaam(spelersnaam);
    }

    @Override
    public void veranderNaam(String newNaam){
        setNaam(newNaam);
    }
    
    @Override
    public void veranderScore(int verandering){
        setScore(getScore()+verandering);
    }
    
    @Override
    public void veranderOverallScore(int verandering){
        setOverallScore(getOverallScore() + verandering);
    }

    protected DefaultSpeler(Parcel in) {

    }

    public static final Creator<DefaultSpeler> CREATOR = new Creator<DefaultSpeler>() {
        @Override
        public DefaultSpeler createFromParcel(Parcel in) {
            return new DefaultSpeler(in);
        }

        @Override
        public DefaultSpeler[] newArray(int size) {
            return new DefaultSpeler[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(super.getNaam());
    }
}
