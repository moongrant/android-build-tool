package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47807OooO0Oo;

    public o0000O0O(MomentDetailActivity momentDetailActivity) {
        this.f47807OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = MomentDetailActivity.f26057Oooo0;
        this.f47807OooO0Oo.OooOoOO().f59049OooO0O0.setExpanded(false);
    }
}
