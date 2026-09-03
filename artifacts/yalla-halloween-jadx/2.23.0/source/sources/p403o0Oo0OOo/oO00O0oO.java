package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomJoinHistory;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oO00O0oO {
    @Insert(onConflict = 1)
    void OooO00o(RoomJoinHistory roomJoinHistory);

    @Query("Select * from RoomJoinHistory Where repeat = :repeat")
    RoomJoinHistory OooO0O0(String str);
}
