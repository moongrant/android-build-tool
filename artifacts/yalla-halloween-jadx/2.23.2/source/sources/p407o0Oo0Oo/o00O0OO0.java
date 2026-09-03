package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.HideContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o00O0OO0 {
    @Insert(onConflict = 5)
    void OooO00o(@NotNull HideContent hideContent);

    @Query("Select * from HideContentTable Where userId = :userId and type = :type and contentId = :contentId")
    @Nullable
    HideContent OooO0O0(int i, long j, @NotNull String str);
}
