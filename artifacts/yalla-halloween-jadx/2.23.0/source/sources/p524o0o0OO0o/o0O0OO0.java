package p524o0o0OO0o;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.code.android.util.o0OoOo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p417o0OoO0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function2<EditText, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53504OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(o0O00 o0o01) {
        super(2);
        this.f53504OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EditText editText, Integer num) {
        EditText view = editText;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(view, "view");
        if (iIntValue == 3) {
            String strOooOOO = o0OoOo0.OooOOO(StringsKt.trim((CharSequence) view.getText().toString()).toString(), "");
            if (o0000O0O.OooO0o(strOooOOO)) {
                this.f53504OooO0Oo.OooOOOo(strOooOOO, true);
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            }
        }
        return Unit.INSTANCE;
    }
}
