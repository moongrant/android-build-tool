package p282o0O00o0;

import com.app.base.view.banner.BannerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BannerView f35208Oooo0o;

    public OooOO0O(BannerView bannerView) {
        this.f35208Oooo0o = bannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iOooO0OO = this.f35208Oooo0o.OooO0OO();
        if (iOooO0OO < 0 || iOooO0OO >= this.f35208Oooo0o.getAdapter().getItemCount()) {
            return;
        }
        BannerView bannerView = this.f35208Oooo0o;
        bannerView.postDelayed(bannerView.f12153Oooo0o, bannerView.f12155Oooo0oo);
    }
}
