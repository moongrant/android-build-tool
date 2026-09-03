package p037OoooOo0;

import com.google.firebase.components.oo000o;
import p301o0O0o0O.OooO0OO;
import p301o0O0o0O.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1496OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1497OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1498OooO0o0;

    public /* synthetic */ o00000O(int i, Object obj, Object obj2) {
        this.f1496OooO0Oo = i;
        this.f1498OooO0o0 = obj;
        this.f1497OooO0o = obj2;
    }

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
        OooO0OO.OooO00o<T> oooO00o;
        switch (this.f1496OooO0Oo) {
            case 0:
                o000 o000Var = (o000) this.f1498OooO0o0;
                o000Var.f1479OooOOO.add((o000.OooO00o) this.f1497OooO0o);
                return;
            default:
                oo000o oo000oVar = (oo000o) this.f1498OooO0o0;
                OooO0o<T> oooO0o = (OooO0o) this.f1497OooO0o;
                if (oo000oVar.f19381OooO0O0 != oo000o.f19379OooO0Oo) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oo000oVar) {
                    oooO00o = oo000oVar.f19380OooO00o;
                    oo000oVar.f19380OooO00o = null;
                    oo000oVar.f19381OooO0O0 = oooO0o;
                    break;
                }
                oooO00o.OooO00o(oooO0o);
                return;
        }
    }
}
