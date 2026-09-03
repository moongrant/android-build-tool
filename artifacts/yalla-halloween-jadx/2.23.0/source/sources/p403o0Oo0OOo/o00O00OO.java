package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o00O00OO {
    @Update
    void OooO00o(ApiErrorCodeDB apiErrorCodeDB);

    @Query("Select * from ApiErrorCodeDB  limit :limit")
    ArrayList OooO0O0();

    @Query("Select * from ApiErrorCodeDB Where Code=:errorCode")
    ApiErrorCodeDB OooO0OO(String str);

    @Insert(onConflict = 1)
    long OooO0Oo(ApiErrorCodeDB apiErrorCodeDB);
}
