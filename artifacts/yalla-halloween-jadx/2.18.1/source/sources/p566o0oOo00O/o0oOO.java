package p566o0oOo00O;

import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45344Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f45344Oooo0o = userInfoActivity;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Pair<Integer, Integer> value;
        int iIntValue;
        if (bool.booleanValue()) {
            boolean z = false;
            if (this.f45344Oooo0o.f23471oo000o == 0) {
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                if (value2 != null && value2.getFirst().intValue() == VipState.Vip.getValue()) {
                    value = oooOOO.OooO().getValue();
                    if (value != null) {
                        iIntValue = value.getSecond().intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= VipLevel.Vip3.getValue()) {
                        z = true;
                    }
                } else {
                    Pair<Integer, Integer> value3 = oooOOO.OooO().getValue();
                    if (value3 != null && value3.getFirst().intValue() == VipState.VipHide.getValue()) {
                        value = oooOOO.OooO().getValue();
                        if (value != null) {
                            iIntValue = value.getSecond().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue >= VipLevel.Vip3.getValue()) {
                            z = true;
                        }
                    }
                }
            }
            UserInfoActivity userInfoActivity = this.f45344Oooo0o;
            Oooo0.f33130OooO00o.OooO0O0(userInfoActivity, 1.0f, 1.0f, z, false, new o00Oo00(userInfoActivity));
            this.f45344Oooo0o.f23469o00ooo = true;
        }
        return Unit.INSTANCE;
    }
}
