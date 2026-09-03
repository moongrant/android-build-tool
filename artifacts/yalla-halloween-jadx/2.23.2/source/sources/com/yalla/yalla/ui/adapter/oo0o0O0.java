package com.yalla.yalla.ui.adapter;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f27234OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f27235OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(o00O0O00 o00o0o01, String str) {
        super(1);
        this.f27234OooO0Oo = o00o0o01;
        this.f27235OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super String, Unit> function1 = this.f27234OooO0Oo.f27139OooOOo;
        if (function1 != null) {
            function1.invoke(this.f27235OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
