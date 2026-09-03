package p544o0o0OoOO;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;
import p649o0ooOOoo.vf;

/* JADX INFO: loaded from: classes2.dex */
public final class r7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ vf f44305Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(vf vfVar) {
        super(0);
        this.f44305Oooo0o = vfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EditText view = this.f44305Oooo0o.f50817OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "dialogBinding.etVoteSetTitle");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
        return Unit.INSTANCE;
    }
}
