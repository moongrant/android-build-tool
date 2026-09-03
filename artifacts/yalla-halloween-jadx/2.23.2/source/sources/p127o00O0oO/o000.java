package p127o00O0oO;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.widget.o0000O0O;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 implements o0000O<Uri, Uri> {
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // p127o00O0oO.o0000O
    public final Uri OooO00o(Uri uri, o0O0O00 o0o0o00) throws PackageManager.NameNotFoundException {
        boolean z;
        Uri uri2 = uri;
        if (Intrinsics.areEqual(uri2.getScheme(), "android.resource")) {
            String authority = uri2.getAuthority();
            if ((authority == null || StringsKt.isBlank(authority)) || uri2.getPathSegments().size() != 2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String authority2 = uri2.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = o0o0o00.f36838OooO00o.getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri2.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (!(identifier != 0)) {
            throw new IllegalStateException(o0000O0O.OooO00o("Invalid android.resource URI: ", uri2).toString());
        }
        Uri uri3 = Uri.parse("android.resource://" + authority2 + '/' + identifier);
        Intrinsics.checkNotNullExpressionValue(uri3, "parse(this)");
        return uri3;
    }
}
