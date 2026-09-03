package p153o00Oo0oO;

import android.text.TextUtils;
import com.yalla.yalla.model.MomentSendCommentModel;
import java.util.Map;
import p160o00OoOO0.o00OO0O0;
import p487o0o000oO.o0OOO0o;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    public final void OooO00o(String str, String str2, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("dyid", str);
        mapOooO0O0.put("cid", str2);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32301o0000OoO, mapOooO0O0, oooO0O0);
    }

    public final void OooO0O0(MomentSendCommentModel momentSendCommentModel, o00OO0O0.OooO0O0 oooO0O0) {
        if (momentSendCommentModel == null) {
            return;
        }
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("dyid", momentSendCommentModel.getDyid());
        if (!TextUtils.isEmpty(momentSendCommentModel.getCid())) {
            mapOooO0O0.put("cid", momentSendCommentModel.getCid());
        }
        if (!TextUtils.isEmpty(momentSendCommentModel.getParentUserId()) && !TextUtils.isEmpty(momentSendCommentModel.getParentUserName())) {
            mapOooO0O0.put("parentUserId", momentSendCommentModel.getParentUserId());
            mapOooO0O0.put("parentUserName", o000oOoO.OooO0O0(momentSendCommentModel.getParentUserName()) + "");
        }
        if (!o0OOO0o.OooO0Oo()) {
            mapOooO0O0.put("content", momentSendCommentModel.getContent().toJSONString());
            o00O00.OooO0O0("commentWrite params  = " + mapOooO0O0);
        }
        mapOooO0O0.put("content", o000oOoO.OooO0O0(momentSendCommentModel.getContent().toJSONString()) + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32299o0000Oo, mapOooO0O0, oooO0O0);
    }

    public final void OooO0OO(String str, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("roomid", str);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32305o0000o0O, mapOooO0O0, oooO0O0);
    }
}
