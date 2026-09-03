package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface oo000o {
    @Query("Select count(*) from BuriedPointTable")
    int OooO00o();

    @Insert(onConflict = 1)
    void OooO0O0(@NotNull BuriedPoint buriedPoint);

    @Query("delete from BuriedPointTable where id <= :id")
    void OooO0OO(int i);

    @Query("Select * from BuriedPointTable")
    @NotNull
    List<BuriedPoint> OooO0Oo();
}
