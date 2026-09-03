package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.RoomTheme;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oO00OOOo {
    @Insert(onConflict = 1)
    void OooO00o(RoomTheme roomTheme);

    @Query("Select * from RoomTheme Where roomId = :roomId")
    RoomTheme OooO0O0(long j);
}
