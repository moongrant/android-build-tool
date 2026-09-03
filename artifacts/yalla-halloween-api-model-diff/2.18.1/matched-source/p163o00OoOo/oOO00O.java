package p163o00OoOo;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOO00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32534OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32535OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f32536OooO0OO;

    public /* synthetic */ oOO00O(Object obj, Object obj2, int i) {
        this.f32534OooO00o = i;
        this.f32535OooO0O0 = obj;
        this.f32536OooO0OO = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 java.lang.Object, still in use, count: 2, list:
          (r4v4 java.lang.Object) from 0x0043: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v4 java.lang.Object) binds: [B:11:0x0042, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r4v4 java.lang.Object) from 0x0035: CHECK_CAST (android.app.Activity) (r4v4 java.lang.Object)
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
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f32534OooO00o
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L9;
                default: goto L7;
            }
        L7:
            goto L8d
        L9:
            java.lang.Object r0 = r6.f32535OooO0O0
            o00OoOo.o00O00OO r0 = (p163o00OoOo.o00O00OO) r0
            java.lang.Object r2 = r6.f32536OooO0OO
            o0o0OOO.o00OO00O r2 = (p530o0o0OOO.o00OO00O) r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "$liveDataSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            o00ooO0O.o00000O r1 = p254o00ooO0O.o00000O.f34254OooO00o
            java.lang.Class<com.yalla.yalla.ui.activity.account.LoginActivity> r1 = com.yalla.yalla.ui.activity.account.LoginActivity.class
            java.lang.String r3 = "cls"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.util.Stack<android.app.Activity> r3 = p254o00ooO0O.o00000O.f34256OooO0OO
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()
            r5 = r4
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Class r5 = r5.getClass()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r5 == 0) goto L2a
            goto L43
        L42:
            r4 = 0
        L43:
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
            if (r7 == 0) goto L8c
            o0o00Oo0.OooOOO r7 = p498o0o00Oo0.OooOOO.f41216OooO00o
            androidx.lifecycle.MutableLiveData r7 = r7.OooOooO()
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
            if (r7 == 0) goto L8c
            if (r4 != 0) goto L8c
            com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$OooO00o r7 = com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity.f21768OooooO0
            com.app.base.mixedroom.MixedRoomActivity r7 = r0.f32520OooO00o
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity> r3 = com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity.class
            r0.<init>(r7, r3)
            r7.startActivity(r0)
            r0 = 2130771982(0x7f01000e, float:1.714707E38)
            r3 = 2130771992(0x7f010018, float:1.714709E38)
            r7.overridePendingTransition(r0, r3)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r7 = r2.f43350Oooo00o
            r7.setValue(r1)
            o0o00Oo.OooOOO0 r7 = p497o0o00Oo.OooOOO0.f41180OooO00o
            o0o00OoO.o0OO00O r7 = p497o0o00Oo.OooOOO0.OooO0o0()
            r0 = 0
            r7.OooOoO(r0)
        L8c:
            return
        L8d:
            java.lang.Object r0 = r6.f32535OooO0O0
            o0oOoOOo.c1 r0 = (p579o0oOoOOo.c1) r0
            java.lang.Object r2 = r6.f32536OooO0OO
            o0O00O0o.OooO0O0 r2 = (o0O00O0o.OooO0O0) r2
            java.lang.String r7 = (java.lang.String) r7
            int r3 = p579o0oOoOOo.a1.f45903OooO0O0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "$playController"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            boolean r0 = r0.OooO0OO()
            if (r0 == 0) goto Lba
            o0O00O0o.OooO0o r0 = new o0O00O0o.OooO0o
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r7, r1)
            r2.OooO0OO(r0)
            r2.OooO00o()
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163o00OoOo.oOO00O.onChanged(java.lang.Object):void");
    }
}
