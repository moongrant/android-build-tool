package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o00O0O {
    @Update
    void OooO00o(ApiErrorCodeDB apiErrorCodeDB);

    @Query("Select * from ApiErrorCodeDB  limit :limit")
    List OooO0O0();

    @Insert(onConflict = 1)
    long OooO0OO(ApiErrorCodeDB apiErrorCodeDB);

    @Query("Select * from ApiErrorCodeDB Where Code=:errorCode")
    ApiErrorCodeDB OooO0Oo(String str);
}
