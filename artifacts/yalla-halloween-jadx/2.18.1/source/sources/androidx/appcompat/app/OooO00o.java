package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ View f4510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f4511OooO0O0;

    public OooO00o(View view, View view2) {
        this.f4510OooO00o = view;
        this.f4511OooO0O0 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.OooO0OO(absListView, this.f4510OooO00o, this.f4511OooO0O0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
