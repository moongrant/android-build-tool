package p496o0o00o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p136o00OOOo0.OooO0OO;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o extends Lambda implements Function1<OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49166OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49166OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = oooO0OO;
        boolean z = true;
        boolean z2 = oooO0OO2 == null;
        UserInfoEditActivity userInfoEditActivity = this.f49166OooO0Oo;
        if (z2) {
            userInfoEditActivity.f27285OooOo = null;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Profile_photo_upload_failed);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            Intrinsics.checkNotNull(oooO0OO2);
            userInfoEditActivity.f27285OooOo = oooO0OO2.OooO00o();
            userInfoEditActivity.f27291OooOoO0 = oooO0OO2.f37355OooO0OO.f37395OooO00o;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(userInfoEditActivity);
            oooO00o.OooO00o(OooO.OooO0OO());
            String strOooO00o = oooO0OO2.OooO00o();
            int iOooO00o = o0000O0.OooO00o(110);
            oooO00o.f43911OooO0OO = OooO0o.OooO0oo(iOooO00o, iOooO00o, strOooO00o);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f58083OooO0oo);
        }
        userInfoEditActivity.OooOo0();
        userInfoEditActivity.Oooo000();
        return Unit.INSTANCE;
    }
}
