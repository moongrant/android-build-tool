package com.yalla.yalla.ui.vm.moment;

import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO extends Lambda implements Function1<TopicGroupJoinModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f32349OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(TopicGroupJoinVM topicGroupJoinVM) {
        super(1);
        this.f32349OooO0Oo = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupJoinModel topicGroupJoinModel) {
        TopicGroupJoinModel it = topicGroupJoinModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f32349OooO0Oo.toGroupJoin();
        return Unit.INSTANCE;
    }
}
