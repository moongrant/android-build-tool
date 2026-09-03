package p530o0o0OOOO;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.code.android.util.o0OoOo0;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p371o0OOo0oO.o0OOO0o;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function2<EditText, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53447OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(o0O00oO0 o0o00oo1) {
        super(2);
        this.f53447OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EditText editText, Integer num) {
        EditText view = editText;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(view, "view");
        if (iIntValue == 3) {
            String strOooOOO = o0OoOo0.OooOOO(StringsKt.trim((CharSequence) view.getText().toString()).toString(), "");
            if (o00O00OO.OooO0o(strOooOOO)) {
                this.f53447OooO0Oo.OooOOOo(strOooOOO, true);
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            }
        }
        return Unit.INSTANCE;
    }
}
