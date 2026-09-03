package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomJoinHistory;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O0O0O {
    @Insert(onConflict = 1)
    void OooO00o(RoomJoinHistory roomJoinHistory);

    @Query("Select * from RoomJoinHistory Where repeat = :repeat")
    RoomJoinHistory OooO0O0(String str);
}
