package in.apssdc.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "sudentEntity")
public class StudentEnity {
    @PrimaryKey(autoGenerate = true)
    int id;
    String email,name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentEnity(String email, String name) {
        this.email = email;
        this.name = name;

    }
}
