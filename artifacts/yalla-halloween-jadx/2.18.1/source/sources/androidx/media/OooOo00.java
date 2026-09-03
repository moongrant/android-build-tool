package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOo00 {

    public static class OooO00o extends MediaBrowserService {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO0OO f8613Oooo0o;

        public OooO00o(Context context, OooO0OO oooO0OO) {
            attachBaseContext(context);
            this.f8613Oooo0o = oooO0OO;
        }

        @Override // android.service.media.MediaBrowserService
        public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.OooO00o(bundle);
            this.f8613Oooo0o.OooO0OO(str, i, bundle == null ? null : new Bundle(bundle));
            return null;
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f8613Oooo0o.OooO0O0(str, new OooO0O0<>(result));
        }
    }

    public static class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public MediaBrowserService.Result f8614OooO00o;

        public OooO0O0(MediaBrowserService.Result result) {
            this.f8614OooO00o = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(T t) {
            ArrayList arrayList = null;
            if (!(t instanceof List)) {
                if (!(t instanceof Parcel)) {
                    this.f8614OooO00o.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f8614OooO00o.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            MediaBrowserService.Result result = this.f8614OooO00o;
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    public interface OooO0OO {
        void OooO0O0(String str, OooO0O0<List<Parcel>> oooO0O0);

        void OooO0OO(String str, int i, Bundle bundle);
    }

    public static void OooO00o(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }
}
