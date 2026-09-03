package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import java.util.ArrayList;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O implements oO0O0Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oOo0o0oO f44668OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ooOOO0Oo f44669OooO0OO;

    public ooOOO00O(YlAppDataBase ylAppDataBase) {
        this.f44667OooO00o = ylAppDataBase;
        this.f44668OooO0O0 = new oOo0o0oO(ylAppDataBase);
        this.f44669OooO0OO = new ooOOO0Oo(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO0O0Oo0
    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from TopicRecentTable Where uid = ? Order by create_time DESC");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f44667OooO00o;
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

    @Override // p403o0Oo0OOo.oO0O0Oo0
    public final int OooO0O0(TopicRecentTable topicRecentTable) {
        RoomDatabase roomDatabase = this.f44667OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            int iOooO0o0 = this.f44669OooO0OO.OooO0o0(topicRecentTable) + 0;
            roomDatabase.OooOOO0();
            return iOooO0o0;
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO0O0Oo0
    public final long OooO0OO(TopicRecentTable topicRecentTable) {
        RoomDatabase roomDatabase = this.f44667OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            long jOooO0oO = this.f44668OooO0O0.OooO0oO(topicRecentTable);
            roomDatabase.OooOOO0();
            return jOooO0oO;
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
