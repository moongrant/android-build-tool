package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends o000000 {
    public o0O000Oo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "Update ConversationTable Set sendState = -1 Where uid = ? and sendState = 0";
    }
}
