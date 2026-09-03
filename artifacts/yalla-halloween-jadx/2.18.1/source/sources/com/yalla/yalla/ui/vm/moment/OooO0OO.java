package com.yalla.yalla.ui.vm.moment;

import com.yalla.yalla.model.TopicGroupJoinModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends Lambda implements Function1<TopicGroupJoinModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f25902Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(TopicGroupJoinVM topicGroupJoinVM) {
        super(1);
        this.f25902Oooo0o = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupJoinModel topicGroupJoinModel) {
        TopicGroupJoinModel it = topicGroupJoinModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25902Oooo0o.toGroupJoin();
        return Unit.INSTANCE;
    }
}
