package com.yalla.yalla.ui.vm.moment;

import com.yalla.yalla.model.topic.TopicGroupCreateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<TopicGroupCreateModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicGroupCreateVM f31817OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(TopicGroupCreateVM topicGroupCreateVM) {
        super(1);
        this.f31817OooO0Oo = topicGroupCreateVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupCreateModel topicGroupCreateModel) {
        TopicGroupCreateModel it = topicGroupCreateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f31817OooO0Oo.toGroupCreate();
        return Unit.INSTANCE;
    }
}
