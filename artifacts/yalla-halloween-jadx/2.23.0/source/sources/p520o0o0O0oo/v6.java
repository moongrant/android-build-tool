package p520o0o0O0oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.o000O0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p158o00OoOOO.oo000o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f53351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f53352OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f53353OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f53354OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(long j, MyGiftModel.Data data, UserInfoActivity userInfoActivity, o000O0O0 o000o0o1) {
        super(3);
        this.f53351OooO0Oo = data;
        this.f53353OooO0o0 = j;
        this.f53352OooO0o = userInfoActivity;
        this.f53354OooO0oO = o000o0o1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        boolean z;
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-548148568, i, -1, "com.yalla.yalla.ui.dialog.giftDialog.GiftSendCheck.checkForUserInfo.<anonymous>.<anonymous> (GiftSendCheck.kt:250)");
            }
            MyGiftModel.Data data = this.f53351OooO0Oo;
            if (data.getState() != 1) {
                z = false;
            } else {
                if (data.getRegion() != 0) {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Integer num2 = (Integer) o000000O.OooOOO0().getValue();
                    int region = data.getRegion();
                    if (num2 == null || num2.intValue() != region) {
                        z = false;
                    }
                }
                z = true;
            }
            oo000o.OooO0Oo(it, StringResources_androidKt.stringResource(oO00OOo0.UserInfo_Dialog_title, composer2, 0), null, ComposableLambdaKt.composableLambda(composer2, -320275373, true, new s6(data, z)), true, true, null, null, StringResources_androidKt.stringResource(oO00OOo0.UserInfo_Dialog_send, composer2, 0), false, null, false, (!z || data.isGiftBlind() || data.iGiftCustomMade() || data.isGiftMember() || data.isGiftSupremeVip6()) ? null : new u6(this.f53353OooO0o0, this.f53351OooO0Oo, this.f53352OooO0o, this.f53354OooO0oO), null, false, false, null, null, null, null, composer2, (i & 14) | 224256, 0, 1044164);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
