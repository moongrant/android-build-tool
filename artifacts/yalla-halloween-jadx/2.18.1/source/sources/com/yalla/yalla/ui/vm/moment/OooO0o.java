package com.yalla.yalla.ui.vm.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f25903Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(TopicGroupJoinVM topicGroupJoinVM) {
        super(0);
        this.f25903Oooo0o = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25903Oooo0o.toGroupJoin();
        return Unit.INSTANCE;
    }
}
