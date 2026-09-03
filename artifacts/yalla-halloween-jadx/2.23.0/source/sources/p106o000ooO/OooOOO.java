package p106o000ooO;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements OooOo00<Uri, File> {
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // p106o000ooO.OooOo00
    public final File OooO00o(Uri uri, o0Oo0oo o0oo0oo2) {
        boolean z;
        Uri uriBuild = uri;
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
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
