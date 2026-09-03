package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.common.db.table.FriendInfo;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface OooOo00 {
    @Query("Update  ChatMessageTable set emoticonIsRead =:emoticonHasRead where targetId = :targetId and uid=:uid and emoticonIsRead =:emoticonIsRead")
    void OooO(long j, long j2, boolean z, boolean z2);

    @Query("Select sum(unReadCount) from ConversationTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("Update ConversationTable set sendState = :sendState where mid = :mid")
    void OooO0O0(@NotNull String str, int i);

    @Query("Select topTime from ConversationTable where uid = :uid and targetId=:targetId")
    @Nullable
    Long OooO0OO(long j, long j2);

    @Query("Delete from ConversationTable where uid = :uid")
    void OooO0Oo(long j);

    @Query("Update ConversationTable Set sendState = -1 Where uid = :uid and sendState = 0")
    void OooO0o(long j);

    @Query("Delete from ConversationTable where uid = :uid and targetId=:targetId")
    void OooO0o0(long j, long j2);

    @Insert(onConflict = 1)
    void OooO0oO(@NotNull Conversation conversation);

    @Query("Select * from (FriendTable inner join UserInfoTable on FriendTable.friendId=UserInfoTable.userId)inner join ConversationTable on ConversationTable.targetId = FriendTable.friendId  Where FriendTable.uid = :uid and ConversationTable.uid = :uid Order by ConversationTable.topTime DESC, ConversationTable.time DESC")
    @NotNull
    o00O00o0<Integer, FriendInfo> OooO0oo(long j);

    @Query("Select count(*) from ConversationTable Where topTime > 0 and uid =:uid limit 5")
    int OooOO0(long j);

    @Query("Select * from ConversationTable  where targetId = :targetId and uid=:uid")
    @NotNull
    Flow<Conversation> OooOO0O(long j, long j2);

    @Query("Select unReadCount from ConversationTable Where uid = :uid and targetId=:targetId and unReadCount > 0")
    @Nullable
    Integer OooOO0o(long j, long j2);

    @Query("Update  ConversationTable set unReadCount=:count where targetId = :targetId and uid=:uid")
    void OooOOO(long j, long j2, int i);

    @Query("Update ConversationTable set topTime = :time where uid=:uid and targetId=:targetId")
    int OooOOO0(long j, long j2, long j3);

    @Query("Update  ConversationTable set draft=:draft where targetId = :targetId and uid=:uid")
    void OooOOOO(long j, long j2, @NotNull String str);

    @Query("Select * from ConversationTable left join UserInfoTable on UserInfoTable.userId = ConversationTable.targetId Where ConversationTable.uid = :uid Order by ConversationTable.topTime DESC, ConversationTable.time DESC")
    @NotNull
    o00O00o0<Integer, ConversationWithUser> OooOOOo(long j);

    @Query("Update  ConversationTable set isVoiceAndUnread=:isVoiceAndUnread where targetId = :targetId and uid=:uid and mid=:mid")
    void OooOOo0(long j, long j2, @NotNull String str, boolean z);
}
