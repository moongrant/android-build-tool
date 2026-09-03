package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3676OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3677OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3678OooO0o0;

    public /* synthetic */ o0000Ooo(int i, Object obj, Object obj2) {
        this.f3676OooO0Oo = i;
        this.f3678OooO0o0 = obj;
        this.f3677OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3676OooO0Oo) {
            case 0:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f3678OooO0o0;
                String str = (String) this.f3677OooO0o;
                deferrableSurface.getClass();
                try {
                    deferrableSurface.f3535OooO0o0.get();
                    deferrableSurface.OooO0o(DeferrableSurface.f3529OooOO0o.decrementAndGet(), DeferrableSurface.f3528OooOO0O.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    p028Oooo0oO.o00O0O0.OooO0O0("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
                    synchronized (deferrableSurface.f3530OooO00o) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f3532OooO0OO), Integer.valueOf(deferrableSurface.f3531OooO0O0)), e);
                    }
                }
            default:
                ((o0ooOO0.o000Oo0.OooO00o) this.f3677OooO0o).OooO0O0(((Oooooo.o0000Ooo.OooO0OO) this.f3678OooO0o0).f1930OooO0O0);
                return;
        }
    }
}
