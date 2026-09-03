package p403o0Oo0OOo;

import android.database.Cursor;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.util.ArrayList;
import o000O.OooO00o;
import p072o000O0oO.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000 extends Oooo0<YallaTeamMessage> {
    @Override // p072o000O0oO.Oooo0
    public final ArrayList OooO0o0(Cursor cursor) {
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        int iOooO00o = OooO00o.OooO00o(cursor, "uid");
        int iOooO00o2 = OooO00o.OooO00o(cursor, "mid");
        int iOooO00o3 = OooO00o.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        int iOooO00o4 = OooO00o.OooO00o(cursor, "buriedPointSource");
        int iOooO00o5 = OooO00o.OooO00o(cursor, "buriedPointMessageId");
        int iOooO00o6 = OooO00o.OooO00o(cursor, "type");
        int iOooO00o7 = OooO00o.OooO00o(cursor, "messageType");
        int iOooO00o8 = OooO00o.OooO00o(cursor, "jumpType");
        int iOooO00o9 = OooO00o.OooO00o(cursor, "jumpId");
        int iOooO00o10 = OooO00o.OooO00o(cursor, "coverImage");
        int iOooO00o11 = OooO00o.OooO00o(cursor, "detailImage");
        int iOooO00o12 = OooO00o.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_TITLE);
        int iOooO00o13 = OooO00o.OooO00o(cursor, "detailTitle");
        int iOooO00o14 = OooO00o.OooO00o(cursor, "time");
        int iOooO00o15 = OooO00o.OooO00o(cursor, "isRead");
        int iOooO00o16 = OooO00o.OooO00o(cursor, "surveyMessageId");
        int i = iOooO00o14;
        int iOooO00o17 = OooO00o.OooO00o(cursor, "surveyIsSubmit");
        int i2 = iOooO00o13;
        int iOooO00o18 = OooO00o.OooO00o(cursor, "surveyScore");
        int i3 = iOooO00o12;
        int i4 = iOooO00o11;
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            if (cursor.isNull(iOooO00o16) && cursor.isNull(iOooO00o17) && cursor.isNull(iOooO00o18)) {
                satisfactionSurvey = null;
            } else {
                satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                satisfactionSurvey.setMessageId(cursor.getLong(iOooO00o16));
                satisfactionSurvey.setSubmit(cursor.getInt(iOooO00o17) != 0);
                satisfactionSurvey.setScore(cursor.getInt(iOooO00o18));
            }
            YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
            int i5 = iOooO00o18;
            int i6 = iOooO00o17;
            yallaTeamMessage.setUid(cursor.getLong(iOooO00o));
            yallaTeamMessage.setMid(cursor.isNull(iOooO00o2) ? null : cursor.getString(iOooO00o2));
            yallaTeamMessage.setMessage(cursor.isNull(iOooO00o3) ? null : cursor.getString(iOooO00o3));
            yallaTeamMessage.setBuriedPointSource(cursor.isNull(iOooO00o4) ? null : cursor.getString(iOooO00o4));
            yallaTeamMessage.setBuriedPointMessageId(cursor.isNull(iOooO00o5) ? null : cursor.getString(iOooO00o5));
            yallaTeamMessage.setType(cursor.getInt(iOooO00o6));
            yallaTeamMessage.setMessageType(cursor.getInt(iOooO00o7));
            yallaTeamMessage.setJumpType(cursor.getInt(iOooO00o8));
            int i7 = iOooO00o9;
            yallaTeamMessage.setJumpId(cursor.isNull(i7) ? null : cursor.getString(i7));
            int i8 = iOooO00o10;
            yallaTeamMessage.setCoverImage(cursor.isNull(i8) ? null : cursor.getString(i8));
            int i9 = i4;
            yallaTeamMessage.setDetailImage(cursor.isNull(i9) ? null : cursor.getString(i9));
            int i10 = i3;
            yallaTeamMessage.setTitle(cursor.isNull(i10) ? null : cursor.getString(i10));
            int i11 = i2;
            i2 = i11;
            yallaTeamMessage.setDetailTitle(cursor.isNull(i11) ? null : cursor.getString(i11));
            int i12 = iOooO00o3;
            int i13 = i;
            int i14 = iOooO00o2;
            yallaTeamMessage.setTime(cursor.getLong(i13));
            int i15 = iOooO00o15;
            yallaTeamMessage.setRead(cursor.getInt(i15) != 0);
            yallaTeamMessage.setSatisfactionSurvey(satisfactionSurvey);
            arrayList.add(yallaTeamMessage);
            iOooO00o15 = i15;
            iOooO00o9 = i7;
            iOooO00o2 = i14;
            iOooO00o3 = i12;
            i3 = i10;
            i4 = i9;
            iOooO00o18 = i5;
            i = i13;
            iOooO00o = iOooO00o;
            iOooO00o17 = i6;
            iOooO00o10 = i8;
        }
        return arrayList;
    }
}
