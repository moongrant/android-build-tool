package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.MomentMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o00O0OOO {

    public static final class OooO00o {
    }

    @Query("Delete from MomentMessageTable Where uid =:uid and userId_MomentComment = :fromUserId and type =:type and momentId_MomentComment = :momentId and commentId_MomentComment = :commentId")
    int OooO(long j, long j2, @Nullable Long l, @Nullable Long l2);

    @Query("UPDATE MomentMessageTable SET isRead = 1 WHERE isRead = 0 and uid = :uid")
    void OooO00o(@Nullable Long l);

    @Query("Delete from MomentMessageTable Where uid =:uid and userId_CommentAt = :fromUserId and type =:type and momentId_CommentAt = :momentId and commentId_CommentAt = :commentId")
    int OooO0O0(long j, long j2, @Nullable Long l, @Nullable Long l2);

    @Query("delete from MomentMessageTable Where uid =:uid and (type <> :type1 and type <> :type2 and type <> :type3 and type <> :type4 and type <> :type5 and type <> :type6 and type <> :type7 )")
    int OooO0OO(@Nullable Long l);

    @Query("delete from MomentMessageTable Where uid =:uid and (type = :type1 or type = :type2 or type = :type3 or type = :type4 or type = :type5 or type = :type6 or type = :type7 )")
    int OooO0Oo(@Nullable Long l, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    @Query("Delete from MomentMessageTable Where uid =:uid and userId_MomentPraise = :fromUserId and type =:type and momentId_MomentPraise = :momentId")
    int OooO0o(long j, long j2, long j3);

    @Query("Select * from MomentMessageTable Where uid =:uid and (type = :type1 or type = :type2 or type = :type3 or type = :type4 or type = :type5 or type = :type6 or type = :type7 ) Order by time DESC")
    @NotNull
    oo0O OooO0o0(@Nullable Long l, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    @Query("Select * from MomentMessageTable Where mid = :mid")
    @Nullable
    MomentMessage OooO0oO(@NotNull String str);

    @Query("select count() from MomentMessageTable Where uid =:uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO0oo(@Nullable Long l);

    @Query("Delete from MomentMessageTable Where uid =:uid and userId_CommentReply = :fromUserId and type =:type and momentId_CommentReply = :momentId and commentId_CommentReply = :commentId")
    int OooOO0(long j, long j2, @Nullable Long l, @Nullable Long l2);

    @Query("Delete from MomentMessageTable Where mid =:mid and uid =:uid")
    int OooOO0O(@NotNull String str, @Nullable Long l);

    @Query("delete from MomentMessageTable Where uid =:uid ")
    int OooOO0o(@Nullable Long l);

    @Insert(onConflict = 1)
    long OooOOO(@Nullable MomentMessage momentMessage);

    @Query("Select * from MomentMessageTable Where uid =:uid and (type <> :type1 and type <> :type2 and type <> :type3 and type <> :type4 and type <> :type5 and type <> :type6 and type <> :type7 ) Order by time DESC")
    @NotNull
    o00OO OooOOO0(@Nullable Long l);

    @Query("Select * from MomentMessageTable Where uid =:uid Order by time DESC")
    @NotNull
    o00OO0OO OooOOOO(@Nullable Long l);
}
