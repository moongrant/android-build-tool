package p235o00oOoOo;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import o0O0O00.o0ooOOo;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class oOOO00Oo<Z> extends oOO0Oo00<Z> {
    private final int height;
    private final int width;

    public oOOO00Oo() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void getSize(@NonNull oOOO00o0 oooo00o0) {
        if (o000O000.OooOO0(this.width, this.height)) {
            oooo00o0.OooO0O0(this.width, this.height);
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(" and height: ");
        throw new IllegalArgumentException(o0ooOOo.OooO00o(sbOooO0o0, this.height, ", either provide dimensions in the constructor or call override()"));
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public void removeCallback(@NonNull oOOO00o0 oooo00o0) {
    }

    public oOOO00Oo(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
