package p335o0OO00o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzmo;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.KotlinVersion;
import net.sqlcipher.database.SQLiteDatabase;
import p131o00O0oo.o00oOoo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O<T> implements oo0OOoo<T> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f37400OooOOO = new int[0];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Unsafe f37401OooOOOO = o0OO.OooOO0O();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f37402OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f37403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f37404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f37407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzll f37408OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f37409OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f37410OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f37411OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0O000o0 f37412OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0OO00OO f37413OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final oo00oO f37414OooOOO0;

    public o0O0O0O(int[] iArr, Object[] objArr, int i, int i2, zzll zzllVar, boolean z, int[] iArr2, int i3, int i4, o0O000o0 o0o000o1, o0OO00OO o0oo00oo2, oo00oO oo00oo, o0O00OO o0o00oo2) {
        this.f37403OooO00o = iArr;
        this.f37404OooO0O0 = objArr;
        this.f37405OooO0OO = i;
        this.f37406OooO0Oo = i2;
        this.f37409OooO0oO = z;
        this.f37407OooO0o = oo00oo != null && oo00oo.OooO0OO(zzllVar);
        this.f37410OooO0oo = iArr2;
        this.f37402OooO = i3;
        this.f37411OooOO0 = i4;
        this.f37412OooOO0O = o0o000o1;
        this.f37413OooOO0o = o0oo00oo2;
        this.f37414OooOOO0 = oo00oo;
        this.f37408OooO0o0 = zzllVar;
    }

    public static long OooOO0(Object obj, long j) {
        return ((Long) o0OO.OooOO0(obj, j)).longValue();
    }

    public static Field OooOOO(Class cls, String str) {
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
            StringBuilder sbOooO00o = o00oOoo.OooO00o("Field ", str, " for ", name, " not found. Known fields are ");
            sbOooO00o.append(string);
            throw new RuntimeException(sbOooO00o.toString());
        }
    }

    public static final void OooOo(int i, Object obj, o0OOOO0o o0oooo0o2) throws IOException {
        if (obj instanceof String) {
            ((o00Oo00) o0oooo0o2).f37369OooO00o.zzm(i, (String) obj);
        } else {
            ((o00Oo00) o0oooo0o2).OooO0o(i, (zzjd) obj);
        }
    }

    public static boolean OooOo0o(Object obj, long j) {
        return ((Boolean) o0OO.OooOO0(obj, j)).booleanValue();
    }

    public static zzmo OooOoO(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar != zzmo.zzc()) {
            return zzmoVar;
        }
        zzmo zzmoVarOooO00o = zzmo.OooO00o();
        zzkeVar.zzc = zzmoVarOooO00o;
        return zzmoVarOooO00o;
    }

    public static o0O0O0O OooOoOO(o0oO0Ooo o0oo0ooo2, o0O0oo0o o0o0oo0o, o0O000o0 o0o000o1, o0OO00OO o0oo00oo2, oo00oO oo00oo, o0O00OO o0o00oo2) {
        if (o0oo0ooo2 instanceof o0O0OOOo) {
            return OooOoo0((o0O0OOOo) o0oo0ooo2, o0o0oo0o, o0o000o1, o0oo00oo2, oo00oo, o0o00oo2);
        }
        throw null;
    }

    public static double OooOoo(Object obj, long j) {
        return ((Double) o0OO.OooOO0(obj, j)).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:128:0x0278  */
    /* JADX WARN: Code duplicated, block: B:131:0x0290  */
    /* JADX WARN: Code duplicated, block: B:132:0x0293  */
    /* JADX WARN: Code duplicated, block: B:179:0x0393  */
    public static o0O0O0O OooOoo0(o0O0OOOo o0o0oooo, o0O0oo0o o0o0oo0o, o0O000o0 o0o000o1, o0OO00OO o0oo00oo2, oo00oO oo00oo, o0O00OO o0o00oo2) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        Class<?> cls;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        Field fieldOooOOO;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        Field fieldOooOOO2;
        int i23;
        Object obj2;
        Field fieldOooOOO3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        int i28 = 0;
        boolean z = ((o0o0oooo.f37426OooO0Oo & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str = o0o0oooo.f37424OooO0O0;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i31 = iCharAt5 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            iCharAt5 = i31 | (cCharAt13 << i32);
            i30 = i27;
        }
        if (iCharAt5 == 0) {
            iArr = f37400OooOOO;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt6 = str.charAt(i30);
            if (iCharAt6 >= 55296) {
                int i34 = iCharAt6 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i11;
                }
                iCharAt6 = i34 | (cCharAt8 << i35);
                i33 = i11;
            }
            int i36 = i33 + 1;
            int iCharAt7 = str.charAt(i33);
            if (iCharAt7 >= 55296) {
                int i37 = iCharAt7 & 8191;
                int i38 = 13;
                while (true) {
                    i10 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i10;
                }
                iCharAt7 = i37 | (cCharAt7 << i38);
                i36 = i10;
            }
            int i39 = i36 + 1;
            iCharAt = str.charAt(i36);
            if (iCharAt >= 55296) {
                int i40 = iCharAt & 8191;
                int i41 = 13;
                while (true) {
                    i9 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i9;
                }
                iCharAt = i40 | (cCharAt6 << i41);
                i39 = i9;
            }
            int i42 = i39 + 1;
            iCharAt2 = str.charAt(i39);
            if (iCharAt2 >= 55296) {
                int i43 = iCharAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i8;
                }
                iCharAt2 = i43 | (cCharAt5 << i44);
                i42 = i8;
            }
            int i45 = i42 + 1;
            iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i7 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i7;
                }
                iCharAt3 = i46 | (cCharAt4 << i47);
                i45 = i7;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i6 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i6;
                }
                iCharAt8 = i49 | (cCharAt3 << i50);
                i48 = i6;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i5 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i5;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i5;
            }
            int i54 = i51 + 1;
            iCharAt4 = str.charAt(i51);
            if (iCharAt4 >= 55296) {
                int i55 = iCharAt4 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i4 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i56 = i4;
                }
                iCharAt4 = i55 | (cCharAt << i57);
                i54 = i4;
            }
            int[] iArr3 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = iCharAt6 + iCharAt6 + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr3;
            i28 = iCharAt6;
            i30 = i54;
        }
        Unsafe unsafe = f37401OooOOOO;
        Object[] objArr = o0o0oooo.f37425OooO0OO;
        Class<?> cls2 = o0o0oooo.f37423OooO00o.getClass();
        int i58 = i30;
        int[] iArr4 = new int[iCharAt3 * 3];
        Object[] objArr2 = new Object[iCharAt3 + iCharAt3];
        int i59 = iCharAt4 + i3;
        int i60 = iCharAt4;
        int i61 = i58;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (i61 < length) {
            int i65 = i61 + 1;
            int iCharAt10 = str.charAt(i61);
            int i66 = length;
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = i65;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i12 = iCharAt4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                    iCharAt4 = i12;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i13 = i26;
            } else {
                i12 = iCharAt4;
                i13 = i65;
            }
            int i70 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i25 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    i14 = iCharAt2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i25;
                    iCharAt2 = i14;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i15 = i25;
            } else {
                i14 = iCharAt2;
                i15 = i70;
            }
            int i74 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i75 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i74 >= 51) {
                int i76 = i15 + 1;
                int iCharAt12 = str.charAt(i15);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = 13;
                    int i78 = iCharAt12 & 8191;
                    int i79 = i76;
                    while (true) {
                        i24 = i79 + 1;
                        cCharAt10 = str.charAt(i79);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i79 = i24;
                        c = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i77);
                    i20 = i24;
                } else {
                    i20 = i76;
                }
                int i80 = i20;
                int i81 = i74 - 51;
                if (i81 == 9 || i81 == 17) {
                    int i82 = i63 / 3;
                    i21 = i2 + 1;
                    objArr2[i82 + i82 + 1] = objArr[i2];
                } else {
                    if (i81 == 12 && !z) {
                        int i83 = i63 / 3;
                        i21 = i2 + 1;
                        objArr2[i83 + i83 + 1] = objArr[i2];
                    }
                    i22 = iCharAt12 + iCharAt12;
                    obj = objArr[i22];
                    if (obj instanceof Field) {
                        fieldOooOOO2 = (Field) obj;
                    } else {
                        fieldOooOOO2 = OooOOO(cls2, (String) obj);
                        objArr[i22] = fieldOooOOO2;
                    }
                    i16 = i28;
                    iArr2 = iArr4;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldOooOOO2);
                    i23 = i22 + 1;
                    obj2 = objArr[i23];
                    if (obj2 instanceof Field) {
                        fieldOooOOO3 = (Field) obj2;
                    } else {
                        fieldOooOOO3 = OooOOO(cls2, (String) obj2);
                        objArr[i23] = fieldOooOOO3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOOO3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    cls = cls2;
                    i15 = i80;
                    i18 = 0;
                    i17 = i2;
                    str = str;
                }
                i2 = i21;
                i22 = iCharAt12 + iCharAt12;
                obj = objArr[i22];
                if (obj instanceof Field) {
                    fieldOooOOO2 = (Field) obj;
                } else {
                    fieldOooOOO2 = OooOOO(cls2, (String) obj);
                    objArr[i22] = fieldOooOOO2;
                }
                i16 = i28;
                iArr2 = iArr4;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldOooOOO2);
                i23 = i22 + 1;
                obj2 = objArr[i23];
                if (obj2 instanceof Field) {
                    fieldOooOOO3 = (Field) obj2;
                } else {
                    fieldOooOOO3 = OooOOO(cls2, (String) obj2);
                    objArr[i23] = fieldOooOOO3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOOO3);
                iObjectFieldOffset = iObjectFieldOffset4;
                cls = cls2;
                i15 = i80;
                i18 = 0;
                i17 = i2;
                str = str;
            } else {
                i16 = i28;
                iArr2 = iArr4;
                int i84 = i2 + 1;
                Field fieldOooOOO4 = OooOOO(cls2, (String) objArr[i2]);
                if (i74 == 9 || i74 == 17) {
                    int i85 = i63 / 3;
                    objArr2[i85 + i85 + 1] = fieldOooOOO4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        int i86 = i63 / 3;
                        i17 = i84 + 1;
                        objArr2[i86 + i86 + 1] = objArr[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (!z) {
                            int i87 = i63 / 3;
                            i17 = i84 + 1;
                            objArr2[i87 + i87 + 1] = objArr[i84];
                        }
                    } else if (i74 == 50) {
                        int i88 = i60 + 1;
                        iArr[i60] = i63;
                        int i89 = i63 / 3;
                        int i90 = i89 + i89;
                        int i91 = i84 + 1;
                        objArr2[i90] = objArr[i84];
                        if ((iCharAt11 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0) {
                            i84 = i91 + 1;
                            objArr2[i90 + 1] = objArr[i91];
                            i60 = i88;
                        } else {
                            i60 = i88;
                            i84 = i91;
                        }
                    }
                    cls = cls2;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOOO4);
                    if ((iCharAt11 & 4096) == 4096 || i74 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = 0;
                    } else {
                        int i92 = i15 + 1;
                        int iCharAt13 = str.charAt(i15);
                        if (iCharAt13 >= 55296) {
                            int i93 = iCharAt13 & 8191;
                            int i94 = 13;
                            while (true) {
                                i19 = i92 + 1;
                                cCharAt9 = str.charAt(i92);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i93 |= (cCharAt9 & 8191) << i94;
                                i94 += 13;
                                i92 = i19;
                            }
                            iCharAt13 = i93 | (cCharAt9 << i94);
                        } else {
                            i19 = i92;
                        }
                        int i95 = (iCharAt13 / 32) + i16 + i16;
                        Object obj3 = objArr[i95];
                        if (obj3 instanceof Field) {
                            fieldOooOOO = (Field) obj3;
                        } else {
                            fieldOooOOO = OooOOO(cls, (String) obj3);
                            objArr[i95] = fieldOooOOO;
                        }
                        i18 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOOO);
                        i15 = i19;
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                }
                i17 = i84;
                cls = cls2;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOOO4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                }
                if (i74 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
            }
            int i96 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i97 = i96 + 1;
            iArr2[i96] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (i74 << 20) | iObjectFieldOffset;
            iArr2[i97] = (i18 << 20) | iObjectFieldOffset2;
            i63 = i97 + 1;
            i28 = i16;
            str = str;
            i61 = i15;
            cls2 = cls;
            iCharAt = i75;
            length = i66;
            i2 = i17;
            iCharAt4 = i12;
            iCharAt2 = i14;
            iArr4 = iArr2;
        }
        return new o0O0O0O(iArr4, objArr2, iCharAt, iCharAt2, o0o0oooo.f37423OooO00o, z, iArr, iCharAt4, i59, o0o000o1, o0oo00oo2, oo00oo, o0o00oo2);
    }

    public static float OooOooO(Object obj, long j) {
        return ((Float) o0OO.OooOO0(obj, j)).floatValue();
    }

    public static int Oooo00O(Object obj, long j) {
        return ((Integer) o0OO.OooOO0(obj, j)).intValue();
    }

    public final int OooO(int i) {
        return this.f37403OooO00o[i + 1];
    }

    @Override // p335o0OO00o.oo0OOoo
    public final void OooO00o(Object obj) {
        int i;
        int i2 = this.f37402OooO;
        while (true) {
            i = this.f37411OooOO0;
            if (i2 >= i) {
                break;
            }
            long jOooO = OooO(this.f37410OooO0oo[i2]) & 1048575;
            Object objOooOO0 = o0OO.OooOO0(obj, jOooO);
            if (objOooOO0 != null) {
                ((zzlf) objOooOO0).zzc();
                o0OO.OooOOo(obj, jOooO, objOooOO0);
            }
            i2++;
        }
        int length = this.f37410OooO0oo.length;
        while (i < length) {
            this.f37412OooOO0O.OooO00o(obj, this.f37410OooO0oo[i]);
            i++;
        }
        this.f37413OooOO0o.OooO0oO(obj);
        if (this.f37407OooO0o) {
            this.f37414OooOOO0.OooO0O0(obj);
        }
    }

    @Override // p335o0OO00o.oo0OOoo
    public final void OooO0O0(Object obj, byte[] bArr, int i, int i2, o00OO0OO o00oo0oo) throws IOException {
        if (this.f37409OooO0oO) {
            Oooo0O0(obj, bArr, i, i2, o00oo0oo);
        } else {
            OooOoO0(obj, bArr, i, i2, 0, o00oo0oo);
        }
    }

    @Override // p335o0OO00o.oo0OOoo
    public final void OooO0OO(Object obj, o0OOOO0o o0oooo0o2) throws IOException {
        if (!this.f37409OooO0oO) {
            OooOOoo(obj, o0oooo0o2);
            return;
        }
        if (this.f37407OooO0o) {
            this.f37414OooOOO0.OooO00o(obj);
            throw null;
        }
        int length = this.f37403OooO00o.length;
        for (int i = 0; i < length; i += 3) {
            int iOooO = OooO(i);
            int i2 = this.f37403OooO00o[i];
            switch ((iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0oO(i2, o0OO.OooO0o0(obj, iOooO & 1048575));
                    }
                    break;
                case 1:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0O(i2, o0OO.OooO0o(obj, iOooO & 1048575));
                    }
                    break;
                case 2:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOO(i2, o0OO.OooO0oo(obj, iOooO & 1048575));
                    }
                    break;
                case 3:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0Oo(i2, o0OO.OooO0oo(obj, iOooO & 1048575));
                    }
                    break;
                case 4:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOO0(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 5:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0(i2, o0OO.OooO0oo(obj, iOooO & 1048575));
                    }
                    break;
                case 6:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 7:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0o0(i2, o0OO.OooOo0O(obj, iOooO & 1048575));
                    }
                    break;
                case 8:
                    if (OooOo0(obj, i)) {
                        OooOo(i2, o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2);
                    }
                    break;
                case 9:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOOO(i2, o0OO.OooOO0(obj, iOooO & 1048575), OooOO0o(i));
                    }
                    break;
                case 10:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0o(i2, (zzjd) o0OO.OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 11:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0OO(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 12:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0oo(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 13:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOOo(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 14:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOo0(i2, o0OO.OooO0oo(obj, iOooO & 1048575));
                    }
                    break;
                case 15:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO00o(i2, o0OO.OooO0oO(obj, iOooO & 1048575));
                    }
                    break;
                case 16:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0O0(i2, o0OO.OooO0oo(obj, iOooO & 1048575));
                    }
                    break;
                case 17:
                    if (OooOo0(obj, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0o(i2, o0OO.OooOO0(obj, iOooO & 1048575), OooOO0o(i));
                    }
                    break;
                case 18:
                    o0O0o000.OooO0OO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 19:
                    o0O0o000.OooO0oO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 20:
                    o0O0o000.OooOO0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 21:
                    o0O0o000.OooOOo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 22:
                    o0O0o000.OooO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 23:
                    o0O0o000.OooO0o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 24:
                    o0O0o000.OooO0o0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 25:
                    o0O0o000.OooO00o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 26:
                    o0O0o000.OooOOOo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2);
                    break;
                case 27:
                    o0O0o000.OooOO0O(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, OooOO0o(i));
                    break;
                case 28:
                    o0O0o000.OooO0O0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2);
                    break;
                case 29:
                    o0O0o000.OooOOo0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 30:
                    o0O0o000.OooO0Oo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 31:
                    o0O0o000.OooOO0o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 32:
                    o0O0o000.OooOOO0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 33:
                    o0O0o000.OooOOO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 34:
                    o0O0o000.OooOOOO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, false);
                    break;
                case 35:
                    o0O0o000.OooO0OO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 36:
                    o0O0o000.OooO0oO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 37:
                    o0O0o000.OooOO0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 38:
                    o0O0o000.OooOOo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 39:
                    o0O0o000.OooO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 40:
                    o0O0o000.OooO0o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 41:
                    o0O0o000.OooO0o0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 42:
                    o0O0o000.OooO00o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 43:
                    o0O0o000.OooOOo0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 44:
                    o0O0o000.OooO0Oo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 45:
                    o0O0o000.OooOO0o(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 46:
                    o0O0o000.OooOOO0(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 47:
                    o0O0o000.OooOOO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 48:
                    o0O0o000.OooOOOO(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, true);
                    break;
                case 49:
                    o0O0o000.OooO0oo(i2, (List) o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2, OooOO0o(i));
                    break;
                case 50:
                    if (o0OO.OooOO0(obj, iOooO & 1048575) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0oO(i2, OooOoo(obj, iOooO & 1048575));
                    }
                    break;
                case 52:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0O(i2, OooOooO(obj, iOooO & 1048575));
                    }
                    break;
                case 53:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOO(i2, OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 54:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0Oo(i2, OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 55:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOO0(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 56:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0(i2, OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 57:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 58:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0o0(i2, OooOo0o(obj, iOooO & 1048575));
                    }
                    break;
                case 59:
                    if (OooOo0O(obj, i2, i)) {
                        OooOo(i2, o0OO.OooOO0(obj, iOooO & 1048575), o0oooo0o2);
                    }
                    break;
                case 60:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOOO(i2, o0OO.OooOO0(obj, iOooO & 1048575), OooOO0o(i));
                    }
                    break;
                case 61:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0o(i2, (zzjd) o0OO.OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 62:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0OO(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 63:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0oo(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 64:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOOo(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 65:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOOo0(i2, OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 66:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO00o(i2, Oooo00O(obj, iOooO & 1048575));
                    }
                    break;
                case 67:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooO0O0(i2, OooOO0(obj, iOooO & 1048575));
                    }
                    break;
                case 68:
                    if (OooOo0O(obj, i2, i)) {
                        ((o00Oo00) o0oooo0o2).OooOO0o(i2, o0OO.OooOO0(obj, iOooO & 1048575), OooOO0o(i));
                    }
                    break;
            }
        }
        o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
        o0oo00oo2.OooO(o0oo00oo2.OooO0OO(obj), o0oooo0o2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0 A[LOOP:1: B:49:0x00af->B:54:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4 A[SYNTHETIC] */
    @Override // p335o0OO00o.oo0OOoo
    public final boolean OooO0Oo(Object obj) {
        List list;
        oo0OOoo oo0ooooOooOO0o;
        int i;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (true) {
            boolean zOooOo0 = true;
            if (i2 >= this.f37402OooO) {
                if (!this.f37407OooO0o) {
                    return true;
                }
                this.f37414OooOOO0.OooO00o(obj);
                throw null;
            }
            int i5 = this.f37410OooO0oo[i2];
            int i6 = this.f37403OooO00o[i5];
            int iOooO = OooO(i5);
            int i7 = this.f37403OooO00o[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f37401OooOOOO.getInt(obj, i8);
                }
                i3 = i8;
            }
            if ((268435456 & iOooO) != 0) {
                if (!(i3 == 1048575 ? OooOo0(obj, i5) : (i4 & i9) != 0)) {
                    return false;
                }
            }
            int i10 = (iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 == 9 || i10 == 17) {
                if (i3 == 1048575) {
                    zOooOo0 = OooOo0(obj, i5);
                } else if ((i4 & i9) == 0) {
                    zOooOo0 = false;
                }
                if (zOooOo0 && !OooOO0o(i5).OooO0Oo(o0OO.OooOO0(obj, iOooO & 1048575))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) o0OO.OooOO0(obj, iOooO & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    oo0ooooOooOO0o = OooOO0o(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!oo0ooooOooOO0o.OooO0Oo(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i10 == 60 || i10 == 68) {
                if (OooOo0O(obj, i6, i5) && !OooOO0o(i5).OooO0Oo(o0OO.OooOO0(obj, iOooO & 1048575))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) o0OO.OooOO0(obj, iOooO & 1048575);
                if (list.isEmpty()) {
                    oo0ooooOooOO0o = OooOO0o(i5);
                    while (i < list.size()) {
                        if (!oo0ooooOooOO0o.OooO0Oo(list.get(i))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i10 == 50 && !((zzlf) o0OO.OooOO0(obj, iOooO & 1048575)).isEmpty()) {
                throw null;
            }
            i2++;
        }
    }

    @Override // p335o0OO00o.oo0OOoo
    public final int OooO0o(Object obj) {
        return this.f37409OooO0oO ? Oooo000(obj) : OooOooo(obj);
    }

    @Override // p335o0OO00o.oo0OOoo
    public final int OooO0o0(Object obj) {
        int i;
        int iZzc;
        int length = this.f37403OooO00o.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iOooO = OooO(i3);
            int i4 = this.f37403OooO00o[i3];
            long j = 1048575 & iOooO;
            int iHashCode = 37;
            switch ((iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(Double.doubleToLongBits(o0OO.OooO0o0(obj, j)));
                    i2 = iZzc + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(o0OO.OooO0o(obj, j));
                    i2 = iZzc + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(o0OO.OooO0oo(obj, j));
                    i2 = iZzc + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(o0OO.OooO0oo(obj, j));
                    i2 = iZzc + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(o0OO.OooO0oo(obj, j));
                    i2 = iZzc + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkm.zza(o0OO.OooOo0O(obj, j));
                    i2 = iZzc + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) o0OO.OooOO0(obj, j)).hashCode();
                    i2 = iZzc + i;
                    break;
                case 9:
                    Object objOooOO0 = o0OO.OooOO0(obj, j);
                    if (objOooOO0 != null) {
                        iHashCode = objOooOO0.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = o0OO.OooOO0(obj, j).hashCode();
                    i2 = iZzc + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(o0OO.OooO0oo(obj, j));
                    i2 = iZzc + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = o0OO.OooO0oO(obj, j);
                    i2 = iZzc + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(o0OO.OooO0oo(obj, j));
                    i2 = iZzc + i;
                    break;
                case 17:
                    Object objOooOO1 = o0OO.OooOO0(obj, j);
                    if (objOooOO1 != null) {
                        iHashCode = objOooOO1.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzc = o0OO.OooOO0(obj, j).hashCode();
                    i2 = iZzc + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = o0OO.OooOO0(obj, j).hashCode();
                    i2 = iZzc + i;
                    break;
                case 51:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(Double.doubleToLongBits(OooOoo(obj, j)));
                        i2 = iZzc + i;
                    }
                    break;
                case 52:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(OooOooO(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 53:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(OooOO0(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 54:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(OooOO0(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 55:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 56:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(OooOO0(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 57:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 58:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zza(OooOo0o(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 59:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) o0OO.OooOO0(obj, j)).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 60:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = o0OO.OooOO0(obj, j).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 61:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = o0OO.OooOO0(obj, j).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 62:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 63:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 64:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 65:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(OooOO0(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 66:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Oooo00O(obj, j);
                        i2 = iZzc + i;
                    }
                    break;
                case 67:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(OooOO0(obj, j));
                        i2 = iZzc + i;
                    }
                    break;
                case 68:
                    if (OooOo0O(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = o0OO.OooOO0(obj, j).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f37413OooOO0o.OooO0OO(obj).hashCode() + (i2 * 53);
        if (!this.f37407OooO0o) {
            return iHashCode2;
        }
        this.f37414OooOOO0.OooO00o(obj);
        throw null;
    }

    @Override // p335o0OO00o.oo0OOoo
    public final void OooO0oO(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f37403OooO00o.length; i += 3) {
            int iOooO = OooO(i);
            long j = 1048575 & iOooO;
            int i2 = this.f37403OooO00o[i];
            switch ((iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOO(obj, j, o0OO.OooO0o0(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 1:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOO(obj, j, o0OO.OooO0o(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 2:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo0(obj, j, o0OO.OooO0oo(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 3:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo0(obj, j, o0OO.OooO0oo(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 4:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 5:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo0(obj, j, o0OO.OooO0oo(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 6:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 7:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOO0(obj, j, o0OO.OooOo0O(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 8:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo(obj, j, o0OO.OooOO0(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 9:
                    OooOOOO(obj, obj2, i);
                    break;
                case 10:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo(obj, j, o0OO.OooOO0(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 11:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 12:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 13:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 14:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo0(obj, j, o0OO.OooO0oo(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 15:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOOo(obj, j, o0OO.OooO0oO(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 16:
                    if (OooOo0(obj2, i)) {
                        o0OO.OooOOo0(obj, j, o0OO.OooO0oo(obj2, j));
                        OooOOo0(obj, i);
                    }
                    break;
                case 17:
                    OooOOOO(obj, obj2, i);
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
                    this.f37412OooOO0O.OooO0O0(obj, obj2, j);
                    break;
                case 50:
                    Class cls = o0O0o000.f37430OooO00o;
                    o0OO.OooOOo(obj, j, o0O00OO.OooO0O0(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j)));
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
                    if (OooOo0O(obj2, i2, i)) {
                        o0OO.OooOOo(obj, j, o0OO.OooOO0(obj2, j));
                        OooOOo(obj, i2, i);
                    }
                    break;
                case 60:
                    OooOOOo(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (OooOo0O(obj2, i2, i)) {
                        o0OO.OooOOo(obj, j, o0OO.OooOO0(obj2, j));
                        OooOOo(obj, i2, i);
                    }
                    break;
                case 68:
                    OooOOOo(obj, obj2, i);
                    break;
            }
        }
        o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
        Class cls2 = o0O0o000.f37430OooO00o;
        o0oo00oo2.OooO0oo(obj, o0oo00oo2.OooO0Oo(o0oo00oo2.OooO0OO(obj), o0oo00oo2.OooO0OO(obj2)));
        if (this.f37407OooO0o) {
            this.f37414OooOOO0.OooO00o(obj2);
            throw null;
        }
    }

    @Override // p335o0OO00o.oo0OOoo
    public final boolean OooO0oo(Object obj, Object obj2) {
        boolean zOooOOoo;
        int length = this.f37403OooO00o.length;
        for (int i = 0; i < length; i += 3) {
            int iOooO = OooO(i);
            long j = iOooO & 1048575;
            switch ((iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (!OooOo00(obj, obj2, i) || Double.doubleToLongBits(o0OO.OooO0o0(obj, j)) != Double.doubleToLongBits(o0OO.OooO0o0(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!OooOo00(obj, obj2, i) || Float.floatToIntBits(o0OO.OooO0o(obj, j)) != Float.floatToIntBits(o0OO.OooO0o(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oo(obj, j) != o0OO.OooO0oo(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oo(obj, j) != o0OO.OooO0oo(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oo(obj, j) != o0OO.OooO0oo(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooOo0O(obj, j) != o0OO.OooOo0O(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!OooOo00(obj, obj2, i) || !o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!OooOo00(obj, obj2, i) || !o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!OooOo00(obj, obj2, i) || !o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oo(obj, j) != o0OO.OooO0oo(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oO(obj, j) != o0OO.OooO0oO(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!OooOo00(obj, obj2, i) || o0OO.OooO0oo(obj, j) != o0OO.OooO0oo(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!OooOo00(obj, obj2, i) || !o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j))) {
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
                    zOooOOoo = o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j));
                    break;
                case 50:
                    zOooOOoo = o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j));
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
                    long jOooo0o0 = Oooo0o0(i) & 1048575;
                    if (o0OO.OooO0oO(obj, jOooo0o0) != o0OO.OooO0oO(obj2, jOooo0o0) || !o0O0o000.OooOOoo(o0OO.OooOO0(obj, j), o0OO.OooOO0(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zOooOOoo) {
                return false;
            }
        }
        if (!this.f37413OooOO0o.OooO0OO(obj).equals(this.f37413OooOO0o.OooO0OO(obj2))) {
            return false;
        }
        if (!this.f37407OooO0o) {
            return true;
        }
        this.f37414OooOOO0.OooO00o(obj);
        this.f37414OooOOO0.OooO00o(obj2);
        throw null;
    }

    public final zzki OooOO0O(int i) {
        int i2 = i / 3;
        return (zzki) this.f37404OooO0O0[i2 + i2 + 1];
    }

    public final oo0OOoo OooOO0o(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f37404OooO0O0;
        oo0OOoo oo0oooo = (oo0OOoo) objArr[i3];
        if (oo0oooo != null) {
            return oo0oooo;
        }
        oo0OOoo oo0ooooOooO00o = o0O0OO0.f37417OooO0OO.OooO00o((Class) objArr[i3 + 1]);
        this.f37404OooO0O0[i3] = oo0ooooOooO00o;
        return oo0ooooOooO00o;
    }

    public final Object OooOOO0(int i) {
        int i2 = i / 3;
        return this.f37404OooO0O0[i2 + i2];
    }

    public final void OooOOOO(Object obj, Object obj2, int i) {
        long jOooO = OooO(i) & 1048575;
        if (OooOo0(obj2, i)) {
            Object objOooOO0 = o0OO.OooOO0(obj, jOooO);
            Object objOooOO1 = o0OO.OooOO0(obj2, jOooO);
            if (objOooOO0 != null && objOooOO1 != null) {
                o0OO.OooOOo(obj, jOooO, zzkm.OooO00o(objOooOO0, objOooOO1));
                OooOOo0(obj, i);
            } else if (objOooOO1 != null) {
                o0OO.OooOOo(obj, jOooO, objOooOO1);
                OooOOo0(obj, i);
            }
        }
    }

    public final void OooOOOo(Object obj, Object obj2, int i) {
        int iOooO = OooO(i);
        int i2 = this.f37403OooO00o[i];
        long j = iOooO & 1048575;
        if (OooOo0O(obj2, i2, i)) {
            Object objOooOO0 = OooOo0O(obj, i2, i) ? o0OO.OooOO0(obj, j) : null;
            Object objOooOO1 = o0OO.OooOO0(obj2, j);
            if (objOooOO0 != null && objOooOO1 != null) {
                o0OO.OooOOo(obj, j, zzkm.OooO00o(objOooOO0, objOooOO1));
                OooOOo(obj, i2, i);
            } else if (objOooOO1 != null) {
                o0OO.OooOOo(obj, j, objOooOO1);
                OooOOo(obj, i2, i);
            }
        }
    }

    public final void OooOOo(Object obj, int i, int i2) {
        o0OO.OooOOOo(obj, Oooo0o0(i2) & 1048575, i);
    }

    public final void OooOOo0(Object obj, int i) {
        int iOooo0o0 = Oooo0o0(i);
        long j = 1048575 & iOooo0o0;
        if (j == 1048575) {
            return;
        }
        o0OO.OooOOOo(obj, j, (1 << (iOooo0o0 >>> 20)) | o0OO.OooO0oO(obj, j));
    }

    public final void OooOOoo(Object obj, o0OOOO0o o0oooo0o2) throws IOException {
        int i;
        if (this.f37407OooO0o) {
            this.f37414OooOOO0.OooO00o(obj);
            throw null;
        }
        int length = this.f37403OooO00o.length;
        Unsafe unsafe = f37401OooOOOO;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iOooO = OooO(i3);
            int[] iArr = this.f37403OooO00o;
            int i6 = iArr[i3];
            int i7 = (iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i7 <= 17) {
                int i8 = iArr[i3 + 2];
                int i9 = i8 & i2;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iOooO & i2;
            switch (i7) {
                case 0:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0oO(i6, o0OO.OooO0o0(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOO0O(i6, o0OO.OooO0o(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOOO(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0Oo(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOOO0(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOO0(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0o0(i6, o0OO.OooOo0O(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        OooOo(i6, unsafe.getObject(obj, j), o0oooo0o2);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOOOO(i6, unsafe.getObject(obj, j), OooOO0o(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0o(i6, (zzjd) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0OO(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0oo(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOOOo(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOOo0(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO00o(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooO0O0(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        ((o00Oo00) o0oooo0o2).OooOO0o(i6, unsafe.getObject(obj, j), OooOO0o(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    o0O0o000.OooO0OO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    o0O0o000.OooO0oO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    o0O0o000.OooOO0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    o0O0o000.OooOOo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    o0O0o000.OooO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    o0O0o000.OooO0o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    o0O0o000.OooO0o0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    o0O0o000.OooO00o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    o0O0o000.OooOOOo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2);
                    break;
                case 27:
                    o0O0o000.OooOO0O(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, OooOO0o(i3));
                    break;
                case 28:
                    o0O0o000.OooO0O0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2);
                    break;
                case 29:
                    o0O0o000.OooOOo0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 30:
                    o0O0o000.OooO0Oo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 31:
                    o0O0o000.OooOO0o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 32:
                    o0O0o000.OooOOO0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 33:
                    o0O0o000.OooOOO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 34:
                    o0O0o000.OooOOOO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, false);
                    break;
                case 35:
                    o0O0o000.OooO0OO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 36:
                    o0O0o000.OooO0oO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 37:
                    o0O0o000.OooOO0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 38:
                    o0O0o000.OooOOo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 39:
                    o0O0o000.OooO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 40:
                    o0O0o000.OooO0o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 41:
                    o0O0o000.OooO0o0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 42:
                    o0O0o000.OooO00o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 43:
                    o0O0o000.OooOOo0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 44:
                    o0O0o000.OooO0Oo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 45:
                    o0O0o000.OooOO0o(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 46:
                    o0O0o000.OooOOO0(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 47:
                    o0O0o000.OooOOO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 48:
                    o0O0o000.OooOOOO(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, true);
                    break;
                case 49:
                    o0O0o000.OooO0oo(this.f37403OooO00o[i3], (List) unsafe.getObject(obj, j), o0oooo0o2, OooOO0o(i3));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0oO(i6, OooOoo(obj, j));
                    }
                    break;
                case 52:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOO0O(i6, OooOooO(obj, j));
                    }
                    break;
                case 53:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOOO(i6, OooOO0(obj, j));
                    }
                    break;
                case 54:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0Oo(i6, OooOO0(obj, j));
                    }
                    break;
                case 55:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOOO0(i6, Oooo00O(obj, j));
                    }
                    break;
                case 56:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOO0(i6, OooOO0(obj, j));
                    }
                    break;
                case 57:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO(i6, Oooo00O(obj, j));
                    }
                    break;
                case 58:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0o0(i6, OooOo0o(obj, j));
                    }
                    break;
                case 59:
                    if (OooOo0O(obj, i6, i3)) {
                        OooOo(i6, unsafe.getObject(obj, j), o0oooo0o2);
                    }
                    break;
                case 60:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOOOO(i6, unsafe.getObject(obj, j), OooOO0o(i3));
                    }
                    break;
                case 61:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0o(i6, (zzjd) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0OO(i6, Oooo00O(obj, j));
                    }
                    break;
                case 63:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0oo(i6, Oooo00O(obj, j));
                    }
                    break;
                case 64:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOOOo(i6, Oooo00O(obj, j));
                    }
                    break;
                case 65:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOOo0(i6, OooOO0(obj, j));
                    }
                    break;
                case 66:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO00o(i6, Oooo00O(obj, j));
                    }
                    break;
                case 67:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooO0O0(i6, OooOO0(obj, j));
                    }
                    break;
                case 68:
                    if (OooOo0O(obj, i6, i3)) {
                        ((o00Oo00) o0oooo0o2).OooOO0o(i6, unsafe.getObject(obj, j), OooOO0o(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
        o0oo00oo2.OooO(o0oo00oo2.OooO0OO(obj), o0oooo0o2);
    }

    public final boolean OooOo0(Object obj, int i) {
        int iOooo0o0 = Oooo0o0(i);
        long j = iOooo0o0 & 1048575;
        if (j != 1048575) {
            return (o0OO.OooO0oO(obj, j) & (1 << (iOooo0o0 >>> 20))) != 0;
        }
        int iOooO = OooO(i);
        long j2 = iOooO & 1048575;
        switch ((iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
            case 0:
                return Double.doubleToRawLongBits(o0OO.OooO0o0(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0OO.OooO0o(obj, j2)) != 0;
            case 2:
                return o0OO.OooO0oo(obj, j2) != 0;
            case 3:
                return o0OO.OooO0oo(obj, j2) != 0;
            case 4:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 5:
                return o0OO.OooO0oo(obj, j2) != 0;
            case 6:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 7:
                return o0OO.OooOo0O(obj, j2);
            case 8:
                Object objOooOO0 = o0OO.OooOO0(obj, j2);
                if (objOooOO0 instanceof String) {
                    return !((String) objOooOO0).isEmpty();
                }
                if (objOooOO0 instanceof zzjd) {
                    return !zzjd.zzb.equals(objOooOO0);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0OO.OooOO0(obj, j2) != null;
            case 10:
                return !zzjd.zzb.equals(o0OO.OooOO0(obj, j2));
            case 11:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 12:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 13:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 14:
                return o0OO.OooO0oo(obj, j2) != 0;
            case 15:
                return o0OO.OooO0oO(obj, j2) != 0;
            case 16:
                return o0OO.OooO0oo(obj, j2) != 0;
            case 17:
                return o0OO.OooOO0(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean OooOo00(Object obj, Object obj2, int i) {
        return OooOo0(obj, i) == OooOo0(obj2, i);
    }

    public final boolean OooOo0O(Object obj, int i, int i2) {
        return o0OO.OooO0oO(obj, (long) (Oooo0o0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooOoO0(Object obj, byte[] bArr, int i, int i2, int i3, o00OO0OO o00oo0oo) throws IOException {
        Unsafe unsafe;
        Object obj2;
        o0O0O0O<T> o0o0o0o;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        o00OO0OO o00oo0oo2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iOooOOO0;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        o0O0O0O<T> o0o0o0o2 = this;
        Object obj3 = obj;
        o00OO0OO o00oo0oo3 = o00oo0oo;
        Unsafe unsafe2 = f37401OooOOOO;
        byte[] bArr2 = bArr;
        int iOooO = i;
        int i32 = i3;
        int i33 = i2;
        int i34 = -1;
        int i35 = 0;
        int i36 = 1048575;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            if (iOooO < i33) {
                int iOooOO0O = iOooO + 1;
                int i39 = bArr2[iOooO];
                if (i39 < 0) {
                    iOooOO0O = oo0O.OooOO0O(i39, bArr2, iOooOO0O, o00oo0oo3);
                    i39 = o00oo0oo3.f37352OooO00o;
                }
                int i40 = i39 >>> 3;
                int i41 = i39 & 7;
                int i42 = i39;
                int iOooo0o = i40 > i34 ? (i40 < o0o0o0o2.f37405OooO0OO || i40 > o0o0o0o2.f37406OooO0Oo) ? -1 : o0o0o0o2.Oooo0o(i40, i35 / 3) : (i40 < o0o0o0o2.f37405OooO0OO || i40 > o0o0o0o2.f37406OooO0Oo) ? -1 : o0o0o0o2.Oooo0o(i40, 0);
                if (iOooo0o == -1) {
                    i5 = i32;
                    i6 = i36;
                    i7 = iOooOO0O;
                    i8 = i40;
                    unsafe = unsafe2;
                    o0o0o0o = o0o0o0o2;
                    i9 = 0;
                    i4 = i42 == true ? 1 : 0;
                } else {
                    int[] iArr = o0o0o0o2.f37403OooO00o;
                    int i43 = iArr[iOooo0o + 1];
                    int i44 = (i43 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i45 = iOooOO0O;
                    i8 = i40;
                    long j = i43 & 1048575;
                    if (i44 <= 17) {
                        int i46 = iArr[iOooo0o + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i36) {
                            if (i36 != 1048575) {
                                unsafe2.putInt(obj3, i36, i37);
                            }
                            i11 = unsafe2.getInt(obj3, i48);
                            i12 = i48;
                        } else {
                            i11 = i37;
                            i12 = i36;
                        }
                        switch (i44) {
                            case 0:
                                i13 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                byte[] bArr3 = bArr2;
                                i14 = i12;
                                i15 = iOooo0o;
                                i16 = i45;
                                if (i41 == 1) {
                                    bArr2 = bArr3;
                                    o0OO.OooOOO(obj3, j, Double.longBitsToDouble(oo0O.OooOOO(bArr3, i16)));
                                    iOooO = i16 + 8;
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i13;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 1:
                                i13 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                byte[] bArr4 = bArr2;
                                i14 = i12;
                                i15 = iOooo0o;
                                i16 = i45;
                                if (i41 == 5) {
                                    o0OO.OooOOOO(obj3, j, Float.intBitsToFloat(oo0O.OooO0O0(bArr4, i16)));
                                    iOooO = i16 + 4;
                                    bArr2 = bArr4;
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i13;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 2:
                            case 3:
                                i13 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i15 = iOooo0o;
                                i16 = i45;
                                if (i41 == 0) {
                                    iOooOOO0 = oo0O.OooOOO0(bArr2, i16, o00oo0oo3);
                                    long j2 = o00oo0oo3.f37353OooO0O0;
                                    i17 = i13 == true ? 1 : 0;
                                    unsafe2.putLong(obj, j, j2);
                                    i21 = i11 | i47;
                                    i22 = i33;
                                    bArr2 = bArr2;
                                    i23 = i17;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i24 = i13;
                                    i25 = i24;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 4:
                            case 11:
                                i13 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i15 = iOooo0o;
                                i16 = i45;
                                if (i41 == 0) {
                                    iOooO = oo0O.OooOO0(bArr2, i16, o00oo0oo3);
                                    unsafe2.putInt(obj3, j, o00oo0oo3.f37352OooO00o);
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i24 = i13;
                                    i25 = i24;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 5:
                            case 14:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 1) {
                                    unsafe2.putLong(obj, j, oo0O.OooOOO(bArr2, i19));
                                    iOooO = i19 + 8;
                                    i26 = i11 | i47;
                                    i13 = i18 == true ? 1 : 0;
                                    bArr2 = bArr2;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 6:
                            case 13:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj3, j, oo0O.OooO0O0(bArr2, i19));
                                    iOooO = i19 + 4;
                                    i13 = i18;
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 7:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 0) {
                                    int iOooOOO1 = oo0O.OooOOO0(bArr2, i19, o00oo0oo3);
                                    o0OO.OooOOO0(obj3, j, o00oo0oo3.f37353OooO0O0 != 0);
                                    i13 = i18 == true ? 1 : 0;
                                    iOooO = iOooOOO1;
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 8:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 2) {
                                    iOooO = (i43 & 536870912) == 0 ? oo0O.OooO0oO(bArr2, i19, o00oo0oo3) : oo0O.OooO0oo(bArr2, i19, o00oo0oo3);
                                    unsafe2.putObject(obj3, j, o00oo0oo3.f37354OooO0OO);
                                    i13 = i18;
                                    i26 = i11 | i47;
                                    i38 = i13;
                                    i35 = i15;
                                    i34 = i8;
                                    i36 = i14;
                                    i37 = i26;
                                    i32 = i3;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 9:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 2) {
                                    iOooO = oo0O.OooO0Oo(o0o0o0o2.OooOO0o(i15), bArr2, i19, i33, o00oo0oo3);
                                    if ((i11 & i47) == 0) {
                                        unsafe2.putObject(obj3, j, o00oo0oo3.f37354OooO0OO);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkm.OooO00o(unsafe2.getObject(obj3, j), o00oo0oo3.f37354OooO0OO));
                                    }
                                    iOooOOO0 = iOooO;
                                    i21 = i11 | i47;
                                    i22 = i33;
                                    i23 = i18;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 10:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 2) {
                                    iOooO = oo0O.OooO00o(bArr2, i19, o00oo0oo3);
                                    unsafe2.putObject(obj3, j, o00oo0oo3.f37354OooO0OO);
                                    iOooOOO0 = iOooO;
                                    i21 = i11 | i47;
                                    i22 = i33;
                                    i23 = i18;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 12:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 0) {
                                    iOooO = oo0O.OooOO0(bArr2, i19, o00oo0oo3);
                                    int i49 = o00oo0oo3.f37352OooO00o;
                                    zzki zzkiVarOooOO0O = o0o0o0o2.OooOO0O(i15);
                                    if (zzkiVarOooOO0O == null || zzkiVarOooOO0O.zza(i49)) {
                                        unsafe2.putInt(obj3, j, i49);
                                        iOooOOO0 = iOooO;
                                        i21 = i11 | i47;
                                        i22 = i33;
                                        i23 = i18;
                                        i36 = i14;
                                        i11 = i21;
                                        iOooO = iOooOOO0;
                                        i20 = i23;
                                        i33 = i22;
                                    } else {
                                        OooOoO(obj).OooO0O0(i18 == true ? 1 : 0, Long.valueOf(i49));
                                        i36 = i14;
                                        i20 = i18 == true ? 1 : 0;
                                    }
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 15:
                                i18 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i19 = i45;
                                i15 = iOooo0o;
                                if (i41 == 0) {
                                    iOooO = oo0O.OooOO0(bArr2, i19, o00oo0oo3);
                                    unsafe2.putInt(obj3, j, zzjh.zzb(o00oo0oo3.f37352OooO00o));
                                    iOooOOO0 = iOooO;
                                    i21 = i11 | i47;
                                    i22 = i33;
                                    i23 = i18;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i25 = i18 == true ? 1 : 0;
                                    i16 = i19;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            case 16:
                                if (i41 == 0) {
                                    o00oo0oo3 = o00oo0oo;
                                    iOooOOO0 = oo0O.OooOOO0(bArr2, i45, o00oo0oo3);
                                    long jZzc = zzjh.zzc(o00oo0oo3.f37353OooO0O0);
                                    i14 = i12;
                                    i15 = iOooo0o;
                                    i17 = i42 == true ? 1 : 0;
                                    unsafe2.putLong(obj, j, jZzc);
                                    i21 = i11 | i47;
                                    i22 = i33;
                                    bArr2 = bArr2;
                                    i23 = i17;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i24 = i42 == true ? 1 : 0;
                                    i14 = i12;
                                    i15 = iOooo0o;
                                    i16 = i45;
                                    i25 = i24;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                            default:
                                i13 = i42 == true ? 1 : 0;
                                o00oo0oo3 = o00oo0oo;
                                i14 = i12;
                                i15 = iOooo0o;
                                i16 = i45;
                                if (i41 == 3) {
                                    i23 = i13 == true ? 1 : 0;
                                    int iOooO0OO = oo0O.OooO0OO(o0o0o0o2.OooOO0o(i15), bArr, i16, i2, (i8 << 3) | 4, o00oo0oo);
                                    if ((i11 & i47) == 0) {
                                        unsafe2.putObject(obj3, j, o00oo0oo3.f37354OooO0OO);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkm.OooO00o(unsafe2.getObject(obj3, j), o00oo0oo3.f37354OooO0OO));
                                    }
                                    bArr2 = bArr;
                                    iOooOOO0 = iOooO0OO;
                                    i21 = i11 | i47;
                                    i22 = i2;
                                    i36 = i14;
                                    i11 = i21;
                                    iOooO = iOooOOO0;
                                    i20 = i23;
                                    i33 = i22;
                                    i32 = i3;
                                    i35 = i15;
                                    i38 = i20;
                                    i37 = i11;
                                    i34 = i8;
                                } else {
                                    i25 = i13;
                                    i6 = i14;
                                    i7 = i16;
                                    i4 = i25;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i37 = i11;
                                    o0o0o0o = o0o0o0o2;
                                    i5 = i3;
                                }
                                break;
                        }
                    } else {
                        i11 = i37;
                        i15 = iOooo0o;
                        if (i44 != 27) {
                            i6 = i36;
                            if (i44 <= 49) {
                                i28 = i42 == true ? 1 : 0;
                                i30 = i11;
                                unsafe = unsafe2;
                                i29 = i15;
                                iOooO = Oooo0OO(obj, bArr, i45, i2, i42 == true ? 1 : 0, i8, i41, i15, i43, i44, j, o00oo0oo);
                                o0o0o0o = this;
                                if (iOooO != i45) {
                                    i9 = i29;
                                } else {
                                    i31 = iOooO;
                                    i9 = i29;
                                    i5 = i3;
                                    i7 = i31;
                                    i4 = i28;
                                    i37 = i30;
                                }
                            } else {
                                i27 = i45;
                                i28 = i42 == true ? 1 : 0;
                                i29 = i15;
                                unsafe = unsafe2;
                                i30 = i11;
                                if (i44 != 50) {
                                    o0o0o0o = this;
                                    i9 = i29;
                                    iOooO = Oooo0(obj, bArr, i27, i2, i28 == true ? 1 : 0, i8, i41, i43, i44, j, i29, o00oo0oo);
                                    if (iOooO == i27) {
                                        i31 = iOooO;
                                    }
                                } else if (i41 == 2) {
                                    Oooo00o(obj, i29, j);
                                    throw null;
                                }
                                i5 = i3;
                                i7 = i31;
                                i4 = i28;
                                i37 = i30;
                            }
                            bArr2 = bArr;
                            i33 = i2;
                            i32 = i3;
                            o00oo0oo3 = o00oo0oo;
                            o0o0o0o2 = o0o0o0o;
                            i35 = i9;
                            i36 = i6;
                            i34 = i8;
                            i38 = i28;
                            i37 = i30;
                            unsafe2 = unsafe;
                            obj3 = obj;
                        } else if (i41 == 2) {
                            zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj3, j);
                            if (!zzklVarZzd.zzc()) {
                                int size = zzklVarZzd.size();
                                zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzklVarZzd);
                            }
                            zzkl zzklVar = zzklVarZzd;
                            oo0OOoo oo0ooooOooOO0o = o0o0o0o2.OooOO0o(i15);
                            i20 = i42 == true ? 1 : 0;
                            iOooO = oo0O.OooO0o0(oo0ooooOooOO0o, i42 == true ? 1 : 0, bArr, i45, i2, zzklVar, o00oo0oo);
                            bArr2 = bArr;
                            i33 = i2;
                            i36 = i36;
                            i32 = i3;
                            i35 = i15;
                            i38 = i20;
                            i37 = i11;
                            i34 = i8;
                        } else {
                            i6 = i36;
                            i27 = i45;
                            i28 = i42 == true ? 1 : 0;
                            i29 = i15;
                            unsafe = unsafe2;
                            i30 = i11;
                        }
                        o0o0o0o = this;
                        i31 = i27;
                        i9 = i29;
                        i5 = i3;
                        i7 = i31;
                        i4 = i28;
                        i37 = i30;
                    }
                }
                if (i4 != i5 || i5 == 0) {
                    if (o0o0o0o.f37407OooO0o) {
                        o00oo0oo2 = o00oo0oo;
                        zzjq zzjqVar = o00oo0oo2.f37355OooO0Oo;
                        if (zzjqVar != zzjq.f15992OooO0OO) {
                            i10 = i8;
                            if (zzjqVar.zzb(o0o0o0o.f37408OooO0o0, i10) != null) {
                                throw null;
                            }
                            iOooO = oo0O.OooO((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, i7, i2, OooOoO(obj), o00oo0oo);
                            obj = obj;
                        }
                        bArr2 = bArr;
                        i32 = i5;
                        o00oo0oo3 = o00oo0oo2;
                        i34 = i10;
                        o0o0o0o2 = o0o0o0o;
                        i35 = i9;
                        i36 = i6;
                        i33 = i2;
                        i38 = i4 == true ? 1 : 0;
                        obj3 = obj;
                        unsafe2 = unsafe;
                    } else {
                        o00oo0oo2 = o00oo0oo;
                    }
                    i10 = i8;
                    iOooO = oo0O.OooO((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, i7, i2, OooOoO(obj), o00oo0oo);
                    bArr2 = bArr;
                    i32 = i5;
                    o00oo0oo3 = o00oo0oo2;
                    i34 = i10;
                    o0o0o0o2 = o0o0o0o;
                    i35 = i9;
                    i36 = i6;
                    i33 = i2;
                    i38 = i4 == true ? 1 : 0;
                    obj3 = obj;
                    unsafe2 = unsafe;
                } else {
                    obj2 = obj;
                    iOooO = i7;
                    i32 = i5;
                    i36 = i6;
                }
            } else {
                unsafe = unsafe2;
                obj2 = obj3;
                o0o0o0o = o0o0o0o2;
                i4 = i38;
            }
        }
        if (i36 != 1048575) {
            unsafe.putInt(obj2, i36, i37);
        }
        for (int i50 = o0o0o0o.f37402OooO; i50 < o0o0o0o.f37411OooOO0; i50++) {
            int i51 = o0o0o0o.f37410OooO0oo[i50];
            int i52 = o0o0o0o.f37403OooO00o[i51];
            Object objOooOO0 = o0OO.OooOO0(obj2, o0o0o0o.OooO(i51) & 1048575);
            if (objOooOO0 != null && o0o0o0o.OooOO0O(i51) != null) {
                throw null;
            }
        }
        if (i32 == 0) {
            if (iOooO != i2) {
                throw zzko.OooO0OO();
            }
        } else if (iOooO > i2 || i4 != i32) {
            throw zzko.OooO0OO();
        }
        return iOooO;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0407  */
    public final int OooOooo(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iOooOooo;
        int iZzA8;
        int iZzB2;
        int size;
        int iOooo0OO;
        int iZzz;
        int iZzA9;
        int i2;
        int iZzz2;
        int iZzA10;
        int iZzA11;
        int iZzd2;
        int iZzA12;
        Unsafe unsafe = f37401OooOOOO;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.f37403OooO00o.length) {
            int iOooO = OooO(i4);
            int[] iArr = this.f37403OooO00o;
            int i8 = iArr[i4];
            int i9 = (iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i9 <= 17) {
                int i10 = iArr[i4 + 2];
                int i11 = i10 & i3;
                i = 1 << (i10 >>> 20);
                if (i11 != i6) {
                    i7 = unsafe.getInt(obj, i11);
                    i6 = i11;
                }
            } else {
                i = 0;
            }
            long j = iOooO & i3;
            switch (i9) {
                case 0:
                    if ((i7 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 1:
                    if ((i7 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 2:
                    if ((i7 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(j2);
                        iOooOooo = iZzB + iZzA3;
                        i5 += iOooOooo;
                    }
                    break;
                case 3:
                    if ((i7 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(j3);
                        iOooOooo = iZzB + iZzA3;
                        i5 += iOooOooo;
                    }
                    break;
                case 4:
                    if ((i7 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(i12);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 5:
                    if ((i7 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 6:
                    if ((i7 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 7:
                    if ((i7 & i) != 0) {
                        iZzA5 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA5 + 1;
                        i5 += iOooOooo;
                    }
                    break;
                case 8:
                    if ((i7 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzjd)) {
                            iZzA4 = zzjl.zzA(i8 << 3);
                            iZzv = zzjl.zzy((String) object);
                            iOooOooo = iZzv + iZzA4;
                            i5 += iOooOooo;
                        } else {
                            iZzA6 = zzjl.zzA(i8 << 3);
                            iZzd = ((zzjd) object).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i5 += iZzA7 + iZzd + iZzA6;
                        }
                    }
                    break;
                case 9:
                    if ((i7 & i) != 0) {
                        iOooOooo = o0O0o000.OooOooo(i8, unsafe.getObject(obj, j), OooOO0o(i4));
                        i5 += iOooOooo;
                    }
                    break;
                case 10:
                    if ((i7 & i) != 0) {
                        zzjd zzjdVar = (zzjd) unsafe.getObject(obj, j);
                        iZzA6 = zzjl.zzA(i8 << 3);
                        iZzd = zzjdVar.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i5 += iZzA7 + iZzd + iZzA6;
                    }
                    break;
                case 11:
                    if ((i7 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA(i13);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 12:
                    if ((i7 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(i14);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 13:
                    if ((i7 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 14:
                    if ((i7 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 15:
                    if ((i7 & i) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA((i15 >> 31) ^ (i15 + i15));
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 16:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA8 = zzjl.zzA(i8 << 3);
                        iZzB2 = zzjl.zzB((j4 >> 63) ^ (j4 + j4));
                        iOooOooo = iZzB2 + iZzA8;
                        i5 += iOooOooo;
                    }
                    break;
                case 17:
                    if ((i7 & i) != 0) {
                        iOooOooo = zzjl.OooO00o(i8, (zzll) unsafe.getObject(obj, j), OooOO0o(i4));
                        i5 += iOooOooo;
                    }
                    break;
                case 18:
                    iOooOooo = o0O0o000.OooOoO0(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 19:
                    iOooOooo = o0O0o000.OooOo0o(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 20:
                    iOooOooo = o0O0o000.OooOoo(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 21:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = o0O0o000.f37430OooO00o;
                    size = list.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo0OO(list);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 22:
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls2 = o0O0o000.f37430OooO00o;
                    size = list2.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.OooOoo0(list2);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 23:
                    iOooOooo = o0O0o000.OooOoO0(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 24:
                    iOooOooo = o0O0o000.OooOo0o(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 25:
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = o0O0o000.f37430OooO00o;
                    int size2 = list3.size();
                    if (size2 == 0) {
                        iZzA9 = 0;
                    } else {
                        iZzA9 = (zzjl.zzA(i8 << 3) + 1) * size2;
                    }
                    i5 += iZzA9;
                    break;
                case 26:
                    iOooOooo = o0O0o000.Oooo0(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 27:
                    iOooOooo = o0O0o000.Oooo000(i8, (List) unsafe.getObject(obj, j), OooOO0o(i4));
                    i5 += iOooOooo;
                    break;
                case 28:
                    iOooOooo = o0O0o000.OooOo0(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    Class cls4 = o0O0o000.f37430OooO00o;
                    size = list4.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo0O0(list4);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    Class cls5 = o0O0o000.f37430OooO00o;
                    size = list5.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.OooOo0O(list5);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 31:
                    iOooOooo = o0O0o000.OooOo0o(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 32:
                    iOooOooo = o0O0o000.OooOoO0(i8, (List) unsafe.getObject(obj, j));
                    i5 += iOooOooo;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(obj, j);
                    Class cls6 = o0O0o000.f37430OooO00o;
                    size = list6.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo00O(list6);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    Class cls7 = o0O0o000.f37430OooO00o;
                    size = list7.size();
                    if (size == 0) {
                        iZzA9 = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo00o(list7);
                        iZzz = zzjl.zzz(i8);
                        i2 = iZzz * size;
                        iZzA9 = i2 + iOooo0OO;
                    }
                    i5 += iZzA9;
                    break;
                case 35:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 36:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 37:
                    iOooo0OO = o0O0o000.OooOooO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 38:
                    iOooo0OO = o0O0o000.Oooo0OO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 39:
                    iOooo0OO = o0O0o000.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 40:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 41:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 42:
                    List list8 = (List) unsafe.getObject(obj, j);
                    Class cls8 = o0O0o000.f37430OooO00o;
                    iOooo0OO = list8.size();
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 43:
                    iOooo0OO = o0O0o000.Oooo0O0((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 44:
                    iOooo0OO = o0O0o000.OooOo0O((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 45:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 46:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 47:
                    iOooo0OO = o0O0o000.Oooo00O((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 48:
                    iOooo0OO = o0O0o000.Oooo00o((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i8);
                        iZzA10 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA10 + iZzz2;
                        iZzA9 = i2 + iOooo0OO;
                        i5 += iZzA9;
                    }
                    break;
                case 49:
                    iOooOooo = o0O0o000.OooOoOO(i8, (List) unsafe.getObject(obj, j), OooOO0o(i4));
                    i5 += iOooOooo;
                    break;
                case 50:
                    o0O00OO.OooO00o(unsafe.getObject(obj, j), OooOOO0(i4));
                    break;
                case 51:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 52:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 53:
                    if (OooOo0O(obj, i8, i4)) {
                        long jOooOO0 = OooOO0(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(jOooOO0);
                        iOooOooo = iZzB + iZzA3;
                        i5 += iOooOooo;
                    }
                    break;
                case 54:
                    if (OooOo0O(obj, i8, i4)) {
                        long jOooOO1 = OooOO0(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(jOooOO1);
                        iOooOooo = iZzB + iZzA3;
                        i5 += iOooOooo;
                    }
                    break;
                case 55:
                    if (OooOo0O(obj, i8, i4)) {
                        int iOooo00O = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(iOooo00O);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 56:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 57:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 58:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA5 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA5 + 1;
                        i5 += iOooOooo;
                    }
                    break;
                case 59:
                    if (OooOo0O(obj, i8, i4)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzjd)) {
                            iZzA4 = zzjl.zzA(i8 << 3);
                            iZzv = zzjl.zzy((String) object2);
                            iOooOooo = iZzv + iZzA4;
                            i5 += iOooOooo;
                        } else {
                            iZzA11 = zzjl.zzA(i8 << 3);
                            iZzd2 = ((zzjd) object2).zzd();
                            iZzA12 = zzjl.zzA(iZzd2);
                            iZzA9 = iZzA12 + iZzd2 + iZzA11;
                            i5 += iZzA9;
                        }
                    }
                    break;
                case 60:
                    if (OooOo0O(obj, i8, i4)) {
                        iOooOooo = o0O0o000.OooOooo(i8, unsafe.getObject(obj, j), OooOO0o(i4));
                        i5 += iOooOooo;
                    }
                    break;
                case 61:
                    if (OooOo0O(obj, i8, i4)) {
                        zzjd zzjdVar2 = (zzjd) unsafe.getObject(obj, j);
                        iZzA11 = zzjl.zzA(i8 << 3);
                        iZzd2 = zzjdVar2.zzd();
                        iZzA12 = zzjl.zzA(iZzd2);
                        iZzA9 = iZzA12 + iZzd2 + iZzA11;
                        i5 += iZzA9;
                    }
                    break;
                case 62:
                    if (OooOo0O(obj, i8, i4)) {
                        int iOooo00O2 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA(iOooo00O2);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 63:
                    if (OooOo0O(obj, i8, i4)) {
                        int iOooo00O3 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(iOooo00O3);
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 64:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA2 + 4;
                        i5 += iOooOooo;
                    }
                    break;
                case 65:
                    if (OooOo0O(obj, i8, i4)) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iOooOooo = iZzA + 8;
                        i5 += iOooOooo;
                    }
                    break;
                case 66:
                    if (OooOo0O(obj, i8, i4)) {
                        int iOooo00O4 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA((iOooo00O4 >> 31) ^ (iOooo00O4 + iOooo00O4));
                        iOooOooo = iZzv + iZzA4;
                        i5 += iOooOooo;
                    }
                    break;
                case 67:
                    if (OooOo0O(obj, i8, i4)) {
                        long jOooOO2 = OooOO0(obj, j);
                        iZzA8 = zzjl.zzA(i8 << 3);
                        iZzB2 = zzjl.zzB((jOooOO2 >> 63) ^ (jOooOO2 + jOooOO2));
                        iOooOooo = iZzB2 + iZzA8;
                        i5 += iOooOooo;
                    }
                    break;
                case 68:
                    if (OooOo0O(obj, i8, i4)) {
                        iOooOooo = zzjl.OooO00o(i8, (zzll) unsafe.getObject(obj, j), OooOO0o(i4));
                        i5 += iOooOooo;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
        int iOooO00o = o0oo00oo2.OooO00o(o0oo00oo2.OooO0OO(obj)) + i5;
        if (!this.f37407OooO0o) {
            return iOooO00o;
        }
        this.f37414OooOOO0.OooO00o(obj);
        throw null;
    }

    public final int Oooo0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, o00OO0OO o00oo0oo) throws IOException {
        Unsafe unsafe = f37401OooOOOO;
        long j2 = this.f37403OooO00o[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(oo0O.OooOOO(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(oo0O.OooO0O0(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOO0 = oo0O.OooOOO0(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, Long.valueOf(o00oo0oo.f37353OooO0O0));
                unsafe.putInt(obj, j2, i4);
                return iOooOOO0;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO0 = oo0O.OooOO0(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, Integer.valueOf(o00oo0oo.f37352OooO00o));
                unsafe.putInt(obj, j2, i4);
                return iOooOO0;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(oo0O.OooOOO(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(oo0O.OooO0O0(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOO1 = oo0O.OooOOO0(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, Boolean.valueOf(o00oo0oo.f37353OooO0O0 != 0));
                unsafe.putInt(obj, j2, i4);
                return iOooOOO1;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iOooOO1 = oo0O.OooOO0(bArr, i, o00oo0oo);
                int i9 = o00oo0oo.f37352OooO00o;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !o0OOOO00.OooO0Oo(bArr, iOooOO1, iOooOO1 + i9)) {
                        throw zzko.OooO00o();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iOooOO1, i9, zzkm.f15998OooO00o));
                    iOooOO1 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iOooOO1;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iOooO0Oo = oo0O.OooO0Oo(OooOO0o(i8), bArr, i, i2, o00oo0oo);
                Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, o00oo0oo.f37354OooO0OO);
                } else {
                    unsafe.putObject(obj, j, zzkm.OooO00o(object, o00oo0oo.f37354OooO0OO));
                }
                unsafe.putInt(obj, j2, i4);
                return iOooO0Oo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iOooO00o = oo0O.OooO00o(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, o00oo0oo.f37354OooO0OO);
                unsafe.putInt(obj, j2, i4);
                return iOooO00o;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO2 = oo0O.OooOO0(bArr, i, o00oo0oo);
                int i10 = o00oo0oo.f37352OooO00o;
                zzki zzkiVarOooOO0O = OooOO0O(i8);
                if (zzkiVarOooOO0O == null || zzkiVarOooOO0O.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    OooOoO(obj).OooO0O0(i3, Long.valueOf(i10));
                }
                return iOooOO2;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iOooOO3 = oo0O.OooOO0(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, Integer.valueOf(zzjh.zzb(o00oo0oo.f37352OooO00o)));
                unsafe.putInt(obj, j2, i4);
                return iOooOO3;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOO2 = oo0O.OooOOO0(bArr, i, o00oo0oo);
                unsafe.putObject(obj, j, Long.valueOf(zzjh.zzc(o00oo0oo.f37353OooO0O0)));
                unsafe.putInt(obj, j2, i4);
                return iOooOOO2;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iOooO0OO = oo0O.OooO0OO(OooOO0o(i8), bArr, i, i2, (i3 & (-8)) | 4, o00oo0oo);
                Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, o00oo0oo.f37354OooO0OO);
                } else {
                    unsafe.putObject(obj, j, zzkm.OooO00o(object2, o00oo0oo.f37354OooO0OO));
                }
                unsafe.putInt(obj, j2, i4);
                return iOooO0OO;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0404  */
    public final int Oooo000(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iOooOooo;
        int size;
        int iOooo0OO;
        int iZzz;
        int i;
        int i2;
        int iZzz2;
        int iZzA8;
        Unsafe unsafe = f37401OooOOOO;
        int iZzA9 = 0;
        for (int i3 = 0; i3 < this.f37403OooO00o.length; i3 += 3) {
            int iOooO = OooO(i3);
            int i4 = (iOooO >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            int i5 = this.f37403OooO00o[i3];
            long j = iOooO & 1048575;
            if (i4 >= zzjw.zzJ.zza() && i4 <= zzjw.zzW.zza()) {
                int i6 = this.f37403OooO00o[i3 + 2];
            }
            switch (i4) {
                case 0:
                    if (OooOo0(obj, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 1:
                    if (OooOo0(obj, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 2:
                    if (OooOo0(obj, i3)) {
                        long jOooO0oo = o0OO.OooO0oo(obj, j);
                        iZzA3 = zzjl.zzA(i5 << 3);
                        iZzB = zzjl.zzB(jOooO0oo);
                        iOooOooo = iZzB + iZzA3;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 3:
                    if (OooOo0(obj, i3)) {
                        long jOooO0oo2 = o0OO.OooO0oo(obj, j);
                        iZzA3 = zzjl.zzA(i5 << 3);
                        iZzB = zzjl.zzB(jOooO0oo2);
                        iOooOooo = iZzB + iZzA3;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 4:
                    if (OooOo0(obj, i3)) {
                        int iOooO0oO = o0OO.OooO0oO(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzv(iOooO0oO);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 5:
                    if (OooOo0(obj, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 6:
                    if (OooOo0(obj, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 7:
                    if (OooOo0(obj, i3)) {
                        iZzA5 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA5 + 1;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 8:
                    if (OooOo0(obj, i3)) {
                        Object objOooOO0 = o0OO.OooOO0(obj, j);
                        if (objOooOO0 instanceof zzjd) {
                            iZzA6 = zzjl.zzA(i5 << 3);
                            iZzd = ((zzjd) objOooOO0).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i = iZzA7 + iZzd + iZzA6;
                            iZzA9 += i;
                        } else {
                            iZzA4 = zzjl.zzA(i5 << 3);
                            iZzv = zzjl.zzy((String) objOooOO0);
                            iOooOooo = iZzv + iZzA4;
                            iZzA9 += iOooOooo;
                        }
                    }
                    break;
                case 9:
                    if (OooOo0(obj, i3)) {
                        iOooOooo = o0O0o000.OooOooo(i5, o0OO.OooOO0(obj, j), OooOO0o(i3));
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 10:
                    if (OooOo0(obj, i3)) {
                        zzjd zzjdVar = (zzjd) o0OO.OooOO0(obj, j);
                        iZzA6 = zzjl.zzA(i5 << 3);
                        iZzd = zzjdVar.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i = iZzA7 + iZzd + iZzA6;
                        iZzA9 += i;
                    }
                    break;
                case 11:
                    if (OooOo0(obj, i3)) {
                        int iOooO0oO2 = o0OO.OooO0oO(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzA(iOooO0oO2);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 12:
                    if (OooOo0(obj, i3)) {
                        int iOooO0oO3 = o0OO.OooO0oO(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzv(iOooO0oO3);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 13:
                    if (OooOo0(obj, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 14:
                    if (OooOo0(obj, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 15:
                    if (OooOo0(obj, i3)) {
                        int iOooO0oO4 = o0OO.OooO0oO(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzA((iOooO0oO4 >> 31) ^ (iOooO0oO4 + iOooO0oO4));
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 16:
                    if (OooOo0(obj, i3)) {
                        long jOooO0oo3 = o0OO.OooO0oo(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzB((jOooO0oo3 >> 63) ^ (jOooO0oo3 + jOooO0oo3));
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 17:
                    if (OooOo0(obj, i3)) {
                        iOooOooo = zzjl.OooO00o(i5, (zzll) o0OO.OooOO0(obj, j), OooOO0o(i3));
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 18:
                    iOooOooo = o0O0o000.OooOoO0(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 19:
                    iOooOooo = o0O0o000.OooOo0o(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 20:
                    iOooOooo = o0O0o000.OooOoo(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 21:
                    List list = (List) o0OO.OooOO0(obj, j);
                    Class cls = o0O0o000.f37430OooO00o;
                    size = list.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo0OO(list);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 22:
                    List list2 = (List) o0OO.OooOO0(obj, j);
                    Class cls2 = o0O0o000.f37430OooO00o;
                    size = list2.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.OooOoo0(list2);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 23:
                    iOooOooo = o0O0o000.OooOoO0(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 24:
                    iOooOooo = o0O0o000.OooOo0o(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 25:
                    List list3 = (List) o0OO.OooOO0(obj, j);
                    Class cls3 = o0O0o000.f37430OooO00o;
                    int size2 = list3.size();
                    iZzA9 += size2 == 0 ? 0 : (zzjl.zzA(i5 << 3) + 1) * size2;
                    break;
                case 26:
                    iOooOooo = o0O0o000.Oooo0(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 27:
                    iOooOooo = o0O0o000.Oooo000(i5, (List) o0OO.OooOO0(obj, j), OooOO0o(i3));
                    iZzA9 += iOooOooo;
                    break;
                case 28:
                    iOooOooo = o0O0o000.OooOo0(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 29:
                    List list4 = (List) o0OO.OooOO0(obj, j);
                    Class cls4 = o0O0o000.f37430OooO00o;
                    size = list4.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo0O0(list4);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 30:
                    List list5 = (List) o0OO.OooOO0(obj, j);
                    Class cls5 = o0O0o000.f37430OooO00o;
                    size = list5.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.OooOo0O(list5);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 31:
                    iOooOooo = o0O0o000.OooOo0o(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 32:
                    iOooOooo = o0O0o000.OooOoO0(i5, (List) o0OO.OooOO0(obj, j));
                    iZzA9 += iOooOooo;
                    break;
                case 33:
                    List list6 = (List) o0OO.OooOO0(obj, j);
                    Class cls6 = o0O0o000.f37430OooO00o;
                    size = list6.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo00O(list6);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 34:
                    List list7 = (List) o0OO.OooOO0(obj, j);
                    Class cls7 = o0O0o000.f37430OooO00o;
                    size = list7.size();
                    if (size == 0) {
                        i = 0;
                    } else {
                        iOooo0OO = o0O0o000.Oooo00o(list7);
                        iZzz = zzjl.zzz(i5);
                        i2 = iZzz * size;
                        i = i2 + iOooo0OO;
                    }
                    iZzA9 += i;
                    break;
                case 35:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 36:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 37:
                    iOooo0OO = o0O0o000.OooOooO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 38:
                    iOooo0OO = o0O0o000.Oooo0OO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 39:
                    iOooo0OO = o0O0o000.OooOoo0((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 40:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 41:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 42:
                    List list8 = (List) unsafe.getObject(obj, j);
                    Class cls8 = o0O0o000.f37430OooO00o;
                    iOooo0OO = list8.size();
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 43:
                    iOooo0OO = o0O0o000.Oooo0O0((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 44:
                    iOooo0OO = o0O0o000.OooOo0O((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 45:
                    iOooo0OO = o0O0o000.OooOo((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 46:
                    iOooo0OO = o0O0o000.OooOoO((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 47:
                    iOooo0OO = o0O0o000.Oooo00O((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 48:
                    iOooo0OO = o0O0o000.Oooo00o((List) unsafe.getObject(obj, j));
                    if (iOooo0OO > 0) {
                        iZzz2 = zzjl.zzz(i5);
                        iZzA8 = zzjl.zzA(iOooo0OO);
                        i2 = iZzA8 + iZzz2;
                        i = i2 + iOooo0OO;
                        iZzA9 += i;
                    }
                    break;
                case 49:
                    iOooOooo = o0O0o000.OooOoOO(i5, (List) o0OO.OooOO0(obj, j), OooOO0o(i3));
                    iZzA9 += iOooOooo;
                    break;
                case 50:
                    o0O00OO.OooO00o(o0OO.OooOO0(obj, j), OooOOO0(i3));
                    break;
                case 51:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 52:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 53:
                    if (OooOo0O(obj, i5, i3)) {
                        long jOooOO0 = OooOO0(obj, j);
                        iZzA3 = zzjl.zzA(i5 << 3);
                        iZzB = zzjl.zzB(jOooOO0);
                        iOooOooo = iZzB + iZzA3;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 54:
                    if (OooOo0O(obj, i5, i3)) {
                        long jOooOO1 = OooOO0(obj, j);
                        iZzA3 = zzjl.zzA(i5 << 3);
                        iZzB = zzjl.zzB(jOooOO1);
                        iOooOooo = iZzB + iZzA3;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 55:
                    if (OooOo0O(obj, i5, i3)) {
                        int iOooo00O = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzv(iOooo00O);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 56:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 57:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 58:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA5 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA5 + 1;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 59:
                    if (OooOo0O(obj, i5, i3)) {
                        Object objOooOO1 = o0OO.OooOO0(obj, j);
                        if (objOooOO1 instanceof zzjd) {
                            iZzA6 = zzjl.zzA(i5 << 3);
                            iZzd = ((zzjd) objOooOO1).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i = iZzA7 + iZzd + iZzA6;
                            iZzA9 += i;
                        } else {
                            iZzA4 = zzjl.zzA(i5 << 3);
                            iZzv = zzjl.zzy((String) objOooOO1);
                            iOooOooo = iZzv + iZzA4;
                            iZzA9 += iOooOooo;
                        }
                    }
                    break;
                case 60:
                    if (OooOo0O(obj, i5, i3)) {
                        iOooOooo = o0O0o000.OooOooo(i5, o0OO.OooOO0(obj, j), OooOO0o(i3));
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 61:
                    if (OooOo0O(obj, i5, i3)) {
                        zzjd zzjdVar2 = (zzjd) o0OO.OooOO0(obj, j);
                        iZzA6 = zzjl.zzA(i5 << 3);
                        iZzd = zzjdVar2.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i = iZzA7 + iZzd + iZzA6;
                        iZzA9 += i;
                    }
                    break;
                case 62:
                    if (OooOo0O(obj, i5, i3)) {
                        int iOooo00O2 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzA(iOooo00O2);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 63:
                    if (OooOo0O(obj, i5, i3)) {
                        int iOooo00O3 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzv(iOooo00O3);
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 64:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA2 = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA2 + 4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 65:
                    if (OooOo0O(obj, i5, i3)) {
                        iZzA = zzjl.zzA(i5 << 3);
                        iOooOooo = iZzA + 8;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 66:
                    if (OooOo0O(obj, i5, i3)) {
                        int iOooo00O4 = Oooo00O(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzA((iOooo00O4 >> 31) ^ (iOooo00O4 + iOooo00O4));
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 67:
                    if (OooOo0O(obj, i5, i3)) {
                        long jOooOO2 = OooOO0(obj, j);
                        iZzA4 = zzjl.zzA(i5 << 3);
                        iZzv = zzjl.zzB((jOooOO2 >> 63) ^ (jOooOO2 + jOooOO2));
                        iOooOooo = iZzv + iZzA4;
                        iZzA9 += iOooOooo;
                    }
                    break;
                case 68:
                    if (OooOo0O(obj, i5, i3)) {
                        iOooOooo = zzjl.OooO00o(i5, (zzll) o0OO.OooOO0(obj, j), OooOO0o(i3));
                        iZzA9 += iOooOooo;
                    }
                    break;
            }
        }
        o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
        return o0oo00oo2.OooO00o(o0oo00oo2.OooO0OO(obj)) + iZzA9;
    }

    public final int Oooo00o(Object obj, int i, long j) throws IOException {
        Unsafe unsafe = f37401OooOOOO;
        Object objOooOOO0 = OooOOO0(i);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlf) object).zze()) {
            zzlf zzlfVarZzb = zzlf.zza().zzb();
            o0O00OO.OooO0O0(zzlfVarZzb, object);
            unsafe.putObject(obj, j, zzlfVarZzb);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x032b A[PHI: r0 r14 r17 r27 r28 r29
      0x032b: PHI (r0v22 int) = (r0v18 int), (r0v24 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v18 java.lang.Object) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r17v5 int) = (r17v3 int), (r17v6 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r27v3 int) = (r27v1 int), (r27v4 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r28v2 int) = (r28v0 int), (r28v3 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r29v8 sun.misc.Unsafe) = (r29v6 sun.misc.Unsafe), (r29v9 sun.misc.Unsafe) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x037d A[PHI: r0 r14 r17 r27 r28 r29
      0x037d: PHI (r0v21 int) = (r0v18 int), (r0v24 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r14v15 java.lang.Object) = (r14v13 java.lang.Object), (r14v18 java.lang.Object) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r17v4 int) = (r17v3 int), (r17v6 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r27v2 int) = (r27v1 int), (r27v4 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r28v1 int) = (r28v0 int), (r28v3 int) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r29v7 sun.misc.Unsafe) = (r29v6 sun.misc.Unsafe), (r29v9 sun.misc.Unsafe) binds: [B:127:0x037b, B:116:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0099. Please report as an issue. */
    public final int Oooo0O0(Object obj, byte[] bArr, int i, int i2, o00OO0OO o00oo0oo) throws IOException {
        int i3;
        int iOooo0o;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        Object obj2;
        int iOooO;
        int i8;
        int i9;
        int i10;
        Object obj3;
        int i11;
        int i12;
        int i13;
        int iOooo0;
        int i14;
        int i15;
        int i16;
        Object obj4;
        o0O0O0O<T> o0o0o0o;
        int iOooOO0;
        int iOooOOO0;
        int i17;
        int iOooO00o;
        int iOooOOO1;
        Object obj5 = obj;
        i2 = i2;
        Unsafe unsafe2 = f37401OooOOOO;
        int i18 = -1;
        int i19 = 0;
        o0O0O0O<T> o0o0o0o2 = this;
        byte[] bArr2 = bArr;
        int iOooO0o0 = i;
        o00OO0OO o00oo0oo2 = o00oo0oo;
        Object obj6 = obj5;
        int i20 = -1;
        int i21 = 0;
        int i22 = 1048575;
        int i23 = 0;
        while (iOooO0o0 < i2) {
            int i24 = iOooO0o0 + 1;
            byte b = bArr2[iOooO0o0];
            if (b < 0) {
                int iOooOO0O = oo0O.OooOO0O(b, bArr2, i24, o00oo0oo2);
                i3 = o00oo0oo2.f37352OooO00o;
                i24 = iOooOO0O;
            } else {
                i3 = b;
            }
            int i25 = i3 >>> 3;
            int i26 = i3 & 7;
            if (i25 > i20) {
                int i27 = i21 / 3;
                if (i25 < o0o0o0o2.f37405OooO0OO || i25 > o0o0o0o2.f37406OooO0Oo) {
                    i4 = -1;
                } else {
                    iOooo0o = o0o0o0o2.Oooo0o(i25, i27);
                    i4 = iOooo0o;
                }
            } else if (i25 < o0o0o0o2.f37405OooO0OO || i25 > o0o0o0o2.f37406OooO0Oo) {
                i4 = -1;
            } else {
                iOooo0o = o0o0o0o2.Oooo0o(i25, i19);
                i4 = iOooo0o;
            }
            if (i4 == i18) {
                i5 = i25;
                i6 = i24;
                i7 = 0;
            } else {
                int[] iArr = o0o0o0o2.f37403OooO00o;
                int i28 = iArr[i4 + 1];
                int i29 = (i28 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
                long j = i28 & 1048575;
                o0O0O0O<T> o0o0o0o3 = o0o0o0o2;
                if (i29 <= 17) {
                    int i30 = iArr[i4 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = 1048575;
                    int i33 = i30 & 1048575;
                    if (i33 != i22) {
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj6, i22, i23);
                            i32 = 1048575;
                        }
                        if (i33 != i32) {
                            i23 = unsafe2.getInt(obj6, i33);
                        }
                        i22 = i33;
                    }
                    switch (i29) {
                        case 0:
                            i5 = i25;
                            i6 = i24;
                            i16 = i4;
                            Object obj7 = obj6;
                            if (i26 != 1) {
                                i7 = i16;
                            } else {
                                o0OO.OooOOO(obj7, j, Double.longBitsToDouble(oo0O.OooOOO(bArr2, i6)));
                                iOooO = i6 + 8;
                                i8 = i23 | i31;
                                obj2 = obj;
                                o0o0o0o2 = o0o0o0o3;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj7;
                            }
                            i23 = i8;
                            iOooO0o0 = iOooO;
                            obj5 = obj2;
                            i20 = i5;
                            unsafe2 = unsafe;
                            i19 = 0;
                            i18 = -1;
                            i2 = i2;
                            break;
                        case 1:
                            i5 = i25;
                            i6 = i24;
                            i16 = i4;
                            obj4 = obj6;
                            o0o0o0o = o0o0o0o3;
                            if (i26 == 5) {
                                o0OO.OooOOOO(obj4, j, Float.intBitsToFloat(oo0O.OooO0O0(bArr2, i6)));
                                iOooOO0 = i6 + 4;
                                iOooOOO0 = iOooOO0;
                                i17 = i23 | i31;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i7 = i16;
                            break;
                        case 2:
                        case 3:
                            i5 = i25;
                            i6 = i24;
                            i16 = i4;
                            obj4 = obj6;
                            if (i26 == 0) {
                                iOooOOO0 = oo0O.OooOOO0(bArr2, i6, o00oo0oo2);
                                unsafe2.putLong(obj, j, o00oo0oo2.f37353OooO0O0);
                                i17 = i23 | i31;
                                o0o0o0o = o0o0o0o3;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i7 = i16;
                            break;
                        case 4:
                        case 11:
                            i5 = i25;
                            i6 = i24;
                            i16 = i4;
                            obj4 = obj6;
                            if (i26 == 0) {
                                iOooOO0 = oo0O.OooOO0(bArr2, i6, o00oo0oo2);
                                unsafe2.putInt(obj4, j, o00oo0oo2.f37352OooO00o);
                                o0o0o0o = o0o0o0o3;
                                iOooOOO0 = iOooOO0;
                                i17 = i23 | i31;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i7 = i16;
                            break;
                        case 5:
                        case 14:
                            i5 = i25;
                            i16 = i4;
                            obj4 = obj6;
                            if (i26 == 1) {
                                unsafe2.putLong(obj, j, oo0O.OooOOO(bArr2, i24));
                                iOooOO0 = i24 + 8;
                                o0o0o0o = o0o0o0o3;
                                iOooOOO0 = iOooOO0;
                                i17 = i23 | i31;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i6 = i24;
                            i7 = i16;
                            break;
                        case 6:
                        case 13:
                            i5 = i25;
                            i16 = i4;
                            obj3 = obj6;
                            if (i26 != 5) {
                                i6 = i24;
                                i7 = i16;
                            } else {
                                unsafe2.putInt(obj3, j, oo0O.OooO0O0(bArr2, i24));
                                iOooO0o0 = i24 + 4;
                                i23 |= i31;
                                i21 = i16;
                                obj6 = obj3;
                                o0o0o0o2 = o0o0o0o3;
                                i20 = i5;
                                i19 = 0;
                                i18 = -1;
                                obj5 = obj;
                            }
                            break;
                        case 7:
                            i5 = i25;
                            i16 = i4;
                            if (i26 != 0) {
                                i6 = i24;
                                i7 = i16;
                            } else {
                                iOooO0o0 = oo0O.OooOOO0(bArr2, i24, o00oo0oo2);
                                obj3 = obj6;
                                o0OO.OooOOO0(obj3, j, o00oo0oo2.f37353OooO0O0 != 0);
                                i23 |= i31;
                                i21 = i16;
                                obj6 = obj3;
                                o0o0o0o2 = o0o0o0o3;
                                i20 = i5;
                                i19 = 0;
                                i18 = -1;
                                obj5 = obj;
                            }
                            break;
                        case 8:
                            i5 = i25;
                            i16 = i4;
                            if (i26 == 2) {
                                iOooOO0 = (536870912 & i28) == 0 ? oo0O.OooO0oO(bArr2, i24, o00oo0oo2) : oo0O.OooO0oo(bArr2, i24, o00oo0oo2);
                                unsafe2.putObject(obj6, j, o00oo0oo2.f37354OooO0OO);
                                obj4 = obj6;
                                o0o0o0o = o0o0o0o3;
                                iOooOOO0 = iOooOO0;
                                i17 = i23 | i31;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i6 = i24;
                            i7 = i16;
                            break;
                        case 9:
                            i5 = i25;
                            i16 = i4;
                            if (i26 == 2) {
                                iOooOO0 = oo0O.OooO0Oo(o0o0o0o3.OooOO0o(i16), bArr2, i24, i2, o00oo0oo2);
                                Object object = unsafe2.getObject(obj6, j);
                                if (object == null) {
                                    o0o0o0o3 = o0o0o0o3;
                                    unsafe2.putObject(obj6, j, o00oo0oo2.f37354OooO0OO);
                                } else {
                                    o0o0o0o3 = o0o0o0o3;
                                    unsafe2.putObject(obj6, j, zzkm.OooO00o(object, o00oo0oo2.f37354OooO0OO));
                                }
                                obj4 = obj6;
                                o0o0o0o = o0o0o0o3;
                                iOooOOO0 = iOooOO0;
                                i17 = i23 | i31;
                                obj2 = obj;
                                i23 = i17;
                                o0o0o0o2 = o0o0o0o;
                                iOooO0o0 = iOooOOO0;
                                unsafe = unsafe2;
                                i21 = i16;
                                obj6 = obj4;
                                obj5 = obj2;
                                i20 = i5;
                                unsafe2 = unsafe;
                                i19 = 0;
                                i18 = -1;
                                i2 = i2;
                            }
                            i6 = i24;
                            i7 = i16;
                            break;
                        case 10:
                            i5 = i25;
                            i16 = i4;
                            if (i26 != 2) {
                                i6 = i24;
                                i7 = i16;
                            } else {
                                iOooO00o = oo0O.OooO00o(bArr2, i24, o00oo0oo2);
                                unsafe2.putObject(obj6, j, o00oo0oo2.f37354OooO0OO);
                                iOooOOO1 = iOooO00o;
                                i23 |= i31;
                                o0o0o0o3 = o0o0o0o3;
                                obj3 = obj6;
                                iOooO0o0 = iOooOOO1;
                                i15 = i16;
                            }
                            break;
                        case 12:
                            i5 = i25;
                            i16 = i4;
                            if (i26 != 0) {
                                i6 = i24;
                                i7 = i16;
                            } else {
                                iOooO00o = oo0O.OooOO0(bArr2, i24, o00oo0oo2);
                                unsafe2.putInt(obj6, j, o00oo0oo2.f37352OooO00o);
                                iOooOOO1 = iOooO00o;
                                i23 |= i31;
                                o0o0o0o3 = o0o0o0o3;
                                obj3 = obj6;
                                iOooO0o0 = iOooOOO1;
                                i15 = i16;
                            }
                            break;
                        case 15:
                            i5 = i25;
                            i16 = i4;
                            if (i26 != 0) {
                                i6 = i24;
                                i7 = i16;
                            } else {
                                iOooO00o = oo0O.OooOO0(bArr2, i24, o00oo0oo2);
                                unsafe2.putInt(obj6, j, zzjh.zzb(o00oo0oo2.f37352OooO00o));
                                iOooOOO1 = iOooO00o;
                                i23 |= i31;
                                o0o0o0o3 = o0o0o0o3;
                                obj3 = obj6;
                                iOooO0o0 = iOooOOO1;
                                i15 = i16;
                            }
                            break;
                        case 16:
                            if (i26 != 0) {
                                i5 = i25;
                                i16 = i4;
                                i6 = i24;
                                i7 = i16;
                            } else {
                                iOooOOO1 = oo0O.OooOOO0(bArr2, i24, o00oo0oo2);
                                i5 = i25;
                                i16 = i4;
                                unsafe2.putLong(obj, j, zzjh.zzc(o00oo0oo2.f37353OooO0O0));
                                i23 |= i31;
                                o0o0o0o3 = o0o0o0o3;
                                obj6 = obj6;
                                o0o0o0o3 = o0o0o0o3;
                                obj3 = obj6;
                                iOooO0o0 = iOooOOO1;
                                i15 = i16;
                            }
                            break;
                        default:
                            i5 = i25;
                            i6 = i24;
                            i16 = i4;
                            i7 = i16;
                            break;
                    }
                } else {
                    i5 = i25;
                    int i34 = i4;
                    int i35 = i24;
                    obj3 = obj6;
                    if (i29 != 27) {
                        if (i29 <= 49) {
                            i12 = i23;
                            i9 = i34;
                            i11 = i22;
                            unsafe = unsafe2;
                            iOooo0 = Oooo0OO(obj, bArr, i35, i2, i3, i5, i26, i34, i28, i29, j, o00oo0oo);
                            obj2 = obj;
                            if (iOooo0 != i35) {
                                iOooO = iOooo0;
                                i21 = i9;
                                i23 = i12;
                                i22 = i11;
                            } else {
                                i14 = iOooo0;
                                i10 = i14;
                                i23 = i12;
                                i22 = i11;
                                iOooO = oo0O.OooO(i3, bArr, i10, i2, OooOoO(obj), o00oo0oo);
                                i21 = i9;
                            }
                            o0o0o0o2 = this;
                            bArr2 = bArr;
                            o00oo0oo2 = o00oo0oo;
                            i8 = i23;
                            obj6 = obj2;
                            i23 = i8;
                            iOooO0o0 = iOooO;
                        } else {
                            i11 = i22;
                            i12 = i23;
                            unsafe = unsafe2;
                            i9 = i34;
                            i13 = i35;
                            if (i29 != 50) {
                                obj2 = obj;
                                iOooo0 = Oooo0(obj, bArr, i13, i2, i3, i5, i26, i28, i29, j, i9, o00oo0oo);
                                if (iOooo0 != i13) {
                                    iOooO = iOooo0;
                                    i21 = i9;
                                    i23 = i12;
                                    i22 = i11;
                                } else {
                                    i14 = iOooo0;
                                    i10 = i14;
                                    i23 = i12;
                                    i22 = i11;
                                    iOooO = oo0O.OooO(i3, bArr, i10, i2, OooOoO(obj), o00oo0oo);
                                    i21 = i9;
                                }
                                o0o0o0o2 = this;
                                bArr2 = bArr;
                                o00oo0oo2 = o00oo0oo;
                                i8 = i23;
                                obj6 = obj2;
                                i23 = i8;
                                iOooO0o0 = iOooO;
                            } else if (i26 == 2) {
                                Oooo00o(obj, i9, j);
                                throw null;
                            }
                        }
                        obj5 = obj2;
                        i20 = i5;
                        unsafe2 = unsafe;
                        i19 = 0;
                        i18 = -1;
                        i2 = i2;
                    } else if (i26 == 2) {
                        zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj3, j);
                        if (!zzklVarZzd.zzc()) {
                            int size = zzklVarZzd.size();
                            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j, zzklVarZzd);
                        }
                        i15 = i34;
                        o0o0o0o3 = o0o0o0o3;
                        iOooO0o0 = oo0O.OooO0o0(o0o0o0o3.OooOO0o(i34), i3, bArr, i35, i2, zzklVarZzd, o00oo0oo);
                    } else {
                        i13 = i35;
                        i9 = i34;
                        i11 = i22;
                        i12 = i23;
                        unsafe = unsafe2;
                    }
                    obj2 = obj;
                    i14 = i13;
                    i10 = i14;
                    i23 = i12;
                    i22 = i11;
                    iOooO = oo0O.OooO(i3, bArr, i10, i2, OooOoO(obj), o00oo0oo);
                    i21 = i9;
                    o0o0o0o2 = this;
                    bArr2 = bArr;
                    o00oo0oo2 = o00oo0oo;
                    i8 = i23;
                    obj6 = obj2;
                    i23 = i8;
                    iOooO0o0 = iOooO;
                    obj5 = obj2;
                    i20 = i5;
                    unsafe2 = unsafe;
                    i19 = 0;
                    i18 = -1;
                    i2 = i2;
                }
                o00oo0oo2 = o00oo0oo2;
                i21 = i15;
                obj6 = obj3;
                o0o0o0o2 = o0o0o0o3;
                i20 = i5;
                i19 = 0;
                i18 = -1;
                obj5 = obj;
            }
            obj2 = obj;
            i9 = i7;
            i10 = i6;
            unsafe = unsafe2;
            iOooO = oo0O.OooO(i3, bArr, i10, i2, OooOoO(obj), o00oo0oo);
            i21 = i9;
            o0o0o0o2 = this;
            bArr2 = bArr;
            o00oo0oo2 = o00oo0oo;
            i8 = i23;
            obj6 = obj2;
            i23 = i8;
            iOooO0o0 = iOooO;
            obj5 = obj2;
            i20 = i5;
            unsafe2 = unsafe;
            i19 = 0;
            i18 = -1;
            i2 = i2;
        }
        int i36 = i23;
        Unsafe unsafe3 = unsafe2;
        Object obj8 = obj5;
        if (i22 != 1048575) {
            unsafe3.putInt(obj8, i22, i36);
        }
        if (iOooO0o0 == i2) {
            return iOooO0o0;
        }
        throw zzko.OooO0OO();
    }

    public final int Oooo0OO(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, o00OO0OO o00oo0oo) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iOooOO0o;
        int iOooOO0 = i;
        Unsafe unsafe = f37401OooOOOO;
        zzkl zzklVarZzd = (zzkl) unsafe.getObject(obj, j2);
        if (!zzklVarZzd.zzc()) {
            int size = zzklVarZzd.size();
            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzklVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    o0oOO o0ooo2 = (o0oOO) zzklVarZzd;
                    int iOooOO1 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i12 = o00oo0oo.f37352OooO00o + iOooOO1;
                    while (iOooOO1 < i12) {
                        o0ooo2.OooO0O0(Double.longBitsToDouble(oo0O.OooOOO(bArr, iOooOO1)));
                        iOooOO1 += 8;
                    }
                    if (iOooOO1 == i12) {
                        return iOooOO1;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 1) {
                    o0oOO o0ooo3 = (o0oOO) zzklVarZzd;
                    o0ooo3.OooO0O0(Double.longBitsToDouble(oo0O.OooOOO(bArr, i)));
                    while (true) {
                        i8 = iOooOO0 + 8;
                        if (i8 < i2) {
                            int iOooOO2 = oo0O.OooOO0(bArr, i8, o00oo0oo);
                            if (i3 == o00oo0oo.f37352OooO00o) {
                                o0ooo3.OooO0O0(Double.longBitsToDouble(oo0O.OooOOO(bArr, iOooOO2)));
                                iOooOO0 = iOooOO2;
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    o0O00000 o0o00000 = (o0O00000) zzklVarZzd;
                    int iOooOO3 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i13 = o00oo0oo.f37352OooO00o + iOooOO3;
                    while (iOooOO3 < i13) {
                        o0o00000.OooO0O0(Float.intBitsToFloat(oo0O.OooO0O0(bArr, iOooOO3)));
                        iOooOO3 += 4;
                    }
                    if (iOooOO3 == i13) {
                        return iOooOO3;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 5) {
                    o0O00000 o0o00001 = (o0O00000) zzklVarZzd;
                    o0o00001.OooO0O0(Float.intBitsToFloat(oo0O.OooO0O0(bArr, i)));
                    while (true) {
                        i9 = iOooOO0 + 4;
                        if (i9 < i2) {
                            int iOooOO4 = oo0O.OooOO0(bArr, i9, o00oo0oo);
                            if (i3 == o00oo0oo.f37352OooO00o) {
                                o0o00001.OooO0O0(Float.intBitsToFloat(oo0O.OooO0O0(bArr, iOooOO4)));
                                iOooOO0 = iOooOO4;
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
                    o0O00 o0o01 = (o0O00) zzklVarZzd;
                    int iOooOO5 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i14 = o00oo0oo.f37352OooO00o + iOooOO5;
                    while (iOooOO5 < i14) {
                        iOooOO5 = oo0O.OooOOO0(bArr, iOooOO5, o00oo0oo);
                        o0o01.OooO0O0(o00oo0oo.f37353OooO0O0);
                    }
                    if (iOooOO5 == i14) {
                        return iOooOO5;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O00 o0o02 = (o0O00) zzklVarZzd;
                    int iOooOOO0 = oo0O.OooOOO0(bArr, iOooOO0, o00oo0oo);
                    o0o02.OooO0O0(o00oo0oo.f37353OooO0O0);
                    while (iOooOOO0 < i2) {
                        int iOooOO6 = oo0O.OooOO0(bArr, iOooOOO0, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooOOO0;
                        }
                        iOooOOO0 = oo0O.OooOOO0(bArr, iOooOO6, o00oo0oo);
                        o0o02.OooO0O0(o00oo0oo.f37353OooO0O0);
                    }
                    return iOooOOO0;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return oo0O.OooO0o(bArr, iOooOO0, zzklVarZzd, o00oo0oo);
                }
                if (i5 == 0) {
                    return oo0O.OooOO0o(i3, bArr, i, i2, zzklVarZzd, o00oo0oo);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    o0O00 o0o03 = (o0O00) zzklVarZzd;
                    int iOooOO7 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i15 = o00oo0oo.f37352OooO00o + iOooOO7;
                    while (iOooOO7 < i15) {
                        o0o03.OooO0O0(oo0O.OooOOO(bArr, iOooOO7));
                        iOooOO7 += 8;
                    }
                    if (iOooOO7 == i15) {
                        return iOooOO7;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 1) {
                    o0O00 o0o04 = (o0O00) zzklVarZzd;
                    o0o04.OooO0O0(oo0O.OooOOO(bArr, i));
                    while (true) {
                        i10 = iOooOO0 + 8;
                        if (i10 < i2) {
                            int iOooOO8 = oo0O.OooOO0(bArr, i10, o00oo0oo);
                            if (i3 == o00oo0oo.f37352OooO00o) {
                                o0o04.OooO0O0(oo0O.OooOOO(bArr, iOooOO8));
                                iOooOO0 = iOooOO8;
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
                    o0O000O o0o000o = (o0O000O) zzklVarZzd;
                    int iOooOO9 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i16 = o00oo0oo.f37352OooO00o + iOooOO9;
                    while (iOooOO9 < i16) {
                        o0o000o.OooO0OO(oo0O.OooO0O0(bArr, iOooOO9));
                        iOooOO9 += 4;
                    }
                    if (iOooOO9 == i16) {
                        return iOooOO9;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 5) {
                    o0O000O o0o000o2 = (o0O000O) zzklVarZzd;
                    o0o000o2.OooO0OO(oo0O.OooO0O0(bArr, i));
                    while (true) {
                        i11 = iOooOO0 + 4;
                        if (i11 < i2) {
                            int iOooOO10 = oo0O.OooOO0(bArr, i11, o00oo0oo);
                            if (i3 == o00oo0oo.f37352OooO00o) {
                                o0o000o2.OooO0OO(oo0O.OooO0O0(bArr, iOooOO10));
                                iOooOO0 = iOooOO10;
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    o00OO o00oo2 = (o00OO) zzklVarZzd;
                    int iOooOO11 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i17 = o00oo0oo.f37352OooO00o + iOooOO11;
                    while (iOooOO11 < i17) {
                        iOooOO11 = oo0O.OooOOO0(bArr, iOooOO11, o00oo0oo);
                        o00oo2.OooO0O0(o00oo0oo.f37353OooO0O0 != 0);
                    }
                    if (iOooOO11 == i17) {
                        return iOooOO11;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 0) {
                    o00OO o00oo3 = (o00OO) zzklVarZzd;
                    int iOooOOO1 = oo0O.OooOOO0(bArr, iOooOO0, o00oo0oo);
                    o00oo3.OooO0O0(o00oo0oo.f37353OooO0O0 != 0);
                    while (iOooOOO1 < i2) {
                        int iOooOO12 = oo0O.OooOO0(bArr, iOooOOO1, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooOOO1;
                        }
                        iOooOOO1 = oo0O.OooOOO0(bArr, iOooOO12, o00oo0oo);
                        o00oo3.OooO0O0(o00oo0oo.f37353OooO0O0 != 0);
                    }
                    return iOooOOO1;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) != 0) {
                        iOooOO0 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                        int i18 = o00oo0oo.f37352OooO00o;
                        if (i18 < 0) {
                            throw zzko.OooO0O0();
                        }
                        if (i18 == 0) {
                            zzklVarZzd.add("");
                        } else {
                            int i19 = iOooOO0 + i18;
                            if (!o0OOOO00.OooO0Oo(bArr, iOooOO0, i19)) {
                                throw zzko.OooO00o();
                            }
                            zzklVarZzd.add(new String(bArr, iOooOO0, i18, zzkm.f15998OooO00o));
                            iOooOO0 = i19;
                        }
                        while (iOooOO0 < i2) {
                            int iOooOO13 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                            if (i3 != o00oo0oo.f37352OooO00o) {
                                break;
                            } else {
                                iOooOO0 = oo0O.OooOO0(bArr, iOooOO13, o00oo0oo);
                                int i20 = o00oo0oo.f37352OooO00o;
                                if (i20 < 0) {
                                    throw zzko.OooO0O0();
                                }
                                if (i20 == 0) {
                                    zzklVarZzd.add("");
                                } else {
                                    int i21 = iOooOO0 + i20;
                                    if (!o0OOOO00.OooO0Oo(bArr, iOooOO0, i21)) {
                                        throw zzko.OooO00o();
                                    }
                                    zzklVarZzd.add(new String(bArr, iOooOO0, i20, zzkm.f15998OooO00o));
                                    iOooOO0 = i21;
                                }
                            }
                        }
                    } else {
                        iOooOO0 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                        int i22 = o00oo0oo.f37352OooO00o;
                        if (i22 < 0) {
                            throw zzko.OooO0O0();
                        }
                        if (i22 == 0) {
                            zzklVarZzd.add("");
                        } else {
                            zzklVarZzd.add(new String(bArr, iOooOO0, i22, zzkm.f15998OooO00o));
                            iOooOO0 += i22;
                        }
                        while (iOooOO0 < i2) {
                            int iOooOO14 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                            if (i3 != o00oo0oo.f37352OooO00o) {
                                break;
                            } else {
                                iOooOO0 = oo0O.OooOO0(bArr, iOooOO14, o00oo0oo);
                                int i23 = o00oo0oo.f37352OooO00o;
                                if (i23 < 0) {
                                    throw zzko.OooO0O0();
                                }
                                if (i23 == 0) {
                                    zzklVarZzd.add("");
                                } else {
                                    zzklVarZzd.add(new String(bArr, iOooOO0, i23, zzkm.f15998OooO00o));
                                    iOooOO0 += i23;
                                }
                            }
                        }
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return oo0O.OooO0o0(OooOO0o(i6), i3, bArr, i, i2, zzklVarZzd, o00oo0oo);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int iOooOO15 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i24 = o00oo0oo.f37352OooO00o;
                    if (i24 < 0) {
                        throw zzko.OooO0O0();
                    }
                    if (i24 > bArr.length - iOooOO15) {
                        throw zzko.OooO0Oo();
                    }
                    if (i24 == 0) {
                        zzklVarZzd.add(zzjd.zzb);
                    } else {
                        zzklVarZzd.add(zzjd.zzl(bArr, iOooOO15, i24));
                        iOooOO15 += i24;
                    }
                    while (iOooOO15 < i2) {
                        int iOooOO16 = oo0O.OooOO0(bArr, iOooOO15, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooOO15;
                        }
                        iOooOO15 = oo0O.OooOO0(bArr, iOooOO16, o00oo0oo);
                        int i25 = o00oo0oo.f37352OooO00o;
                        if (i25 < 0) {
                            throw zzko.OooO0O0();
                        }
                        if (i25 > bArr.length - iOooOO15) {
                            throw zzko.OooO0Oo();
                        }
                        if (i25 == 0) {
                            zzklVarZzd.add(zzjd.zzb);
                        } else {
                            zzklVarZzd.add(zzjd.zzl(bArr, iOooOO15, i25));
                            iOooOO15 += i25;
                        }
                    }
                    return iOooOO15;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iOooOO0o = oo0O.OooO0o(bArr, iOooOO0, zzklVarZzd, o00oo0oo);
                } else if (i5 == 0) {
                    iOooOO0o = oo0O.OooOO0o(i3, bArr, i, i2, zzklVarZzd, o00oo0oo);
                }
                zzke zzkeVar = (zzke) obj;
                Object objOooO0o0 = zzkeVar.zzc;
                if (objOooO0o0 == zzmo.zzc()) {
                    objOooO0o0 = null;
                }
                zzki zzkiVarOooOO0O = OooOO0O(i6);
                o0OO00OO o0oo00oo2 = this.f37413OooOO0o;
                Class cls = o0O0o000.f37430OooO00o;
                if (zzkiVarOooOO0O != null) {
                    if (zzklVarZzd instanceof RandomAccess) {
                        int size2 = zzklVarZzd.size();
                        int i26 = 0;
                        for (int i27 = 0; i27 < size2; i27++) {
                            int iIntValue = ((Integer) zzklVarZzd.get(i27)).intValue();
                            if (zzkiVarOooOO0O.zza(iIntValue)) {
                                if (i27 != i26) {
                                    zzklVarZzd.set(i26, Integer.valueOf(iIntValue));
                                }
                                i26++;
                            } else {
                                if (objOooO0o0 == null) {
                                    objOooO0o0 = o0oo00oo2.OooO0o0();
                                }
                                o0oo00oo2.OooO0o(objOooO0o0, i4, iIntValue);
                            }
                        }
                        if (i26 != size2) {
                            zzklVarZzd.subList(i26, size2).clear();
                        }
                    } else {
                        Iterator it = zzklVarZzd.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!zzkiVarOooOO0O.zza(iIntValue2)) {
                                if (objOooO0o0 == null) {
                                    objOooO0o0 = o0oo00oo2.OooO0o0();
                                }
                                o0oo00oo2.OooO0o(objOooO0o0, i4, iIntValue2);
                                it.remove();
                            }
                        }
                    }
                }
                if (objOooO0o0 == null) {
                    return iOooOO0o;
                }
                zzkeVar.zzc = (zzmo) objOooO0o0;
                return iOooOO0o;
            case 33:
            case 47:
                if (i5 == 2) {
                    o0O000O o0o000o3 = (o0O000O) zzklVarZzd;
                    int iOooOO17 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i28 = o00oo0oo.f37352OooO00o + iOooOO17;
                    while (iOooOO17 < i28) {
                        iOooOO17 = oo0O.OooOO0(bArr, iOooOO17, o00oo0oo);
                        o0o000o3.OooO0OO(zzjh.zzb(o00oo0oo.f37352OooO00o));
                    }
                    if (iOooOO17 == i28) {
                        return iOooOO17;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O000O o0o000o4 = (o0O000O) zzklVarZzd;
                    int iOooOO18 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    o0o000o4.OooO0OO(zzjh.zzb(o00oo0oo.f37352OooO00o));
                    while (iOooOO18 < i2) {
                        int iOooOO19 = oo0O.OooOO0(bArr, iOooOO18, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooOO18;
                        }
                        iOooOO18 = oo0O.OooOO0(bArr, iOooOO19, o00oo0oo);
                        o0o000o4.OooO0OO(zzjh.zzb(o00oo0oo.f37352OooO00o));
                    }
                    return iOooOO18;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    o0O00 o0o05 = (o0O00) zzklVarZzd;
                    int iOooOO20 = oo0O.OooOO0(bArr, iOooOO0, o00oo0oo);
                    int i29 = o00oo0oo.f37352OooO00o + iOooOO20;
                    while (iOooOO20 < i29) {
                        iOooOO20 = oo0O.OooOOO0(bArr, iOooOO20, o00oo0oo);
                        o0o05.OooO0O0(zzjh.zzc(o00oo0oo.f37353OooO0O0));
                    }
                    if (iOooOO20 == i29) {
                        return iOooOO20;
                    }
                    throw zzko.OooO0Oo();
                }
                if (i5 == 0) {
                    o0O00 o0o06 = (o0O00) zzklVarZzd;
                    int iOooOOO2 = oo0O.OooOOO0(bArr, iOooOO0, o00oo0oo);
                    o0o06.OooO0O0(zzjh.zzc(o00oo0oo.f37353OooO0O0));
                    while (iOooOOO2 < i2) {
                        int iOooOO21 = oo0O.OooOO0(bArr, iOooOOO2, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooOOO2;
                        }
                        iOooOOO2 = oo0O.OooOOO0(bArr, iOooOO21, o00oo0oo);
                        o0o06.OooO0O0(zzjh.zzc(o00oo0oo.f37353OooO0O0));
                    }
                    return iOooOOO2;
                }
                break;
            default:
                if (i5 == 3) {
                    oo0OOoo oo0ooooOooOO0o = OooOO0o(i6);
                    int i30 = (i3 & (-8)) | 4;
                    int iOooO0OO = oo0O.OooO0OO(oo0ooooOooOO0o, bArr, i, i2, i30, o00oo0oo);
                    zzklVarZzd.add(o00oo0oo.f37354OooO0OO);
                    while (iOooO0OO < i2) {
                        int iOooOO22 = oo0O.OooOO0(bArr, iOooO0OO, o00oo0oo);
                        if (i3 != o00oo0oo.f37352OooO00o) {
                            return iOooO0OO;
                        }
                        iOooO0OO = oo0O.OooO0OO(oo0ooooOooOO0o, bArr, iOooOO22, i2, i30, o00oo0oo);
                        zzklVarZzd.add(o00oo0oo.f37354OooO0OO);
                    }
                    return iOooO0OO;
                }
                break;
        }
        return iOooOO0;
    }

    public final int Oooo0o(int i, int i2) {
        int length = (this.f37403OooO00o.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f37403OooO00o[i4];
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

    public final int Oooo0o0(int i) {
        return this.f37403OooO00o[i + 2];
    }

    @Override // p335o0OO00o.oo0OOoo
    public final Object zze() {
        return ((zzke) this.f37408OooO0o0).OooOO0(4);
    }
}
