package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.dialog.OtherLoginType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p650o0ooo.o0O00o0;
import p650o0ooo.p;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends p {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f24765OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OtherLoginType.values().length];
            try {
                iArr[OtherLoginType.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtherLoginType.Twitter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtherLoginType.WeChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtherLoginType.YallaChat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SmsCodeActivity f24766OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SmsCodeActivity smsCodeActivity) {
            super(1);
            this.f24766OooO0Oo = smsCodeActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            SmsCodeActivity fragmentActivity = this.f24766OooO0Oo;
            if (zBooleanValue) {
                int i = o000000.facebook_update_dialog_login_Content;
                Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
                o000O o000o = new o000O(fragmentActivity);
                o000o.OooOoO0(o000000.facebook_update_dialog_Title);
                o000o.OooOOoo(i);
                o000o.OooOo(true);
                o000o.OooOOOO(o000000.facebook_update_dialog_Update);
                o000o.OooOo0(o0O00o0.f58639OooO0Oo);
                o000o.OooOO0o();
            } else {
                int i2 = SmsCodeActivity.f24843Oooo0;
                fragmentActivity.OooOoo().OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(SmsCodeActivity smsCodeActivity, boolean z) {
        super(smsCodeActivity, z);
        this.f24765OooOOo0 = smsCodeActivity;
    }

    @Override // p650o0ooo.p
    public final void OooO0Oo(@NotNull OtherLoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        dismiss();
        int i = OooO00o.$EnumSwitchMapping$0[loginType.ordinal()];
        SmsCodeActivity smsCodeActivity = this.f24765OooOOo0;
        if (i == 1) {
            AppConfigRepo.f24292OooO00o.getClass();
            AppConfigRepo.f24293OooO0O0.observe(smsCodeActivity, new SmsCodeActivity.OooO(new OooO0O0(smsCodeActivity)));
            return;
        }
        if (i == 2) {
            int i2 = SmsCodeActivity.f24843Oooo0;
            smsCodeActivity.OooOoo().OooO0OO();
        } else if (i == 3) {
            int i3 = SmsCodeActivity.f24843Oooo0;
            smsCodeActivity.OooOoo().OooO0Oo();
        } else {
            if (i != 4) {
                return;
            }
            int i4 = SmsCodeActivity.f24843Oooo0;
            smsCodeActivity.OooOoo().OooO0o0();
        }
    }
}
