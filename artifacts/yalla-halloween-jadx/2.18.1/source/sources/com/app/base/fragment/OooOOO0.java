package com.app.base.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f11620Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f11621Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(MomentListFeaturedFragment momentListFeaturedFragment, int i) {
        super(0);
        this.f11620Oooo0o = momentListFeaturedFragment;
        this.f11621Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11620Oooo0o.onBannerClick(this.f11621Oooo0oO);
        return Unit.INSTANCE;
    }
}
