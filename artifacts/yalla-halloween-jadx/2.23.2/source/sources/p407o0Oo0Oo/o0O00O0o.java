package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.ReadPostTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0O00O0o {
    @Insert(onConflict = 1)
    void OooO00o(@NotNull ReadPostTable readPostTable);

    @Query("Select * from ReadPostTable Where cid = :cid and userId = :userId")
    @Nullable
    ReadPostTable OooO0O0(long j, long j2);
}
