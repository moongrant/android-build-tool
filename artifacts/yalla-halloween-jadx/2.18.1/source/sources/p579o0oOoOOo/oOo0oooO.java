package p579o0oOoOOo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0oooO extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f46200Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0oooO(oO0O0Oo0 oo0o0oo0) {
        super(1);
        this.f46200Oooo0o = oo0o0oo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        EditText view = this.f46200Oooo0o.f46059OoooOO0.f50425OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etReason");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
        return Unit.INSTANCE;
    }
}
