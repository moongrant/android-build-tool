package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p089o000o000.o00O00o0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o000000 {

    public static final class OooO00o {
        public static /* synthetic */ List OooO00o(o000000 o000000Var, long j, long j2, int i, Object obj) {
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            return o000000Var.OooO0o0(j, value == null ? 0L : value.longValue());
        }
    }

    @Query("select count() from YallaTeamMessageTable where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("update YallaTeamMessageTable set isRead = 1 where uid = :uid and isRead = 0")
    void OooO0O0(long j);

    @Query("delete from YallaTeamMessageTable where uid = :uid")
    void OooO0OO(long j);

    @Query("select count() from YallaTeamMessageTable where uid = :uid ")
    @NotNull
    Flow<Integer> OooO0Oo(long j);

    @Insert(onConflict = 1)
    void OooO0o(@NotNull YallaTeamMessage yallaTeamMessage);

    @Query("select * from YallaTeamMessageTable where uid = :uid and surveyMessageId=:messageId")
    @NotNull
    List<YallaTeamMessage> OooO0o0(long j, long j2);

    @Query("select * from YallaTeamMessageTable where uid = :uid order by time desc limit 1")
    @NotNull
    Flow<YallaTeamMessage> OooO0oO(long j);

    @Query("select * from YallaTeamMessageTable where uid = :uid order by time desc")
    @NotNull
    o00O00o0<Integer, YallaTeamMessage> OooO0oo(long j);
}
