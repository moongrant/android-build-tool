package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends o000Oo0 {
    public o00oO0o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "Update ChatMessageTable SET momentImage = ?, momentText = ?, momentMsg = ?, momentType = ? WHERE mid = ? and momentId = ?";
    }
}
