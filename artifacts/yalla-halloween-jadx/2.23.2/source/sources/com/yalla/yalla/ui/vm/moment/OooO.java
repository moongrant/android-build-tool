package com.yalla.yalla.ui.vm.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f31814OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(TopicGroupJoinVM topicGroupJoinVM) {
        super(0);
        this.f31814OooO0Oo = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f31814OooO0Oo.toGroupJoin();
        return Unit.INSTANCE;
    }
}
