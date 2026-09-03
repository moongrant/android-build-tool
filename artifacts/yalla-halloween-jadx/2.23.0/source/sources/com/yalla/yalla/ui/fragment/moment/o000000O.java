package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentsTopicRecommendFragment f28828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f28829OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, int i) {
        super(0);
        this.f28828OooO0Oo = mainMomentsTopicRecommendFragment;
        this.f28829OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103034");
        this.f28828OooO0Oo.joinTopic(this.f28829OooO0o0);
        return Unit.INSTANCE;
    }
}
