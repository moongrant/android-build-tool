package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 implements o0O0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44532OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0OOO0 f44533OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0OOOo f44534OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0OOoo f44535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0o00O f44536OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O0o000 f44537OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0o0 f44538OooO0oO;

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44539OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44539OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0O0OO0.this.f44532OooO00o, this.f44539OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44539OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44541OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44541OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0O0OO0.this.f44532OooO00o, this.f44541OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44541OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<FriendRequestMessage> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44543OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44543OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final FriendRequestMessage call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0O0OO0.this.f44532OooO00o, this.f44543OooO00o);
            try {
                int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "targetUserId");
                int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "mid");
                int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
                int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isRead");
                FriendRequestMessage friendRequestMessage = null;
                String string = null;
                if (cursorOooO0O0.moveToFirst()) {
                    FriendRequestMessage friendRequestMessage2 = new FriendRequestMessage();
                    friendRequestMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                    friendRequestMessage2.setTargetUserId(cursorOooO0O0.getLong(iOooO00o2));
                    friendRequestMessage2.setMid(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                    friendRequestMessage2.setState(cursorOooO0O0.getInt(iOooO00o4));
                    if (!cursorOooO0O0.isNull(iOooO00o5)) {
                        string = cursorOooO0O0.getString(iOooO00o5);
                    }
                    friendRequestMessage2.setMessage(string);
                    friendRequestMessage2.setTime(cursorOooO0O0.getLong(iOooO00o6));
                    friendRequestMessage2.setRead(cursorOooO0O0.getInt(iOooO00o7) != 0);
                    friendRequestMessage = friendRequestMessage2;
                }
                return friendRequestMessage;
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44543OooO00o.release();
        }
    }

    public o0O0OO0(YlAppDataBase ylAppDataBase) {
        this.f44532OooO00o = ylAppDataBase;
        this.f44533OooO0O0 = new o0O0OOO0(ylAppDataBase);
        this.f44534OooO0OO = new o0O0OOOo(ylAppDataBase);
        this.f44535OooO0Oo = new oo0OOoo(ylAppDataBase);
        this.f44537OooO0o0 = new o0O0o000(ylAppDataBase);
        this.f44536OooO0o = new o0O0o00O(ylAppDataBase);
        this.f44538OooO0oO = new o0O0o0(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final Flow<FriendRequestMessage> OooO(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendRequestMessageTable Where uid = ? and targetUserId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44532OooO00o, new String[]{"FriendRequestMessageTable"}, oooO0OO);
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final Flow<Integer> OooO00o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count() from FriendRequestMessageTable Where uid = ? and isRead = 0");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44532OooO00o, new String[]{"FriendRequestMessageTable"}, oooO0O0);
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final Flow<Integer> OooO0O0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count() from FriendRequestMessageTable Where uid = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44532OooO00o, new String[]{"FriendRequestMessageTable"}, oooO00o);
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooO0OO(long j, long j2) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        oo0OOoo oo0oooo = this.f44535OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0oooo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oo0oooo.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        o0O0o0 o0o0o0 = this.f44538OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0o0.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooO0o(long j, long j2) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        o0O0o00O o0o0o00o = this.f44536OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o00o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0o00o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooO0o0(long j) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        o0O0OOOo o0o0oooo = this.f44534OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0oooo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0oooo.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final o0oOo0O0 OooO0oO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from FriendRequestMessageTable Where uid = ? Order by state == 0 Desc, time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new o0oOo0O0(roomSQLiteQueryOooO00o, this.f44532OooO00o, "FriendRequestMessageTable");
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final FriendRequestMessage OooO0oo(long j, String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendRequestMessageTable Where uid = ? and mid = ?");
        boolean z = true;
        roomSQLiteQueryOooO00o.bindLong(1, j);
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(2);
        } else {
            roomSQLiteQueryOooO00o.bindString(2, str);
        }
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "targetUserId");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "mid");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isRead");
            FriendRequestMessage friendRequestMessage = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                FriendRequestMessage friendRequestMessage2 = new FriendRequestMessage();
                friendRequestMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                friendRequestMessage2.setTargetUserId(cursorOooO0O0.getLong(iOooO00o2));
                friendRequestMessage2.setMid(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                friendRequestMessage2.setState(cursorOooO0O0.getInt(iOooO00o4));
                if (!cursorOooO0O0.isNull(iOooO00o5)) {
                    string = cursorOooO0O0.getString(iOooO00o5);
                }
                friendRequestMessage2.setMessage(string);
                friendRequestMessage2.setTime(cursorOooO0O0.getLong(iOooO00o6));
                if (cursorOooO0O0.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friendRequestMessage2.setRead(z);
                friendRequestMessage = friendRequestMessage2;
            }
            return friendRequestMessage;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooOO0(FriendRequestMessage friendRequestMessage) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44533OooO0O0.OooO0o(friendRequestMessage);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.o0O0O0o0
    public final void OooOO0O(int i, long j, long j2) {
        RoomDatabase roomDatabase = this.f44532OooO00o;
        roomDatabase.OooO0O0();
        o0O0o000 o0o0o000 = this.f44537OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o000.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0o000.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }
}
