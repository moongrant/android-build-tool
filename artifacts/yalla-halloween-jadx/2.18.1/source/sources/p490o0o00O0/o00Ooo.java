package p490o0o00O0;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.common.db.table.PayOrder;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o00Ooo {
    @Insert(onConflict = 5)
    @Nullable
    Object OooO00o(@NotNull PayOrder payOrder, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 5)
    @Nullable
    Object OooO0O0(@NotNull List<PayOrder> list, @NotNull Continuation<? super Unit> continuation);

    @Query("delete from PayOrderTable where order_id =:order")
    @Nullable
    Object OooO0OO(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("select * from PayOrderTable")
    @Nullable
    Object OooO0Oo(@NotNull Continuation<? super List<PayOrder>> continuation);

    @Query("update PayOrderTable set isConsume=:isConsume where order_id=:order")
    @Nullable
    Object OooO0o0(@NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation);
}
