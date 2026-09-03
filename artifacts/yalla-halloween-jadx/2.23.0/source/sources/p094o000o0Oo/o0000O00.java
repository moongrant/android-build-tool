package p094o000o0Oo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0000O00<V> extends o0000Ooo<V> {
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
    public final boolean OooO0oo(@Nullable V v) {
        if (v == null) {
            v = (V) o0000Ooo.f35362OooOO0;
        }
        if (!o0000Ooo.f35359OooO.OooO0O0(this, null, v)) {
            return false;
        }
        o0000Ooo.OooO0O0(this);
        return true;
    }

    public final boolean OooOO0(Throwable th) {
        th.getClass();
        if (!o0000Ooo.f35359OooO.OooO0O0(this, null, new o0000Ooo.OooO0OO(th))) {
            return false;
        }
        o0000Ooo.OooO0O0(this);
        return true;
    }

    public final boolean OooOO0O(OooO00o<? extends V> oooO00o) {
        o0000Ooo.OooO0OO oooO0OO;
        oooO00o.getClass();
        Object obj = this.f35363OooO0Oo;
        if (obj == null) {
            if (oooO00o.isDone()) {
                if (!o0000Ooo.f35359OooO.OooO0O0(this, null, o0000Ooo.OooO0o0(oooO00o))) {
                    return false;
                }
                o0000Ooo.OooO0O0(this);
            } else {
                o0000Ooo.OooOO0 oooOO1 = new o0000Ooo.OooOO0(this, oooO00o);
                if (o0000Ooo.f35359OooO.OooO0O0(this, null, oooOO1)) {
                    try {
                        oooO00o.OooO(oooOO1, o0000.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            oooO0OO = new o0000Ooo.OooO0OO(th);
                        } catch (Throwable unused) {
                            oooO0OO = o0000Ooo.OooO0OO.f35375OooO0O0;
                        }
                        o0000Ooo.f35359OooO.OooO0O0(this, oooOO1, oooO0OO);
                    }
                } else {
                    obj = this.f35363OooO0Oo;
                }
            }
            return true;
        }
        if (!(obj instanceof o0000Ooo.OooO0O0)) {
            return false;
        }
        oooO00o.cancel(((o0000Ooo.OooO0O0) obj).f35373OooO00o);
        return false;
    }
}
