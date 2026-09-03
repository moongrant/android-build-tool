package p126o00O0oOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p532o0o0Oo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f36724OooO0O0 = new o0O0O00();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            o0O0O00 o0o0o00 = this.f36724OooO0O0;
            if (i >= o0o0o00.f38816OooO0o) {
                return;
            }
            o000000O o000000o2 = (o000000O) o0o0o00.OooO0oo(i);
            V vOooOO0o = this.f36724OooO0O0.OooOO0o(i);
            o000000O.OooO0O0<T> oooO0O0 = o000000o2.f36728OooO0O0;
            if (o000000o2.f36730OooO0Oo == null) {
                o000000o2.f36730OooO0Oo = o000000o2.f36729OooO0OO.getBytes(o000OOo.f36731OooO00o);
            }
            oooO0O0.OooO00o(o000000o2.f36730OooO0Oo, vOooOO0o, messageDigest);
            i++;
        }
    }

    @Nullable
    public final <T> T OooO0OO(@NonNull o000000O<T> o000000o2) {
        o0O0O00 o0o0o00 = this.f36724OooO0O0;
        return o0o0o00.containsKey(o000000o2) ? (T) o0o0o00.getOrDefault(o000000o2, null) : o000000o2.f36727OooO00o;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (obj instanceof o00000) {
            return this.f36724OooO0O0.equals(((o00000) obj).f36724OooO0O0);
        }
        return false;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f36724OooO0O0.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f36724OooO0O0 + '}';
    }
}
