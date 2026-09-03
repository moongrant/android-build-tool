package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Field f8615OooO00o;

    public static class OooO00o extends OooOo {
        public OooO00o(Context context, OooO0OO oooO0OO) {
            super(context, oooO0OO);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.OooO00o(bundle);
            ((OooO0OO) this.f8613Oooo0o).OooO00o(str, new OooO0O0(result));
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public MediaBrowserService.Result f8616OooO00o;

        public OooO0O0(MediaBrowserService.Result result) {
            this.f8616OooO00o = result;
        }
    }

    public interface OooO0OO extends Oooo000 {
        void OooO00o(String str, OooO0O0 oooO0O0);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f8615OooO00o = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }
}
