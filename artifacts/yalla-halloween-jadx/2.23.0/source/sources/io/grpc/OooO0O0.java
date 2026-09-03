package io.grpc;

import com.google.common.base.OooOo;

/* JADX INFO: loaded from: classes5.dex */
@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
public abstract class OooO0O0 extends OooO00o {
    public abstract String OooO00o();

    public abstract int OooO0O0();

    public abstract boolean OooO0OO();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        OooOo.OooO00o oooO00oOooO0O0 = OooOo.OooO0O0(this);
        oooO00oOooO0O0.OooO00o(OooO00o(), "policy");
        oooO00oOooO0O0.OooO0O0(String.valueOf(OooO0O0()), "priority");
        oooO00oOooO0O0.OooO0O0(String.valueOf(OooO0OO()), "available");
        return oooO00oOooO0O0.toString();
    }
}
