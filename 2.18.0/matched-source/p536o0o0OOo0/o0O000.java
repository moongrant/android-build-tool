package p536o0o0OOo0;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43557OooO0O0;

    public /* synthetic */ o0O000(Object obj, int i) {
        this.f43556OooO00o = i;
        this.f43557OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0166  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<T>] */
    /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
          (r3v5 java.lang.Object) from 0x015f: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:46:0x015e, B:53:0x015f] A[DONT_GENERATE, DONT_INLINE]
          (r3v5 java.lang.Object) from 0x0147: CHECK_CAST (com.yalla.yalla.model.EventModel) (r3v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:47)
        */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p536o0o0OOo0.o0O000.onChanged(java.lang.Object):void");
    }
}
