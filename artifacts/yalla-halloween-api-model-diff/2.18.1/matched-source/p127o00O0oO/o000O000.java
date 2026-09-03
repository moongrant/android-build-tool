package p127o00O0oO;

import android.graphics.Rect;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.OooOo;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p021OooOooo.o00Ooo;
import p021OooOooo.o0ooOOo;
import p125o00O0o0O.o0000Ooo;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;
import p225o00oOOo.o00O0OO;
import p225o00oOOo.o00OO000;
import p225o00oOOo.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31104OooO00o = JsonReader.OooO00o.OooO00o("w", "h", "ip", "op", "fr", ak.aE, "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static JsonReader.OooO00o f31105OooO0O0 = JsonReader.OooO00o.OooO00o("id", "layers", "w", "h", ak.ax, ak.aG);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f31106OooO0OO = JsonReader.OooO00o.OooO00o("list");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f31107OooO0Oo = JsonReader.OooO00o.OooO00o("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static OooOO0O OooO00o(JsonReader jsonReader) throws IOException {
        float f;
        float f2;
        int i;
        float f3;
        o00Ooo<Layer> o00ooo2;
        float f4;
        float fOooO0OO = o000O0Oo.OooO0OO();
        o00Ooo<Layer> o00ooo3 = new o00Ooo<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        o0ooOOo<o00O0OO> o0ooooo2 = new o0ooOOo<>();
        OooOO0O oooOO0O = new OooOO0O();
        jsonReader.OooO0O0();
        int iOooOo0O = 0;
        float fOooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooOOoo2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooOOoo3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int iOooOo0O2 = 0;
        while (jsonReader.OooOOO()) {
            float f5 = fOooOOoo;
            switch (jsonReader.Oooo0(f31104OooO00o)) {
                case 0:
                    iOooOo0O2 = jsonReader.OooOo0O();
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOOoo2 = fOooOOoo2;
                    arrayList2 = arrayList2;
                    fOooOOoo3 = fOooOOoo3;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    break;
                case 1:
                    iOooOo0O = jsonReader.OooOo0O();
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooO0OO = fOooO0OO;
                    fOooOOoo2 = fOooOOoo2;
                    arrayList2 = arrayList2;
                    fOooOOoo3 = fOooOOoo3;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    break;
                case 2:
                    fOooOOoo2 = (float) jsonReader.OooOOoo();
                    fOooOOoo = f5;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 3:
                    fOooOOoo3 = ((float) jsonReader.OooOOoo()) - 0.01f;
                    fOooOOoo = f5;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 4:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    o00ooo3 = o00ooo3;
                    fOooOOoo = (float) jsonReader.OooOOoo();
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 5:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    o00ooo3 = o00ooo3;
                    String[] strArrSplit = jsonReader.OooOoOO().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    if (!(i2 >= 4 && (i2 > 4 || (i3 >= 4 && (i3 > 4 || Integer.parseInt(strArrSplit[2]) >= 0))))) {
                        oooOO0O.OooO00o("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 6:
                    fOooO0OO = fOooO0OO;
                    o00Ooo<Layer> o00ooo4 = o00ooo3;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    jsonReader.OooO00o();
                    int i4 = 0;
                    while (jsonReader.OooOOO()) {
                        Layer layerOooO00o = o000.OooO00o(jsonReader, oooOO0O);
                        if (layerOooO00o.f10145OooO0o0 == Layer.LayerType.IMAGE) {
                            i4++;
                        }
                        arrayList.add(layerOooO00o);
                        o00Ooo<Layer> o00ooo5 = o00ooo4;
                        o00ooo5.OooOO0o(layerOooO00o.f10143OooO0Oo, layerOooO00o);
                        if (i4 > 4) {
                            o000Oo0.OooO0OO("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        o00ooo4 = o00ooo5;
                    }
                    o00ooo3 = o00ooo4;
                    jsonReader.OooO0Oo();
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 7:
                    arrayList2 = arrayList2;
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    jsonReader.OooO00o();
                    while (jsonReader.OooOOO()) {
                        ArrayList arrayList3 = new ArrayList();
                        o00Ooo o00ooo6 = new o00Ooo();
                        jsonReader.OooO0O0();
                        HashMap map4 = map3;
                        String strOooOoOO = null;
                        String strOooOoOO2 = null;
                        int iOooOo0O3 = 0;
                        int iOooOo0O4 = 0;
                        while (jsonReader.OooOOO()) {
                            o0ooooo2 = o0ooooo2;
                            int iOooo0 = jsonReader.Oooo0(f31105OooO0O0);
                            if (iOooo0 != 0) {
                                i = iOooOo0O;
                                if (iOooo0 == 1) {
                                    jsonReader.OooO00o();
                                    while (jsonReader.OooOOO()) {
                                        Layer layerOooO00o2 = o000.OooO00o(jsonReader, oooOO0O);
                                        o00ooo6.OooOO0o(layerOooO00o2.f10143OooO0Oo, layerOooO00o2);
                                        arrayList3.add(layerOooO00o2);
                                        fOooO0OO = fOooO0OO;
                                        o00ooo3 = o00ooo3;
                                    }
                                    f3 = fOooO0OO;
                                    o00ooo2 = o00ooo3;
                                    jsonReader.OooO0Oo();
                                } else if (iOooo0 == 2) {
                                    iOooOo0O3 = jsonReader.OooOo0O();
                                } else if (iOooo0 == 3) {
                                    iOooOo0O4 = jsonReader.OooOo0O();
                                } else if (iOooo0 == 4) {
                                    strOooOoOO2 = jsonReader.OooOoOO();
                                } else if (iOooo0 != 5) {
                                    jsonReader.Oooo0OO();
                                    jsonReader.Oooo0o();
                                    f3 = fOooO0OO;
                                    o00ooo2 = o00ooo3;
                                } else {
                                    jsonReader.OooOoOO();
                                }
                                fOooO0OO = f3;
                                iOooOo0O = i;
                                o00ooo3 = o00ooo2;
                            } else {
                                i = iOooOo0O;
                                strOooOoOO = jsonReader.OooOoOO();
                            }
                            iOooOo0O = i;
                        }
                        float f6 = fOooO0OO;
                        o00Ooo<Layer> o00ooo7 = o00ooo3;
                        o0ooOOo<o00O0OO> o0ooooo3 = o0ooooo2;
                        int i5 = iOooOo0O;
                        jsonReader.OooO0o();
                        if (strOooOoOO2 != null) {
                            map2.put(strOooOoOO, new OooOo(iOooOo0O3, iOooOo0O4, strOooOoOO, strOooOoOO2));
                        } else {
                            map.put(strOooOoOO, arrayList3);
                        }
                        fOooO0OO = f6;
                        map3 = map4;
                        o0ooooo2 = o0ooooo3;
                        iOooOo0O = i5;
                        o00ooo3 = o00ooo7;
                    }
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    jsonReader.OooO0Oo();
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 8:
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    jsonReader.OooO0O0();
                    while (jsonReader.OooOOO()) {
                        if (jsonReader.Oooo0(f31106OooO0OO) != 0) {
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                        } else {
                            jsonReader.OooO00o();
                            while (jsonReader.OooOOO()) {
                                JsonReader.OooO00o oooO00o = o0000.f31069OooO00o;
                                jsonReader.OooO0O0();
                                String strOooOoOO3 = null;
                                String strOooOoOO4 = null;
                                String strOooOoOO5 = null;
                                while (jsonReader.OooOOO()) {
                                    int iOooo1 = jsonReader.Oooo0(o0000.f31069OooO00o);
                                    if (iOooo1 != 0) {
                                        ArrayList arrayList4 = arrayList2;
                                        if (iOooo1 == 1) {
                                            strOooOoOO4 = jsonReader.OooOoOO();
                                        } else if (iOooo1 == 2) {
                                            strOooOoOO5 = jsonReader.OooOoOO();
                                        } else if (iOooo1 != 3) {
                                            jsonReader.Oooo0OO();
                                            jsonReader.Oooo0o();
                                        } else {
                                            jsonReader.OooOOoo();
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        strOooOoOO3 = jsonReader.OooOoOO();
                                    }
                                }
                                jsonReader.OooO0o();
                                map3.put(strOooOoOO4, new oo0o0O0(strOooOoOO3, strOooOoOO4, strOooOoOO5));
                                arrayList2 = arrayList2;
                            }
                            jsonReader.OooO0Oo();
                        }
                    }
                    arrayList2 = arrayList2;
                    jsonReader.OooO0o();
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 9:
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    jsonReader.OooO00o();
                    while (jsonReader.OooOOO()) {
                        JsonReader.OooO00o oooO00o2 = o0000Ooo.f31097OooO00o;
                        ArrayList arrayList5 = new ArrayList();
                        jsonReader.OooO0O0();
                        double dOooOOoo = 0.0d;
                        String strOooOoOO6 = null;
                        String strOooOoOO7 = null;
                        char cCharAt = 0;
                        while (jsonReader.OooOOO()) {
                            int iOooo2 = jsonReader.Oooo0(o0000Ooo.f31097OooO00o);
                            if (iOooo2 == 0) {
                                cCharAt = jsonReader.OooOoOO().charAt(0);
                            } else if (iOooo2 == 1) {
                                jsonReader.OooOOoo();
                            } else if (iOooo2 == 2) {
                                dOooOOoo = jsonReader.OooOOoo();
                            } else if (iOooo2 == 3) {
                                strOooOoOO6 = jsonReader.OooOoOO();
                            } else if (iOooo2 == 4) {
                                strOooOoOO7 = jsonReader.OooOoOO();
                            } else if (iOooo2 != 5) {
                                jsonReader.Oooo0OO();
                                jsonReader.Oooo0o();
                            } else {
                                jsonReader.OooO0O0();
                                while (jsonReader.OooOOO()) {
                                    if (jsonReader.Oooo0(o0000Ooo.f31098OooO0O0) != 0) {
                                        jsonReader.Oooo0OO();
                                        jsonReader.Oooo0o();
                                    } else {
                                        jsonReader.OooO00o();
                                        while (jsonReader.OooOOO()) {
                                            arrayList5.add((o0000Ooo) o000000O.OooO00o(jsonReader, oooOO0O));
                                        }
                                        jsonReader.OooO0Oo();
                                    }
                                }
                                jsonReader.OooO0o();
                            }
                        }
                        jsonReader.OooO0o();
                        o00O0OO o00o0oo2 = new o00O0OO(arrayList5, cCharAt, dOooOOoo, strOooOoOO6, strOooOoOO7);
                        o0ooooo2.OooOO0O(o00o0oo2.hashCode(), o00o0oo2);
                    }
                    jsonReader.OooO0Oo();
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                case 10:
                    jsonReader.OooO00o();
                    while (jsonReader.OooOOO()) {
                        jsonReader.OooO0O0();
                        String strOooOoOO8 = null;
                        float fOooOOoo4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        while (jsonReader.OooOOO()) {
                            int iOooo3 = jsonReader.Oooo0(f31107OooO0Oo);
                            if (iOooo3 != 0) {
                                f4 = fOooOOoo3;
                                if (iOooo3 == 1) {
                                    fOooOOoo4 = (float) jsonReader.OooOOoo();
                                } else if (iOooo3 != 2) {
                                    jsonReader.Oooo0OO();
                                    jsonReader.Oooo0o();
                                } else {
                                    fOooOOoo5 = (float) jsonReader.OooOOoo();
                                }
                                fOooOOoo2 = fOooOOoo2;
                            } else {
                                f4 = fOooOOoo3;
                                strOooOoOO8 = jsonReader.OooOoOO();
                            }
                            fOooOOoo3 = f4;
                        }
                        jsonReader.OooO0o();
                        arrayList2.add(new o00OO000(strOooOoOO8, fOooOOoo4, fOooOOoo5));
                        fOooOOoo2 = fOooOOoo2;
                        fOooOOoo3 = fOooOOoo3;
                    }
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    jsonReader.OooO0Oo();
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    o00ooo3 = o00ooo3;
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
                default:
                    fOooO0OO = fOooO0OO;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    f = fOooOOoo2;
                    f2 = fOooOOoo3;
                    o00ooo3 = o00ooo3;
                    jsonReader.Oooo0OO();
                    jsonReader.Oooo0o();
                    fOooOOoo = f5;
                    fOooOOoo2 = f;
                    fOooOOoo3 = f2;
                    o00ooo3 = o00ooo3;
                    fOooO0OO = fOooO0OO;
                    arrayList2 = arrayList2;
                    map3 = map3;
                    o0ooooo2 = o0ooooo2;
                    iOooOo0O = iOooOo0O;
                    break;
            }
        }
        float f7 = fOooO0OO;
        oooOO0O.f10049OooOO0 = new Rect(0, 0, (int) (iOooOo0O2 * f7), (int) (iOooOo0O * f7));
        oooOO0O.f10050OooOO0O = fOooOOoo2;
        oooOO0O.f10051OooOO0o = fOooOOoo3;
        oooOO0O.f10053OooOOO0 = fOooOOoo;
        oooOO0O.f10040OooO = arrayList;
        oooOO0O.f10048OooO0oo = o00ooo3;
        oooOO0O.f10043OooO0OO = map;
        oooOO0O.f10044OooO0Oo = map2;
        oooOO0O.f10047OooO0oO = o0ooooo2;
        oooOO0O.f10046OooO0o0 = map3;
        oooOO0O.f10045OooO0o = arrayList2;
        return oooOO0O;
    }
}
