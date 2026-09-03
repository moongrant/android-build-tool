package p135o00OO0o0;

import com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import com.yalla.yalla.util.netimage.listener.OooOO0O;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Boolean f31642OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ShowImageUrlMoreHolderView f31643OooO0O0;

    public o0o0Oo(ShowImageUrlMoreHolderView showImageUrlMoreHolderView) {
        this.f31643OooO0O0 = showImageUrlMoreHolderView;
    }

    @Override // com.yalla.yalla.util.netimage.listener.OooOO0O
    public final void OooO0OO() {
        o00O00.OooO0O0("progressListener 加载原图 onFailed");
        try {
            this.f31643OooO0O0.f11451OoooO0O.setImageDrawable(null);
            this.f31643OooO0O0.f11451OoooO0O.setVisibility(8);
            this.f31643OooO0O0.f11455o000oOoO.setVisibility(8);
            this.f31643OooO0O0.f11452OoooOO0.setVisibility(8);
            this.f31643OooO0O0.f11453OoooOOO.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.yalla.yalla.util.netimage.listener.OooOO0O
    public final void OooO0Oo(int i, boolean z) {
        Boolean bool = this.f31642OooO00o;
        if (bool == null || bool.booleanValue() != z) {
            this.f31642OooO00o = Boolean.valueOf(z);
            o00O00.OooO0O0("progressListener 加载原图 \nprogress = " + i + ", finish = " + z);
        }
        if (z) {
            try {
                this.f31643OooO0O0.f11451OoooO0O.setImageDrawable(null);
                this.f31643OooO0O0.f11451OoooO0O.setVisibility(8);
                this.f31643OooO0O0.f11455o000oOoO.setVisibility(8);
                this.f31643OooO0O0.f11452OoooOO0.setVisibility(0);
                this.f31643OooO0O0.f11453OoooOOO.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
