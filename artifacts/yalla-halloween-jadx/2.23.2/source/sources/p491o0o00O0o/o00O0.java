package p491o0o00O0o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f48969OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(LoginActivity loginActivity) {
        super(1);
        this.f48969OooO0Oo = loginActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        LoginActivity loginActivity = this.f48969OooO0Oo;
        if (zBooleanValue) {
            int i = LoginActivity.f24727OooOo0O;
            StateButton btYallaChat = loginActivity.OooOoO().f44269OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(btYallaChat, "btYallaChat");
            o000O.OooOOO0(btYallaChat, true);
        } else {
            Context context = o000O00O.f13421OooO00o;
            Activity context2 = OooO0O0.OooO0O0();
            if (context2 != null) {
                Intrinsics.checkNotNullParameter(context2, "context");
                try {
                    List<PackageInfo> installedPackages = context2.getPackageManager().getInstalledPackages(0);
                    Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
                    Iterator<T> it = installedPackages.iterator();
                    z = false;
                    while (it.hasNext()) {
                        try {
                            String packageName = ((PackageInfo) it.next()).packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                            if (StringsKt__StringsKt.contains(packageName, "com.yallatech.yallachat", true)) {
                                z = true;
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                int i2 = LoginActivity.f24727OooOo0O;
                StateButton btYallaChat2 = loginActivity.OooOoO().f44269OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(btYallaChat2, "btYallaChat");
                o000O.OooOOO0(btYallaChat2, true);
            } else {
                int i3 = LoginActivity.f24727OooOo0O;
                StateButton btYallaChat3 = loginActivity.OooOoO().f44269OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(btYallaChat3, "btYallaChat");
                o000O.OooOOO0(btYallaChat3, false);
            }
        }
        return Unit.INSTANCE;
    }
}
