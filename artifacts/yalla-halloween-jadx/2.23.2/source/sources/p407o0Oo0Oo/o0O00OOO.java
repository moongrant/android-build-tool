package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomHistory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O00OOO {
    @Query("Select * from RoomHistory Where uid = :uid Order by time DESC")
    ArrayList OooO00o(String str);

    @Query("Select * from RoomHistory Where uid = :uid Order by time DESC Limit 1")
    RoomHistory OooO0O0(String str);

    @Insert(onConflict = 1)
    void OooO0OO(RoomHistory roomHistory);

    @Delete
    void OooO0Oo(RoomHistory roomHistory);
}
