package com.example.csproject.db.Entities;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
// player entity in a database
@Entity
public class Players {

        @PrimaryKey
        public int uid;

        public String firstName;
        public String lastName;
        public int event;

        public String getFirstName() {
                return firstName;
        }

        public int getEvent(){return event;}

        public void setEvent(int event){this.event = event;}

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }


}

