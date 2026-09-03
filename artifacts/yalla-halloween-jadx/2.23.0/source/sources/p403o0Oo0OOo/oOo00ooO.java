package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.SimpleMessage;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oOo00ooO {
    @Query("Update SimpleMessageTable set visitorNum = :num Where uid = :uid and type = 3")
    void OooO(long j);

    @Query("Update SimpleMessageTable set fansNum = :num Where uid = :uid and type = 2")
    void OooO00o(long j);

    @Insert(onConflict = 1)
    void OooO0O0(@NotNull SimpleMessage simpleMessage);

    @Query("Select * from SimpleMessageTable Where uid = :uid and type = 1")
    @Nullable
    SimpleMessage OooO0OO(long j);

    @Query("Select * from SimpleMessageTable Where uid = :uid and type = 2")
    @Nullable
    SimpleMessage OooO0Oo(long j);

    @Query("Select visitorNum from SimpleMessageTable Where uid = :uid and type = 3")
    @NotNull
    Flow<Integer> OooO0o(long j);

    @Query("Select activityNum from SimpleMessageTable Where uid = :uid and type = 1")
    @NotNull
    Flow<Integer> OooO0o0(long j);

    @Query("Select * from SimpleMessageTable Where uid = :uid and type = 3")
    @Nullable
    SimpleMessage OooO0oO(long j);

    @Query("Update SimpleMessageTable set activityNum = :num Where uid = :uid and type = 1")
    void OooO0oo(long j);

    @Query("Select fansNum from SimpleMessageTable Where uid = :uid and type = 2")
    @NotNull
    Flow<Integer> OooOO0(long j);
}
