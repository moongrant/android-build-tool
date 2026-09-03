package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00O extends o000000 {
    public oO00o00O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE from SearchHistoryTable Where time in(SELECT time FROM SearchHistoryTable Where uid = ? and type =? ORDER BY time desc limit ?,?)";
    }
}
