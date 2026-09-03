package o00O0OO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface Oooo0 {
    @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    @NotNull
    ArrayList OooO00o(@NotNull String str);

    @Insert(onConflict = 5)
    void OooO0O0(@NotNull Oooo000 oooo000);
}
