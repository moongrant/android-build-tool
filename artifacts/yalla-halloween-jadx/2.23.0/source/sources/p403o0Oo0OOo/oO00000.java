package p403o0Oo0OOo;

import com.yalla.yalla.data.db.YlAppDataBase;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 extends o000000 {
    public oO00000(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "Delete from MomentMessageTable Where uid =? and userId_MomentComment = ? and type =? and momentId_MomentComment = ? and commentId_MomentComment = ?";
    }
}
