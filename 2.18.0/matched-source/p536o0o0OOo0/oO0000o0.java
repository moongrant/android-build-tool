package p536o0o0OOo0;

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
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000o0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43624Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f43625OoooO00;

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
    public oO0000o0(SmsCodeActivity smsCodeActivity, String str) {
        super(1);
        this.f43624Oooo = smsCodeActivity;
        this.f43625OoooO00 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        ClientCodeType clientCodeType = this.f43624Oooo.f21869Oooooo0;
        switch (clientCodeType == null ? -1 : OooO00o.$EnumSwitchMapping$0[clientCodeType.ordinal()]) {
            case 1:
                PasswordActivity.OooO00o oooO00o = PasswordActivity.f21800ooOO;
                SmsCodeActivity smsCodeActivity = this.f43624Oooo;
                oooO00o.OooO00o(smsCodeActivity, smsCodeActivity.f21870OoooooO, null, this.f43625OoooO00, smsCodeActivity.f21869Oooooo0);
                break;
            case 2:
            case 3:
                PasswordActivity.OooO00o oooO00o2 = PasswordActivity.f21800ooOO;
                SmsCodeActivity smsCodeActivity2 = this.f43624Oooo;
                oooO00o2.OooO00o(smsCodeActivity2, smsCodeActivity2.f21870OoooooO, null, this.f43625OoooO00, smsCodeActivity2.f21869Oooooo0);
                break;
            case 4:
                LiveEventBus.get("EVENTMSG_UNBIND").post(Boolean.TRUE);
                this.f43624Oooo.finish();
                break;
            case 5:
                PasswordActivity.OooO00o oooO00o3 = PasswordActivity.f21800ooOO;
                SmsCodeActivity smsCodeActivity3 = this.f43624Oooo;
                oooO00o3.OooO00o(smsCodeActivity3, smsCodeActivity3.f21870OoooooO, null, this.f43625OoooO00, smsCodeActivity3.f21869Oooooo0);
                break;
            case 6:
                PhoneNumberActivity.OooO00o oooO00o4 = PhoneNumberActivity.f21838Oooooo;
                SmsCodeActivity smsCodeActivity4 = this.f43624Oooo;
                oooO00o4.OooO00o(smsCodeActivity4, smsCodeActivity4.f21870OoooooO, ClientCodeType.Change);
                break;
            case 7:
                LiveEventBus.get("BIND_PH_SUCCESS").post(null);
                this.f43624Oooo.finish();
                break;
            case 8:
                DeleteAccountSubmitActivity.f21764OooooOo.OooO00o(this.f43624Oooo, (DeleteAccountParamsModel) this.f43624Oooo.getIntent().getParcelableExtra("DELETE_REASON_TYPE"));
                this.f43624Oooo.finish();
                break;
            case 9:
                String strOooO0OO = OooOOO.OooO0OO(R.string.account_login_protection_turn_on_success);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
                LiveEventBus.get("TURN_ON_PROTECTION").post(null);
                this.f43624Oooo.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
