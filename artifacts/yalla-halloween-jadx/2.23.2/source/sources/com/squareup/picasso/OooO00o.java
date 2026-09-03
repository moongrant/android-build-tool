package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f21203OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f21204OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo f21205OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C0276OooO00o f21206OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f21207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f21208OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f21209OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f21210OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f21211OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f21212OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f21213OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f21214OooOO0o;

    /* JADX INFO: renamed from: com.squareup.picasso.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0276OooO00o<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f21215OooO00o;

        public C0276OooO00o(OooO00o oooO00o, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f21215OooO00o = oooO00o;
        }
    }

    public OooO00o(Picasso picasso, Object obj, o00Ooo o00ooo2, int i, String str) {
        this.f21204OooO00o = picasso;
        this.f21205OooO0O0 = o00ooo2;
        this.f21206OooO0OO = obj == null ? null : new C0276OooO00o(this, obj, picasso.f21279OooO);
        this.f21209OooO0o0 = 0;
        this.f21208OooO0o = 0;
        this.f21207OooO0Oo = false;
        this.f21210OooO0oO = i;
        this.f21211OooO0oo = null;
        this.f21203OooO = str;
        this.f21212OooOO0 = this;
    }

    public void OooO00o() {
        this.f21214OooOO0o = true;
    }

    public abstract void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void OooO0OO();

    public final T OooO0Oo() {
        C0276OooO00o c0276OooO00o = this.f21206OooO0OO;
        if (c0276OooO00o == null) {
            return null;
        }
        return (T) c0276OooO00o.get();
    }
}
