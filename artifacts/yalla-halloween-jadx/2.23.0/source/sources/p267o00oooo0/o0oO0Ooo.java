package p267o00oooo0;

import com.android.billingclient.api.o0000O0;
import com.google.android.gms.internal.play_billing.zzx;
import java.util.Arrays;
import java.util.Objects;
import org.jctools.util.Pow2;
import p267o00oooo0.o0O00o00;
import p267o00oooo0.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public enum o0oO0Ooo {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);

    private static final zzx zzo;
    private final int zzq;

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.internal.play_billing.zzw] */
    static {
        ?? r0 = new Object() { // from class: com.google.android.gms.internal.play_billing.zzw

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public Object[] f15855OooO00o = new Object[8];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f15856OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public o0oO0O0o f15857OooO0OO;

            public final zzw zza(Object obj, Object obj2) {
                int i = this.f15856OooO0O0 + 1;
                int i2 = i + i;
                Object[] objArr = this.f15855OooO00o;
                int length = objArr.length;
                if (i2 > length) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        i3 = iHighestOneBit + iHighestOneBit;
                    }
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    this.f15855OooO00o = Arrays.copyOf(objArr, i3);
                }
                if (obj == null) {
                    Objects.toString(obj2);
                    throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
                }
                if (obj2 == null) {
                    throw new NullPointerException("null value in entry: " + obj + "=null");
                }
                Object[] objArr2 = this.f15855OooO00o;
                int i4 = this.f15856OooO0O0;
                int i5 = i4 + i4;
                objArr2[i5] = obj;
                objArr2[i5 + 1] = obj2;
                this.f15856OooO0O0 = i4 + 1;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:73:0x0199 A[PHI: r3
              0x0199: PHI (r3v6 ??) = (r3v3 ??), (r3v7 short[]) binds: [B:72:0x0197, B:55:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r3v3, types: [int[]] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v12 */
            /* JADX WARN: Type inference failed for: r4v14 */
            /* JADX WARN: Type inference failed for: r4v17 */
            /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v21 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v29 */
            /* JADX WARN: Type inference failed for: r4v30 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r8v12 */
            /* JADX WARN: Type inference failed for: r8v7 */
            public final zzx zzb() {
                int iHighestOneBit;
                short[] sArr;
                char c;
                char c2;
                byte[] bArr;
                ?? r4;
                o0O00o00 o0o00o01;
                o0oO0O0o o0oo0o0o2 = this.f15857OooO0OO;
                if (o0oo0o0o2 != null) {
                    throw o0oo0o0o2.OooO00o();
                }
                int i = this.f15856OooO0O0;
                Object[] objArrCopyOf = this.f15855OooO00o;
                if (i == 0) {
                    o0o00o01 = o0O00o00.f41089OooOO0;
                } else {
                    o0O00o00 o0o00o02 = o0O00o00.f41089OooOO0;
                    int i2 = 1;
                    o0oO0O0o o0oo0o0o3 = null;
                    ?? r5 = 0;
                    o0oO0O0o o0oo0o0o4 = null;
                    o0oO0O0o o0oo0o0o5 = null;
                    if (i == 1) {
                        objArrCopyOf[0].getClass();
                        objArrCopyOf[1].getClass();
                        o0o00o01 = new o0O00o00(objArrCopyOf, 1, null);
                    } else {
                        zzm.zzb(i, objArrCopyOf.length >> 1, "index");
                        int iMax = Math.max(i, 2);
                        if (iMax < 751619276) {
                            iHighestOneBit = Integer.highestOneBit(iMax - 1);
                            do {
                                iHighestOneBit += iHighestOneBit;
                            } while (((double) iHighestOneBit) * 0.7d < iMax);
                        } else {
                            iHighestOneBit = Pow2.MAX_POW2;
                            if (iMax >= 1073741824) {
                                throw new IllegalArgumentException("collection too large");
                            }
                        }
                        if (i == 1) {
                            objArrCopyOf[0].getClass();
                            objArrCopyOf[1].getClass();
                            c = 1;
                            c2 = 2;
                        } else {
                            int i3 = iHighestOneBit - 1;
                            byte b = -1;
                            if (iHighestOneBit <= 128) {
                                bArr = new byte[iHighestOneBit];
                                Arrays.fill(bArr, (byte) -1);
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < i) {
                                    int i6 = i4 + i4;
                                    int i7 = i5 + i5;
                                    Object obj = objArrCopyOf[i6];
                                    obj.getClass();
                                    Object obj2 = objArrCopyOf[i6 ^ i2];
                                    obj2.getClass();
                                    int iOooO00o = o0000O0.OooO00o(obj.hashCode());
                                    while (true) {
                                        int i8 = iOooO00o & i3;
                                        int i9 = bArr[i8] & 255;
                                        if (i9 == 255) {
                                            bArr[i8] = (byte) i7;
                                            if (i5 < i4) {
                                                objArrCopyOf[i7] = obj;
                                                objArrCopyOf[i7 ^ 1] = obj2;
                                            }
                                            i5++;
                                            break;
                                        }
                                        if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                                            int i10 = ~i9;
                                            Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                                            obj3.getClass();
                                            o0oo0o0o4 = new o0oO0O0o(obj, obj2, obj3);
                                            objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                                            break;
                                        }
                                        iOooO00o = i8 + 1;
                                    }
                                    i4++;
                                    i2 = 1;
                                }
                                if (i5 != i) {
                                    r4 = new Object[]{bArr, Integer.valueOf(i5), o0oo0o0o4};
                                }
                                c2 = 2;
                                c = 1;
                                r5 = r4;
                            } else if (iHighestOneBit <= 32768) {
                                sArr = new short[iHighestOneBit];
                                Arrays.fill(sArr, (short) -1);
                                int i11 = 0;
                                for (int i12 = 0; i12 < i; i12++) {
                                    int i13 = i12 + i12;
                                    int i14 = i11 + i11;
                                    Object obj4 = objArrCopyOf[i13];
                                    obj4.getClass();
                                    Object obj5 = objArrCopyOf[i13 ^ 1];
                                    obj5.getClass();
                                    int iOooO00o2 = o0000O0.OooO00o(obj4.hashCode());
                                    while (true) {
                                        int i15 = iOooO00o2 & i3;
                                        char c3 = (char) sArr[i15];
                                        if (c3 == 65535) {
                                            sArr[i15] = (short) i14;
                                            if (i11 < i12) {
                                                objArrCopyOf[i14] = obj4;
                                                objArrCopyOf[i14 ^ 1] = obj5;
                                            }
                                            i11++;
                                            break;
                                        }
                                        if (obj4.equals(objArrCopyOf[c3])) {
                                            int i16 = c3 ^ 1;
                                            Object obj6 = objArrCopyOf[i16 == true ? 1 : 0];
                                            obj6.getClass();
                                            o0oO0O0o o0oo0o0o6 = new o0oO0O0o(obj4, obj5, obj6);
                                            objArrCopyOf[i16 == true ? 1 : 0] = obj5;
                                            o0oo0o0o5 = o0oo0o0o6;
                                            break;
                                        }
                                        iOooO00o2 = i15 + 1;
                                    }
                                }
                                if (i11 == i) {
                                    bArr = sArr;
                                } else {
                                    c2 = 2;
                                    r5 = new Object[]{sArr, Integer.valueOf(i11), o0oo0o0o5};
                                    c = 1;
                                }
                            } else {
                                int i17 = 1;
                                sArr = new int[iHighestOneBit];
                                Arrays.fill((int[]) sArr, -1);
                                int i18 = 0;
                                int i19 = 0;
                                while (i18 < i) {
                                    int i20 = i18 + i18;
                                    int i21 = i19 + i19;
                                    Object obj7 = objArrCopyOf[i20];
                                    obj7.getClass();
                                    Object obj8 = objArrCopyOf[i20 ^ i17];
                                    obj8.getClass();
                                    int iOooO00o3 = o0000O0.OooO00o(obj7.hashCode());
                                    while (true) {
                                        int i22 = iOooO00o3 & i3;
                                        ?? r15 = sArr[i22];
                                        if (r15 == b) {
                                            sArr[i22] = i21;
                                            if (i19 < i18) {
                                                objArrCopyOf[i21] = obj7;
                                                objArrCopyOf[i21 ^ 1] = obj8;
                                            }
                                            i19++;
                                            break;
                                        }
                                        if (obj7.equals(objArrCopyOf[r15])) {
                                            int i23 = r15 ^ 1;
                                            Object obj9 = objArrCopyOf[i23 == true ? 1 : 0];
                                            obj9.getClass();
                                            o0oO0O0o o0oo0o0o7 = new o0oO0O0o(obj7, obj8, obj9);
                                            objArrCopyOf[i23 == true ? 1 : 0] = obj8;
                                            o0oo0o0o3 = o0oo0o0o7;
                                            break;
                                        }
                                        iOooO00o3 = i22 + 1;
                                        b = -1;
                                    }
                                    i18++;
                                    b = -1;
                                    i17 = 1;
                                }
                                if (i19 == i) {
                                    bArr = sArr;
                                } else {
                                    c = 1;
                                    c2 = 2;
                                    r5 = new Object[]{sArr, Integer.valueOf(i19), o0oo0o0o3};
                                }
                            }
                            r4 = bArr;
                            c2 = 2;
                            c = 1;
                            r5 = r4;
                        }
                        boolean z = r5 instanceof Object[];
                        ?? r6 = r5;
                        if (z) {
                            Object[] objArr = (Object[]) r5;
                            this.f15857OooO0OO = (o0oO0O0o) objArr[c2];
                            Object obj10 = objArr[0];
                            int iIntValue = ((Integer) objArr[c]).intValue();
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                            r6 = obj10;
                            i = iIntValue;
                        }
                        o0o00o01 = new o0O00o00(objArrCopyOf, i, r6);
                    }
                }
                o0oO0O0o o0oo0o0o8 = this.f15857OooO0OO;
                if (o0oo0o0o8 == null) {
                    return o0o00o01;
                }
                throw o0oo0o0o8.OooO00o();
            }
        };
        for (o0oO0Ooo o0oo0ooo2 : values()) {
            r0.zza(Integer.valueOf(o0oo0ooo2.zzq), o0oo0ooo2);
        }
        zzo = r0.zzb();
    }

    o0oO0Ooo(int i) {
        this.zzq = i;
    }

    public static o0oO0Ooo OooO00o(int i) {
        zzx zzxVar = zzo;
        Integer numValueOf = Integer.valueOf(i);
        return !zzxVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (o0oO0Ooo) zzxVar.get(numValueOf);
    }
}
