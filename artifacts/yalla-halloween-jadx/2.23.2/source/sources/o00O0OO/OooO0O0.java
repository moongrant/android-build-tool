package o00O0OO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface OooO0O0 {
    @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    @NotNull
    ArrayList OooO00o(@NotNull String str);

    @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean OooO0O0(@NotNull String str);

    @Insert(onConflict = 5)
    void OooO0OO(@NotNull OooO00o oooO00o);

    @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean OooO0Oo(@NotNull String str);
}
