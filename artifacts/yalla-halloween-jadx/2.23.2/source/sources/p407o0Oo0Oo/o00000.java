package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.converter.TagConverter;
import com.yalla.yalla.data.db.table.Conversation;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p110o000ooo0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 implements o000000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000OO f45741OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO f45743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000Ooo f45744OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000 f45745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000oo f45746OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O00 f45747OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000O0 f45748OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000O0O f45749OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0000O f45750OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000000O f45751OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TagConverter f45752OooOO0o = new TagConverter();

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45753OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45753OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o00000.this.f45742OooO00o, this.f45753OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45753OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Conversation> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45755OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45755OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Conversation call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o00000.this.f45742OooO00o, this.f45755OooO00o);
            try {
                int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "targetId");
                int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "mid");
                int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "sendState");
                int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
                int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "momentType");
                int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "unReadCount");
                int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "draft");
                int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "topTime");
                int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "isVoiceAndUnread");
                int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "isAcceptMsg");
                Conversation conversation = null;
                String string = null;
                if (cursorOooO0O0.moveToFirst()) {
                    Conversation conversation2 = new Conversation();
                    conversation2.setUid(cursorOooO0O0.getLong(iOooO00o));
                    conversation2.setTargetId(cursorOooO0O0.getLong(iOooO00o2));
                    conversation2.setMid(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                    conversation2.setSendState(cursorOooO0O0.getInt(iOooO00o4));
                    conversation2.setTitle(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getString(iOooO00o5));
                    conversation2.setMessage(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getString(iOooO00o6));
                    conversation2.setType(cursorOooO0O0.getInt(iOooO00o7));
                    conversation2.setMomentType(cursorOooO0O0.getInt(iOooO00o8));
                    conversation2.setUnReadCount(cursorOooO0O0.getInt(iOooO00o9));
                    if (!cursorOooO0O0.isNull(iOooO00o10)) {
                        string = cursorOooO0O0.getString(iOooO00o10);
                    }
                    conversation2.setDraft(string);
                    conversation2.setTime(cursorOooO0O0.getLong(iOooO00o11));
                    conversation2.setTopTime(cursorOooO0O0.getLong(iOooO00o12));
                    conversation2.setVoiceAndUnread(cursorOooO0O0.getInt(iOooO00o13) != 0);
                    conversation2.setAcceptMsg(cursorOooO0O0.getInt(iOooO00o14) != 0);
                    conversation = conversation2;
                }
                return conversation;
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45755OooO00o.release();
        }
    }

    public o00000(YlAppDataBase ylAppDataBase) {
        this.f45742OooO00o = ylAppDataBase;
        this.f45743OooO0O0 = new o00000OO(ylAppDataBase);
        this.f45744OooO0OO = new o0000Ooo(ylAppDataBase);
        this.f45745OooO0Oo = new o0000(ylAppDataBase);
        this.f45747OooO0o0 = new o0000O00(ylAppDataBase);
        this.f45746OooO0o = new o0000oo(ylAppDataBase);
        this.f45748OooO0oO = new o0000O0(ylAppDataBase);
        this.f45749OooO0oo = new o0000O0O(ylAppDataBase);
        this.f45741OooO = new o000OO(ylAppDataBase);
        this.f45750OooOO0 = new o0000O(ylAppDataBase);
        this.f45751OooOO0O = new o000000O(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o000000
    public final o00000O0 OooO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from ConversationTable left join UserInfoTable on UserInfoTable.userId = ConversationTable.targetId Where ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new o00000O0(this, roomSQLiteQueryOooO00o, this.f45742OooO00o, "ConversationTable", "UserInfoTable");
    }

    @Override // p407o0Oo0Oo.o000000
    public final Flow<Integer> OooO00o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select sum(unReadCount) from ConversationTable Where uid = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45742OooO00o, new String[]{"ConversationTable"}, oooO00o);
    }

    @Override // p407o0Oo0Oo.o000000
    public final Long OooO0O0(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select topTime from ConversationTable where uid = ? and targetId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Long.valueOf(cursorOooO0O0.getLong(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooO0OO(long j) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o000000O o000000o2 = this.f45751OooOO0O;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000000o2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000000o2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000O o0000o2 = this.f45750OooOO0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000o2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000o2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooO0o(long j, long j2) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o000OO o000oo2 = this.f45741OooO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000oo2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000oo2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooO0o0(int i, String str) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000O0O o0000o0o2 = this.f45749OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000o0o2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000o0o2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final int OooO0oO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count(*) from ConversationTable Where topTime > 0 and uid =? limit 5");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return cursorOooO0O0.moveToFirst() ? cursorOooO0O0.getInt(0) : 0;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final Flow<Conversation> OooO0oo(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from ConversationTable  where targetId = ? and uid=?");
        roomSQLiteQueryOooO00o.bindLong(1, j2);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45742OooO00o, new String[]{"ConversationTable"}, oooO0O0);
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooOO0(int i, long j, long j2) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000 o0000Var = this.f45745OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000Var.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000Var.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooOO0O(long j, long j2, String str, boolean z) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000oo o0000ooVar = this.f45746OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000ooVar.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(4);
        } else {
            supportSQLiteStatementOooO00o.bindString(4, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000ooVar.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooOO0o(Conversation conversation) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45743OooO0O0.OooO0oO(conversation);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooOOO(long j, long j2, boolean z, boolean z2) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000O00 o0000o00 = this.f45747OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000o00.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        supportSQLiteStatementOooO00o.bindLong(4, z2 ? 1L : 0L);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000o00.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final o00000O OooOOO0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from (FriendTable inner join UserInfoTable on FriendTable.friendId=UserInfoTable.userId)inner join ConversationTable on ConversationTable.targetId = FriendTable.friendId  Where FriendTable.uid = ? and ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        return new o00000O(this, roomSQLiteQueryOooO00o, this.f45742OooO00o, "FriendTable", "UserInfoTable", "ConversationTable");
    }

    @Override // p407o0Oo0Oo.o000000
    public final Integer OooOOOO(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select unReadCount from ConversationTable Where uid = ? and targetId=? and unReadCount > 0");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final int OooOOOo(long j, long j2, long j3) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000O0 o0000o1 = this.f45748OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000o1.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j3);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            o0000o1.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000000
    public final void OooOOo0(long j, long j2, String str) {
        RoomDatabase roomDatabase = this.f45742OooO00o;
        roomDatabase.OooO0O0();
        o0000Ooo o0000ooo = this.f45744OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0000ooo.OooO00o();
        supportSQLiteStatementOooO00o.bindString(1, str);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0000ooo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
