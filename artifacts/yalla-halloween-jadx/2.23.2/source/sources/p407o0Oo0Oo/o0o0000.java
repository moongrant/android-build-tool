package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0o0000 {
    @Query("Delete from UserInfoTable Where userId = :userId")
    void OooO00o(long j);

    @Query("Select * from UserInfoTable Where userId = :userId limit 1")
    @Nullable
    UserInfo OooO0O0(long j);

    @Insert(onConflict = 1)
    void OooO0OO(@NotNull UserInfoModel userInfoModel);

    @Insert(onConflict = 1)
    void OooO0Oo(@NotNull List<? extends UserInfo> list);
}
