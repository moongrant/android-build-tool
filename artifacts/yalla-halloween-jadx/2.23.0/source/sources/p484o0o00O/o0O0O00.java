package p484o0o00O;

import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47748OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f47748OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        UserTagView userTagView = this.f47748OooO0Oo.f26454OooO0o0.f59169OooOOo;
        if (str2 == null) {
            str2 = "";
        }
        userTagView.setName(str2);
        return null;
    }
}
