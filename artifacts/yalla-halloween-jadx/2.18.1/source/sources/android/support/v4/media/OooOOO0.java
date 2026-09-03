package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class OooOOO0 {

    public static class OooO00o {
        public static void OooO00o(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri OooO00o(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
