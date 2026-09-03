package p439o0OoOOo0;

import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.internal.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements OooO00o.InterfaceC0183OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GalleryActivity f40123OooO00o;

    public o0000O(GalleryActivity galleryActivity) {
        this.f40123OooO00o = galleryActivity;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o
    public final void OooO00o() {
    }

    @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o
    public final void onDismiss() {
        this.f40123OooO00o.finish();
        this.f40123OooO00o.overridePendingTransition(0, o000OO0O.tw__slide_out);
    }
}
