package p238o00oOooo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o000 extends o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f40006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Priority f40007OooO0OO;

    public static final class OooO00o extends o0OO00OO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f40008OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f40009OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Priority f40010OooO0OO;

        public final o0O0o000 OooO00o() {
            String strConcat = this.f40008OooO00o == null ? " backendName" : "";
            if (this.f40010OooO0OO == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new o0O0o000(this.f40008OooO00o, this.f40009OooO0O0, this.f40010OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        public final OooO00o OooO0O0(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f40008OooO00o = str;
            return this;
        }

        public final OooO00o OooO0OO(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f40010OooO0OO = priority;
            return this;
        }
    }

    public o0O0o000(String str, byte[] bArr, Priority priority) {
        this.f40005OooO00o = str;
        this.f40006OooO0O0 = bArr;
        this.f40007OooO0OO = priority;
    }

    @Override // p238o00oOooo.o0OO00OO
    public final String OooO0O0() {
        return this.f40005OooO00o;
    }

    @Override // p238o00oOooo.o0OO00OO
    @Nullable
    public final byte[] OooO0OO() {
        return this.f40006OooO0O0;
    }

    @Override // p238o00oOooo.o0OO00OO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Priority OooO0Oo() {
        return this.f40007OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OO00OO)) {
            return false;
        }
        o0OO00OO o0oo00oo2 = (o0OO00OO) obj;
        if (this.f40005OooO00o.equals(o0oo00oo2.OooO0O0())) {
            if (Arrays.equals(this.f40006OooO0O0, o0oo00oo2 instanceof o0O0o000 ? ((o0O0o000) o0oo00oo2).f40006OooO0O0 : o0oo00oo2.OooO0OO()) && this.f40007OooO0OO.equals(o0oo00oo2.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f40005OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40006OooO0O0)) * 1000003) ^ this.f40007OooO0OO.hashCode();
    }
}
