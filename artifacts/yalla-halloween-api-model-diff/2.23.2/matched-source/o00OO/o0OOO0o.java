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
    public static final JsonReader.OooO00o f36905OooO00o = JsonReader.OooO00o.OooO00o("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36906OooO0O0 = JsonReader.OooO00o.OooO00o("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36907OooO0OO = JsonReader.OooO00o.OooO00o("list");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36908OooO0Oo = JsonReader.OooO00o.OooO00o("cm", "tm", "dr");

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
        int iOooo00o = 0;
        float fOooOooo = 0.0f;
        float fOooOooo2 = 0.0f;
        float fOooOooo3 = 0.0f;
        int iOooo00o2 = 0;
        while (oooO00o.OooOo0()) {
            float f5 = fOooOooo;
            switch (oooO00o.Oooo0o0(f36905OooO00o)) {
                case 0:
                    iOooo00o2 = oooO00o.Oooo00o();
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOooo2 = fOooOooo2;
                    arrayList2 = arrayList2;
                    fOooOooo3 = fOooOooo3;
                    map3 = map3;
                    oooo000 = oooo000;
                    break;
                case 1:
                    iOooo00o = oooO00o.Oooo00o();
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOooo2 = fOooOooo2;
                    arrayList2 = arrayList2;
                    fOooOooo3 = fOooOooo3;
                    map3 = map3;
                    oooo000 = oooo000;
                    break;
                case 2:
                    fOooOooo2 = (float) oooO00o.OooOooo();
                    fOooOooo = f5;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 3:
                    fOooOooo3 = ((float) oooO00o.OooOooo()) - 0.01f;
                    fOooOooo = f5;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 4:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = (float) oooO00o.OooOooo();
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 5:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooOOOO2 = oooOOOO2;
                    String[] strArrSplit = oooO00o.Oooo0().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    if (!(i2 >= 4 && (i2 > 4 || (i3 >= 4 && (i3 > 4 || Integer.parseInt(strArrSplit[2]) >= 0))))) {
                        oooOO1.OooO00o("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 6:
                    fOooO0OO = fOooO0OO;
                    p190o00o0O.OooOOOO<Layer> oooOOOO3 = oooOOOO2;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooO00o.OooO00o();
                    int i4 = 0;
                    while (oooO00o.OooOo0()) {
                        Layer layerOooO00o = o0ooOOo.OooO00o(oooO00o, oooOO1);
                        if (layerOooO00o.f11914OooO0o0 == Layer.LayerType.IMAGE) {
                            i4++;
                        }
                        arrayList.add(layerOooO00o);
                        p190o00o0O.OooOOOO<Layer> oooOOOO4 = oooOOOO3;
                        oooOOOO4.OooO(layerOooO00o.f11912OooO0Oo, layerOooO00o);
                        if (i4 > 4) {
                            o00OOO0.OooOO0.OooO0O0("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        oooOOOO3 = oooOOOO4;
                    }
                    oooOOOO2 = oooOOOO3;
                    oooO00o.OooO0oO();
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 7:
                    arrayList2 = arrayList2;
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0()) {
                        ArrayList arrayList3 = new ArrayList();
                        p190o00o0O.OooOOOO oooOOOO5 = new p190o00o0O.OooOOOO();
                        oooO00o.OooO0OO();
                        HashMap map4 = map3;
                        String strOooo0 = null;
                        String strOooo1 = null;
                        int iOooo00o3 = 0;
                        int iOooo00o4 = 0;
                        while (oooO00o.OooOo0()) {
                            oooo000 = oooo000;
                            int iOooo0o0 = oooO00o.Oooo0o0(f36906OooO0O0);
                            if (iOooo0o0 != 0) {
                                i = iOooo00o;
                                if (iOooo0o0 == 1) {
                                    oooO00o.OooO00o();
                                    while (oooO00o.OooOo0()) {
                                        Layer layerOooO00o2 = o0ooOOo.OooO00o(oooO00o, oooOO1);
                                        oooOOOO5.OooO(layerOooO00o2.f11912OooO0Oo, layerOooO00o2);
                                        arrayList3.add(layerOooO00o2);
                                        fOooO0OO = fOooO0OO;
                                        oooOOOO2 = oooOOOO2;
                                    }
                                    f3 = fOooO0OO;
                                    oooOOOO = oooOOOO2;
                                    oooO00o.OooO0oO();
                                } else if (iOooo0o0 == 2) {
                                    iOooo00o3 = oooO00o.Oooo00o();
                                } else if (iOooo0o0 == 3) {
                                    iOooo00o4 = oooO00o.Oooo00o();
                                } else if (iOooo0o0 == 4) {
                                    strOooo1 = oooO00o.Oooo0();
                                } else if (iOooo0o0 != 5) {
                                    oooO00o.Oooo0oO();
                                    oooO00o.OoooO00();
                                    f3 = fOooO0OO;
                                    oooOOOO = oooOOOO2;
                                } else {
                                    oooO00o.Oooo0();
                                }
                                fOooO0OO = f3;
                                iOooo00o = i;
                                oooOOOO2 = oooOOOO;
                            } else {
                                i = iOooo00o;
                                strOooo0 = oooO00o.Oooo0();
                            }
                            iOooo00o = i;
                        }
                        float f6 = fOooO0OO;
                        p190o00o0O.OooOOOO<Layer> oooOOOO6 = oooOOOO2;
                        p190o00o0O.Oooo000<p135o00OO0o0.oo000o> oooo001 = oooo000;
                        int i5 = iOooo00o;
                        oooO00o.OooOOo();
                        if (strOooo1 != null) {
                            map2.put(strOooo0, new com.airbnb.lottie.o000oOoO(strOooo0, strOooo1, iOooo00o3, iOooo00o4));
                        } else {
                            map.put(strOooo0, arrayList3);
                        }
                        fOooO0OO = f6;
                        map3 = map4;
                        oooo000 = oooo001;
                        iOooo00o = i5;
                        oooOOOO2 = oooOOOO6;
                    }
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    oooO00o.OooO0oO();
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 8:
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo0()) {
                        if (oooO00o.Oooo0o0(f36907OooO0OO) != 0) {
                            oooO00o.Oooo0oO();
                            oooO00o.OoooO00();
                        } else {
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0()) {
                                JsonReader.OooO00o oooO00o2 = Oooo0.f36881OooO00o;
                                oooO00o.OooO0OO();
                                String strOooo2 = null;
                                String strOooo3 = null;
                                String strOooo4 = null;
                                while (oooO00o.OooOo0()) {
                                    int iOooo0o1 = oooO00o.Oooo0o0(Oooo0.f36881OooO00o);
                                    if (iOooo0o1 != 0) {
                                        ArrayList arrayList4 = arrayList2;
                                        if (iOooo0o1 == 1) {
                                            strOooo3 = oooO00o.Oooo0();
                                        } else if (iOooo0o1 == 2) {
                                            strOooo4 = oooO00o.Oooo0();
                                        } else if (iOooo0o1 != 3) {
                                            oooO00o.Oooo0oO();
                                            oooO00o.OoooO00();
                                        } else {
                                            oooO00o.OooOooo();
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        strOooo2 = oooO00o.Oooo0();
                                    }
                                }
                                oooO00o.OooOOo();
                                map3.put(strOooo3, new p135o00OO0o0.o00Ooo(strOooo2, strOooo3, strOooo4));
                                arrayList2 = arrayList2;
                            }
                            oooO00o.OooO0oO();
                        }
                    }
                    arrayList2 = arrayList2;
                    oooO00o.OooOOo();
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 9:
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0()) {
                        JsonReader.OooO00o oooO00o3 = Oooo000.f36882OooO00o;
                        ArrayList arrayList5 = new ArrayList();
                        oooO00o.OooO0OO();
                        double dOooOooo = 0.0d;
                        String strOooo5 = null;
                        String strOooo6 = null;
                        char cCharAt = 0;
                        while (oooO00o.OooOo0()) {
                            int iOooo0o2 = oooO00o.Oooo0o0(Oooo000.f36882OooO00o);
                            if (iOooo0o2 == 0) {
                                cCharAt = oooO00o.Oooo0().charAt(0);
                            } else if (iOooo0o2 == 1) {
                                oooO00o.OooOooo();
                            } else if (iOooo0o2 == 2) {
                                dOooOooo = oooO00o.OooOooo();
                            } else if (iOooo0o2 == 3) {
                                strOooo5 = oooO00o.Oooo0();
                            } else if (iOooo0o2 == 4) {
                                strOooo6 = oooO00o.Oooo0();
                            } else if (iOooo0o2 != 5) {
                                oooO00o.Oooo0oO();
                                oooO00o.OoooO00();
                            } else {
                                oooO00o.OooO0OO();
                                while (oooO00o.OooOo0()) {
                                    if (oooO00o.Oooo0o0(Oooo000.f36883OooO0O0) != 0) {
                                        oooO00o.Oooo0oO();
                                        oooO00o.OoooO00();
                                    } else {
                                        oooO00o.OooO00o();
                                        while (oooO00o.OooOo0()) {
                                            arrayList5.add((p136o00OO0oO.OooOo) OooOOO0.OooO00o(oooO00o, oooOO1));
                                        }
                                        oooO00o.OooO0oO();
                                    }
                                }
                                oooO00o.OooOOo();
                            }
                        }
                        oooO00o.OooOOo();
                        p135o00OO0o0.oo000o oo000oVar = new p135o00OO0o0.oo000o(arrayList5, cCharAt, dOooOooo, strOooo5, strOooo6);
                        oooo000.OooO0oo(oo000oVar.hashCode(), oo000oVar);
                    }
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                case 10:
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0()) {
                        oooO00o.OooO0OO();
                        String strOooo7 = null;
                        float fOooOooo4 = 0.0f;
                        float fOooOooo5 = 0.0f;
                        while (oooO00o.OooOo0()) {
                            int iOooo0o3 = oooO00o.Oooo0o0(f36908OooO0Oo);
                            if (iOooo0o3 != 0) {
                                f4 = fOooOooo3;
                                if (iOooo0o3 == 1) {
                                    fOooOooo4 = (float) oooO00o.OooOooo();
                                } else if (iOooo0o3 != 2) {
                                    oooO00o.Oooo0oO();
                                    oooO00o.OoooO00();
                                } else {
                                    fOooOooo5 = (float) oooO00o.OooOooo();
                                }
                                fOooOooo2 = fOooOooo2;
                            } else {
                                f4 = fOooOooo3;
                                strOooo7 = oooO00o.Oooo0();
                            }
                            fOooOooo3 = f4;
                        }
                        oooO00o.OooOOo();
                        arrayList2.add(new p135o00OO0o0.o0Oo0oo(strOooo7, fOooOooo4, fOooOooo5));
                        fOooOooo2 = fOooOooo2;
                        fOooOooo3 = fOooOooo3;
                    }
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooO00o.OooO0oO();
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    oooOOOO2 = oooOOOO2;
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
                default:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    f = fOooOooo2;
                    f2 = fOooOooo3;
                    oooOOOO2 = oooOOOO2;
                    oooO00o.Oooo0oO();
                    oooO00o.OoooO00();
                    fOooOooo = f5;
                    fOooOooo2 = f;
                    fOooOooo3 = f2;
                    oooOOOO2 = oooOOOO2;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    oooo000 = oooo000;
                    iOooo00o = iOooo00o;
                    break;
            }
        }
        float f7 = fOooO0OO;
        oooOO1.f11821OooOO0 = new Rect(0, 0, (int) (iOooo00o2 * f7), (int) (iOooo00o * f7));
        oooOO1.f11822OooOO0O = fOooOooo2;
        oooOO1.f11823OooOO0o = fOooOooo3;
        oooOO1.f11825OooOOO0 = fOooOooo;
        oooOO1.f11812OooO = arrayList;
        oooOO1.f11820OooO0oo = oooOOOO2;
        oooOO1.f11815OooO0OO = map;
        oooOO1.f11816OooO0Oo = map2;
        oooOO1.f11819OooO0oO = oooo000;
        oooOO1.f11818OooO0o0 = map3;
        oooOO1.f11817OooO0o = arrayList2;
        return oooOO1;
    }
}
