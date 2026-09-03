package p501o0o00o;

import android.content.Context;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.DialogLinkFrom;
import com.yalla.yalla.model.DialogLinkItem;
import com.yalla.yalla.model.DialogLinkManage;
import com.yalla.yalla.model.GiftPropTypeUser;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p031OoooO.o0000O;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.oOO00O;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41500Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(o000 o000Var) {
        super(1);
        this.f41500Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != GiftPropTypeUser.Member.getValue()) {
            Context context = null;
            if (iIntValue == GiftPropTypeUser.Premium.getValue()) {
                Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
                if (value != null) {
                    boolean zBooleanValue = value.getFirst().booleanValue();
                    PremiumLevel premiumLevelOooO00o = PremiumLevel.INSTANCE.OooO00o(value.getSecond());
                    if (!zBooleanValue || premiumLevelOooO00o.getValue() <= 0) {
                        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
                        if (contextOooO0O0 == null) {
                            Context context2 = o0000O.f2657OooO00o;
                            if (context2 != null) {
                                context = context2;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            }
                            contextOooO0O0 = context;
                        }
                        oooO00o.OooO00o(contextOooO0O0, premiumLevelOooO00o);
                    }
                }
            } else if (iIntValue == GiftPropTypeUser.Vip.getValue()) {
                Pair<Integer, Integer> value2 = OooOOO.f41216OooO00o.OooO().getValue();
                if (oOO00O.OooO0Oo(value2 != null ? value2.getSecond() : null, 0) <= 0) {
                    VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
                    Context contextOooO0O1 = OooO0O0.f20502OooO00o.OooO0O0();
                    if (contextOooO0O1 == null && (contextOooO0O1 = o0000O.f2657OooO00o) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    } else {
                        context = contextOooO0O1;
                    }
                    VipActivity.f23570OoooOOo.OooO00o(context, VipLevel.Vip0);
                }
            }
        } else if (!o00OO00O.f43313OooooOo.OooO00o().OooOOO()) {
            DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getJoinRoomDialogFromGiftSendDialogLink(), DialogLinkFrom.JoinRoomDialogFromGiftSendDialog, false, false, 4, null);
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43168OooOooO.setValue(Boolean.TRUE);
            this.f41500Oooo0o.OooOoOO(true);
        }
        return Unit.INSTANCE;
    }
}
