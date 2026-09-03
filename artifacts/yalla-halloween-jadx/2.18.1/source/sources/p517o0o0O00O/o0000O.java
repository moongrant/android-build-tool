package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import java.util.ArrayList;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0O0O00;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42134OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<TopicRecentTable> f42135OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<TopicRecentTable> f42136OooO0OO;

    public class OooO00o extends o000OOo<TopicRecentTable> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `TopicRecentTable` (`topic_id`,`topic_name`,`create_time`,`uid`) VALUES (?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
            TopicRecentTable topicRecentTable2 = topicRecentTable;
            supportSQLiteStatement.bindLong(1, topicRecentTable2.topicId);
            String str = topicRecentTable2.topicName;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
            supportSQLiteStatement.bindLong(3, topicRecentTable2.createTime);
            String str2 = topicRecentTable2.uid;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str2);
            }
        }
    }

    public class OooO0O0 extends o0O0O00<TopicRecentTable> {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM `TopicRecentTable` WHERE `topic_id` = ? AND `uid` = ?";
        }

        @Override // p091o000o00o.o0O0O00
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
            TopicRecentTable topicRecentTable2 = topicRecentTable;
            supportSQLiteStatement.bindLong(1, topicRecentTable2.topicId);
            String str = topicRecentTable2.uid;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
        }
    }

    public o0000O(RoomDatabase roomDatabase) {
        this.f42134OooO00o = roomDatabase;
        this.f42135OooO0O0 = new OooO00o(roomDatabase);
        this.f42136OooO0OO = new OooO0O0(roomDatabase);
    }

    @Override // p517o0o0O00O.o000OO
    public final int OooO00o(TopicRecentTable topicRecentTable) {
        this.f42134OooO00o.OooO0O0();
        this.f42134OooO00o.OooO0OO();
        try {
            int iOooO0o = this.f42136OooO0OO.OooO0o(topicRecentTable) + 0;
            this.f42134OooO00o.OooOOOO();
            return iOooO0o;
        } finally {
            this.f42134OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o000OO
    public final List<TopicRecentTable> OooO0O0(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from TopicRecentTable Where uid = ? Order by create_time DESC", 1);
        o0000o0OooO0o.bindString(1, str);
        this.f42134OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42134OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "topic_id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "topic_name");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "create_time");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "uid");
            ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
            while (cursorOooOOO.moveToNext()) {
                TopicRecentTable topicRecentTable = new TopicRecentTable();
                topicRecentTable.topicId = cursorOooOOO.getLong(iOooO00o);
                if (cursorOooOOO.isNull(iOooO00o2)) {
                    topicRecentTable.topicName = null;
                } else {
                    topicRecentTable.topicName = cursorOooOOO.getString(iOooO00o2);
                }
                topicRecentTable.createTime = cursorOooOOO.getLong(iOooO00o3);
                if (cursorOooOOO.isNull(iOooO00o4)) {
                    topicRecentTable.uid = null;
                } else {
                    topicRecentTable.uid = cursorOooOOO.getString(iOooO00o4);
                }
                arrayList.add(topicRecentTable);
            }
            return arrayList;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p517o0o0O00O.o000OO
    public final long OooO0OO(TopicRecentTable topicRecentTable) {
        this.f42134OooO00o.OooO0O0();
        this.f42134OooO00o.OooO0OO();
        try {
            long jOooO0oo = this.f42135OooO0O0.OooO0oo(topicRecentTable);
            this.f42134OooO00o.OooOOOO();
            return jOooO0oo;
        } finally {
            this.f42134OooO00o.OooOO0O();
        }
    }
}
