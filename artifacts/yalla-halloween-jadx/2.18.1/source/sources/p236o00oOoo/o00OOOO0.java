package p236o00oOoo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.OooO0OO;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00OOOO0<V> extends o00OOO0O<V> {
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
    public final boolean OooOO0(@Nullable V v) {
        if (v == null) {
            v = (V) o00OOO0O.f34031OoooO0O;
        }
        if (!o00OOO0O.f34029OoooO0.OooO0O0(this, null, v)) {
            return false;
        }
        o00OOO0O.OooO0OO(this);
        return true;
    }

    public final boolean OooOO0O(Throwable th) {
        Objects.requireNonNull(th);
        if (!o00OOO0O.f34029OoooO0.OooO0O0(this, null, new o00OOO0O.OooO0OO(th))) {
            return false;
        }
        o00OOO0O.OooO0OO(this);
        return true;
    }

    public final boolean OooOO0o(OooO0OO<? extends V> oooO0OO) {
        o00OOO0O.OooO0OO oooO0OO2;
        Objects.requireNonNull(oooO0OO);
        Object obj = this.f34032Oooo0o;
        if (obj == null) {
            if (oooO0OO.isDone()) {
                if (!o00OOO0O.f34029OoooO0.OooO0O0(this, null, o00OOO0O.OooO0o(oooO0OO))) {
                    return false;
                }
                o00OOO0O.OooO0OO(this);
            } else {
                o00OOO0O.OooOO0 oooOO1 = new o00OOO0O.OooOO0(this, oooO0OO);
                if (o00OOO0O.f34029OoooO0.OooO0O0(this, null, oooOO1)) {
                    try {
                        oooO0OO.OooO00o(oooOO1, o0o0Oo.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            oooO0OO2 = new o00OOO0O.OooO0OO(th);
                        } catch (Throwable unused) {
                            oooO0OO2 = o00OOO0O.OooO0OO.f34044OooO0O0;
                        }
                        o00OOO0O.f34029OoooO0.OooO0O0(this, oooOO1, oooO0OO2);
                    }
                } else {
                    obj = this.f34032Oooo0o;
                }
            }
            return true;
        }
        if (!(obj instanceof o00OOO0O.OooO0O0)) {
            return false;
        }
        oooO0OO.cancel(((o00OOO0O.OooO0O0) obj).f34042OooO00o);
        return false;
    }
}
