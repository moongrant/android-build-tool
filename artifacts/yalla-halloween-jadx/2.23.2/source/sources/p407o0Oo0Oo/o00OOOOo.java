package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends o000Oo0 {
    public o00OOOOo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "Delete from MomentMessageTable Where uid =? and userId_CommentPraise = ? and type =? and momentId_CommentPraise = ?";
    }
}
