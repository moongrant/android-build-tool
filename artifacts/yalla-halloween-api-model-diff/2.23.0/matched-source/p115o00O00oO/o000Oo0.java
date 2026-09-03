package p115o00O00oO;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.facebook.appevents.UserDataStore;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.CharCompanionObject;
import o00O00OO.OooO0O0;
import o00O00OO.OooO0o;
import o00O00OO.OooOOO0;
import o00O00OO.OooOOOO;
import o00O00OO.OooOo;
import o00O00OO.OooOo00;
import p113o00O00Oo.o000oOoO;
import p113o00O00Oo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36489OooO00o = JsonReader.OooO00o.OooO00o("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", UserDataStore.STATE, "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36490OooO0O0 = JsonReader.OooO00o.OooO00o("d", "a");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36491OooO0OO = JsonReader.OooO00o.OooO00o("ty", "nm");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36492OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f36492OooO00o = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36492OooO00o[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:247:0x0409  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static Layer OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, OooOO0 oooOO1) throws IOException {
        String str;
        byte b;
        byte b2;
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O1;
        OooO0O0 oooO0O2;
        OooO0O0 oooO0O3;
        byte b3;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        oooO00o.OooO0OO();
        char c = CharCompanionObject.MIN_VALUE;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean z = false;
        Layer.MatteType matteType2 = matteType;
        float fOooOo = 1.0f;
        long jOooOooO = 0;
        int iOooO0OO = 0;
        int iOooO0OO2 = 0;
        int color = 0;
        int iOooO0OO3 = 0;
        int iOooO0OO4 = 0;
        boolean zOooOo0 = false;
        float fOooOo2 = 0.0f;
        float fOooOo3 = 0.0f;
        long jOooOooO2 = -1;
        String strOooo00o = null;
        Layer.LayerType layerType = null;
        String strOooo00o2 = null;
        OooOo oooOoOooO00o = null;
        OooOOOO oooOOOO = null;
        OooOo00 oooOo00 = null;
        OooO0O0 OooO0O1 = null;
        o000oOoO o000oooo2 = null;
        o0000Ooo o0000ooo = null;
        String strOooo00o3 = "UNSET";
        float fOooOo4 = 0.0f;
        while (oooO00o.OooOo00()) {
            char c2 = 2;
            switch (oooO00o.Oooo0OO(f36489OooO00o)) {
                case 0:
                    strOooo00o3 = oooO00o.Oooo00o();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 1:
                    jOooOooO = oooO00o.OooOooO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 2:
                    strOooo00o2 = oooO00o.Oooo00o();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 3:
                    int iOooOooO = oooO00o.OooOooO();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iOooOooO < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iOooOooO];
                    } else {
                        continue;
                    }
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 4:
                    jOooOooO2 = oooO00o.OooOooO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 5:
                    iOooO0OO = (int) (o00O0.OooOOOO.OooO0OO() * oooO00o.OooOooO());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 6:
                    iOooO0OO2 = (int) (o00O0.OooOOOO.OooO0OO() * oooO00o.OooOooO());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 7:
                    color = Color.parseColor(oooO00o.Oooo00o());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 8:
                    oooOoOooO00o = o000OOo.OooO00o(oooO00o, oooOO1);
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 9:
                    int iOooOooO2 = oooO00o.OooOooO();
                    if (iOooOooO2 >= Layer.MatteType.values().length) {
                        oooOO1.OooO00o("Unsupported matte type: " + iOooOooO2);
                        continue;
                    } else {
                        matteType2 = Layer.MatteType.values()[iOooOooO2];
                        int i = OooO00o.f36492OooO00o[matteType2.ordinal()];
                        if (i == 1) {
                            oooOO1.OooO00o("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            oooOO1.OooO00o("Unsupported matte type: Luma Inverted");
                        }
                        oooOO1.f8736OooOOOO++;
                    }
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 10:
                    Mask.MaskMode maskMode = null;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo00()) {
                        oooO00o.OooO0OO();
                        Mask.MaskMode maskMode2 = maskMode;
                        Mask.MaskMode maskMode3 = maskMode2;
                        OooO0o oooO0oOooO0OO = maskMode3;
                        boolean zOooOo1 = false;
                        OooOOO0 oooOOO0 = maskMode3;
                        while (oooO00o.OooOo00()) {
                            String strOooooOo = oooO00o.OooooOo();
                            strOooooOo.getClass();
                            int iHashCode = strOooooOo.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strOooooOo.equals("mode")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strOooooOo.equals("inv")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strOooooOo.equals("pt")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strOooooOo.equals("o")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                oooO0oOooO0OO = o000000.OooO0OO(oooO00o, oooOO1);
                            } else if (b == 1) {
                                oooOOO0 = new OooOOO0(o000O0o.OooO00o(oooO00o, oooOO1, o00O0.OooOOOO.OooO0OO(), o000OOo0.f36487OooO00o, false));
                            } else if (b == 2) {
                                zOooOo1 = oooO00o.OooOo0();
                            } else if (b != 3) {
                                oooO00o.Oooo0o();
                            } else {
                                String strOooo00o4 = oooO00o.Oooo00o();
                                strOooo00o4.getClass();
                                int iHashCode2 = strOooo00o4.hashCode();
                                if (iHashCode2 != 97) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 110) {
                                            if (iHashCode2 == 115 && strOooo00o4.equals("s")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strOooo00o4.equals("n")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strOooo00o4.equals("i")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strOooo00o4.equals("a")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 == 0) {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                } else if (b2 == 1) {
                                    oooOO1.OooO00o("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode2 = Mask.MaskMode.MASK_MODE_INTERSECT;
                                } else if (b2 == 2) {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_NONE;
                                } else if (b2 != 3) {
                                    o00O0.OooOO0.OooO0O0("Unknown mask mode " + strOooooOo + ". Defaulting to Add.");
                                    maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                } else {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                }
                            }
                            oooOOO0 = oooOOO0;
                            oooO0oOooO0OO = oooO0oOooO0OO;
                        }
                        oooO00o.OooOOo0();
                        arrayList.add(new Mask(maskMode2, oooOOO0, oooO0oOooO0OO, zOooOo1));
                        maskMode = null;
                    }
                    z = false;
                    oooOO1.f8736OooOOOO += arrayList.size();
                    oooO00o.OooO0oO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 11:
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo00()) {
                        o00O0O o00o0oOooO00o = o00000O.OooO00o(oooO00o, oooOO1);
                        if (o00o0oOooO00o != null) {
                            arrayList2.add(o00o0oOooO00o);
                        }
                    }
                    oooO00o.OooO0oO();
                    break;
                case 12:
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo00()) {
                        int iOooo0OO = oooO00o.Oooo0OO(f36490OooO0O0);
                        if (iOooo0OO == 0) {
                            oooOOOO = new OooOOOO(o000O0o.OooO00o(oooO00o, oooOO1, 1.0f, o00000OO.f36451OooO00o, false));
                        } else if (iOooo0OO != 1) {
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                        } else {
                            oooO00o.OooO00o();
                            if (oooO00o.OooOo00()) {
                                JsonReader.OooO00o oooO00o2 = o0O0O00.f36497OooO00o;
                                oooO00o.OooO0OO();
                                OooOo00 oooOo01 = null;
                                while (oooO00o.OooOo00()) {
                                    if (oooO00o.Oooo0OO(o0O0O00.f36497OooO00o) != 0) {
                                        oooO00o.Oooo0o0();
                                        oooO00o.Oooo0o();
                                    } else {
                                        oooO00o.OooO0OO();
                                        o00O00OO.OooO00o OooO00o2 = null;
                                        o00O00OO.OooO00o OooO00o3 = null;
                                        OooO0O0 OooO0O2 = null;
                                        OooO0O0 OooO0O3 = null;
                                        while (oooO00o.OooOo00()) {
                                            int iOooo0OO2 = oooO00o.Oooo0OO(o0O0O00.f36498OooO0O0);
                                            if (iOooo0OO2 == 0) {
                                                OooO00o2 = o000000.OooO00o(oooO00o, oooOO1);
                                            } else if (iOooo0OO2 == 1) {
                                                OooO00o3 = o000000.OooO00o(oooO00o, oooOO1);
                                            } else if (iOooo0OO2 == 2) {
                                                OooO0O2 = o000000.OooO0O0(oooO00o, oooOO1, true);
                                            } else if (iOooo0OO2 != 3) {
                                                oooO00o.Oooo0o0();
                                                oooO00o.Oooo0o();
                                            } else {
                                                OooO0O3 = o000000.OooO0O0(oooO00o, oooOO1, true);
                                            }
                                        }
                                        oooO00o.OooOOo0();
                                        oooOo01 = new OooOo00(OooO00o2, OooO00o3, OooO0O2, OooO0O3);
                                    }
                                }
                                oooO00o.OooOOo0();
                                if (oooOo01 == null) {
                                    oooOo01 = new OooOo00(null, null, null, null);
                                }
                                oooOo00 = oooOo01;
                            }
                            while (oooO00o.OooOo00()) {
                                oooO00o.Oooo0o();
                            }
                            oooO00o.OooO0oO();
                        }
                    }
                    oooO00o.OooOOo0();
                    break;
                case 13:
                    oooO00o.OooO00o();
                    ArrayList arrayList3 = new ArrayList();
                    while (oooO00o.OooOo00()) {
                        oooO00o.OooO0OO();
                        while (oooO00o.OooOo00()) {
                            int iOooo0OO3 = oooO00o.Oooo0OO(f36491OooO0OO);
                            if (iOooo0OO3 == 0) {
                                int iOooOooO3 = oooO00o.OooOooO();
                                if (iOooOooO3 == 29) {
                                    JsonReader.OooO00o oooO00o3 = o000000O.f36447OooO00o;
                                    o000oooo2 = null;
                                    while (oooO00o.OooOo00()) {
                                        if (oooO00o.Oooo0OO(o000000O.f36447OooO00o) != 0) {
                                            oooO00o.Oooo0o0();
                                            oooO00o.Oooo0o();
                                        } else {
                                            oooO00o.OooO00o();
                                            while (oooO00o.OooOo00()) {
                                                oooO00o.OooO0OO();
                                                o000oOoO o000oooo3 = null;
                                                while (true) {
                                                    boolean z2 = z;
                                                    while (true) {
                                                        if (oooO00o.OooOo00()) {
                                                            int iOooo0OO4 = oooO00o.Oooo0OO(o000000O.f36448OooO0O0);
                                                            if (iOooo0OO4 != 0) {
                                                                if (iOooo0OO4 != 1) {
                                                                    oooO00o.Oooo0o0();
                                                                    oooO00o.Oooo0o();
                                                                } else if (z2) {
                                                                    o000oooo3 = new o000oOoO(o000000.OooO0O0(oooO00o, oooOO1, true));
                                                                } else {
                                                                    oooO00o.Oooo0o();
                                                                }
                                                            } else if (oooO00o.OooOooO() == 0) {
                                                                z2 = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                        } else {
                                                            oooO00o.OooOOo0();
                                                            if (o000oooo3 != null) {
                                                                o000oooo2 = o000oooo3;
                                                            }
                                                            z = false;
                                                        }
                                                    }
                                                }
                                            }
                                            oooO00o.OooO0oO();
                                            z = false;
                                        }
                                    }
                                } else if (iOooOooO3 == 25) {
                                    o0000 o0000Var = new o0000();
                                    while (oooO00o.OooOo00()) {
                                        if (oooO00o.Oooo0OO(o0000.f36439OooO0o) != 0) {
                                            oooO00o.Oooo0o0();
                                            oooO00o.Oooo0o();
                                        } else {
                                            oooO00o.OooO00o();
                                            while (oooO00o.OooOo00()) {
                                                oooO00o.OooO0OO();
                                                String strOooo00o5 = "";
                                                while (oooO00o.OooOo00()) {
                                                    int iOooo0OO5 = oooO00o.Oooo0OO(o0000.f36440OooO0oO);
                                                    if (iOooo0OO5 == 0) {
                                                        strOooo00o5 = oooO00o.Oooo00o();
                                                    } else if (iOooo0OO5 != 1) {
                                                        oooO00o.Oooo0o0();
                                                        oooO00o.Oooo0o();
                                                    } else {
                                                        strOooo00o5.getClass();
                                                        switch (strOooo00o5) {
                                                            case "Distance":
                                                                b3 = 0;
                                                                break;
                                                            case "Opacity":
                                                                b3 = 1;
                                                                break;
                                                            case "Direction":
                                                                b3 = c2;
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
                                                            o0000Var.f36444OooO0Oo = o000000.OooO0O0(oooO00o, oooOO1, true);
                                                        } else if (b3 == 1) {
                                                            o0000Var.f36442OooO0O0 = o000000.OooO0O0(oooO00o, oooOO1, false);
                                                        } else if (b3 == c2) {
                                                            o0000Var.f36443OooO0OO = o000000.OooO0O0(oooO00o, oooOO1, false);
                                                        } else if (b3 == 3) {
                                                            o0000Var.f36441OooO00o = o000000.OooO00o(oooO00o, oooOO1);
                                                        } else if (b3 != 4) {
                                                            oooO00o.Oooo0o();
                                                        } else {
                                                            o0000Var.f36445OooO0o0 = o000000.OooO0O0(oooO00o, oooOO1, true);
                                                        }
                                                    }
                                                    c2 = 2;
                                                }
                                                oooO00o.OooOOo0();
                                                c2 = 2;
                                            }
                                            oooO00o.OooO0oO();
                                            c2 = 2;
                                        }
                                    }
                                    o00O00OO.OooO00o oooO00o4 = o0000Var.f36441OooO00o;
                                    o0000ooo = (oooO00o4 == null || (oooO0O0 = o0000Var.f36442OooO0O0) == null || (oooO0O1 = o0000Var.f36443OooO0OO) == null || (oooO0O2 = o0000Var.f36444OooO0Oo) == null || (oooO0O3 = o0000Var.f36445OooO0o0) == null) ? null : new o0000Ooo(oooO00o4, oooO0O0, oooO0O1, oooO0O2, oooO0O3);
                                }
                            } else if (iOooo0OO3 != 1) {
                                oooO00o.Oooo0o0();
                                oooO00o.Oooo0o();
                            } else {
                                arrayList3.add(oooO00o.Oooo00o());
                            }
                            c2 = 2;
                            z = false;
                        }
                        oooO00o.OooOOo0();
                        c2 = 2;
                        z = false;
                    }
                    oooO00o.OooO0oO();
                    oooOO1.OooO00o("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    fOooOo = (float) oooO00o.OooOo();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 15:
                    fOooOo2 = (float) oooO00o.OooOo();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 16:
                    iOooO0OO3 = (int) (o00O0.OooOOOO.OooO0OO() * oooO00o.OooOooO());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 17:
                    iOooO0OO4 = (int) (o00O0.OooOOOO.OooO0OO() * oooO00o.OooOooO());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 18:
                    fOooOo4 = (float) oooO00o.OooOo();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 19:
                    fOooOo3 = (float) oooO00o.OooOo();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 20:
                    OooO0O1 = o000000.OooO0O0(oooO00o, oooOO1, z);
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 21:
                    strOooo00o = oooO00o.Oooo00o();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 22:
                    zOooOo0 = oooO00o.OooOo0();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                default:
                    oooO00o.Oooo0o0();
                    oooO00o.Oooo0o();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
            }
            z = false;
            c = CharCompanionObject.MIN_VALUE;
        }
        oooO00o.OooOOo0();
        ArrayList arrayList4 = new ArrayList();
        if (fOooOo4 > 0.0f) {
            arrayList4.add(new o00O0O00.OooO00o(oooOO1, fValueOf2, fValueOf2, (Interpolator) null, 0.0f, Float.valueOf(fOooOo4)));
        }
        if (fOooOo3 <= 0.0f) {
            fOooOo3 = oooOO1.f8733OooOO0o;
        }
        arrayList4.add(new o00O0O00.OooO00o(oooOO1, fValueOf, fValueOf, (Interpolator) null, fOooOo4, Float.valueOf(fOooOo3)));
        arrayList4.add(new o00O0O00.OooO00o(oooOO1, fValueOf2, fValueOf2, (Interpolator) null, fOooOo3, Float.valueOf(Float.MAX_VALUE)));
        if (strOooo00o3.endsWith(".ai") || "ai".equals(str)) {
            str = strOooo00o;
            oooOO1.OooO00o("Convert your Illustrator layers to shape layers.");
        }
        str = strOooo00o;
        return new Layer(arrayList2, oooOO1, strOooo00o3, jOooOooO, layerType, jOooOooO2, strOooo00o2, arrayList, oooOoOooO00o, iOooO0OO, iOooO0OO2, color, fOooOo, fOooOo2, iOooO0OO3, iOooO0OO4, oooOOOO, oooOo00, arrayList4, matteType2, OooO0O1, zOooOo0, o000oooo2, o0000ooo);
    }
}
