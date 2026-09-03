package p492o0o00OO0;

import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p423o0OoO0OO.o000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49205OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(MomentSendActivity momentSendActivity) {
        super(1);
        this.f49205OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MomentSendActivity momentSendActivity = this.f49205OooO0Oo;
        if (zBooleanValue) {
            int i = MomentSendActivity.f25726Oooo0OO;
            momentSendActivity.OooOo().f44321OooO0o0.setHint(momentSendActivity.f25730OooOo00);
            momentSendActivity.OooOoOO().setShareType(momentSendActivity.f25729OooOo0);
            momentSendActivity.OooOo().f44320OooO0o.OooO0o(true);
            NoScrollRecyclerView imagesRecyclerView = momentSendActivity.OooOo().f44319OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imagesRecyclerView, "imagesRecyclerView");
            o000O.OooOOOO(imagesRecyclerView);
            momentSendActivity.OooOo().f44321OooO0o0.setMinLines(6);
        } else {
            int i2 = MomentSendActivity.f25726Oooo0OO;
            momentSendActivity.OooOo().f44320OooO0o.OooO0o(false);
            if (momentSendActivity.f25729OooOo0 == -1) {
                momentSendActivity.f25729OooOo0 = momentSendActivity.OooOoOO().getShareType();
            }
            if (momentSendActivity.f25730OooOo00.length() == 0) {
                momentSendActivity.f25730OooOo00 = momentSendActivity.OooOo().f44321OooO0o0.getHint().toString();
            }
            momentSendActivity.OooOoOO().setShareType(21);
            momentSendActivity.OooOo().f44321OooO0o0.setHint(o000.OooO0OO(momentSendActivity, o000000.Send_Moment_Poll_Title_Hint));
            NoScrollRecyclerView imagesRecyclerView2 = momentSendActivity.OooOo().f44319OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imagesRecyclerView2, "imagesRecyclerView");
            o000O.OooO0O0(imagesRecyclerView2);
            momentSendActivity.OooOo().f44321OooO0o0.setMinLines(2);
        }
        return Unit.INSTANCE;
    }
}
