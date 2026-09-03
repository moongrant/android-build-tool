package p490o0o00O0;

import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.dialog.OtherLoginType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p675oO0Oo.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends n1 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f48861OooOOo0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(SmsCodeActivity smsCodeActivity, boolean z) {
        super(smsCodeActivity, z);
        this.f48861OooOOo0 = smsCodeActivity;
    }

    @Override // p675oO0Oo.n1
    public final void OooO0Oo(@NotNull OtherLoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        dismiss();
        int i = OooO00o.$EnumSwitchMapping$0[loginType.ordinal()];
        SmsCodeActivity smsCodeActivity = this.f48861OooOOo0;
        if (i == 1) {
            int i2 = SmsCodeActivity.f24845Oooo0;
            smsCodeActivity.OooOoo().OooO00o();
            return;
        }
        if (i == 2) {
            int i3 = SmsCodeActivity.f24845Oooo0;
            smsCodeActivity.OooOoo().OooO0OO();
        } else if (i == 3) {
            int i4 = SmsCodeActivity.f24845Oooo0;
            smsCodeActivity.OooOoo().OooO0Oo();
        } else {
            if (i != 4) {
                return;
            }
            int i5 = SmsCodeActivity.f24845Oooo0;
            smsCodeActivity.OooOoo().OooO0o0();
        }
    }
}
