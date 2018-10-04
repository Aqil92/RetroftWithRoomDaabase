package com.sevenrocks.retroftwithroomdaabase.Database.Extras;

import com.sevenrocks.retroftwithroomdaabase.Database.AppDatabase;
import com.sevenrocks.retroftwithroomdaabase.Database.Daos.DetailDao;

public class Daos {

    public static DetailDao detailDao= AppDatabase.getDB().getDetailDao();
}
