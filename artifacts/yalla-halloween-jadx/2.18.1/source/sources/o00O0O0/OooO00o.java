package o00O0O0;

import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0O0<Uri, File> {
    @Override // o00O0O0.OooO0O0
    public final boolean OooO00o(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(data.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
            String strOooO00o = o00O0O.OooO00o(data);
            if ((strOooO00o == null || Intrinsics.areEqual(strOooO00o, "android_asset")) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Override // o00O0O0.OooO0O0
    public final File OooO0O0(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "<this>");
        if (!Intrinsics.areEqual(data.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + data).toString());
        }
        String path = data.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + data).toString());
    }
}
