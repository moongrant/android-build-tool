package p548o0oOO;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {
    public static boolean OooO00o(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }

    public static int OooO0O0(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
