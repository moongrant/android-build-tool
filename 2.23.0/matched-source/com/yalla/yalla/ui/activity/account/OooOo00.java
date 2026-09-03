package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f25222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25223OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            try {
                iArr[ClientCodeType.Register.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientCodeType.BingingPhone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientCodeType.UnbindThird.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientCodeType.Retrieve.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClientCodeType.ChangeOld.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClientCodeType.Change.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClientCodeType.DeleteAccount.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClientCodeType.TurnOnProtection.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(SmsCodeActivity smsCodeActivity, String str) {
        super(1);
        this.f25222OooO0Oo = smsCodeActivity;
        this.f25223OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        SmsCodeActivity activity = this.f25222OooO0Oo;
        ClientCodeType clientCodeType = activity.f25303OooOo0O;
        int i = clientCodeType == null ? -1 : OooO00o.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        String str = this.f25223OooO0o0;
        switch (i) {
            case 1:
                int i2 = PasswordActivity.f25224OooOoOO;
                PasswordActivity.OooO00o.OooO00o(activity, activity.f25300OooOo, null, str, activity.f25303OooOo0O);
                break;
            case 2:
            case 3:
                int i3 = PasswordActivity.f25224OooOoOO;
                PasswordActivity.OooO00o.OooO00o(activity, activity.f25300OooOo, null, str, activity.f25303OooOo0O);
                break;
            case 4:
                LiveEventBus.get("EVENTMSG_UNBIND").post(Boolean.TRUE);
                activity.finish();
                break;
            case 5:
                int i4 = PasswordActivity.f25224OooOoOO;
                PasswordActivity.OooO00o.OooO00o(activity, activity.f25300OooOo, null, str, activity.f25303OooOo0O);
                break;
            case 6:
                int i5 = PhoneNumberActivity.f25262OooOoO;
                PhoneNumberActivity.OooO00o.OooO00o(activity, activity.f25300OooOo, ClientCodeType.Change);
                break;
            case 7:
                LiveEventBus.get("BIND_PH_SUCCESS").post(null);
                activity.finish();
                break;
            case 8:
                DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) activity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
                int i6 = DeleteAccountSubmitActivity.f25179OooOo0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intent intent = new Intent(activity, (Class<?>) DeleteAccountSubmitActivity.class);
                intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
                activity.startActivity(intent);
                activity.finish();
                break;
            case 9:
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.account_login_protection_turn_on_success);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                LiveEventBus.get("TURN_ON_PROTECTION").post(null);
                activity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
