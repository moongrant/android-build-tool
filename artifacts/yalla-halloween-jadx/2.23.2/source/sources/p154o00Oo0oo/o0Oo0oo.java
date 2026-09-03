package p154o00Oo0oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p144o00Oo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo<T> implements o000000<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List f37834OooO0O0;

    @SafeVarargs
    public o0Oo0oo(@NonNull o000000<T>... o000000VarArr) {
        if (o000000VarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f37834OooO0O0 = Arrays.asList(o000000VarArr);
    }

    @Override // p154o00Oo0oo.o000000
    @NonNull
    public final o00oOoo OooO00o(@NonNull OooO oooO, @NonNull o00oOoo o00oooo2, int i, int i2) {
        Iterator it = this.f37834OooO0O0.iterator();
        o00oOoo o00oooo3 = o00oooo2;
        while (it.hasNext()) {
            o00oOoo o00ooooOooO00o = ((o000000) it.next()).OooO00o(oooO, o00oooo3, i, i2);
            if (o00oooo3 != null && !o00oooo3.equals(o00oooo2) && !o00oooo3.equals(o00ooooOooO00o)) {
                o00oooo3.OooO00o();
            }
            o00oooo3 = o00ooooOooO00o;
        }
        return o00oooo3;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        Iterator it = this.f37834OooO0O0.iterator();
        while (it.hasNext()) {
            ((o000000) it.next()).OooO0O0(messageDigest);
        }
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (obj instanceof o0Oo0oo) {
            return this.f37834OooO0O0.equals(((o0Oo0oo) obj).f37834OooO0O0);
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f37834OooO0O0.hashCode();
    }
}
