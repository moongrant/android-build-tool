package p600o0oo00OO;

import com.app.base.model.UserHeadFrameModel;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends Lambda implements Function3<UserHeadFrameModel, Integer, Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f48059Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(HeadFrameViewModel headFrameViewModel) {
        super(3);
        this.f48059Oooo0o = headFrameViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(UserHeadFrameModel userHeadFrameModel, Integer num, Boolean bool) {
        boolean z;
        UserHeadFrameModel model = userHeadFrameModel;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(model, "model");
        UserHeadFrameModel value = this.f48059Oooo0o.getMTempShowUserHeaderFrameModel().getValue();
        if (value != null) {
            value.localClearIsSelect();
        }
        model.m84setLocalSelectUnLock(true);
        this.f48059Oooo0o.getMTempShowUserHeaderFrameModel().setValue(model);
        HeadFrameViewModel headFrameViewModel = this.f48059Oooo0o;
        if (!zBooleanValue) {
            iIntValue = -1;
        }
        headFrameViewModel.setCurrentSelectPosition(iIntValue);
        HeadFrameViewModel headFrameViewModel2 = this.f48059Oooo0o;
        if (zBooleanValue) {
            String value2 = OooOOO.f41216OooO00o.OooO0oO().getValue();
            UserHeadFrameModel value3 = this.f48059Oooo0o.getMTempShowUserHeaderFrameModel().getValue();
            z = Intrinsics.areEqual(value2, value3 != null ? value3.getPic() : null) ? false : true;
        }
        headFrameViewModel2.setShowReplaceButton(z);
        return Unit.INSTANCE;
    }
}
