package com.code.android.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f10285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f10286OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f10287OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f10288OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f10289OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Modifier modifier, long j, float f, int i, int i2) {
        super(2);
        this.f10285OooO0Oo = f;
        this.f10287OooO0o0 = j;
        this.f10286OooO0o = modifier;
        this.f10288OooO0oO = i;
        this.f10289OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        float f = this.f10285OooO0Oo;
        long j = this.f10287OooO0o0;
        OooOO0.OooO0o0(this.f10286OooO0o, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10288OooO0oO | 1), this.f10289OooO0oo);
        return Unit.INSTANCE;
    }
}
