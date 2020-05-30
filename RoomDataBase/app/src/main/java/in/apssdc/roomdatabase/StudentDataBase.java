package in.apssdc.roomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {StudentEnity.class},version = 1,exportSchema =true)
public abstract class StudentDataBase extends RoomDatabase {
    public abstract StudentDAO studentDAO();
}
