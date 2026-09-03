package p403o0Oo0OOo;

import androidx.room.Dao;
import androidx.room.Query;

/* JADX INFO: loaded from: classes4.dex */
@Dao
@Deprecated
public interface o0O0oo00 {
    @Query("Select memoName from FriendsTable where uid = :userId and id = :toId")
    String OooO00o(long j, long j2);
}
