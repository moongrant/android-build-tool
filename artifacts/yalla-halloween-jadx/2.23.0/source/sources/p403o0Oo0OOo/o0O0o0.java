package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends o000000 {
    public o0O0o0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "update FriendRequestMessageTable set isRead = 1 where uid = ? and isRead = 0 ";
    }
}
