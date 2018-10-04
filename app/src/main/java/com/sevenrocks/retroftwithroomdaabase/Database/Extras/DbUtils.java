package com.sevenrocks.retroftwithroomdaabase.Database.Extras;

import com.sevenrocks.retroftwithroomdaabase.Database.AppDatabase;
import com.sevenrocks.retroftwithroomdaabase.Database.Tables.Detail;
import java.util.List;


public class DbUtils {

   private   Thread dbThread;

   DbUtilsCallBack dataUtilsCallBack;

    public DbUtils(DbUtilsCallBack dataUtilsCallBack) {
        this.dataUtilsCallBack = dataUtilsCallBack;
    }

    public void insertData(List<Detail> details) {

        dbThread = new Thread(new DBThread(details));
        dbThread.start();
    }

   private class DBThread implements Runnable {

        List<Detail> details;

        public DBThread(List<Detail> details) {
            this.details=details;
           }

        @Override
        public void run() {
            try {
            if(details !=null)
                insertDetailsData(details);
            } catch (Exception e) {
                dbThread.interrupt();
                dataUtilsCallBack.onInsertFailed(e.toString());
                e.printStackTrace();
            }

        }

    }
    private void insertDetailsData(List<Detail> details) {
        Daos.detailDao.truncate();

        for(int i=0;i<details.size();i++){
            Daos.detailDao.insert(details.get(i));
        }
        dataUtilsCallBack.onInsertComplete();

    }

}
