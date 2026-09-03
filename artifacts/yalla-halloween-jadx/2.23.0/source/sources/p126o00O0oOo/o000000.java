package p126o00O0oOo;

import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000<T> implements o00000OO<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List f36725OooO0O0;

    @SafeVarargs
    public o000000(@NonNull o00000OO<T>... o00000ooArr) {
        if (o00000ooArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f36725OooO0O0 = Arrays.asList(o00000ooArr);
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        Iterator it = this.f36725OooO0O0.iterator();
        while (it.hasNext()) {
            ((o00000OO) it.next()).OooO00o(messageDigest);
        }
    }

    @Override // p126o00O0oOo.o00000OO
    @NonNull
    public final o0000 OooO0O0(@NonNull OooO oooO, @NonNull o0000 o0000Var, int i, int i2) {
        Iterator it = this.f36725OooO0O0.iterator();
        o0000 o0000Var2 = o0000Var;
        while (it.hasNext()) {
            o0000 o0000VarOooO0O0 = ((o00000OO) it.next()).OooO0O0(oooO, o0000Var2, i, i2);
            if (o0000Var2 != null && !o0000Var2.equals(o0000Var) && !o0000Var2.equals(o0000VarOooO0O0)) {
                o0000Var2.OooO00o();
            }
            o0000Var2 = o0000VarOooO0O0;
        }
        return o0000Var2;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (obj instanceof o000000) {
            return this.f36725OooO0O0.equals(((o000000) obj).f36725OooO0O0);
        }
        return false;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f36725OooO0O0.hashCode();
    }
}
