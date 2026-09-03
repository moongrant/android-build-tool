package p519o0o0O0oO;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t1 f53093OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(t1 t1Var) {
        super(1);
        this.f53093OooO0Oo = t1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        AppCompatEditText view = this.f53093OooO0Oo.OooOOOO().f58834OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
