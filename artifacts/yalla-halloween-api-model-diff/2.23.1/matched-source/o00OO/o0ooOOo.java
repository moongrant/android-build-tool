package o00OO;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.facebook.appevents.UserDataStore;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36908OooO00o = JsonReader.OooO00o.OooO00o("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", UserDataStore.STATE, "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36909OooO0O0 = JsonReader.OooO00o.OooO00o("d", "a");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36910OooO0OO = JsonReader.OooO00o.OooO00o("ty", "nm");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36911OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f36911OooO00o = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36911OooO00o[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
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
    public static Layer OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        String str;
        byte b;
        byte b2;
        p134o00OO0o.oo000o oo000oVar;
        p134o00OO0o.oo000o oo000oVar2;
        p134o00OO0o.oo000o oo000oVar3;
        p134o00OO0o.oo000o oo000oVar4;
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
        float fOooOoO = 1.0f;
        long jOooo00O = 0;
        int iOooO0OO = 0;
        int iOooO0OO2 = 0;
        int color = 0;
        int iOooO0OO3 = 0;
        int iOooO0OO4 = 0;
        boolean zOooOo0o = false;
        float fOooOoO2 = 0.0f;
        float fOooOoO3 = 0.0f;
        long jOooo00O2 = -1;
        String strOooo0O0 = null;
        Layer.LayerType layerType = null;
        String strOooo0O1 = null;
        p134o00OO0o.o000000O o000000oOooO00o = null;
        p134o00OO0o.o000OOo o000ooo2 = null;
        p134o00OO0o.o000000 o000000Var = null;
        p134o00OO0o.oo000o oo000oVarOooO0O0 = null;
        p136o00OO0oO.OooO0OO oooO0OO = null;
        OooOOOO oooOOOO = null;
        String strOooo0O2 = "UNSET";
        float fOooOoO4 = 0.0f;
        while (oooO00o.OooOo0O()) {
            char c2 = 2;
            switch (oooO00o.Oooo0oO(f36908OooO00o)) {
                case 0:
                    strOooo0O2 = oooO00o.Oooo0O0();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 1:
                    jOooo00O = oooO00o.Oooo00O();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 2:
                    strOooo0O1 = oooO00o.Oooo0O0();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 3:
                    int iOooo00O = oooO00o.Oooo00O();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iOooo00O < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iOooo00O];
                    } else {
                        continue;
                    }
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 4:
                    jOooo00O2 = oooO00o.Oooo00O();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 5:
                    iOooO0OO = (int) (o00OOO0.OooOOOO.OooO0OO() * oooO00o.Oooo00O());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 6:
                    iOooO0OO2 = (int) (o00OOO0.OooOOOO.OooO0OO() * oooO00o.Oooo00O());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 7:
                    color = Color.parseColor(oooO00o.Oooo0O0());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 8:
                    o000000oOooO00o = OooO0OO.OooO00o(oooO00o, oooOO1);
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 9:
                    int iOooo00O2 = oooO00o.Oooo00O();
                    if (iOooo00O2 >= Layer.MatteType.values().length) {
                        oooOO1.OooO00o("Unsupported matte type: " + iOooo00O2);
                        continue;
                    } else {
                        matteType2 = Layer.MatteType.values()[iOooo00O2];
                        int i = OooO00o.f36911OooO00o[matteType2.ordinal()];
                        if (i == 1) {
                            oooOO1.OooO00o("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            oooOO1.OooO00o("Unsupported matte type: Luma Inverted");
                        }
                        oooOO1.f11837OooOOOO++;
                    }
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 10:
                    Mask.MaskMode maskMode = null;
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0O()) {
                        oooO00o.OooO0OO();
                        Mask.MaskMode maskMode2 = maskMode;
                        Mask.MaskMode maskMode3 = maskMode2;
                        p134o00OO0o.o0ooOOo o0oooooOooO0OO = maskMode3;
                        boolean zOooOo0o2 = false;
                        p134o00OO0o.oo0o0Oo oo0o0oo = maskMode3;
                        while (oooO00o.OooOo0O()) {
                            String strOooooo = oooO00o.Oooooo();
                            strOooooo.getClass();
                            int iHashCode = strOooooo.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strOooooo.equals("mode")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strOooooo.equals("inv")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strOooooo.equals("pt")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strOooooo.equals("o")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                o0oooooOooO0OO = OooO0o.OooO0OO(oooO00o, oooOO1);
                            } else if (b == 1) {
                                oo0o0oo = new p134o00OO0o.oo0o0Oo(o00oO0o.OooO00o(oooO00o, oooOO1, o00OOO0.OooOOOO.OooO0OO(), o00000.f36881OooO00o, false));
                            } else if (b == 2) {
                                zOooOo0o2 = oooO00o.OooOo0o();
                            } else if (b != 3) {
                                oooO00o.Oooo();
                            } else {
                                String strOooo0O3 = oooO00o.Oooo0O0();
                                strOooo0O3.getClass();
                                int iHashCode2 = strOooo0O3.hashCode();
                                if (iHashCode2 != 97) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 110) {
                                            if (iHashCode2 == 115 && strOooo0O3.equals("s")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strOooo0O3.equals("n")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strOooo0O3.equals("i")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strOooo0O3.equals("a")) {
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
                                    o00OOO0.OooOO0.OooO0O0("Unknown mask mode " + strOooooo + ". Defaulting to Add.");
                                    maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                } else {
                                    maskMode2 = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                }
                            }
                            oo0o0oo = oo0o0oo;
                            o0oooooOooO0OO = o0oooooOooO0OO;
                        }
                        oooO00o.OooOOoo();
                        arrayList.add(new Mask(maskMode2, oo0o0oo, o0oooooOooO0OO, zOooOo0o2));
                        maskMode = null;
                    }
                    z = false;
                    oooOO1.f11837OooOOOO += arrayList.size();
                    oooO00o.OooO0oO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 11:
                    oooO00o.OooO00o();
                    while (oooO00o.OooOo0O()) {
                        p136o00OO0oO.OooO oooOOooO00o = OooOOO0.OooO00o(oooO00o, oooOO1);
                        if (oooOOooO00o != null) {
                            arrayList2.add(oooOOooO00o);
                        }
                    }
                    oooO00o.OooO0oO();
                    break;
                case 12:
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo0O()) {
                        int iOooo0oO = oooO00o.Oooo0oO(f36909OooO0O0);
                        if (iOooo0oO == 0) {
                            o000ooo2 = new p134o00OO0o.o000OOo(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, OooOOO.f36861OooO00o, false));
                        } else if (iOooo0oO != 1) {
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                        } else {
                            oooO00o.OooO00o();
                            if (oooO00o.OooOo0O()) {
                                JsonReader.OooO00o oooO00o2 = OooO0O0.f36855OooO00o;
                                oooO00o.OooO0OO();
                                p134o00OO0o.o000000 o000000Var2 = null;
                                while (oooO00o.OooOo0O()) {
                                    if (oooO00o.Oooo0oO(OooO0O0.f36855OooO00o) != 0) {
                                        oooO00o.Oooo0oo();
                                        oooO00o.Oooo();
                                    } else {
                                        oooO00o.OooO0OO();
                                        p134o00OO0o.o00Ooo o00oooOooO00o = null;
                                        p134o00OO0o.o00Ooo o00oooOooO00o2 = null;
                                        p134o00OO0o.oo000o oo000oVarOooO0O1 = null;
                                        p134o00OO0o.oo000o oo000oVarOooO0O2 = null;
                                        while (oooO00o.OooOo0O()) {
                                            int iOooo0oO2 = oooO00o.Oooo0oO(OooO0O0.f36856OooO0O0);
                                            if (iOooo0oO2 == 0) {
                                                o00oooOooO00o = OooO0o.OooO00o(oooO00o, oooOO1);
                                            } else if (iOooo0oO2 == 1) {
                                                o00oooOooO00o2 = OooO0o.OooO00o(oooO00o, oooOO1);
                                            } else if (iOooo0oO2 == 2) {
                                                oo000oVarOooO0O1 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                            } else if (iOooo0oO2 != 3) {
                                                oooO00o.Oooo0oo();
                                                oooO00o.Oooo();
                                            } else {
                                                oo000oVarOooO0O2 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                            }
                                        }
                                        oooO00o.OooOOoo();
                                        o000000Var2 = new p134o00OO0o.o000000(o00oooOooO00o, o00oooOooO00o2, oo000oVarOooO0O1, oo000oVarOooO0O2);
                                    }
                                }
                                oooO00o.OooOOoo();
                                if (o000000Var2 == null) {
                                    o000000Var2 = new p134o00OO0o.o000000(null, null, null, null);
                                }
                                o000000Var = o000000Var2;
                            }
                            while (oooO00o.OooOo0O()) {
                                oooO00o.Oooo();
                            }
                            oooO00o.OooO0oO();
                        }
                    }
                    oooO00o.OooOOoo();
                    break;
                case 13:
                    oooO00o.OooO00o();
                    ArrayList arrayList3 = new ArrayList();
                    while (oooO00o.OooOo0O()) {
                        oooO00o.OooO0OO();
                        while (oooO00o.OooOo0O()) {
                            int iOooo0oO3 = oooO00o.Oooo0oO(f36910OooO0OO);
                            if (iOooo0oO3 == 0) {
                                int iOooo00O3 = oooO00o.Oooo00O();
                                if (iOooo00O3 == 29) {
                                    JsonReader.OooO00o oooO00o3 = OooO.f36852OooO00o;
                                    oooO0OO = null;
                                    while (oooO00o.OooOo0O()) {
                                        if (oooO00o.Oooo0oO(OooO.f36852OooO00o) != 0) {
                                            oooO00o.Oooo0oo();
                                            oooO00o.Oooo();
                                        } else {
                                            oooO00o.OooO00o();
                                            while (oooO00o.OooOo0O()) {
                                                oooO00o.OooO0OO();
                                                p136o00OO0oO.OooO0OO oooO0OO2 = null;
                                                while (true) {
                                                    boolean z2 = z;
                                                    while (true) {
                                                        if (oooO00o.OooOo0O()) {
                                                            int iOooo0oO4 = oooO00o.Oooo0oO(OooO.f36853OooO0O0);
                                                            if (iOooo0oO4 != 0) {
                                                                if (iOooo0oO4 != 1) {
                                                                    oooO00o.Oooo0oo();
                                                                    oooO00o.Oooo();
                                                                } else if (z2) {
                                                                    oooO0OO2 = new p136o00OO0oO.OooO0OO(OooO0o.OooO0O0(oooO00o, oooOO1, true));
                                                                } else {
                                                                    oooO00o.Oooo();
                                                                }
                                                            } else if (oooO00o.Oooo00O() == 0) {
                                                                z2 = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                        } else {
                                                            oooO00o.OooOOoo();
                                                            if (oooO0OO2 != null) {
                                                                oooO0OO = oooO0OO2;
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
                                } else if (iOooo00O3 == 25) {
                                    OooOo00 oooOo00 = new OooOo00();
                                    while (oooO00o.OooOo0O()) {
                                        if (oooO00o.Oooo0oO(OooOo00.f36870OooO0o) != 0) {
                                            oooO00o.Oooo0oo();
                                            oooO00o.Oooo();
                                        } else {
                                            oooO00o.OooO00o();
                                            while (oooO00o.OooOo0O()) {
                                                oooO00o.OooO0OO();
                                                String strOooo0O4 = "";
                                                while (oooO00o.OooOo0O()) {
                                                    int iOooo0oO5 = oooO00o.Oooo0oO(OooOo00.f36871OooO0oO);
                                                    if (iOooo0oO5 == 0) {
                                                        strOooo0O4 = oooO00o.Oooo0O0();
                                                    } else if (iOooo0oO5 != 1) {
                                                        oooO00o.Oooo0oo();
                                                        oooO00o.Oooo();
                                                    } else {
                                                        strOooo0O4.getClass();
                                                        switch (strOooo0O4) {
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
                                                            oooOo00.f36875OooO0Oo = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                                        } else if (b3 == 1) {
                                                            oooOo00.f36873OooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                                                        } else if (b3 == c2) {
                                                            oooOo00.f36874OooO0OO = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                                                        } else if (b3 == 3) {
                                                            oooOo00.f36872OooO00o = OooO0o.OooO00o(oooO00o, oooOO1);
                                                        } else if (b3 != 4) {
                                                            oooO00o.Oooo();
                                                        } else {
                                                            oooOo00.f36876OooO0o0 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                                        }
                                                    }
                                                    c2 = 2;
                                                }
                                                oooO00o.OooOOoo();
                                                c2 = 2;
                                            }
                                            oooO00o.OooO0oO();
                                            c2 = 2;
                                        }
                                    }
                                    p134o00OO0o.o00Ooo o00ooo2 = oooOo00.f36872OooO00o;
                                    oooOOOO = (o00ooo2 == null || (oo000oVar = oooOo00.f36873OooO0O0) == null || (oo000oVar2 = oooOo00.f36874OooO0OO) == null || (oo000oVar3 = oooOo00.f36875OooO0Oo) == null || (oo000oVar4 = oooOo00.f36876OooO0o0) == null) ? null : new OooOOOO(o00ooo2, oo000oVar, oo000oVar2, oo000oVar3, oo000oVar4);
                                }
                            } else if (iOooo0oO3 != 1) {
                                oooO00o.Oooo0oo();
                                oooO00o.Oooo();
                            } else {
                                arrayList3.add(oooO00o.Oooo0O0());
                            }
                            c2 = 2;
                            z = false;
                        }
                        oooO00o.OooOOoo();
                        c2 = 2;
                        z = false;
                    }
                    oooO00o.OooO0oO();
                    oooOO1.OooO00o("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    fOooOoO = (float) oooO00o.OooOoO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 15:
                    fOooOoO2 = (float) oooO00o.OooOoO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 16:
                    iOooO0OO3 = (int) (o00OOO0.OooOOOO.OooO0OO() * oooO00o.Oooo00O());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 17:
                    iOooO0OO4 = (int) (o00OOO0.OooOOOO.OooO0OO() * oooO00o.Oooo00O());
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 18:
                    fOooOoO4 = (float) oooO00o.OooOoO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 19:
                    fOooOoO3 = (float) oooO00o.OooOoO();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 20:
                    oo000oVarOooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, z);
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 21:
                    strOooo0O0 = oooO00o.Oooo0O0();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                case 22:
                    zOooOo0o = oooO00o.OooOo0o();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
                default:
                    oooO00o.Oooo0oo();
                    oooO00o.Oooo();
                    continue;
                    c = CharCompanionObject.MIN_VALUE;
                    break;
            }
            z = false;
            c = CharCompanionObject.MIN_VALUE;
        }
        oooO00o.OooOOoo();
        ArrayList arrayList4 = new ArrayList();
        if (fOooOoO4 > 0.0f) {
            arrayList4.add(new o00OOO0O.OooO00o(oooOO1, fValueOf2, fValueOf2, (Interpolator) null, 0.0f, Float.valueOf(fOooOoO4)));
        }
        if (fOooOoO3 <= 0.0f) {
            fOooOoO3 = oooOO1.f11834OooOO0o;
        }
        arrayList4.add(new o00OOO0O.OooO00o(oooOO1, fValueOf, fValueOf, (Interpolator) null, fOooOoO4, Float.valueOf(fOooOoO3)));
        arrayList4.add(new o00OOO0O.OooO00o(oooOO1, fValueOf2, fValueOf2, (Interpolator) null, fOooOoO3, Float.valueOf(Float.MAX_VALUE)));
        if (strOooo0O2.endsWith(".ai") || "ai".equals(str)) {
            str = strOooo0O0;
            oooOO1.OooO00o("Convert your Illustrator layers to shape layers.");
        }
        str = strOooo0O0;
        return new Layer(arrayList2, oooOO1, strOooo0O2, jOooo00O, layerType, jOooo00O2, strOooo0O1, arrayList, o000000oOooO00o, iOooO0OO, iOooO0OO2, color, fOooOoO, fOooOoO2, iOooO0OO3, iOooO0OO4, o000ooo2, o000000Var, arrayList4, matteType2, oo000oVarOooO0O0, zOooOo0o, oooO0OO, oooOOOO);
    }
}
