package p496o0o00Oo0;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49636OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f49636OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyActivity activity = this.f49636OooO0Oo.getActivity();
        int i = MomentReplyActivity.f25700OooOoO;
        activity.OooOooO(0L);
        return Unit.INSTANCE;
    }
}
