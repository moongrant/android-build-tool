package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.OooO0O0 f2180OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo0.OooOO0.OooO00o f2181OooO0o0;

    public OooOO0(ComponentActivity.OooO0O0 oooO0O0, int i, OooOo0.OooOO0.OooO00o oooO00o) {
        this.f2180OooO0o = oooO0O0;
        this.f2179OooO0Oo = i;
        this.f2181OooO0o0 = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.OooO00o<O> oooO00o;
        T t = this.f2181OooO0o0.f284OooO00o;
        ComponentActivity.OooO0O0 oooO0O0 = this.f2180OooO0o;
        String str = (String) oooO0O0.f2211OooO0O0.get(Integer.valueOf(this.f2179OooO0Oo));
        if (str == null) {
            return;
        }
        androidx.activity.result.OooO.OooO00o oooO00o2 = (androidx.activity.result.OooO.OooO00o) oooO0O0.f2214OooO0o.get(str);
        if (oooO00o2 == null || (oooO00o = oooO00o2.f2218OooO00o) == 0) {
            oooO0O0.f2217OooO0oo.remove(str);
            oooO0O0.f2216OooO0oO.put(str, t);
        } else if (oooO0O0.f2215OooO0o0.remove(str)) {
            oooO00o.onActivityResult(t);
        }
    }
}
