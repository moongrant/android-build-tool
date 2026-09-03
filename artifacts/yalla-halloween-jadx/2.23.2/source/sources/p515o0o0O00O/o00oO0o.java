package p515o0o0O00O;

import com.yalla.netimage.listener.OooOO0O;
import com.yalla.yalla.ui.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f51085OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShowImageUrlMoreHolderView f51086OooO0o0;

    public o00oO0o(ShowImageUrlMoreHolderView showImageUrlMoreHolderView) {
        this.f51086OooO0o0 = showImageUrlMoreHolderView;
    }

    @Override // com.yalla.netimage.listener.OooOO0O
    public final void OooO00o() {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = this.f51086OooO0o0;
        o0000O00.OooO0O0("progressListener 加载原图 onFailed");
        try {
            showImageUrlMoreHolderView.f27314OooOO0.setImageDrawable(null);
            showImageUrlMoreHolderView.f27314OooOO0.setVisibility(8);
            showImageUrlMoreHolderView.f27318OooOOO0.setVisibility(8);
            showImageUrlMoreHolderView.f27316OooOO0o.setVisibility(8);
            showImageUrlMoreHolderView.f27317OooOOO.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.yalla.netimage.listener.OooOO0O
    public final void OooO0O0(int i, boolean z) {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = this.f51086OooO0o0;
        Boolean bool = this.f51085OooO0Oo;
        if (bool == null || bool.booleanValue() != z) {
            this.f51085OooO0Oo = Boolean.valueOf(z);
            o0000O00.OooO0O0("progressListener 加载原图 \nprogress = " + i + ", finish = " + z);
        }
        if (z) {
            try {
                showImageUrlMoreHolderView.f27314OooOO0.setImageDrawable(null);
                showImageUrlMoreHolderView.f27314OooOO0.setVisibility(8);
                showImageUrlMoreHolderView.f27318OooOOO0.setVisibility(8);
                showImageUrlMoreHolderView.f27316OooOO0o.setVisibility(0);
                showImageUrlMoreHolderView.f27317OooOOO.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
