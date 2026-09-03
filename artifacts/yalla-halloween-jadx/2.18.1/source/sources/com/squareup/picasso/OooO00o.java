package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f19690OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f19691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0 f19692OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WeakReference<T> f19693OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f19694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f19695OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19696OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f19697OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f19698OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f19699OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f19700OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f19701OooOO0o;

    /* JADX INFO: renamed from: com.squareup.picasso.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0176OooO00o<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f19702OooO00o;

        public C0176OooO00o(OooO00o oooO00o, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f19702OooO00o = oooO00o;
        }
    }

    public OooO00o(Picasso picasso, Object obj, Oooo0 oooo0, int i, String str) {
        this.f19691OooO00o = picasso;
        this.f19692OooO0O0 = oooo0;
        this.f19693OooO0OO = obj == null ? null : new C0176OooO00o(this, obj, picasso.f19801OooOO0);
        this.f19696OooO0o0 = 0;
        this.f19695OooO0o = 0;
        this.f19694OooO0Oo = false;
        this.f19697OooO0oO = i;
        this.f19698OooO0oo = null;
        this.f19690OooO = str;
        this.f19699OooOO0 = this;
    }

    public void OooO00o() {
        this.f19701OooOO0o = true;
    }

    public abstract void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void OooO0OO();

    public final T OooO0Oo() {
        WeakReference<T> weakReference = this.f19693OooO0OO;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
