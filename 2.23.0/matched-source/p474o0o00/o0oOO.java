package p474o0o00;

import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.dialog.OtherLoginType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p519o0o0O0oO.k;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends k {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47342OooOOo0;

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
    public o0oOO(PhoneNumberActivity phoneNumberActivity, boolean z) {
        super(phoneNumberActivity, z);
        this.f47342OooOOo0 = phoneNumberActivity;
    }

    @Override // p519o0o0O0oO.k
    public final void OooO0Oo(@NotNull OtherLoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        dismiss();
        int i = OooO00o.$EnumSwitchMapping$0[loginType.ordinal()];
        PhoneNumberActivity phoneNumberActivity = this.f47342OooOOo0;
        if (i == 1) {
            int i2 = PhoneNumberActivity.f25262OooOoO;
            phoneNumberActivity.OooOoO0().OooO00o();
            return;
        }
        if (i == 2) {
            int i3 = PhoneNumberActivity.f25262OooOoO;
            phoneNumberActivity.OooOoO0().OooO0OO();
        } else if (i == 3) {
            int i4 = PhoneNumberActivity.f25262OooOoO;
            phoneNumberActivity.OooOoO0().OooO0Oo();
        } else {
            if (i != 4) {
                return;
            }
            int i5 = PhoneNumberActivity.f25262OooOoO;
            phoneNumberActivity.OooOoO0().OooO0o0();
        }
    }
}
