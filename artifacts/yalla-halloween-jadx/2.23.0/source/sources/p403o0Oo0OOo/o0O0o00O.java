package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends o000000 {
    public o0O0o00O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "update FriendRequestMessageTable set state = 2 Where uid = ? and targetUserId = ? and state = 0";
    }
}
