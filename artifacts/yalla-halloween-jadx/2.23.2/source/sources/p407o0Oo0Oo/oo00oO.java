package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.ArrayList;
import java.util.List;
import p110o000ooo0.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface oo00oO {
    @Query("Select * from MusicTable Where user = :user")
    o000O000 OooO00o(String str);

    @Query("Select * from MusicTable Where mPath = :mPath")
    MusicTable OooO0O0(String str);

    @Insert(onConflict = 1)
    void OooO0OO(ArrayList arrayList);

    @Query("Select * from MusicTable  where (mTitle like :keyword or mArtist like :keyword or mDisplayName like :keyword) and user = :user")
    ArrayList OooO0Oo(String str, String str2);

    @Insert(onConflict = 1)
    void OooO0o(MusicTable musicTable);

    @Delete
    void OooO0o0(List<MusicTable> list);

    @Query("Select * from MusicTable  where (mTitle like :mTitle or mArtist like :mArtist) and user = :user")
    ArrayList OooO0oO(String str, String str2, String str3);
}
