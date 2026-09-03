package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f4315Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOoo.OooO.OooO00o f4316Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.OooO0O0 f4317Oooo0oo;

    public OooO(ComponentActivity.OooO0O0 oooO0O0, int i, OooOOoo.OooO.OooO00o oooO00o) {
        this.f4317Oooo0oo = oooO0O0;
        this.f4315Oooo0o = i;
        this.f4316Oooo0oO = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0OO<?>>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r4 = this;
            androidx.activity.ComponentActivity$OooO0O0 r0 = r4.f4317Oooo0oo
            int r1 = r4.f4315Oooo0o
            OooOOoo.OooO$OooO00o r2 = r4.f4316Oooo0oO
            T r2 = r2.f197OooO00o
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r0.f4336OooO0O0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L17
            goto L3c
        L17:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0OO<?>> r3 = r0.f4339OooO0o
            java.lang.Object r3 = r3.get(r1)
            androidx.activity.result.ActivityResultRegistry$OooO0OO r3 = (androidx.activity.result.ActivityResultRegistry.OooO0OO) r3
            if (r3 == 0) goto L32
            androidx.activity.result.OooO00o<O> r3 = r3.f4353OooO00o
            if (r3 != 0) goto L26
            goto L32
        L26:
            java.util.ArrayList<java.lang.String> r0 = r0.f4340OooO0o0
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L3c
            r3.onActivityResult(r2)
            goto L3c
        L32:
            android.os.Bundle r3 = r0.f4342OooO0oo
            r3.remove(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f4341OooO0oO
            r0.put(r1, r2)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.OooO.run():void");
    }
}
