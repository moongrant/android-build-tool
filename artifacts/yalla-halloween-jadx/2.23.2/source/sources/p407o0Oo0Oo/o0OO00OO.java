package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SimpleMessage;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p110o000ooo0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO implements o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45836OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO000 f45837OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO000o f45838OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0oO0 f45839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0ooO f45840OooO0o0;

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45841OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45841OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o0OO00OO.this.f45836OooO00o, this.f45841OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45841OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45843OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45843OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o0OO00OO.this.f45836OooO00o, this.f45843OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45843OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45845OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45845OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(o0OO00OO.this.f45836OooO00o, this.f45845OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45845OooO00o.release();
        }
    }

    public o0OO00OO(YlAppDataBase ylAppDataBase) {
        this.f45836OooO00o = ylAppDataBase;
        this.f45837OooO0O0 = new o0OO000(ylAppDataBase);
        this.f45838OooO0OO = new o0OO000o(ylAppDataBase);
        this.f45839OooO0Oo = new oo0oO0(ylAppDataBase);
        this.f45840OooO0o0 = new oo0ooO(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o0O
    public final void OooO(long j) {
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        oo0oO0 oo0oo0 = this.f45839OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0oo0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oo0oo0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final void OooO00o(long j) {
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        o0OO000o o0oo000o = this.f45838OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0oo000o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0oo000o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final void OooO0O0(SimpleMessage simpleMessage) {
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45837OooO0O0.OooO0oO(simpleMessage);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final SimpleMessage OooO0OO(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from SimpleMessageTable Where uid = ? and type = 1");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "content");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "activityNum");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "fansNum");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooO0O0.moveToFirst()) {
                if (cursorOooO0O0.isNull(iOooO00o4) && cursorOooO0O0.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooO0O0.getInt(iOooO00o5));
                }
                if (cursorOooO0O0.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooO0O0.getInt(iOooO00o6));
                }
                if (!cursorOooO0O0.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooO0O0.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooO0O0.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooO0O0.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final SimpleMessage OooO0Oo(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from SimpleMessageTable Where uid = ? and type = 2");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "content");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "activityNum");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "fansNum");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooO0O0.moveToFirst()) {
                if (cursorOooO0O0.isNull(iOooO00o4) && cursorOooO0O0.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooO0O0.getInt(iOooO00o5));
                }
                if (cursorOooO0O0.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooO0O0.getInt(iOooO00o6));
                }
                if (!cursorOooO0O0.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooO0O0.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooO0O0.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooO0O0.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final Flow<Integer> OooO0o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select visitorNum from SimpleMessageTable Where uid = ? and type = 3");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45836OooO00o, new String[]{"SimpleMessageTable"}, oooO0O0);
    }

    @Override // p407o0Oo0Oo.o0O
    public final Flow<Integer> OooO0o0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select activityNum from SimpleMessageTable Where uid = ? and type = 1");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45836OooO00o, new String[]{"SimpleMessageTable"}, oooO0OO);
    }

    @Override // p407o0Oo0Oo.o0O
    public final SimpleMessage OooO0oO(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from SimpleMessageTable Where uid = ? and type = 3");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "content");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "activityNum");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "fansNum");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooO0O0.moveToFirst()) {
                if (cursorOooO0O0.isNull(iOooO00o4) && cursorOooO0O0.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooO0O0.getInt(iOooO00o5));
                }
                if (cursorOooO0O0.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooO0O0.getInt(iOooO00o6));
                }
                if (!cursorOooO0O0.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooO0O0.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooO0O0.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooO0O0.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final void OooO0oo(long j) {
        RoomDatabase roomDatabase = this.f45836OooO00o;
        roomDatabase.OooO0O0();
        oo0ooO oo0ooo = this.f45840OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0ooo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oo0ooo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0O
    public final Flow<Integer> OooOO0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select fansNum from SimpleMessageTable Where uid = ? and type = 2");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45836OooO00o, new String[]{"SimpleMessageTable"}, oooO00o);
    }
}
