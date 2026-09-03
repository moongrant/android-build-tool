package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f22407Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity.OooO00o f22408Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(AddTopicListActivity addTopicListActivity, AddTopicListActivity.OooO00o oooO00o) {
        super(1);
        this.f22407Oooo0o = addTopicListActivity;
        this.f22408Oooo0oO = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        AddTopicListActivity.OooOooo(this.f22407Oooo0o, this.f22408Oooo0oO.getItem(num.intValue()));
        return Unit.INSTANCE;
    }
}
