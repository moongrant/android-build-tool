package p127o00O0oO;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o00OO00O.OooOo00;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements o0000O<Uri, File> {
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // p127o00O0oO.o0000O
    public final File OooO00o(Uri uri, o0O0O00 o0o0o00) {
        boolean z;
        Uri uriBuild = uri;
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        if (!(Intrinsics.areEqual(uriBuild.getScheme(), ShareInternalUtility.STAGING_PARAM) && Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) uriBuild.getPathSegments()), "android_asset"))) {
            String scheme = uriBuild.getScheme();
            if (scheme == null || Intrinsics.areEqual(scheme, ShareInternalUtility.STAGING_PARAM)) {
                String path = uriBuild.getPath();
                if (path == null) {
                    path = "";
                }
                z = StringsKt__StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && ((String) CollectionsKt.firstOrNull((List) uriBuild.getPathSegments())) != null;
            }
        }
        if (!z) {
            return null;
        }
        if (uriBuild.getScheme() != null) {
            uriBuild = uriBuild.buildUpon().scheme(null).build();
        }
        return new File(uriBuild.toString());
    }
}
