package p115o00O00oO;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00O0.OooOOOO;
import o00O00OO.OooO0O0;
import o00O00OO.OooO0OO;
import o00O00OO.OooO0o;
import o00O00OO.OooOOO0;
import o00O00OO.OooOo;
import o00O00OO.Oooo000;
import p113o00O00Oo.o00O0O;
import p113o00O00Oo.o00Ooo;
import p113o00O00Oo.o00oO0o;
import p113o00O00Oo.o0OO00O;
import p113o00O00Oo.o0OOO0o;
import p113o00O00Oo.o0Oo0oo;
import p113o00O00Oo.o0OoOo0;
import p113o00O00Oo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36449OooO00o = JsonReader.OooO00o.OooO00o("ty", "d");

    @Nullable
    public static o00O0O OooO00o(OooO00o oooO00o, OooOO0 oooOO1) throws IOException {
        String strOooo00o;
        o00O0O o0oooo0;
        ShapeTrimPath.Type type;
        oooO00o.OooO0OO();
        int iOooOooO = 2;
        while (true) {
            if (!oooO00o.OooOo00()) {
                strOooo00o = null;
                break;
            }
            int iOooo0OO = oooO00o.Oooo0OO(f36449OooO00o);
            if (iOooo0OO == 0) {
                strOooo00o = oooO00o.Oooo00o();
                break;
            }
            if (iOooo0OO != 1) {
                oooO00o.Oooo0o0();
                oooO00o.Oooo0o();
            } else {
                iOooOooO = oooO00o.OooOooO();
            }
        }
        if (strOooo00o == null) {
            return null;
        }
        boolean zOooOo0 = false;
        switch (strOooo00o) {
            case "el":
                JsonReader.OooO00o oooO00o2 = o00000.f36446OooO00o;
                boolean z = iOooOooO == 3;
                String strOooo00o2 = null;
                Oooo000 oooo000OooO0O0 = null;
                o00O00OO.OooOO0 oooOO0OooO0Oo = null;
                boolean zOooOo1 = false;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO2 = oooO00o.Oooo0OO(o00000.f36446OooO00o);
                    if (iOooo0OO2 == 0) {
                        strOooo00o2 = oooO00o.Oooo00o();
                    } else if (iOooo0OO2 == 1) {
                        oooo000OooO0O0 = oo0o0Oo.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0OO2 == 2) {
                        oooOO0OooO0Oo = o000000.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0OO2 == 3) {
                        zOooOo1 = oooO00o.OooOo0();
                    } else if (iOooo0OO2 != 4) {
                        oooO00o.Oooo0o0();
                        oooO00o.Oooo0o();
                    } else {
                        z = oooO00o.OooOooO() == 3;
                    }
                }
                o0oooo0 = new o0OoOo0(strOooo00o2, oooo000OooO0O0, oooOO0OooO0Oo, z, zOooOo1);
                break;
            case "fl":
                JsonReader.OooO00o oooO00o3 = o00.f36436OooO00o;
                OooO0o oooO0o = null;
                String strOooo00o3 = null;
                int iOooOooO2 = 1;
                o00O00OO.OooO00o OooO00o2 = null;
                boolean zOooOo2 = false;
                boolean zOooOo3 = false;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO3 = oooO00o.Oooo0OO(o00.f36436OooO00o);
                    if (iOooo0OO3 == 0) {
                        strOooo00o3 = oooO00o.Oooo00o();
                    } else if (iOooo0OO3 == 1) {
                        OooO00o2 = o000000.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0OO3 == 2) {
                        oooO0o = o000000.OooO0OO(oooO00o, oooOO1);
                    } else if (iOooo0OO3 == 3) {
                        zOooOo2 = oooO00o.OooOo0();
                    } else if (iOooo0OO3 == 4) {
                        iOooOooO2 = oooO00o.OooOooO();
                    } else if (iOooo0OO3 != 5) {
                        oooO00o.Oooo0o0();
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo3 = oooO00o.OooOo0();
                    }
                }
                if (oooO0o == null) {
                    oooO0o = new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(100)));
                }
                o0oooo0 = new o0OOO0o(strOooo00o3, zOooOo2, iOooOooO2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, OooO00o2, oooO0o, zOooOo3);
                break;
            case "gf":
                JsonReader.OooO00o oooO00o4 = o000OO.f36481OooO00o;
                OooO0o oooO0oOooO0OO = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String strOooo00o4 = null;
                GradientType gradientType = null;
                boolean zOooOo4 = false;
                OooO0OO oooO0OO = null;
                o00O00OO.OooOO0 oooOO0OooO0Oo2 = null;
                o00O00OO.OooOO0 oooOO0OooO0Oo3 = null;
                while (oooO00o.OooOo00()) {
                    switch (oooO00o.Oooo0OO(o000OO.f36481OooO00o)) {
                        case 0:
                            strOooo00o4 = oooO00o.Oooo00o();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooOooO3 = -1;
                            while (oooO00o.OooOo00()) {
                                int iOooo0OO4 = oooO00o.Oooo0OO(o000OO.f36482OooO0O0);
                                if (iOooo0OO4 == 0) {
                                    iOooOooO3 = oooO00o.OooOooO();
                                } else if (iOooo0OO4 != 1) {
                                    oooO00o.Oooo0o0();
                                    oooO00o.Oooo0o();
                                } else {
                                    oooO0OO = new OooO0OO(o000O0o.OooO00o(oooO00o, oooOO1, 1.0f, new o0000O0O(iOooOooO3), false));
                                }
                            }
                            oooO00o.OooOOo0();
                            break;
                        case 2:
                            oooO0oOooO0OO = o000000.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType = oooO00o.OooOooO() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            oooOO0OooO0Oo2 = o000000.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 5:
                            oooOO0OooO0Oo3 = o000000.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 6:
                            fillType = oooO00o.OooOooO() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zOooOo4 = oooO00o.OooOo0();
                            break;
                        default:
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                            break;
                    }
                }
                o0oooo0 = new o00Ooo(strOooo00o4, gradientType, fillType, oooO0OO, oooO0oOooO0OO == null ? new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(100))) : oooO0oOooO0OO, oooOO0OooO0Oo2, oooOO0OooO0Oo3, zOooOo4);
                break;
            case "gr":
                JsonReader.OooO00o oooO00o5 = o00O0000.f36494OooO00o;
                ArrayList arrayList = new ArrayList();
                String strOooo00o5 = null;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO5 = oooO00o.Oooo0OO(o00O0000.f36494OooO00o);
                    if (iOooo0OO5 == 0) {
                        strOooo00o5 = oooO00o.Oooo00o();
                    } else if (iOooo0OO5 == 1) {
                        zOooOo0 = oooO00o.OooOo0();
                    } else if (iOooo0OO5 != 2) {
                        oooO00o.Oooo0o();
                    } else {
                        oooO00o.OooO00o();
                        while (oooO00o.OooOo00()) {
                            o00O0O o00o0oOooO00o = OooO00o(oooO00o, oooOO1);
                            if (o00o0oOooO00o != null) {
                                arrayList.add(o00o0oOooO00o);
                            }
                        }
                        oooO00o.OooO0oO();
                    }
                }
                o0oooo0 = new o0Oo0oo(arrayList, strOooo00o5, zOooOo0);
                break;
            case "gs":
                JsonReader.OooO00o oooO00o6 = o0000O.f36453OooO00o;
                ArrayList arrayList2 = new ArrayList();
                OooO0o oooO0oOooO0OO2 = null;
                boolean zOooOo5 = false;
                o00O00OO.OooOO0 oooOO0OooO0Oo4 = null;
                o00O00OO.OooOO0 oooOO0OooO0Oo5 = null;
                float fOooOo = 0.0f;
                OooO0O0 OooO0O1 = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                OooO0O0 oooO0O0 = null;
                String strOooo00o6 = null;
                GradientType gradientType2 = null;
                OooO0OO oooO0OO2 = null;
                while (oooO00o.OooOo00()) {
                    switch (oooO00o.Oooo0OO(o0000O.f36453OooO00o)) {
                        case 0:
                            strOooo00o6 = oooO00o.Oooo00o();
                            break;
                        case 1:
                            oooO00o.OooO0OO();
                            int iOooOooO4 = -1;
                            while (oooO00o.OooOo00()) {
                                int iOooo0OO6 = oooO00o.Oooo0OO(o0000O.f36454OooO0O0);
                                if (iOooo0OO6 == 0) {
                                    iOooOooO4 = oooO00o.OooOooO();
                                } else if (iOooo0OO6 != 1) {
                                    oooO00o.Oooo0o0();
                                    oooO00o.Oooo0o();
                                } else {
                                    oooO0OO2 = new OooO0OO(o000O0o.OooO00o(oooO00o, oooOO1, 1.0f, new o0000O0O(iOooOooO4), false));
                                }
                            }
                            oooO00o.OooOOo0();
                            break;
                        case 2:
                            oooO0oOooO0OO2 = o000000.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 3:
                            gradientType2 = oooO00o.OooOooO() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            oooOO0OooO0Oo4 = o000000.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 5:
                            oooOO0OooO0Oo5 = o000000.OooO0Oo(oooO00o, oooOO1);
                            break;
                        case 6:
                            OooO0O1 = o000000.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[oooO00o.OooOooO() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[oooO00o.OooOooO() - 1];
                            break;
                        case 9:
                            fOooOo = (float) oooO00o.OooOo();
                            break;
                        case 10:
                            zOooOo5 = oooO00o.OooOo0();
                            break;
                        case 11:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo00()) {
                                oooO00o.OooO0OO();
                                OooO0O0 OooO0O2 = null;
                                String strOooo00o7 = null;
                                while (oooO00o.OooOo00()) {
                                    int iOooo0OO7 = oooO00o.Oooo0OO(o0000O.f36455OooO0OO);
                                    if (iOooo0OO7 == 0) {
                                        strOooo00o7 = oooO00o.Oooo00o();
                                    } else if (iOooo0OO7 != 1) {
                                        oooO00o.Oooo0o0();
                                        oooO00o.Oooo0o();
                                    } else {
                                        OooO0O2 = o000000.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOo0();
                                if (strOooo00o7.equals("o")) {
                                    oooO0O0 = OooO0O2;
                                } else if (strOooo00o7.equals("d") || strOooo00o7.equals("g")) {
                                    oooOO1.f8734OooOOO = true;
                                    arrayList2.add(OooO0O2);
                                }
                            }
                            oooO00o.OooO0oO();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((OooO0O0) arrayList2.get(0));
                            }
                            break;
                        default:
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                            break;
                    }
                }
                o0oooo0 = new com.airbnb.lottie.model.content.OooO00o(strOooo00o6, gradientType2, oooO0OO2, oooO0oOooO0OO2 == null ? new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(100))) : oooO0oOooO0OO2, oooOO0OooO0Oo4, oooOO0OooO0Oo5, OooO0O1, lineCapType, lineJoinType, fOooOo, arrayList2, oooO0O0, zOooOo5);
                break;
            case "mm":
                JsonReader.OooO00o oooO00o7 = o000O00O.f36477OooO00o;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strOooo00o8 = null;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO8 = oooO00o.Oooo0OO(o000O00O.f36477OooO00o);
                    if (iOooo0OO8 == 0) {
                        strOooo00o8 = oooO00o.Oooo00o();
                    } else if (iOooo0OO8 == 1) {
                        int iOooOooO5 = oooO00o.OooOooO();
                        if (iOooOooO5 == 1) {
                            mergePathsMode = MergePaths.MergePathsMode.MERGE;
                        } else if (iOooOooO5 == 2) {
                            mergePathsMode = MergePaths.MergePathsMode.ADD;
                        } else if (iOooOooO5 == 3) {
                            mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                        } else if (iOooOooO5 != 4) {
                            mergePathsMode = iOooOooO5 != 5 ? MergePaths.MergePathsMode.MERGE : MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                        } else {
                            mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                        }
                    } else if (iOooo0OO8 != 2) {
                        oooO00o.Oooo0o0();
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo0 = oooO00o.OooOo0();
                    }
                }
                MergePaths mergePaths = new MergePaths(strOooo00o8, mergePathsMode, zOooOo0);
                oooOO1.OooO00o("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                o0oooo0 = mergePaths;
                break;
            case "rc":
                JsonReader.OooO00o oooO00o8 = o000O0O0.f36478OooO00o;
                String strOooo00o9 = null;
                Oooo000 oooo000OooO0O1 = null;
                o00O00OO.OooOO0 oooOO0OooO0Oo6 = null;
                OooO0O0 OooO0O3 = null;
                boolean zOooOo6 = false;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO9 = oooO00o.Oooo0OO(o000O0O0.f36478OooO00o);
                    if (iOooo0OO9 == 0) {
                        strOooo00o9 = oooO00o.Oooo00o();
                    } else if (iOooo0OO9 == 1) {
                        oooo000OooO0O1 = oo0o0Oo.OooO0O0(oooO00o, oooOO1);
                    } else if (iOooo0OO9 == 2) {
                        oooOO0OooO0Oo6 = o000000.OooO0Oo(oooO00o, oooOO1);
                    } else if (iOooo0OO9 == 3) {
                        OooO0O3 = o000000.OooO0O0(oooO00o, oooOO1, true);
                    } else if (iOooo0OO9 != 4) {
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo6 = oooO00o.OooOo0();
                    }
                }
                o0oooo0 = new oo000o(strOooo00o9, oooo000OooO0O1, oooOO0OooO0Oo6, OooO0O3, zOooOo6);
                break;
            case "rp":
                JsonReader.OooO00o oooO00o9 = o000O.f36467OooO00o;
                String strOooo00o10 = null;
                OooO0O0 OooO0O4 = null;
                OooO0O0 OooO0O5 = null;
                OooOo oooOoOooO00o = null;
                boolean zOooOo7 = false;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO10 = oooO00o.Oooo0OO(o000O.f36467OooO00o);
                    if (iOooo0OO10 == 0) {
                        strOooo00o10 = oooO00o.Oooo00o();
                    } else if (iOooo0OO10 == 1) {
                        OooO0O4 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0OO10 == 2) {
                        OooO0O5 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0OO10 == 3) {
                        oooOoOooO00o = o000OOo.OooO00o(oooO00o, oooOO1);
                    } else if (iOooo0OO10 != 4) {
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo7 = oooO00o.OooOo0();
                    }
                }
                o0oooo0 = new o00oO0o(strOooo00o10, OooO0O4, OooO0O5, oooOoOooO00o, zOooOo7);
                break;
            case "sh":
                JsonReader.OooO00o oooO00o10 = o0O0ooO.f36499OooO00o;
                OooOOO0 oooOOO0 = null;
                String strOooo00o11 = null;
                int iOooOooO6 = 0;
                boolean zOooOo8 = false;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO11 = oooO00o.Oooo0OO(o0O0ooO.f36499OooO00o);
                    if (iOooo0OO11 == 0) {
                        strOooo00o11 = oooO00o.Oooo00o();
                    } else if (iOooo0OO11 == 1) {
                        iOooOooO6 = oooO00o.OooOooO();
                    } else if (iOooo0OO11 == 2) {
                        oooOOO0 = new OooOOO0(o000O0o.OooO00o(oooO00o, oooOO1, OooOOOO.OooO0OO(), o000OOo0.f36487OooO00o, false));
                    } else if (iOooo0OO11 != 3) {
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo8 = oooO00o.OooOo0();
                    }
                }
                o0oooo0 = new o0OO00O(strOooo00o11, iOooOooO6, oooOOO0, zOooOo8);
                break;
            case "sr":
                JsonReader.OooO00o oooO00o11 = o000OO0O.f36484OooO00o;
                String strOooo00o12 = null;
                PolystarShape.Type typeOooO00o = null;
                OooO0O0 OooO0O6 = null;
                Oooo000 oooo000OooO0O2 = null;
                OooO0O0 OooO0O7 = null;
                boolean zOooOo9 = false;
                OooO0O0 OooO0O8 = null;
                OooO0O0 OooO0O9 = null;
                OooO0O0 OooO0O10 = null;
                OooO0O0 OooO0O11 = null;
                while (oooO00o.OooOo00()) {
                    switch (oooO00o.Oooo0OO(o000OO0O.f36484OooO00o)) {
                        case 0:
                            strOooo00o12 = oooO00o.Oooo00o();
                            break;
                        case 1:
                            typeOooO00o = PolystarShape.Type.OooO00o(oooO00o.OooOooO());
                            break;
                        case 2:
                            OooO0O6 = o000000.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 3:
                            oooo000OooO0O2 = oo0o0Oo.OooO0O0(oooO00o, oooOO1);
                            break;
                        case 4:
                            OooO0O7 = o000000.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 5:
                            OooO0O9 = o000000.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 6:
                            OooO0O11 = o000000.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 7:
                            OooO0O8 = o000000.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 8:
                            OooO0O10 = o000000.OooO0O0(oooO00o, oooOO1, false);
                            break;
                        case 9:
                            zOooOo9 = oooO00o.OooOo0();
                            break;
                        default:
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                            break;
                    }
                }
                o0oooo0 = new PolystarShape(strOooo00o12, typeOooO00o, OooO0O6, oooo000OooO0O2, OooO0O7, OooO0O8, OooO0O9, OooO0O10, OooO0O11, zOooOo9);
                break;
            case "st":
                JsonReader.OooO00o oooO00o12 = o00oOoo.f36495OooO00o;
                ArrayList arrayList3 = new ArrayList();
                OooO0o oooO0oOooO0OO3 = null;
                String strOooo00o13 = null;
                OooO0O0 oooO0O1 = null;
                o00O00OO.OooO00o OooO00o3 = null;
                boolean zOooOo10 = false;
                OooO0O0 OooO0O12 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                float fOooOo2 = 0.0f;
                while (oooO00o.OooOo00()) {
                    switch (oooO00o.Oooo0OO(o00oOoo.f36495OooO00o)) {
                        case 0:
                            strOooo00o13 = oooO00o.Oooo00o();
                            break;
                        case 1:
                            OooO00o3 = o000000.OooO00o(oooO00o, oooOO1);
                            break;
                        case 2:
                            OooO0O12 = o000000.OooO0O0(oooO00o, oooOO1, true);
                            break;
                        case 3:
                            oooO0oOooO0OO3 = o000000.OooO0OO(oooO00o, oooOO1);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[oooO00o.OooOooO() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[oooO00o.OooOooO() - 1];
                            break;
                        case 6:
                            fOooOo2 = (float) oooO00o.OooOo();
                            break;
                        case 7:
                            zOooOo10 = oooO00o.OooOo0();
                            break;
                        case 8:
                            oooO00o.OooO00o();
                            while (oooO00o.OooOo00()) {
                                oooO00o.OooO0OO();
                                OooO0O0 OooO0O13 = null;
                                String strOooo00o14 = null;
                                while (oooO00o.OooOo00()) {
                                    int iOooo0OO12 = oooO00o.Oooo0OO(o00oOoo.f36496OooO0O0);
                                    if (iOooo0OO12 == 0) {
                                        strOooo00o14 = oooO00o.Oooo00o();
                                    } else if (iOooo0OO12 != 1) {
                                        oooO00o.Oooo0o0();
                                        oooO00o.Oooo0o();
                                    } else {
                                        OooO0O13 = o000000.OooO0O0(oooO00o, oooOO1, true);
                                    }
                                }
                                oooO00o.OooOOo0();
                                strOooo00o14.getClass();
                                strOooo00o14.hashCode();
                                switch (strOooo00o14) {
                                    case "d":
                                    case "g":
                                        oooOO1.f8734OooOOO = true;
                                        arrayList3.add(OooO0O13);
                                        break;
                                    case "o":
                                        oooO0O1 = OooO0O13;
                                        break;
                                }
                            }
                            oooO00o.OooO0oO();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((OooO0O0) arrayList3.get(0));
                            }
                            break;
                        default:
                            oooO00o.Oooo0o();
                            break;
                    }
                }
                o0oooo0 = new ShapeStroke(strOooo00o13, oooO0O1, arrayList3, OooO00o3, oooO0oOooO0OO3 == null ? new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(100))) : oooO0oOooO0OO3, OooO0O12, lineCapType2, lineJoinType2, fOooOo2, zOooOo10);
                break;
            case "tm":
                JsonReader.OooO00o oooO00o13 = o00O000.f36493OooO00o;
                String strOooo00o15 = null;
                ShapeTrimPath.Type type2 = null;
                OooO0O0 OooO0O14 = null;
                OooO0O0 OooO0O15 = null;
                boolean zOooOo11 = false;
                OooO0O0 OooO0O16 = null;
                while (oooO00o.OooOo00()) {
                    int iOooo0OO13 = oooO00o.Oooo0OO(o00O000.f36493OooO00o);
                    if (iOooo0OO13 == 0) {
                        OooO0O14 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0OO13 == 1) {
                        OooO0O15 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0OO13 == 2) {
                        OooO0O16 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    } else if (iOooo0OO13 == 3) {
                        strOooo00o15 = oooO00o.Oooo00o();
                    } else if (iOooo0OO13 == 4) {
                        int iOooOooO7 = oooO00o.OooOooO();
                        if (iOooOooO7 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (iOooOooO7 != 2) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown trim path type ", iOooOooO7));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type2 = type;
                    } else if (iOooo0OO13 != 5) {
                        oooO00o.Oooo0o();
                    } else {
                        zOooOo11 = oooO00o.OooOo0();
                    }
                }
                o0oooo0 = new ShapeTrimPath(strOooo00o15, type2, OooO0O14, OooO0O15, OooO0O16, zOooOo11);
                break;
            case "tr":
                o0oooo0 = o000OOo.OooO00o(oooO00o, oooOO1);
                break;
            default:
                o00O0.OooOO0.OooO0O0("Unknown shape type ".concat(strOooo00o));
                o0oooo0 = null;
                break;
        }
        while (oooO00o.OooOo00()) {
            oooO00o.Oooo0o();
        }
        oooO00o.OooOOo0();
        return o0oooo0;
    }
}
