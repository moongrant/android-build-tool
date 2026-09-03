package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Dao
@Deprecated
public interface o0OO00O {
    @Query("Select * from FriendsTable Where uid = :uid Order by time DESC")
    List<FriendsTableOld> OooO00o(String str);

    @Query("Select * from FriendsTable Where uid = :uid and add_from = 1 Order by time DESC")
    List<FriendsTableOld> OooO0O0(String str);

    @Query("Delete from FriendsTable Where uid = :uid")
    void OooO0OO(String str);

    @Query("Select * from FriendsTable where (name like :str or idx like :str or memoName like :str) and uid = :uid")
    List<FriendsTableOld> OooO0Oo(String str, String str2);

    @Insert(onConflict = 1)
    void OooO0o(FriendsTableOld friendsTableOld);

    @Delete
    int OooO0o0(FriendsTableOld friendsTableOld);

    @Query("Select * from FriendsTable Where id = :userid and uid = :uid")
    FriendsTableOld OooO0oO(String str, String str2);

    @Query("Select memoName from FriendsTable where uid = :userId and id = :toId")
    String OooO0oo(long j, long j2);
}
