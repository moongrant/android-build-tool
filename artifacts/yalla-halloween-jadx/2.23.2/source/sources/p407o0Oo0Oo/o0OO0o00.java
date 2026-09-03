package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.SystemMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0OO0o00 {
    @Query("Select count() from SystemMessageTable Where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Insert(onConflict = 5)
    void OooO0O0(@Nullable SystemMessage systemMessage);

    @Query("Update SystemMessageTable set isRead = 1 where uid=:uid and isRead = 0")
    void OooO0OO(long j);

    @Query("Select * from SystemMessageTable Where uid=:uid Order by time DESC")
    @NotNull
    o0OOO00 OooO0Oo(@Nullable Long l);

    @Query("Select * from SystemMessageTable Where uid=:uid and mid=:mid")
    @Nullable
    SystemMessage OooO0o(@Nullable String str, @Nullable Long l);

    @Query("Select * from SystemMessageTable Where uid=:uid Order by time DESC limit 1")
    @NotNull
    Flow<SystemMessage> OooO0o0(long j);

    @Query("Delete from SystemMessageTable Where uid = :uid")
    void OooO0oO(@Nullable Long l);
}
