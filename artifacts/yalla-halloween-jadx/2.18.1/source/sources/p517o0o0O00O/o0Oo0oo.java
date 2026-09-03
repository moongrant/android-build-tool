package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p089o000o000.o00O00o0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;
import p093o000o0O0.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<FriendRequestMessage> f42157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f42158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f42159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f42160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f42161OooO0o0;

    public class OooO extends o0000OO0 {
        public OooO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "update FriendRequestMessageTable set isRead = 1 where uid = ? and isRead = 0 ";
        }
    }

    public class OooO00o extends o000OOo<FriendRequestMessage> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, FriendRequestMessage friendRequestMessage) {
            FriendRequestMessage friendRequestMessage2 = friendRequestMessage;
            supportSQLiteStatement.bindLong(1, friendRequestMessage2.getUid());
            supportSQLiteStatement.bindLong(2, friendRequestMessage2.getTargetUserId());
            if (friendRequestMessage2.getMid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, friendRequestMessage2.getMid());
            }
            supportSQLiteStatement.bindLong(4, friendRequestMessage2.getState());
            if (friendRequestMessage2.getMessage() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, friendRequestMessage2.getMessage());
            }
            supportSQLiteStatement.bindLong(6, friendRequestMessage2.getTime());
            supportSQLiteStatement.bindLong(7, friendRequestMessage2.getIsRead() ? 1L : 0L);
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "delete from FriendRequestMessageTable Where uid = ?";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "delete from FriendRequestMessageTable Where uid = ? and targetUserId = ?";
        }
    }

    public class OooO0o extends o0000OO0 {
        public OooO0o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "update FriendRequestMessageTable set state = ? Where uid = ? and targetUserId = ?";
        }
    }

    public class OooOO0 extends o000O0<FriendRequestMessage> {
        public OooOO0(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        @Override // p093o000o0O0.o000O0
        public final List<FriendRequestMessage> OooO0o(Cursor cursor) {
            int iOooO00o = o00O0O.OooO00o(cursor, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursor, "targetUserId");
            int iOooO00o3 = o00O0O.OooO00o(cursor, "mid");
            int iOooO00o4 = o00O0O.OooO00o(cursor, ServerProtocol.DIALOG_PARAM_STATE);
            int iOooO00o5 = o00O0O.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o6 = o00O0O.OooO00o(cursor, "time");
            int iOooO00o7 = o00O0O.OooO00o(cursor, "isRead");
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                FriendRequestMessage friendRequestMessage = new FriendRequestMessage();
                friendRequestMessage.setUid(cursor.getLong(iOooO00o));
                friendRequestMessage.setTargetUserId(cursor.getLong(iOooO00o2));
                friendRequestMessage.setMid(cursor.isNull(iOooO00o3) ? null : cursor.getString(iOooO00o3));
                friendRequestMessage.setState(cursor.getInt(iOooO00o4));
                friendRequestMessage.setMessage(cursor.isNull(iOooO00o5) ? null : cursor.getString(iOooO00o5));
                friendRequestMessage.setTime(cursor.getLong(iOooO00o6));
                friendRequestMessage.setRead(cursor.getInt(iOooO00o7) != 0);
                arrayList.add(friendRequestMessage);
            }
            return arrayList;
        }
    }

    public class OooOO0O implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f42162OooO00o;

        public OooOO0O(o0000O0 o0000o1) {
            this.f42162OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o0Oo0oo.this.f42156OooO00o.OooOOO(this.f42162OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f42162OooO00o.release();
        }
    }

    public class OooOOO0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f42164OooO00o;

        public OooOOO0(o0000O0 o0000o1) {
            this.f42164OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o0Oo0oo.this.f42156OooO00o.OooOOO(this.f42164OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f42164OooO00o.release();
        }
    }

    public o0Oo0oo(RoomDatabase roomDatabase) {
        this.f42156OooO00o = roomDatabase;
        this.f42157OooO0O0 = new OooO00o(roomDatabase);
        this.f42158OooO0OO = new OooO0O0(roomDatabase);
        this.f42159OooO0Oo = new OooO0OO(roomDatabase);
        this.f42161OooO0o0 = new OooO0o(roomDatabase);
        this.f42160OooO0o = new OooO(roomDatabase);
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final void OooO(long j, long j2, int i) {
        this.f42156OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42161OooO0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        this.f42156OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42156OooO00o.OooOOOO();
        } finally {
            this.f42156OooO00o.OooOO0O();
            this.f42161OooO0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final Flow<Integer> OooO00o(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select count() from FriendRequestMessageTable Where uid = ? and isRead = 0", 1);
        o0000o0OooO0o.bindLong(1, j);
        return p091o000o00o.o0Oo0oo.OooO00o(this.f42156OooO00o, new String[]{"FriendRequestMessageTable"}, new OooOOO0(o0000o0OooO0o));
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final void OooO0O0(long j) {
        this.f42156OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42160OooO0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f42156OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42156OooO00o.OooOOOO();
        } finally {
            this.f42156OooO00o.OooOO0O();
            this.f42160OooO0o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final void OooO0OO(long j) {
        this.f42156OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42158OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f42156OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42156OooO00o.OooOOOO();
        } finally {
            this.f42156OooO00o.OooOO0O();
            this.f42158OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final Flow<Integer> OooO0Oo(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select count() from FriendRequestMessageTable Where uid = ?", 1);
        o0000o0OooO0o.bindLong(1, j);
        return p091o000o00o.o0Oo0oo.OooO00o(this.f42156OooO00o, new String[]{"FriendRequestMessageTable"}, new OooOO0O(o0000o0OooO0o));
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final o00O00o0<Integer, FriendRequestMessage> OooO0o(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendRequestMessageTable Where uid = ? Order by time DESC ", 1);
        o0000o0OooO0o.bindLong(1, j);
        return new OooOO0(o0000o0OooO0o, this.f42156OooO00o, "FriendRequestMessageTable");
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final void OooO0o0(long j, long j2) {
        this.f42156OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42159OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        this.f42156OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42156OooO00o.OooOOOO();
        } finally {
            this.f42156OooO00o.OooOO0O();
            this.f42159OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final FriendRequestMessage OooO0oO(long j, String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendRequestMessageTable Where uid = ? and mid = ?", 2);
        boolean z = true;
        o0000o0OooO0o.bindLong(1, j);
        if (str == null) {
            o0000o0OooO0o.bindNull(2);
        } else {
            o0000o0OooO0o.bindString(2, str);
        }
        this.f42156OooO00o.OooO0O0();
        FriendRequestMessage friendRequestMessage = null;
        String string = null;
        Cursor cursorOooOOO = this.f42156OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "targetUserId");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "mid");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, ServerProtocol.DIALOG_PARAM_STATE);
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "isRead");
            if (cursorOooOOO.moveToFirst()) {
                FriendRequestMessage friendRequestMessage2 = new FriendRequestMessage();
                friendRequestMessage2.setUid(cursorOooOOO.getLong(iOooO00o));
                friendRequestMessage2.setTargetUserId(cursorOooOOO.getLong(iOooO00o2));
                friendRequestMessage2.setMid(cursorOooOOO.isNull(iOooO00o3) ? null : cursorOooOOO.getString(iOooO00o3));
                friendRequestMessage2.setState(cursorOooOOO.getInt(iOooO00o4));
                if (!cursorOooOOO.isNull(iOooO00o5)) {
                    string = cursorOooOOO.getString(iOooO00o5);
                }
                friendRequestMessage2.setMessage(string);
                friendRequestMessage2.setTime(cursorOooOOO.getLong(iOooO00o6));
                if (cursorOooOOO.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friendRequestMessage2.setRead(z);
                friendRequestMessage = friendRequestMessage2;
            }
            return friendRequestMessage;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p517o0o0O00O.o0OOO0o
    public final void OooO0oo(FriendRequestMessage friendRequestMessage) {
        this.f42156OooO00o.OooO0O0();
        this.f42156OooO00o.OooO0OO();
        try {
            this.f42157OooO0O0.OooO0oO(friendRequestMessage);
            this.f42156OooO00o.OooOOOO();
        } finally {
            this.f42156OooO00o.OooOO0O();
        }
    }
}
