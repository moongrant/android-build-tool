package p407o0Oo0Oo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface o0OOO0OO {
    @Query("Select * from TopicRecentTable Where uid = :uId Order by create_time DESC")
    ArrayList OooO00o(String str);

    @Delete
    int OooO0O0(TopicRecentTable topicRecentTable);

    @Insert(onConflict = 1)
    long OooO0OO(TopicRecentTable topicRecentTable);
}
