package p517o0o0O00O;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o0O0O00 {
    @Query("Select * from MusicTable Where user = :user")
    LiveData<List<MusicTable>> OooO00o(String str);

    @Delete
    void OooO0O0(List<MusicTable> list);

    @Insert(onConflict = 1)
    void OooO0OO(MusicTable musicTable);

    @Query("Select * from MusicTable  where (mTitle like :mTitle or mArtist like :mArtist) and user = :user")
    List<MusicTable> OooO0Oo(String str, String str2, String str3);
}
