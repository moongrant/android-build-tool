package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<p363o0OOo00O.OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Function0<Unit>> f24123OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(MutableState<Function0<Unit>> mutableState) {
        super(1);
        this.f24123OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p363o0OOo00O.OooOOO oooOOO) {
        Function0<Unit> value;
        p363o0OOo00O.OooOOO state = oooOOO;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, o0OOo00O.OooOOO.OooOO0.f43050OooO00o) && (value = this.f24123OooO0Oo.getValue()) != null) {
            value.invoke();
        }
        return Unit.INSTANCE;
    }
}
