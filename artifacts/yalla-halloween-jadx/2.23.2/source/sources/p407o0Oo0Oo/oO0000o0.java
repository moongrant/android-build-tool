package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p110o000ooo0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 implements oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00000o f45868OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0000O f45869OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0000Oo f45870OooO0Oo;

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45871OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45871OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(oO0000o0.this.f45867OooO00o, this.f45871OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45871OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45873OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45873OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(oO0000o0.this.f45867OooO00o, this.f45873OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45873OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<YallaTeamMessage> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f45875OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f45875OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final YallaTeamMessage call() throws Exception {
            YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
            Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(oO0000o0.this.f45867OooO00o, this.f45875OooO00o);
            try {
                int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "mid");
                int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "buriedPointSource");
                int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "buriedPointMessageId");
                int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
                int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "messageType");
                int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "jumpType");
                int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "jumpId");
                int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "coverImage");
                int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "detailImage");
                int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "detailTitle");
                int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "isRead");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyMessageId");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyIsSubmit");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyScore");
                YallaTeamMessage yallaTeamMessage = null;
                String string = null;
                if (cursorOooO0O0.moveToFirst()) {
                    if (cursorOooO0O0.isNull(iOooO00o16) && cursorOooO0O0.isNull(iOooO00o17) && cursorOooO0O0.isNull(iOooO00o18)) {
                        satisfactionSurvey = null;
                    } else {
                        satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                        satisfactionSurvey.setMessageId(cursorOooO0O0.getLong(iOooO00o16));
                        satisfactionSurvey.setSubmit(cursorOooO0O0.getInt(iOooO00o17) != 0);
                        satisfactionSurvey.setScore(cursorOooO0O0.getInt(iOooO00o18));
                    }
                    YallaTeamMessage yallaTeamMessage2 = new YallaTeamMessage();
                    yallaTeamMessage2.setUid(cursorOooO0O0.getLong(iOooO00o));
                    yallaTeamMessage2.setMid(cursorOooO0O0.isNull(iOooO00o2) ? null : cursorOooO0O0.getString(iOooO00o2));
                    yallaTeamMessage2.setMessage(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                    yallaTeamMessage2.setBuriedPointSource(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                    yallaTeamMessage2.setBuriedPointMessageId(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getString(iOooO00o5));
                    yallaTeamMessage2.setType(cursorOooO0O0.getInt(iOooO00o6));
                    yallaTeamMessage2.setMessageType(cursorOooO0O0.getInt(iOooO00o7));
                    yallaTeamMessage2.setJumpType(cursorOooO0O0.getInt(iOooO00o8));
                    yallaTeamMessage2.setJumpId(cursorOooO0O0.isNull(iOooO00o9) ? null : cursorOooO0O0.getString(iOooO00o9));
                    yallaTeamMessage2.setCoverImage(cursorOooO0O0.isNull(iOooO00o10) ? null : cursorOooO0O0.getString(iOooO00o10));
                    yallaTeamMessage2.setDetailImage(cursorOooO0O0.isNull(iOooO00o11) ? null : cursorOooO0O0.getString(iOooO00o11));
                    yallaTeamMessage2.setTitle(cursorOooO0O0.isNull(iOooO00o12) ? null : cursorOooO0O0.getString(iOooO00o12));
                    if (!cursorOooO0O0.isNull(iOooO00o13)) {
                        string = cursorOooO0O0.getString(iOooO00o13);
                    }
                    yallaTeamMessage2.setDetailTitle(string);
                    yallaTeamMessage2.setTime(cursorOooO0O0.getLong(iOooO00o14));
                    yallaTeamMessage2.setRead(cursorOooO0O0.getInt(iOooO00o15) != 0);
                    yallaTeamMessage2.setSatisfactionSurvey(satisfactionSurvey);
                    yallaTeamMessage = yallaTeamMessage2;
                }
                return yallaTeamMessage;
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f45875OooO00o.release();
        }
    }

    public oO0000o0(YlAppDataBase ylAppDataBase) {
        this.f45867OooO00o = ylAppDataBase;
        this.f45868OooO0O0 = new oO00000o(ylAppDataBase);
        this.f45869OooO0OO = new oO0000O(ylAppDataBase);
        this.f45870OooO0Oo = new oO0000Oo(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.oO00000
    public final Flow<Integer> OooO00o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select count() from YallaTeamMessageTable where uid = ? and isRead = 0");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45867OooO00o, new String[]{"YallaTeamMessageTable"}, oooO0O0);
    }

    @Override // p407o0Oo0Oo.oO00000
    public final Flow<Integer> OooO0O0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select count() from YallaTeamMessageTable where uid = ? ");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45867OooO00o, new String[]{"YallaTeamMessageTable"}, oooO00o);
    }

    @Override // p407o0Oo0Oo.oO00000
    public final Flow<YallaTeamMessage> OooO0OO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select * from YallaTeamMessageTable where uid = ? order by time desc limit 1");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return oo000o.OooO00o(this.f45867OooO00o, new String[]{"YallaTeamMessageTable"}, oooO0OO);
    }

    @Override // p407o0Oo0Oo.oO00000
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f45867OooO00o;
        roomDatabase.OooO0O0();
        oO0000Oo oo0000oo = this.f45870OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0000oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oo0000oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.oO00000
    public final ArrayList OooO0o(long j, long j2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "select * from YallaTeamMessageTable where uid = ? and surveyMessageId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j2);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        RoomDatabase roomDatabase = this.f45867OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "mid");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "buriedPointSource");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "buriedPointMessageId");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "messageType");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "jumpType");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "jumpId");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "coverImage");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "detailImage");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "detailTitle");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "time");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "isRead");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyMessageId");
                int i = iOooO00o14;
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyIsSubmit");
                int i2 = iOooO00o13;
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "surveyScore");
                int i3 = iOooO00o12;
                int i4 = iOooO00o11;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    if (cursorOooO0O0.isNull(iOooO00o16) && cursorOooO0O0.isNull(iOooO00o17) && cursorOooO0O0.isNull(iOooO00o18)) {
                        satisfactionSurvey = null;
                    } else {
                        satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                        satisfactionSurvey.setMessageId(cursorOooO0O0.getLong(iOooO00o16));
                        satisfactionSurvey.setSubmit(cursorOooO0O0.getInt(iOooO00o17) != 0);
                        satisfactionSurvey.setScore(cursorOooO0O0.getInt(iOooO00o18));
                    }
                    YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
                    int i5 = iOooO00o18;
                    int i6 = iOooO00o17;
                    yallaTeamMessage.setUid(cursorOooO0O0.getLong(iOooO00o));
                    yallaTeamMessage.setMid(cursorOooO0O0.isNull(iOooO00o2) ? null : cursorOooO0O0.getString(iOooO00o2));
                    yallaTeamMessage.setMessage(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                    yallaTeamMessage.setBuriedPointSource(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                    yallaTeamMessage.setBuriedPointMessageId(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getString(iOooO00o5));
                    yallaTeamMessage.setType(cursorOooO0O0.getInt(iOooO00o6));
                    yallaTeamMessage.setMessageType(cursorOooO0O0.getInt(iOooO00o7));
                    yallaTeamMessage.setJumpType(cursorOooO0O0.getInt(iOooO00o8));
                    int i7 = iOooO00o9;
                    yallaTeamMessage.setJumpId(cursorOooO0O0.isNull(i7) ? null : cursorOooO0O0.getString(i7));
                    int i8 = iOooO00o10;
                    yallaTeamMessage.setCoverImage(cursorOooO0O0.isNull(i8) ? null : cursorOooO0O0.getString(i8));
                    int i9 = i4;
                    yallaTeamMessage.setDetailImage(cursorOooO0O0.isNull(i9) ? null : cursorOooO0O0.getString(i9));
                    i3 = i3;
                    yallaTeamMessage.setTitle(cursorOooO0O0.isNull(i3) ? null : cursorOooO0O0.getString(i3));
                    int i10 = i2;
                    i2 = i10;
                    yallaTeamMessage.setDetailTitle(cursorOooO0O0.isNull(i10) ? null : cursorOooO0O0.getString(i10));
                    int i11 = i;
                    int i12 = iOooO00o16;
                    yallaTeamMessage.setTime(cursorOooO0O0.getLong(i11));
                    int i13 = iOooO00o15;
                    yallaTeamMessage.setRead(cursorOooO0O0.getInt(i13) != 0);
                    yallaTeamMessage.setSatisfactionSurvey(satisfactionSurvey);
                    arrayList.add(yallaTeamMessage);
                    iOooO00o16 = i12;
                    i = i11;
                    iOooO00o15 = i13;
                    iOooO00o17 = i6;
                    iOooO00o10 = i8;
                    i4 = i9;
                    iOooO00o9 = i7;
                    iOooO00o18 = i5;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p407o0Oo0Oo.oO00000
    public final void OooO0o0(long j) {
        RoomDatabase roomDatabase = this.f45867OooO00o;
        roomDatabase.OooO0O0();
        oO0000O oo0000o = this.f45869OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0000o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oo0000o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.oO00000
    public final void OooO0oO(YallaTeamMessage yallaTeamMessage) {
        RoomDatabase roomDatabase = this.f45867OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45868OooO0O0.OooO0oO(yallaTeamMessage);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.oO00000
    public final oO000 OooO0oo(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select * from YallaTeamMessageTable where uid = ? order by time desc");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new oO000(roomSQLiteQueryOooO00o, this.f45867OooO00o, "YallaTeamMessageTable");
    }
}
