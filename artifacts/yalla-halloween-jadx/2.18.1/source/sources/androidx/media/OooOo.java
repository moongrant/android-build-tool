package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* JADX INFO: loaded from: classes.dex */
public class OooOo extends OooOo00.OooO00o {
    public OooOo(Context context, Oooo000 oooo000) {
        super(context, oooo000);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        ((Oooo000) this.f8613Oooo0o).OooO0Oo(new OooOo00.OooO0O0(result));
    }
}
