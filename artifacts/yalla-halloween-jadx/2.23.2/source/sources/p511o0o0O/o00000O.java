package p511o0o0O;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50955OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50956OooO0o0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f50955OooO0Oo = i;
        this.f50956OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x008e A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v16 java.lang.Object, still in use, count: 2, list:
          (r8v16 java.lang.Object) from 0x0055: PHI (r8 I:??) = (r8v8 java.lang.Object), (r8v16 java.lang.Object) binds: [B:19:0x0054, B:59:0x0055] A[DONT_GENERATE, DONT_INLINE]
          (r8v16 java.lang.Object) from 0x0042: CHECK_CAST (com.yalla.yalla.ui.fragment.GiftSendFragment) (r8v16 java.lang.Object)
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
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:56)
        */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p511o0o0O.o00000O.onChanged(java.lang.Object):void");
    }
}
