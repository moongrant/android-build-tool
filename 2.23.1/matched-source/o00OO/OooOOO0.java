package o00OO;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36863OooO00o = JsonReader.OooO00o.OooO00o("ty", "d");

    @Nullable
    public static p136o00OO0oO.OooO OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        String strOooo0O0;
        p136o00OO0oO.OooO oooO0o;
        ShapeTrimPath.Type type;
        oooO00o.OooO0OO();
        int iOooo00O = 2;
        while (true) {
            if (!oooO00o.OooOo0O()) {
                strOooo0O0 = null;
                break;
            }
            int iOooo0oO = oooO00o.Oooo0oO(f36863OooO00o);
            if (iOooo0oO == 0) {
                strOooo0O0 = oooO00o.Oooo0O0();
                break;
            }
            if (iOooo0oO != 1) {
                oooO00o.Oooo0oo();
                oooO00o.Oooo();
            } else {
                iOooo00O = oooO00o.Oooo00O();
            }
        }
        if (strOooo0O0 == null) {
            return null;
        }
        boolean zOooOo0o = false;
        switch (strOooo0O0) {
            case "el":
                JsonReader.OooO00o oooO00o2 = OooOO0.f36859OooO00o;
                boolean z = iOooo00O == 3;
                String strOooo0O1 = null;
                p134o00OO0o.o00000 o00000VarOooO0O0 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo = null;
                boolean zOooOo0o2 = false;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO2 = oooO00o.Oooo0oO(OooOO0.f36859OooO00o);
                    if (iOooo0oO2 == 0) {
                        strOooo0O1 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO2 == 1) {
                        o00000VarOooO0O0 = OooO00o.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0oO2 == 2) {
                        o0oo0ooOooO0Oo = OooO0o.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0oO2 == 3) {
                        zOooOo0o2 = oooO00o.OooOo0o();
                    } else if (iOooo0oO2 != 4) {
                        oooO00o.Oooo0oo();
                        oooO00o.Oooo();
                    } else {
                        z = oooO00o.Oooo00O() == 3;
                    }
                }
                oooO0o = new p136o00OO0oO.OooO0o(strOooo0O1, o00000VarOooO0O0, o0oo0ooOooO0Oo, z, zOooOo0o2);
                break;
            case "fl":
                JsonReader.OooO00o oooO00o3 = o00000O0.f36886OooO00o;
                p134o00OO0o.o0ooOOo o0ooooo = null;
                String strOooo0O2 = null;
                int iOooo00O2 = 1;
                p134o00OO0o.o00Ooo o00oooOooO00o = null;
                boolean zOooOo0o3 = false;
                boolean zOooOo0o4 = false;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO3 = oooO00o.Oooo0oO(o00000O0.f36886OooO00o);
                    if (iOooo0oO3 == 0) {
                        strOooo0O2 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO3 == 1) {
                        o00oooOooO00o = OooO0o.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0oO3 == 2) {
                        o0ooooo = OooO0o.OooO0OO(oooO00o, oooOO1);
                    } else if (iOooo0oO3 == 3) {
                        zOooOo0o3 = oooO00o.OooOo0o();
                    } else if (iOooo0oO3 == 4) {
                        iOooo00O2 = oooO00o.Oooo00O();
                    } else if (iOooo0oO3 != 5) {
                        oooO00o.Oooo0oo();
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o4 = oooO00o.OooOo0o();
                    }
                }
                if (o0ooooo == null) {
                    o0ooooo = new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100)));
                }
                oooO0o = new p136o00OO0oO.OooOo00(strOooo0O2, zOooOo0o3, iOooo00O2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, o00oooOooO00o, o0ooooo, zOooOo0o4);
                break;
            case "gf":
                JsonReader.OooO00o oooO00o4 = o0OoOo0.f36906OooO00o;
                p134o00OO0o.o0ooOOo o0oooooOooO0OO = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String strOooo0O3 = null;
                GradientType gradientType = null;
                boolean zOooOo0o5 = false;
                p134o00OO0o.o00oO0o o00oo0o2 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo2 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo3 = null;
                while (oooO00o.OooOo0O()) {
                    switch (oooO00o.Oooo0oO(o0OoOo0.f36906OooO00o)) {
                        case 0:
                            strOooo0O3 = oooO00o.Oooo0O0();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooo00O3 = -1;
                            while (oooO00o.OooOo0O()) {
                                int iOooo0oO4 = oooO00o.Oooo0oO(o0OoOo0.f36907OooO0O0);
                                if (iOooo0oO4 == 0) {
                                    iOooo00O3 = oooO00o.Oooo00O();
                                } else if (iOooo0oO4 != 1) {
                                    oooO00o.Oooo0oo();
                                    oooO00o.Oooo();
                                } else {
                                    o00oo0o2 = new p134o00OO0o.o00oO0o(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, new o000oOoO(iOooo00O3), false));
                                }
                            }
                            oooO00o.OooOOoo();
                            break;
                        case 2:
                            o0oooooOooO0OO = OooO0o.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType = oooO00o.Oooo00O() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            o0oo0ooOooO0Oo2 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 5:
                            o0oo0ooOooO0Oo3 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 6:
                            fillType = oooO00o.Oooo00O() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zOooOo0o5 = oooO00o.OooOo0o();
                            break;
                        default:
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                            break;
                    }
                }
                oooO0o = new p136o00OO0oO.OooOO0O(strOooo0O3, gradientType, fillType, o00oo0o2, o0oooooOooO0OO == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO, o0oo0ooOooO0Oo2, o0oo0ooOooO0Oo3, zOooOo0o5);
                break;
            case "gr":
                JsonReader.OooO00o oooO00o5 = o00000O.f36885OooO00o;
                ArrayList arrayList = new ArrayList();
                String strOooo0O4 = null;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO5 = oooO00o.Oooo0oO(o00000O.f36885OooO00o);
                    if (iOooo0oO5 == 0) {
                        strOooo0O4 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO5 == 1) {
                        zOooOo0o = oooO00o.OooOo0o();
                    } else if (iOooo0oO5 != 2) {
                        oooO00o.Oooo();
                    } else {
                        oooO00o.OooO00o();
                        while (oooO00o.OooOo0O()) {
                            p136o00OO0oO.OooO oooOOooO00o = OooO00o(oooO00o, oooOO1);
                            if (oooOOooO00o != null) {
                                arrayList.add(oooOOooO00o);
                            }
                        }
                        oooO00o.OooO0oO();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOo(arrayList, strOooo0O4, zOooOo0o);
                break;
            case "gs":
                JsonReader.OooO00o oooO00o6 = o00O0O.f36892OooO00o;
                ArrayList arrayList2 = new ArrayList();
                p134o00OO0o.o0ooOOo o0oooooOooO0OO2 = null;
                boolean zOooOo0o6 = false;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo4 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo5 = null;
                float fOooOoO = 0.0f;
                p134o00OO0o.oo000o oo000oVarOooO0O0 = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                p134o00OO0o.oo000o oo000oVar = null;
                String strOooo0O5 = null;
                GradientType gradientType2 = null;
                p134o00OO0o.o00oO0o o00oo0o3 = null;
                while (oooO00o.OooOo0O()) {
                    switch (oooO00o.Oooo0oO(o00O0O.f36892OooO00o)) {
                        case 0:
                            strOooo0O5 = oooO00o.Oooo0O0();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooo00O4 = -1;
                            while (oooO00o.OooOo0O()) {
                                int iOooo0oO6 = oooO00o.Oooo0oO(o00O0O.f36893OooO0O0);
                                if (iOooo0oO6 == 0) {
                                    iOooo00O4 = oooO00o.Oooo00O();
                                } else if (iOooo0oO6 != 1) {
                                    oooO00o.Oooo0oo();
                                    oooO00o.Oooo();
                                } else {
                                    o00oo0o3 = new p134o00OO0o.o00oO0o(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, new o000oOoO(iOooo00O4), false));
                                }
                            }
                            oooO00o.OooOOoo();
                            break;
                        case 2:
                            o0oooooOooO0OO2 = OooO0o.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType2 = oooO00o.Oooo00O() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            o0oo0ooOooO0Oo4 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 5:
                            o0oo0ooOooO0Oo5 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 6:
                            oo000oVarOooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[oooO00o.Oooo00O() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[oooO00o.Oooo00O() - 1];
                            break;
                        case 9:
                            fOooOoO = (float) oooO00o.OooOoO();
                            break;
                        case 10:
                            zOooOo0o6 = oooO00o.OooOo0o();
                            break;
                        case 11:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0O()) {
                                oooO00o.OooO0OO();
                                p134o00OO0o.oo000o oo000oVarOooO0O1 = null;
                                String strOooo0O6 = null;
                                while (oooO00o.OooOo0O()) {
                                    int iOooo0oO7 = oooO00o.Oooo0oO(o00O0O.f36894OooO0OO);
                                    if (iOooo0oO7 == 0) {
                                        strOooo0O6 = oooO00o.Oooo0O0();
                                    } else if (iOooo0oO7 != 1) {
                                        oooO00o.Oooo0oo();
                                        oooO00o.Oooo();
                                    } else {
                                        oo000oVarOooO0O1 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOoo();
                                if (strOooo0O6.equals("o")) {
                                    oo000oVar = oo000oVarOooO0O1;
                                } else if (strOooo0O6.equals("d") || strOooo0O6.equals("g")) {
                                    oooOO1.f11835OooOOO = true;
                                    arrayList2.add(oo000oVarOooO0O1);
                                }
                            }
                            oooO00o.OooO0oO();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((p134o00OO0o.oo000o) arrayList2.get(0));
                            }
                            break;
                        default:
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                            break;
                    }
                }
                oooO0o = new com.airbnb.lottie.model.content.OooO00o(strOooo0O5, gradientType2, o00oo0o3, o0oooooOooO0OO2 == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO2, o0oo0ooOooO0Oo4, o0oo0ooOooO0Oo5, oo000oVarOooO0O0, lineCapType, lineJoinType, fOooOoO, arrayList2, oo000oVar, zOooOo0o6);
                break;
            case "mm":
                JsonReader.OooO00o oooO00o7 = o0Oo0oo.f36905OooO00o;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strOooo0O7 = null;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO8 = oooO00o.Oooo0oO(o0Oo0oo.f36905OooO00o);
                    if (iOooo0oO8 == 0) {
                        strOooo0O7 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO8 == 1) {
                        int iOooo00O5 = oooO00o.Oooo00O();
                        if (iOooo00O5 == 1) {
                            mergePathsMode = MergePaths.MergePathsMode.MERGE;
                        } else if (iOooo00O5 == 2) {
                            mergePathsMode = MergePaths.MergePathsMode.ADD;
                        } else if (iOooo00O5 == 3) {
                            mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                        } else if (iOooo00O5 != 4) {
                            mergePathsMode = iOooo00O5 != 5 ? MergePaths.MergePathsMode.MERGE : MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                        } else {
                            mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                        }
                    } else if (iOooo0oO8 != 2) {
                        oooO00o.Oooo0oo();
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o = oooO00o.OooOo0o();
                    }
                }
                MergePaths mergePaths = new MergePaths(strOooo0O7, mergePathsMode, zOooOo0o);
                oooOO1.OooO00o("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                oooO0o = mergePaths;
                break;
            case "rc":
                JsonReader.OooO00o oooO00o8 = o000OOo.f36890OooO00o;
                String strOooo0O8 = null;
                p134o00OO0o.o00000 o00000VarOooO0O1 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo6 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O2 = null;
                boolean zOooOo0o7 = false;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO9 = oooO00o.Oooo0oO(o000OOo.f36890OooO00o);
                    if (iOooo0oO9 == 0) {
                        strOooo0O8 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO9 == 1) {
                        o00000VarOooO0O1 = OooO00o.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0oO9 == 2) {
                        o0oo0ooOooO0Oo6 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0oO9 == 3) {
                        oo000oVarOooO0O2 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                    } else if (iOooo0oO9 != 4) {
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o7 = oooO00o.OooOo0o();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOOO0(strOooo0O8, o00000VarOooO0O1, o0oo0ooOooO0Oo6, oo000oVarOooO0O2, zOooOo0o7);
                break;
            case "rp":
                JsonReader.OooO00o oooO00o9 = o000000.f36883OooO00o;
                String strOooo0O9 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O3 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O4 = null;
                p134o00OO0o.o000000O o000000oOooO00o = null;
                boolean zOooOo0o8 = false;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO10 = oooO00o.Oooo0oO(o000000.f36883OooO00o);
                    if (iOooo0oO10 == 0) {
                        strOooo0O9 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO10 == 1) {
                        oo000oVarOooO0O3 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0oO10 == 2) {
                        oo000oVarOooO0O4 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0oO10 == 3) {
                        o000000oOooO00o = OooO0OO.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0oO10 != 4) {
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o8 = oooO00o.OooOo0o();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOOO(strOooo0O9, oo000oVarOooO0O3, oo000oVarOooO0O4, o000000oOooO00o, zOooOo0o8);
                break;
            case "sh":
                JsonReader.OooO00o oooO00o10 = o00000OO.f36887OooO00o;
                p134o00OO0o.oo0o0Oo oo0o0oo = null;
                String strOooo0O10 = null;
                int iOooo00O6 = 0;
                boolean zOooOo0o9 = false;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO11 = oooO00o.Oooo0oO(o00000OO.f36887OooO00o);
                    if (iOooo0oO11 == 0) {
                        strOooo0O10 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO11 == 1) {
                        iOooo00O6 = oooO00o.Oooo00O();
                    } else if (iOooo0oO11 == 2) {
                        oo0o0oo = new p134o00OO0o.oo0o0Oo(o00oO0o.OooO00o(oooO00o, oooOO1, o00OOO0.OooOOOO.OooO0OO(), o00000.f36881OooO00o, false));
                    } else if (iOooo0oO11 != 3) {
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o9 = oooO00o.OooOo0o();
                    }
                }
                oooO0o = new p136o00OO0oO.Oooo000(strOooo0O10, iOooo00O6, oo0o0oo, zOooOo0o9);
                break;
            case "sr":
                JsonReader.OooO00o oooO00o11 = o0O0O00.f36899OooO00o;
                String strOooo0O11 = null;
                PolystarShape.Type typeOooO00o = null;
                p134o00OO0o.oo000o oo000oVarOooO0O5 = null;
                p134o00OO0o.o00000 o00000VarOooO0O2 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O6 = null;
                boolean zOooOo0o10 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O7 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O8 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O9 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O10 = null;
                while (oooO00o.OooOo0O()) {
                    switch (oooO00o.Oooo0oO(o0O0O00.f36899OooO00o)) {
                        case 0:
                            strOooo0O11 = oooO00o.Oooo0O0();
                            break;
                        case 1:
                            typeOooO00o = PolystarShape.Type.OooO00o(oooO00o.Oooo00O());
                            break;
                        case 2:
                            oo000oVarOooO0O5 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 3:
                            o00000VarOooO0O2 = OooO00o.OooO0O0(oooO00o, oooOO1);
                            break;
                        case 4:
                            oo000oVarOooO0O6 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 5:
                            oo000oVarOooO0O8 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 6:
                            oo000oVarOooO0O10 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 7:
                            oo000oVarOooO0O7 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 8:
                            oo000oVarOooO0O9 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 9:
                            zOooOo0o10 = oooO00o.OooOo0o();
                            break;
                        default:
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                            break;
                    }
                }
                oooO0o = new PolystarShape(strOooo0O11, typeOooO00o, oo000oVarOooO0O5, o00000VarOooO0O2, oo000oVarOooO0O6, oo000oVarOooO0O7, oo000oVarOooO0O8, oo000oVarOooO0O9, oo000oVarOooO0O10, zOooOo0o10);
                break;
            case "st":
                JsonReader.OooO00o oooO00o12 = o0000Ooo.f36888OooO00o;
                ArrayList arrayList3 = new ArrayList();
                p134o00OO0o.o0ooOOo o0oooooOooO0OO3 = null;
                String strOooo0O12 = null;
                p134o00OO0o.oo000o oo000oVar2 = null;
                p134o00OO0o.o00Ooo o00oooOooO00o2 = null;
                boolean zOooOo0o11 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O11 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                float fOooOoO2 = 0.0f;
                while (oooO00o.OooOo0O()) {
                    switch (oooO00o.Oooo0oO(o0000Ooo.f36888OooO00o)) {
                        case 0:
                            strOooo0O12 = oooO00o.Oooo0O0();
                            break;
                        case 1:
                            o00oooOooO00o2 = OooO0o.OooO00o(oooO00o, oooOO1);
                            break;
                        case 2:
                            oo000oVarOooO0O11 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 3:
                            o0oooooOooO0OO3 = OooO0o.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[oooO00o.Oooo00O() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[oooO00o.Oooo00O() - 1];
                            break;
                        case 6:
                            fOooOoO2 = (float) oooO00o.OooOoO();
                            break;
                        case 7:
                            zOooOo0o11 = oooO00o.OooOo0o();
                            break;
                        case 8:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0O()) {
                                oooO00o.OooO0OO();
                                p134o00OO0o.oo000o oo000oVarOooO0O12 = null;
                                String strOooo0O13 = null;
                                while (oooO00o.OooOo0O()) {
                                    int iOooo0oO12 = oooO00o.Oooo0oO(o0000Ooo.f36889OooO0O0);
                                    if (iOooo0oO12 == 0) {
                                        strOooo0O13 = oooO00o.Oooo0O0();
                                    } else if (iOooo0oO12 != 1) {
                                        oooO00o.Oooo0oo();
                                        oooO00o.Oooo();
                                    } else {
                                        oo000oVarOooO0O12 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOoo();
                                strOooo0O13.getClass();
                                strOooo0O13.hashCode();
                                switch (strOooo0O13) {
                                    case "d":
                                    case "g":
                                        oooOO1.f11835OooOOO = true;
                                        arrayList3.add(oo000oVarOooO0O12);
                                        break;
                                    case "o":
                                        oo000oVar2 = oo000oVarOooO0O12;
                                        break;
                                }
                            }
                            oooO00o.OooO0oO();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((p134o00OO0o.oo000o) arrayList3.get(0));
                            }
                            break;
                        default:
                            oooO00o.Oooo();
                            break;
                    }
                }
                oooO0o = new ShapeStroke(strOooo0O12, oo000oVar2, arrayList3, o00oooOooO00o2, o0oooooOooO0OO3 == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO3, oo000oVarOooO0O11, lineCapType2, lineJoinType2, fOooOoO2, zOooOo0o11);
                break;
            case "tm":
                JsonReader.OooO00o oooO00o13 = o0000.f36880OooO00o;
                String strOooo0O14 = null;
                ShapeTrimPath.Type type2 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O13 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O14 = null;
                boolean zOooOo0o12 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O15 = null;
                while (oooO00o.OooOo0O()) {
                    int iOooo0oO13 = oooO00o.Oooo0oO(o0000.f36880OooO00o);
                    if (iOooo0oO13 == 0) {
                        oo000oVarOooO0O13 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0oO13 == 1) {
                        oo000oVarOooO0O14 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0oO13 == 2) {
                        oo000oVarOooO0O15 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0oO13 == 3) {
                        strOooo0O14 = oooO00o.Oooo0O0();
                    } else if (iOooo0oO13 == 4) {
                        int iOooo00O7 = oooO00o.Oooo00O();
                        if (iOooo00O7 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (iOooo00O7 != 2) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown trim path type ", iOooo00O7));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type2 = type;
                    } else if (iOooo0oO13 != 5) {
                        oooO00o.Oooo();
                    } else {
                        zOooOo0o12 = oooO00o.OooOo0o();
                    }
                }
                oooO0o = new ShapeTrimPath(strOooo0O14, type2, oo000oVarOooO0O13, oo000oVarOooO0O14, oo000oVarOooO0O15, zOooOo0o12);
                break;
            case "tr":
                oooO0o = OooO0OO.OooO00o(oooO00o, oooOO1);
                break;
            default:
                o00OOO0.OooOO0.OooO0O0("Unknown shape type ".concat(strOooo0O0));
                oooO0o = null;
                break;
        }
        while (oooO00o.OooOo0O()) {
            oooO00o.Oooo();
        }
        oooO00o.OooOOoo();
        return oooO0o;
    }
}
