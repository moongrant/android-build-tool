package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3680OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3681OooO0o0;

    public /* synthetic */ o0000Ooo(int i, Object obj, Object obj2) {
        this.f3679OooO0Oo = i;
        this.f3681OooO0o0 = obj;
        this.f3680OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3679OooO0Oo) {
            case 0:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f3681OooO0o0;
                String str = (String) this.f3680OooO0o;
                deferrableSurface.getClass();
                try {
                    deferrableSurface.f3538OooO0o0.get();
                    deferrableSurface.OooO0o(DeferrableSurface.f3532OooOO0o.decrementAndGet(), DeferrableSurface.f3531OooOO0O.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    p028Oooo0oO.o00O0O0.OooO0O0("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
                    synchronized (deferrableSurface.f3533OooO00o) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f3535OooO0OO), Integer.valueOf(deferrableSurface.f3534OooO0O0)), e);
                    }
                }
            default:
                ((o0ooOO0.o000O0.OooO00o) this.f3680OooO0o).OooO0O0(((Oooooo.o0000Ooo.OooO0OO) this.f3681OooO0o0).f1933OooO0O0);
                return;
        }
    }
}
