package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oO0oO000 {

    public static final class OooO00o {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List OooO00o(oO0oO000 oo0oo000, long j) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            return oo0oo000.OooO0o(j, l == null ? 0L : l.longValue());
        }
    }

    @Query("select count() from YallaTeamMessageTable where uid = :uid and isRead = 0")
    @NotNull
    Flow<Integer> OooO00o(long j);

    @Query("select count() from YallaTeamMessageTable where uid = :uid ")
    @NotNull
    Flow<Integer> OooO0O0(long j);

    @Query("select * from YallaTeamMessageTable where uid = :uid order by time desc limit 1")
    @NotNull
    Flow<YallaTeamMessage> OooO0OO(long j);

    @Query("update YallaTeamMessageTable set isRead = 1 where uid = :uid and isRead = 0")
    void OooO0Oo(long j);

    @Query("select * from YallaTeamMessageTable where uid = :uid and surveyMessageId=:messageId")
    @NotNull
    ArrayList OooO0o(long j, long j2);

    @Query("delete from YallaTeamMessageTable where uid = :uid")
    void OooO0o0(long j);

    @Insert(onConflict = 1)
    void OooO0oO(@NotNull YallaTeamMessage yallaTeamMessage);

    @Query("select * from YallaTeamMessageTable where uid = :uid order by time desc")
    @NotNull
    oOO000 OooO0oo(long j);
}
