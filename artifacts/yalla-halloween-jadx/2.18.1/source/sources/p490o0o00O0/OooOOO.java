package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.ChatMessage;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface OooOOO {
    @Query("Update ChatMessageTable SET voiceUrl = :voiceUrl WHERE mid = :mid")
    void OooO(@NotNull String str, @NotNull String str2);

    @Query("Update ChatMessageTable SET sendState = :sendState WHERE mid = :mid")
    void OooO0O0(@NotNull String str, int i);

    @Query("Update ChatMessageTable SET sendState = -1 Where uid = :uid and sendState = 0")
    void OooO0o(long j);

    @Query("Delete from ChatMessageTable Where uid = :uid and targetId = :targetId")
    void OooO0o0(long j, long j2);

    @Query("Update ChatMessageTable SET isVoiceRead =:isRead  WHERE mid = :mid")
    void OooO0oO(@NotNull String str);

    @Query("Select * from ChatMessageTable Where uid = :uid and mid = :mid limit 1")
    @Nullable
    ChatMessage OooO0oo(long j, @Nullable String str);

    @Insert(onConflict = 1)
    void OooOO0(@Nullable ChatMessage chatMessage);

    @Query("Delete from ChatMessageTable Where uid = :uid ")
    void OooOO0O(long j);

    @Query("Update ChatMessageTable SET themeState = :themeState Where mid = :mid ")
    void OooOO0o(@NotNull String str, int i);

    @Query("Update ChatMessageTable SET momentImage = :momentImage, momentText = :momentText, momentMsg = :momentMsg, momentType = :momentType WHERE mid = :mid and momentId = :momentId")
    void OooOOO(@NotNull String str, long j, @NotNull String str2, @NotNull String str3);

    @Query("Select * from ChatMessageTable Where uid=:uid and unknownMessage!=null ")
    @Nullable
    Object OooOOO0(long j, @NotNull Continuation<? super List<ChatMessage>> continuation);

    @Query("Delete from ChatMessageTable Where uid = :uid and targetId = :targetId and contentType = :contentType")
    void OooOOOO(long j, long j2);

    @Query("Update ChatMessageTable SET voiceFileName = :fileName WHERE mid = :mid")
    void OooOOOo(@NotNull String str, @NotNull String str2);

    @Query("Select * from ChatMessageTable Where uid=:uid and targetId=:targetId Order by time DESC")
    @NotNull
    o00O00o0<Integer, ChatMessage> OooOOo(long j, long j2);

    @Query("Update ChatMessageTable SET eventDeleted = :isDeleted Where mid = :mid ")
    void OooOOo0(@NotNull String str, boolean z);
}
