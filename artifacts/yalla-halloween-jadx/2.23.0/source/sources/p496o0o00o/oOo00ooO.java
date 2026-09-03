package p496o0o00o;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00O0OO.OooO0o;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49187OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49187OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Pair pair;
        int iIntValue;
        boolean zBooleanValue = bool.booleanValue();
        UserInfoEditActivity userInfoEditActivity = this.f49187OooO0Oo;
        if (zBooleanValue) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            boolean z = false;
            if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                pair = (Pair) o000000O.OooOO0().getValue();
                if (pair != null) {
                    iIntValue = ((Number) pair.getSecond()).intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue >= VipLevel.Vip3.getValue()) {
                    z = true;
                }
            } else {
                Pair pair3 = (Pair) o000000O.OooOO0().getValue();
                if (pair3 != null && ((Number) pair3.getFirst()).intValue() == VipState.VipHide.getValue()) {
                    pair = (Pair) o000000O.OooOO0().getValue();
                    if (pair != null) {
                        iIntValue = ((Number) pair.getSecond()).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= VipLevel.Vip3.getValue()) {
                        z = true;
                    }
                }
            }
            OooO0o.OooO0OO(userInfoEditActivity, 1.0f, 1.0f, z, false, new oOo00o0o(userInfoEditActivity));
            int i = UserInfoEditActivity.f27283Oooo0oO;
            userInfoEditActivity.OooOoO().f58083OooO0oo.setEnabled(true);
        } else {
            int i2 = UserInfoEditActivity.f27283Oooo0oO;
            userInfoEditActivity.OooOoO().f58083OooO0oo.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
