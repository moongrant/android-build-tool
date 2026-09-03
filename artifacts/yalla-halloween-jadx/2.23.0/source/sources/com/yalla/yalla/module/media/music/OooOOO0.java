package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function1<o0OOo000.OooOO0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Function0<Unit>> f24589OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(MutableState<Function0<Unit>> mutableState) {
        super(1);
        this.f24589OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OOo000.OooOO0O oooOO0O) {
        Function0<Unit> value;
        o0OOo000.OooOO0O state = oooOO0O;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, o0OOo000.OooOO0O.OooOO0.f43855OooO00o) && (value = this.f24589OooO0Oo.getValue()) != null) {
            value.invoke();
        }
        return Unit.INSTANCE;
    }
}
