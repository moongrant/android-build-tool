package p022Oooo00O;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends o000OO.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f435OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<?> f436OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SessionConfig f437OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0o0Oo<?> f438OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Size f439OooO0o0;

    public OooO(String str, Class<?> cls, SessionConfig sessionConfig, o0o0Oo<?> o0o0oo, @Nullable Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f435OooO00o = str;
        this.f436OooO0O0 = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f437OooO0OO = sessionConfig;
        if (o0o0oo == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f438OooO0Oo = o0o0oo;
        this.f439OooO0o0 = size;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final SessionConfig OooO00o() {
        return this.f437OooO0OO;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @Nullable
    public final Size OooO0O0() {
        return this.f439OooO0o0;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final o0o0Oo<?> OooO0OO() {
        return this.f438OooO0Oo;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final String OooO0Oo() {
        return this.f435OooO00o;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final Class<?> OooO0o0() {
        return this.f436OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OO.OooOOO0)) {
            return false;
        }
        o000OO.OooOOO0 oooOOO0 = (o000OO.OooOOO0) obj;
        if (this.f435OooO00o.equals(oooOOO0.OooO0Oo()) && this.f436OooO0O0.equals(oooOOO0.OooO0o0()) && this.f437OooO0OO.equals(oooOOO0.OooO00o()) && this.f438OooO0Oo.equals(oooOOO0.OooO0OO())) {
            Size size = this.f439OooO0o0;
            if (size == null) {
                if (oooOOO0.OooO0O0() == null) {
                    return true;
                }
            } else if (size.equals(oooOOO0.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f435OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f436OooO0O0.hashCode()) * 1000003) ^ this.f437OooO0OO.hashCode()) * 1000003) ^ this.f438OooO0Oo.hashCode()) * 1000003;
        Size size = this.f439OooO0o0;
        return iHashCode ^ (size == null ? 0 : size.hashCode());
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f435OooO00o + ", useCaseType=" + this.f436OooO0O0 + ", sessionConfig=" + this.f437OooO0OO + ", useCaseConfig=" + this.f438OooO0Oo + ", surfaceResolution=" + this.f439OooO0o0 + "}";
    }
}
