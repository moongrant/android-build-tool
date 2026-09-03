package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0OOO0o {
    @Query("update FriendRequestMessageTable set state = :state Where uid = :uid and targetUserId = :targetUserId")
    void OooO(long j, long j2, int i);

    @Query("Select count() from FriendRequestMessageTable Where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("update FriendRequestMessageTable set isRead = 1 where uid = :uid and isRead = 0 ")
    void OooO0O0(long j);

    @Query("delete from FriendRequestMessageTable Where uid = :uid")
    void OooO0OO(long j);

    @Query("Select count() from FriendRequestMessageTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooO0Oo(long j);

    @Query("Select * from FriendRequestMessageTable Where uid = :uid Order by time DESC ")
    @NotNull
    o00O00o0<Integer, FriendRequestMessage> OooO0o(long j);

    @Query("delete from FriendRequestMessageTable Where uid = :uid and targetUserId = :targetUserId")
    void OooO0o0(long j, long j2);

    @Query("Select * from FriendRequestMessageTable Where uid = :uid and mid = :mid")
    @Nullable
    FriendRequestMessage OooO0oO(long j, @NotNull String str);

    @Insert(onConflict = 1)
    void OooO0oo(@NotNull FriendRequestMessage friendRequestMessage);
}
