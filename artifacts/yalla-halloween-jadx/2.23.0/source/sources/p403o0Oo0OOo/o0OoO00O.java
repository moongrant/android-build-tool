package p403o0Oo0OOo;

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

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O implements o0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TagConverter f44561OooO = new TagConverter();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44562OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00OO f44563OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00OOO f44564OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0oO0Ooo f44565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O0O f44566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00o00 f44567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0oO0O0o f44568OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O0oo0o f44569OooO0oo;

    public class OooO00o implements Callable<Friend> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44570OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44570OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Friend call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0OoO00O.this.f44562OooO00o, this.f44570OooO00o);
            try {
                int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "friendId");
                int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "memoName");
                int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
                int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
                int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
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
            this.f44570OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44572OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44572OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0OoO00O.this.f44562OooO00o, this.f44572OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44572OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44574OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44574OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final String call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(o0OoO00O.this.f44562OooO00o, this.f44574OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : cursorOooO0O0.getString(0);
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44574OooO00o.release();
        }
    }

    public o0OoO00O(YlAppDataBase ylAppDataBase) {
        this.f44562OooO00o = ylAppDataBase;
        this.f44563OooO0O0 = new o0O00OO(ylAppDataBase);
        this.f44564OooO0OO = new o0O00OOO(ylAppDataBase);
        this.f44565OooO0Oo = new o0oO0Ooo(ylAppDataBase);
        this.f44567OooO0o0 = new o0O00o00(ylAppDataBase);
        new o0O00oO0(ylAppDataBase);
        this.f44566OooO0o = new o0O0O0O(ylAppDataBase);
        this.f44568OooO0oO = new o0oO0O0o(ylAppDataBase);
        this.f44569OooO0oo = new o0O0oo0o(ylAppDataBase);
        new o0O0O0Oo(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooO(long j) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0oO0O0o o0oo0o0o2 = this.f44568OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0oo0o0o2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0oo0o0o2.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final String OooO00o(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendTable where uid = ? and friendId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : cursorOooO0O0.getString(0);
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooO0O0(long j) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0O00o00 o0o00o01 = this.f44567OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o00o01.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o00o01.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final Friend OooO0OO(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendTable Where uid = ? and friendId = ? order by time");
        boolean z = true;
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "friendId");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "memoName");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
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

    @Override // p403o0Oo0OOo.o0O00
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0O0O0O o0o0o0o = this.f44566OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0o0o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final Flow<Integer> OooO0o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select count() from FriendTable Where uid = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44562OooO00o, new String[]{"FriendTable"}, oooO0O0);
    }

    @Override // p403o0Oo0OOo.o0O00
    public final Flow<String> OooO0o0(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendTable where uid = ? and friendId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44562OooO00o, new String[]{"FriendTable"}, oooO0OO);
    }

    @Override // p403o0Oo0OOo.o0O00
    public final Friend OooO0oO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        boolean z = true;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from FriendTable Where uid = ? order by time Desc");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "friendId");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "memoName");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "inRoom");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "deleteMark");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isCheckUserRisk");
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

    @Override // p403o0Oo0OOo.o0O00
    public final void OooO0oo(long j, long j2, boolean z) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0O00OOO o0o00ooo2 = this.f44564OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o00ooo2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o00ooo2.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final o0O00O OooOO0(long j, String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
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
        return new o0O00O(this, roomSQLiteQueryOooO00o, this.f44562OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooOO0O(ArrayList arrayList) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44563OooO0O0.OooO0o0(arrayList);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooOO0o(Friend friend) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44563OooO0O0.OooO0o(friend);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooOOO(long j, long j2, boolean z) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0O0oo0o o0o0oo0o = this.f44569OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0oo0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0o0oo0o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final o0O00O0o OooOOO0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? Order by FriendTable.inRoom DESC, FriendTable.time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new o0O00O0o(this, roomSQLiteQueryOooO00o, this.f44562OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p403o0Oo0OOo.o0O00
    public final void OooOOOO(long j, long j2) {
        RoomDatabase roomDatabase = this.f44562OooO00o;
        roomDatabase.OooO0O0();
        o0oO0Ooo o0oo0ooo2 = this.f44565OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0oo0ooo2.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            o0oo0ooo2.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.o0O00
    public final Flow<Friend> OooOOOo(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from FriendTable Where uid = ? and friendId = ? order by time");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44562OooO00o, new String[]{"FriendTable"}, oooO00o);
    }
}
