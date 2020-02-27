package com.example.csproject.db;

import android.provider.BaseColumns;

public final class  GameContract {

    public static abstract class Player implements BaseColumns
    {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
