package p154o00Oo0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p174o00OooOo.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O00 f37835OooO0O0 = new o00O0O00();

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
    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            o00O0O00 o00o0o01 = this.f37835OooO0O0;
            if (i >= o00o0o01.f38568OooO0o) {
                return;
            }
            o0OO00O o0oo00o2 = (o0OO00O) o00o0o01.OooO0oo(i);
            V vOooOO0o = this.f37835OooO0O0.OooOO0o(i);
            o0OO00O.OooO0O0<T> oooO0O0 = o0oo00o2.f37830OooO0O0;
            if (o0oo00o2.f37832OooO0Oo == null) {
                o0oo00o2.f37832OooO0Oo = o0oo00o2.f37831OooO0OO.getBytes(o0OOO0o.f37833OooO00o);
            }
            oooO0O0.OooO00o(o0oo00o2.f37832OooO0Oo, vOooOO0o, messageDigest);
            i++;
        }
    }

    @Nullable
    public final <T> T OooO0OO(@NonNull o0OO00O<T> o0oo00o2) {
        o00O0O00 o00o0o01 = this.f37835OooO0O0;
        return o00o0o01.containsKey(o0oo00o2) ? (T) o00o0o01.getOrDefault(o0oo00o2, null) : o0oo00o2.f37829OooO00o;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (obj instanceof oo0o0Oo) {
            return this.f37835OooO0O0.equals(((oo0o0Oo) obj).f37835OooO0O0);
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f37835OooO0O0.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f37835OooO0O0 + '}';
    }
}
