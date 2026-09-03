package p192o00o0O0;

import android.view.View;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import p199o00o0Oo.o00O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 extends o00O00O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f33088Oooo;

    public o0000O0(o0000O0O o0000o0o2) {
        this.f33088Oooo = o0000o0o2;
    }

    @Override // p199o00o0Oo.o00O00O
    public final void OooO00o(View view) {
        if (this.f33088Oooo.f33090OooO0Oo.f12286OoooO.isShown()) {
            this.f33088Oooo.f33090OooO0Oo.f12286OoooO.setVisibility(8);
            return;
        }
        ShowImagesSelectActivity showImagesSelectActivity = this.f33088Oooo.f33090OooO0Oo;
        if (showImagesSelectActivity.f12283Oooo > 1) {
            showImagesSelectActivity.f12286OoooO.setVisibility(0);
        }
    }
}
