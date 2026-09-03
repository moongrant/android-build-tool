package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f25768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity.OooO00o f25769OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AddTopicListActivity addTopicListActivity, AddTopicListActivity.OooO00o oooO00o) {
        super(1);
        this.f25768OooO0Oo = addTopicListActivity;
        this.f25769OooO0o0 = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        AddTopicListActivity.OooOo(this.f25768OooO0Oo, this.f25769OooO0o0.OooOOO(num.intValue()));
        return Unit.INSTANCE;
    }
}
