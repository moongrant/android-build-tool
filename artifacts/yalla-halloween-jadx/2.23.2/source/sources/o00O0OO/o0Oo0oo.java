package o00O0OO;

import androidx.room.Dao;
import androidx.room.Query;
import java.util.ArrayList;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0Oo0oo {
    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    ArrayList OooO00o(@NotNull String str);

    void OooO0O0(@NotNull String str, @NotNull Set<String> set);
}
