package p650o0ooo;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f59085OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(w1 w1Var) {
        super(1);
        this.f59085OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        AppCompatEditText view2 = this.f59085OooO0Oo.OooOOOO().f44436OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view2, "editNumber");
        Intrinsics.checkNotNullParameter(view2, "view");
        Context context = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        OooO00o.OooO0O0(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
