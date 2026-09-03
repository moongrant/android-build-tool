package p106o000ooO;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.widget.o0000O0O;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements OooOo00<Uri, Uri> {
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // p106o000ooO.OooOo00
    public final Uri OooO00o(Uri uri, o0Oo0oo o0oo0oo2) throws PackageManager.NameNotFoundException {
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
        Resources resourcesForApplication = o0oo0oo2.f35863OooO00o.getPackageManager().getResourcesForApplication(authority2);
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
