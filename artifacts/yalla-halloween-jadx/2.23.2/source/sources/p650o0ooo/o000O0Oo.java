package p650o0ooo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f58496OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o000OO0O o000oo0o2) {
        super(1);
        this.f58496OooO0Oo = o000oo0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        EditText view = this.f58496OooO0Oo.f58516OooOO0o.f44679OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "etReason");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
