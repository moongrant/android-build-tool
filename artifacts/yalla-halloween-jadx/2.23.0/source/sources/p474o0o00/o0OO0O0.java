package p474o0o00;

import android.widget.TextView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f47331OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(UntieAccountBindActivity untieAccountBindActivity) {
        super(0);
        this.f47331OooO0Oo = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = UntieAccountBindActivity.f25342OooOo;
        UntieAccountBindActivity untieAccountBindActivity = this.f47331OooO0Oo;
        TextView textView = untieAccountBindActivity.OooOoO0().f57789OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUntieBindResult");
        o000OO00.OooOOOO(textView);
        untieAccountBindActivity.OooOo0();
        return Unit.INSTANCE;
    }
}
