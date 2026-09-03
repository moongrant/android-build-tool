package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends o000Oo0 {
    public o0O0o0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE from SearchHistoryTable Where time in(SELECT time FROM SearchHistoryTable Where uid = ? and type =? ORDER BY time desc limit ?,?)";
    }
}
