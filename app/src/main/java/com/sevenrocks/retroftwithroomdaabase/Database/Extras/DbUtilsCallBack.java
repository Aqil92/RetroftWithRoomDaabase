package com.sevenrocks.retroftwithroomdaabase.Database.Extras;

public interface DbUtilsCallBack {

    void onInsertComplete();
    void onInsertFailed(String msg);
}
