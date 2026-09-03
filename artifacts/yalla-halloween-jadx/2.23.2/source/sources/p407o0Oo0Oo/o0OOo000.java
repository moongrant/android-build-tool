package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import java.util.ArrayList;
import java.util.TreeMap;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 implements o0OOO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45855OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOOO00 f45856OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOOO0o f45857OooO0OO;

    public o0OOo000(YlAppDataBase ylAppDataBase) {
        this.f45855OooO00o = ylAppDataBase;
        this.f45856OooO0O0 = new o0OOOO00(ylAppDataBase);
        this.f45857OooO0OO = new o0OOOO0o(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o0OOO0OO
    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from TopicRecentTable Where uid = ? Order by create_time DESC");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f45855OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "topic_id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "topic_name");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "create_time");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "uid");
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                TopicRecentTable topicRecentTable = new TopicRecentTable();
                topicRecentTable.topicId = cursorOooO0O0.getLong(iOooO00o);
                if (cursorOooO0O0.isNull(iOooO00o2)) {
                    topicRecentTable.topicName = null;
                } else {
                    topicRecentTable.topicName = cursorOooO0O0.getString(iOooO00o2);
                }
                topicRecentTable.createTime = cursorOooO0O0.getLong(iOooO00o3);
                if (cursorOooO0O0.isNull(iOooO00o4)) {
                    topicRecentTable.uid = null;
                } else {
                    topicRecentTable.uid = cursorOooO0O0.getString(iOooO00o4);
                }
                arrayList.add(topicRecentTable);
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o0OOO0OO
    public final int OooO0O0(TopicRecentTable topicRecentTable) {
        RoomDatabase roomDatabase = this.f45855OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            int iOooO0o = this.f45857OooO0OO.OooO0o(topicRecentTable) + 0;
            roomDatabase.OooOOO();
            return iOooO0o;
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0OOO0OO
    public final long OooO0OO(TopicRecentTable topicRecentTable) {
        RoomDatabase roomDatabase = this.f45855OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            long jOooO0oo = this.f45856OooO0O0.OooO0oo(topicRecentTable);
            roomDatabase.OooOOO();
            return jOooO0oo;
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
