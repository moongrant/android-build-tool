package p407o0Oo0Oo;

import com.yalla.yalla.data.db.YlAppDataBase;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends o000Oo0 {
    public o00Oo00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "Delete from MomentMessageTable Where uid =? and userId_CommentReply = ? and type =? and momentId_CommentReply = ? and commentId_CommentReply = ?";
    }
}
