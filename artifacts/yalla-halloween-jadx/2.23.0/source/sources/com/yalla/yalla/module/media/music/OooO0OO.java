package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f24553OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MutableState<Integer> mutableState) {
        super(1);
        this.f24553OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MutableState<Integer> mutableState = this.f24553OooO0Oo;
        if (zBooleanValue) {
            mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
        } else {
            mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() - 1));
        }
        return Unit.INSTANCE;
    }
}
