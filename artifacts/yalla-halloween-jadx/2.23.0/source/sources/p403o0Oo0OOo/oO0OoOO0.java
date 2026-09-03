package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.table.PayOrder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oO0OoOO0 {
    @Insert(onConflict = 5)
    void OooO00o(@NotNull PayOrder payOrder);

    @Query("update PayOrderTable set isConsume=:isConsume where order_id=:order")
    void OooO0O0(@NotNull String str, boolean z);

    @Query("delete from PayOrderTable where order_id =:order")
    void OooO0OO(@NotNull String str);

    @Insert(onConflict = 5)
    void OooO0Oo(@NotNull List<PayOrder> list);

    @Query("select * from PayOrderTable")
    @NotNull
    ArrayList OooO0o0();
}
