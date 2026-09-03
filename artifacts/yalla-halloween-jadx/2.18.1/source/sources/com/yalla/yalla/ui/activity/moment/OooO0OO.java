package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f22405Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity.OooO00o f22406Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(AddTopicListActivity addTopicListActivity, AddTopicListActivity.OooO00o oooO00o) {
        super(1);
        this.f22405Oooo0o = addTopicListActivity;
        this.f22406Oooo0oO = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        AddTopicListActivity addTopicListActivity = this.f22405Oooo0o;
        AddTopicListActivity.OooOooo(addTopicListActivity, this.f22406Oooo0oO.getItem(iIntValue - AddTopicListActivity.OooOoo(addTopicListActivity).getItemCount()));
        return Unit.INSTANCE;
    }
}
