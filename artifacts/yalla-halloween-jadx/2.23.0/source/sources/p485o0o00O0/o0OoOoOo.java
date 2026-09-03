package p485o0o00O0;

import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f48007OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(MomentSendActivity momentSendActivity) {
        super(1);
        this.f48007OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MomentSendActivity momentSendActivity = this.f48007OooO0Oo;
        if (zBooleanValue) {
            int i = MomentSendActivity.f26175Oooo0OO;
            momentSendActivity.OooOo().f58559OooO0o0.setHint(momentSendActivity.f26179OooOo00);
            momentSendActivity.OooOoOO().setShareType(momentSendActivity.f26178OooOo0);
            momentSendActivity.OooOo().f58558OooO0o.OooO0o(true);
            NoScrollRecyclerView noScrollRecyclerView = momentSendActivity.OooOo().f58557OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(noScrollRecyclerView, "binding.imagesRecyclerView");
            o000OO00.OooOOOO(noScrollRecyclerView);
            momentSendActivity.OooOo().f58559OooO0o0.setMinLines(6);
        } else {
            int i2 = MomentSendActivity.f26175Oooo0OO;
            momentSendActivity.OooOo().f58558OooO0o.OooO0o(false);
            if (momentSendActivity.f26178OooOo0 == -1) {
                momentSendActivity.f26178OooOo0 = momentSendActivity.OooOoOO().getShareType();
            }
            if (momentSendActivity.f26179OooOo00.length() == 0) {
                momentSendActivity.f26179OooOo00 = momentSendActivity.OooOo().f58559OooO0o0.getHint().toString();
            }
            momentSendActivity.OooOoOO().setShareType(21);
            momentSendActivity.OooOo().f58559OooO0o0.setHint(o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.Send_Moment_Poll_Title_Hint));
            NoScrollRecyclerView noScrollRecyclerView2 = momentSendActivity.OooOo().f58557OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(noScrollRecyclerView2, "binding.imagesRecyclerView");
            o000OO00.OooO0O0(noScrollRecyclerView2);
            momentSendActivity.OooOo().f58559OooO0o0.setMinLines(2);
        }
        return Unit.INSTANCE;
    }
}
