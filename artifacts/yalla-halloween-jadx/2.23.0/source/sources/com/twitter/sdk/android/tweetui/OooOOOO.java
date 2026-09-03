package com.twitter.sdk.android.tweetui;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO implements com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0283OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GalleryActivity f22314OooO00o;

    public OooOOOO(GalleryActivity galleryActivity) {
        this.f22314OooO00o = galleryActivity;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0283OooO00o
    public final void OooO00o() {
    }

    @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0283OooO00o
    public final void onDismiss() {
        GalleryActivity galleryActivity = this.f22314OooO00o;
        galleryActivity.finish();
        galleryActivity.overridePendingTransition(0, o00oO0o.tw__slide_out);
    }
}
