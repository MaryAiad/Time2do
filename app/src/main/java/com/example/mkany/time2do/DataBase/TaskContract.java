package com.example.mkany.time2do.DataBase;

import android.provider.BaseColumns;

/**
 * Created by Mery on 7/25/2017.
 */

public class TaskContract {
    public static final String DB_NAME = "ToDo";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "lists";

        public static final String COL_TASK_TITLE = "title";
        public static final String COL_TASK_Priority = "priority";
        public static final String COL_TASK_isDone = "isdone";
    }
}
