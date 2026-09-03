package o00O0O0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements OooO0O0<Uri, Uri> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30421OooO00o;

    public OooO0o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30421OooO00o = context;
    }

    @Override // o00O0O0.OooO0O0
    public final boolean OooO00o(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            String authority = data.getAuthority();
            if (!(authority == null || StringsKt.isBlank(authority))) {
                List<String> pathSegments = data.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
                if (pathSegments.size() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o00O0O0.OooO0O0
    public final Uri OooO0O0(Uri uri) throws PackageManager.NameNotFoundException {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.f30421OooO00o.getPackageManager().getResourcesForApplication(authority);
        Intrinsics.checkNotNullExpressionValue(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        List<String> pathSegments = data.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid android.resource URI: ", data).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + '/' + identifier);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(this)");
        return uri2;
    }
}
