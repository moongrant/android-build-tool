package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzll;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOO0 implements o0O00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzll f37397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f37398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f37399OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37400OooO0Oo;

    public o0O0OOO0(zzll zzllVar, String str, Object[] objArr) {
        this.f37397OooO00o = zzllVar;
        this.f37398OooO0O0 = str;
        this.f37399OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37400OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f37400OooO0Oo = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // p334o0OO00o.o0O00OOO
    public final zzll zza() {
        return this.f37397OooO00o;
    }

    @Override // p334o0OO00o.o0O00OOO
    public final boolean zzb() {
        return (this.f37400OooO0Oo & 2) == 2;
    }

    @Override // p334o0OO00o.o0O00OOO
    public final int zzc() {
        return (this.f37400OooO0Oo & 1) == 1 ? 1 : 2;
    }
}
