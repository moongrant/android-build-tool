package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import oO000Oo.OooO0o;
import oO0OO0OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ooOOO00O extends oO0OO0O implements ooo0o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public byte[] f52196Oooo0o;

    public ooOOO00O(byte[] bArr) {
        Objects.requireNonNull(bArr, "string cannot be null");
        this.f52196Oooo0o = bArr;
    }

    public static ooOOO00O OooOOo0(Object obj) {
        if (obj == null || (obj instanceof ooOOO00O)) {
            return (ooOOO00O) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return OooOOo0(oO0OO0O.OooOO0o((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("failed to construct OCTET STRING from byte[]: ");
                sbOooO0o0.append(e.getMessage());
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }
        if (obj instanceof oO0O00o0) {
            oO0OO0O oo0oo0oOooO0O0 = ((oO0O00o0) obj).OooO0O0();
            if (oo0oo0oOooO0O0 instanceof ooOOO00O) {
                return (ooOOO00O) oo0oo0oOooO0O0;
            }
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("illegal object in getInstance: ");
        sbOooO0o1.append(obj.getClass().getName());
        throw new IllegalArgumentException(sbOooO0o1.toString());
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof ooOOO00O) {
            return oO000Oo.OooO00o.OooO00o(this.f52196Oooo0o, ((ooOOO00O) oo0oo0o).f52196Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.ooo0o
    public final InputStream OooO00o() {
        return new ByteArrayInputStream(this.f52196Oooo0o);
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() {
        return this;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOO() {
        return new oOOO0OO0(this.f52196Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOo() {
        return new oOOO0OO0(this.f52196Oooo0o);
    }

    public byte[] OooOOoo() {
        return this.f52196Oooo0o;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return oO000Oo.OooO00o.OooO0oO(OooOOoo());
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("#");
        sbOooO0o0.append(OooO0o.OooO00o(OooO0OO.OooO0O0(this.f52196Oooo0o)));
        return sbOooO0o0.toString();
    }
}
