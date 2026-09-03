package o00;

import androidx.work.impl.WorkDatabase;
import o00O0000.o00Oo0;
import o00O0000.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f26554Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f26555Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.OooO00o f26556Oooo0oo;

    public OooO0O0(androidx.work.impl.foreground.OooO00o oooO00o, WorkDatabase workDatabase, String str) {
        this.f26556Oooo0oo = oooO00o;
        this.f26554Oooo0o = workDatabase;
        this.f26555Oooo0oO = str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o00O0000.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashSet, java.util.Set<o00O0000.o0OoOo0>] */
    @Override // java.lang.Runnable
    public final void run() {
        o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) this.f26554Oooo0o.OooOo0O()).OooO0oo(this.f26555Oooo0oO);
        if (o0oooo0OooO0oo == null || !o0oooo0OooO0oo.OooO0O0()) {
            return;
        }
        synchronized (this.f26556Oooo0oo.f9825Oooo) {
            this.f26556Oooo0oo.f9832OoooO0O.put(this.f26555Oooo0oO, o0oooo0OooO0oo);
            this.f26556Oooo0oo.f9829OoooO.add(o0oooo0OooO0oo);
            androidx.work.impl.foreground.OooO00o oooO00o = this.f26556Oooo0oo;
            oooO00o.f9833OoooOO0.OooO0O0(oooO00o.f9829OoooO);
        }
    }
}
