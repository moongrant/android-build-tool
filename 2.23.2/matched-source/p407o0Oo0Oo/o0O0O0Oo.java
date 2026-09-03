package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomTheme;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O0O0Oo {
    @Insert(onConflict = 1)
    void OooO00o(RoomTheme roomTheme);

    @Query("Select * from RoomTheme Where roomId = :roomId")
    RoomTheme OooO0O0(long j);
}
