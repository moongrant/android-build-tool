package com.yalla.yalla.module.event.ui.view;

import androidx.compose.runtime.MutableState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24057OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(MutableState<Boolean> mutableState) {
        super(0);
        this.f24057OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO0O0("101016", MapsKt.mapOf(new Pair("type", 0)));
        this.f24057OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
