package p517o0o0O00O;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface o000OO {
    @Delete
    int OooO00o(TopicRecentTable topicRecentTable);

    @Query("Select * from TopicRecentTable Where uid = :uId Order by create_time DESC")
    List<TopicRecentTable> OooO0O0(String str);

    @Insert(onConflict = 1)
    long OooO0OO(TopicRecentTable topicRecentTable);
}
