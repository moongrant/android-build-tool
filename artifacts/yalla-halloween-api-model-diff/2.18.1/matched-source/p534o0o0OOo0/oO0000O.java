package p534o0o0OOo0;

import com.app.base.dialog.OtherLoginType;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p707oOooo0o.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000O extends o000OOo0 {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43608o000oOoO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OtherLoginType.values().length];
            iArr[OtherLoginType.Facebook.ordinal()] = 1;
            iArr[OtherLoginType.Twitter.ordinal()] = 2;
            iArr[OtherLoginType.WeChat.ordinal()] = 3;
            iArr[OtherLoginType.YallaChat.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(SmsCodeActivity smsCodeActivity, boolean z) {
        super(smsCodeActivity, z);
        this.f43608o000oOoO = smsCodeActivity;
    }

    @Override // p707oOooo0o.o000OOo0
    public final void OooO0Oo(@NotNull OtherLoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        dismiss();
        int i = OooO00o.$EnumSwitchMapping$0[loginType.ordinal()];
        if (i == 1) {
            SmsCodeActivity smsCodeActivity = this.f43608o000oOoO;
            SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
            smsCodeActivity.Oooo00o().OooO00o();
            return;
        }
        if (i == 2) {
            SmsCodeActivity smsCodeActivity2 = this.f43608o000oOoO;
            SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21845o00Ooo;
            smsCodeActivity2.Oooo00o().OooO0OO();
        } else if (i == 3) {
            SmsCodeActivity smsCodeActivity3 = this.f43608o000oOoO;
            SmsCodeActivity.OooO00o oooO00o3 = SmsCodeActivity.f21845o00Ooo;
            smsCodeActivity3.Oooo00o().OooO0Oo();
        } else {
            if (i != 4) {
                return;
            }
            SmsCodeActivity smsCodeActivity4 = this.f43608o000oOoO;
            SmsCodeActivity.OooO00o oooO00o4 = SmsCodeActivity.f21845o00Ooo;
            smsCodeActivity4.Oooo00o().OooO0o0();
        }
    }
}
