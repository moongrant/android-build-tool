package p191o00o0O0O;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f38908OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Priority f38909OooO0OO;

    public static final class OooO00o extends o0Oo0oo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f38910OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f38911OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Priority f38912OooO0OO;

        public final Oooo0 OooO00o() {
            String strConcat = this.f38910OooO00o == null ? " backendName" : "";
            if (this.f38912OooO0OO == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new Oooo0(this.f38910OooO00o, this.f38911OooO0O0, this.f38912OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        public final OooO00o OooO0O0(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f38910OooO00o = str;
            return this;
        }

        public final OooO00o OooO0OO(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f38912OooO0OO = priority;
            return this;
        }
    }

    public Oooo0(String str, byte[] bArr, Priority priority) {
        this.f38907OooO00o = str;
        this.f38908OooO0O0 = bArr;
        this.f38909OooO0OO = priority;
    }

    @Override // p191o00o0O0O.o0Oo0oo
    public final String OooO0O0() {
        return this.f38907OooO00o;
    }

    @Override // p191o00o0O0O.o0Oo0oo
    @Nullable
    public final byte[] OooO0OO() {
        return this.f38908OooO0O0;
    }

    @Override // p191o00o0O0O.o0Oo0oo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Priority OooO0Oo() {
        return this.f38909OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        if (this.f38907OooO00o.equals(o0oo0oo2.OooO0O0())) {
            if (Arrays.equals(this.f38908OooO0O0, o0oo0oo2 instanceof Oooo0 ? ((Oooo0) o0oo0oo2).f38908OooO0O0 : o0oo0oo2.OooO0OO()) && this.f38909OooO0OO.equals(o0oo0oo2.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f38907OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38908OooO0O0)) * 1000003) ^ this.f38909OooO0OO.hashCode();
    }
}
