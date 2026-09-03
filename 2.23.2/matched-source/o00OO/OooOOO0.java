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
    public static final JsonReader.OooO00o f36867OooO00o = JsonReader.OooO00o.OooO00o("ty", "d");

    @Nullable
    public static p136o00OO0oO.OooO OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        String strOooo0;
        p136o00OO0oO.OooO oooO0o;
        ShapeTrimPath.Type type;
        oooO00o.OooO0OO();
        int iOooo00o = 2;
        while (true) {
            if (!oooO00o.OooOo0()) {
                strOooo0 = null;
                break;
            }
            int iOooo0o0 = oooO00o.Oooo0o0(f36867OooO00o);
            if (iOooo0o0 == 0) {
                strOooo0 = oooO00o.Oooo0();
                break;
            }
            if (iOooo0o0 != 1) {
                oooO00o.Oooo0oO();
                oooO00o.OoooO00();
            } else {
                iOooo00o = oooO00o.Oooo00o();
            }
        }
        if (strOooo0 == null) {
            return null;
        }
        boolean zOooOo = false;
        switch (strOooo0) {
            case "el":
                JsonReader.OooO00o oooO00o2 = OooOO0.f36863OooO00o;
                boolean z = iOooo00o == 3;
                String strOooo1 = null;
                p134o00OO0o.o00000 o00000VarOooO0O0 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo = null;
                boolean zOooOo2 = false;
                while (oooO00o.OooOo0()) {
                    int iOooo0o1 = oooO00o.Oooo0o0(OooOO0.f36863OooO00o);
                    if (iOooo0o1 == 0) {
                        strOooo1 = oooO00o.Oooo0();
                    } else if (iOooo0o1 == 1) {
                        o00000VarOooO0O0 = OooO00o.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0o1 == 2) {
                        o0oo0ooOooO0Oo = OooO0o.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0o1 == 3) {
                        zOooOo2 = oooO00o.OooOo();
                    } else if (iOooo0o1 != 4) {
                        oooO00o.Oooo0oO();
                        oooO00o.OoooO00();
                    } else {
                        z = oooO00o.Oooo00o() == 3;
                    }
                }
                oooO0o = new p136o00OO0oO.OooO0o(strOooo1, o00000VarOooO0O0, o0oo0ooOooO0Oo, z, zOooOo2);
                break;
            case "fl":
                JsonReader.OooO00o oooO00o3 = o00000O0.f36890OooO00o;
                p134o00OO0o.o0ooOOo o0ooooo = null;
                String strOooo2 = null;
                int iOooo00o2 = 1;
                p134o00OO0o.o00Ooo o00oooOooO00o = null;
                boolean zOooOo3 = false;
                boolean zOooOo4 = false;
                while (oooO00o.OooOo0()) {
                    int iOooo0o2 = oooO00o.Oooo0o0(o00000O0.f36890OooO00o);
                    if (iOooo0o2 == 0) {
                        strOooo2 = oooO00o.Oooo0();
                    } else if (iOooo0o2 == 1) {
                        o00oooOooO00o = OooO0o.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0o2 == 2) {
                        o0ooooo = OooO0o.OooO0OO(oooO00o, oooOO1);
                    } else if (iOooo0o2 == 3) {
                        zOooOo3 = oooO00o.OooOo();
                    } else if (iOooo0o2 == 4) {
                        iOooo00o2 = oooO00o.Oooo00o();
                    } else if (iOooo0o2 != 5) {
                        oooO00o.Oooo0oO();
                        oooO00o.OoooO00();
                    } else {
                        zOooOo4 = oooO00o.OooOo();
                    }
                }
                if (o0ooooo == null) {
                    o0ooooo = new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100)));
                }
                oooO0o = new p136o00OO0oO.OooOo00(strOooo2, zOooOo3, iOooo00o2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, o00oooOooO00o, o0ooooo, zOooOo4);
                break;
            case "gf":
                JsonReader.OooO00o oooO00o4 = o0OoOo0.f36910OooO00o;
                p134o00OO0o.o0ooOOo o0oooooOooO0OO = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String strOooo3 = null;
                GradientType gradientType = null;
                boolean zOooOo5 = false;
                p134o00OO0o.o00oO0o o00oo0o2 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo2 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo3 = null;
                while (oooO00o.OooOo0()) {
                    switch (oooO00o.Oooo0o0(o0OoOo0.f36910OooO00o)) {
                        case 0:
                            strOooo3 = oooO00o.Oooo0();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooo00o3 = -1;
                            while (oooO00o.OooOo0()) {
                                int iOooo0o3 = oooO00o.Oooo0o0(o0OoOo0.f36911OooO0O0);
                                if (iOooo0o3 == 0) {
                                    iOooo00o3 = oooO00o.Oooo00o();
                                } else if (iOooo0o3 != 1) {
                                    oooO00o.Oooo0oO();
                                    oooO00o.OoooO00();
                                } else {
                                    o00oo0o2 = new p134o00OO0o.o00oO0o(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, new o000oOoO(iOooo00o3), false));
                                }
                            }
                            oooO00o.OooOOo();
                            break;
                        case 2:
                            o0oooooOooO0OO = OooO0o.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType = oooO00o.Oooo00o() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            o0oo0ooOooO0Oo2 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 5:
                            o0oo0ooOooO0Oo3 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 6:
                            fillType = oooO00o.Oooo00o() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zOooOo5 = oooO00o.OooOo();
                            break;
                        default:
                            oooO00o.Oooo0oO();
                            oooO00o.OoooO00();
                            break;
                    }
                }
                oooO0o = new p136o00OO0oO.OooOO0O(strOooo3, gradientType, fillType, o00oo0o2, o0oooooOooO0OO == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO, o0oo0ooOooO0Oo2, o0oo0ooOooO0Oo3, zOooOo5);
                break;
            case "gr":
                JsonReader.OooO00o oooO00o5 = o00000O.f36889OooO00o;
                ArrayList arrayList = new ArrayList();
                String strOooo4 = null;
                while (oooO00o.OooOo0()) {
                    int iOooo0o4 = oooO00o.Oooo0o0(o00000O.f36889OooO00o);
                    if (iOooo0o4 == 0) {
                        strOooo4 = oooO00o.Oooo0();
                    } else if (iOooo0o4 == 1) {
                        zOooOo = oooO00o.OooOo();
                    } else if (iOooo0o4 != 2) {
                        oooO00o.OoooO00();
                    } else {
                        oooO00o.OooO00o();
                        while (oooO00o.OooOo0()) {
                            p136o00OO0oO.OooO oooOOooO00o = OooO00o(oooO00o, oooOO1);
                            if (oooOOooO00o != null) {
                                arrayList.add(oooOOooO00o);
                            }
                        }
                        oooO00o.OooO0oO();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOo(arrayList, strOooo4, zOooOo);
                break;
            case "gs":
                JsonReader.OooO00o oooO00o6 = o00O0O.f36896OooO00o;
                ArrayList arrayList2 = new ArrayList();
                p134o00OO0o.o0ooOOo o0oooooOooO0OO2 = null;
                boolean zOooOo6 = false;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo4 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo5 = null;
                float fOooOooo = 0.0f;
                p134o00OO0o.oo000o oo000oVarOooO0O0 = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                p134o00OO0o.oo000o oo000oVar = null;
                String strOooo5 = null;
                GradientType gradientType2 = null;
                p134o00OO0o.o00oO0o o00oo0o3 = null;
                while (oooO00o.OooOo0()) {
                    switch (oooO00o.Oooo0o0(o00O0O.f36896OooO00o)) {
                        case 0:
                            strOooo5 = oooO00o.Oooo0();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooo00o4 = -1;
                            while (oooO00o.OooOo0()) {
                                int iOooo0o5 = oooO00o.Oooo0o0(o00O0O.f36897OooO0O0);
                                if (iOooo0o5 == 0) {
                                    iOooo00o4 = oooO00o.Oooo00o();
                                } else if (iOooo0o5 != 1) {
                                    oooO00o.Oooo0oO();
                                    oooO00o.OoooO00();
                                } else {
                                    o00oo0o3 = new p134o00OO0o.o00oO0o(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, new o000oOoO(iOooo00o4), false));
                                }
                            }
                            oooO00o.OooOOo();
                            break;
                        case 2:
                            o0oooooOooO0OO2 = OooO0o.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType2 = oooO00o.Oooo00o() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
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
                            lineCapType = ShapeStroke.LineCapType.values()[oooO00o.Oooo00o() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[oooO00o.Oooo00o() - 1];
                            break;
                        case 9:
                            fOooOooo = (float) oooO00o.OooOooo();
                            break;
                        case 10:
                            zOooOo6 = oooO00o.OooOo();
                            break;
                        case 11:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0()) {
                                oooO00o.OooO0OO();
                                p134o00OO0o.oo000o oo000oVarOooO0O1 = null;
                                String strOooo6 = null;
                                while (oooO00o.OooOo0()) {
                                    int iOooo0o6 = oooO00o.Oooo0o0(o00O0O.f36898OooO0OO);
                                    if (iOooo0o6 == 0) {
                                        strOooo6 = oooO00o.Oooo0();
                                    } else if (iOooo0o6 != 1) {
                                        oooO00o.Oooo0oO();
                                        oooO00o.OoooO00();
                                    } else {
                                        oo000oVarOooO0O1 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOo();
                                if (strOooo6.equals("o")) {
                                    oo000oVar = oo000oVarOooO0O1;
                                } else if (strOooo6.equals("d") || strOooo6.equals("g")) {
                                    oooOO1.f11824OooOOO = true;
                                    arrayList2.add(oo000oVarOooO0O1);
                                }
                            }
                            oooO00o.OooO0oO();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((p134o00OO0o.oo000o) arrayList2.get(0));
                            }
                            break;
                        default:
                            oooO00o.Oooo0oO();
                            oooO00o.OoooO00();
                            break;
                    }
                }
                oooO0o = new com.airbnb.lottie.model.content.OooO00o(strOooo5, gradientType2, o00oo0o3, o0oooooOooO0OO2 == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO2, o0oo0ooOooO0Oo4, o0oo0ooOooO0Oo5, oo000oVarOooO0O0, lineCapType, lineJoinType, fOooOooo, arrayList2, oo000oVar, zOooOo6);
                break;
            case "mm":
                JsonReader.OooO00o oooO00o7 = o0Oo0oo.f36909OooO00o;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strOooo7 = null;
                while (oooO00o.OooOo0()) {
                    int iOooo0o7 = oooO00o.Oooo0o0(o0Oo0oo.f36909OooO00o);
                    if (iOooo0o7 == 0) {
                        strOooo7 = oooO00o.Oooo0();
                    } else if (iOooo0o7 == 1) {
                        int iOooo00o5 = oooO00o.Oooo00o();
                        if (iOooo00o5 == 1) {
                            mergePathsMode = MergePaths.MergePathsMode.MERGE;
                        } else if (iOooo00o5 == 2) {
                            mergePathsMode = MergePaths.MergePathsMode.ADD;
                        } else if (iOooo00o5 == 3) {
                            mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                        } else if (iOooo00o5 != 4) {
                            mergePathsMode = iOooo00o5 != 5 ? MergePaths.MergePathsMode.MERGE : MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                        } else {
                            mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                        }
                    } else if (iOooo0o7 != 2) {
                        oooO00o.Oooo0oO();
                        oooO00o.OoooO00();
                    } else {
                        zOooOo = oooO00o.OooOo();
                    }
                }
                MergePaths mergePaths = new MergePaths(strOooo7, mergePathsMode, zOooOo);
                oooOO1.OooO00o("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                oooO0o = mergePaths;
                break;
            case "rc":
                JsonReader.OooO00o oooO00o8 = o000OOo.f36894OooO00o;
                String strOooo8 = null;
                p134o00OO0o.o00000 o00000VarOooO0O1 = null;
                p134o00OO0o.o0Oo0oo o0oo0ooOooO0Oo6 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O2 = null;
                boolean zOooOo7 = false;
                while (oooO00o.OooOo0()) {
                    int iOooo0o8 = oooO00o.Oooo0o0(o000OOo.f36894OooO00o);
                    if (iOooo0o8 == 0) {
                        strOooo8 = oooO00o.Oooo0();
                    } else if (iOooo0o8 == 1) {
                        o00000VarOooO0O1 = OooO00o.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0o8 == 2) {
                        o0oo0ooOooO0Oo6 = OooO0o.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0o8 == 3) {
                        oo000oVarOooO0O2 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                    } else if (iOooo0o8 != 4) {
                        oooO00o.OoooO00();
                    } else {
                        zOooOo7 = oooO00o.OooOo();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOOO0(strOooo8, o00000VarOooO0O1, o0oo0ooOooO0Oo6, oo000oVarOooO0O2, zOooOo7);
                break;
            case "rp":
                JsonReader.OooO00o oooO00o9 = o000000.f36887OooO00o;
                String strOooo9 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O3 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O4 = null;
                p134o00OO0o.o000000O o000000oOooO00o = null;
                boolean zOooOo8 = false;
                while (oooO00o.OooOo0()) {
                    int iOooo0o9 = oooO00o.Oooo0o0(o000000.f36887OooO00o);
                    if (iOooo0o9 == 0) {
                        strOooo9 = oooO00o.Oooo0();
                    } else if (iOooo0o9 == 1) {
                        oo000oVarOooO0O3 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0o9 == 2) {
                        oo000oVarOooO0O4 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0o9 == 3) {
                        o000000oOooO00o = OooO0OO.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0o9 != 4) {
                        oooO00o.OoooO00();
                    } else {
                        zOooOo8 = oooO00o.OooOo();
                    }
                }
                oooO0o = new p136o00OO0oO.OooOOO(strOooo9, oo000oVarOooO0O3, oo000oVarOooO0O4, o000000oOooO00o, zOooOo8);
                break;
            case "sh":
                JsonReader.OooO00o oooO00o10 = o00000OO.f36891OooO00o;
                p134o00OO0o.oo0o0Oo oo0o0oo = null;
                String strOooo10 = null;
                int iOooo00o6 = 0;
                boolean zOooOo9 = false;
                while (oooO00o.OooOo0()) {
                    int iOooo0o10 = oooO00o.Oooo0o0(o00000OO.f36891OooO00o);
                    if (iOooo0o10 == 0) {
                        strOooo10 = oooO00o.Oooo0();
                    } else if (iOooo0o10 == 1) {
                        iOooo00o6 = oooO00o.Oooo00o();
                    } else if (iOooo0o10 == 2) {
                        oo0o0oo = new p134o00OO0o.oo0o0Oo(o00oO0o.OooO00o(oooO00o, oooOO1, o00OOO0.OooOOOO.OooO0OO(), o00000.f36885OooO00o, false));
                    } else if (iOooo0o10 != 3) {
                        oooO00o.OoooO00();
                    } else {
                        zOooOo9 = oooO00o.OooOo();
                    }
                }
                oooO0o = new p136o00OO0oO.Oooo000(strOooo10, iOooo00o6, oo0o0oo, zOooOo9);
                break;
            case "sr":
                JsonReader.OooO00o oooO00o11 = o0O0O00.f36903OooO00o;
                String strOooo11 = null;
                PolystarShape.Type typeOooO00o = null;
                p134o00OO0o.oo000o oo000oVarOooO0O5 = null;
                p134o00OO0o.o00000 o00000VarOooO0O2 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O6 = null;
                boolean zOooOo10 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O7 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O8 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O9 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O10 = null;
                while (oooO00o.OooOo0()) {
                    switch (oooO00o.Oooo0o0(o0O0O00.f36903OooO00o)) {
                        case 0:
                            strOooo11 = oooO00o.Oooo0();
                            break;
                        case 1:
                            typeOooO00o = PolystarShape.Type.OooO00o(oooO00o.Oooo00o());
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
                            zOooOo10 = oooO00o.OooOo();
                            break;
                        default:
                            oooO00o.Oooo0oO();
                            oooO00o.OoooO00();
                            break;
                    }
                }
                oooO0o = new PolystarShape(strOooo11, typeOooO00o, oo000oVarOooO0O5, o00000VarOooO0O2, oo000oVarOooO0O6, oo000oVarOooO0O7, oo000oVarOooO0O8, oo000oVarOooO0O9, oo000oVarOooO0O10, zOooOo10);
                break;
            case "st":
                JsonReader.OooO00o oooO00o12 = o0000Ooo.f36892OooO00o;
                ArrayList arrayList3 = new ArrayList();
                p134o00OO0o.o0ooOOo o0oooooOooO0OO3 = null;
                String strOooo12 = null;
                p134o00OO0o.oo000o oo000oVar2 = null;
                p134o00OO0o.o00Ooo o00oooOooO00o2 = null;
                boolean zOooOo11 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O11 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                float fOooOooo2 = 0.0f;
                while (oooO00o.OooOo0()) {
                    switch (oooO00o.Oooo0o0(o0000Ooo.f36892OooO00o)) {
                        case 0:
                            strOooo12 = oooO00o.Oooo0();
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
                            lineCapType2 = ShapeStroke.LineCapType.values()[oooO00o.Oooo00o() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[oooO00o.Oooo00o() - 1];
                            break;
                        case 6:
                            fOooOooo2 = (float) oooO00o.OooOooo();
                            break;
                        case 7:
                            zOooOo11 = oooO00o.OooOo();
                            break;
                        case 8:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo0()) {
                                oooO00o.OooO0OO();
                                p134o00OO0o.oo000o oo000oVarOooO0O12 = null;
                                String strOooo13 = null;
                                while (oooO00o.OooOo0()) {
                                    int iOooo0o11 = oooO00o.Oooo0o0(o0000Ooo.f36893OooO0O0);
                                    if (iOooo0o11 == 0) {
                                        strOooo13 = oooO00o.Oooo0();
                                    } else if (iOooo0o11 != 1) {
                                        oooO00o.Oooo0oO();
                                        oooO00o.OoooO00();
                                    } else {
                                        oo000oVarOooO0O12 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOo();
                                strOooo13.getClass();
                                strOooo13.hashCode();
                                switch (strOooo13) {
                                    case "d":
                                    case "g":
                                        oooOO1.f11824OooOOO = true;
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
                            oooO00o.OoooO00();
                            break;
                    }
                }
                oooO0o = new ShapeStroke(strOooo12, oo000oVar2, arrayList3, o00oooOooO00o2, o0oooooOooO0OO3 == null ? new p134o00OO0o.o0ooOOo(Collections.singletonList(new o00OOO0O.OooO00o(100))) : o0oooooOooO0OO3, oo000oVarOooO0O11, lineCapType2, lineJoinType2, fOooOooo2, zOooOo11);
                break;
            case "tm":
                JsonReader.OooO00o oooO00o13 = o0000.f36884OooO00o;
                String strOooo14 = null;
                ShapeTrimPath.Type type2 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O13 = null;
                p134o00OO0o.oo000o oo000oVarOooO0O14 = null;
                boolean zOooOo12 = false;
                p134o00OO0o.oo000o oo000oVarOooO0O15 = null;
                while (oooO00o.OooOo0()) {
                    int iOooo0o12 = oooO00o.Oooo0o0(o0000.f36884OooO00o);
                    if (iOooo0o12 == 0) {
                        oo000oVarOooO0O13 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0o12 == 1) {
                        oo000oVarOooO0O14 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0o12 == 2) {
                        oo000oVarOooO0O15 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0o12 == 3) {
                        strOooo14 = oooO00o.Oooo0();
                    } else if (iOooo0o12 == 4) {
                        int iOooo00o7 = oooO00o.Oooo00o();
                        if (iOooo00o7 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (iOooo00o7 != 2) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown trim path type ", iOooo00o7));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type2 = type;
                    } else if (iOooo0o12 != 5) {
                        oooO00o.OoooO00();
                    } else {
                        zOooOo12 = oooO00o.OooOo();
                    }
                }
                oooO0o = new ShapeTrimPath(strOooo14, type2, oo000oVarOooO0O13, oo000oVarOooO0O14, oo000oVarOooO0O15, zOooOo12);
                break;
            case "tr":
                oooO0o = OooO0OO.OooO00o(oooO00o, oooOO1);
                break;
            default:
                o00OOO0.OooOO0.OooO0O0("Unknown shape type ".concat(strOooo0));
                oooO0o = null;
                break;
        }
        while (oooO00o.OooOo0()) {
            oooO00o.OoooO00();
        }
        oooO00o.OooOOo();
        return oooO0o;
    }
}
