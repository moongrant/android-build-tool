package com.code.android.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f10408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f10409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f10410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f10411OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(boolean z, long j, Function0<Unit> function0, Ref.LongRef longRef) {
        super(0);
        this.f10408OooO0Oo = z;
        this.f10410OooO0o0 = j;
        this.f10409OooO0o = function0;
        this.f10411OooO0oO = longRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.f10408OooO0Oo;
        Function0<Unit> function0 = this.f10409OooO0o;
        long j = this.f10410OooO0o0;
        if (!z) {
            Ref.LongRef longRef = this.f10411OooO0oO;
            if (Math.abs(jCurrentTimeMillis - longRef.element) >= j) {
                longRef.element = jCurrentTimeMillis;
                function0.invoke();
            }
        } else if (Math.abs(jCurrentTimeMillis - o000OO0O.f10369OooO00o) >= j) {
            o000OO0O.f10369OooO00o = jCurrentTimeMillis;
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
