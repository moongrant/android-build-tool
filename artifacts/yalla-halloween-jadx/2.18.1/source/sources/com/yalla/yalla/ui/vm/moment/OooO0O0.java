package com.yalla.yalla.ui.vm.moment;

import com.yalla.yalla.model.TopicGroupCreateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends Lambda implements Function1<TopicGroupCreateModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicGroupCreateVM f25901Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(TopicGroupCreateVM topicGroupCreateVM) {
        super(1);
        this.f25901Oooo0o = topicGroupCreateVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupCreateModel topicGroupCreateModel) {
        TopicGroupCreateModel it = topicGroupCreateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25901Oooo0o.toGroupCreate();
        return Unit.INSTANCE;
    }
}
