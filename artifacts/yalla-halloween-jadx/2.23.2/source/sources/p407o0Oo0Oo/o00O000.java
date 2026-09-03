package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends o000Oo0 {
    public o00O000(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "delete from FriendRequestMessageTable Where uid = ? and targetUserId = ?";
    }
}
