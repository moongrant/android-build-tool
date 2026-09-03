package p511o0o0O;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.o000OO0O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f50946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50947OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f50948OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f50949OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(long j, MyGiftModel.Data data, UserInfoActivity userInfoActivity, o000OO0O o000oo0o2) {
        super(3);
        this.f50946OooO0Oo = data;
        this.f50948OooO0o0 = j;
        this.f50947OooO0o = userInfoActivity;
        this.f50949OooO0oO = o000oo0o2;
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
                ComposerKt.traceEventStart(-548148568, i, -1, "com.yalla.yalla.ui.dialog.giftDialog.GiftSendCheck.checkForUserInfo.<anonymous>.<anonymous> (GiftSendCheck.kt:253)");
            }
            MyGiftModel.Data data = this.f50946OooO0Oo;
            if (data.getState() != 1) {
                z = false;
            } else {
                if (data.getRegion() != 0) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Integer num2 = (Integer) o0O00oO0.OooOOO0().getValue();
                    int region = data.getRegion();
                    if (num2 == null || num2.intValue() != region) {
                        z = false;
                    }
                }
                z = true;
            }
            o000O0Oo.OooO0Oo(it, StringResources_androidKt.stringResource(o000000.UserInfo_Dialog_title, composer2, 0), null, ComposableLambdaKt.composableLambda(composer2, -320275373, true, new o000OOo(data, z)), true, true, null, null, StringResources_androidKt.stringResource(o000000.UserInfo_Dialog_send, composer2, 0), false, null, false, (!z || data.isGiftBlind() || data.iGiftCustomMade() || data.isGiftMember() || data.isGiftSupremeVip6()) ? null : new o000000O(this.f50948OooO0o0, this.f50946OooO0Oo, this.f50947OooO0o, this.f50949OooO0oO), null, false, false, null, null, null, null, composer2, (i & 14) | 224256, 0, 1044164);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
