package com.yalla.yalla.ui.screen.user;

import com.yalla.yalla.model.user.UserHeadFrameModel;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function3<UserHeadFrameModel, Integer, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f29443OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(HeadFrameViewModel headFrameViewModel) {
        super(3);
        this.f29443OooO0Oo = headFrameViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(UserHeadFrameModel userHeadFrameModel, Integer num, Boolean bool) {
        boolean z;
        UserHeadFrameModel model = userHeadFrameModel;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(model, "model");
        HeadFrameViewModel headFrameViewModel = this.f29443OooO0Oo;
        UserHeadFrameModel value = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
        if (value != null) {
            value.localClearIsSelect();
        }
        model.m4199setLocalSelectUnLock(true);
        headFrameViewModel.getMTempShowUserHeaderFrameModel().setValue(model);
        if (!zBooleanValue) {
            iIntValue = -1;
        }
        headFrameViewModel.setCurrentSelectPosition(iIntValue);
        if (zBooleanValue) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            T value2 = o0O00oO0.OooO0oo().getValue();
            UserHeadFrameModel value3 = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
            z = Intrinsics.areEqual(value2, value3 != null ? value3.getPic() : null) ? false : true;
        }
        headFrameViewModel.setShowReplaceButton(z);
        return Unit.INSTANCE;
    }
}
