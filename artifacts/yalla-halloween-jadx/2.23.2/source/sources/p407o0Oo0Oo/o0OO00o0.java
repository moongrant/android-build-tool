package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0OO00o0 {
    @Insert(entity = SquareEventRoom.class, onConflict = 1)
    void OooO00o(@NotNull SquareEventRoom squareEventRoom);

    @Query("UPDATE SquareEventRoomTable SET eventCreateTime = :eventCreateTime WHERE uid = :userId and targetId=:targetId and roomId=:roomId")
    void OooO0O0(long j, long j2, long j3, long j4);

    @Query("Select * from SquareEventRoomTable Where uid = :userId and targetId=:targetId and roomId=:roomId")
    @Nullable
    SquareEventRoom OooO0OO(long j, long j2, long j3);
}
