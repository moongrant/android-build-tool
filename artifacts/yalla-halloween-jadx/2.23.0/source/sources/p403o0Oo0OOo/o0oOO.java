package p403o0Oo0OOo;

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
import o000O0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO implements o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0OoOoOo f44589OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOOo f44591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0o f44592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0 f44593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0000O f44594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00000 f44595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O000 f44596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O000O f44597OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0O000Oo f44598OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00Oo00 f44599OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TagConverter f44600OooOO0o = new TagConverter();

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44601OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44601OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0oOO.this.f44590OooO00o, this.f44601OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44601OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Conversation> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44603OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44603OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Conversation call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0oOO.this.f44590OooO00o, this.f44603OooO00o);
            try {
                int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "targetId");
                int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "mid");
                int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "sendState");
                int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "type");
                int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "momentType");
                int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "unReadCount");
                int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "draft");
                int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "topTime");
                int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isVoiceAndUnread");
                int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isAcceptMsg");
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
            this.f44603OooO00o.release();
        }
    }

    public o0oOO(YlAppDataBase ylAppDataBase) {
        this.f44590OooO00o = ylAppDataBase;
        this.f44591OooO0O0 = new o0oOOo(ylAppDataBase);
        this.f44592OooO0OO = new o0O0o(ylAppDataBase);
        this.f44593OooO0Oo = new o0(ylAppDataBase);
        this.f44595OooO0o0 = new o0O00000(ylAppDataBase);
        this.f44594OooO0o = new o0O0000O(ylAppDataBase);
        this.f44596OooO0oO = new o0O000(ylAppDataBase);
        this.f44597OooO0oo = new o0O000O(ylAppDataBase);
        this.f44589OooO = new o0OoOoOo(ylAppDataBase);
        this.f44598OooOO0 = new o0O000Oo(ylAppDataBase);
        this.f44599OooOO0O = new o00Oo00(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final o0O00o0 OooO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from ConversationTable left join UserInfoTable on UserInfoTable.userId = ConversationTable.targetId Where ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new o0O00o0(this, roomSQLiteQueryOooO00o, this.f44590OooO00o, "ConversationTable", "UserInfoTable");
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final Flow<Integer> OooO00o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select sum(unReadCount) from ConversationTable Where uid = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return OooO0OO.OooO00o(this.f44590OooO00o, new String[]{"ConversationTable"}, oooO00o);
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final Long OooO0O0(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select topTime from ConversationTable where uid = ? and targetId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Long.valueOf(cursorOooO0O0.getLong(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooO0OO(long j) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o00Oo00 o00oo00 = this.f44599OooOO0O;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o00oo00.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o00oo00.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O000Oo o0o000oo2 = this.f44598OooOO0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o000oo2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o000oo2.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooO0o(long j, long j2) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0OoOoOo o0oooooo = this.f44589OooO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0oooooo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0oooooo.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooO0o0(int i, String str) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O000O o0o000o = this.f44597OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o000o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o000o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final int OooO0oO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count(*) from ConversationTable Where topTime > 0 and uid =? limit 5");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return cursorOooO0O0.moveToFirst() ? cursorOooO0O0.getInt(0) : 0;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final Flow<Conversation> OooO0oo(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from ConversationTable  where targetId = ? and uid=?");
        roomSQLiteQueryOooO00o.bindLong(1, j2);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return OooO0OO.OooO00o(this.f44590OooO00o, new String[]{"ConversationTable"}, oooO0O0);
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooOO0(int i, long j, long j2) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0 o0Var = this.f44593OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0Var.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0Var.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooOO0O(long j, long j2, String str, boolean z) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O0000O o0o0000o2 = this.f44594OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0000o2.OooO00o();
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
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0000o2.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooOO0o(Conversation conversation) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44591OooO0O0.OooO0o(conversation);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooOOO(long j, long j2, boolean z, boolean z2) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O00000 o0o00000 = this.f44595OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o00000.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        supportSQLiteStatementOooO00o.bindLong(4, z2 ? 1L : 0L);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o00000.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final oo00oO OooOOO0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from (FriendTable inner join UserInfoTable on FriendTable.friendId=UserInfoTable.userId)inner join ConversationTable on ConversationTable.targetId = FriendTable.friendId  Where FriendTable.uid = ? and ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        return new oo00oO(this, roomSQLiteQueryOooO00o, this.f44590OooO00o, "FriendTable", "UserInfoTable", "ConversationTable");
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final Integer OooOOOO(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select unReadCount from ConversationTable Where uid = ? and targetId=? and unReadCount > 0");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final int OooOOOo(long j, long j2, long j3) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O000 o0o001 = this.f44596OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o001.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j3);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            o0o001.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o00OOOOo
    public final void OooOOo0(long j, long j2, String str) {
        RoomDatabase roomDatabase = this.f44590OooO00o;
        roomDatabase.OooO0O0();
        o0O0o o0o0o = this.f44592OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o.OooO00o();
        supportSQLiteStatementOooO00o.bindString(1, str);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }
}
