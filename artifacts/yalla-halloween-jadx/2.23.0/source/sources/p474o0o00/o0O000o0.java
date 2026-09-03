package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoo.oOOO00;
import p579o0oOoo.oOOO000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47299OooO0Oo;

    public o0O000o0(SmsCodeActivity smsCodeActivity) {
        this.f47299OooO0Oo = smsCodeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
            oOOO000o oooo000o = oOOO00.f56668OooO00o;
            if (oooo000o != null) {
                oooo000o.cancel();
                oOOO00.f56668OooO00o = null;
            }
            if (oOOO00.f56669OooO0O0 != null) {
                oOOO00.f56669OooO0O0 = null;
            }
            oOOO00.f56670OooO0OO = null;
            this.f47299OooO0Oo.finish();
        }
    }
}
