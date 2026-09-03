package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.UserInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0O0O00 {
    @Query("Delete from UserInfoTable Where userId = :userId")
    void OooO00o(long j);

    @Query("Select * from UserInfoTable Where userId = :userId limit 1")
    @Nullable
    UserInfo OooO0O0(long j);

    @Insert(onConflict = 1)
    void OooO0OO(@NotNull UserInfo userInfo);

    @Insert(onConflict = 1)
    void OooO0Oo(@NotNull List<? extends UserInfo> list);
}
