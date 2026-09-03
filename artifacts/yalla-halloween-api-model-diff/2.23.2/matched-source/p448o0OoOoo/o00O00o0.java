package p448o0OoOoo;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47410OooO0o0;

    public /* synthetic */ o00O00o0(Object obj, int i) {
        this.f47409OooO0Oo = i;
        this.f47410OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v12 java.lang.Object, still in use, count: 2, list:
          (r1v12 java.lang.Object) from 0x003b: PHI (r1 I:??) = (r1v9 java.lang.Object), (r1v12 java.lang.Object) binds: [B:14:0x003a, B:27:0x003b] A[DONT_GENERATE, DONT_INLINE]
          (r1v12 java.lang.Object) from 0x002a: CHECK_CAST (com.yalla.yalla.model.event.EventModel) (r1v12 java.lang.Object)
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
    public final void onChanged(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f47409OooO0Oo
            java.lang.Object r1 = r6.f47410OooO0o0
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L49
        L8:
            com.yalla.yalla.module.event.vm.EventMineViewModel r1 = (com.yalla.yalla.module.event.vm.EventMineViewModel) r1
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = r7.longValue()
            java.lang.String r7 = "$mineVM"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            o00o00oO.o000 r7 = r1.getMineEventPager()
            java.util.List<T> r0 = r7.f38497OooO0Oo
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            r4 = r1
            com.yalla.yalla.model.event.EventModel r4 = (com.yalla.yalla.model.event.EventModel) r4
            long r4 = r4.getId()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L36
            r4 = 1
            goto L37
        L36:
            r4 = 0
        L37:
            if (r4 == 0) goto L1f
            goto L3b
        L3a:
            r1 = 0
        L3b:
            com.yalla.yalla.model.event.EventModel r1 = (com.yalla.yalla.model.event.EventModel) r1
            java.util.List<T> r0 = r7.f38497OooO0Oo
            if (r1 != 0) goto L42
            goto L48
        L42:
            r0.remove(r1)
            r7.OooO0O0()
        L48:
            return
        L49:
            com.yalla.yalla.ui.activity.moment.MomentReplyActivity r1 = (com.yalla.yalla.ui.activity.moment.MomentReplyActivity) r1
            int r0 = com.yalla.yalla.ui.activity.moment.MomentReplyActivity.f25700OooOoO
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9c
            com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM r7 = r1.OooOoO()
            com.yalla.yalla.model.moment.MomentCommentDetailModel r7 = r7.getCurrentComment()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            long r2 = r7.getNum()
            r4 = 1
            long r2 = r2 + r4
            r7.setNum(r2)
            com.yalla.yalla.ui.view.HeaderLayout r7 = r1.f22282OooOO0
            if (r7 == 0) goto L9c
            int r0 = p562o0oOo000.o000000.xxx_replies
            java.lang.String r0 = r1.getString(r0)
            com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM r1 = r1.OooOoO()
            com.yalla.yalla.model.moment.MomentCommentDetailModel r1 = r1.getCurrentComment()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            long r1 = r1.getNum()
            java.lang.String r1 = androidx.media3.session.o0000O00.OooO00o(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r0 = com.code.android.util.o0000O.OooO00o(r0, r1)
            r7.setTitle(r0)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p448o0OoOoo.o00O00o0.onChanged(java.lang.Object):void");
    }
}
