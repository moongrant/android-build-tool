package com.yalla.yalla.developer.crash;

import java.io.File;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Pair<String, File> f23358OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o(Pair<String, ? extends File> pair) {
        super(0);
        this.f23358OooO0Oo = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0oOO0.OooO0o0(CrashDetailScreen.INSTANCE, o00Ooo.OooO0O0(TuplesKt.to("data", this.f23358OooO0Oo.getSecond().getAbsolutePath())), false, null, 12);
        return Unit.INSTANCE;
    }
}
