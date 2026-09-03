package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.converter.TagConverter;
import com.yalla.yalla.data.db.table.Friend;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p110o000ooo0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 implements o000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TagConverter f45759OooO = new TagConverter();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00 f45761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O00O f45762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0 f45763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O0O0 f45764OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0Oo f45765OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O f45766OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO00 f45767OooO0oo;

    public class OooO00o implements Callable<Friend> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45768OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45768OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Friend call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o000O000.this.f45760OooO00o, this.f45768OooO00o);
            try {
                int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "friendId");
                int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "memoName");
                int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
                int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
                int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
                Friend friend = null;
                String string = null;
                if (cursorOooO0O0.moveToFirst()) {
                    Friend friend2 = new Friend();
                    friend2.setUid(cursorOooO0O0.getLong(iOooO00o));
                    friend2.setFriendId(cursorOooO0O0.getLong(iOooO00o2));
                    if (!cursorOooO0O0.isNull(iOooO00o3)) {
                        string = cursorOooO0O0.getString(iOooO00o3);
                    }
                    friend2.setMemoName(string);
                    friend2.setTime(cursorOooO0O0.getLong(iOooO00o4));
                    friend2.setInRoom(cursorOooO0O0.getInt(iOooO00o5) != 0);
                    friend2.setDeleteMark(cursorOooO0O0.getInt(iOooO00o6) != 0);
                    friend2.setCheckUserRisk(cursorOooO0O0.getInt(iOooO00o7) != 0);
                    friend = friend2;
                }
                return friend;
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45768OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45770OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45770OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o000O000.this.f45760OooO00o, this.f45770OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45770OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45772OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45772OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final String call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o000O000.this.f45760OooO00o, this.f45772OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : cursorOooO0O0.getString(0);
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45772OooO00o.release();
        }
    }

    public o000O000(YlAppDataBase ylAppDataBase) {
        this.f45760OooO00o = ylAppDataBase;
        this.f45761OooO0O0 = new o000O00(ylAppDataBase);
        this.f45762OooO0OO = new o000O00O(ylAppDataBase);
        this.f45763OooO0Oo = new o000O0(ylAppDataBase);
        this.f45765OooO0o0 = new o000O0Oo(ylAppDataBase);
        new o000OO0O(ylAppDataBase);
        this.f45764OooO0o = new o000O0O0(ylAppDataBase);
        this.f45766OooO0oO = new o000O(ylAppDataBase);
        this.f45767OooO0oo = new o000OO00(ylAppDataBase);
        new o000OOo0(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooO(long j) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000O o000o = this.f45766OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final String OooO00o(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendTable where uid = ? and friendId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : cursorOooO0O0.getString(0);
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooO0O0(long j) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000O0Oo o000o0oo2 = this.f45765OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000o0oo2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000o0oo2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final Friend OooO0OO(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendTable Where uid = ? and friendId = ? order by time");
        boolean z = true;
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "friendId");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "memoName");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
            Friend friend = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                Friend friend2 = new Friend();
                friend2.setUid(cursorOooO0O0.getLong(iOooO00o));
                friend2.setFriendId(cursorOooO0O0.getLong(iOooO00o2));
                if (!cursorOooO0O0.isNull(iOooO00o3)) {
                    string = cursorOooO0O0.getString(iOooO00o3);
                }
                friend2.setMemoName(string);
                friend2.setTime(cursorOooO0O0.getLong(iOooO00o4));
                friend2.setInRoom(cursorOooO0O0.getInt(iOooO00o5) != 0);
                friend2.setDeleteMark(cursorOooO0O0.getInt(iOooO00o6) != 0);
                if (cursorOooO0O0.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friend2.setCheckUserRisk(z);
                friend = friend2;
            }
            return friend;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000O0O0 o000o0o1 = this.f45764OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000o0o1.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000o0o1.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final Flow<Integer> OooO0o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count() from FriendTable Where uid = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45760OooO00o, new String[]{"FriendTable"}, oooO0O0);
    }

    @Override // p407o0Oo0Oo.o000
    public final Flow<String> OooO0o0(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendTable where uid = ? and friendId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45760OooO00o, new String[]{"FriendTable"}, oooO0OO);
    }

    @Override // p407o0Oo0Oo.o000
    public final Friend OooO0oO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        boolean z = true;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from FriendTable Where uid = ? order by time Desc");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "friendId");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "memoName");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
            Friend friend = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                Friend friend2 = new Friend();
                friend2.setUid(cursorOooO0O0.getLong(iOooO00o));
                friend2.setFriendId(cursorOooO0O0.getLong(iOooO00o2));
                if (!cursorOooO0O0.isNull(iOooO00o3)) {
                    string = cursorOooO0O0.getString(iOooO00o3);
                }
                friend2.setMemoName(string);
                friend2.setTime(cursorOooO0O0.getLong(iOooO00o4));
                friend2.setInRoom(cursorOooO0O0.getInt(iOooO00o5) != 0);
                friend2.setDeleteMark(cursorOooO0O0.getInt(iOooO00o6) != 0);
                if (cursorOooO0O0.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friend2.setCheckUserRisk(z);
                friend = friend2;
            }
            return friend;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooO0oo(long j, long j2, boolean z) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000O00O o000o00o2 = this.f45762OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000o00o2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000o00o2.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final o000Oo0 OooOO0(long j, String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(4, "Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? and (FriendTable.memoName like '%' || ? || '%' or UserInfoTable.userName like '%' || ? || '%' or UserInfoTable.userIdx like '%' || ? || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(2);
        } else {
            roomSQLiteQueryOooO00o.bindString(2, str);
        }
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(3);
        } else {
            roomSQLiteQueryOooO00o.bindString(3, str);
        }
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(4);
        } else {
            roomSQLiteQueryOooO00o.bindString(4, str);
        }
        return new o000Oo0(this, roomSQLiteQueryOooO00o, this.f45760OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooOO0O(ArrayList arrayList) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45761OooO0O0.OooO0o(arrayList);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooOO0o(Friend friend) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45761OooO0O0.OooO0oO(friend);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooOOO(long j, long j2, boolean z) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000OO00 o000oo01 = this.f45767OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000oo01.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000oo01.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final o000O0o OooOOO0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? Order by FriendTable.inRoom DESC, FriendTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new o000O0o(this, roomSQLiteQueryOooO00o, this.f45760OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p407o0Oo0Oo.o000
    public final void OooOOOO(long j, long j2) {
        RoomDatabase roomDatabase = this.f45760OooO00o;
        roomDatabase.OooO0O0();
        o000O0 o000o0 = this.f45763OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o000o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o000o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o000
    public final Flow<Friend> OooOOOo(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendTable Where uid = ? and friendId = ? order by time");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45760OooO00o, new String[]{"FriendTable"}, oooO00o);
    }
}
