package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f3257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f3258OooO0o0;

    public o0000oo(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f3258OooO0o0 = scrollingTabContainerView;
        this.f3257OooO0Oo = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f3257OooO0Oo;
        int left = view.getLeft();
        ScrollingTabContainerView scrollingTabContainerView = this.f3258OooO0o0;
        scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
        scrollingTabContainerView.f2997OooO0Oo = null;
    }
}
