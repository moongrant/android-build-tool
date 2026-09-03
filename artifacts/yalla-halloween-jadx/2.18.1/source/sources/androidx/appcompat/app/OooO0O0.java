package androidx.appcompat.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f4512Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f4513Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ AlertController f4514Oooo0oo;

    public OooO0O0(AlertController alertController, View view, View view2) {
        this.f4514Oooo0oo = alertController;
        this.f4512Oooo0o = view;
        this.f4513Oooo0oO = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.OooO0OO(this.f4514Oooo0oo.f4367OooO0o, this.f4512Oooo0o, this.f4513Oooo0oO);
    }
}
