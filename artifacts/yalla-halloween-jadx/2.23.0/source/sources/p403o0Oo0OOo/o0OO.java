package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO extends o000000 {
    public o0OO(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "delete from MomentMessageTable Where uid =? and (type <> ? and type <> ? and type <> ? and type <> ? and type <> ? and type <> ? and type <> ? )";
    }
}
