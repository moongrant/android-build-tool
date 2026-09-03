package com.yalla.yalla.developer.crash;

import java.io.File;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Pair<String, File> f22889OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o(Pair<String, ? extends File> pair) {
        super(0);
        this.f22889OooO0Oo = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O00.OooO0o0(CrashDetailScreen.INSTANCE, o000oOoO.OooO0O0(TuplesKt.to("data", this.f22889OooO0Oo.getSecond().getAbsolutePath())), false, null, 12);
        return Unit.INSTANCE;
    }
}
