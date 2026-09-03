package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends o000Oo0 {
    public o00OO00O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "delete from MomentMessageTable Where uid =? and (type <> ? and type <> ? and type <> ? and type <> ? and type <> ? and type <> ? and type <> ? )";
    }
}
