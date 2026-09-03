package p144o00Oo;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p154o00Oo0oo.o000000;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00O0O00;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 implements o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo0o0Oo f37592OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f37593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Class<?> f37596OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<?> f37597OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OOO0o f37598OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<Class<?>, o000000<?>> f37599OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f37600OooOO0;

    public o000O0O0(Object obj, o0OOO0o o0ooo0o2, int i, int i2, o00O0O00 o00o0o01, Class cls, Class cls2, oo0o0Oo oo0o0oo) {
        o00OO00O.OooO0O0(obj);
        this.f37593OooO0O0 = obj;
        if (o0ooo0o2 == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f37598OooO0oO = o0ooo0o2;
        this.f37594OooO0OO = i;
        this.f37595OooO0Oo = i2;
        o00OO00O.OooO0O0(o00o0o01);
        this.f37599OooO0oo = o00o0o01;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f37597OooO0o0 = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f37596OooO0o = cls2;
        o00OO00O.OooO0O0(oo0o0oo);
        this.f37592OooO = oo0o0oo;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof o000O0O0)) {
            return false;
        }
        o000O0O0 o000o0o1 = (o000O0O0) obj;
        return this.f37593OooO0O0.equals(o000o0o1.f37593OooO0O0) && this.f37598OooO0oO.equals(o000o0o1.f37598OooO0oO) && this.f37595OooO0Oo == o000o0o1.f37595OooO0Oo && this.f37594OooO0OO == o000o0o1.f37594OooO0OO && this.f37599OooO0oo.equals(o000o0o1.f37599OooO0oo) && this.f37597OooO0o0.equals(o000o0o1.f37597OooO0o0) && this.f37596OooO0o.equals(o000o0o1.f37596OooO0o) && this.f37592OooO.equals(o000o0o1.f37592OooO);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        if (this.f37600OooOO0 == 0) {
            int iHashCode = this.f37593OooO0O0.hashCode();
            this.f37600OooOO0 = iHashCode;
            int iHashCode2 = ((((this.f37598OooO0oO.hashCode() + (iHashCode * 31)) * 31) + this.f37594OooO0OO) * 31) + this.f37595OooO0Oo;
            this.f37600OooOO0 = iHashCode2;
            int iHashCode3 = this.f37599OooO0oo.hashCode() + (iHashCode2 * 31);
            this.f37600OooOO0 = iHashCode3;
            int iHashCode4 = this.f37597OooO0o0.hashCode() + (iHashCode3 * 31);
            this.f37600OooOO0 = iHashCode4;
            int iHashCode5 = this.f37596OooO0o.hashCode() + (iHashCode4 * 31);
            this.f37600OooOO0 = iHashCode5;
            this.f37600OooOO0 = this.f37592OooO.hashCode() + (iHashCode5 * 31);
        }
        return this.f37600OooOO0;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f37593OooO0O0 + ", width=" + this.f37594OooO0OO + ", height=" + this.f37595OooO0Oo + ", resourceClass=" + this.f37597OooO0o0 + ", transcodeClass=" + this.f37596OooO0o + ", signature=" + this.f37598OooO0oO + ", hashCode=" + this.f37600OooOO0 + ", transformations=" + this.f37599OooO0oo + ", options=" + this.f37592OooO + '}';
    }
}
