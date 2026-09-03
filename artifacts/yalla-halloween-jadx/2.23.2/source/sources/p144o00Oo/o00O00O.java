package p144o00Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooO0o;
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O implements OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooO00o f37726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO00O f37727OooO0o0;

    public o00O00O(oOO00O ooo00o, o0OoOo0.OooO00o oooO00o) {
        this.f37727OooO0o0 = ooo00o;
        this.f37726OooO0Oo = oooO00o;
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
        oOO00O ooo00o = this.f37727OooO0o0;
        o0OoOo0.OooO00o<?> oooO00o = this.f37726OooO0Oo;
        o0OoOo0.OooO00o<?> oooO00o2 = ooo00o.f37733OooO;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            oOO00O ooo00o2 = this.f37727OooO0o0;
            o0OoOo0.OooO00o oooO00o3 = this.f37726OooO0Oo;
            o000O000.OooO00o oooO00o4 = ooo00o2.f37736OooO0o0;
            o0OOO0o o0ooo0o2 = ooo00o2.f37739OooOO0;
            OooO0o<Data> oooO0o = oooO00o3.f37914OooO0OO;
            oooO00o4.OooO0Oo(o0ooo0o2, exc, oooO0o, oooO0o.getDataSource());
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
        oOO00O ooo00o = this.f37727OooO0o0;
        o0OoOo0.OooO00o<?> oooO00o = this.f37726OooO0Oo;
        o0OoOo0.OooO00o<?> oooO00o2 = ooo00o.f37733OooO;
        if (oooO00o2 != null && oooO00o2 == oooO00o) {
            oOO00O ooo00o2 = this.f37727OooO0o0;
            o0OoOo0.OooO00o oooO00o3 = this.f37726OooO0Oo;
            o000O00O o000o00o2 = ooo00o2.f37734OooO0Oo.f37649OooOOOo;
            if (obj != null && o000o00o2.OooO0OO(oooO00o3.f37914OooO0OO.getDataSource())) {
                ooo00o2.f37738OooO0oo = obj;
                ooo00o2.f37736OooO0o0.OooO0OO();
            } else {
                o000O000.OooO00o oooO00o4 = ooo00o2.f37736OooO0o0;
                o0OOO0o o0ooo0o2 = oooO00o3.f37912OooO00o;
                OooO0o<Data> oooO0o = oooO00o3.f37914OooO0OO;
                oooO00o4.OooO00o(o0ooo0o2, obj, oooO0o, oooO0o.getDataSource(), ooo00o2.f37739OooOO0);
            }
        }
    }
}
