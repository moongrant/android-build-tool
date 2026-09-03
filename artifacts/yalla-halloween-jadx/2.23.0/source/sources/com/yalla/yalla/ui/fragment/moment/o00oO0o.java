package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentsTopicAddMoreFragment f28877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f28878OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment, int i) {
        super(0);
        this.f28877OooO0Oo = mainMomentsTopicAddMoreFragment;
        this.f28878OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103034");
        this.f28877OooO0Oo.joinTopic(this.f28878OooO0o0);
        return Unit.INSTANCE;
    }
}
