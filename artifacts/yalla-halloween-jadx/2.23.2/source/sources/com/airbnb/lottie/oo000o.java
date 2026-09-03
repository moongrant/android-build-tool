package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f12021OooO0Oo;

    public oo000o(o00oO0o o00oo0o2) {
        this.f12021OooO0Oo = o00oo0o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12021OooO0Oo.f12016OooO0Oo == null) {
            return;
        }
        o00Ooo<T> o00ooo2 = this.f12021OooO0Oo.f12016OooO0Oo;
        V v = o00ooo2.f12010OooO00o;
        if (v != 0) {
            o00oO0o.OooO00o(this.f12021OooO0Oo, v);
            return;
        }
        o00oO0o o00oo0o2 = this.f12021OooO0Oo;
        Throwable th = o00ooo2.f12011OooO0O0;
        synchronized (o00oo0o2) {
            ArrayList arrayList = new ArrayList(o00oo0o2.f12014OooO0O0);
            if (arrayList.isEmpty()) {
                o00OOO0.OooOO0.OooO0OO("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((o0OoOo0) it.next()).OooO00o(th);
            }
        }
    }
}
