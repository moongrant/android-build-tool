package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0OOoo<T> implements o0OO000o<T> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f15622OooOOO = new int[0];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Unsafe f15623OooOOOO = o0oo0000.OooOO0O();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f15624OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f15625OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f15626OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f15627OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f15629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzmi f15630OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f15631OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f15632OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f15633OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0oO0Ooo f15634OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0OOO00 f15635OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0O000O f15636OooOOO0;

    public oo0OOoo(int[] iArr, Object[] objArr, int i, int i2, zzmi zzmiVar, boolean z, int[] iArr2, int i3, int i4, o0oO0Ooo o0oo0ooo2, o0OOO00 o0ooo00, o0O000O o0o000o) {
        this.f15625OooO00o = iArr;
        this.f15626OooO0O0 = objArr;
        this.f15627OooO0OO = i;
        this.f15628OooO0Oo = i2;
        this.f15631OooO0oO = z;
        this.f15629OooO0o = o0o000o != null && o0o000o.OooO0OO(zzmiVar);
        this.f15632OooO0oo = iArr2;
        this.f15624OooO = i3;
        this.f15633OooOO0 = i4;
        this.f15634OooOO0O = o0oo0ooo2;
        this.f15635OooOO0o = o0ooo00;
        this.f15636OooOOO0 = o0o000o;
        this.f15630OooO0o0 = zzmiVar;
    }

    public static void OooOOO(Object obj) {
        if (!OooOo0o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static Field OooOOO0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbOooO0OO = androidx.compose.compiler.plugins.kotlin.OooO0o.OooO0OO("Field ", str, " for ", name, " not found. Known fields are ");
            sbOooO0OO.append(string);
            throw new RuntimeException(sbOooO0OO.toString());
        }
    }

    public static boolean OooOo0o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).OooOO0O();
        }
        return true;
    }

    public static final void OooOoO0(int i, Object obj, o0O00000 o0o00000) throws IOException {
        if (!(obj instanceof String)) {
            o0o00000.OooO0o(i, (zzka) obj);
        } else {
            o0o00000.f15524OooO00o.zzm(i, (String) obj);
        }
    }

    public static zznl OooOoOO(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarOooO00o = zznl.OooO00o();
        zzlbVar.zzc = zznlVarOooO00o;
        return zznlVarOooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0264  */
    /* JADX WARN: Code duplicated, block: B:125:0x0267  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0281  */
    public static oo0OOoo OooOoo0(o0O0OO0 o0o0oo0, o0oO0Ooo o0oo0ooo2, o0OOO00 o0ooo00, o0O000O o0o000o) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int i17;
        int i18;
        int iObjectFieldOffset2;
        int i19;
        Field fieldOooOOO0;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldOooOOO1;
        int i24;
        Object obj2;
        Field fieldOooOOO2;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        if (!(o0o0oo0 instanceof o0OO000)) {
            throw null;
        }
        o0OO000 o0oo000 = (o0OO000) o0o0oo0;
        int iZzc = o0oo000.zzc();
        String strOooO00o = o0oo000.OooO00o();
        int length = strOooO00o.length();
        char c = 55296;
        if (strOooO00o.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (strOooO00o.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt4 = strOooO00o.charAt(i);
        if (iCharAt4 >= 55296) {
            int i31 = iCharAt4 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = strOooO00o.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt4 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt4 == 0) {
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i2 = i30;
            iArr = f15622OooOOO;
            iCharAt = 0;
        } else {
            int i33 = i30 + 1;
            iCharAt = strOooO00o.charAt(i30);
            if (iCharAt >= 55296) {
                int i34 = iCharAt & 8191;
                int i35 = 13;
                while (true) {
                    i14 = i33 + 1;
                    cCharAt8 = strOooO00o.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i14;
                }
                iCharAt = i34 | (cCharAt8 << i35);
                i33 = i14;
            }
            int i36 = i33 + 1;
            int iCharAt5 = strOooO00o.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i13 = i36 + 1;
                    cCharAt7 = strOooO00o.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i13;
                }
                iCharAt5 = i37 | (cCharAt7 << i38);
                i36 = i13;
            }
            int i39 = i36 + 1;
            int iCharAt6 = strOooO00o.charAt(i36);
            if (iCharAt6 >= 55296) {
                int i40 = iCharAt6 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    cCharAt6 = strOooO00o.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                iCharAt6 = i40 | (cCharAt6 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int iCharAt7 = strOooO00o.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    cCharAt5 = strOooO00o.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                iCharAt7 = i43 | (cCharAt5 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            iCharAt2 = strOooO00o.charAt(i42);
            if (iCharAt2 >= 55296) {
                int i46 = iCharAt2 & 8191;
                int i47 = 13;
                while (true) {
                    i10 = i45 + 1;
                    cCharAt4 = strOooO00o.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i10;
                }
                iCharAt2 = i46 | (cCharAt4 << i47);
                i45 = i10;
            }
            int i48 = i45 + 1;
            iCharAt3 = strOooO00o.charAt(i45);
            if (iCharAt3 >= 55296) {
                int i49 = iCharAt3 & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    cCharAt3 = strOooO00o.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                iCharAt3 = i49 | (cCharAt3 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strOooO00o.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i8 = i51 + 1;
                    cCharAt2 = strOooO00o.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i8;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i8;
            }
            i2 = i51 + 1;
            int iCharAt9 = strOooO00o.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = i2;
                int i56 = 13;
                while (true) {
                    i7 = i55 + 1;
                    cCharAt = strOooO00o.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i55 = i7;
                }
                iCharAt9 = i54 | (cCharAt << i56);
                i2 = i7;
            }
            int i57 = iCharAt9 + iCharAt3 + iCharAt8;
            i3 = iCharAt + iCharAt + iCharAt5;
            iArr = new int[i57];
            i4 = iCharAt6;
            i5 = iCharAt7;
            i6 = iCharAt9;
        }
        Object[] objArrOooO0O0 = o0oo000.OooO0O0();
        Class<?> cls = o0oo000.zza().getClass();
        int i58 = i6 + iCharAt3;
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i59 = i2;
        int i60 = i6;
        int i61 = i58;
        int i62 = 0;
        int i63 = 0;
        while (true) {
            boolean z = iZzc == 2;
            if (i59 >= length) {
                return new oo0OOoo(iArr2, objArr, i4, i5, o0oo000.zza(), z, iArr, i6, i58, o0oo0ooo2, o0ooo00, o0o000o);
            }
            int i64 = i59 + 1;
            int iCharAt10 = strOooO00o.charAt(i59);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = 13;
                while (true) {
                    i27 = i64 + 1;
                    cCharAt12 = strOooO00o.charAt(i64);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i66;
                    i66 += 13;
                    i64 = i27;
                }
                iCharAt10 = i65 | (cCharAt12 << i66);
                i64 = i27;
            }
            int i67 = i64 + 1;
            int iCharAt11 = strOooO00o.charAt(i64);
            if (iCharAt11 >= c) {
                int i68 = iCharAt11 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i26 = i69 + 1;
                    cCharAt11 = strOooO00o.charAt(i69);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i68 |= (cCharAt11 & 8191) << i70;
                    i70 += 13;
                    i69 = i26;
                }
                iCharAt11 = i68 | (cCharAt11 << i70);
                i15 = i26;
            } else {
                i15 = i67;
            }
            if ((iCharAt11 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i71 = iCharAt11 & 255;
            int i72 = iZzc;
            Unsafe unsafe = f15623OooOOOO;
            int i73 = length;
            if (i71 >= 51) {
                int i74 = i15 + 1;
                int iCharAt12 = strOooO00o.charAt(i15);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i75 = 13;
                    int i76 = iCharAt12 & 8191;
                    int i77 = i74;
                    while (true) {
                        i25 = i77 + 1;
                        cCharAt10 = strOooO00o.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i75;
                        i75 += 13;
                        i77 = i25;
                        c2 = 55296;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i75);
                    i21 = i25;
                } else {
                    i21 = i74;
                }
                i19 = i21;
                int i78 = i71 - 51;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i63 / 3;
                    i22 = i3 + 1;
                    objArr[i79 + i79 + 1] = objArrOooO0O0[i3];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i63 / 3;
                        i22 = i3 + 1;
                        objArr[i80 + i80 + 1] = objArrOooO0O0[i3];
                    }
                    i23 = iCharAt12 + iCharAt12;
                    obj = objArrOooO0O0[i23];
                    if (obj instanceof Field) {
                        fieldOooOOO1 = (Field) obj;
                    } else {
                        fieldOooOOO1 = OooOOO0(cls, (String) obj);
                        objArrOooO0O0[i23] = fieldOooOOO1;
                    }
                    i16 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOOO1);
                    i24 = i23 + 1;
                    obj2 = objArrOooO0O0[i24];
                    if (obj2 instanceof Field) {
                        fieldOooOOO2 = (Field) obj2;
                    } else {
                        fieldOooOOO2 = OooOOO0(cls, (String) obj2);
                        objArrOooO0O0[i24] = fieldOooOOO2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOOO2);
                    strOooO00o = strOooO00o;
                    i18 = 0;
                }
                i3 = i22;
                i23 = iCharAt12 + iCharAt12;
                obj = objArrOooO0O0[i23];
                if (obj instanceof Field) {
                    fieldOooOOO1 = (Field) obj;
                } else {
                    fieldOooOOO1 = OooOOO0(cls, (String) obj);
                    objArrOooO0O0[i23] = fieldOooOOO1;
                }
                i16 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOOO1);
                i24 = i23 + 1;
                obj2 = objArrOooO0O0[i24];
                if (obj2 instanceof Field) {
                    fieldOooOOO2 = (Field) obj2;
                } else {
                    fieldOooOOO2 = OooOOO0(cls, (String) obj2);
                    objArrOooO0O0[i24] = fieldOooOOO2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOOO2);
                strOooO00o = strOooO00o;
                i18 = 0;
            } else {
                int i81 = i3 + 1;
                Field fieldOooOOO3 = OooOOO0(cls, (String) objArrOooO0O0[i3]);
                if (i71 == 9 || i71 == 17) {
                    int i82 = i63 / 3;
                    objArr[i82 + i82 + 1] = fieldOooOOO3.getType();
                } else if (i71 == 27 || i71 == 49) {
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = objArrOooO0O0[i81];
                    i81++;
                } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                    if (!z) {
                        int i84 = i63 / 3;
                        i20 = i81 + 1;
                        objArr[i84 + i84 + 1] = objArrOooO0O0[i81];
                        i81 = i20;
                    }
                } else if (i71 == 50) {
                    int i85 = i60 + 1;
                    iArr[i60] = i63;
                    int i86 = i63 / 3;
                    i20 = i81 + 1;
                    int i87 = i86 + i86;
                    objArr[i87] = objArrOooO0O0[i81];
                    if ((iCharAt11 & 2048) != 0) {
                        i81 = i20 + 1;
                        objArr[i87 + 1] = objArrOooO0O0[i20];
                        i60 = i85;
                    } else {
                        i60 = i85;
                        i81 = i20;
                    }
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldOooOOO3);
                i16 = i81;
                if ((iCharAt11 & 4096) != 4096 || i71 > 17) {
                    iObjectFieldOffset = 1048575;
                    i17 = i15;
                    i18 = 0;
                } else {
                    int i88 = i15 + 1;
                    int iCharAt13 = strOooO00o.charAt(i15);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i17 = i88 + 1;
                            cCharAt9 = strOooO00o.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i17;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i17 = i88;
                    }
                    int i91 = (iCharAt13 / 32) + iCharAt + iCharAt;
                    Object obj3 = objArrOooO0O0[i91];
                    if (obj3 instanceof Field) {
                        fieldOooOOO0 = (Field) obj3;
                    } else {
                        fieldOooOOO0 = OooOOO0(cls, (String) obj3);
                        objArrOooO0O0[i91] = fieldOooOOO0;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOOO0);
                    i18 = iCharAt13 % 32;
                }
                if (i71 >= 18 && i71 <= 49) {
                    iArr[i61] = iObjectFieldOffset3;
                    i61++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i19 = i17;
            }
            int i92 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i93 = i92 + 1;
            iArr2[i92] = iObjectFieldOffset2 | (i71 << 20) | ((iCharAt11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | ((iCharAt11 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 536870912 : 0);
            i63 = i93 + 1;
            iArr2[i93] = iObjectFieldOffset | (i18 << 20);
            strOooO00o = strOooO00o;
            i3 = i16;
            iZzc = i72;
            i59 = i19;
            length = i73;
            i62 = i62;
            c = 55296;
        }
    }

    public static int OooOooO(long j, Object obj) {
        return ((Integer) o0oo0000.OooOO0(j, obj)).intValue();
    }

    public static long Oooo0O0(long j, Object obj) {
        return ((Long) o0oo0000.OooOO0(j, obj)).longValue();
    }

    public final o0OO000o OooO(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f15626OooO0O0;
        o0OO000o o0oo000o = (o0OO000o) objArr[i3];
        if (o0oo000o != null) {
            return o0oo000o;
        }
        o0OO000o o0oo000oOooO00o = o0O0oo00.f15553OooO0OO.OooO00o((Class) objArr[i3 + 1]);
        objArr[i3] = o0oo000oOooO00o;
        return o0oo000oOooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO00o(Object obj) {
        if (OooOo0o(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.OooOO0();
                zzlbVar.zzb = 0;
                zzlbVar.OooO0oo();
            }
            int[] iArr = this.f15625OooO00o;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iOooo0 = Oooo0(i);
                int i2 = 1048575 & iOooo0;
                int i3 = (iOooo0 >>> 20) & 255;
                long j = i2;
                Unsafe unsafe = f15623OooOOOO;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 17:
                                if (OooOo0O(i, obj)) {
                                    OooO(i).OooO00o(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f15634OooOO0O.OooO00o(j, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (OooOo(iArr[i], i, obj)) {
                        OooO(i).OooO00o(unsafe.getObject(obj, j));
                    }
                } else if (OooOo0O(i, obj)) {
                    OooO(i).OooO00o(unsafe.getObject(obj, j));
                }
            }
            this.f15635OooOO0o.OooO0oO(obj);
            if (this.f15629OooO0o) {
                this.f15636OooOOO0.OooO0O0(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0O0(Object obj, o0O00000 o0o00000) throws IOException {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.f15631OooO0oO;
        o0OOO00 o0ooo00 = this.f15635OooOO0o;
        o0O000O o0o000o = this.f15636OooOOO0;
        boolean z5 = this.f15629OooO0o;
        int[] iArr = this.f15625OooO00o;
        int i3 = 1048575;
        if (z4) {
            if (z5) {
                o0o000o.OooO00o(obj);
                throw null;
            }
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int iOooo0 = Oooo0(i4);
                int i5 = iArr[i4];
                switch ((iOooo0 >>> 20) & 255) {
                    case 0:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0oO(o0oo0000.OooO0o0(iOooo0 & 1048575, obj), i5);
                        }
                        break;
                    case 1:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOO0O(o0oo0000.OooO0o(iOooo0 & 1048575, obj), i5);
                        }
                        break;
                    case 2:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOOO(i5, o0oo0000.OooO0oo(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0Oo(i5, o0oo0000.OooO0oo(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOOO0(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOO0(i5, o0oo0000.OooO0oo(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0o0(i5, o0oo0000.OooOo0O(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (OooOo0O(i4, obj)) {
                            OooOoO0(i5, o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000);
                        }
                        break;
                    case 9:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOOOO(i5, OooO(i4), o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 10:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0o(i5, (zzka) o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0OO(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0oo(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOOOo(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOOo0(i5, o0oo0000.OooO0oo(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO00o(i5, o0oo0000.OooO0oO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooO0O0(i5, o0oo0000.OooO0oo(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (OooOo0O(i4, obj)) {
                            o0o00000.OooOO0o(i5, OooO(i4), o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 18:
                        oo0oO0.OooO0Oo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 19:
                        oo0oO0.OooO0oo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 20:
                        oo0oO0.OooOO0O(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 21:
                        oo0oO0.OooOOoo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 22:
                        oo0oO0.OooOO0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 23:
                        oo0oO0.OooO0oO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 24:
                        oo0oO0.OooO0o(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 25:
                        oo0oO0.OooO0O0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 26:
                        oo0oO0.OooOOo0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000);
                        break;
                    case 27:
                        oo0oO0.OooOO0o(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, OooO(i4));
                        break;
                    case 28:
                        oo0oO0.OooO0OO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000);
                        break;
                    case 29:
                        oo0oO0.OooOOo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 30:
                        oo0oO0.OooO0o0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 31:
                        oo0oO0.OooOOO0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 32:
                        oo0oO0.OooOOO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 33:
                        oo0oO0.OooOOOO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 34:
                        oo0oO0.OooOOOo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, false);
                        break;
                    case 35:
                        oo0oO0.OooO0Oo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 36:
                        oo0oO0.OooO0oo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 37:
                        oo0oO0.OooOO0O(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 38:
                        oo0oO0.OooOOoo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 39:
                        oo0oO0.OooOO0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 40:
                        oo0oO0.OooO0oO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 41:
                        oo0oO0.OooO0o(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 42:
                        oo0oO0.OooO0O0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 43:
                        oo0oO0.OooOOo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 44:
                        oo0oO0.OooO0o0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 45:
                        oo0oO0.OooOOO0(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 46:
                        oo0oO0.OooOOO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 47:
                        oo0oO0.OooOOOO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 48:
                        oo0oO0.OooOOOo(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, true);
                        break;
                    case 49:
                        oo0oO0.OooO(i5, (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000, OooO(i4));
                        break;
                    case 50:
                        if (o0oo0000.OooOO0(iOooo0 & 1048575, obj) != null) {
                            throw null;
                        }
                        break;
                        break;
                    case 51:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0oO(((Double) o0oo0000.OooOO0(iOooo0 & 1048575, obj)).doubleValue(), i5);
                        }
                        break;
                    case 52:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOO0O(((Float) o0oo0000.OooOO0(iOooo0 & 1048575, obj)).floatValue(), i5);
                        }
                        break;
                    case 53:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOOO(i5, Oooo0O0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0Oo(i5, Oooo0O0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOOO0(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOO0(i5, Oooo0O0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0o0(i5, ((Boolean) o0oo0000.OooOO0(iOooo0 & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (OooOo(i5, i4, obj)) {
                            OooOoO0(i5, o0oo0000.OooOO0(iOooo0 & 1048575, obj), o0o00000);
                        }
                        break;
                    case 60:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOOOO(i5, OooO(i4), o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 61:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0o(i5, (zzka) o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 62:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0OO(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0oo(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOOOo(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOOo0(i5, Oooo0O0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO00o(i5, OooOooO(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooO0O0(i5, Oooo0O0(iOooo0 & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (OooOo(i5, i4, obj)) {
                            o0o00000.OooOO0o(i5, OooO(i4), o0oo0000.OooOO0(iOooo0 & 1048575, obj));
                        }
                        break;
                }
            }
            o0ooo00.OooO(o0ooo00.OooO0Oo(obj), o0o00000);
            return;
        }
        if (z5) {
            o0o000o.OooO00o(obj);
            throw null;
        }
        int length2 = iArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i6 < length2) {
            int iOooo1 = Oooo0(i6);
            int i9 = iArr[i6];
            int i10 = (iOooo1 >>> 20) & 255;
            Unsafe unsafe = f15623OooOOOO;
            if (i10 <= 17) {
                int i11 = iArr[i6 + 2];
                int i12 = i11 & i3;
                if (i12 != i8) {
                    i7 = unsafe.getInt(obj, i12);
                    i8 = i12;
                }
                i2 = 1 << (i11 >>> 20);
                i = 1048575;
            } else {
                i = i3;
                i2 = 0;
            }
            int i13 = iOooo1 & i;
            int[] iArr2 = iArr;
            long j = i13;
            switch (i10) {
                case 0:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0oO(o0oo0000.OooO0o0(j, obj), i9);
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 1:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOO0O(o0oo0000.OooO0o(j, obj), i9);
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 2:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOOO(i9, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 3:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0Oo(i9, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 4:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOOO0(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 5:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOO0(i9, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 6:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 7:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0o0(i9, o0oo0000.OooOo0O(j, obj));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 8:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        OooOoO0(i9, unsafe.getObject(obj, j), o0o00000);
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 9:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOOOO(i9, OooO(i6), unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 10:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0o(i9, (zzka) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 11:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0OO(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 12:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0oo(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 13:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOOOo(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 14:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOOo0(i9, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 15:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO00o(i9, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 16:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooO0O0(i9, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 17:
                    z = true;
                    z2 = false;
                    if ((i2 & i7) != 0) {
                        o0o00000.OooOO0o(i9, OooO(i6), unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 18:
                    z = true;
                    z2 = false;
                    oo0oO0.OooO0Oo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 19:
                    z = true;
                    z2 = false;
                    oo0oO0.OooO0oo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 20:
                    z = true;
                    z2 = false;
                    oo0oO0.OooOO0O(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 21:
                    z = true;
                    z2 = false;
                    oo0oO0.OooOOoo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 22:
                    z = true;
                    z2 = false;
                    oo0oO0.OooOO0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 23:
                    z = true;
                    z2 = false;
                    oo0oO0.OooO0oO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 24:
                    z = true;
                    z2 = false;
                    oo0oO0.OooO0o(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 25:
                    z = true;
                    z2 = false;
                    oo0oO0.OooO0O0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 26:
                    z = true;
                    oo0oO0.OooOOo0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 27:
                    z = true;
                    oo0oO0.OooOO0o(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, OooO(i6));
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 28:
                    z = true;
                    oo0oO0.OooO0OO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 29:
                    z = true;
                    z3 = false;
                    oo0oO0.OooOOo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 30:
                    z = true;
                    z3 = false;
                    oo0oO0.OooO0o0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 31:
                    z = true;
                    z3 = false;
                    oo0oO0.OooOOO0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 32:
                    z = true;
                    z3 = false;
                    oo0oO0.OooOOO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 33:
                    z = true;
                    z3 = false;
                    oo0oO0.OooOOOO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 34:
                    z = true;
                    z3 = false;
                    oo0oO0.OooOOOo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, false);
                    z2 = z3;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 35:
                    z = true;
                    oo0oO0.OooO0Oo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 36:
                    z = true;
                    oo0oO0.OooO0oo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 37:
                    z = true;
                    oo0oO0.OooOO0O(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 38:
                    z = true;
                    oo0oO0.OooOOoo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 39:
                    z = true;
                    oo0oO0.OooOO0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 40:
                    z = true;
                    oo0oO0.OooO0oO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 41:
                    z = true;
                    oo0oO0.OooO0o(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 42:
                    z = true;
                    oo0oO0.OooO0O0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 43:
                    z = true;
                    oo0oO0.OooOOo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 44:
                    z = true;
                    oo0oO0.OooO0o0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 45:
                    z = true;
                    oo0oO0.OooOOO0(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 46:
                    z = true;
                    oo0oO0.OooOOO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 47:
                    z = true;
                    oo0oO0.OooOOOO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 48:
                    z = true;
                    oo0oO0.OooOOOo(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, true);
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 49:
                    oo0oO0.OooO(iArr2[i6], (List) unsafe.getObject(obj, j), o0o00000, OooO(i6));
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 51:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0oO(((Double) o0oo0000.OooOO0(j, obj)).doubleValue(), i9);
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 52:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOO0O(((Float) o0oo0000.OooOO0(j, obj)).floatValue(), i9);
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 53:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOOO(i9, Oooo0O0(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 54:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0Oo(i9, Oooo0O0(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 55:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOOO0(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 56:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOO0(i9, Oooo0O0(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 57:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 58:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0o0(i9, ((Boolean) o0oo0000.OooOO0(j, obj)).booleanValue());
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 59:
                    if (OooOo(i9, i6, obj)) {
                        OooOoO0(i9, unsafe.getObject(obj, j), o0o00000);
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 60:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOOOO(i9, OooO(i6), unsafe.getObject(obj, j));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 61:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0o(i9, (zzka) unsafe.getObject(obj, j));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 62:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0OO(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 63:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0oo(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 64:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOOOo(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 65:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOOo0(i9, Oooo0O0(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 66:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO00o(i9, OooOooO(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 67:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooO0O0(i9, Oooo0O0(j, obj));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                case 68:
                    if (OooOo(i9, i6, obj)) {
                        o0o00000.OooOO0o(i9, OooO(i6), unsafe.getObject(obj, j));
                    }
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
                default:
                    z = true;
                    z2 = false;
                    i6 += 3;
                    iArr = iArr2;
                    i3 = 1048575;
                    break;
            }
        }
        o0ooo00.OooO(o0ooo00.OooO0Oo(obj), o0o00000);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final int OooO0OO(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iHashCode;
        int[] iArr = this.f15625OooO00o;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iOooo0 = Oooo0(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iOooo0;
            switch ((iOooo0 >>> 20) & 255) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(o0oo0000.OooO0o0(j, obj));
                    Charset charset = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(o0oo0000.OooO0o(j, obj));
                    i3 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = o0oo0000.OooO0oo(j, obj);
                    Charset charset2 = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = o0oo0000.OooO0oo(j, obj);
                    Charset charset3 = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = o0oo0000.OooO0oo(j, obj);
                    Charset charset4 = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlj.zza(o0oo0000.OooOo0O(j, obj));
                    i3 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iFloatToIntBits = ((String) o0oo0000.OooOO0(j, obj)).hashCode();
                    i3 = iFloatToIntBits + i2;
                    break;
                case 9:
                    Object objOooOO0 = o0oo0000.OooOO0(j, obj);
                    if (objOooOO0 != null) {
                        iHashCode = objOooOO0.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i = i3 * 53;
                    i3 = i + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                    i3 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = o0oo0000.OooO0oo(j, obj);
                    Charset charset5 = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooO0oO(j, obj);
                    i3 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = o0oo0000.OooO0oo(j, obj);
                    Charset charset6 = zzlj.f15753OooO00o;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iHashCode;
                    break;
                case 17:
                    Object objOooOO1 = o0oo0000.OooOO0(j, obj);
                    if (objOooOO1 != null) {
                        iHashCode = objOooOO1.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i = i3 * 53;
                    i3 = i + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                    i3 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                    i3 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) o0oo0000.OooOO0(j, obj)).doubleValue());
                        Charset charset7 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 52:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) o0oo0000.OooOO0(j, obj)).floatValue());
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Oooo0O0(j, obj);
                        Charset charset8 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 54:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Oooo0O0(j, obj);
                        Charset charset9 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 55:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Oooo0O0(j, obj);
                        Charset charset10 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 57:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzlj.zza(((Boolean) o0oo0000.OooOO0(j, obj)).booleanValue());
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 59:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = ((String) o0oo0000.OooOO0(j, obj)).hashCode();
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Oooo0O0(j, obj);
                        Charset charset11 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 66:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = OooOooO(j, obj);
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (OooOo(i5, i4, obj)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Oooo0O0(j, obj);
                        Charset charset12 = zzlj.f15753OooO00o;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iHashCode;
                    }
                    break;
                case 68:
                    if (OooOo(i5, i4, obj)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = o0oo0000.OooOO0(j, obj).hashCode();
                        i3 = iFloatToIntBits + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f15635OooOO0o.OooO0Oo(obj).hashCode() + (i3 * 53);
        if (!this.f15629OooO0o) {
            return iHashCode2;
        }
        this.f15636OooOOO0.OooO00o(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x00a6. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0Oo(Object obj, byte[] bArr, int i, int i2, o00OOOO0 o00oooo1) throws IOException {
        int i3;
        int iOooOO0;
        int iOooo00o;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        Object obj2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iOooO00o;
        oo0OOoo<T> oo0oooo = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        o00OOOO0 o00oooo2 = o00oooo1;
        if (!oo0oooo.f15631OooO0oO) {
            OooOoO(obj, bArr, i, i2, 0, o00oooo1);
            return;
        }
        OooOOO(obj);
        Unsafe unsafe2 = f15623OooOOOO;
        int i20 = 0;
        int i21 = -1;
        int iOooO0oo = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (iOooO0oo < i2) {
            int i26 = iOooO0oo + 1;
            byte b = bArr2[iOooO0oo];
            if (b < 0) {
                iOooOO0 = o00OOOOo.OooOO0(b, bArr2, i26, o00oooo2);
                i3 = o00oooo2.f15505OooO00o;
            } else {
                i3 = b;
                iOooOO0 = i26;
            }
            int i27 = i3 >>> 3;
            int i28 = oo0oooo.f15628OooO0Oo;
            int i29 = oo0oooo.f15627OooO0OO;
            if (i27 > i22) {
                int i30 = i23 / 3;
                if (i27 < i29 || i27 > i28) {
                    iOooo00o = i21;
                } else {
                    iOooo00o = oo0oooo.Oooo00o(i27, i30);
                }
            } else if (i27 < i29 || i27 > i28) {
                iOooo00o = i21;
            } else {
                iOooo00o = oo0oooo.Oooo00o(i27, i20);
            }
            int i31 = iOooo00o;
            if (i31 == i21) {
                i4 = i27;
                i5 = iOooOO0;
                i6 = i25;
                i7 = i21;
                unsafe = unsafe2;
                i8 = i20;
                obj2 = obj3;
            } else {
                int i32 = i3 & 7;
                int[] iArr = oo0oooo.f15625OooO00o;
                int i33 = iArr[i31 + 1];
                int i34 = (i33 >>> 20) & 255;
                i4 = i27;
                int i35 = iOooOO0;
                long j = i33 & 1048575;
                if (i34 <= 17) {
                    int i36 = iArr[i31 + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    if (i38 != i25) {
                        if (i25 != 1048575) {
                            unsafe2.putInt(obj3, i25, i24);
                        }
                        if (i38 != 1048575) {
                            i24 = unsafe2.getInt(obj3, i38);
                        }
                        i14 = i24;
                        i15 = i38;
                    } else {
                        j = j;
                        i14 = i24;
                        i15 = i25;
                    }
                    switch (i34) {
                        case 0:
                            i16 = i35;
                            i17 = i15;
                            long j2 = j;
                            if (i32 != 1) {
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                o0oo0000.OooOOO(obj3, j2, Double.longBitsToDouble(o00OOOOo.OooOOOO(i16, bArr2)));
                                i18 = i16 + 8;
                                iOooO0oo = i18;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 1:
                            i16 = i35;
                            i17 = i15;
                            long j3 = j;
                            if (i32 != 5) {
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                o0oo0000.OooOOOO(obj3, j3, Float.intBitsToFloat(o00OOOOo.OooO0O0(i16, bArr2)));
                                i18 = i16 + 4;
                                iOooO0oo = i18;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i16 = i35;
                            i17 = i15;
                            long j4 = j;
                            if (i32 != 0) {
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                int iOooOO0o = o00OOOOo.OooOO0o(bArr2, i16, o00oooo2);
                                unsafe2.putLong(obj, j4, o00oooo2.f15506OooO0O0);
                                i24 = i14 | i37;
                                i25 = i17;
                                iOooO0oo = iOooOO0o;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 4:
                        case 11:
                            i16 = i35;
                            i17 = i15;
                            long j5 = j;
                            if (i32 != 0) {
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO0oo = o00OOOOo.OooO(bArr2, i16, o00oooo2);
                                unsafe2.putInt(obj3, j5, o00oooo2.f15505OooO00o);
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i19 = i35;
                            i17 = i15;
                            long j6 = j;
                            if (i32 != 1) {
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                i16 = i19;
                                unsafe2.putLong(obj, j6, o00OOOOo.OooOOOO(i19, bArr2));
                                i18 = i16 + 8;
                                iOooO0oo = i18;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i19 = i35;
                            i17 = i15;
                            long j7 = j;
                            if (i32 != 5) {
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                unsafe2.putInt(obj3, j7, o00OOOOo.OooO0O0(i19, bArr2));
                                i18 = i19 + 4;
                                iOooO0oo = i18;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 7:
                            i19 = i35;
                            i17 = i15;
                            long j8 = j;
                            if (i32 != 0) {
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO0oo = o00OOOOo.OooOO0o(bArr2, i19, o00oooo2);
                                o0oo0000.OooOOO0(obj3, j8, o00oooo2.f15506OooO0O0 != 0);
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 8:
                            i19 = i35;
                            i17 = i15;
                            long j9 = j;
                            if (i32 != 2) {
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO0oo = (i33 & 536870912) == 0 ? o00OOOOo.OooO0o(bArr2, i19, o00oooo2) : o00OOOOo.OooO0oO(bArr2, i19, o00oooo2);
                                unsafe2.putObject(obj3, j9, o00oooo2.f15507OooO0OO);
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 9:
                            i19 = i35;
                            if (i32 != 2) {
                                i17 = i15;
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                Object objOooOO0O = oo0oooo.OooOO0O(i31, obj3);
                                iOooO0oo = o00OOOOo.OooOOO(objOooOO0O, oo0oooo.OooO(i31), bArr, i19, i2, o00oooo1);
                                oo0oooo.OooOOoo(i31, obj3, objOooOO0O);
                                i17 = i15;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 10:
                            i19 = i35;
                            long j10 = j;
                            if (i32 != 2) {
                                i17 = i15;
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO00o = o00OOOOo.OooO00o(bArr2, i19, o00oooo2);
                                unsafe2.putObject(obj3, j10, o00oooo2.f15507OooO0OO);
                                iOooO0oo = iOooO00o;
                                i17 = i15;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 12:
                            i19 = i35;
                            long j11 = j;
                            if (i32 != 0) {
                                i17 = i15;
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO00o = o00OOOOo.OooO(bArr2, i19, o00oooo2);
                                unsafe2.putInt(obj3, j11, o00oooo2.f15505OooO00o);
                                iOooO0oo = iOooO00o;
                                i17 = i15;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 15:
                            i19 = i35;
                            if (i32 != 0) {
                                i17 = i15;
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                iOooO0oo = o00OOOOo.OooO(bArr2, i19, o00oooo2);
                                unsafe2.putInt(obj3, j, zzke.zzb(o00oooo2.f15505OooO00o));
                                i17 = i15;
                                i24 = i14 | i37;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        case 16:
                            if (i32 != 0) {
                                i19 = i35;
                                i17 = i15;
                                i16 = i19;
                                i6 = i17;
                                i5 = i16;
                                i20 = i31;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i24 = i14;
                                i7 = -1;
                                i8 = 0;
                            } else {
                                int iOooOO0o2 = o00OOOOo.OooOO0o(bArr2, i35, o00oooo2);
                                unsafe2.putLong(obj, j, zzke.zzc(o00oooo2.f15506OooO0O0));
                                i17 = i15;
                                i24 = i14 | i37;
                                iOooO0oo = iOooOO0o2;
                                i25 = i17;
                                i23 = i31;
                                i22 = i4;
                                i21 = -1;
                                i20 = 0;
                            }
                            break;
                        default:
                            i16 = i35;
                            i17 = i15;
                            i6 = i17;
                            i5 = i16;
                            i20 = i31;
                            unsafe = unsafe2;
                            obj2 = obj3;
                            i24 = i14;
                            i7 = -1;
                            i8 = 0;
                            break;
                    }
                } else {
                    int i39 = i25;
                    int i40 = i24;
                    if (i34 == 27) {
                        if (i32 == 2) {
                            zzli zzliVarZzd = (zzli) unsafe2.getObject(obj3, j);
                            if (!zzliVarZzd.zzc()) {
                                int size = zzliVarZzd.size();
                                zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzliVarZzd);
                            }
                            iOooO0oo = o00OOOOo.OooO0Oo(oo0oooo.OooO(i31), i3, bArr, i35, i2, zzliVarZzd, o00oooo1);
                            i25 = i39;
                            i24 = i40;
                            i23 = i31;
                            i22 = i4;
                            i21 = -1;
                            i20 = 0;
                        } else {
                            i9 = i35;
                            i10 = i31;
                            unsafe = unsafe2;
                            i11 = i40;
                            i6 = i39;
                            i7 = -1;
                            i8 = 0;
                        }
                    } else if (i34 <= 49) {
                        i6 = i39;
                        i7 = -1;
                        unsafe = unsafe2;
                        i11 = i40;
                        i8 = 0;
                        iOooO0oo = Oooo00O(obj, bArr, i35, i2, i3, i4, i32, i31, i33, i34, j, o00oooo1);
                        if (iOooO0oo != i35) {
                            obj2 = obj;
                            i12 = i31;
                            i23 = i12;
                            i25 = i6;
                            i24 = i11;
                            bArr2 = bArr;
                            o00oooo2 = o00oooo1;
                            obj3 = obj2;
                            i21 = i7;
                            i20 = i8;
                            i22 = i4;
                            unsafe2 = unsafe;
                            oo0oooo = this;
                        } else {
                            obj2 = obj;
                            i13 = iOooO0oo;
                            i12 = i31;
                            i5 = i13;
                            i20 = i12;
                            i24 = i11;
                        }
                    } else {
                        i6 = i39;
                        i9 = i35;
                        i10 = i31;
                        unsafe = unsafe2;
                        i11 = i40;
                        i7 = -1;
                        i8 = 0;
                        if (i34 != 50) {
                            obj2 = obj;
                            i12 = i10;
                            iOooO0oo = Oooo000(obj, bArr, i9, i2, i3, i4, i32, i33, i34, j, i10, o00oooo1);
                            if (iOooO0oo != i9) {
                                i23 = i12;
                                i25 = i6;
                                i24 = i11;
                            } else {
                                i13 = iOooO0oo;
                            }
                            bArr2 = bArr;
                            o00oooo2 = o00oooo1;
                            obj3 = obj2;
                            i21 = i7;
                            i20 = i8;
                            i22 = i4;
                            unsafe2 = unsafe;
                            oo0oooo = this;
                        } else if (i32 == 2) {
                            OooOooo(obj, i10, j);
                            throw null;
                        }
                        i5 = i13;
                        i20 = i12;
                        i24 = i11;
                    }
                    i13 = i9;
                    i12 = i10;
                    obj2 = obj;
                    i5 = i13;
                    i20 = i12;
                    i24 = i11;
                }
            }
            iOooO0oo = o00OOOOo.OooO0oo(i3, bArr, i5, i2, OooOoOO(obj), o00oooo1);
            i23 = i20;
            i25 = i6;
            bArr2 = bArr;
            o00oooo2 = o00oooo1;
            obj3 = obj2;
            i21 = i7;
            i20 = i8;
            i22 = i4;
            unsafe2 = unsafe;
            oo0oooo = this;
        }
        int i41 = i24;
        Unsafe unsafe3 = unsafe2;
        Object obj4 = obj3;
        if (i25 != 1048575) {
            unsafe3.putInt(obj4, i25, i41);
        }
        if (iOooO0oo != i2) {
            throw zzll.OooO0OO();
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0o(Object obj, Object obj2) {
        OooOOO(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f15625OooO00o;
            if (i >= iArr.length) {
                Class cls = oo0oO0.f15639OooO00o;
                o0OOO00 o0ooo00 = this.f15635OooOO0o;
                o0ooo00.OooO0oo(obj, o0ooo00.OooO0o0(o0ooo00.OooO0Oo(obj), o0ooo00.OooO0Oo(obj2)));
                if (this.f15629OooO0o) {
                    this.f15636OooOOO0.OooO00o(obj2);
                    throw null;
                }
                return;
            }
            int iOooo0 = Oooo0(i);
            int i2 = iArr[i];
            long j = 1048575 & iOooo0;
            switch ((iOooo0 >>> 20) & 255) {
                case 0:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOO(obj, j, o0oo0000.OooO0o0(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 1:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOO(obj, j, o0oo0000.OooO0o(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 2:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo0(obj, j, o0oo0000.OooO0oo(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 3:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo0(obj, j, o0oo0000.OooO0oo(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 4:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 5:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo0(obj, j, o0oo0000.OooO0oo(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 6:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 7:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOO0(obj, j, o0oo0000.OooOo0O(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 8:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo(j, obj, o0oo0000.OooOO0(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 9:
                    OooOOOO(i, obj, obj2);
                    break;
                case 10:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo(j, obj, o0oo0000.OooOO0(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 11:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 12:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 13:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 14:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo0(obj, j, o0oo0000.OooO0oo(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 15:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOOo(o0oo0000.OooO0oO(j, obj2), j, obj);
                        OooOOo0(i, obj);
                    }
                    break;
                case 16:
                    if (OooOo0O(i, obj2)) {
                        o0oo0000.OooOOo0(obj, j, o0oo0000.OooO0oo(j, obj2));
                        OooOOo0(i, obj);
                    }
                    break;
                case 17:
                    OooOOOO(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f15634OooOO0O.OooO0O0(j, obj, obj2);
                    break;
                case 50:
                    Class cls2 = oo0oO0.f15639OooO00o;
                    o0oo0000.OooOOo(j, obj, o0O0O0Oo.OooO0O0(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (OooOo(i2, i, obj2)) {
                        o0oo0000.OooOOo(j, obj, o0oo0000.OooOO0(j, obj2));
                        OooOOo(i2, i, obj);
                    }
                    break;
                case 60:
                    OooOOOo(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (OooOo(i2, i, obj2)) {
                        o0oo0000.OooOOo(j, obj, o0oo0000.OooOO0(j, obj2));
                        OooOOo(i2, i, obj);
                    }
                    break;
                case 68:
                    OooOOOo(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final int OooO0o0(Object obj) {
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iOooo00o;
        int iZzx7;
        int iZzx8;
        int iZzx9;
        int iZzx10;
        if (!this.f15631OooO0oO) {
            return OooOoo(obj);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f15625OooO00o;
            if (i >= iArr.length) {
                o0OOO00 o0ooo00 = this.f15635OooOO0o;
                return o0ooo00.OooO00o(o0ooo00.OooO0Oo(obj)) + i2;
            }
            int iOooo0 = Oooo0(i);
            int i3 = (iOooo0 >>> 20) & 255;
            int i4 = iArr[i];
            int i5 = iOooo0 & 1048575;
            if (i3 >= zzkt.zzJ.zza() && i3 <= zzkt.zzW.zza()) {
                int i6 = iArr[i + 2];
            }
            long j = i5;
            Unsafe unsafe = f15623OooOOOO;
            switch (i3) {
                case 0:
                    if (OooOo0O(i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 1:
                    if (OooOo0O(i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 2:
                    if (OooOo0O(i, obj)) {
                        iZzy = zzki.zzy(o0oo0000.OooO0oo(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 3:
                    if (OooOo0O(i, obj)) {
                        iZzy = zzki.zzy(o0oo0000.OooO0oo(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 4:
                    if (OooOo0O(i, obj)) {
                        iZzy = zzki.zzu(o0oo0000.OooO0oO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 5:
                    if (OooOo0O(i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 6:
                    if (OooOo0O(i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 7:
                    if (OooOo0O(i, obj)) {
                        iZzx4 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx4 + 1;
                        i2 += iOooo00o;
                    }
                    break;
                case 8:
                    if (OooOo0O(i, obj)) {
                        Object objOooOO0 = o0oo0000.OooOO0(j, obj);
                        if (!(objOooOO0 instanceof zzka)) {
                            iZzy = zzki.zzw((String) objOooOO0);
                            iZzx3 = zzki.zzx(i4 << 3);
                            i2 = iZzx3 + iZzy + i2;
                        } else {
                            Logger logger = zzki.f15744OooO0O0;
                            int iZzd = ((zzka) objOooOO0).zzd();
                            iZzx5 = zzki.zzx(iZzd) + iZzd;
                            iZzx6 = zzki.zzx(i4 << 3);
                            iOooo00o = iZzx6 + iZzx5;
                            i2 += iOooo00o;
                        }
                    }
                    break;
                case 9:
                    if (OooOo0O(i, obj)) {
                        iOooo00o = oo0oO0.Oooo00o(i4, OooO(i), o0oo0000.OooOO0(j, obj));
                        i2 += iOooo00o;
                    }
                    break;
                case 10:
                    if (OooOo0O(i, obj)) {
                        zzka zzkaVar = (zzka) o0oo0000.OooOO0(j, obj);
                        Logger logger2 = zzki.f15744OooO0O0;
                        int iZzd2 = zzkaVar.zzd();
                        iZzx5 = zzki.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx6 + iZzx5;
                        i2 += iOooo00o;
                    }
                    break;
                case 11:
                    if (OooOo0O(i, obj)) {
                        iZzy = zzki.zzx(o0oo0000.OooO0oO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 12:
                    if (OooOo0O(i, obj)) {
                        iZzy = zzki.zzu(o0oo0000.OooO0oO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 13:
                    if (OooOo0O(i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 14:
                    if (OooOo0O(i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 15:
                    if (OooOo0O(i, obj)) {
                        int iOooO0oO = o0oo0000.OooO0oO(j, obj);
                        iZzx7 = zzki.zzx(i4 << 3);
                        iZzx8 = zzki.zzx((iOooO0oO >> 31) ^ (iOooO0oO + iOooO0oO));
                        iOooo00o = iZzx8 + iZzx7;
                        i2 += iOooo00o;
                    }
                    break;
                case 16:
                    if (OooOo0O(i, obj)) {
                        long jOooO0oo = o0oo0000.OooO0oo(j, obj);
                        iZzx5 = zzki.zzx(i4 << 3);
                        iZzx6 = zzki.zzy((jOooO0oo >> 63) ^ (jOooO0oo + jOooO0oo));
                        iOooo00o = iZzx6 + iZzx5;
                        i2 += iOooo00o;
                    }
                    break;
                case 17:
                    if (OooOo0O(i, obj)) {
                        iOooo00o = zzki.OooO00o(i4, (zzmi) o0oo0000.OooOO0(j, obj), OooO(i));
                        i2 += iOooo00o;
                    }
                    break;
                case 18:
                    iOooo00o = oo0oO0.OooOoOO(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 19:
                    iOooo00o = oo0oO0.OooOoO0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 20:
                    iOooo00o = oo0oO0.Oooo000(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 21:
                    iOooo00o = oo0oO0.OoooO00(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 22:
                    iOooo00o = oo0oO0.OooOooO(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 23:
                    iOooo00o = oo0oO0.OooOoOO(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 24:
                    iOooo00o = oo0oO0.OooOoO0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 25:
                    iOooo00o = oo0oO0.OooOo0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 26:
                    iOooo00o = oo0oO0.Oooo0oO(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 27:
                    iOooo00o = oo0oO0.Oooo0(i4, (List) o0oo0000.OooOO0(j, obj), OooO(i));
                    i2 += iOooo00o;
                    break;
                case 28:
                    iOooo00o = oo0oO0.OooOo0O(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 29:
                    iOooo00o = oo0oO0.Oooo0oo(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 30:
                    iOooo00o = oo0oO0.OooOo0o(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 31:
                    iOooo00o = oo0oO0.OooOoO0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 32:
                    iOooo00o = oo0oO0.OooOoOO(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 33:
                    iOooo00o = oo0oO0.Oooo0O0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 34:
                    iOooo00o = oo0oO0.Oooo0o0(i4, (List) o0oo0000.OooOO0(j, obj));
                    i2 += iOooo00o;
                    break;
                case 35:
                    iZzy = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 36:
                    iZzy = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 37:
                    iZzy = oo0oO0.Oooo00O((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 38:
                    iZzy = oo0oO0.OoooO0((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 39:
                    iZzy = oo0oO0.OooOooo((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 40:
                    iZzy = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 41:
                    iZzy = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = oo0oO0.f15639OooO00o;
                    iZzy = list.size();
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 43:
                    iZzy = oo0oO0.Oooo((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 44:
                    iZzy = oo0oO0.OooOo((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 45:
                    iZzy = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 46:
                    iZzy = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 47:
                    iZzy = oo0oO0.Oooo0OO((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 48:
                    iZzy = oo0oO0.Oooo0o((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx9 = zzki.zzx(iZzy);
                        iZzx10 = zzki.zzx(i4 << 3);
                        iZzx3 = iZzx10 + iZzx9;
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 49:
                    iOooo00o = oo0oO0.OooOoo(i4, (List) o0oo0000.OooOO0(j, obj), OooO(i));
                    i2 += iOooo00o;
                    break;
                case 50:
                    o0O0O0Oo.OooO00o(o0oo0000.OooOO0(j, obj), OooOO0(i));
                    break;
                case 51:
                    if (OooOo(i4, i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 52:
                    if (OooOo(i4, i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 53:
                    if (OooOo(i4, i, obj)) {
                        iZzy = zzki.zzy(Oooo0O0(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 54:
                    if (OooOo(i4, i, obj)) {
                        iZzy = zzki.zzy(Oooo0O0(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 55:
                    if (OooOo(i4, i, obj)) {
                        iZzy = zzki.zzu(OooOooO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 56:
                    if (OooOo(i4, i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 57:
                    if (OooOo(i4, i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 58:
                    if (OooOo(i4, i, obj)) {
                        iZzx4 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx4 + 1;
                        i2 += iOooo00o;
                    }
                    break;
                case 59:
                    if (OooOo(i4, i, obj)) {
                        Object objOooOO1 = o0oo0000.OooOO0(j, obj);
                        if (!(objOooOO1 instanceof zzka)) {
                            iZzy = zzki.zzw((String) objOooOO1);
                            iZzx3 = zzki.zzx(i4 << 3);
                            i2 = iZzx3 + iZzy + i2;
                        } else {
                            Logger logger3 = zzki.f15744OooO0O0;
                            int iZzd3 = ((zzka) objOooOO1).zzd();
                            iZzx5 = zzki.zzx(iZzd3) + iZzd3;
                            iZzx6 = zzki.zzx(i4 << 3);
                            iOooo00o = iZzx6 + iZzx5;
                            i2 += iOooo00o;
                        }
                    }
                    break;
                case 60:
                    if (OooOo(i4, i, obj)) {
                        iOooo00o = oo0oO0.Oooo00o(i4, OooO(i), o0oo0000.OooOO0(j, obj));
                        i2 += iOooo00o;
                    }
                    break;
                case 61:
                    if (OooOo(i4, i, obj)) {
                        zzka zzkaVar2 = (zzka) o0oo0000.OooOO0(j, obj);
                        Logger logger4 = zzki.f15744OooO0O0;
                        int iZzd4 = zzkaVar2.zzd();
                        iZzx5 = zzki.zzx(iZzd4) + iZzd4;
                        iZzx6 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx6 + iZzx5;
                        i2 += iOooo00o;
                    }
                    break;
                case 62:
                    if (OooOo(i4, i, obj)) {
                        iZzy = zzki.zzx(OooOooO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 63:
                    if (OooOo(i4, i, obj)) {
                        iZzy = zzki.zzu(OooOooO(j, obj));
                        iZzx3 = zzki.zzx(i4 << 3);
                        i2 = iZzx3 + iZzy + i2;
                    }
                    break;
                case 64:
                    if (OooOo(i4, i, obj)) {
                        iZzx2 = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx2 + 4;
                        i2 += iOooo00o;
                    }
                    break;
                case 65:
                    if (OooOo(i4, i, obj)) {
                        iZzx = zzki.zzx(i4 << 3);
                        iOooo00o = iZzx + 8;
                        i2 += iOooo00o;
                    }
                    break;
                case 66:
                    if (OooOo(i4, i, obj)) {
                        int iOooOooO = OooOooO(j, obj);
                        iZzx7 = zzki.zzx(i4 << 3);
                        iZzx8 = zzki.zzx((iOooOooO >> 31) ^ (iOooOooO + iOooOooO));
                        iOooo00o = iZzx8 + iZzx7;
                        i2 += iOooo00o;
                    }
                    break;
                case 67:
                    if (OooOo(i4, i, obj)) {
                        long jOooo0O0 = Oooo0O0(j, obj);
                        iZzx5 = zzki.zzx(i4 << 3);
                        iZzx6 = zzki.zzy((jOooo0O0 >> 63) ^ (jOooo0O0 + jOooo0O0));
                        iOooo00o = iZzx6 + iZzx5;
                        i2 += iOooo00o;
                    }
                    break;
                case 68:
                    if (OooOo(i4, i, obj)) {
                        iOooo00o = zzki.OooO00o(i4, (zzmi) o0oo0000.OooOO0(j, obj), OooO(i));
                        i2 += iOooo00o;
                    }
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final boolean OooO0oO(Object obj, Object obj2) {
        boolean zOooOo00;
        int[] iArr = this.f15625OooO00o;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iOooo0 = Oooo0(i);
            long j = iOooo0 & 1048575;
            switch ((iOooo0 >>> 20) & 255) {
                case 0:
                    if (!OooOo0(i, obj, obj2) || Double.doubleToLongBits(o0oo0000.OooO0o0(j, obj)) != Double.doubleToLongBits(o0oo0000.OooO0o0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!OooOo0(i, obj, obj2) || Float.floatToIntBits(o0oo0000.OooO0o(j, obj)) != Float.floatToIntBits(o0oo0000.OooO0o(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oo(j, obj) != o0oo0000.OooO0oo(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oo(j, obj) != o0oo0000.OooO0oo(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oo(j, obj) != o0oo0000.OooO0oo(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooOo0O(j, obj) != o0oo0000.OooOo0O(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!OooOo0(i, obj, obj2) || !oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!OooOo0(i, obj, obj2) || !oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!OooOo0(i, obj, obj2) || !oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oo(j, obj) != o0oo0000.OooO0oo(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oO(j, obj) != o0oo0000.OooO0oO(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!OooOo0(i, obj, obj2) || o0oo0000.OooO0oo(j, obj) != o0oo0000.OooO0oo(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!OooOo0(i, obj, obj2) || !oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zOooOo00 = oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2));
                    break;
                case 50:
                    zOooOo00 = oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (o0oo0000.OooO0oO(j2, obj) != o0oo0000.OooO0oO(j2, obj2) || !oo0oO0.OooOo00(o0oo0000.OooOO0(j, obj), o0oo0000.OooOO0(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zOooOo00) {
                return false;
            }
        }
        o0OOO00 o0ooo00 = this.f15635OooOO0o;
        if (!o0ooo00.OooO0Oo(obj).equals(o0ooo00.OooO0Oo(obj2))) {
            return false;
        }
        if (!this.f15629OooO0o) {
            return true;
        }
        o0O000O o0o000o = this.f15636OooOOO0;
        o0o000o.OooO00o(obj);
        o0o000o.OooO00o(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc A[LOOP:1: B:49:0x00ab->B:54:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final boolean OooO0oo(Object obj) {
        List list;
        o0OO000o o0oo000oOooO;
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        while (true) {
            boolean zOooOo0O = true;
            if (i2 >= this.f15624OooO) {
                if (!this.f15629OooO0o) {
                    return true;
                }
                this.f15636OooOOO0.OooO00o(obj);
                throw null;
            }
            int i5 = this.f15632OooO0oo[i2];
            int[] iArr = this.f15625OooO00o;
            int i6 = iArr[i5];
            int iOooo0 = Oooo0(i5);
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i4) {
                if (i8 != 1048575) {
                    i3 = f15623OooOOOO.getInt(obj, i8);
                }
                i4 = i8;
            }
            if ((268435456 & iOooo0) != 0) {
                if (!(i4 == 1048575 ? OooOo0O(i5, obj) : (i3 & i9) != 0)) {
                    return false;
                }
            }
            int i10 = (iOooo0 >>> 20) & 255;
            if (i10 == 9 || i10 == 17) {
                if (i4 == 1048575) {
                    zOooOo0O = OooOo0O(i5, obj);
                } else if ((i3 & i9) == 0) {
                    zOooOo0O = false;
                }
                if (zOooOo0O && !OooO(i5).OooO0oo(o0oo0000.OooOO0(iOooo0 & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    o0oo000oOooO = OooO(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!o0oo000oOooO.OooO0oo(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i10 == 60 || i10 == 68) {
                if (OooOo(i6, i5, obj) && !OooO(i5).OooO0oo(o0oo0000.OooOO0(iOooo0 & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) o0oo0000.OooOO0(iOooo0 & 1048575, obj);
                if (list.isEmpty()) {
                    o0oo000oOooO = OooO(i5);
                    while (i < list.size()) {
                        if (!o0oo000oOooO.OooO0oo(list.get(i))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i10 == 50 && !((zzmc) o0oo0000.OooOO0(iOooo0 & 1048575, obj)).isEmpty()) {
                throw null;
            }
            i2++;
        }
    }

    public final Object OooOO0(int i) {
        int i2 = i / 3;
        return this.f15626OooO0O0[i2 + i2];
    }

    public final Object OooOO0O(int i, Object obj) {
        o0OO000o o0oo000oOooO = OooO(i);
        int iOooo0 = Oooo0(i) & 1048575;
        if (!OooOo0O(i, obj)) {
            return o0oo000oOooO.zze();
        }
        Object object = f15623OooOOOO.getObject(obj, iOooo0);
        if (OooOo0o(object)) {
            return object;
        }
        Object objZze = o0oo000oOooO.zze();
        if (object != null) {
            o0oo000oOooO.OooO0o(objZze, object);
        }
        return objZze;
    }

    public final Object OooOO0o(int i, int i2, Object obj) {
        o0OO000o o0oo000oOooO = OooO(i2);
        if (!OooOo(i, i2, obj)) {
            return o0oo000oOooO.zze();
        }
        Object object = f15623OooOOOO.getObject(obj, Oooo0(i2) & 1048575);
        if (OooOo0o(object)) {
            return object;
        }
        Object objZze = o0oo000oOooO.zze();
        if (object != null) {
            o0oo000oOooO.OooO0o(objZze, object);
        }
        return objZze;
    }

    public final void OooOOOO(int i, Object obj, Object obj2) {
        if (OooOo0O(i, obj2)) {
            long jOooo0 = Oooo0(i) & 1048575;
            Unsafe unsafe = f15623OooOOOO;
            Object object = unsafe.getObject(obj2, jOooo0);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f15625OooO00o[i] + " is present but null: " + obj2.toString());
            }
            o0OO000o o0oo000oOooO = OooO(i);
            if (!OooOo0O(i, obj)) {
                if (OooOo0o(object)) {
                    Object objZze = o0oo000oOooO.zze();
                    o0oo000oOooO.OooO0o(objZze, object);
                    unsafe.putObject(obj, jOooo0, objZze);
                } else {
                    unsafe.putObject(obj, jOooo0, object);
                }
                OooOOo0(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOooo0);
            if (!OooOo0o(object2)) {
                Object objZze2 = o0oo000oOooO.zze();
                o0oo000oOooO.OooO0o(objZze2, object2);
                unsafe.putObject(obj, jOooo0, objZze2);
                object2 = objZze2;
            }
            o0oo000oOooO.OooO0o(object2, object);
        }
    }

    public final void OooOOOo(int i, Object obj, Object obj2) {
        int[] iArr = this.f15625OooO00o;
        int i2 = iArr[i];
        if (OooOo(i2, i, obj2)) {
            long jOooo0 = Oooo0(i) & 1048575;
            Unsafe unsafe = f15623OooOOOO;
            Object object = unsafe.getObject(obj2, jOooo0);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            o0OO000o o0oo000oOooO = OooO(i);
            if (!OooOo(i2, i, obj)) {
                if (OooOo0o(object)) {
                    Object objZze = o0oo000oOooO.zze();
                    o0oo000oOooO.OooO0o(objZze, object);
                    unsafe.putObject(obj, jOooo0, objZze);
                } else {
                    unsafe.putObject(obj, jOooo0, object);
                }
                OooOOo(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOooo0);
            if (!OooOo0o(object2)) {
                Object objZze2 = o0oo000oOooO.zze();
                o0oo000oOooO.OooO0o(objZze2, object2);
                unsafe.putObject(obj, jOooo0, objZze2);
                object2 = objZze2;
            }
            o0oo000oOooO.OooO0o(object2, object);
        }
    }

    public final void OooOOo(int i, int i2, Object obj) {
        o0oo0000.OooOOOo(i, this.f15625OooO00o[i2 + 2] & 1048575, obj);
    }

    public final void OooOOo0(int i, Object obj) {
        int i2 = this.f15625OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        o0oo0000.OooOOOo((1 << (i2 >>> 20)) | o0oo0000.OooO0oO(j, obj), j, obj);
    }

    public final void OooOOoo(int i, Object obj, Object obj2) {
        f15623OooOOOO.putObject(obj, Oooo0(i) & 1048575, obj2);
        OooOOo0(i, obj);
    }

    public final boolean OooOo(int i, int i2, Object obj) {
        return o0oo0000.OooO0oO((long) (this.f15625OooO00o[i2 + 2] & 1048575), obj) == i;
    }

    public final boolean OooOo0(int i, Object obj, Object obj2) {
        return OooOo0O(i, obj) == OooOo0O(i, obj2);
    }

    public final void OooOo00(int i, Object obj, int i2, Object obj2) {
        f15623OooOOOO.putObject(obj, Oooo0(i2) & 1048575, obj2);
        OooOOo(i, i2, obj);
    }

    public final boolean OooOo0O(int i, Object obj) {
        int i2 = this.f15625OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & o0oo0000.OooO0oO(j, obj)) != 0;
        }
        int iOooo0 = Oooo0(i);
        long j2 = iOooo0 & 1048575;
        switch ((iOooo0 >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(o0oo0000.OooO0o0(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0oo0000.OooO0o(j2, obj)) != 0;
            case 2:
                return o0oo0000.OooO0oo(j2, obj) != 0;
            case 3:
                return o0oo0000.OooO0oo(j2, obj) != 0;
            case 4:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 5:
                return o0oo0000.OooO0oo(j2, obj) != 0;
            case 6:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 7:
                return o0oo0000.OooOo0O(j2, obj);
            case 8:
                Object objOooOO0 = o0oo0000.OooOO0(j2, obj);
                if (objOooOO0 instanceof String) {
                    return !((String) objOooOO0).isEmpty();
                }
                if (objOooOO0 instanceof zzka) {
                    return !zzka.zzb.equals(objOooOO0);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0oo0000.OooOO0(j2, obj) != null;
            case 10:
                return !zzka.zzb.equals(o0oo0000.OooOO0(j2, obj));
            case 11:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 12:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 13:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 14:
                return o0oo0000.OooO0oo(j2, obj) != 0;
            case 15:
                return o0oo0000.OooO0oO(j2, obj) != 0;
            case 16:
                return o0oo0000.OooO0oo(j2, obj) != 0;
            case 17:
                return o0oo0000.OooOO0(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03f1 A[PHI: r0 r14 r19 r20 r26 r30
      0x03f1: PHI (r0v31 int) = (r0v29 int), (r0v34 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r14v11 com.google.android.gms.internal.measurement.oo0OOoo<T>) = 
      (r14v9 com.google.android.gms.internal.measurement.oo0OOoo<T>)
      (r14v14 com.google.android.gms.internal.measurement.oo0OOoo<T>)
     binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r19v1 int) = (r19v0 int), (r19v3 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r20v5 int) = (r20v4 int), (r20v7 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r26v2 int) = (r26v1 int), (r26v5 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r30v6 sun.misc.Unsafe) = (r30v5 sun.misc.Unsafe), (r30v8 sun.misc.Unsafe) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0403 A[PHI: r0 r14 r19 r20 r25 r26 r30
      0x0403: PHI (r0v32 int) = (r0v29 int), (r0v34 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r14v12 com.google.android.gms.internal.measurement.oo0OOoo<T>) = 
      (r14v9 com.google.android.gms.internal.measurement.oo0OOoo<T>)
      (r14v14 com.google.android.gms.internal.measurement.oo0OOoo<T>)
     binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r19v2 int) = (r19v0 int), (r19v3 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r20v6 int) = (r20v4 int), (r20v7 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r25v5 int[]) = (r25v4 int[]), (r25v7 int[]) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r26v3 int) = (r26v1 int), (r26v5 int) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r30v7 sun.misc.Unsafe) = (r30v5 sun.misc.Unsafe), (r30v8 sun.misc.Unsafe) binds: [B:126:0x03ef, B:116:0x0391] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int OooOoO(Object obj, byte[] bArr, int i, int i2, int i3, o00OOOO0 o00oooo1) throws IOException {
        Object[] objArr;
        int[] iArr;
        Unsafe unsafe;
        Object obj2;
        oo0OOoo<T> oo0oooo;
        int i4;
        int iOooo00o;
        int iOooo00o2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        o00OOOO0 o00oooo2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z;
        byte b;
        int iOooOO0o;
        int i22;
        oo0OOoo<T> oo0oooo2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        o00OOOO0 o00oooo3 = o00oooo1;
        OooOOO(obj);
        Unsafe unsafe2 = f15623OooOOOO;
        int iOooO0oo = i;
        int i23 = i3;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        int i28 = 0;
        while (true) {
            Object[] objArr2 = oo0oooo2.f15626OooO0O0;
            int[] iArr2 = oo0oooo2.f15625OooO00o;
            if (iOooO0oo < i2) {
                int iOooOO0 = iOooO0oo + 1;
                int i29 = bArr2[iOooO0oo];
                if (i29 < 0) {
                    iOooOO0 = o00OOOOo.OooOO0(i29, bArr2, iOooOO0, o00oooo3);
                    i29 = o00oooo3.f15505OooO00o;
                }
                int i30 = i29 >>> 3;
                int i31 = i23;
                int i32 = oo0oooo2.f15628OooO0Oo;
                int i33 = oo0oooo2.f15627OooO0OO;
                objArr = objArr2;
                if (i30 > i24) {
                    iOooo00o2 = (i30 < i33 || i30 > i32) ? -1 : oo0oooo2.Oooo00o(i30, i25 / 3);
                    i5 = -1;
                    i4 = 0;
                } else {
                    if (i30 < i33 || i30 > i32) {
                        i4 = 0;
                        iOooo00o = -1;
                    } else {
                        i4 = 0;
                        iOooo00o = oo0oooo2.Oooo00o(i30, 0);
                    }
                    iOooo00o2 = iOooo00o;
                    i5 = -1;
                }
                if (iOooo00o2 == i5) {
                    i6 = i29;
                    i7 = iOooOO0;
                    i8 = i27;
                    i9 = i28;
                    iArr = iArr2;
                    unsafe = unsafe2;
                    oo0oooo = oo0oooo2;
                    i10 = i31;
                    i11 = i30;
                    i12 = i4;
                } else {
                    int i34 = i29 & 7;
                    int i35 = iArr2[iOooo00o2 + 1];
                    int i36 = (i35 >>> 20) & 255;
                    int i37 = i29;
                    long j = i35 & 1048575;
                    if (i36 <= 17) {
                        int i38 = iArr2[iOooo00o2 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i27) {
                            if (i27 != 1048575) {
                                unsafe2.putInt(obj3, i27, i28);
                            }
                            i28 = unsafe2.getInt(obj3, i40);
                            i20 = i40;
                        } else {
                            i20 = i27;
                        }
                        int i41 = i28;
                        switch (i36) {
                            case 0:
                                i21 = iOooOO0;
                                i9 = i41;
                                z = true;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 1) {
                                    o0oo0000.OooOOO(obj3, j, Double.longBitsToDouble(o00OOOOo.OooOOOO(i21, bArr2)));
                                    iOooO0oo = i21 + 8;
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 1:
                                i21 = iOooOO0;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 5) {
                                    o0oo0000.OooOOOO(obj3, j, Float.intBitsToFloat(o00OOOOo.OooO0O0(i21, bArr2)));
                                    iOooO0oo = i21 + 4;
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 2:
                            case 3:
                                o00oooo1 = o00oooo1;
                                i21 = iOooOO0;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 0) {
                                    iOooOO0o = o00OOOOo.OooOO0o(bArr2, i21, o00oooo1);
                                    unsafe2.putLong(obj, j, o00oooo1.f15506OooO0O0);
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 4:
                            case 11:
                                o00oooo1 = o00oooo1;
                                i21 = iOooOO0;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 0) {
                                    iOooO0oo = o00OOOOo.OooO(bArr2, i21, o00oooo1);
                                    unsafe2.putInt(obj3, j, o00oooo1.f15505OooO00o);
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 5:
                            case 14:
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 1) {
                                    i21 = iOooOO0;
                                    unsafe2.putLong(obj, j, o00OOOOo.OooOOOO(iOooOO0, bArr2));
                                    iOooO0oo = i21 + 8;
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 6:
                            case 13:
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 5) {
                                    unsafe2.putInt(obj3, j, o00OOOOo.OooO0O0(iOooOO0, bArr2));
                                    i21 = iOooOO0;
                                    iOooO0oo = i21 + 4;
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 7:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 0) {
                                    iOooO0oo = o00OOOOo.OooOO0o(bArr2, iOooOO0, o00oooo1);
                                    o0oo0000.OooOOO0(obj3, j, o00oooo1.f15506OooO0O0 != 0);
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 8:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 2) {
                                    iOooO0oo = (536870912 & i35) == 0 ? o00OOOOo.OooO0o(bArr2, iOooOO0, o00oooo1) : o00OOOOo.OooO0oO(bArr2, iOooOO0, o00oooo1);
                                    unsafe2.putObject(obj3, j, o00oooo1.f15507OooO0OO);
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 9:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 2) {
                                    Object objOooOO0O = oo0oooo2.OooOO0O(i14, obj3);
                                    iOooO0oo = o00OOOOo.OooOOO(objOooOO0O, oo0oooo2.OooO(i14), bArr, iOooOO0, i2, o00oooo1);
                                    oo0oooo2.OooOOoo(i14, obj3, objOooOO0O);
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 10:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 2) {
                                    iOooO0oo = o00OOOOo.OooO00o(bArr2, iOooOO0, o00oooo1);
                                    unsafe2.putObject(obj3, j, o00oooo1.f15507OooO0OO);
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 12:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 0) {
                                    iOooO0oo = o00OOOOo.OooO(bArr2, iOooOO0, o00oooo1);
                                    int i42 = o00oooo1.f15505OooO00o;
                                    int i43 = i14 / 3;
                                    zzlf zzlfVar = (zzlf) objArr[i43 + i43 + 1];
                                    if (zzlfVar == null || zzlfVar.zza(i42)) {
                                        unsafe2.putInt(obj3, j, i42);
                                        iOooOO0o = iOooO0oo;
                                        i22 = i9 | i39;
                                        i9 = i22;
                                        iOooO0oo = iOooOO0o;
                                    } else {
                                        OooOoOO(obj).OooO0O0(i15 == true ? 1 : 0, Long.valueOf(i42));
                                    }
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 15:
                                o00oooo1 = o00oooo1;
                                i9 = i41;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 0) {
                                    iOooO0oo = o00OOOOo.OooO(bArr2, iOooOO0, o00oooo1);
                                    unsafe2.putInt(obj3, j, zzke.zzb(o00oooo1.f15505OooO00o));
                                    iOooOO0o = iOooO0oo;
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            case 16:
                                if (i34 == 0) {
                                    o00oooo1 = o00oooo1;
                                    iOooOO0o = o00OOOOo.OooOO0o(bArr2, iOooOO0, o00oooo1);
                                    long jZzc = zzke.zzc(o00oooo1.f15506OooO0O0);
                                    i8 = i20;
                                    i9 = i41;
                                    i14 = iOooo00o2;
                                    i15 = i37 == true ? 1 : 0;
                                    unsafe2.putLong(obj, j, jZzc);
                                    i22 = i9 | i39;
                                    i9 = i22;
                                    iOooO0oo = iOooOO0o;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i27 = i8;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                    i28 = i9;
                                } else {
                                    i9 = i41;
                                    b = -1;
                                    i14 = iOooo00o2;
                                    i8 = i20;
                                    i15 = i37 == true ? 1 : 0;
                                    i21 = iOooOO0;
                                    z = true;
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                            default:
                                i21 = iOooOO0;
                                i9 = i41;
                                z = true;
                                b = -1;
                                i14 = iOooo00o2;
                                i8 = i20;
                                i15 = i37 == true ? 1 : 0;
                                if (i34 == 3) {
                                    Object objOooOO0O2 = oo0oooo2.OooOO0O(i14, obj3);
                                    iOooO0oo = o00OOOOo.OooOOO0(objOooOO0O2, oo0oooo2.OooO(i14), bArr, i21, i2, (i30 << 3) | 4, o00oooo1);
                                    oo0oooo2.OooOOoo(i14, obj3, objOooOO0O2);
                                    i28 = i9 | i39;
                                    i27 = i8;
                                    i23 = i3;
                                    i26 = i15;
                                    i25 = i14;
                                    i24 = i30;
                                    o00oooo3 = o00oooo1;
                                } else {
                                    i10 = i3;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i12 = i14;
                                    i7 = i21;
                                    oo0oooo = oo0oooo2;
                                    iArr = iArr2;
                                    i11 = i30;
                                }
                                break;
                        }
                    } else {
                        i14 = iOooo00o2;
                        int i44 = iOooOO0;
                        i15 = i37 == true ? 1 : 0;
                        if (i36 != 27) {
                            i8 = i27;
                            i9 = i28;
                            if (i36 <= 49) {
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i17 = i15 == true ? 1 : 0;
                                i11 = i30;
                                iOooO0oo = Oooo00O(obj, bArr, i44, i2, i15 == true ? 1 : 0, i30, i34, i14, i35, i36, j, o00oooo1);
                                oo0oooo = this;
                                i19 = i14;
                                if (iOooO0oo != i44) {
                                    obj = obj;
                                    i23 = i3;
                                    o00oooo2 = o00oooo1;
                                    i27 = i8;
                                    i28 = i9;
                                    i6 = i17;
                                    i13 = i11;
                                    i25 = i19;
                                } else {
                                    i10 = i3;
                                    i7 = iOooO0oo;
                                    i6 = i17;
                                    i12 = i19;
                                }
                                bArr2 = bArr;
                                i26 = i6;
                                i24 = i13;
                                oo0oooo2 = oo0oooo;
                                unsafe2 = unsafe;
                                obj3 = obj;
                                o00oooo3 = o00oooo2;
                            } else {
                                i16 = i44;
                                unsafe = unsafe2;
                                i17 = i15 == true ? 1 : 0;
                                i18 = i14;
                                iArr = iArr2;
                                i11 = i30;
                                if (i36 != 50) {
                                    oo0oooo = this;
                                    i19 = i18;
                                    iOooO0oo = Oooo000(obj, bArr, i16, i2, i17 == true ? 1 : 0, i11, i34, i35, i36, j, i18, o00oooo1);
                                    if (iOooO0oo != i16) {
                                        obj = obj;
                                        i23 = i3;
                                        o00oooo2 = o00oooo1;
                                        i27 = i8;
                                        i28 = i9;
                                        i6 = i17;
                                        i13 = i11;
                                        i25 = i19;
                                    } else {
                                        i10 = i3;
                                        i7 = iOooO0oo;
                                        i6 = i17;
                                        i12 = i19;
                                    }
                                    bArr2 = bArr;
                                    i26 = i6;
                                    i24 = i13;
                                    oo0oooo2 = oo0oooo;
                                    unsafe2 = unsafe;
                                    obj3 = obj;
                                    o00oooo3 = o00oooo2;
                                } else if (i34 == 2) {
                                    OooOooo(obj, i18, j);
                                    throw null;
                                }
                            }
                        } else if (i34 == 2) {
                            zzli zzliVarZzd = (zzli) unsafe2.getObject(obj3, j);
                            if (!zzliVarZzd.zzc()) {
                                int size = zzliVarZzd.size();
                                zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzliVarZzd);
                            }
                            iOooO0oo = o00OOOOo.OooO0Oo(oo0oooo2.OooO(i14), i15 == true ? 1 : 0, bArr, i44, i2, zzliVarZzd, o00oooo1);
                            i27 = i27;
                            i28 = i28;
                            i23 = i3;
                            i26 = i15;
                            i25 = i14;
                            i24 = i30;
                            o00oooo3 = o00oooo1;
                        } else {
                            i8 = i27;
                            i9 = i28;
                            i16 = i44;
                            unsafe = unsafe2;
                            i17 = i15 == true ? 1 : 0;
                            i18 = i14;
                            iArr = iArr2;
                            i11 = i30;
                        }
                        oo0oooo = this;
                        i10 = i3;
                        i7 = i16;
                        i6 = i17;
                        i12 = i18;
                    }
                }
                if (i6 != i10 || i10 == 0) {
                    if (oo0oooo.f15629OooO0o) {
                        zzkn zzknVar = zzkn.f15748OooO0OO;
                        o00oooo2 = o00oooo1;
                        zzkn zzknVar2 = o00oooo2.f15508OooO0Oo;
                        if (zzknVar2 != zzknVar) {
                            i13 = i11;
                            if (zzknVar2.zzb(oo0oooo.f15630OooO0o0, i13) != null) {
                                throw null;
                            }
                            iOooO0oo = o00OOOOo.OooO0oo((i6 == true ? 1 : 0) == true ? 1 : 0, bArr, i7, i2, OooOoOO(obj), o00oooo1);
                            obj = obj;
                        }
                        i23 = i10;
                        i25 = i12;
                        i27 = i8;
                        i28 = i9;
                        bArr2 = bArr;
                        i26 = i6;
                        i24 = i13;
                        oo0oooo2 = oo0oooo;
                        unsafe2 = unsafe;
                        obj3 = obj;
                        o00oooo3 = o00oooo2;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    i13 = i11;
                    iOooO0oo = o00OOOOo.OooO0oo((i6 == true ? 1 : 0) == true ? 1 : 0, bArr, i7, i2, OooOoOO(obj), o00oooo1);
                    i23 = i10;
                    i25 = i12;
                    i27 = i8;
                    i28 = i9;
                    bArr2 = bArr;
                    i26 = i6;
                    i24 = i13;
                    oo0oooo2 = oo0oooo;
                    unsafe2 = unsafe;
                    obj3 = obj;
                    o00oooo3 = o00oooo2;
                } else {
                    obj2 = obj;
                    iOooO0oo = i7;
                    i23 = i10;
                    i26 = i6 == true ? 1 : 0;
                    i27 = i8;
                    i28 = i9;
                }
            } else {
                objArr = objArr2;
                iArr = iArr2;
                unsafe = unsafe2;
                obj2 = obj3;
                oo0oooo = oo0oooo2;
            }
        }
        if (i27 != 1048575) {
            unsafe.putInt(obj2, i27, i28);
        }
        for (int i45 = oo0oooo.f15624OooO; i45 < oo0oooo.f15633OooOO0; i45++) {
            int i46 = oo0oooo.f15632OooO0oo[i45];
            int i47 = iArr[i46];
            Object objOooOO0 = o0oo0000.OooOO0(oo0oooo.Oooo0(i46) & 1048575, obj2);
            if (objOooOO0 != null) {
                int i48 = i46 / 3;
                if (((zzlf) objArr[i48 + i48 + 1]) != null) {
                    throw null;
                }
            }
        }
        if (i23 == 0) {
            if (iOooO0oo != i2) {
                throw zzll.OooO0OO();
            }
        } else if (iOooO0oo > i2 || i26 != i23) {
            throw zzll.OooO0OO();
        }
        return iOooO0oo;
    }

    public final int OooOoo(Object obj) {
        int i;
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iOooo00o;
        int iZzx7;
        int iZzx8;
        int iOooOoo0;
        int iZzx9;
        int iZzx10;
        int iZzx11;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f15625OooO00o;
            if (i4 >= iArr.length) {
                o0OOO00 o0ooo00 = this.f15635OooOO0o;
                int iOooO00o = o0ooo00.OooO00o(o0ooo00.OooO0Oo(obj)) + i5;
                if (!this.f15629OooO0o) {
                    return iOooO00o;
                }
                this.f15636OooOOO0.OooO00o(obj);
                throw null;
            }
            int iOooo0 = Oooo0(i4);
            int i7 = iArr[i4];
            int i8 = (iOooo0 >>> 20) & 255;
            Unsafe unsafe = f15623OooOOOO;
            if (i8 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i2;
                int i11 = i9 >>> 20;
                if (i10 != i3) {
                    i6 = unsafe.getInt(obj, i10);
                    i3 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = iOooo0 & i2;
            switch (i8) {
                case 0:
                    if ((i6 & i) != 0) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 1:
                    if ((i6 & i) != 0) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 2:
                    if ((i & i6) != 0) {
                        iZzy = zzki.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzki.zzx(i7 << 3);
                        i5 += iZzx3 + iZzy;
                    }
                    break;
                case 3:
                    if ((i & i6) != 0) {
                        iZzy = zzki.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzki.zzx(i7 << 3);
                        i5 += iZzx3 + iZzy;
                    }
                    break;
                case 4:
                    if ((i & i6) != 0) {
                        iZzy = zzki.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i7 << 3);
                        i5 += iZzx3 + iZzy;
                    }
                    break;
                case 5:
                    if ((i6 & i) != 0) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 6:
                    if ((i6 & i) != 0) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 7:
                    if ((i6 & i) != 0) {
                        iZzx4 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx4 + 1;
                        i5 += iOooo00o;
                    }
                    break;
                case 8:
                    if ((i & i6) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzka)) {
                            iZzy = zzki.zzw((String) object);
                            iZzx3 = zzki.zzx(i7 << 3);
                            i5 += iZzx3 + iZzy;
                        } else {
                            Logger logger = zzki.f15744OooO0O0;
                            int iZzd = ((zzka) object).zzd();
                            iZzx5 = zzki.zzx(iZzd) + iZzd;
                            iZzx6 = zzki.zzx(i7 << 3);
                            iOooo00o = iZzx6 + iZzx5;
                            i5 += iOooo00o;
                        }
                    }
                    break;
                case 9:
                    if ((i & i6) != 0) {
                        iOooo00o = oo0oO0.Oooo00o(i7, OooO(i4), unsafe.getObject(obj, j));
                        i5 += iOooo00o;
                    }
                    break;
                case 10:
                    if ((i & i6) != 0) {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j);
                        Logger logger2 = zzki.f15744OooO0O0;
                        int iZzd2 = zzkaVar.zzd();
                        iZzx5 = zzki.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx6 + iZzx5;
                        i5 += iOooo00o;
                    }
                    break;
                case 11:
                    if ((i & i6) != 0) {
                        iZzy = zzki.zzx(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i7 << 3);
                        i5 += iZzx3 + iZzy;
                    }
                    break;
                case 12:
                    if ((i & i6) != 0) {
                        iZzy = zzki.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i7 << 3);
                        i5 += iZzx3 + iZzy;
                    }
                    break;
                case 13:
                    if ((i6 & i) != 0) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 14:
                    if ((i6 & i) != 0) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 15:
                    if ((i & i6) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzx7 = zzki.zzx(i7 << 3);
                        iZzx8 = zzki.zzx((i12 >> 31) ^ (i12 + i12));
                        iOooo00o = iZzx8 + iZzx7;
                        i5 += iOooo00o;
                    }
                    break;
                case 16:
                    if ((i & i6) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzx5 = zzki.zzx(i7 << 3);
                        iZzx6 = zzki.zzy((j2 >> 63) ^ (j2 + j2));
                        iOooo00o = iZzx6 + iZzx5;
                        i5 += iOooo00o;
                    }
                    break;
                case 17:
                    if ((i & i6) != 0) {
                        iOooo00o = zzki.OooO00o(i7, (zzmi) unsafe.getObject(obj, j), OooO(i4));
                        i5 += iOooo00o;
                    }
                    break;
                case 18:
                    iOooo00o = oo0oO0.OooOoOO(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 19:
                    iOooo00o = oo0oO0.OooOoO0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 20:
                    iOooo00o = oo0oO0.Oooo000(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 21:
                    iOooo00o = oo0oO0.OoooO00(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 22:
                    iOooo00o = oo0oO0.OooOooO(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 23:
                    iOooo00o = oo0oO0.OooOoOO(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 24:
                    iOooo00o = oo0oO0.OooOoO0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 25:
                    iOooo00o = oo0oO0.OooOo0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 26:
                    iOooo00o = oo0oO0.Oooo0oO(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 27:
                    iOooo00o = oo0oO0.Oooo0(i7, (List) unsafe.getObject(obj, j), OooO(i4));
                    i5 += iOooo00o;
                    break;
                case 28:
                    iOooo00o = oo0oO0.OooOo0O(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 29:
                    iOooo00o = oo0oO0.Oooo0oo(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 30:
                    iOooo00o = oo0oO0.OooOo0o(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 31:
                    iOooo00o = oo0oO0.OooOoO0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 32:
                    iOooo00o = oo0oO0.OooOoOO(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 33:
                    iOooo00o = oo0oO0.Oooo0O0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 34:
                    iOooo00o = oo0oO0.Oooo0o0(i7, (List) unsafe.getObject(obj, j));
                    i5 += iOooo00o;
                    break;
                case 35:
                    iOooOoo0 = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 36:
                    iOooOoo0 = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 37:
                    iOooOoo0 = oo0oO0.Oooo00O((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 38:
                    iOooOoo0 = oo0oO0.OoooO0((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 39:
                    iOooOoo0 = oo0oO0.OooOooo((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 40:
                    iOooOoo0 = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 41:
                    iOooOoo0 = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = oo0oO0.f15639OooO00o;
                    iOooOoo0 = list.size();
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 43:
                    iOooOoo0 = oo0oO0.Oooo((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 44:
                    iOooOoo0 = oo0oO0.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 45:
                    iOooOoo0 = oo0oO0.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 46:
                    iOooOoo0 = oo0oO0.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 47:
                    iOooOoo0 = oo0oO0.Oooo0OO((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 48:
                    iOooOoo0 = oo0oO0.Oooo0o((List) unsafe.getObject(obj, j));
                    if (iOooOoo0 > 0) {
                        iZzx9 = zzki.zzx(iOooOoo0);
                        iZzx10 = zzki.zzx(i7 << 3);
                        iZzx11 = iZzx10 + iZzx9;
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 49:
                    iOooo00o = oo0oO0.OooOoo(i7, (List) unsafe.getObject(obj, j), OooO(i4));
                    i5 += iOooo00o;
                    break;
                case 50:
                    o0O0O0Oo.OooO00o(unsafe.getObject(obj, j), OooOO0(i4));
                    break;
                case 51:
                    if (OooOo(i7, i4, obj)) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 52:
                    if (OooOo(i7, i4, obj)) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 53:
                    if (OooOo(i7, i4, obj)) {
                        iOooOoo0 = zzki.zzy(Oooo0O0(j, obj));
                        iZzx11 = zzki.zzx(i7 << 3);
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 54:
                    if (OooOo(i7, i4, obj)) {
                        iOooOoo0 = zzki.zzy(Oooo0O0(j, obj));
                        iZzx11 = zzki.zzx(i7 << 3);
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 55:
                    if (OooOo(i7, i4, obj)) {
                        iOooOoo0 = zzki.zzu(OooOooO(j, obj));
                        iZzx11 = zzki.zzx(i7 << 3);
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 56:
                    if (OooOo(i7, i4, obj)) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 57:
                    if (OooOo(i7, i4, obj)) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 58:
                    if (OooOo(i7, i4, obj)) {
                        iZzx4 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx4 + 1;
                        i5 += iOooo00o;
                    }
                    break;
                case 59:
                    if (OooOo(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzka)) {
                            iOooOoo0 = zzki.zzw((String) object2);
                            iZzx11 = zzki.zzx(i7 << 3);
                            i5 = iZzx11 + iOooOoo0 + i5;
                        } else {
                            Logger logger3 = zzki.f15744OooO0O0;
                            int iZzd3 = ((zzka) object2).zzd();
                            iZzx5 = zzki.zzx(iZzd3) + iZzd3;
                            iZzx6 = zzki.zzx(i7 << 3);
                            iOooo00o = iZzx6 + iZzx5;
                            i5 += iOooo00o;
                        }
                    }
                    break;
                case 60:
                    if (OooOo(i7, i4, obj)) {
                        iOooo00o = oo0oO0.Oooo00o(i7, OooO(i4), unsafe.getObject(obj, j));
                        i5 += iOooo00o;
                    }
                    break;
                case 61:
                    if (OooOo(i7, i4, obj)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j);
                        Logger logger4 = zzki.f15744OooO0O0;
                        int iZzd4 = zzkaVar2.zzd();
                        iZzx5 = zzki.zzx(iZzd4) + iZzd4;
                        iZzx6 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx6 + iZzx5;
                        i5 += iOooo00o;
                    }
                    break;
                case 62:
                    if (OooOo(i7, i4, obj)) {
                        iOooOoo0 = zzki.zzx(OooOooO(j, obj));
                        iZzx11 = zzki.zzx(i7 << 3);
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 63:
                    if (OooOo(i7, i4, obj)) {
                        iOooOoo0 = zzki.zzu(OooOooO(j, obj));
                        iZzx11 = zzki.zzx(i7 << 3);
                        i5 = iZzx11 + iOooOoo0 + i5;
                    }
                    break;
                case 64:
                    if (OooOo(i7, i4, obj)) {
                        iZzx2 = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx2 + 4;
                        i5 += iOooo00o;
                    }
                    break;
                case 65:
                    if (OooOo(i7, i4, obj)) {
                        iZzx = zzki.zzx(i7 << 3);
                        iOooo00o = iZzx + 8;
                        i5 += iOooo00o;
                    }
                    break;
                case 66:
                    if (OooOo(i7, i4, obj)) {
                        int iOooOooO = OooOooO(j, obj);
                        iZzx7 = zzki.zzx(i7 << 3);
                        iZzx8 = zzki.zzx((iOooOooO >> 31) ^ (iOooOooO + iOooOooO));
                        iOooo00o = iZzx8 + iZzx7;
                        i5 += iOooo00o;
                    }
                    break;
                case 67:
                    if (OooOo(i7, i4, obj)) {
                        long jOooo0O0 = Oooo0O0(j, obj);
                        iZzx5 = zzki.zzx(i7 << 3);
                        iZzx6 = zzki.zzy((jOooo0O0 >> 63) ^ (jOooo0O0 + jOooo0O0));
                        iOooo00o = iZzx6 + iZzx5;
                        i5 += iOooo00o;
                    }
                    break;
                case 68:
                    if (OooOo(i7, i4, obj)) {
                        iOooo00o = zzki.OooO00o(i7, (zzmi) unsafe.getObject(obj, j), OooO(i4));
                        i5 += iOooo00o;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final void OooOooo(Object obj, int i, long j) throws IOException {
        Object objOooOO0 = OooOO0(i);
        Unsafe unsafe = f15623OooOOOO;
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).zze()) {
            zzmc zzmcVarZzb = zzmc.zza().zzb();
            o0O0O0Oo.OooO0O0(zzmcVarZzb, object);
            unsafe.putObject(obj, j, zzmcVarZzb);
        }
        throw null;
    }

    public final int Oooo0(int i) {
        return this.f15625OooO00o[i + 1];
    }

    public final int Oooo000(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, o00OOOO0 o00oooo1) throws IOException {
        long j2 = this.f15625OooO00o[i8 + 2] & 1048575;
        Unsafe unsafe = f15623OooOOOO;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(o00OOOOo.OooOOOO(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(o00OOOOo.OooO0O0(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO0o = o00OOOOo.OooOO0o(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, Long.valueOf(o00oooo1.f15506OooO0O0));
                unsafe.putInt(obj, j2, i4);
                return iOooOO0o;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iOooO = o00OOOOo.OooO(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, Integer.valueOf(o00oooo1.f15505OooO00o));
                unsafe.putInt(obj, j2, i4);
                return iOooO;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(o00OOOOo.OooOOOO(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(o00OOOOo.OooO0O0(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO0o2 = o00OOOOo.OooOO0o(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, Boolean.valueOf(o00oooo1.f15506OooO0O0 != 0));
                unsafe.putInt(obj, j2, i4);
                return iOooOO0o2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iOooO2 = o00OOOOo.OooO(bArr, i, o00oooo1);
                int i13 = o00oooo1.f15505OooO00o;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !oO00000o.OooO0Oo(iOooO2, iOooO2 + i13, bArr)) {
                        throw zzll.OooO00o();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iOooO2, i13, zzlj.f15753OooO00o));
                    iOooO2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iOooO2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objOooOO0o = OooOO0o(i4, i8, obj);
                int iOooOOO = o00OOOOo.OooOOO(objOooOO0o, OooO(i8), bArr, i, i2, o00oooo1);
                OooOo00(i4, obj, i8, objOooOO0o);
                return iOooOOO;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iOooO00o = o00OOOOo.OooO00o(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, o00oooo1.f15507OooO0OO);
                unsafe.putInt(obj, j2, i4);
                return iOooO00o;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iOooO3 = o00OOOOo.OooO(bArr, i, o00oooo1);
                int i14 = o00oooo1.f15505OooO00o;
                int i15 = i8 / 3;
                zzlf zzlfVar = (zzlf) this.f15626OooO0O0[i15 + i15 + 1];
                if (zzlfVar == null || zzlfVar.zza(i14)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    OooOoOO(obj).OooO0O0(i3, Long.valueOf(i14));
                }
                return iOooO3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iOooO4 = o00OOOOo.OooO(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, Integer.valueOf(zzke.zzb(o00oooo1.f15505OooO00o)));
                unsafe.putInt(obj, j2, i4);
                return iOooO4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO0o3 = o00OOOOo.OooOO0o(bArr, i, o00oooo1);
                unsafe.putObject(obj, j, Long.valueOf(zzke.zzc(o00oooo1.f15506OooO0O0)));
                unsafe.putInt(obj, j2, i4);
                return iOooOO0o3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objOooOO0o2 = OooOO0o(i4, i8, obj);
                int iOooOOO0 = o00OOOOo.OooOOO0(objOooOO0o2, OooO(i8), bArr, i, i2, (i3 & (-8)) | 4, o00oooo1);
                OooOo00(i4, obj, i8, objOooOO0o2);
                return iOooOOO0;
            default:
                return i;
        }
    }

    public final int Oooo00O(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, o00OOOO0 o00oooo1) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iOooOO0O;
        int i12 = i;
        Unsafe unsafe = f15623OooOOOO;
        zzli zzliVarZzd = (zzli) unsafe.getObject(obj, j2);
        if (!zzliVarZzd.zzc()) {
            int size = zzliVarZzd.size();
            zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzliVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    o0O0000O o0o0000o2 = (o0O0000O) zzliVarZzd;
                    int iOooO = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i13 = o00oooo1.f15505OooO00o + iOooO;
                    while (iOooO < i13) {
                        o0o0000o2.OooO0O0(Double.longBitsToDouble(o00OOOOo.OooOOOO(iOooO, bArr)));
                        iOooO += 8;
                    }
                    if (iOooO == i13) {
                        return iOooO;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 1) {
                    o0O0000O o0o0000o3 = (o0O0000O) zzliVarZzd;
                    o0o0000o3.OooO0O0(Double.longBitsToDouble(o00OOOOo.OooOOOO(i12, bArr)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            int iOooO2 = o00OOOOo.OooO(bArr, i8, o00oooo1);
                            if (i3 == o00oooo1.f15505OooO00o) {
                                o0o0000o3.OooO0O0(Double.longBitsToDouble(o00OOOOo.OooOOOO(iOooO2, bArr)));
                                i12 = iOooO2;
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    o0O00 o0o01 = (o0O00) zzliVarZzd;
                    int iOooO3 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i14 = o00oooo1.f15505OooO00o + iOooO3;
                    while (iOooO3 < i14) {
                        o0o01.OooO0O0(Float.intBitsToFloat(o00OOOOo.OooO0O0(iOooO3, bArr)));
                        iOooO3 += 4;
                    }
                    if (iOooO3 == i14) {
                        return iOooO3;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 5) {
                    o0O00 o0o02 = (o0O00) zzliVarZzd;
                    o0o02.OooO0O0(Float.intBitsToFloat(o00OOOOo.OooO0O0(i12, bArr)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            int iOooO4 = o00OOOOo.OooO(bArr, i9, o00oooo1);
                            if (i3 == o00oooo1.f15505OooO00o) {
                                o0o02.OooO0O0(Float.intBitsToFloat(o00OOOOo.OooO0O0(iOooO4, bArr)));
                                i12 = iOooO4;
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    o0O00o00 o0o00o01 = (o0O00o00) zzliVarZzd;
                    int iOooO5 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i15 = o00oooo1.f15505OooO00o + iOooO5;
                    while (iOooO5 < i15) {
                        iOooO5 = o00OOOOo.OooOO0o(bArr, iOooO5, o00oooo1);
                        o0o00o01.OooO0O0(o00oooo1.f15506OooO0O0);
                    }
                    if (iOooO5 == i15) {
                        return iOooO5;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O00o00 o0o00o02 = (o0O00o00) zzliVarZzd;
                    int iOooOO0o = o00OOOOo.OooOO0o(bArr, i12, o00oooo1);
                    o0o00o02.OooO0O0(o00oooo1.f15506OooO0O0);
                    while (iOooOO0o < i2) {
                        int iOooO6 = o00OOOOo.OooO(bArr, iOooOO0o, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooOO0o;
                        }
                        iOooOO0o = o00OOOOo.OooOO0o(bArr, iOooO6, o00oooo1);
                        o0o00o02.OooO0O0(o00oooo1.f15506OooO0O0);
                    }
                    return iOooOO0o;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return o00OOOOo.OooO0o0(bArr, i12, zzliVarZzd, o00oooo1);
                }
                if (i5 == 0) {
                    return o00OOOOo.OooOO0O(i3, bArr, i, i2, zzliVarZzd, o00oooo1);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    o0O00o00 o0o00o03 = (o0O00o00) zzliVarZzd;
                    int iOooO7 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i16 = o00oooo1.f15505OooO00o + iOooO7;
                    while (iOooO7 < i16) {
                        o0o00o03.OooO0O0(o00OOOOo.OooOOOO(iOooO7, bArr));
                        iOooO7 += 8;
                    }
                    if (iOooO7 == i16) {
                        return iOooO7;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 1) {
                    o0O00o00 o0o00o04 = (o0O00o00) zzliVarZzd;
                    o0o00o04.OooO0O0(o00OOOOo.OooOOOO(i12, bArr));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            int iOooO8 = o00OOOOo.OooO(bArr, i10, o00oooo1);
                            if (i3 == o00oooo1.f15505OooO00o) {
                                o0o00o04.OooO0O0(o00OOOOo.OooOOOO(iOooO8, bArr));
                                i12 = iOooO8;
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    o0O00O o0o00o2 = (o0O00O) zzliVarZzd;
                    int iOooO9 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i17 = o00oooo1.f15505OooO00o + iOooO9;
                    while (iOooO9 < i17) {
                        o0o00o2.OooO0O0(o00OOOOo.OooO0O0(iOooO9, bArr));
                        iOooO9 += 4;
                    }
                    if (iOooO9 == i17) {
                        return iOooO9;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 5) {
                    o0O00O o0o00o3 = (o0O00O) zzliVarZzd;
                    o0o00o3.OooO0O0(o00OOOOo.OooO0O0(i12, bArr));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            int iOooO10 = o00OOOOo.OooO(bArr, i11, o00oooo1);
                            if (i3 == o00oooo1.f15505OooO00o) {
                                o0o00o3.OooO0O0(o00OOOOo.OooO0O0(iOooO10, bArr));
                                i12 = iOooO10;
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    o00Oo00 o00oo00 = (o00Oo00) zzliVarZzd;
                    int iOooO11 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i18 = o00oooo1.f15505OooO00o + iOooO11;
                    while (iOooO11 < i18) {
                        iOooO11 = o00OOOOo.OooOO0o(bArr, iOooO11, o00oooo1);
                        o00oo00.OooO0O0(o00oooo1.f15506OooO0O0 != 0);
                    }
                    if (iOooO11 == i18) {
                        return iOooO11;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 0) {
                    o00Oo00 o00oo01 = (o00Oo00) zzliVarZzd;
                    int iOooOO0o2 = o00OOOOo.OooOO0o(bArr, i12, o00oooo1);
                    o00oo01.OooO0O0(o00oooo1.f15506OooO0O0 != 0);
                    while (iOooOO0o2 < i2) {
                        int iOooO12 = o00OOOOo.OooO(bArr, iOooOO0o2, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooOO0o2;
                        }
                        iOooOO0o2 = o00OOOOo.OooOO0o(bArr, iOooO12, o00oooo1);
                        o00oo01.OooO0O0(o00oooo1.f15506OooO0O0 != 0);
                    }
                    return iOooOO0o2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iOooO13 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                        int i19 = o00oooo1.f15505OooO00o;
                        if (i19 < 0) {
                            throw zzll.OooO0O0();
                        }
                        if (i19 == 0) {
                            zzliVarZzd.add("");
                        } else {
                            zzliVarZzd.add(new String(bArr, iOooO13, i19, zzlj.f15753OooO00o));
                            iOooO13 += i19;
                        }
                        while (iOooO13 < i2) {
                            int iOooO14 = o00OOOOo.OooO(bArr, iOooO13, o00oooo1);
                            if (i3 != o00oooo1.f15505OooO00o) {
                                return iOooO13;
                            }
                            iOooO13 = o00OOOOo.OooO(bArr, iOooO14, o00oooo1);
                            int i20 = o00oooo1.f15505OooO00o;
                            if (i20 < 0) {
                                throw zzll.OooO0O0();
                            }
                            if (i20 == 0) {
                                zzliVarZzd.add("");
                            } else {
                                zzliVarZzd.add(new String(bArr, iOooO13, i20, zzlj.f15753OooO00o));
                                iOooO13 += i20;
                            }
                        }
                        return iOooO13;
                    }
                    int iOooO15 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i21 = o00oooo1.f15505OooO00o;
                    if (i21 < 0) {
                        throw zzll.OooO0O0();
                    }
                    if (i21 == 0) {
                        zzliVarZzd.add("");
                    } else {
                        int i22 = iOooO15 + i21;
                        if (!oO00000o.OooO0Oo(iOooO15, i22, bArr)) {
                            throw zzll.OooO00o();
                        }
                        zzliVarZzd.add(new String(bArr, iOooO15, i21, zzlj.f15753OooO00o));
                        iOooO15 = i22;
                    }
                    while (iOooO15 < i2) {
                        int iOooO16 = o00OOOOo.OooO(bArr, iOooO15, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooO15;
                        }
                        iOooO15 = o00OOOOo.OooO(bArr, iOooO16, o00oooo1);
                        int i23 = o00oooo1.f15505OooO00o;
                        if (i23 < 0) {
                            throw zzll.OooO0O0();
                        }
                        if (i23 == 0) {
                            zzliVarZzd.add("");
                        } else {
                            int i24 = iOooO15 + i23;
                            if (!oO00000o.OooO0Oo(iOooO15, i24, bArr)) {
                                throw zzll.OooO00o();
                            }
                            zzliVarZzd.add(new String(bArr, iOooO15, i23, zzlj.f15753OooO00o));
                            iOooO15 = i24;
                        }
                    }
                    return iOooO15;
                }
                break;
            case 27:
                if (i5 == 2) {
                    return o00OOOOo.OooO0Oo(OooO(i6), i3, bArr, i, i2, zzliVarZzd, o00oooo1);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int iOooO17 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i25 = o00oooo1.f15505OooO00o;
                    if (i25 < 0) {
                        throw zzll.OooO0O0();
                    }
                    if (i25 > bArr.length - iOooO17) {
                        throw zzll.OooO0Oo();
                    }
                    if (i25 == 0) {
                        zzliVarZzd.add(zzka.zzb);
                    } else {
                        zzliVarZzd.add(zzka.zzl(bArr, iOooO17, i25));
                        iOooO17 += i25;
                    }
                    while (iOooO17 < i2) {
                        int iOooO18 = o00OOOOo.OooO(bArr, iOooO17, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooO17;
                        }
                        iOooO17 = o00OOOOo.OooO(bArr, iOooO18, o00oooo1);
                        int i26 = o00oooo1.f15505OooO00o;
                        if (i26 < 0) {
                            throw zzll.OooO0O0();
                        }
                        if (i26 > bArr.length - iOooO17) {
                            throw zzll.OooO0Oo();
                        }
                        if (i26 == 0) {
                            zzliVarZzd.add(zzka.zzb);
                        } else {
                            zzliVarZzd.add(zzka.zzl(bArr, iOooO17, i26));
                            iOooO17 += i26;
                        }
                    }
                    return iOooO17;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iOooOO0O = o00OOOOo.OooO0o0(bArr, i12, zzliVarZzd, o00oooo1);
                } else if (i5 == 0) {
                    iOooOO0O = o00OOOOo.OooOO0O(i3, bArr, i, i2, zzliVarZzd, o00oooo1);
                }
                int i27 = i6 / 3;
                zzlf zzlfVar = (zzlf) this.f15626OooO0O0[i27 + i27 + 1];
                Class cls = oo0oO0.f15639OooO00o;
                if (zzlfVar != null) {
                    boolean z = zzliVarZzd instanceof RandomAccess;
                    Object objOooO00o = null;
                    o0OOO00 o0ooo00 = this.f15635OooOO0o;
                    if (z) {
                        int size2 = zzliVarZzd.size();
                        int i28 = 0;
                        for (int i29 = 0; i29 < size2; i29++) {
                            int iIntValue = ((Integer) zzliVarZzd.get(i29)).intValue();
                            if (zzlfVar.zza(iIntValue)) {
                                if (i29 != i28) {
                                    zzliVarZzd.set(i28, Integer.valueOf(iIntValue));
                                }
                                i28++;
                            } else {
                                objOooO00o = oo0oO0.OooO00o(obj, i4, iIntValue, objOooO00o, o0ooo00);
                            }
                        }
                        if (i28 != size2) {
                            zzliVarZzd.subList(i28, size2).clear();
                            return iOooOO0O;
                        }
                    } else {
                        Iterator it = zzliVarZzd.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!zzlfVar.zza(iIntValue2)) {
                                objOooO00o = oo0oO0.OooO00o(obj, i4, iIntValue2, objOooO00o, o0ooo00);
                                it.remove();
                            }
                        }
                    }
                }
                return iOooOO0O;
            case 33:
            case 47:
                if (i5 == 2) {
                    o0O00O o0o00o4 = (o0O00O) zzliVarZzd;
                    int iOooO19 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i30 = o00oooo1.f15505OooO00o + iOooO19;
                    while (iOooO19 < i30) {
                        iOooO19 = o00OOOOo.OooO(bArr, iOooO19, o00oooo1);
                        o0o00o4.OooO0O0(zzke.zzb(o00oooo1.f15505OooO00o));
                    }
                    if (iOooO19 == i30) {
                        return iOooO19;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O00O o0o00o5 = (o0O00O) zzliVarZzd;
                    int iOooO20 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    o0o00o5.OooO0O0(zzke.zzb(o00oooo1.f15505OooO00o));
                    while (iOooO20 < i2) {
                        int iOooO21 = o00OOOOo.OooO(bArr, iOooO20, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooO20;
                        }
                        iOooO20 = o00OOOOo.OooO(bArr, iOooO21, o00oooo1);
                        o0o00o5.OooO0O0(zzke.zzb(o00oooo1.f15505OooO00o));
                    }
                    return iOooO20;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    o0O00o00 o0o00o05 = (o0O00o00) zzliVarZzd;
                    int iOooO22 = o00OOOOo.OooO(bArr, i12, o00oooo1);
                    int i31 = o00oooo1.f15505OooO00o + iOooO22;
                    while (iOooO22 < i31) {
                        iOooO22 = o00OOOOo.OooOO0o(bArr, iOooO22, o00oooo1);
                        o0o00o05.OooO0O0(zzke.zzc(o00oooo1.f15506OooO0O0));
                    }
                    if (iOooO22 == i31) {
                        return iOooO22;
                    }
                    throw zzll.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O00o00 o0o00o06 = (o0O00o00) zzliVarZzd;
                    int iOooOO0o3 = o00OOOOo.OooOO0o(bArr, i12, o00oooo1);
                    o0o00o06.OooO0O0(zzke.zzc(o00oooo1.f15506OooO0O0));
                    while (iOooOO0o3 < i2) {
                        int iOooO23 = o00OOOOo.OooO(bArr, iOooOO0o3, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooOO0o3;
                        }
                        iOooOO0o3 = o00OOOOo.OooOO0o(bArr, iOooO23, o00oooo1);
                        o0o00o06.OooO0O0(zzke.zzc(o00oooo1.f15506OooO0O0));
                    }
                    return iOooOO0o3;
                }
                break;
            default:
                if (i5 == 3) {
                    o0OO000o o0oo000oOooO = OooO(i6);
                    int i32 = (i3 & (-8)) | 4;
                    int iOooO0OO = o00OOOOo.OooO0OO(o0oo000oOooO, bArr, i, i2, i32, o00oooo1);
                    zzliVarZzd.add(o00oooo1.f15507OooO0OO);
                    while (iOooO0OO < i2) {
                        int iOooO24 = o00OOOOo.OooO(bArr, iOooO0OO, o00oooo1);
                        if (i3 != o00oooo1.f15505OooO00o) {
                            return iOooO0OO;
                        }
                        iOooO0OO = o00OOOOo.OooO0OO(o0oo000oOooO, bArr, iOooO24, i2, i32, o00oooo1);
                        zzliVarZzd.add(o00oooo1.f15507OooO0OO);
                    }
                    return iOooO0OO;
                }
                break;
        }
        return i12;
    }

    public final int Oooo00o(int i, int i2) {
        int[] iArr = this.f15625OooO00o;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final Object zze() {
        return (zzlb) ((zzlb) this.f15630OooO0o0).OooOO0o(4);
    }
}
