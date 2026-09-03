package com.yalla.yalla.developer.crash;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CrashListViewModel f23357OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(CrashListViewModel crashListViewModel) {
        super(0);
        this.f23357OooO0Oo = crashListViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f23357OooO0Oo.clearFiles();
        return Unit.INSTANCE;
    }
}
