package o00O0OO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface OooO {
    @Insert(onConflict = 1)
    void OooO00o(@NotNull OooO0o oooO0o);

    @Query("SELECT long_value FROM Preference where `key`=:key")
    @Nullable
    Long OooO0O0(@NotNull String str);
}
