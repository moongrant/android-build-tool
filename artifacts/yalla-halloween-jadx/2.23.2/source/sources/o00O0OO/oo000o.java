package o00O0OO;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
@SuppressLint({"UnknownNullness"})
public interface oo000o {
    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    ArrayList OooO(@NotNull String str);

    @Query("DELETE FROM workspec WHERE id=:id")
    void OooO00o(@NotNull String str);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void OooO0O0(@NotNull String str);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int OooO0OO(long j, @NotNull String str);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    ArrayList OooO0Oo(long j);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    ArrayList OooO0o(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    ArrayList OooO0o0();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    WorkInfo$State OooO0oO(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    o00Ooo OooO0oo(@NotNull String str);

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int OooOO0();

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    ArrayList OooOO0O();

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    ArrayList OooOO0o(@NotNull String str);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int OooOOO(@NotNull WorkInfo$State workInfo$State, @NotNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    @NotNull
    ArrayList OooOOO0(int i);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void OooOOOO(@NotNull String str, @NotNull androidx.work.OooO0O0 oooO0O0);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void OooOOOo(long j, @NotNull String str);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean OooOOo();

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    ArrayList OooOOo0();

    @Insert(onConflict = 5)
    void OooOOoo(@NotNull o00Ooo o00ooo2);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int OooOo0(@NotNull String str);

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int OooOo00(@NotNull String str);
}
