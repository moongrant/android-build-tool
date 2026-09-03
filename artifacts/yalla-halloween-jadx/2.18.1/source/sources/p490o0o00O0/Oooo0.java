package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.FriendInfo;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface Oooo0 {
    @Insert(onConflict = 1)
    void OooO(@NotNull List<? extends Friend> list);

    @Query("Select memoName from FriendTable where uid = :userId and friendId = :friendId")
    @NotNull
    Flow<String> OooO00o(long j, long j2);

    @Query("Select memoName from FriendTable where uid = :userId and friendId = :friendId")
    @Nullable
    String OooO0O0(long j, long j2);

    @Query("Update FriendTable set inRoom = 0 Where uid = :uid")
    void OooO0OO(long j);

    @Query("Select * from FriendTable Where uid = :uid and friendId = :friendId order by time")
    @Nullable
    Friend OooO0Oo(long j, long j2);

    @Insert(onConflict = 1)
    void OooO0o(@NotNull Friend friend);

    @Query("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = :uid Order by FriendTable.inRoom DESC, FriendTable.time DESC")
    @NotNull
    o00O00o0<Integer, FriendInfo> OooO0o0(long j);

    @Query("Delete from FriendTable Where uid = :uid and deleteMark = 1")
    void OooO0oO(long j);

    @Query("Update FriendTable set inRoom = :inRoom Where uid = :uid and friendId = :friendId")
    void OooO0oo(long j, long j2, boolean z);

    @Query("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = :uid and (FriendTable.memoName like '%' || :searchText || '%' or UserInfoTable.userName like '%' || :searchText || '%' or UserInfoTable.userIdx like '%' || :searchText || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC")
    @NotNull
    List<FriendInfo> OooOO0(long j, @NotNull String str);

    @Query("Select count() from FriendTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooOO0O(long j);

    @Query("Select * from FriendTable Where uid = :uid order by time Desc")
    @Nullable
    Friend OooOO0o(long j);

    @Query("Delete from FriendTable Where uid = :uid and friendId = :friendId")
    void OooOOO(long j, long j2);

    @Query("Update FriendTable SET isCheckUserRisk = :isCheckUserRisk Where uid = :uid and friendId = :friendId")
    void OooOOO0(long j, long j2, boolean z);

    @Query("Update FriendTable set deleteMark = 1 Where uid = :uid")
    void OooOOOO(long j);

    @Query("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = :uid and (FriendTable.memoName like '%' || :searchText || '%' or UserInfoTable.userName like '%' || :searchText || '%' or UserInfoTable.userIdx like '%' || :searchText || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC")
    @NotNull
    o00O00o0<Integer, FriendInfo> OooOOOo(long j, @NotNull String str);

    @Query("Select * from FriendTable Where uid = :uid and friendId = :friendId order by time")
    @NotNull
    Flow<Friend> OooOOo(long j, long j2);

    @Query("Update FriendTable set memoName = :memo Where uid = :uid and friendId = :friendId")
    void OooOOo0(long j, long j2, @NotNull String str);
}
