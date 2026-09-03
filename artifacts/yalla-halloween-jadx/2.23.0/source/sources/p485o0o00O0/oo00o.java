package p485o0o00O0;

import android.widget.TextView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f48220OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(MomentMessageListActivity momentMessageListActivity) {
        super(0);
        this.f48220OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentMessageListActivity.f26116OooOoOO;
        MomentMessageListActivity momentMessageListActivity = this.f48220OooO0Oo;
        if (momentMessageListActivity.OooOoO0().getItemCount() > 0) {
            TextView textView = momentMessageListActivity.f26122OooOo0o;
            if (textView != null) {
                o000OO00.OooOOOO(textView);
            }
            momentMessageListActivity.OooOo().f59151OooO0o.OooO0Oo();
        } else {
            TextView textView2 = momentMessageListActivity.f26122OooOo0o;
            if (textView2 != null) {
                o000OO00.OooO0O0(textView2);
            }
            momentMessageListActivity.OooOo().f59151OooO0o.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
