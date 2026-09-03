package p127o00O0oO;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p123o00O0o0.OooOO0;
import p123o00O0o0.OooOOO;
import p123o00O0o0.Oooo000;
import p123o00O0o0.o000oOoO;
import p123o00O0o0.o00O0O;
import p123o00O0o0.o0OoOo0;
import p125o00O0o0O.o000OOo;
import p125o00O0o0O.oo0o0Oo;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31065OooO00o = JsonReader.OooO00o.OooO00o("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", ak.aH, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f31066OooO0O0 = JsonReader.OooO00o.OooO00o("d", ak.av);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f31067OooO0OO = JsonReader.OooO00o.OooO00o("ty", "nm");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f31068OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f31068OooO00o = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31068OooO00o[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:247:0x0404  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static Layer OooO00o(JsonReader jsonReader, OooOO0O oooOO0O) throws IOException {
        String str;
        byte b;
        byte b2;
        p123o00O0o0.OooOO0O oooOO0O2;
        p123o00O0o0.OooOO0O oooOO0O3;
        p123o00O0o0.OooOO0O oooOO0O4;
        p123o00O0o0.OooOO0O oooOO0O5;
        byte b3;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.OooO0O0();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        boolean z = false;
        Layer.MatteType matteType2 = matteType;
        long jOooOo0O = -1;
        String strOooOoOO = null;
        float fOooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Layer.LayerType layerType = null;
        String strOooOoOO2 = null;
        o00O0O o00o0oOooO00o = null;
        int iOooO0OO = 0;
        int iOooO0OO2 = 0;
        int color = 0;
        float fOooOOoo2 = 1.0f;
        float fOooOOoo3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int iOooO0OO3 = 0;
        int iOooO0OO4 = 0;
        o000oOoO o000oooo2 = null;
        o0OoOo0 o0oooo1 = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO = null;
        boolean zOooOOo = false;
        oo0o0Oo oo0o0oo = null;
        o00000O0 o00000o1 = null;
        float fOooOOoo4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        long jOooOo0O2 = 0;
        String strOooOoOO3 = "UNSET";
        while (jsonReader.OooOOO()) {
            boolean z2 = true;
            switch (jsonReader.Oooo0(f31065OooO00o)) {
                case 0:
                    str = strOooOoOO;
                    strOooOoOO3 = jsonReader.OooOoOO();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 1:
                    str = strOooOoOO;
                    jOooOo0O2 = jsonReader.OooOo0O();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 2:
                    str = strOooOoOO;
                    strOooOoOO2 = jsonReader.OooOoOO();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 3:
                    str = strOooOoOO;
                    int iOooOo0O = jsonReader.OooOo0O();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iOooOo0O < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iOooOo0O];
                    } else {
                        continue;
                    }
                    strOooOoOO = str;
                    z = false;
                    break;
                case 4:
                    str = strOooOoOO;
                    jOooOo0O = jsonReader.OooOo0O();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 5:
                    str = strOooOoOO;
                    iOooO0OO = (int) (o000O0Oo.OooO0OO() * jsonReader.OooOo0O());
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 6:
                    str = strOooOoOO;
                    iOooO0OO2 = (int) (o000O0Oo.OooO0OO() * jsonReader.OooOo0O());
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 7:
                    str = strOooOoOO;
                    color = Color.parseColor(jsonReader.OooOoOO());
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 8:
                    str = strOooOoOO;
                    o00o0oOooO00o = o0OO00O.OooO00o(jsonReader, oooOO0O);
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 9:
                    str = strOooOoOO;
                    int iOooOo0O2 = jsonReader.OooOo0O();
                    if (iOooOo0O2 >= Layer.MatteType.values().length) {
                        oooOO0O.OooO00o("Unsupported matte type: " + iOooOo0O2);
                        continue;
                    } else {
                        matteType2 = Layer.MatteType.values()[iOooOo0O2];
                        int i = OooO00o.f31068OooO00o[matteType2.ordinal()];
                        if (i == 1) {
                            oooOO0O.OooO00o("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            oooOO0O.OooO00o("Unsupported matte type: Luma Inverted");
                        }
                        oooOO0O.f10054OooOOOO++;
                    }
                    strOooOoOO = str;
                    z = false;
                    break;
                case 10:
                    Mask.MaskMode maskMode = null;
                    jsonReader.OooO00o();
                    while (jsonReader.OooOOO()) {
                        jsonReader.OooO0O0();
                        Mask.MaskMode maskMode2 = maskMode;
                        Mask.MaskMode maskMode3 = maskMode2;
                        OooOOO oooOOOOooO0Oo = maskMode3;
                        boolean zOooOOo2 = false;
                        Oooo000 oooo000 = maskMode3;
                        while (jsonReader.OooOOO()) {
                            String strOooOoO = jsonReader.OooOoO();
                            Objects.requireNonNull(strOooOoO);
                            int iHashCode = strOooOoO.hashCode();
                            String str2 = strOooOoOO;
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strOooOoO.equals("mode")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strOooOoO.equals("inv")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strOooOoO.equals("pt")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strOooOoO.equals("o")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                oooOOOOooO0Oo = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                            } else if (b == 1) {
                                oooo000 = new Oooo000(o0000OO0.OooO00o(jsonReader, oooOO0O, o000O0Oo.OooO0OO(), o000O0O0.f31109OooO00o, false));
                            } else if (b == 2) {
                                zOooOOo2 = jsonReader.OooOOo();
                            } else if (b != 3) {
                                jsonReader.Oooo0o();
                            } else {
                                String strOooOoOO4 = jsonReader.OooOoOO();
                                Objects.requireNonNull(strOooOoOO4);
                                int iHashCode2 = strOooOoOO4.hashCode();
                                if (iHashCode2 != 97) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 110) {
                                            if (iHashCode2 == 115 && strOooOoOO4.equals(ak.aB)) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strOooOoOO4.equals("n")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strOooOoOO4.equals(ak.aC)) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strOooOoOO4.equals(ak.av)) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 == 0) {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                } else if (b2 == 1) {
                                    oooOO0O.OooO00o("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode2 = Mask.MaskMode.MASK_MODE_INTERSECT;
                                } else if (b2 == 2) {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_NONE;
                                } else if (b2 != 3) {
                                    o000Oo0.OooO0OO("Unknown mask mode " + strOooOoO + ". Defaulting to Add.");
                                    maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                } else {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                }
                            }
                            strOooOoOO = str2;
                            oooo000 = oooo000;
                            oooOOOOooO0Oo = oooOOOOooO0Oo;
                        }
                        jsonReader.OooO0o();
                        arrayList.add(new Mask(maskMode2, oooo000, oooOOOOooO0Oo, zOooOOo2));
                        strOooOoOO = strOooOoOO;
                        maskMode = null;
                    }
                    str = strOooOoOO;
                    oooOO0O.f10054OooOOOO += arrayList.size();
                    jsonReader.OooO0Oo();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
                case 11:
                    jsonReader.OooO00o();
                    while (jsonReader.OooOOO()) {
                        o000OOo o000oooOooO00o = o000000O.OooO00o(jsonReader, oooOO0O);
                        if (o000oooOooO00o != null) {
                            arrayList2.add(o000oooOooO00o);
                        }
                    }
                    jsonReader.OooO0Oo();
                    break;
                case 12:
                    jsonReader.OooO0O0();
                    while (jsonReader.OooOOO()) {
                        int iOooo0 = jsonReader.Oooo0(f31066OooO0O0);
                        if (iOooo0 == 0) {
                            o000oooo2 = new o000oOoO(oo0o0Oo.OooO00o(jsonReader, oooOO0O, o00000.f31070OooO00o));
                        } else if (iOooo0 != 1) {
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                        } else {
                            jsonReader.OooO00o();
                            if (jsonReader.OooOOO()) {
                                JsonReader.OooO00o oooO00o = o0Oo0oo.f31126OooO00o;
                                jsonReader.OooO0O0();
                                o0OoOo0 o0oooo2 = null;
                                while (jsonReader.OooOOO()) {
                                    if (jsonReader.Oooo0(o0Oo0oo.f31126OooO00o) != 0) {
                                        jsonReader.Oooo0OO();
                                        jsonReader.Oooo0o();
                                    } else {
                                        jsonReader.OooO0O0();
                                        OooOO0 oooOO0OooO0O0 = null;
                                        OooOO0 oooOO0OooO0O1 = null;
                                        p123o00O0o0.OooOO0O oooOO0OOooO0OO2 = null;
                                        p123o00O0o0.OooOO0O oooOO0OOooO0OO3 = null;
                                        while (jsonReader.OooOOO()) {
                                            int iOooo1 = jsonReader.Oooo0(o0Oo0oo.f31127OooO0O0);
                                            if (iOooo1 == 0) {
                                                oooOO0OooO0O0 = oo0o0Oo.OooO0O0(jsonReader, oooOO0O);
                                            } else if (iOooo1 == 1) {
                                                oooOO0OooO0O1 = oo0o0Oo.OooO0O0(jsonReader, oooOO0O);
                                            } else if (iOooo1 == 2) {
                                                oooOO0OOooO0OO2 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                            } else if (iOooo1 != 3) {
                                                jsonReader.Oooo0OO();
                                                jsonReader.Oooo0o();
                                            } else {
                                                oooOO0OOooO0OO3 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                            }
                                        }
                                        jsonReader.OooO0o();
                                        o0oooo2 = new o0OoOo0(oooOO0OooO0O0, oooOO0OooO0O1, oooOO0OOooO0OO2, oooOO0OOooO0OO3);
                                    }
                                }
                                jsonReader.OooO0o();
                                if (o0oooo2 == null) {
                                    o0oooo2 = new o0OoOo0(null, null, null, null);
                                }
                                o0oooo1 = o0oooo2;
                            }
                            while (jsonReader.OooOOO()) {
                                jsonReader.Oooo0o();
                            }
                            jsonReader.OooO0Oo();
                        }
                    }
                    jsonReader.OooO0o();
                    break;
                case 13:
                    jsonReader.OooO00o();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.OooOOO()) {
                        jsonReader.OooO0O0();
                        while (jsonReader.OooOOO()) {
                            int iOooo2 = jsonReader.Oooo0(f31067OooO0OO);
                            if (iOooo2 == 0) {
                                int iOooOo0O3 = jsonReader.OooOo0O();
                                if (iOooOo0O3 == 29) {
                                    JsonReader.OooO00o oooO00o2 = o0O0O00.f31121OooO00o;
                                    oo0o0oo = null;
                                    while (jsonReader.OooOOO()) {
                                        if (jsonReader.Oooo0(o0O0O00.f31121OooO00o) != 0) {
                                            jsonReader.Oooo0OO();
                                            jsonReader.Oooo0o();
                                        } else {
                                            jsonReader.OooO00o();
                                            while (jsonReader.OooOOO()) {
                                                jsonReader.OooO0O0();
                                                oo0o0Oo oo0o0oo2 = null;
                                                while (true) {
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (jsonReader.OooOOO()) {
                                                            int iOooo3 = jsonReader.Oooo0(o0O0O00.f31122OooO0O0);
                                                            if (iOooo3 != 0) {
                                                                if (iOooo3 != z2) {
                                                                    jsonReader.Oooo0OO();
                                                                    jsonReader.Oooo0o();
                                                                } else if (z3) {
                                                                    oo0o0oo2 = new oo0o0Oo(oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z2));
                                                                } else {
                                                                    jsonReader.Oooo0o();
                                                                }
                                                            } else if (jsonReader.OooOo0O() == 0) {
                                                                z3 = true;
                                                            }
                                                        } else {
                                                            jsonReader.OooO0o();
                                                            if (oo0o0oo2 != null) {
                                                                oo0o0oo = oo0o0oo2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            jsonReader.OooO0Oo();
                                        }
                                    }
                                } else if (iOooOo0O3 == 25) {
                                    o00000O o00000o = new o00000O();
                                    while (jsonReader.OooOOO()) {
                                        if (jsonReader.Oooo0(o00000O.f31074OooO0o) != 0) {
                                            jsonReader.Oooo0OO();
                                            jsonReader.Oooo0o();
                                        } else {
                                            jsonReader.OooO00o();
                                            while (jsonReader.OooOOO()) {
                                                jsonReader.OooO0O0();
                                                String strOooOoOO5 = "";
                                                while (jsonReader.OooOOO()) {
                                                    int iOooo4 = jsonReader.Oooo0(o00000O.f31075OooO0oO);
                                                    if (iOooo4 == 0) {
                                                        strOooOoOO5 = jsonReader.OooOoOO();
                                                    } else if (iOooo4 != z2) {
                                                        jsonReader.Oooo0OO();
                                                        jsonReader.Oooo0o();
                                                    } else {
                                                        Objects.requireNonNull(strOooOoOO5);
                                                        switch (strOooOoOO5) {
                                                            case "Distance":
                                                                b3 = 0;
                                                                break;
                                                            case "Opacity":
                                                                b3 = 1;
                                                                break;
                                                            case "Direction":
                                                                b3 = 2;
                                                                break;
                                                            case "Shadow Color":
                                                                b3 = 3;
                                                                break;
                                                            case "Softness":
                                                                b3 = 4;
                                                                break;
                                                            default:
                                                                b3 = -1;
                                                                break;
                                                        }
                                                        if (b3 == 0) {
                                                            o00000o.f31079OooO0Oo = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                                        } else if (b3 == z2) {
                                                            o00000o.f31077OooO0O0 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                                                        } else if (b3 == 2) {
                                                            o00000o.f31078OooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                                                        } else if (b3 == 3) {
                                                            o00000o.f31076OooO00o = oo0o0Oo.OooO0O0(jsonReader, oooOO0O);
                                                        } else if (b3 != 4) {
                                                            jsonReader.Oooo0o();
                                                        } else {
                                                            o00000o.f31080OooO0o0 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                                        }
                                                    }
                                                    z2 = true;
                                                }
                                                jsonReader.OooO0o();
                                                z2 = true;
                                            }
                                            jsonReader.OooO0Oo();
                                            z2 = true;
                                        }
                                    }
                                    OooOO0 oooOO1 = o00000o.f31076OooO00o;
                                    o00000o1 = (oooOO1 == null || (oooOO0O2 = o00000o.f31077OooO0O0) == null || (oooOO0O3 = o00000o.f31078OooO0OO) == null || (oooOO0O4 = o00000o.f31079OooO0Oo) == null || (oooOO0O5 = o00000o.f31080OooO0o0) == null) ? null : new o00000O0(oooOO1, oooOO0O2, oooOO0O3, oooOO0O4, oooOO0O5);
                                }
                            } else if (iOooo2 != z2) {
                                jsonReader.Oooo0OO();
                                jsonReader.Oooo0o();
                            } else {
                                arrayList3.add(jsonReader.OooOoOO());
                            }
                            z2 = true;
                        }
                        jsonReader.OooO0o();
                        z2 = true;
                    }
                    jsonReader.OooO0Oo();
                    oooOO0O.OooO00o("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    fOooOOoo2 = (float) jsonReader.OooOOoo();
                    break;
                case 15:
                    fOooOOoo3 = (float) jsonReader.OooOOoo();
                    break;
                case 16:
                    iOooO0OO3 = (int) (o000O0Oo.OooO0OO() * jsonReader.OooOo0O());
                    break;
                case 17:
                    iOooO0OO4 = (int) (o000O0Oo.OooO0OO() * jsonReader.OooOo0O());
                    break;
                case 18:
                    fOooOOoo = (float) jsonReader.OooOOoo();
                    break;
                case 19:
                    fOooOOoo4 = (float) jsonReader.OooOOoo();
                    break;
                case 20:
                    oooOO0OOooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z);
                    break;
                case 21:
                    strOooOoOO = jsonReader.OooOoOO();
                    break;
                case 22:
                    zOooOOo = jsonReader.OooOOo();
                    break;
                default:
                    str = strOooOoOO;
                    jsonReader.Oooo0OO();
                    jsonReader.Oooo0o();
                    continue;
                    strOooOoOO = str;
                    z = false;
                    break;
            }
            str = strOooOoOO;
            strOooOoOO = str;
            z = false;
        }
        String str3 = strOooOoOO;
        jsonReader.OooO0o();
        ArrayList arrayList4 = new ArrayList();
        if (fOooOOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            arrayList4.add(new p131o00O0oo0.o000OOo(oooOO0O, fValueOf2, fValueOf2, (Interpolator) null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(fOooOOoo)));
        }
        if (fOooOOoo4 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fOooOOoo4 = oooOO0O.f10051OooOO0o;
        }
        arrayList4.add(new p131o00O0oo0.o000OOo(oooOO0O, fValueOf, fValueOf, (Interpolator) null, fOooOOoo, Float.valueOf(fOooOOoo4)));
        arrayList4.add(new p131o00O0oo0.o000OOo(oooOO0O, fValueOf2, fValueOf2, (Interpolator) null, fOooOOoo4, Float.valueOf(Float.MAX_VALUE)));
        if (strOooOoOO3.endsWith(".ai") || "ai".equals(str3)) {
            oooOO0O.OooO00o("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, oooOO0O, strOooOoOO3, jOooOo0O2, layerType, jOooOo0O, strOooOoOO2, arrayList, o00o0oOooO00o, iOooO0OO, iOooO0OO2, color, fOooOOoo2, fOooOOoo3, iOooO0OO3, iOooO0OO4, o000oooo2, o0oooo1, arrayList4, matteType2, oooOO0OOooO0OO, zOooOOo, oo0o0oo, o00000o1);
    }
}
