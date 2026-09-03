package p214o00oO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooO0o;
import p217o00oO00o.o000000;
import p221o00oOO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 implements OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooO00o f33532Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo00oO f33533Oooo0oO;

    public o0O00o0(oo00oO oo00oo, o00000O0.OooO00o oooO00o) {
        this.f33533Oooo0oO = oo00oo;
        this.f33532Oooo0o = oooO00o;
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
    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        oo00oO oo00oo = this.f33533Oooo0oO;
        o00000O0.OooO00o<?> oooO00o = this.f33532Oooo0o;
        o00000O0.OooO00o<?> oooO00o2 = oo00oo.f33546OoooO0;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            oo00oO oo00oo2 = this.f33533Oooo0oO;
            o00000O0.OooO00o oooO00o3 = this.f33532Oooo0o;
            o00O0O0O.OooO00o oooO00o4 = oo00oo2.f33544Oooo0oO;
            o000000 o000000Var = oo00oo2.f33548OoooO0O;
            OooO0o<Data> oooO0o = oooO00o3.f33698OooO0OO;
            oooO00o4.OooO0Oo(o000000Var, exc, oooO0o, oooO0o.OooO0Oo());
        }
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
    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o(@Nullable Object obj) {
        oo00oO oo00oo = this.f33533Oooo0oO;
        o00000O0.OooO00o<?> oooO00o = this.f33532Oooo0o;
        o00000O0.OooO00o<?> oooO00o2 = oo00oo.f33546OoooO0;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            oo00oO oo00oo2 = this.f33533Oooo0oO;
            o00000O0.OooO00o oooO00o3 = this.f33532Oooo0o;
            o00O o00o2 = oo00oo2.f33543Oooo0o.f33430OooOOOo;
            if (obj != null && o00o2.OooO0OO(oooO00o3.f33698OooO0OO.OooO0Oo())) {
                oo00oo2.f33547OoooO00 = obj;
                oo00oo2.f33544Oooo0oO.OooO0o0();
            } else {
                o00O0O0O.OooO00o oooO00o4 = oo00oo2.f33544Oooo0oO;
                o000000 o000000Var = oooO00o3.f33696OooO00o;
                OooO0o<Data> oooO0o = oooO00o3.f33698OooO0OO;
                oooO00o4.OooO00o(o000000Var, obj, oooO0o, oooO0o.OooO0Oo(), oo00oo2.f33548OoooO0O);
            }
        }
    }
}
