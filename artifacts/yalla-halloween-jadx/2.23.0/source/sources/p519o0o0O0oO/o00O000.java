package p519o0o0O0oO;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O000o f52526OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o00O000o o00o000o2) {
        super(1);
        this.f52526OooO0Oo = o00o000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        EditText view = this.f52526OooO0Oo.f52529OooOO0o.f57952OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etReason");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
