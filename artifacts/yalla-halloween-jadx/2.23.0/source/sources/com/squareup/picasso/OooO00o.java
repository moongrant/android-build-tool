package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f21676OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f21677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo f21678OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C0277OooO00o f21679OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f21680OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f21681OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f21682OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f21683OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f21684OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f21685OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f21686OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f21687OooOO0o;

    /* JADX INFO: renamed from: com.squareup.picasso.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0277OooO00o<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f21688OooO00o;

        public C0277OooO00o(OooO00o oooO00o, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f21688OooO00o = oooO00o;
        }
    }

    public OooO00o(Picasso picasso, Object obj, o00Ooo o00ooo2, int i, String str) {
        this.f21677OooO00o = picasso;
        this.f21678OooO0O0 = o00ooo2;
        this.f21679OooO0OO = obj == null ? null : new C0277OooO00o(this, obj, picasso.f21752OooO);
        this.f21682OooO0o0 = 0;
        this.f21681OooO0o = 0;
        this.f21680OooO0Oo = false;
        this.f21683OooO0oO = i;
        this.f21684OooO0oo = null;
        this.f21676OooO = str;
        this.f21685OooOO0 = this;
    }

    public void OooO00o() {
        this.f21687OooOO0o = true;
    }

    public abstract void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void OooO0OO();

    public final T OooO0Oo() {
        C0277OooO00o c0277OooO00o = this.f21679OooO0OO;
        if (c0277OooO00o == null) {
            return null;
        }
        return (T) c0277OooO00o.get();
    }
}
