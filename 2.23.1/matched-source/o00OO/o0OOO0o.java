package o00OO;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36901OooO00o = JsonReader.OooO00o.OooO00o("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36902OooO0O0 = JsonReader.OooO00o.OooO00o("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36903OooO0OO = JsonReader.OooO00o.OooO00o("list");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36904OooO0Oo = JsonReader.OooO00o.OooO00o("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static com.airbnb.lottie.OooOO0 OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o) throws IOException {
        float f;
        float f2;
        int i;
        float f3;
        p190o00o0O.OooOOOO<Layer> oooOOOO;
        float f4;
        float fOooO0OO = o00OOO0.OooOOOO.OooO0OO();
        p190o00o0O.OooOOOO<Layer> oooOOOO2 = new p190o00o0O.OooOOOO<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        p190o00o0O.Oooo000<p135o00OO0o0.oo000o> oooo000 = new p190o00o0O.Oooo000<>();
        com.airbnb.lottie.OooOO0 oooOO1 = new com.airbnb.lottie.OooOO0();
        oooO00o.OooO0OO();
        int iOooo00O = 0;
        float fOooOoO = 0.0f;
        float fOooOoO2 = 0.0f;
        float fOooOoO3 = 0.0f;
        int iOooo00O2 = 0;
        while (oooO00o.OooOo0O()) {
            float f5 = fOooOoO;
            switch (oooO00o.Oooo0oO(f36901OooO00o)) {
                case 0:
                    iOooo00O2 = oooO00o.Oooo00O();
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOoO2 = fOooOoO2;
                    arrayList2 = arrayList2;
                    fOooOoO3 = fOooOoO3;
                    map3 = map3;
                    oooo000 = oooo000;
                    break;
                case 1:
                    iOooo00O = oooO00o.Oooo00O();
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOoO2 = fOooOoO2;
                    arrayList2 = arrayList2;
                    fOooOoO3 = fOooOoO3;
                    map3 = map3;
                    oooo000 = oooo000;
                    break;
                case 2:
                    fOooOoO2 = (float) oooO00o.OooOoO();
                    fOooOoO = f5;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 3:
                    fOooOoO3 = ((float) oooO00o.OooOoO()) - 0.01f;
                    fOooOoO = f5;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 4:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = (float) oooO00o.OooOoO();
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 5:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooOOOO2 = oooOOOO2;
                    String[] strArrSplit = oooO00o.Oooo0O0().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    if (!(i2 >= 4 && (i2 > 4 || (i3 >= 4 && (i3 > 4 || Integer.parseInt(strArrSplit[2]) >= 0))))) {
                        oooOO1.OooO00o("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 6:
                    fOooO0OO = fOooO0OO;
                    p190o00o0O.OooOOOO<Layer> oooOOOO3 = oooOOOO2;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooO00o.OooO00o();
                    int i4 = 0;
                    while (oooO00o.OooOo0O()) {
                        Layer layerOooO00o = o0ooOOo.OooO00o(oooO00o, oooOO1);
                        if (layerOooO00o.f11925OooO0o0 == Layer.LayerType.IMAGE) {
                            i4++;
                        }
                        arrayList.add(layerOooO00o);
                        p190o00o0O.OooOOOO<Layer> oooOOOO4 = oooOOOO3;
                        oooOOOO4.OooO(layerOooO00o.f11923OooO0Oo, layerOooO00o);
                        if (i4 > 4) {
                            o00OOO0.OooOO0.OooO0O0("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        oooOOOO3 = oooOOOO4;
                    }
                    oooOOOO2 = oooOOOO3;
                    oooO00o.OooO0oO();
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 7:
                    arrayList2 = arrayList2;
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0O()) {
                        ArrayList arrayList3 = new ArrayList();
                        p190o00o0O.OooOOOO oooOOOO5 = new p190o00o0O.OooOOOO();
                        oooO00o.OooO0OO();
                        HashMap map4 = map3;
                        String strOooo0O0 = null;
                        String strOooo0O1 = null;
                        int iOooo00O3 = 0;
                        int iOooo00O4 = 0;
                        while (oooO00o.OooOo0O()) {
                            oooo000 = oooo000;
                            int iOooo0oO = oooO00o.Oooo0oO(f36902OooO0O0);
                            if (iOooo0oO != 0) {
                                i = iOooo00O;
                                if (iOooo0oO == 1) {
                                    oooO00o.OooO00o();
                                    while (oooO00o.OooOo0O()) {
                                        Layer layerOooO00o2 = o0ooOOo.OooO00o(oooO00o, oooOO1);
                                        oooOOOO5.OooO(layerOooO00o2.f11923OooO0Oo, layerOooO00o2);
                                        arrayList3.add(layerOooO00o2);
                                        fOooO0OO = fOooO0OO;
                                        oooOOOO2 = oooOOOO2;
                                    }
                                    f3 = fOooO0OO;
                                    oooOOOO = oooOOOO2;
                                    oooO00o.OooO0oO();
                                } else if (iOooo0oO == 2) {
                                    iOooo00O3 = oooO00o.Oooo00O();
                                } else if (iOooo0oO == 3) {
                                    iOooo00O4 = oooO00o.Oooo00O();
                                } else if (iOooo0oO == 4) {
                                    strOooo0O1 = oooO00o.Oooo0O0();
                                } else if (iOooo0oO != 5) {
                                    oooO00o.Oooo0oo();
                                    oooO00o.Oooo();
                                    f3 = fOooO0OO;
                                    oooOOOO = oooOOOO2;
                                } else {
                                    oooO00o.Oooo0O0();
                                }
                                fOooO0OO = f3;
                                iOooo00O = i;
                                oooOOOO2 = oooOOOO;
                            } else {
                                i = iOooo00O;
                                strOooo0O0 = oooO00o.Oooo0O0();
                            }
                            iOooo00O = i;
                        }
                        float f6 = fOooO0OO;
                        p190o00o0O.OooOOOO<Layer> oooOOOO6 = oooOOOO2;
                        p190o00o0O.Oooo000<p135o00OO0o0.oo000o> oooo001 = oooo000;
                        int i5 = iOooo00O;
                        oooO00o.OooOOoo();
                        if (strOooo0O1 != null) {
                            map2.put(strOooo0O0, new com.airbnb.lottie.o000oOoO(strOooo0O0, strOooo0O1, iOooo00O3, iOooo00O4));
                        } else {
                            map.put(strOooo0O0, arrayList3);
                        }
                        fOooO0OO = f6;
                        map3 = map4;
                        oooo000 = oooo001;
                        iOooo00O = i5;
                        oooOOOO2 = oooOOOO6;
                    }
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    oooO00o.OooO0oO();
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 8:
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo0O()) {
                        if (oooO00o.Oooo0oO(f36903OooO0OO) != 0) {
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                        } else {
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0O()) {
                                JsonReader.OooO00o oooO00o2 = Oooo0.f36877OooO00o;
                                oooO00o.OooO0OO();
                                String strOooo0O2 = null;
                                String strOooo0O3 = null;
                                String strOooo0O4 = null;
                                while (oooO00o.OooOo0O()) {
                                    int iOooo0oO2 = oooO00o.Oooo0oO(Oooo0.f36877OooO00o);
                                    if (iOooo0oO2 != 0) {
                                        ArrayList arrayList4 = arrayList2;
                                        if (iOooo0oO2 == 1) {
                                            strOooo0O3 = oooO00o.Oooo0O0();
                                        } else if (iOooo0oO2 == 2) {
                                            strOooo0O4 = oooO00o.Oooo0O0();
                                        } else if (iOooo0oO2 != 3) {
                                            oooO00o.Oooo0oo();
                                            oooO00o.Oooo();
                                        } else {
                                            oooO00o.OooOoO();
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        strOooo0O2 = oooO00o.Oooo0O0();
                                    }
                                }
                                oooO00o.OooOOoo();
                                map3.put(strOooo0O3, new p135o00OO0o0.o00Ooo(strOooo0O2, strOooo0O3, strOooo0O4));
                                arrayList2 = arrayList2;
                            }
                            oooO00o.OooO0oO();
                        }
                    }
                    arrayList2 = arrayList2;
                    oooO00o.OooOOoo();
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 9:
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0O()) {
                        JsonReader.OooO00o oooO00o3 = Oooo000.f36878OooO00o;
                        ArrayList arrayList5 = new ArrayList();
                        oooO00o.OooO0OO();
                        double dOooOoO = 0.0d;
                        String strOooo0O5 = null;
                        String strOooo0O6 = null;
                        char cCharAt = 0;
                        while (oooO00o.OooOo0O()) {
                            int iOooo0oO3 = oooO00o.Oooo0oO(Oooo000.f36878OooO00o);
                            if (iOooo0oO3 == 0) {
                                cCharAt = oooO00o.Oooo0O0().charAt(0);
                            } else if (iOooo0oO3 == 1) {
                                oooO00o.OooOoO();
                            } else if (iOooo0oO3 == 2) {
                                dOooOoO = oooO00o.OooOoO();
                            } else if (iOooo0oO3 == 3) {
                                strOooo0O5 = oooO00o.Oooo0O0();
                            } else if (iOooo0oO3 == 4) {
                                strOooo0O6 = oooO00o.Oooo0O0();
                            } else if (iOooo0oO3 != 5) {
                                oooO00o.Oooo0oo();
                                oooO00o.Oooo();
                            } else {
                                oooO00o.OooO0OO();
                                while (oooO00o.OooOo0O()) {
                                    if (oooO00o.Oooo0oO(Oooo000.f36879OooO0O0) != 0) {
                                        oooO00o.Oooo0oo();
                                        oooO00o.Oooo();
                                    } else {
                                        oooO00o.OooO00o();
                                        while (oooO00o.OooOo0O()) {
                                            arrayList5.add((p136o00OO0oO.OooOo) OooOOO0.OooO00o(oooO00o, oooOO1));
                                        }
                                        oooO00o.OooO0oO();
                                    }
                                }
                                oooO00o.OooOOoo();
                            }
                        }
                        oooO00o.OooOOoo();
                        p135o00OO0o0.oo000o oo000oVar = new p135o00OO0o0.oo000o(arrayList5, cCharAt, dOooOoO, strOooo0O5, strOooo0O6);
                        oooo000.OooO0oo(oo000oVar.hashCode(), oo000oVar);
                    }
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                case 10:
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0O()) {
                        oooO00o.OooO0OO();
                        String strOooo0O7 = null;
                        float fOooOoO4 = 0.0f;
                        float fOooOoO5 = 0.0f;
                        while (oooO00o.OooOo0O()) {
                            int iOooo0oO4 = oooO00o.Oooo0oO(f36904OooO0Oo);
                            if (iOooo0oO4 != 0) {
                                f4 = fOooOoO3;
                                if (iOooo0oO4 == 1) {
                                    fOooOoO4 = (float) oooO00o.OooOoO();
                                } else if (iOooo0oO4 != 2) {
                                    oooO00o.Oooo0oo();
                                    oooO00o.Oooo();
                                } else {
                                    fOooOoO5 = (float) oooO00o.OooOoO();
                                }
                                fOooOoO2 = fOooOoO2;
                            } else {
                                f4 = fOooOoO3;
                                strOooo0O7 = oooO00o.Oooo0O0();
                            }
                            fOooOoO3 = f4;
                        }
                        oooO00o.OooOOoo();
                        arrayList2.add(new p135o00OO0o0.o0Oo0oo(strOooo0O7, fOooOoO4, fOooOoO5));
                        fOooOoO2 = fOooOoO2;
                        fOooOoO3 = fOooOoO3;
                    }
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    oooOOOO2 = oooOOOO2;
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
                default:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    f = fOooOoO2;
                    f2 = fOooOoO3;
                    oooOOOO2 = oooOOOO2;
                    oooO00o.Oooo0oo();
                    oooO00o.Oooo();
                    fOooOoO = f5;
                    fOooOoO2 = f;
                    fOooOoO3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00O = iOooo00O;
                    break;
            }
        }
        float f7 = fOooO0OO;
        oooOO1.f11832OooOO0 = new Rect(0, 0, (int) (iOooo00O2 * f7), (int) (iOooo00O * f7));
        oooOO1.f11833OooOO0O = fOooOoO2;
        oooOO1.f11834OooOO0o = fOooOoO3;
        oooOO1.f11836OooOOO0 = fOooOoO;
        oooOO1.f11823OooO = arrayList;
        oooOO1.f11831OooO0oo = oooOOOO2;
        oooOO1.f11826OooO0OO = map;
        oooOO1.f11827OooO0Oo = map2;
        oooOO1.f11830OooO0oO = oooo000;
        oooOO1.f11829OooO0o0 = map3;
        oooOO1.f11828OooO0o = arrayList2;
        return oooOO1;
    }
}
