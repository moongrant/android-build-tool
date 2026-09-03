package com.yalla.support.common.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends ClickableSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<View, Unit> f20508Oooo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(Function1<? super View, Unit> function1) {
        this.f20508Oooo0o = function1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f20508Oooo0o.invoke(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
