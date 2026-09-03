package p564o0oOo0O;

import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56378OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56378OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        UserTagView userTagView = this.f56378OooO0Oo.f30537OooO0Oo.f45075OooOoo;
        if (str2 == null) {
            str2 = "";
        }
        userTagView.setName(str2);
        return null;
    }
}
