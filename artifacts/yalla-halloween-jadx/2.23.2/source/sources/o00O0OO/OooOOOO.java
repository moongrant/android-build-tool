package o00O0OO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface OooOOOO {
    void OooO00o(@NotNull OooOo oooOo);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    ArrayList OooO0O0();

    @Nullable
    OooOOO OooO0OO(@NotNull OooOo oooOo);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void OooO0Oo(@NotNull String str);

    @Insert(onConflict = 1)
    void OooO0o0(@NotNull OooOOO oooOOO);
}
