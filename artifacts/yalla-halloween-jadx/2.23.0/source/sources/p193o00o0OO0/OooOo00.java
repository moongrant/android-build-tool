package p193o00o0OO0;

import android.content.Context;
import androidx.annotation.NonNull;
import p028Oooo0oO.o0O00o0;
import p201o00o0o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f38955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f38956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f38957OooO0Oo;

    public OooOo00(Context context, OooOOO0 oooOOO0, OooOOO0 oooOOO1, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f38954OooO00o = context;
        if (oooOOO0 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f38955OooO0O0 = oooOOO0;
        if (oooOOO1 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f38956OooO0OO = oooOOO1;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f38957OooO0Oo = str;
    }

    @Override // p193o00o0OO0.o0OoOo0
    public final Context OooO00o() {
        return this.f38954OooO00o;
    }

    @Override // p193o00o0OO0.o0OoOo0
    @NonNull
    public final String OooO0O0() {
        return this.f38957OooO0Oo;
    }

    @Override // p193o00o0OO0.o0OoOo0
    public final OooOOO0 OooO0OO() {
        return this.f38956OooO0OO;
    }

    @Override // p193o00o0OO0.o0OoOo0
    public final OooOOO0 OooO0Oo() {
        return this.f38955OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        return this.f38954OooO00o.equals(o0oooo0.OooO00o()) && this.f38955OooO0O0.equals(o0oooo0.OooO0Oo()) && this.f38956OooO0OO.equals(o0oooo0.OooO0OO()) && this.f38957OooO0Oo.equals(o0oooo0.OooO0O0());
    }

    public final int hashCode() {
        return ((((((this.f38954OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38955OooO0O0.hashCode()) * 1000003) ^ this.f38956OooO0OO.hashCode()) * 1000003) ^ this.f38957OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f38954OooO00o);
        sb.append(", wallClock=");
        sb.append(this.f38955OooO0O0);
        sb.append(", monotonicClock=");
        sb.append(this.f38956OooO0OO);
        sb.append(", backendName=");
        return o0O00o0.OooO0O0(sb, this.f38957OooO0Oo, "}");
    }
}
