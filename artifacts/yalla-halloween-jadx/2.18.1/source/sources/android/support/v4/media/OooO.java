package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.OooO0o;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OooO<T extends OooO0o> extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f4249OooO00o;

    public OooO(T t) {
        this.f4249OooO00o = t;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
        this.f4249OooO00o.OooO00o(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(@NonNull String str) {
        this.f4249OooO00o.onError();
    }
}
