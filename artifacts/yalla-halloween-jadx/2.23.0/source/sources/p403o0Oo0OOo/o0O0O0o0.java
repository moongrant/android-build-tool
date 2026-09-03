package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O0O0o0 {
    @Query("Select * from FriendRequestMessageTable Where uid = :uid and targetUserId = :targetUserId")
    @NotNull
    Flow<FriendRequestMessage> OooO(long j, long j2);

    @Query("Select count() from FriendRequestMessageTable Where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("Select count() from FriendRequestMessageTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooO0O0(long j);

    @Query("delete from FriendRequestMessageTable Where uid = :uid and targetUserId = :targetUserId")
    void OooO0OO(long j, long j2);

    @Query("update FriendRequestMessageTable set isRead = 1 where uid = :uid and isRead = 0 ")
    void OooO0Oo(long j);

    @Query("update FriendRequestMessageTable set state = 2 Where uid = :uid and targetUserId = :targetUserId and state = 0")
    void OooO0o(long j, long j2);

    @Query("delete from FriendRequestMessageTable Where uid = :uid")
    void OooO0o0(long j);

    @Query("Select * from FriendRequestMessageTable Where uid = :uid Order by state == 0 Desc, time DESC")
    @NotNull
    o0oOo0O0 OooO0oO(long j);

    @Query("Select * from FriendRequestMessageTable Where uid = :uid and mid = :mid")
    @Nullable
    FriendRequestMessage OooO0oo(long j, @NotNull String str);

    @Insert(onConflict = 1)
    void OooOO0(@NotNull FriendRequestMessage friendRequestMessage);

    @Query("update FriendRequestMessageTable set state = :state Where uid = :uid and targetUserId = :targetUserId")
    void OooOO0O(int i, long j, long j2);
}
