package o0OO0;

import com.google.android.gms.internal.play_billing.zzx;
import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;
import o0OO0.OooOO0;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o000O;

/* JADX INFO: loaded from: classes2.dex */
public enum OooO00o {
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
            public Object[] f16057OooO00o = new Object[8];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f16058OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public OooOO0 f16059OooO0OO;

            public final zzw zza(Object obj, Object obj2) {
                int i = this.f16058OooO0O0 + 1;
                int i2 = i + i;
                Object[] objArr = this.f16057OooO00o;
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
                    this.f16057OooO00o = Arrays.copyOf(objArr, i3);
                }
                o000O.OooO0O0(obj, obj2);
                Object[] objArr2 = this.f16057OooO00o;
                int i4 = this.f16058OooO0O0;
                int i5 = i4 + i4;
                objArr2[i5] = obj;
                objArr2[i5 + 1] = obj2;
                this.f16058OooO0O0 = i4 + 1;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v12 */
            /* JADX WARN: Type inference failed for: r3v21 */
            /* JADX WARN: Type inference failed for: r3v24 */
            /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r6v18 */
            /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v21 */
            /* JADX WARN: Type inference failed for: r6v22 */
            /* JADX WARN: Type inference failed for: r6v23 */
            /* JADX WARN: Type inference failed for: r6v25 */
            /* JADX WARN: Type inference failed for: r6v26 */
            /* JADX WARN: Type inference failed for: r6v27 */
            /* JADX WARN: Type inference failed for: r6v28 */
            /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
            public final zzx zzb() {
                short[] sArr;
                char c;
                char c2;
                ?? r6;
                boolean z;
                ?? r7;
                o0OO0.OooO0o oooO0o;
                ?? r8;
                OooOO0 oooOO1 = this.f16059OooO0OO;
                if (oooOO1 != null) {
                    throw oooOO1.OooO00o();
                }
                int i = this.f16058OooO0O0;
                Object[] objArrCopyOf = this.f16057OooO00o;
                o0OO0.OooO0o oooO0o2 = o0OO0.OooO0o.f37196OoooO0O;
                if (i == 0) {
                    oooO0o = o0OO0.OooO0o.f37196OoooO0O;
                } else {
                    OooOO0 oooOO2 = null;
                    ?? r3 = 0;
                    OooOO0 oooOO3 = null;
                    OooOO0 oooOO4 = null;
                    int i2 = 1;
                    if (i == 1) {
                        Objects.requireNonNull(objArrCopyOf[0]);
                        Objects.requireNonNull(objArrCopyOf[1]);
                        oooO0o = new o0OO0.OooO0o(null, objArrCopyOf, 1);
                    } else {
                        zzm.zzb(i, objArrCopyOf.length >> 1, "index");
                        int iMax = Math.max(i, 2);
                        int i3 = 1073741824;
                        if (iMax < 751619276) {
                            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
                            i3 = iHighestOneBit + iHighestOneBit;
                            while (((double) i3) * 0.7d < iMax) {
                                i3 += i3;
                            }
                        } else if (iMax >= 1073741824) {
                            throw new IllegalArgumentException("collection too large");
                        }
                        if (i == 1) {
                            Objects.requireNonNull(objArrCopyOf[0]);
                            Objects.requireNonNull(objArrCopyOf[1]);
                        } else {
                            int i4 = i3 - 1;
                            byte b = -1;
                            if (i3 <= 128) {
                                byte[] bArr = new byte[i3];
                                Arrays.fill(bArr, (byte) -1);
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < i) {
                                    int i7 = i5 + i5;
                                    int i8 = i6 + i6;
                                    Object obj = objArrCopyOf[i7];
                                    Objects.requireNonNull(obj);
                                    Object obj2 = objArrCopyOf[i7 ^ i2];
                                    Objects.requireNonNull(obj2);
                                    int iOooO = o000OO0O.OooO(obj.hashCode());
                                    while (true) {
                                        int i9 = iOooO & i4;
                                        int i10 = bArr[i9] & UByte.MAX_VALUE;
                                        if (i10 == 255) {
                                            bArr[i9] = (byte) i8;
                                            if (i6 < i5) {
                                                objArrCopyOf[i8] = obj;
                                                objArrCopyOf[i8 ^ 1] = obj2;
                                            }
                                            i6++;
                                            break;
                                        }
                                        if (obj.equals(objArrCopyOf[i10 == true ? 1 : 0])) {
                                            int i11 = ~i10;
                                            Object obj3 = objArrCopyOf[i11 == true ? 1 : 0];
                                            Objects.requireNonNull(obj3);
                                            OooOO0 oooOO5 = new OooOO0(obj, obj2, obj3);
                                            objArrCopyOf[i11 == true ? 1 : 0] = obj2;
                                            oooOO3 = oooOO5;
                                            break;
                                        }
                                        iOooO = i9 + 1;
                                    }
                                    i5++;
                                    i2 = 1;
                                }
                                if (i6 == i) {
                                    r3 = bArr;
                                } else {
                                    sArr = new Object[]{bArr, Integer.valueOf(i6), oooOO3};
                                }
                            } else if (i3 <= 32768) {
                                sArr = new short[i3];
                                Arrays.fill(sArr, (short) -1);
                                int i12 = 0;
                                for (int i13 = 0; i13 < i; i13++) {
                                    int i14 = i13 + i13;
                                    int i15 = i12 + i12;
                                    Object obj4 = objArrCopyOf[i14];
                                    Objects.requireNonNull(obj4);
                                    Object obj5 = objArrCopyOf[i14 ^ 1];
                                    Objects.requireNonNull(obj5);
                                    int iOooO2 = o000OO0O.OooO(obj4.hashCode());
                                    while (true) {
                                        int i16 = iOooO2 & i4;
                                        char c3 = (char) sArr[i16];
                                        if (c3 == 65535) {
                                            sArr[i16] = (short) i15;
                                            if (i12 < i13) {
                                                objArrCopyOf[i15] = obj4;
                                                objArrCopyOf[i15 ^ 1] = obj5;
                                            }
                                            i12++;
                                            break;
                                        }
                                        if (obj4.equals(objArrCopyOf[c3])) {
                                            int i17 = c3 ^ 1;
                                            Object obj6 = objArrCopyOf[i17 == true ? 1 : 0];
                                            Objects.requireNonNull(obj6);
                                            OooOO0 oooOO6 = new OooOO0(obj4, obj5, obj6);
                                            objArrCopyOf[i17 == true ? 1 : 0] = obj5;
                                            oooOO4 = oooOO6;
                                            break;
                                        }
                                        iOooO2 = i16 + 1;
                                    }
                                }
                                if (i12 != i) {
                                    r8 = new Object[]{sArr, Integer.valueOf(i12), oooOO4};
                                }
                                c2 = 2;
                                c = 1;
                                r6 = r8;
                                z = r6 instanceof Object[];
                                r7 = r6;
                                if (z) {
                                    Object[] objArr = (Object[]) r6;
                                    this.f16059OooO0OO = (OooOO0) objArr[c2];
                                    Object obj7 = objArr[0];
                                    int iIntValue = ((Integer) objArr[c]).intValue();
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                                    r7 = obj7;
                                    i = iIntValue;
                                }
                                oooO0o = new o0OO0.OooO0o(r7, objArrCopyOf, i);
                            } else {
                                int i18 = 1;
                                sArr = new int[i3];
                                Arrays.fill((int[]) sArr, -1);
                                int i19 = 0;
                                int i20 = 0;
                                while (i19 < i) {
                                    int i21 = i19 + i19;
                                    int i22 = i20 + i20;
                                    Object obj8 = objArrCopyOf[i21];
                                    Objects.requireNonNull(obj8);
                                    Object obj9 = objArrCopyOf[i21 ^ i18];
                                    Objects.requireNonNull(obj9);
                                    int iOooO3 = o000OO0O.OooO(obj8.hashCode());
                                    while (true) {
                                        int i23 = iOooO3 & i4;
                                        ?? r15 = sArr[i23];
                                        if (r15 == b) {
                                            sArr[i23] = i22;
                                            if (i20 < i19) {
                                                objArrCopyOf[i22] = obj8;
                                                objArrCopyOf[i22 ^ 1] = obj9;
                                            }
                                            i20++;
                                            break;
                                        }
                                        if (obj8.equals(objArrCopyOf[r15])) {
                                            int i24 = r15 ^ 1;
                                            Object obj10 = objArrCopyOf[i24 == true ? 1 : 0];
                                            Objects.requireNonNull(obj10);
                                            OooOO0 oooOO7 = new OooOO0(obj8, obj9, obj10);
                                            objArrCopyOf[i24 == true ? 1 : 0] = obj9;
                                            oooOO2 = oooOO7;
                                            break;
                                        }
                                        iOooO3 = i23 + 1;
                                        b = -1;
                                    }
                                    i19++;
                                    i18 = 1;
                                    b = -1;
                                }
                                if (i20 != i) {
                                    c = 1;
                                    c2 = 2;
                                    r6 = new Object[]{sArr, Integer.valueOf(i20), oooOO2};
                                }
                                z = r6 instanceof Object[];
                                r7 = r6;
                                if (z) {
                                    Object[] objArr2 = (Object[]) r6;
                                    this.f16059OooO0OO = (OooOO0) objArr2[c2];
                                    Object obj11 = objArr2[0];
                                    int iIntValue2 = ((Integer) objArr2[c]).intValue();
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                                    r7 = obj11;
                                    i = iIntValue2;
                                }
                                oooO0o = new o0OO0.OooO0o(r7, objArrCopyOf, i);
                            }
                            r3 = sArr;
                        }
                        r8 = r3;
                        c2 = 2;
                        c = 1;
                        r6 = r8;
                        z = r6 instanceof Object[];
                        r7 = r6;
                        if (z) {
                            Object[] objArr3 = (Object[]) r6;
                            this.f16059OooO0OO = (OooOO0) objArr3[c2];
                            Object obj12 = objArr3[0];
                            int iIntValue3 = ((Integer) objArr3[c]).intValue();
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue3 + iIntValue3);
                            r7 = obj12;
                            i = iIntValue3;
                        }
                        oooO0o = new o0OO0.OooO0o(r7, objArrCopyOf, i);
                    }
                }
                OooOO0 oooOO8 = this.f16059OooO0OO;
                if (oooOO8 == null) {
                    return oooO0o;
                }
                throw oooOO8.OooO00o();
            }
        };
        for (OooO00o oooO00o : values()) {
            r0.zza(Integer.valueOf(oooO00o.zzq), oooO00o);
        }
        zzo = r0.zzb();
    }

    OooO00o(int i) {
        this.zzq = i;
    }

    public static OooO00o OooO00o(int i) {
        zzx zzxVar = zzo;
        Integer numValueOf = Integer.valueOf(i);
        return !zzxVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (OooO00o) zzxVar.get(numValueOf);
    }
}
