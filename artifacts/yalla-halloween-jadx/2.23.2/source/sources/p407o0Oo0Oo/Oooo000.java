package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.ChatMessage;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface Oooo000 {
    @Query("Delete from ChatMessageTable Where uid = :uid ")
    void OooO(long j);

    @Query("Delete from ChatMessageTable Where uid = :uid and targetId = :targetId")
    void OooO0OO(long j, long j2);

    @Query("Update ChatMessageTable SET sendState = -1 Where uid = :uid and sendState = 0")
    void OooO0Oo(long j);

    @Query("Select * from ChatMessageTable Where uid = :uid and mid = :mid limit 1")
    @Nullable
    ChatMessage OooO0o(long j, @Nullable String str);

    @Query("Update ChatMessageTable SET sendState = :sendState WHERE mid = :mid")
    void OooO0o0(int i, @NotNull String str);

    @Query("Update ChatMessageTable SET voiceUrl = :voiceUrl WHERE mid = :mid")
    void OooO0oO(@NotNull String str, @NotNull String str2);

    @Insert(onConflict = 1)
    void OooO0oo(@Nullable ChatMessage chatMessage);

    @Query("Update ChatMessageTable SET themeState = :themeState Where mid = :mid ")
    void OooOO0(int i, @NotNull String str);

    @Query("Update ChatMessageTable SET eventDeleted = :isDeleted Where mid = :mid ")
    void OooOO0O(@NotNull String str, boolean z);

    @Query("Select * from ChatMessageTable Where uid=:uid and targetId=:targetId Order by time DESC")
    @NotNull
    o00O0O OooOO0o(long j, long j2);

    @Query("Update ChatMessageTable SET momentImage = :momentImage, momentText = :momentText, momentMsg = :momentMsg, momentType = :momentType WHERE mid = :mid and momentId = :momentId")
    void OooOOO(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i);

    @Query("Update ChatMessageTable SET isVoiceRead =:isRead  WHERE mid = :mid")
    void OooOOO0(@NotNull String str);

    @Query("Select * from ChatMessageTable Where uid=:uid and mid=:mid")
    @NotNull
    ChatMessage OooOOOO(long j, @NotNull String str);

    @Query("Select * from ChatMessageTable Where uid=:uid and unknownMessage!=null ")
    @NotNull
    ArrayList OooOOOo(long j);

    @Query("Update ChatMessageTable SET voiceFileName = :fileName WHERE mid = :mid")
    void OooOOo(@NotNull String str, @NotNull String str2);

    @Query("Delete from ChatMessageTable Where uid = :uid and targetId = :targetId and contentType = :contentType")
    void OooOOo0(long j, long j2);
}
