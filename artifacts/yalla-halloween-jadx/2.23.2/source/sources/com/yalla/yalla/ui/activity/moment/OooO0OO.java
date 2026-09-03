package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f25771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity.OooO00o f25772OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(AddTopicListActivity addTopicListActivity, AddTopicListActivity.OooO00o oooO00o) {
        super(1);
        this.f25771OooO0Oo = addTopicListActivity;
        this.f25772OooO0o0 = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        AddTopicListActivity addTopicListActivity = this.f25771OooO0Oo;
        AddTopicListActivity.OooOo(addTopicListActivity, this.f25772OooO0o0.OooOOO(iIntValue - ((AddTopicListActivity.OooO00o) addTopicListActivity.f25565OooOo0.getValue()).getItemCount()));
        return Unit.INSTANCE;
    }
}
