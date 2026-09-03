package p403o0Oo0OOo;

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

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 implements oO0oO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oOo00o00 f44642OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO f44643OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oOO00000 f44644OooO0Oo;

    public class OooO00o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44645OooO00o;

        public OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44645OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(oOO0000.this.f44641OooO00o, this.f44645OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44645OooO00o.release();
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44647OooO00o;

        public OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44647OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(oOO0000.this.f44641OooO00o, this.f44647OooO00o);
            try {
                return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
            } finally {
                cursorOooO0O0.close();
            }
        }

        public final void finalize() {
            this.f44647OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<YallaTeamMessage> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f44649OooO00o;

        public OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44649OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final YallaTeamMessage call() throws Exception {
            YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
            Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(oOO0000.this.f44641OooO00o, this.f44649OooO00o);
            try {
                int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
                int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "mid");
                int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "buriedPointSource");
                int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "buriedPointMessageId");
                int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "type");
                int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "messageType");
                int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "jumpType");
                int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "jumpId");
                int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "coverImage");
                int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "detailImage");
                int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "detailTitle");
                int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isRead");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyMessageId");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyIsSubmit");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyScore");
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
            this.f44649OooO00o.release();
        }
    }

    public oOO0000(YlAppDataBase ylAppDataBase) {
        this.f44641OooO00o = ylAppDataBase;
        this.f44642OooO0O0 = new oOo00o00(ylAppDataBase);
        this.f44643OooO0OO = new oO(ylAppDataBase);
        this.f44644OooO0Oo = new oOO00000(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final Flow<Integer> OooO00o(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select count() from YallaTeamMessageTable where uid = ? and isRead = 0");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0O0 oooO0O0 = new OooO0O0(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44641OooO00o, new String[]{"YallaTeamMessageTable"}, oooO0O0);
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final Flow<Integer> OooO0O0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select count() from YallaTeamMessageTable where uid = ? ");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO00o oooO00o = new OooO00o(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44641OooO00o, new String[]{"YallaTeamMessageTable"}, oooO00o);
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final Flow<YallaTeamMessage> OooO0OO(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select * from YallaTeamMessageTable where uid = ? order by time desc limit 1");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        OooO0OO oooO0OO = new OooO0OO(roomSQLiteQueryOooO00o);
        return o000O0O0.OooO0OO.OooO00o(this.f44641OooO00o, new String[]{"YallaTeamMessageTable"}, oooO0OO);
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final void OooO0Oo(long j) {
        RoomDatabase roomDatabase = this.f44641OooO00o;
        roomDatabase.OooO0O0();
        oOO00000 ooo00000 = this.f44644OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = ooo00000.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            ooo00000.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final ArrayList OooO0o(long j, long j2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "select * from YallaTeamMessageTable where uid = ? and surveyMessageId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j2);
        roomSQLiteQueryOooO00o.bindLong(2, j);
        RoomDatabase roomDatabase = this.f44641OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "mid");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "buriedPointSource");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "buriedPointMessageId");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "messageType");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "jumpType");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "jumpId");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "coverImage");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "detailImage");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, ShareConstants.WEB_DIALOG_PARAM_TITLE);
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "detailTitle");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "time");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "isRead");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyMessageId");
                int i = iOooO00o14;
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyIsSubmit");
                int i2 = iOooO00o13;
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "surveyScore");
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

    @Override // p403o0Oo0OOo.oO0oO000
    public final void OooO0o0(long j) {
        RoomDatabase roomDatabase = this.f44641OooO00o;
        roomDatabase.OooO0O0();
        oO oOVar = this.f44643OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oOVar.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oOVar.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final void OooO0oO(YallaTeamMessage yallaTeamMessage) {
        RoomDatabase roomDatabase = this.f44641OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44642OooO0O0.OooO0o(yallaTeamMessage);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO0oO000
    public final oOO000 OooO0oo(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "select * from YallaTeamMessageTable where uid = ? order by time desc");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        return new oOO000(roomSQLiteQueryOooO00o, this.f44641OooO00o, "YallaTeamMessageTable");
    }
}
