package p115o00O00oO;

import android.graphics.Rect;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o000oOoO;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import o00O0.OooOOOO;
import oOO00O.OooO0O0;
import oOO00O.OooO0OO;
import oOO00O.OooOO0O;
import p113o00O00Oo.o0Oo0oo;
import p188o00o0O.OooOo00;
import p188o00o0O.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36469OooO00o = JsonReader.OooO00o.OooO00o("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36470OooO0O0 = JsonReader.OooO00o.OooO00o("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36471OooO0OO = JsonReader.OooO00o.OooO00o("list");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36472OooO0Oo = JsonReader.OooO00o.OooO00o("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static OooOO0 OooO00o(OooO00o oooO00o) throws IOException {
        float f;
        float f2;
        int i;
        float f3;
        OooOo00<Layer> oooOo00;
        float f4;
        float fOooO0OO = OooOOOO.OooO0OO();
        OooOo00<Layer> oooOo01 = new OooOo00<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Oooo0<OooO0OO> oooo0 = new Oooo0<>();
        OooOO0 oooOO1 = new OooOO0();
        oooO00o.OooO0OO();
        int iOooOooO = 0;
        float fOooOo = 0.0f;
        float fOooOo2 = 0.0f;
        float fOooOo3 = 0.0f;
        int iOooOooO2 = 0;
        while (oooO00o.OooOo00()) {
            float f5 = fOooOo;
            switch (oooO00o.Oooo0OO(f36469OooO00o)) {
                case 0:
                    iOooOooO2 = oooO00o.OooOooO();
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOo2 = fOooOo2;
                    arrayList2 = arrayList2;
                    fOooOo3 = fOooOo3;
                    map3 = map3;
                    oooo0 = oooo0;
                    break;
                case 1:
                    iOooOooO = oooO00o.OooOooO();
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOo2 = fOooOo2;
                    arrayList2 = arrayList2;
                    fOooOo3 = fOooOo3;
                    map3 = map3;
                    oooo0 = oooo0;
                    break;
                case 2:
                    fOooOo2 = (float) oooO00o.OooOo();
                    fOooOo = f5;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 3:
                    fOooOo3 = ((float) oooO00o.OooOo()) - 0.01f;
                    fOooOo = f5;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 4:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    oooOo01 = oooOo01;
                    fOooOo = (float) oooO00o.OooOo();
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 5:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooOo01 = oooOo01;
                    String[] strArrSplit = oooO00o.Oooo00o().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    if (!(i2 >= 4 && (i2 > 4 || (i3 >= 4 && (i3 > 4 || Integer.parseInt(strArrSplit[2]) >= 0))))) {
                        oooOO1.OooO00o("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 6:
                    fOooO0OO = fOooO0OO;
                    OooOo00<Layer> oooOo02 = oooOo01;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooO00o.OooO00o();
                    int i4 = 0;
                    while (oooO00o.OooOo00()) {
                        Layer layerOooO00o = o000Oo0.OooO00o(oooO00o, oooOO1);
                        if (layerOooO00o.f8824OooO0o0 == Layer.LayerType.IMAGE) {
                            i4++;
                        }
                        arrayList.add(layerOooO00o);
                        OooOo00<Layer> oooOo03 = oooOo02;
                        oooOo03.OooO(layerOooO00o.f8822OooO0Oo, layerOooO00o);
                        if (i4 > 4) {
                            o00O0.OooOO0.OooO0O0("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        oooOo02 = oooOo03;
                    }
                    oooOo01 = oooOo02;
                    oooO00o.OooO0oO();
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 7:
                    arrayList2 = arrayList2;
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo00()) {
                        ArrayList arrayList3 = new ArrayList();
                        OooOo00 oooOo04 = new OooOo00();
                        oooO00o.OooO0OO();
                        HashMap map4 = map3;
                        String strOooo00o = null;
                        String strOooo00o2 = null;
                        int iOooOooO3 = 0;
                        int iOooOooO4 = 0;
                        while (oooO00o.OooOo00()) {
                            oooo0 = oooo0;
                            int iOooo0OO = oooO00o.Oooo0OO(f36470OooO0O0);
                            if (iOooo0OO != 0) {
                                i = iOooOooO;
                                if (iOooo0OO == 1) {
                                    oooO00o.OooO00o();
                                    while (oooO00o.OooOo00()) {
                                        Layer layerOooO00o2 = o000Oo0.OooO00o(oooO00o, oooOO1);
                                        oooOo04.OooO(layerOooO00o2.f8822OooO0Oo, layerOooO00o2);
                                        arrayList3.add(layerOooO00o2);
                                        fOooO0OO = fOooO0OO;
                                        oooOo01 = oooOo01;
                                    }
                                    f3 = fOooO0OO;
                                    oooOo00 = oooOo01;
                                    oooO00o.OooO0oO();
                                } else if (iOooo0OO == 2) {
                                    iOooOooO3 = oooO00o.OooOooO();
                                } else if (iOooo0OO == 3) {
                                    iOooOooO4 = oooO00o.OooOooO();
                                } else if (iOooo0OO == 4) {
                                    strOooo00o2 = oooO00o.Oooo00o();
                                } else if (iOooo0OO != 5) {
                                    oooO00o.Oooo0o0();
                                    oooO00o.Oooo0o();
                                    f3 = fOooO0OO;
                                    oooOo00 = oooOo01;
                                } else {
                                    oooO00o.Oooo00o();
                                }
                                fOooO0OO = f3;
                                iOooOooO = i;
                                oooOo01 = oooOo00;
                            } else {
                                i = iOooOooO;
                                strOooo00o = oooO00o.Oooo00o();
                            }
                            iOooOooO = i;
                        }
                        float f6 = fOooO0OO;
                        OooOo00<Layer> oooOo05 = oooOo01;
                        Oooo0<OooO0OO> oooo1 = oooo0;
                        int i5 = iOooOooO;
                        oooO00o.OooOOo0();
                        if (strOooo00o2 != null) {
                            map2.put(strOooo00o, new o000oOoO(strOooo00o, strOooo00o2, iOooOooO3, iOooOooO4));
                        } else {
                            map.put(strOooo00o, arrayList3);
                        }
                        fOooO0OO = f6;
                        map3 = map4;
                        oooo0 = oooo1;
                        iOooOooO = i5;
                        oooOo01 = oooOo05;
                    }
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    oooO00o.OooO0oO();
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 8:
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo00()) {
                        if (oooO00o.Oooo0OO(f36471OooO0OO) != 0) {
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                        } else {
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo00()) {
                                JsonReader.OooO00o oooO00o2 = o0000O0.f36456OooO00o;
                                oooO00o.OooO0OO();
                                String strOooo00o3 = null;
                                String strOooo00o4 = null;
                                String strOooo00o5 = null;
                                while (oooO00o.OooOo00()) {
                                    int iOooo0OO2 = oooO00o.Oooo0OO(o0000O0.f36456OooO00o);
                                    if (iOooo0OO2 != 0) {
                                        ArrayList arrayList4 = arrayList2;
                                        if (iOooo0OO2 == 1) {
                                            strOooo00o4 = oooO00o.Oooo00o();
                                        } else if (iOooo0OO2 == 2) {
                                            strOooo00o5 = oooO00o.Oooo00o();
                                        } else if (iOooo0OO2 != 3) {
                                            oooO00o.Oooo0o0();
                                            oooO00o.Oooo0o();
                                        } else {
                                            oooO00o.OooOo();
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        strOooo00o3 = oooO00o.Oooo00o();
                                    }
                                }
                                oooO00o.OooOOo0();
                                map3.put(strOooo00o4, new OooO0O0(strOooo00o3, strOooo00o4, strOooo00o5));
                                arrayList2 = arrayList2;
                            }
                            oooO00o.OooO0oO();
                        }
                    }
                    arrayList2 = arrayList2;
                    oooO00o.OooOOo0();
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 9:
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo00()) {
                        JsonReader.OooO00o oooO00o3 = o0000oo.f36465OooO00o;
                        ArrayList arrayList5 = new ArrayList();
                        oooO00o.OooO0OO();
                        double dOooOo = 0.0d;
                        String strOooo00o6 = null;
                        String strOooo00o7 = null;
                        char cCharAt = 0;
                        while (oooO00o.OooOo00()) {
                            int iOooo0OO3 = oooO00o.Oooo0OO(o0000oo.f36465OooO00o);
                            if (iOooo0OO3 == 0) {
                                cCharAt = oooO00o.Oooo00o().charAt(0);
                            } else if (iOooo0OO3 == 1) {
                                oooO00o.OooOo();
                            } else if (iOooo0OO3 == 2) {
                                dOooOo = oooO00o.OooOo();
                            } else if (iOooo0OO3 == 3) {
                                strOooo00o6 = oooO00o.Oooo00o();
                            } else if (iOooo0OO3 == 4) {
                                strOooo00o7 = oooO00o.Oooo00o();
                            } else if (iOooo0OO3 != 5) {
                                oooO00o.Oooo0o0();
                                oooO00o.Oooo0o();
                            } else {
                                oooO00o.OooO0OO();
                                while (oooO00o.OooOo00()) {
                                    if (oooO00o.Oooo0OO(o0000oo.f36466OooO0O0) != 0) {
                                        oooO00o.Oooo0o0();
                                        oooO00o.Oooo0o();
                                    } else {
                                        oooO00o.OooO00o();
                                        while (oooO00o.OooOo00()) {
                                            arrayList5.add((o0Oo0oo) o00000O.OooO00o(oooO00o, oooOO1));
                                        }
                                        oooO00o.OooO0oO();
                                    }
                                }
                                oooO00o.OooOOo0();
                            }
                        }
                        oooO00o.OooOOo0();
                        OooO0OO oooO0OO = new OooO0OO(arrayList5, cCharAt, dOooOo, strOooo00o6, strOooo00o7);
                        oooo0.OooO0oo(oooO0OO.hashCode(), oooO0OO);
                    }
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                case 10:
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo00()) {
                        oooO00o.OooO0OO();
                        String strOooo00o8 = null;
                        float fOooOo4 = 0.0f;
                        float fOooOo5 = 0.0f;
                        while (oooO00o.OooOo00()) {
                            int iOooo0OO4 = oooO00o.Oooo0OO(f36472OooO0Oo);
                            if (iOooo0OO4 != 0) {
                                f4 = fOooOo3;
                                if (iOooo0OO4 == 1) {
                                    fOooOo4 = (float) oooO00o.OooOo();
                                } else if (iOooo0OO4 != 2) {
                                    oooO00o.Oooo0o0();
                                    oooO00o.Oooo0o();
                                } else {
                                    fOooOo5 = (float) oooO00o.OooOo();
                                }
                                fOooOo2 = fOooOo2;
                            } else {
                                f4 = fOooOo3;
                                strOooo00o8 = oooO00o.Oooo00o();
                            }
                            fOooOo3 = f4;
                        }
                        oooO00o.OooOOo0();
                        arrayList2.add(new OooOO0O(strOooo00o8, fOooOo4, fOooOo5));
                        fOooOo2 = fOooOo2;
                        fOooOo3 = fOooOo3;
                    }
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    oooOo01 = oooOo01;
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
                default:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    f = fOooOo2;
                    f2 = fOooOo3;
                    oooOo01 = oooOo01;
                    oooO00o.Oooo0o0();
                    oooO00o.Oooo0o();
                    fOooOo = f5;
                    fOooOo2 = f;
                    fOooOo3 = f2;
                    oooOo01 = oooOo01;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo0 = oooo0;
                    iOooOooO = iOooOooO;
                    break;
            }
        }
        float f7 = fOooO0OO;
        oooOO1.f8731OooOO0 = new Rect(0, 0, (int) (iOooOooO2 * f7), (int) (iOooOooO * f7));
        oooOO1.f8732OooOO0O = fOooOo2;
        oooOO1.f8733OooOO0o = fOooOo3;
        oooOO1.f8735OooOOO0 = fOooOo;
        oooOO1.f8722OooO = arrayList;
        oooOO1.f8730OooO0oo = oooOo01;
        oooOO1.f8725OooO0OO = map;
        oooOO1.f8726OooO0Oo = map2;
        oooOO1.f8729OooO0oO = oooo0;
        oooOO1.f8728OooO0o0 = map3;
        oooOO1.f8727OooO0o = arrayList2;
        return oooOO1;
    }
}
