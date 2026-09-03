package p517o0o0O00O;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0000O0 {

    public static final class OooO00o {
    }

    @Query("Select * from SearchHistoryTable Where uid = :uid and type = :type Order by time DESC")
    @NotNull
    LiveData<List<SearchHistoryTable>> OooO00o(long j, int i);

    @Insert(onConflict = 1)
    void OooO0O0(@NotNull SearchHistoryTable searchHistoryTable);

    @Query("Delete from SearchHistoryTable Where uid = :uid and type =:type")
    void OooO0OO(long j, int i);

    @Query("DELETE from SearchHistoryTable Where time in(SELECT time FROM SearchHistoryTable Where uid = :uid and type =:type ORDER BY time desc limit :start,:limit)")
    void OooO0Oo(long j, int i, int i2, int i3);
}
