package p506o0o00ooO;

import com.yalla.netimage.listener.OooOO0O;
import com.yalla.yalla.ui.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f49728OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShowImageUrlMoreHolderView f49729OooO0o0;

    public oOO0OO0O(ShowImageUrlMoreHolderView showImageUrlMoreHolderView) {
        this.f49729OooO0o0 = showImageUrlMoreHolderView;
    }

    @Override // com.yalla.netimage.listener.OooOO0O
    public final void OooO00o() {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = this.f49729OooO0o0;
        OooOOO0.OooO0O0("progressListener 加载原图 onFailed");
        try {
            showImageUrlMoreHolderView.f27776OooOO0.setImageDrawable(null);
            showImageUrlMoreHolderView.f27776OooOO0.setVisibility(8);
            showImageUrlMoreHolderView.f27780OooOOO0.setVisibility(8);
            showImageUrlMoreHolderView.f27778OooOO0o.setVisibility(8);
            showImageUrlMoreHolderView.f27779OooOOO.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.yalla.netimage.listener.OooOO0O
    public final void OooO0O0(int i, boolean z) {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = this.f49729OooO0o0;
        Boolean bool = this.f49728OooO0Oo;
        if (bool == null || bool.booleanValue() != z) {
            this.f49728OooO0Oo = Boolean.valueOf(z);
            OooOOO0.OooO0O0("progressListener 加载原图 \nprogress = " + i + ", finish = " + z);
        }
        if (z) {
            try {
                showImageUrlMoreHolderView.f27776OooOO0.setImageDrawable(null);
                showImageUrlMoreHolderView.f27776OooOO0.setVisibility(8);
                showImageUrlMoreHolderView.f27780OooOOO0.setVisibility(8);
                showImageUrlMoreHolderView.f27778OooOO0o.setVisibility(0);
                showImageUrlMoreHolderView.f27779OooOOO.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
