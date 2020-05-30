package in.apssdc.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {
    @Insert
    void  insetData(StudentEnity studentEnity);
    @Query("select * from sudentEntity")
    List<StudentEnity>getAll();
}
