package p117o00O0OOo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00000O<V> extends o00000<V> {
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
    public final boolean OooO(@Nullable V v) {
        if (v == null) {
            v = (V) o00000.f36333OooOO0;
        }
        if (!o00000.f36330OooO.OooO0O0(this, null, v)) {
            return false;
        }
        o00000.OooO0O0(this);
        return true;
    }

    public final boolean OooOO0(Throwable th) {
        th.getClass();
        if (!o00000.f36330OooO.OooO0O0(this, null, new o00000.OooO0OO(th))) {
            return false;
        }
        o00000.OooO0O0(this);
        return true;
    }

    public final boolean OooOO0O(OooOO0O<? extends V> oooOO0O) {
        o00000.OooO0OO oooO0OO;
        oooOO0O.getClass();
        Object obj = this.f36334OooO0Oo;
        if (obj == null) {
            if (oooOO0O.isDone()) {
                if (!o00000.f36330OooO.OooO0O0(this, null, o00000.OooO0o0(oooOO0O))) {
                    return false;
                }
                o00000.OooO0O0(this);
            } else {
                o00000.OooOO0 oooOO1 = new o00000.OooOO0(this, oooOO0O);
                if (o00000.f36330OooO.OooO0O0(this, null, oooOO1)) {
                    try {
                        oooOO0O.OooO0oo(oooOO1, o00000O0.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            oooO0OO = new o00000.OooO0OO(th);
                        } catch (Throwable unused) {
                            oooO0OO = o00000.OooO0OO.f36346OooO0O0;
                        }
                        o00000.f36330OooO.OooO0O0(this, oooOO1, oooO0OO);
                    }
                } else {
                    obj = this.f36334OooO0Oo;
                }
            }
            return true;
        }
        if (!(obj instanceof o00000.OooO0O0)) {
            return false;
        }
        oooOO0O.cancel(((o00000.OooO0O0) obj).f36344OooO00o);
        return false;
    }
}
