package OooOO0O;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import OooO0O0.OooOo00;
import android.content.pm.PackageInfo;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0OO00O;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0o.OooO00o f171OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull OooO0o.OooO00o fragment1) {
        super(fragment1);
        Intrinsics.checkNotNullParameter(fragment1, "fragment1");
        this.f171OooO = fragment1;
    }

    @Override // p003OooO0o0.o00Oo0
    @Nullable
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 OooO0oO() {
        o0Oo0oo o0oo0oo2 = this.f132OooO0Oo;
        if (!(o0oo0oo2 instanceof OooO0O0)) {
            return null;
        }
        if (o0oo0oo2 != null) {
            return (OooO0O0) o0oo0oo2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.login.Request");
    }

    @Override // p003OooO0o0.o00Oo0
    @NotNull
    public final BaseResp OooO00o(int i, @Nullable String str) {
        return AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, i, str, 1);
    }

    @Override // p003OooO0o0.o00Oo0
    @NotNull
    public final ArrayList<oo000o> OooO0o() {
        Object next;
        ArrayList<oo000o> arrayList = new ArrayList<>();
        FragmentActivity context = OooO0o0();
        OooOo00 appInfo = OooOo00.f109OooO0O0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        List<PackageInfo> installedPackages = context.getApplicationContext().getPackageManager().getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "context.applicationConte…r.getInstalledPackages(0)");
        Iterator<T> it = installedPackages.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((PackageInfo) next).packageName, "com.yallatech.yallachat"));
        if (next != null) {
            arrayList.add(new o0OoOo0(this));
            arrayList.add(new o0OO00O(this));
            arrayList.add(new OooO0o(this));
        } else {
            appInfo.getClass();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            appInfo.f95OooO00o = "";
            o0Oo0oo o0oo0oo2 = this.f132OooO0Oo;
            if (o0oo0oo2 != null) {
                o0oo0oo2.f143OooO00o = appInfo;
            }
            arrayList.add(new o0OO00O(this));
            arrayList.add(new OooOO0(this));
        }
        return arrayList;
    }
}
