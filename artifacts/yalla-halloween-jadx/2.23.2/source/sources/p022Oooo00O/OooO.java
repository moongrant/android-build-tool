package p022Oooo00O;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends o000OO.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<?> f435OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SessionConfig f436OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo00<?> f437OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Size f438OooO0o0;

    public OooO(String str, Class<?> cls, SessionConfig sessionConfig, o00Oo00<?> o00oo00, @Nullable Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f434OooO00o = str;
        this.f435OooO0O0 = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f436OooO0OO = sessionConfig;
        if (o00oo00 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f437OooO0Oo = o00oo00;
        this.f438OooO0o0 = size;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final SessionConfig OooO00o() {
        return this.f436OooO0OO;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @Nullable
    public final Size OooO0O0() {
        return this.f438OooO0o0;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final o00Oo00<?> OooO0OO() {
        return this.f437OooO0Oo;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final String OooO0Oo() {
        return this.f434OooO00o;
    }

    @Override // Oooo00O.o000OO.OooOOO0
    @NonNull
    public final Class<?> OooO0o0() {
        return this.f435OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OO.OooOOO0)) {
            return false;
        }
        o000OO.OooOOO0 oooOOO0 = (o000OO.OooOOO0) obj;
        if (this.f434OooO00o.equals(oooOOO0.OooO0Oo()) && this.f435OooO0O0.equals(oooOOO0.OooO0o0()) && this.f436OooO0OO.equals(oooOOO0.OooO00o()) && this.f437OooO0Oo.equals(oooOOO0.OooO0OO())) {
            Size size = this.f438OooO0o0;
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
        int iHashCode = (((((((this.f434OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f435OooO0O0.hashCode()) * 1000003) ^ this.f436OooO0OO.hashCode()) * 1000003) ^ this.f437OooO0Oo.hashCode()) * 1000003;
        Size size = this.f438OooO0o0;
        return iHashCode ^ (size == null ? 0 : size.hashCode());
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f434OooO00o + ", useCaseType=" + this.f435OooO0O0 + ", sessionConfig=" + this.f436OooO0OO + ", useCaseConfig=" + this.f437OooO0Oo + ", surfaceResolution=" + this.f438OooO0o0 + "}";
    }
}
