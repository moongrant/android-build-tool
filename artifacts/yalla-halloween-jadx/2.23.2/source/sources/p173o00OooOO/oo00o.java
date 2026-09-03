package p173o00OooOO;

import androidx.annotation.NonNull;
import androidx.compose.runtime.OooOOO0;
import java.security.MessageDigest;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f38330OooO0O0;

    public oo00o(@NonNull Object obj) {
        o00OO00O.OooO0O0(obj);
        this.f38330OooO0O0 = obj;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f38330OooO0O0.toString().getBytes(o0OOO0o.f37833OooO00o));
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (obj instanceof oo00o) {
            return this.f38330OooO0O0.equals(((oo00o) obj).f38330OooO0O0);
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f38330OooO0O0.hashCode();
    }

    public final String toString() {
        return OooOOO0.OooO00o(new StringBuilder("ObjectKey{object="), this.f38330OooO0O0, '}');
    }
}
