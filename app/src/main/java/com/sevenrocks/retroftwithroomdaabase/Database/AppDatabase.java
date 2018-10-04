package com.sevenrocks.retroftwithroomdaabase.Database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.util.Log;

import com.sevenrocks.retroftwithroomdaabase.Database.Daos.DetailDao;
import com.sevenrocks.retroftwithroomdaabase.Database.Tables.Detail;


@Database(entities = {
        Detail.class,
        }
        , version = 26
        , exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    //Task Daos
    public abstract DetailDao getDetailDao();


    private static SupportSQLiteDatabase supportSQLiteDatabase;
    private static AppDatabase INSTANCE;

    public synchronized static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
            Log.v("buildDatabase","in"+INSTANCE);
        }
        return INSTANCE;
    }

    private static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context,
                AppDatabase.class, "demo.sqlite")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .addCallback(new Callback() {
                    @Override
                    public void onOpen(@NonNull SupportSQLiteDatabase db) {
                        super.onOpen(db);
                        supportSQLiteDatabase =db;
                    }
                }).build();
    }

    public static AppDatabase getDB(){
        return INSTANCE;
    }

    private SupportSQLiteDatabase getSqliteDB(){
        return supportSQLiteDatabase;
    }

    public Cursor select(String query) {
        return getSqliteDB().query(query);
    }

    public Cursor execute(String query) {
        return getSqliteDB().query(query);
    }

}
