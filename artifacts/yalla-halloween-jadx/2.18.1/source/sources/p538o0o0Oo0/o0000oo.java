package p538o0o0Oo0;

import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43920Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(MomentMessageListActivity momentMessageListActivity) {
        super(0);
        this.f43920Oooo0o = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentMessageListActivity momentMessageListActivity = this.f43920Oooo0o;
        MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
        if (momentMessageListActivity.OooOooO().getItemCount() > 0) {
            TextView textView = this.f43920Oooo0o.f22339OooooOO;
            if (textView != null) {
                oOO00O.OooO(textView);
            }
            this.f43920Oooo0o.OooOoo().f50373OooO0o.OooO0Oo();
        } else {
            TextView textView2 = this.f43920Oooo0o.f22339OooooOO;
            if (textView2 != null) {
                oOO00O.OooO00o(textView2);
            }
            this.f43920Oooo0o.OooOoo().f50373OooO0o.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
