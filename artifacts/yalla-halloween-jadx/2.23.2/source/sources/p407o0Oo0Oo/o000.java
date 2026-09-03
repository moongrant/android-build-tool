package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.Friend;
import java.util.ArrayList;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o000 {
    @Query("Update FriendTable set deleteMark = 1 Where uid = :uid")
    void OooO(long j);

    @Query("Select memoName from FriendTable where uid = :userId and friendId = :friendId")
    @Nullable
    String OooO00o(long j, long j2);

    @Query("Update FriendTable set inRoom = 0 Where uid = :uid")
    void OooO0O0(long j);

    @Query("Select * from FriendTable Where uid = :uid and friendId = :friendId order by time")
    @Nullable
    Friend OooO0OO(long j, long j2);

    @Query("Delete from FriendTable Where uid = :uid and deleteMark = 1")
    void OooO0Oo(long j);

    @Query("Select count() from FriendTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooO0o(long j);

    @Query("Select memoName from FriendTable where uid = :userId and friendId = :friendId")
    @NotNull
    Flow<String> OooO0o0(long j, long j2);

    @Query("Select * from FriendTable Where uid = :uid order by time Desc")
    @Nullable
    Friend OooO0oO(long j);

    @Query("Update FriendTable SET isCheckUserRisk = :isCheckUserRisk Where uid = :uid and friendId = :friendId")
    void OooO0oo(long j, long j2, boolean z);

    @Query("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = :uid and (FriendTable.memoName like '%' || :searchText || '%' or UserInfoTable.userName like '%' || :searchText || '%' or UserInfoTable.userIdx like '%' || :searchText || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC")
    @NotNull
    o000Oo0 OooOO0(long j, @NotNull String str);

    @Insert(onConflict = 1)
    void OooOO0O(@NotNull ArrayList arrayList);

    @Insert(onConflict = 1)
    void OooOO0o(@NotNull Friend friend);

    @Query("Update FriendTable set inRoom = :inRoom Where uid = :uid and friendId = :friendId")
    void OooOOO(long j, long j2, boolean z);

    @Query("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = :uid Order by FriendTable.inRoom DESC, FriendTable.time DESC")
    @NotNull
    o000O0o OooOOO0(long j);

    @Query("Delete from FriendTable Where uid = :uid and friendId = :friendId")
    void OooOOOO(long j, long j2);

    @Query("Select * from FriendTable Where uid = :uid and friendId = :friendId order by time")
    @NotNull
    Flow<Friend> OooOOOo(long j, long j2);
}
