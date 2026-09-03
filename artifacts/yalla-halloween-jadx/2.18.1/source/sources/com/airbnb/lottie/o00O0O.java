package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.Iterator;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f10238Oooo0o;

    public o00O0O(o00Oo0 o00oo1) {
        this.f10238Oooo0o = o00oo1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10238Oooo0o.f10243OooO0Oo == null) {
            return;
        }
        o0OoOo0<T> o0oooo1 = this.f10238Oooo0o.f10243OooO0Oo;
        V v = o0oooo1.f10248OooO00o;
        if (v != 0) {
            o00Oo0 o00oo1 = this.f10238Oooo0o;
            synchronized (o00oo1) {
                Iterator it = new ArrayList(o00oo1.f10240OooO00o).iterator();
                while (it.hasNext()) {
                    ((Oooo000) it.next()).OooO00o(v);
                }
            }
            return;
        }
        o00Oo0 o00oo2 = this.f10238Oooo0o;
        Throwable th = o0oooo1.f10249OooO0O0;
        synchronized (o00oo2) {
            ArrayList arrayList = new ArrayList(o00oo2.f10241OooO0O0);
            if (arrayList.isEmpty()) {
                o000Oo0.OooO0Oo("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Oooo000) it2.next()).OooO00o(th);
            }
        }
    }
}
