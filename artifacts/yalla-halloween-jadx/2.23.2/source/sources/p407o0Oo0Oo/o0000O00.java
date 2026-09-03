package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends o000Oo0 {
    public o0000O00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "Update  ChatMessageTable set emoticonIsRead =? where targetId = ? and uid=? and emoticonIsRead =?";
    }
}
