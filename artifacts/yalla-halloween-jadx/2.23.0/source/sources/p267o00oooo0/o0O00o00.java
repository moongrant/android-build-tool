package p267o00oooo0;

import com.android.billingclient.api.o0000O0;
import com.google.android.gms.internal.play_billing.OooO;
import com.google.android.gms.internal.play_billing.OooO0OO;
import com.google.android.gms.internal.play_billing.OooO0o;
import com.google.android.gms.internal.play_billing.zzx;
import javax.annotation.CheckForNull;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o00 extends zzx {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O00o00 f41089OooOO0 = new o0O00o00(new Object[0], 0, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient int f41090OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    public final transient Object f41091OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient Object[] f41092OooO0oo;

    public o0O00o00(Object[] objArr, int i, @CheckForNull Object obj) {
        this.f41091OooO0oO = obj;
        this.f41092OooO0oo = objArr;
        this.f41090OooO = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final OooO OooO00o() {
        return new OooO(this.f41092OooO0oo, 1, this.f41090OooO);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final OooO0OO OooO0O0() {
        return new OooO0OO(this, this.f41092OooO0oo, this.f41090OooO);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final OooO0o OooO0OO() {
        return new OooO0o(this, new OooO(this.f41092OooO0oo, 0, this.f41090OooO));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzx, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f41092OooO0oo;
            if (this.f41090OooO == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f41091OooO0oO;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iOooO00o = o0000O0.OooO00o(obj.hashCode());
                    while (true) {
                        int i = iOooO00o & length;
                        int i2 = bArr[i] & UByte.MAX_VALUE;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iOooO00o = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iOooO00o2 = o0000O0.OooO00o(obj.hashCode());
                    while (true) {
                        int i3 = iOooO00o2 & length2;
                        char c = (char) sArr[i3];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iOooO00o2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iOooO00o3 = o0000O0.OooO00o(obj.hashCode());
                    while (true) {
                        int i4 = iOooO00o3 & length3;
                        int i5 = iArr[i4];
                        if (i5 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iOooO00o3 = i4 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41090OooO;
    }
}
