package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.SquareEventRoom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0OOO0o {
    @Insert(entity = SquareEventRoom.class, onConflict = 1)
    void OooO00o(@NotNull SquareEventRoom squareEventRoom);

    @Query("Select * from SquareEventRoomTable Where uid = :userId and targetId=:targetId and roomId=:roomId")
    @Nullable
    SquareEventRoom OooO0O0(long j, long j2, long j3);

    @Query("UPDATE SquareEventRoomTable SET eventCreateTime = :eventCreateTime WHERE uid = :userId and targetId=:targetId and roomId=:roomId")
    void OooO0OO(long j, long j2, long j3, long j4);
}
