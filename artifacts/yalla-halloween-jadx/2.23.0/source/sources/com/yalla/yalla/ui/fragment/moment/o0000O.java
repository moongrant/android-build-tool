package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28837OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(CoroutineScope coroutineScope, MomentListFeaturedFragment momentListFeaturedFragment) {
        super(0);
        this.f28836OooO0Oo = coroutineScope;
        this.f28837OooO0o0 = momentListFeaturedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f28836OooO0Oo, null, null, new o000OO(this.f28837OooO0o0, null), 3, null);
        return Unit.INSTANCE;
    }
}
