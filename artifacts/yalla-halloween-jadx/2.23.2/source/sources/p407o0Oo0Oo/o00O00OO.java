package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Query;

/* JADX INFO: loaded from: classes4.dex */
@Dao
@Deprecated
public interface o00O00OO {
    @Query("Select memoName from FriendsTable where uid = :userId and id = :toId")
    String OooO00o(long j, long j2);
}
