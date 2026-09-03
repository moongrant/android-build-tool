package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.OooOO0;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O<T extends OooOO0> extends OooO<T> {
    public OooOO0O(T t) {
        super(t);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
        MediaSessionCompat.OooO00o(bundle);
        ((OooOO0) this.f4249OooO00o).OooO0O0(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(@NonNull String str, @NonNull Bundle bundle) {
        MediaSessionCompat.OooO00o(bundle);
        ((OooOO0) this.f4249OooO00o).OooO0OO();
    }
}
