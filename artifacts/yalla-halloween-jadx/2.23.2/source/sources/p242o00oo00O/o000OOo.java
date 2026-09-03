package p242o00oo00O;

import android.content.Context;
import androidx.annotation.NonNull;
import p028Oooo0oO.o0oOO;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f40072OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0Oo f40073OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O0Oo f40074OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f40075OooO0Oo;

    public o000OOo(Context context, o000O0Oo o000o0oo2, o000O0Oo o000o0oo3, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f40072OooO00o = context;
        if (o000o0oo2 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f40073OooO0O0 = o000o0oo2;
        if (o000o0oo3 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f40074OooO0OO = o000o0oo3;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f40075OooO0Oo = str;
    }

    @Override // p242o00oo00O.o00000O
    public final Context OooO00o() {
        return this.f40072OooO00o;
    }

    @Override // p242o00oo00O.o00000O
    @NonNull
    public final String OooO0O0() {
        return this.f40075OooO0Oo;
    }

    @Override // p242o00oo00O.o00000O
    public final o000O0Oo OooO0OO() {
        return this.f40074OooO0OO;
    }

    @Override // p242o00oo00O.o00000O
    public final o000O0Oo OooO0Oo() {
        return this.f40073OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return this.f40072OooO00o.equals(o00000o.OooO00o()) && this.f40073OooO0O0.equals(o00000o.OooO0Oo()) && this.f40074OooO0OO.equals(o00000o.OooO0OO()) && this.f40075OooO0Oo.equals(o00000o.OooO0O0());
    }

    public final int hashCode() {
        return ((((((this.f40072OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f40073OooO0O0.hashCode()) * 1000003) ^ this.f40074OooO0OO.hashCode()) * 1000003) ^ this.f40075OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f40072OooO00o);
        sb.append(", wallClock=");
        sb.append(this.f40073OooO0O0);
        sb.append(", monotonicClock=");
        sb.append(this.f40074OooO0OO);
        sb.append(", backendName=");
        return o0oOO.OooO0O0(sb, this.f40075OooO0Oo, "}");
    }
}
