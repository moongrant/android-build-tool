package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00 extends o000000 {
    public oO0O00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "UPDATE SquareEventRoomTable SET eventCreateTime = ? WHERE uid = ? and targetId=? and roomId=?";
    }
}
