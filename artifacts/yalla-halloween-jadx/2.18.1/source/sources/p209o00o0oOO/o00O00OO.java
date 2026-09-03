package p209o00o0oOO;

import p213o00o0ooo.o00O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO extends o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f33349OooO00o;

    public o00O00OO(o00O00o0 o00o00o1) {
        this.f33349OooO00o = o00o00o1;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    @Override // p213o00o0ooo.o00O0, p213o00o0ooo.o00O0O00
    public final void OooO0oO(int i) {
        o00O00o0 o00o00o1 = this.f33349OooO00o;
        o00o00o1.f33362OooOOO = (~i) & o00o00o1.f33362OooOOO;
        o00o00o1.f33364OooOOOO.remove(this);
    }
}
