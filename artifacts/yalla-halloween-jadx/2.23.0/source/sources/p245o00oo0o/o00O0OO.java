package p245o00oo0o;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseBooleanArray f40569OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseBooleanArray f40570OooO00o = new SparseBooleanArray();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f40571OooO0O0;

        @CanIgnoreReturnValue
        public final void OooO00o(int i) {
            o00O000o.OooO0Oo(!this.f40571OooO0O0);
            this.f40570OooO00o.append(i, true);
        }

        public final o00O0OO OooO0O0() {
            o00O000o.OooO0Oo(!this.f40571OooO0O0);
            this.f40571OooO0O0 = true;
            return new o00O0OO(this.f40570OooO00o);
        }
    }

    public o00O0OO(SparseBooleanArray sparseBooleanArray) {
        this.f40569OooO00o = sparseBooleanArray;
    }

    public final int OooO00o(int i) {
        o00O000o.OooO0OO(i, OooO0O0());
        return this.f40569OooO00o.keyAt(i);
    }

    public final int OooO0O0() {
        return this.f40569OooO00o.size();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0OO)) {
            return false;
        }
        o00O0OO o00o0oo2 = (o00O0OO) obj;
        if (o0O00.f40595OooO00o >= 24) {
            return this.f40569OooO00o.equals(o00o0oo2.f40569OooO00o);
        }
        if (OooO0O0() != o00o0oo2.OooO0O0()) {
            return false;
        }
        for (int i = 0; i < OooO0O0(); i++) {
            if (OooO00o(i) != o00o0oo2.OooO00o(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (o0O00.f40595OooO00o >= 24) {
            return this.f40569OooO00o.hashCode();
        }
        int iOooO0O0 = OooO0O0();
        for (int i = 0; i < OooO0O0(); i++) {
            iOooO0O0 = (iOooO0O0 * 31) + OooO00o(i);
        }
        return iOooO0O0;
    }
}
