package com.code.android.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<View, Unit> f13416OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000OO0(Function1<? super View, Unit> function1) {
        this.f13416OooO0Oo = function1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f13416OooO0Oo.invoke(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
