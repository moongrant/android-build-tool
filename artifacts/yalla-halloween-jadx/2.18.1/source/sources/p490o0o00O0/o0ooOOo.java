package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.common.db.table.SimpleMessage;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0Oo0oo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41080OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<SimpleMessage> f41081OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f41082OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f41083OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f41084OooO0o0;

    public class OooO implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41085OooO00o;

        public OooO(o0000O0 o0000o1) {
            this.f41085OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o0ooOOo.this.f41080OooO00o.OooOOO(this.f41085OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41085OooO00o.release();
        }
    }

    public class OooO00o extends o000OOo<SimpleMessage> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `SimpleMessageTable` (`uid`,`type`,`time`,`content`,`activityNum`,`fansNum`,`visitorNum`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SimpleMessage simpleMessage) {
            SimpleMessage simpleMessage2 = simpleMessage;
            supportSQLiteStatement.bindLong(1, simpleMessage2.getUid());
            supportSQLiteStatement.bindLong(2, simpleMessage2.getType());
            supportSQLiteStatement.bindLong(3, simpleMessage2.getTime());
            SimpleMessage.ActivityMessage activityMessage = simpleMessage2.getActivityMessage();
            if (activityMessage != null) {
                if (activityMessage.getContent() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, activityMessage.getContent());
                }
                supportSQLiteStatement.bindLong(5, activityMessage.getActivityNum());
            } else {
                supportSQLiteStatement.bindNull(4);
                supportSQLiteStatement.bindNull(5);
            }
            SimpleMessage.FansMessage fansMessage = simpleMessage2.getFansMessage();
            if (fansMessage != null) {
                supportSQLiteStatement.bindLong(6, fansMessage.getFansNum());
            } else {
                supportSQLiteStatement.bindNull(6);
            }
            SimpleMessage.VisitorMessage visitorMessage = simpleMessage2.getVisitorMessage();
            if (visitorMessage != null) {
                supportSQLiteStatement.bindLong(7, visitorMessage.getVisitorNum());
            } else {
                supportSQLiteStatement.bindNull(7);
            }
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update SimpleMessageTable set fansNum = ? Where uid = ? and type = 2";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update SimpleMessageTable set visitorNum = ? Where uid = ? and type = 3";
        }
    }

    public class OooO0o extends o0000OO0 {
        public OooO0o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update SimpleMessageTable set activityNum = ? Where uid = ? and type = 1";
        }
    }

    public class OooOO0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41087OooO00o;

        public OooOO0(o0000O0 o0000o1) {
            this.f41087OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o0ooOOo.this.f41080OooO00o.OooOOO(this.f41087OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41087OooO00o.release();
        }
    }

    public class OooOO0O implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41089OooO00o;

        public OooOO0O(o0000O0 o0000o1) {
            this.f41089OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o0ooOOo.this.f41080OooO00o.OooOOO(this.f41089OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41089OooO00o.release();
        }
    }

    public o0ooOOo(RoomDatabase roomDatabase) {
        this.f41080OooO00o = roomDatabase;
        this.f41081OooO0O0 = new OooO00o(roomDatabase);
        this.f41082OooO0OO = new OooO0O0(roomDatabase);
        this.f41083OooO0Oo = new OooO0OO(roomDatabase);
        this.f41084OooO0o0 = new OooO0o(roomDatabase);
    }

    @Override // p490o0o00O0.o00oO0o
    public final Flow<Integer> OooO(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select visitorNum from SimpleMessageTable Where uid = ? and type = 3", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41080OooO00o, new String[]{"SimpleMessageTable"}, new OooOO0(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o00oO0o
    public final void OooO00o(long j) {
        this.f41080OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41082OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        this.f41080OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41080OooO00o.OooOOOO();
        } finally {
            this.f41080OooO00o.OooOO0O();
            this.f41082OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final void OooO0O0(long j) {
        this.f41080OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41084OooO0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        this.f41080OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41080OooO00o.OooOOOO();
        } finally {
            this.f41080OooO00o.OooOO0O();
            this.f41084OooO0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final SimpleMessage OooO0OO(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from SimpleMessageTable Where uid = ? and type = 1", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41080OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41080OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "type");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "content");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "activityNum");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "fansNum");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooOOO.moveToFirst()) {
                if (cursorOooOOO.isNull(iOooO00o4) && cursorOooOOO.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooOOO.getInt(iOooO00o5));
                }
                if (cursorOooOOO.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooOOO.getInt(iOooO00o6));
                }
                if (!cursorOooOOO.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooOOO.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooOOO.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooOOO.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooOOO.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final void OooO0Oo(long j) {
        this.f41080OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41083OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, 0);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        this.f41080OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41080OooO00o.OooOOOO();
        } finally {
            this.f41080OooO00o.OooOO0O();
            this.f41083OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final SimpleMessage OooO0o(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from SimpleMessageTable Where uid = ? and type = 2", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41080OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41080OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "type");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "content");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "activityNum");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "fansNum");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooOOO.moveToFirst()) {
                if (cursorOooOOO.isNull(iOooO00o4) && cursorOooOOO.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooOOO.getInt(iOooO00o5));
                }
                if (cursorOooOOO.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooOOO.getInt(iOooO00o6));
                }
                if (!cursorOooOOO.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooOOO.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooOOO.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooOOO.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooOOO.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final Flow<Integer> OooO0o0(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select fansNum from SimpleMessageTable Where uid = ? and type = 2", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41080OooO00o, new String[]{"SimpleMessageTable"}, new OooO(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o00oO0o
    public final Flow<Integer> OooO0oO(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select activityNum from SimpleMessageTable Where uid = ? and type = 1", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41080OooO00o, new String[]{"SimpleMessageTable"}, new OooOO0O(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o00oO0o
    public final void OooO0oo(SimpleMessage simpleMessage) {
        this.f41080OooO00o.OooO0O0();
        this.f41080OooO00o.OooO0OO();
        try {
            this.f41081OooO0O0.OooO0oO(simpleMessage);
            this.f41080OooO00o.OooOOOO();
        } finally {
            this.f41080OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.o00oO0o
    public final SimpleMessage OooOO0(long j) {
        SimpleMessage.ActivityMessage activityMessage;
        SimpleMessage.FansMessage fansMessage;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from SimpleMessageTable Where uid = ? and type = 3", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41080OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41080OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "type");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "content");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "activityNum");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "fansNum");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "visitorNum");
            SimpleMessage simpleMessage = null;
            SimpleMessage.VisitorMessage visitorMessage = null;
            if (cursorOooOOO.moveToFirst()) {
                if (cursorOooOOO.isNull(iOooO00o4) && cursorOooOOO.isNull(iOooO00o5)) {
                    activityMessage = null;
                } else {
                    activityMessage = new SimpleMessage.ActivityMessage();
                    activityMessage.setContent(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    activityMessage.setActivityNum(cursorOooOOO.getInt(iOooO00o5));
                }
                if (cursorOooOOO.isNull(iOooO00o6)) {
                    fansMessage = null;
                } else {
                    fansMessage = new SimpleMessage.FansMessage();
                    fansMessage.setFansNum(cursorOooOOO.getInt(iOooO00o6));
                }
                if (!cursorOooOOO.isNull(iOooO00o7)) {
                    visitorMessage = new SimpleMessage.VisitorMessage();
                    visitorMessage.setVisitorNum(cursorOooOOO.getInt(iOooO00o7));
                }
                SimpleMessage simpleMessage2 = new SimpleMessage();
                simpleMessage2.setUid(cursorOooOOO.getLong(iOooO00o));
                simpleMessage2.setType(cursorOooOOO.getInt(iOooO00o2));
                simpleMessage2.setTime(cursorOooOOO.getLong(iOooO00o3));
                simpleMessage2.setActivityMessage(activityMessage);
                simpleMessage2.setFansMessage(fansMessage);
                simpleMessage2.setVisitorMessage(visitorMessage);
                simpleMessage = simpleMessage2;
            }
            return simpleMessage;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}
