package com.yalla.yalla.ui.vm.moment;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f32350OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(long j) {
        super(1);
        this.f32350OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MomentDetailModel momentDetailModel) {
        MomentDetailModel it = momentDetailModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getId() == this.f32350OooO0Oo);
    }
}
