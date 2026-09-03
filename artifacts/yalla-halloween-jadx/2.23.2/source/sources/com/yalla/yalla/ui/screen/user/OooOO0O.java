package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<LazyGridItemSpanScope, GridItemSpan> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOO0O f29441OooO0Oo = new OooOO0O();

    public OooOO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope) {
        LazyGridItemSpanScope item = lazyGridItemSpanScope;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return GridItemSpan.m591boximpl(LazyGridSpanKt.GridItemSpan(4));
    }
}
