package kotlin.jvm.internal;

import OooO00o.OooO00o;
import kotlin.SinceKotlin;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.funInterface.equals(((FunInterfaceConstructorReference) obj).funInterface);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("fun interface ");
        sbOooO0o0.append(this.funInterface.getName());
        return sbOooO0o0.toString();
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
