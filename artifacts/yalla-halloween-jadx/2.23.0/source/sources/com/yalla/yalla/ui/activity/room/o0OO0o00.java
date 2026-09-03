package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.l8;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l8 f26932OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(l8 l8Var) {
        super(0);
        this.f26932OooO0Oo = l8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EditText view = this.f26932OooO0Oo.f58373OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "dialogBinding.etVoteSetTitle");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
