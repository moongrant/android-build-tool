package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.SystemMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0OO00O {
    @Query("Select count() from SystemMessageTable Where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("Select * from SystemMessageTable Where uid=:uid Order by time DESC")
    @NotNull
    o00O00o0<Integer, SystemMessage> OooO0O0(@Nullable Long l);

    @Query("Update SystemMessageTable set isRead = 1 where uid=:uid and isRead = 0")
    void OooO0OO(long j);

    @Query("Select * from SystemMessageTable Where uid=:uid Order by time DESC limit 1")
    @NotNull
    Flow<SystemMessage> OooO0Oo(long j);

    @Query("Delete from SystemMessageTable Where uid = :uid")
    void OooO0o(@Nullable Long l);

    @Query("Select * from SystemMessageTable Where uid=:uid and mid=:mid")
    @Nullable
    SystemMessage OooO0o0(@Nullable Long l, @Nullable String str);

    @Insert(onConflict = 5)
    void OooO0oO(@Nullable SystemMessage systemMessage);
}
