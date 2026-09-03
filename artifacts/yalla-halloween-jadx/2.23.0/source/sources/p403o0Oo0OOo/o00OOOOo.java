package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.Conversation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o00OOOOo {
    @Query("Select * from ConversationTable left join UserInfoTable on UserInfoTable.userId = ConversationTable.targetId Where ConversationTable.uid = :uid Order by ConversationTable.topTime DESC, ConversationTable.time DESC")
    @NotNull
    o0O00o0 OooO(long j);

    @Query("Select sum(unReadCount) from ConversationTable Where uid = :uid")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("Select topTime from ConversationTable where uid = :uid and targetId=:targetId")
    @Nullable
    Long OooO0O0(long j, long j2);

    @Query("Delete from ConversationTable where uid = :uid")
    void OooO0OO(long j);

    @Query("Update ConversationTable Set sendState = -1 Where uid = :uid and sendState = 0")
    void OooO0Oo(long j);

    @Query("Delete from ConversationTable where uid = :uid and targetId=:targetId")
    void OooO0o(long j, long j2);

    @Query("Update ConversationTable set sendState = :sendState where mid = :mid")
    void OooO0o0(int i, @NotNull String str);

    @Query("Select count(*) from ConversationTable Where topTime > 0 and uid =:uid limit 5")
    int OooO0oO(long j);

    @Query("Select * from ConversationTable  where targetId = :targetId and uid=:uid")
    @NotNull
    Flow<Conversation> OooO0oo(long j, long j2);

    @Query("Update  ConversationTable set unReadCount=:count where targetId = :targetId and uid=:uid")
    void OooOO0(int i, long j, long j2);

    @Query("Update  ConversationTable set isVoiceAndUnread=:isVoiceAndUnread where targetId = :targetId and uid=:uid and mid=:mid")
    void OooOO0O(long j, long j2, @NotNull String str, boolean z);

    @Insert(onConflict = 1)
    void OooOO0o(@NotNull Conversation conversation);

    @Query("Update  ChatMessageTable set emoticonIsRead =:emoticonHasRead where targetId = :targetId and uid=:uid and emoticonIsRead =:emoticonIsRead")
    void OooOOO(long j, long j2, boolean z, boolean z2);

    @Query("Select * from (FriendTable inner join UserInfoTable on FriendTable.friendId=UserInfoTable.userId)inner join ConversationTable on ConversationTable.targetId = FriendTable.friendId  Where FriendTable.uid = :uid and ConversationTable.uid = :uid Order by ConversationTable.topTime DESC, ConversationTable.time DESC")
    @NotNull
    oo00oO OooOOO0(long j);

    @Query("Select unReadCount from ConversationTable Where uid = :uid and targetId=:targetId and unReadCount > 0")
    @Nullable
    Integer OooOOOO(long j, long j2);

    @Query("Update ConversationTable set topTime = :time where uid=:uid and targetId=:targetId")
    int OooOOOo(long j, long j2, long j3);

    @Query("Update  ConversationTable set draft=:draft where targetId = :targetId and uid=:uid")
    void OooOOo0(long j, long j2, @NotNull String str);
}
