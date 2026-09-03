package p286o0O0O0oO;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import java.util.Objects;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f35505OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f35506OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Priority f35507OooO0OO;

    public static final class OooO00o extends o0OO00O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f35508OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f35509OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Priority f35510OooO0OO;

        @Override // o0O0O0oO.o0OO00O.OooO00o
        public final o0OO00O.OooO00o OooO00o(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f35508OooO00o = str;
            return this;
        }

        public final o0OO00O OooO0O0() {
            String strOooO0Oo = this.f35508OooO00o == null ? " backendName" : "";
            if (this.f35510OooO0OO == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " priority");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o0OoOo0(this.f35508OooO00o, this.f35509OooO0O0, this.f35510OooO0OO);
            }
            throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public final o0OO00O.OooO00o OooO0OO(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f35510OooO0OO = priority;
            return this;
        }
    }

    public o0OoOo0(String str, byte[] bArr, Priority priority) {
        this.f35505OooO00o = str;
        this.f35506OooO0O0 = bArr;
        this.f35507OooO0OO = priority;
    }

    @Override // p286o0O0O0oO.o0OO00O
    public final String OooO0O0() {
        return this.f35505OooO00o;
    }

    @Override // p286o0O0O0oO.o0OO00O
    @Nullable
    public final byte[] OooO0OO() {
        return this.f35506OooO0O0;
    }

    @Override // p286o0O0O0oO.o0OO00O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Priority OooO0Oo() {
        return this.f35507OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OO00O)) {
            return false;
        }
        o0OO00O o0oo00o2 = (o0OO00O) obj;
        if (this.f35505OooO00o.equals(o0oo00o2.OooO0O0())) {
            if (Arrays.equals(this.f35506OooO0O0, o0oo00o2 instanceof o0OoOo0 ? ((o0OoOo0) o0oo00o2).f35506OooO0O0 : o0oo00o2.OooO0OO()) && this.f35507OooO0OO.equals(o0oo00o2.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f35505OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35506OooO0O0)) * 1000003) ^ this.f35507OooO0OO.hashCode();
    }
}
