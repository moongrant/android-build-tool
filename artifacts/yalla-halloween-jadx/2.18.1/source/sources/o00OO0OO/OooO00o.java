package o00OO0OO;

import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.model.CategoryModel;
import o00Oo00.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0OO<AbsListenerTag> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CategoryModel f31631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f31632OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f31633OooO0o0;

    public OooO00o(OooO0O0 oooO0O0, CategoryModel categoryModel, int i) {
        this.f31632OooO0o = oooO0O0;
        this.f31631OooO0Oo = categoryModel;
        this.f31633OooO0o0 = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // o00Oo00.OooO0OO
    public final void OooO00o(com.app.base.framework.abs.AbsListener.AbsListenerTag r4) {
        /*
            r3 = this;
            com.app.base.framework.abs.AbsListener.AbsListenerTag r4 = (com.app.base.framework.abs.AbsListener.AbsListenerTag) r4
            o00OO0OO.OooO0O0 r0 = r3.f31632OooO0o
            com.app.base.model.CategoryModel r1 = r3.f31631OooO0Oo
            int r2 = r3.f31633OooO0o0
            o00Oo00.OooO0O0<Model extends com.app.base.bean.AbsJavaBean, TAG extends java.lang.Enum> r0 = r0.f32546Oooo0o
            if (r0 == 0) goto Lf
            r0.OooO0O0(r1, r2, r4)
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO0OO.OooO00o.OooO00o(java.lang.Object):void");
    }
}
