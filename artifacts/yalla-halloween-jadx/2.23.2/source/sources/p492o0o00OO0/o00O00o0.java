package p492o0o00OO0;

import android.widget.TextView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f49159OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(MomentMessageListActivity momentMessageListActivity) {
        super(0);
        this.f49159OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentMessageListActivity.f25667OooOoOO;
        MomentMessageListActivity momentMessageListActivity = this.f49159OooO0Oo;
        if (momentMessageListActivity.OooOoO0().getItemCount() > 0) {
            TextView textView = momentMessageListActivity.f25673OooOo0o;
            if (textView != null) {
                o000O.OooOOOO(textView);
            }
            momentMessageListActivity.OooOo().f44978OooO0o.OooO0Oo();
        } else {
            TextView textView2 = momentMessageListActivity.f25673OooOo0o;
            if (textView2 != null) {
                o000O.OooO0O0(textView2);
            }
            momentMessageListActivity.OooOo().f44978OooO0o.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
