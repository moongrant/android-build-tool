package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import o000O0O0.o0O0O00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oO00Oo0 {

    public static final class OooO00o {
    }

    @Insert(onConflict = 1)
    void OooO00o(@NotNull SearchHistoryTable searchHistoryTable);

    @Query("DELETE from SearchHistoryTable Where time in(SELECT time FROM SearchHistoryTable Where uid = :uid and type =:type ORDER BY time desc limit :start,:limit)")
    void OooO0O0(long j, int i, int i2, int i3);

    @Query("Delete from SearchHistoryTable Where uid = :uid and type =:type")
    void OooO0OO(int i, long j);

    @Query("Select * from SearchHistoryTable Where uid = :uid and type = :type Order by time DESC")
    @NotNull
    o0O0O00 OooO0Oo(int i, long j);
}
