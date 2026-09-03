package o00O0OO;

import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Query;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface o00O0O {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void OooO00o(@NotNull String str);

    @Query("DELETE FROM WorkProgress")
    void OooO0O0();
}
