package p127o00O0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooO0o;
import o00OO00O.o0OoOo0;
import p126o00O0oOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooO00o f36765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO f36766OooO0o0;

    public o0000O0O(o000OO o000oo2, o0OoOo0.OooO00o oooO00o) {
        this.f36766OooO0o0 = o000oo2;
        this.f36765OooO0Oo = oooO00o;
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
        o000OO o000oo2 = this.f36766OooO0o0;
        o0OoOo0.OooO00o<?> oooO00o = this.f36765OooO0Oo;
        o0OoOo0.OooO00o<?> oooO00o2 = o000oo2.f36781OooO;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            o000OO o000oo3 = this.f36766OooO0o0;
            o0OoOo0.OooO00o oooO00o3 = this.f36765OooO0Oo;
            o0ooOOo.OooO00o oooO00o4 = o000oo3.f36784OooO0o0;
            o000OOo o000ooo2 = o000oo3.f36787OooOO0;
            OooO0o<Data> oooO0o = oooO00o3.f37152OooO0OO;
            oooO00o4.OooO0O0(o000ooo2, exc, oooO0o, oooO0o.getDataSource());
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
    public final void OooO0o0(@Nullable Object obj) {
        o000OO o000oo2 = this.f36766OooO0o0;
        o0OoOo0.OooO00o<?> oooO00o = this.f36765OooO0Oo;
        o0OoOo0.OooO00o<?> oooO00o2 = o000oo2.f36781OooO;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            o000OO o000oo3 = this.f36766OooO0o0;
            o0OoOo0.OooO00o oooO00o3 = this.f36765OooO0Oo;
            oo0o0Oo oo0o0oo = o000oo3.f36782OooO0Oo.f36889OooOOOo;
            if (obj != null && oo0o0oo.OooO0OO(oooO00o3.f37152OooO0OO.getDataSource())) {
                o000oo3.f36786OooO0oo = obj;
                o000oo3.f36784OooO0o0.OooO0o0();
            } else {
                o0ooOOo.OooO00o oooO00o4 = o000oo3.f36784OooO0o0;
                o000OOo o000ooo2 = oooO00o3.f37150OooO00o;
                OooO0o<Data> oooO0o = oooO00o3.f37152OooO0OO;
                oooO00o4.OooO00o(o000ooo2, obj, oooO0o, oooO0o.getDataSource(), o000oo3.f36787OooOO0);
            }
        }
    }
}
