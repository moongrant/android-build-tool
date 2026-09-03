package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f5311Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f5312Oooo0oO;

    public o00000(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f5312Oooo0oO = scrollingTabContainerView;
        this.f5311Oooo0o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5312Oooo0oO.smoothScrollTo(this.f5311Oooo0o.getLeft() - ((this.f5312Oooo0oO.getWidth() - this.f5311Oooo0o.getWidth()) / 2), 0);
        this.f5312Oooo0oO.f5114Oooo0o = null;
    }
}
