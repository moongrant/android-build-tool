package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f8399Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f8400Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Rect f8401Oooo0oo;

    public OooOOO0(o0000O0O o0000o0o2, View view, Rect rect) {
        this.f8399Oooo0o = o0000o0o2;
        this.f8400Oooo0oO = view;
        this.f8401Oooo0oo = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8399Oooo0o.OooO0oO(this.f8400Oooo0oO, this.f8401Oooo0oo);
    }
}
