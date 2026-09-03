package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomJoinHistory;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0000Ooo {
    @Insert(onConflict = 1)
    void OooO00o(RoomJoinHistory roomJoinHistory);

    @Query("Select * from RoomJoinHistory Where repeat = :repeat")
    RoomJoinHistory OooO0O0(String str);
}
