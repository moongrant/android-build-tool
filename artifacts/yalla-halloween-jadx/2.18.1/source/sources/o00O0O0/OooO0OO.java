package o00O0O0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements OooO0O0<Integer, Uri> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30420OooO00o;

    public OooO0OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30420OooO00o = context;
    }

    @Override // o00O0O0.OooO0O0
    public final boolean OooO00o(Integer num) {
        try {
            return this.f30420OooO00o.getResources().getResourceEntryName(num.intValue()) != null;
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // o00O0O0.OooO0O0
    public final Uri OooO0O0(Integer num) {
        int iIntValue = num.intValue();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("android.resource://");
        sbOooO0o0.append((Object) this.f30420OooO00o.getPackageName());
        sbOooO0o0.append('/');
        sbOooO0o0.append(iIntValue);
        Uri uri = Uri.parse(sbOooO0o0.toString());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
