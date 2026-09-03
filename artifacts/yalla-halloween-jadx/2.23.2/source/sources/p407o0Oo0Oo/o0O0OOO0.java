package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import org.jetbrains.annotations.NotNull;
import p110o000ooo0.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O0OOO0 {

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
    o000O000 OooO0Oo(int i, long j);
}
