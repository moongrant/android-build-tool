package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomHistory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o00000O {
    @Query("Select * from RoomHistory Where uid = :uid Order by time DESC")
    List<RoomHistory> OooO00o(String str);

    @Insert(onConflict = 1)
    void OooO0O0(RoomHistory roomHistory);

    @Delete
    void OooO0OO(RoomHistory roomHistory);
}
