package p128o00O0oo0;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {
    public static boolean OooO00o(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }
}
