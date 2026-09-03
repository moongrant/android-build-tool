package com.opensource.svgaplayer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f20767OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Ref.BooleanRef booleanRef) {
        super(0);
        this.f20767OooO0Oo = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f20767OooO0Oo.element = true;
        return Unit.INSTANCE;
    }
}
