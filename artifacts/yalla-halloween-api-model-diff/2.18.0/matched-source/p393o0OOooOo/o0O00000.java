package p393o0OOooOo;

import OooO00o.OooO00o;
import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.umeng.analytics.MobclickAgent;
import com.yalla.support.common.util.OooO;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import p392o0OOooOO.o0;
import p394o0OOooo.o00000O;
import p394o0OOooo.o00000OO;
import p395o0OOooo0.o00oO0o;
import p395o0OOooo0.o0OO00O;
import p395o0OOooo0.o0Oo0oo;
import p395o0OOooo0.o0ooOOo;
import p395o0OOooo0.oo000o;
import p517o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 implements o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f38935OooO00o;

    public static String OooO0O0(int i) {
        String strOooO0oo;
        if (i < 0) {
            return "00";
        }
        if (i >= 10) {
            return "11";
        }
        int i2 = i + 1;
        if (i2 < 10) {
            StringBuilder sbOooO0O0 = OooO00o.OooO0O0(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sbOooO0O0.append(OooO.OooO0oo(Integer.valueOf(i2), AppEventsConstants.EVENT_PARAM_VALUE_NO));
            strOooO0oo = sbOooO0O0.toString();
        } else {
            strOooO0oo = OooO.OooO0oo(Integer.valueOf(i2), "00");
        }
        return strOooO0oo;
    }

    public static void OooO0OO(String str) {
        if (f38935OooO00o == null) {
            return;
        }
        o00O00.OooO0O0("UmengEvent.onEvent(" + str + ")");
        MobclickAgent.onEvent(f38935OooO00o, str);
    }

    public static void OooO0Oo(String str, int i) {
        OooO0o0(str, OooO.OooO0oo(Integer.valueOf(i), ""));
    }

    public static void OooO0o(String str, Map map, int i) {
        if (f38935OooO00o == null) {
            return;
        }
        map.put("Key_Duration", i + "");
        o00O00.OooO0O0("UmengEvent.onEventValue(\neventID:" + str + "\nmap:" + map + "\nduration = " + i + ")");
        MobclickAgent.onEventValue(f38935OooO00o, str, map, i);
    }

    public static void OooO0o0(String str, String str2) {
        if (f38935OooO00o == null) {
            return;
        }
        o00O00.OooO0O0("UmengEvent.onEvent(\neventID:" + str + "\nlabel:" + str2 + ")");
        Context context = f38935OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("");
        MobclickAgent.onEvent(context, str, sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    @Override // p392o0OOooOO.o0
    public o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) {
        int i;
        int i2;
        int i3;
        o00000O o00000oOooO0OO;
        boolean z;
        int iAbs;
        int i4;
        o00000O o00000oOooO0O0;
        int i5;
        int i6;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        if (map.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(map.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
        int i7 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
        int i8 = map.containsKey(encodeHintType3) ? Integer.parseInt(map.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        o0ooOOo o0ooooo2 = new o0ooOOo(str.getBytes(charsetForName));
        Collection<o0Oo0oo> collectionSingletonList = Collections.singletonList(o0Oo0oo.f38948OooO0o0);
        int i9 = 0;
        while (true) {
            byte[] bArr = o0ooooo2.f38957OooO00o;
            i = 32;
            int i10 = 4;
            int i11 = 2;
            i2 = 1;
            if (i9 >= bArr.length) {
                break;
            }
            int i12 = i9 + 1;
            byte b = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b2 = bArr[i9];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i6 = 5;
                        } else {
                            i6 = 0;
                        }
                    } else if (b == 32) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                } else if (b == 32) {
                    i6 = 4;
                } else {
                    i6 = 0;
                }
            } else if (b == 10) {
                i6 = 2;
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                LinkedList linkedList = new LinkedList();
                for (o0Oo0oo o0oo0oo2 : collectionSingletonList) {
                    o0Oo0oo o0oo0ooOooO0O0 = o0oo0oo2.OooO0O0(i9);
                    linkedList.add(o0oo0ooOooO0O0.OooO0Oo(4, i6));
                    if (o0oo0oo2.f38949OooO00o != 4) {
                        linkedList.add(o0oo0ooOooO0O0.OooO0o0(4, i6));
                    }
                    if (i6 == 3 || i6 == 4) {
                        linkedList.add(o0oo0ooOooO0O0.OooO0Oo(2, 16 - i6).OooO0Oo(2, 1));
                    }
                    if (o0oo0oo2.f38951OooO0OO > 0) {
                        linkedList.add(o0oo0oo2.OooO00o(i9).OooO00o(i12));
                    }
                }
                collectionSingletonList = o0ooOOo.OooO00o(linkedList);
                i9 = i12;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (o0Oo0oo o0oo0oo3 : collectionSingletonList) {
                    char c = (char) (o0ooooo2.f38957OooO00o[i9] & UByte.MAX_VALUE);
                    boolean z2 = o0ooOOo.f38955OooO0Oo[o0oo0oo3.f38949OooO00o][c] > 0;
                    int i13 = 0;
                    o0Oo0oo o0oo0ooOooO0O1 = null;
                    while (i13 <= i10) {
                        int i14 = o0ooOOo.f38955OooO0Oo[i13][c];
                        if (i14 > 0) {
                            if (o0oo0ooOooO0O1 == null) {
                                o0oo0ooOooO0O1 = o0oo0oo3.OooO0O0(i9);
                            }
                            if (!z2 || i13 == o0oo0oo3.f38949OooO00o || i13 == i11) {
                                linkedList2.add(o0oo0ooOooO0O1.OooO0Oo(i13, i14));
                            }
                            if (!z2 && o0ooOOo.f38956OooO0o0[o0oo0oo3.f38949OooO00o][i13] >= 0) {
                                linkedList2.add(o0oo0ooOooO0O1.OooO0o0(i13, i14));
                            }
                        }
                        i13++;
                        i10 = 4;
                        i11 = 2;
                    }
                    if (o0oo0oo3.f38951OooO0OO > 0 || o0ooOOo.f38955OooO0Oo[o0oo0oo3.f38949OooO00o][c] == 0) {
                        linkedList2.add(o0oo0oo3.OooO00o(i9));
                    }
                    i10 = 4;
                    i11 = 2;
                }
                collectionSingletonList = o0ooOOo.OooO00o(linkedList2);
            }
            i9++;
        }
        o0Oo0oo o0oo0oo4 = (o0Oo0oo) Collections.min(collectionSingletonList, new o00oO0o());
        byte[] bArr2 = o0ooooo2.f38957OooO00o;
        Objects.requireNonNull(o0oo0oo4);
        LinkedList linkedList3 = new LinkedList();
        for (o0OO00O o0oo00o2 = o0oo0oo4.OooO0O0(bArr2.length).f38950OooO0O0; o0oo00o2 != null; o0oo00o2 = o0oo00o2.f38945OooO00o) {
            linkedList3.addFirst(o0oo00o2);
        }
        o00000O o00000o = new o00000O();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((o0OO00O) it.next()).OooO00o(o00000o, bArr2);
        }
        int i15 = o00000o.f38937OoooO00;
        int iOooO00o = kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(i7, i15, 100, 11);
        int i16 = i15 + iOooO00o;
        if (i8 != 0) {
            z = i8 < 0;
            iAbs = Math.abs(i8);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i8)));
            }
            i4 = ((z ? 88 : 112) + (iAbs << 4)) * iAbs;
            i3 = oo000o.f38958OooO00o[iAbs];
            int i17 = i4 - (i4 % i3);
            o00000oOooO0OO = oo000o.OooO0OO(o00000o, i3);
            int i18 = o00000oOooO0OO.f38937OoooO00;
            if (iOooO00o + i18 > i17) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && i18 > (i3 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i19 = 0;
            o00000O o00000oOooO0OO2 = null;
            i3 = 0;
            while (true) {
                if (i19 > i) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z3 = i19 <= 3;
                int i20 = z3 ? i19 + 1 : i19;
                int i21 = ((z3 ? 88 : 112) + (i20 << 4)) * i20;
                if (i16 <= i21) {
                    if (o00000oOooO0OO2 == null || i3 != oo000o.f38958OooO00o[i20]) {
                        int i22 = oo000o.f38958OooO00o[i20];
                        i3 = i22;
                        o00000oOooO0OO2 = oo000o.OooO0OO(o00000o, i22);
                    }
                    int i23 = i21 - (i21 % i3);
                    if ((!z3 || o00000oOooO0OO2.f38937OoooO00 <= (i3 << 6)) && o00000oOooO0OO2.f38937OoooO00 + iOooO00o <= i23) {
                        o00000oOooO0OO = o00000oOooO0OO2;
                        z = z3;
                        iAbs = i20;
                        i4 = i21;
                        break;
                    }
                }
                i19++;
                i = 32;
                i2 = 1;
            }
        }
        o00000O o00000oOooO0O1 = oo000o.OooO0O0(o00000oOooO0OO, i4, i3);
        int i24 = o00000oOooO0OO.f38937OoooO00 / i3;
        o00000O o00000o2 = new o00000O();
        if (z) {
            o00000o2.OooO0o0(iAbs - 1, 2);
            o00000o2.OooO0o0(i24 - 1, 6);
            o00000oOooO0O0 = oo000o.OooO0O0(o00000o2, 28, 4);
        } else {
            o00000o2.OooO0o0(iAbs - 1, 5);
            o00000o2.OooO0o0(i24 - 1, 11);
            o00000oOooO0O0 = oo000o.OooO0O0(o00000o2, 40, 4);
        }
        int i25 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i25];
        if (z) {
            for (int i26 = 0; i26 < i25; i26++) {
                iArr[i26] = i26;
            }
            i5 = i25;
        } else {
            int i27 = i25 / 2;
            i5 = (((i27 - 1) / 15) * 2) + i25 + 1;
            int i28 = i5 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr[(i27 - i29) - i2] = (i28 - i30) - 1;
                iArr[i27 + i29] = i30 + i28 + i2;
            }
        }
        o00000OO o00000oo2 = new o00000OO(i5, i5);
        int i31 = 0;
        for (int i32 = 0; i32 < iAbs; i32++) {
            int i33 = ((iAbs - i32) << 2) + (z ? 9 : 12);
            for (int i34 = 0; i34 < i33; i34++) {
                int i35 = i34 << 1;
                for (int i36 = 0; i36 < 2; i36++) {
                    if (o00000oOooO0O1.OooO0oO(i31 + i35 + i36)) {
                        int i37 = i32 << 1;
                        o00000oo2.OooO0Oo(iArr[i37 + i36], iArr[i37 + i34]);
                    }
                    if (o00000oOooO0O1.OooO0oO((i33 << 1) + i31 + i35 + i36)) {
                        int i38 = i32 << 1;
                        o00000oo2.OooO0Oo(iArr[i38 + i34], iArr[((i25 - 1) - i38) - i36]);
                    }
                    if (o00000oOooO0O1.OooO0oO((i33 << 2) + i31 + i35 + i36)) {
                        int i39 = (i25 - 1) - (i32 << 1);
                        o00000oo2.OooO0Oo(iArr[i39 - i36], iArr[i39 - i34]);
                    }
                    if (o00000oOooO0O1.OooO0oO((i33 * 6) + i31 + i35 + i36)) {
                        int i40 = i32 << 1;
                        o00000oo2.OooO0Oo(iArr[((i25 - 1) - i40) - i34], iArr[i40 + i36]);
                    }
                }
            }
            i31 += i33 << 3;
        }
        int i41 = i5 / 2;
        if (z) {
            for (int i42 = 0; i42 < 7; i42++) {
                int i43 = (i41 - 3) + i42;
                if (o00000oOooO0O0.OooO0oO(i42)) {
                    o00000oo2.OooO0Oo(i43, i41 - 5);
                }
                if (o00000oOooO0O0.OooO0oO(i42 + 7)) {
                    o00000oo2.OooO0Oo(i41 + 5, i43);
                }
                if (o00000oOooO0O0.OooO0oO(20 - i42)) {
                    o00000oo2.OooO0Oo(i43, i41 + 5);
                }
                if (o00000oOooO0O0.OooO0oO(27 - i42)) {
                    o00000oo2.OooO0Oo(i41 - 5, i43);
                }
            }
        } else {
            for (int i44 = 0; i44 < 10; i44++) {
                int i45 = (i44 / 5) + (i41 - 5) + i44;
                if (o00000oOooO0O0.OooO0oO(i44)) {
                    o00000oo2.OooO0Oo(i45, i41 - 7);
                }
                if (o00000oOooO0O0.OooO0oO(i44 + 10)) {
                    o00000oo2.OooO0Oo(i41 + 7, i45);
                }
                if (o00000oOooO0O0.OooO0oO(29 - i44)) {
                    o00000oo2.OooO0Oo(i45, i41 + 7);
                }
                if (o00000oOooO0O0.OooO0oO(39 - i44)) {
                    o00000oo2.OooO0Oo(i41 - 7, i45);
                }
            }
        }
        if (z) {
            oo000o.OooO00o(o00000oo2, i41, 5);
        } else {
            oo000o.OooO00o(o00000oo2, i41, 7);
            int i46 = 0;
            int i47 = 0;
            while (i46 < (i25 / 2) - 1) {
                for (int i48 = i41 & 1; i48 < i5; i48 += 2) {
                    int i49 = i41 - i47;
                    o00000oo2.OooO0Oo(i49, i48);
                    int i50 = i41 + i47;
                    o00000oo2.OooO0Oo(i50, i48);
                    o00000oo2.OooO0Oo(i48, i49);
                    o00000oo2.OooO0Oo(i48, i50);
                }
                i46 += 15;
                i47 += 16;
            }
        }
        int i51 = o00000oo2.f38938Oooo;
        int i52 = o00000oo2.f38940OoooO00;
        int iMax = Math.max(200, i51);
        int iMax2 = Math.max(200, i52);
        int iMin = Math.min(iMax / i51, iMax2 / i52);
        int i53 = (iMax - (i51 * iMin)) / 2;
        int i54 = (iMax2 - (i52 * iMin)) / 2;
        o00000OO o00000oo3 = new o00000OO(iMax, iMax2);
        int i55 = 0;
        while (i55 < i52) {
            int i56 = 0;
            int i57 = i53;
            while (i56 < i51) {
                if (o00000oo2.OooO0OO(i56, i55)) {
                    o00000oo3.OooO0o0(i57, i54, iMin, iMin);
                }
                i56++;
                i57 += iMin;
            }
            i55++;
            i54 += iMin;
        }
        return o00000oo3;
    }
}
