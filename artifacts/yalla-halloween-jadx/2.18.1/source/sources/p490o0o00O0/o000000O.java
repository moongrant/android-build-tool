package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p089o000o000.o00O00o0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0Oo0oo;
import p092o000o0O.o00O0O;
import p093o000o0O0.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41029OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<YallaTeamMessage> f41030OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f41031OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f41032OooO0Oo;

    public class OooO implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41033OooO00o;

        public OooO(o0000O0 o0000o1) {
            this.f41033OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o000000O.this.f41029OooO00o.OooOOO(this.f41033OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41033OooO00o.release();
        }
    }

    public class OooO00o extends o000OOo<YallaTeamMessage> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `YallaTeamMessageTable` (`uid`,`mid`,`type`,`message`,`messageType`,`jumpType`,`jumpId`,`coverImage`,`detailImage`,`title`,`detailTitle`,`time`,`isRead`,`surveyMessageId`,`surveyIsSubmit`,`surveyScore`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, YallaTeamMessage yallaTeamMessage) {
            YallaTeamMessage yallaTeamMessage2 = yallaTeamMessage;
            supportSQLiteStatement.bindLong(1, yallaTeamMessage2.getUid());
            if (yallaTeamMessage2.getMid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, yallaTeamMessage2.getMid());
            }
            supportSQLiteStatement.bindLong(3, yallaTeamMessage2.getType());
            if (yallaTeamMessage2.getMessage() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, yallaTeamMessage2.getMessage());
            }
            supportSQLiteStatement.bindLong(5, yallaTeamMessage2.getMessageType());
            supportSQLiteStatement.bindLong(6, yallaTeamMessage2.getJumpType());
            if (yallaTeamMessage2.getJumpId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, yallaTeamMessage2.getJumpId());
            }
            if (yallaTeamMessage2.getCoverImage() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, yallaTeamMessage2.getCoverImage());
            }
            if (yallaTeamMessage2.getDetailImage() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, yallaTeamMessage2.getDetailImage());
            }
            if (yallaTeamMessage2.getTitle() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, yallaTeamMessage2.getTitle());
            }
            if (yallaTeamMessage2.getDetailTitle() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, yallaTeamMessage2.getDetailTitle());
            }
            supportSQLiteStatement.bindLong(12, yallaTeamMessage2.getTime());
            supportSQLiteStatement.bindLong(13, yallaTeamMessage2.getIsRead() ? 1L : 0L);
            YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = yallaTeamMessage2.getSatisfactionSurvey();
            if (satisfactionSurvey != null) {
                supportSQLiteStatement.bindLong(14, satisfactionSurvey.getMessageId());
                supportSQLiteStatement.bindLong(15, satisfactionSurvey.getIsSubmit() ? 1L : 0L);
                supportSQLiteStatement.bindLong(16, satisfactionSurvey.getScore());
            } else {
                supportSQLiteStatement.bindNull(14);
                supportSQLiteStatement.bindNull(15);
                supportSQLiteStatement.bindNull(16);
            }
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "delete from YallaTeamMessageTable where uid = ?";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "update YallaTeamMessageTable set isRead = 1 where uid = ? and isRead = 0";
        }
    }

    public class OooO0o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41035OooO00o;

        public OooO0o(o0000O0 o0000o1) {
            this.f41035OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o000000O.this.f41029OooO00o.OooOOO(this.f41035OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41035OooO00o.release();
        }
    }

    public class OooOO0 implements Callable<YallaTeamMessage> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41037OooO00o;

        public OooOO0(o0000O0 o0000o1) {
            this.f41037OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final YallaTeamMessage call() throws Exception {
            YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
            Cursor cursorOooOOO = o000000O.this.f41029OooO00o.OooOOO(this.f41037OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "mid");
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "type");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "messageType");
                int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "jumpType");
                int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "jumpId");
                int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "coverImage");
                int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "detailImage");
                int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "detailTitle");
                int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "time");
                int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "isRead");
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "surveyMessageId");
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "surveyIsSubmit");
                int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "surveyScore");
                YallaTeamMessage yallaTeamMessage = null;
                String string = null;
                if (cursorOooOOO.moveToFirst()) {
                    if (cursorOooOOO.isNull(iOooO00o14) && cursorOooOOO.isNull(iOooO00o15) && cursorOooOOO.isNull(iOooO00o16)) {
                        satisfactionSurvey = null;
                    } else {
                        satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                        satisfactionSurvey.setMessageId(cursorOooOOO.getLong(iOooO00o14));
                        satisfactionSurvey.setSubmit(cursorOooOOO.getInt(iOooO00o15) != 0);
                        satisfactionSurvey.setScore(cursorOooOOO.getInt(iOooO00o16));
                    }
                    YallaTeamMessage yallaTeamMessage2 = new YallaTeamMessage();
                    yallaTeamMessage2.setUid(cursorOooOOO.getLong(iOooO00o));
                    yallaTeamMessage2.setMid(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                    yallaTeamMessage2.setType(cursorOooOOO.getInt(iOooO00o3));
                    yallaTeamMessage2.setMessage(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    yallaTeamMessage2.setMessageType(cursorOooOOO.getInt(iOooO00o5));
                    yallaTeamMessage2.setJumpType(cursorOooOOO.getInt(iOooO00o6));
                    yallaTeamMessage2.setJumpId(cursorOooOOO.isNull(iOooO00o7) ? null : cursorOooOOO.getString(iOooO00o7));
                    yallaTeamMessage2.setCoverImage(cursorOooOOO.isNull(iOooO00o8) ? null : cursorOooOOO.getString(iOooO00o8));
                    yallaTeamMessage2.setDetailImage(cursorOooOOO.isNull(iOooO00o9) ? null : cursorOooOOO.getString(iOooO00o9));
                    yallaTeamMessage2.setTitle(cursorOooOOO.isNull(iOooO00o10) ? null : cursorOooOOO.getString(iOooO00o10));
                    if (!cursorOooOOO.isNull(iOooO00o11)) {
                        string = cursorOooOOO.getString(iOooO00o11);
                    }
                    yallaTeamMessage2.setDetailTitle(string);
                    yallaTeamMessage2.setTime(cursorOooOOO.getLong(iOooO00o12));
                    yallaTeamMessage2.setRead(cursorOooOOO.getInt(iOooO00o13) != 0);
                    yallaTeamMessage2.setSatisfactionSurvey(satisfactionSurvey);
                    yallaTeamMessage = yallaTeamMessage2;
                }
                return yallaTeamMessage;
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41037OooO00o.release();
        }
    }

    public class OooOO0O extends o000O0<YallaTeamMessage> {
        public OooOO0O(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        @Override // p093o000o0O0.o000O0
        public final List<YallaTeamMessage> OooO0o(Cursor cursor) {
            YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
            int iOooO00o = o00O0O.OooO00o(cursor, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursor, "mid");
            int iOooO00o3 = o00O0O.OooO00o(cursor, "type");
            int iOooO00o4 = o00O0O.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o5 = o00O0O.OooO00o(cursor, "messageType");
            int iOooO00o6 = o00O0O.OooO00o(cursor, "jumpType");
            int iOooO00o7 = o00O0O.OooO00o(cursor, "jumpId");
            int iOooO00o8 = o00O0O.OooO00o(cursor, "coverImage");
            int iOooO00o9 = o00O0O.OooO00o(cursor, "detailImage");
            int iOooO00o10 = o00O0O.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_TITLE);
            int iOooO00o11 = o00O0O.OooO00o(cursor, "detailTitle");
            int iOooO00o12 = o00O0O.OooO00o(cursor, "time");
            int iOooO00o13 = o00O0O.OooO00o(cursor, "isRead");
            int iOooO00o14 = o00O0O.OooO00o(cursor, "surveyMessageId");
            int iOooO00o15 = o00O0O.OooO00o(cursor, "surveyIsSubmit");
            int i = iOooO00o13;
            int iOooO00o16 = o00O0O.OooO00o(cursor, "surveyScore");
            int i2 = iOooO00o12;
            int i3 = iOooO00o11;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                if (cursor.isNull(iOooO00o14) && cursor.isNull(iOooO00o15) && cursor.isNull(iOooO00o16)) {
                    satisfactionSurvey = null;
                } else {
                    satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                    satisfactionSurvey.setMessageId(cursor.getLong(iOooO00o14));
                    satisfactionSurvey.setSubmit(cursor.getInt(iOooO00o15) != 0);
                    satisfactionSurvey.setScore(cursor.getInt(iOooO00o16));
                }
                YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
                int i4 = iOooO00o16;
                int i5 = iOooO00o14;
                yallaTeamMessage.setUid(cursor.getLong(iOooO00o));
                yallaTeamMessage.setMid(cursor.isNull(iOooO00o2) ? null : cursor.getString(iOooO00o2));
                yallaTeamMessage.setType(cursor.getInt(iOooO00o3));
                yallaTeamMessage.setMessage(cursor.isNull(iOooO00o4) ? null : cursor.getString(iOooO00o4));
                yallaTeamMessage.setMessageType(cursor.getInt(iOooO00o5));
                yallaTeamMessage.setJumpType(cursor.getInt(iOooO00o6));
                yallaTeamMessage.setJumpId(cursor.isNull(iOooO00o7) ? null : cursor.getString(iOooO00o7));
                yallaTeamMessage.setCoverImage(cursor.isNull(iOooO00o8) ? null : cursor.getString(iOooO00o8));
                int i6 = iOooO00o9;
                yallaTeamMessage.setDetailImage(cursor.isNull(i6) ? null : cursor.getString(i6));
                int i7 = iOooO00o10;
                yallaTeamMessage.setTitle(cursor.isNull(i7) ? null : cursor.getString(i7));
                int i8 = i3;
                i3 = i8;
                yallaTeamMessage.setDetailTitle(cursor.isNull(i8) ? null : cursor.getString(i8));
                int i9 = iOooO00o3;
                int i10 = i2;
                int i11 = iOooO00o2;
                yallaTeamMessage.setTime(cursor.getLong(i10));
                int i12 = i;
                yallaTeamMessage.setRead(cursor.getInt(i12) != 0);
                yallaTeamMessage.setSatisfactionSurvey(satisfactionSurvey);
                arrayList.add(yallaTeamMessage);
                i = i12;
                iOooO00o9 = i6;
                iOooO00o2 = i11;
                iOooO00o3 = i9;
                iOooO00o16 = i4;
                i2 = i10;
                iOooO00o = iOooO00o;
                iOooO00o14 = i5;
                iOooO00o10 = i7;
            }
            return arrayList;
        }
    }

    public o000000O(RoomDatabase roomDatabase) {
        this.f41029OooO00o = roomDatabase;
        this.f41030OooO0O0 = new OooO00o(roomDatabase);
        this.f41031OooO0OO = new OooO0O0(roomDatabase);
        this.f41032OooO0Oo = new OooO0OO(roomDatabase);
    }

    @Override // p490o0o00O0.o000000
    public final Flow<Integer> OooO00o(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select count() from YallaTeamMessageTable where uid = ? and isRead = 0", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41029OooO00o, new String[]{"YallaTeamMessageTable"}, new OooO(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o000000
    public final void OooO0O0(long j) {
        this.f41029OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41032OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41029OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41029OooO00o.OooOOOO();
        } finally {
            this.f41029OooO00o.OooOO0O();
            this.f41032OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.o000000
    public final void OooO0OO(long j) {
        this.f41029OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41031OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41029OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41029OooO00o.OooOOOO();
        } finally {
            this.f41029OooO00o.OooOO0O();
            this.f41031OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.o000000
    public final Flow<Integer> OooO0Oo(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select count() from YallaTeamMessageTable where uid = ? ", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41029OooO00o, new String[]{"YallaTeamMessageTable"}, new OooO0o(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o000000
    public final void OooO0o(YallaTeamMessage yallaTeamMessage) {
        this.f41029OooO00o.OooO0O0();
        this.f41029OooO00o.OooO0OO();
        try {
            this.f41030OooO0O0.OooO0oO(yallaTeamMessage);
            this.f41029OooO00o.OooOOOO();
        } finally {
            this.f41029OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.o000000
    public final List<YallaTeamMessage> OooO0o0(long j, long j2) throws Throwable {
        o0000O0 o0000o1;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select * from YallaTeamMessageTable where uid = ? and surveyMessageId=?", 2);
        o0000o0OooO0o.bindLong(1, j2);
        o0000o0OooO0o.bindLong(2, j);
        this.f41029OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41029OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "mid");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "type");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "messageType");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "jumpType");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "jumpId");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "coverImage");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "detailImage");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_TITLE);
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "detailTitle");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "isRead");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "surveyMessageId");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "surveyIsSubmit");
                int i = iOooO00o13;
                int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "surveyScore");
                int i2 = iOooO00o12;
                int i3 = iOooO00o11;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    if (cursorOooOOO.isNull(iOooO00o14) && cursorOooOOO.isNull(iOooO00o15) && cursorOooOOO.isNull(iOooO00o16)) {
                        satisfactionSurvey = null;
                    } else {
                        satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                        satisfactionSurvey.setMessageId(cursorOooOOO.getLong(iOooO00o14));
                        satisfactionSurvey.setSubmit(cursorOooOOO.getInt(iOooO00o15) != 0);
                        satisfactionSurvey.setScore(cursorOooOOO.getInt(iOooO00o16));
                    }
                    YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
                    int i4 = iOooO00o16;
                    int i5 = iOooO00o14;
                    yallaTeamMessage.setUid(cursorOooOOO.getLong(iOooO00o));
                    yallaTeamMessage.setMid(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                    yallaTeamMessage.setType(cursorOooOOO.getInt(iOooO00o3));
                    yallaTeamMessage.setMessage(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    yallaTeamMessage.setMessageType(cursorOooOOO.getInt(iOooO00o5));
                    yallaTeamMessage.setJumpType(cursorOooOOO.getInt(iOooO00o6));
                    yallaTeamMessage.setJumpId(cursorOooOOO.isNull(iOooO00o7) ? null : cursorOooOOO.getString(iOooO00o7));
                    yallaTeamMessage.setCoverImage(cursorOooOOO.isNull(iOooO00o8) ? null : cursorOooOOO.getString(iOooO00o8));
                    int i6 = iOooO00o9;
                    yallaTeamMessage.setDetailImage(cursorOooOOO.isNull(i6) ? null : cursorOooOOO.getString(i6));
                    int i7 = iOooO00o10;
                    yallaTeamMessage.setTitle(cursorOooOOO.isNull(i7) ? null : cursorOooOOO.getString(i7));
                    int i8 = i3;
                    i3 = i8;
                    yallaTeamMessage.setDetailTitle(cursorOooOOO.isNull(i8) ? null : cursorOooOOO.getString(i8));
                    int i9 = i2;
                    int i10 = iOooO00o15;
                    int i11 = iOooO00o;
                    yallaTeamMessage.setTime(cursorOooOOO.getLong(i9));
                    int i12 = i;
                    yallaTeamMessage.setRead(cursorOooOOO.getInt(i12) != 0);
                    yallaTeamMessage.setSatisfactionSurvey(satisfactionSurvey);
                    arrayList.add(yallaTeamMessage);
                    iOooO00o = i11;
                    iOooO00o9 = i6;
                    i2 = i9;
                    i = i12;
                    iOooO00o15 = i10;
                    iOooO00o16 = i4;
                    iOooO00o10 = i7;
                    iOooO00o14 = i5;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooOOO.close();
                o0000o1.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0000o1 = o0000o0OooO0o;
        }
    }

    @Override // p490o0o00O0.o000000
    public final Flow<YallaTeamMessage> OooO0oO(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select * from YallaTeamMessageTable where uid = ? order by time desc limit 1", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41029OooO00o, new String[]{"YallaTeamMessageTable"}, new OooOO0(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.o000000
    public final o00O00o0<Integer, YallaTeamMessage> OooO0oo(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select * from YallaTeamMessageTable where uid = ? order by time desc", 1);
        o0000o0OooO0o.bindLong(1, j);
        return new OooOO0O(o0000o0OooO0o, this.f41029OooO00o, "YallaTeamMessageTable");
    }
}
