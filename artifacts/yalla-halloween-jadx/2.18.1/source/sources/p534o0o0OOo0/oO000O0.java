package p534o0o0OOo0;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000O0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43611Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f43612Oooo0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            iArr[ClientCodeType.Register.ordinal()] = 1;
            iArr[ClientCodeType.BingingPhone.ordinal()] = 2;
            iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 3;
            iArr[ClientCodeType.UnbindThird.ordinal()] = 4;
            iArr[ClientCodeType.Retrieve.ordinal()] = 5;
            iArr[ClientCodeType.ChangeOld.ordinal()] = 6;
            iArr[ClientCodeType.Change.ordinal()] = 7;
            iArr[ClientCodeType.DeleteAccount.ordinal()] = 8;
            iArr[ClientCodeType.TurnOnProtection.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(SmsCodeActivity smsCodeActivity, String str) {
        super(1);
        this.f43611Oooo0o = smsCodeActivity;
        this.f43612Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        ClientCodeType clientCodeType = this.f43611Oooo0o.f21849OooooO0;
        switch (clientCodeType == null ? -1 : OooO00o.$EnumSwitchMapping$0[clientCodeType.ordinal()]) {
            case 1:
                PasswordActivity.OooO00o oooO00o = PasswordActivity.f21781OoooooO;
                SmsCodeActivity smsCodeActivity = this.f43611Oooo0o;
                oooO00o.OooO00o(smsCodeActivity, smsCodeActivity.f21851OooooOo, null, this.f43612Oooo0oO, smsCodeActivity.f21849OooooO0);
                break;
            case 2:
            case 3:
                PasswordActivity.OooO00o oooO00o2 = PasswordActivity.f21781OoooooO;
                SmsCodeActivity smsCodeActivity2 = this.f43611Oooo0o;
                oooO00o2.OooO00o(smsCodeActivity2, smsCodeActivity2.f21851OooooOo, null, this.f43612Oooo0oO, smsCodeActivity2.f21849OooooO0);
                break;
            case 4:
                LiveEventBus.get("EVENTMSG_UNBIND").post(Boolean.TRUE);
                this.f43611Oooo0o.finish();
                break;
            case 5:
                PasswordActivity.OooO00o oooO00o3 = PasswordActivity.f21781OoooooO;
                SmsCodeActivity smsCodeActivity3 = this.f43611Oooo0o;
                oooO00o3.OooO00o(smsCodeActivity3, smsCodeActivity3.f21851OooooOo, null, this.f43612Oooo0oO, smsCodeActivity3.f21849OooooO0);
                break;
            case 6:
                PhoneNumberActivity.OooO00o oooO00o4 = PhoneNumberActivity.f21819OooooOO;
                SmsCodeActivity smsCodeActivity4 = this.f43611Oooo0o;
                oooO00o4.OooO00o(smsCodeActivity4, smsCodeActivity4.f21851OooooOo, ClientCodeType.Change);
                break;
            case 7:
                LiveEventBus.get("BIND_PH_SUCCESS").post(null);
                this.f43611Oooo0o.finish();
                break;
            case 8:
                DeleteAccountSubmitActivity.f21745Ooooo0o.OooO00o(this.f43611Oooo0o, (DeleteAccountParamsModel) this.f43611Oooo0o.getIntent().getParcelableExtra("DELETE_REASON_TYPE"));
                this.f43611Oooo0o.finish();
                break;
            case 9:
                String strOooO0OO = OooOOO.OooO0OO(R.string.account_login_protection_turn_on_success);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
                LiveEventBus.get("TURN_ON_PROTECTION").post(null);
                this.f43611Oooo0o.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
