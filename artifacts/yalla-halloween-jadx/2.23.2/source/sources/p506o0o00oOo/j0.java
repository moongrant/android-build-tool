package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p182o00o000O.OooO0o;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends Lambda implements Function1<OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50418OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0o oooO0o) {
        OooO0o oooO0o2 = oooO0o;
        boolean z = true;
        boolean z2 = oooO0o2 == null;
        UserInfoEditActivity userInfoEditActivity = this.f50418OooO0Oo;
        if (z2) {
            userInfoEditActivity.f26820OooOo = null;
            String strOooO0OO = o0000.OooO0OO(o000000.Profile_photo_upload_failed);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            Intrinsics.checkNotNull(oooO0o2);
            userInfoEditActivity.f26820OooOo = oooO0o2.OooO00o();
            userInfoEditActivity.f26826OooOoO0 = oooO0o2.f38405OooO0OO.f38464OooO00o;
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(userInfoEditActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            String strOooO00o = oooO0o2.OooO00o();
            int iOooO00o = o0000O0.OooO00o(110);
            oooO00o.f43126OooO0OO = OooO0OO.OooO0oo(iOooO00o, iOooO00o, strOooO00o);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f45663OooO0oo);
        }
        userInfoEditActivity.OooOo0();
        userInfoEditActivity.Oooo000();
        return Unit.INSTANCE;
    }
}
