package com.sevenrocks.retroftwithroomdaabase.Database.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.sevenrocks.retroftwithroomdaabase.Database.Tables.Detail;

import java.util.List;

/**
 * Created by localadmin on 4/2/2018.
 */
@Dao
public interface DetailDao {

    @Insert
    public void insert(Detail... instance);

    @Update
    public void update(Detail... instance);

    @Delete
    public void delete(Detail instance);

    @Query("select * from `detail`")
    public List<Detail> getAll();

    @Query("delete  from `detail`")
    public void truncate();

    @Query("Select noofdays from detail where tableid=:id")
    public String getNameById(String id);

}
