package p474o0o00;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
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
public final class o000O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47244OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(LoginActivity loginActivity) {
        super(1);
        this.f47244OooO0Oo = loginActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        LoginActivity loginActivity = this.f47244OooO0Oo;
        if (zBooleanValue) {
            int i = LoginActivity.f25186OooOo0O;
            StateButton stateButton = loginActivity.OooOoO().f59222OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(stateButton, "binding.btYallaChat");
            o000OO00.OooOOO0(stateButton, true);
        } else {
            Context context = o000O0.f10354OooO00o;
            Activity context2 = OooO0O0.OooO0O0();
            if (context2 != null) {
                Intrinsics.checkNotNullParameter(context2, "context");
                try {
                    List<PackageInfo> installedPackages = context2.getPackageManager().getInstalledPackages(0);
                    Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
                    Iterator<T> it2 = installedPackages.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        try {
                            String str = ((PackageInfo) it2.next()).packageName;
                            Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                            if (StringsKt__StringsKt.contains(str, "com.yallatech.yallachat", true)) {
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
                int i2 = LoginActivity.f25186OooOo0O;
                StateButton stateButton2 = loginActivity.OooOoO().f59222OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(stateButton2, "binding.btYallaChat");
                o000OO00.OooOOO0(stateButton2, true);
            } else {
                int i3 = LoginActivity.f25186OooOo0O;
                StateButton stateButton3 = loginActivity.OooOoO().f59222OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(stateButton3, "binding.btYallaChat");
                o000OO00.OooOOO0(stateButton3, false);
            }
        }
        return Unit.INSTANCE;
    }
}
