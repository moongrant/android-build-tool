package p127o00O0oO;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.OooO00o;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p123o00O0o0.OooOO0;
import p123o00O0o0.OooOOO;
import p123o00O0o0.OooOOO0;
import p123o00O0o0.OooOo00;
import p123o00O0o0.Oooo000;
import p123o00O0o0.o00O0O;
import p123o00O0o0.o00Oo0;
import p125o00O0o0O.o0000;
import p125o00O0o0O.o00000;
import p125o00O0o0O.o00000O0;
import p125o00O0o0O.o00000OO;
import p125o00O0o0O.o0000Ooo;
import p125o00O0o0O.o000OOo;
import p125o00O0o0O.o0O0O00;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31073OooO00o = JsonReader.OooO00o.OooO00o("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x0202  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    @Nullable
    public static o000OOo OooO00o(JsonReader jsonReader, OooOO0O oooOO0O) throws IOException {
        String strOooOoOO;
        o000OOo o0o0o00;
        byte b;
        ShapeTrimPath.Type type;
        jsonReader.OooO0O0();
        int iOooOo0O = 2;
        while (true) {
            if (!jsonReader.OooOOO()) {
                strOooOoOO = null;
                break;
            }
            int iOooo0 = jsonReader.Oooo0(f31073OooO00o);
            if (iOooo0 == 0) {
                strOooOoOO = jsonReader.OooOoOO();
                break;
            }
            if (iOooo0 != 1) {
                jsonReader.Oooo0OO();
                jsonReader.Oooo0o();
            } else {
                iOooOo0O = jsonReader.OooOo0O();
            }
        }
        if (strOooOoOO == null) {
            return null;
        }
        boolean zOooOOo = false;
        switch (strOooOoOO) {
            case "el":
                JsonReader.OooO00o oooO00o = o000OOo.f31117OooO00o;
                boolean z = iOooOo0O == 3;
                String strOooOoOO2 = null;
                o00Oo0<PointF, PointF> o00oo0OooO0O0 = null;
                OooOo00 oooOo00OooO0o0 = null;
                boolean zOooOOo2 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo1 = jsonReader.Oooo0(o000OOo.f31117OooO00o);
                    if (iOooo1 == 0) {
                        strOooOoOO2 = jsonReader.OooOoOO();
                    } else if (iOooo1 == 1) {
                        o00oo0OooO0O0 = o0OOO0o.OooO0O0(jsonReader, oooOO0O);
                    } else if (iOooo1 == 2) {
                        oooOo00OooO0o0 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                    } else if (iOooo1 == 3) {
                        zOooOOo2 = jsonReader.OooOOo();
                    } else if (iOooo1 != 4) {
                        jsonReader.Oooo0OO();
                        jsonReader.Oooo0o();
                    } else {
                        z = jsonReader.OooOo0O() == 3;
                    }
                }
                o0o0o00 = new o0O0O00(strOooOoOO2, o00oo0OooO0O0, oooOo00OooO0o0, z, zOooOOo2);
                break;
            case "fl":
                JsonReader.OooO00o oooO00o2 = o000O.f31101OooO00o;
                int iOooOo0O2 = 1;
                OooOOO oooOOO = null;
                String strOooOoOO3 = null;
                OooOO0 oooOO0OooO0O0 = null;
                boolean zOooOOo3 = false;
                boolean zOooOOo4 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo2 = jsonReader.Oooo0(o000O.f31101OooO00o);
                    if (iOooo2 == 0) {
                        strOooOoOO3 = jsonReader.OooOoOO();
                    } else if (iOooo2 == 1) {
                        oooOO0OooO0O0 = oo0o0Oo.OooO0O0(jsonReader, oooOO0O);
                    } else if (iOooo2 == 2) {
                        oooOOO = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                    } else if (iOooo2 == 3) {
                        zOooOOo3 = jsonReader.OooOOo();
                    } else if (iOooo2 == 4) {
                        iOooOo0O2 = jsonReader.OooOo0O();
                    } else if (iOooo2 != 5) {
                        jsonReader.Oooo0OO();
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo4 = jsonReader.OooOOo();
                    }
                }
                if (oooOOO == null) {
                    oooOOO = new OooOOO(Collections.singletonList(new p131o00O0oo0.o000OOo(100)));
                }
                o0o0o00 = new o00000OO(strOooOoOO3, zOooOOo3, iOooOo0O2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, oooOO0OooO0O0, oooOOO, zOooOOo4);
                break;
            case "gf":
                JsonReader.OooO00o oooO00o3 = o0000oo.f31099OooO00o;
                OooOOO oooOOOOooO0Oo = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String strOooOoOO4 = null;
                GradientType gradientType = null;
                OooOOO0 oooOOO0 = null;
                OooOo00 oooOo00OooO0o1 = null;
                OooOo00 oooOo00OooO0o2 = null;
                boolean zOooOOo5 = false;
                while (jsonReader.OooOOO()) {
                    switch (jsonReader.Oooo0(o0000oo.f31099OooO00o)) {
                        case 0:
                            strOooOoOO4 = jsonReader.OooOoOO();
                            break;
                        case 1:
                            jsonReader.OooO0O0();
                            int iOooOo0O3 = -1;
                            while (jsonReader.OooOOO()) {
                                int iOooo3 = jsonReader.Oooo0(o0000oo.f31100OooO0O0);
                                if (iOooo3 == 0) {
                                    iOooOo0O3 = jsonReader.OooOo0O();
                                } else if (iOooo3 != 1) {
                                    jsonReader.Oooo0OO();
                                    jsonReader.Oooo0o();
                                } else {
                                    oooOOO0 = new OooOOO0(oo0o0Oo.OooO00o(jsonReader, oooOO0O, new o0000O00(iOooOo0O3)));
                                }
                            }
                            jsonReader.OooO0o();
                            break;
                        case 2:
                            oooOOOOooO0Oo = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                            break;
                        case 3:
                            gradientType = jsonReader.OooOo0O() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            oooOo00OooO0o1 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                            break;
                        case 5:
                            oooOo00OooO0o2 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                            break;
                        case 6:
                            fillType = jsonReader.OooOo0O() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zOooOOo5 = jsonReader.OooOOo();
                            break;
                        default:
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                            break;
                    }
                }
                o0o0o00 = new p125o00O0o0O.o000000O(strOooOoOO4, gradientType, fillType, oooOOO0, oooOOOOooO0Oo == null ? new OooOOO(Collections.singletonList(new p131o00O0oo0.o000OOo(100))) : oooOOOOooO0Oo, oooOo00OooO0o1, oooOo00OooO0o2, zOooOOo5);
                break;
            case "gr":
                JsonReader.OooO00o oooO00o4 = o000OO00.f31115OooO00o;
                ArrayList arrayList = new ArrayList();
                String strOooOoOO5 = null;
                while (jsonReader.OooOOO()) {
                    int iOooo4 = jsonReader.Oooo0(o000OO00.f31115OooO00o);
                    if (iOooo4 == 0) {
                        strOooOoOO5 = jsonReader.OooOoOO();
                    } else if (iOooo4 == 1) {
                        zOooOOo = jsonReader.OooOOo();
                    } else if (iOooo4 != 2) {
                        jsonReader.Oooo0o();
                    } else {
                        jsonReader.OooO00o();
                        while (jsonReader.OooOOO()) {
                            o000OOo o000oooOooO00o = OooO00o(jsonReader, oooOO0O);
                            if (o000oooOooO00o != null) {
                                arrayList.add(o000oooOooO00o);
                            }
                        }
                        jsonReader.OooO0Oo();
                    }
                }
                o0o0o00 = new o0000Ooo(strOooOoOO5, arrayList, zOooOOo);
                break;
            case "gs":
                JsonReader.OooO00o oooO00o5 = o0000O0.f31091OooO00o;
                ArrayList arrayList2 = new ArrayList();
                OooOOO oooOOOOooO0Oo2 = null;
                OooOOO0 oooOOO1 = null;
                OooOo00 oooOo00OooO0o3 = null;
                OooOo00 oooOo00OooO0o4 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                p123o00O0o0.OooOO0O oooOO0O2 = null;
                float fOooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                boolean zOooOOo6 = false;
                String strOooOoOO6 = null;
                GradientType gradientType2 = null;
                while (jsonReader.OooOOO()) {
                    switch (jsonReader.Oooo0(o0000O0.f31091OooO00o)) {
                        case 0:
                            strOooOoOO6 = jsonReader.OooOoOO();
                            break;
                        case 1:
                            jsonReader.OooO0O0();
                            int iOooOo0O4 = -1;
                            while (jsonReader.OooOOO()) {
                                int iOooo5 = jsonReader.Oooo0(o0000O0.f31092OooO0O0);
                                if (iOooo5 == 0) {
                                    iOooOo0O4 = jsonReader.OooOo0O();
                                } else if (iOooo5 != 1) {
                                    jsonReader.Oooo0OO();
                                    jsonReader.Oooo0o();
                                } else {
                                    oooOOO1 = new OooOOO0(oo0o0Oo.OooO00o(jsonReader, oooOO0O, new o0000O00(iOooOo0O4)));
                                }
                            }
                            jsonReader.OooO0o();
                            break;
                        case 2:
                            oooOOOOooO0Oo2 = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                            break;
                        case 3:
                            gradientType2 = jsonReader.OooOo0O() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            oooOo00OooO0o3 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                            break;
                        case 5:
                            oooOo00OooO0o4 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                            break;
                        case 6:
                            oooOO0OOooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[jsonReader.OooOo0O() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.OooOo0O() - 1];
                            break;
                        case 9:
                            fOooOOoo = (float) jsonReader.OooOOoo();
                            break;
                        case 10:
                            zOooOOo6 = jsonReader.OooOOo();
                            break;
                        case 11:
                            jsonReader.OooO00o();
                            while (jsonReader.OooOOO()) {
                                jsonReader.OooO0O0();
                                p123o00O0o0.OooOO0O oooOO0OOooO0OO2 = null;
                                String strOooOoOO7 = null;
                                while (jsonReader.OooOOO()) {
                                    int iOooo6 = jsonReader.Oooo0(o0000O0.f31093OooO0OO);
                                    if (iOooo6 == 0) {
                                        strOooOoOO7 = jsonReader.OooOoOO();
                                    } else if (iOooo6 != 1) {
                                        jsonReader.Oooo0OO();
                                        jsonReader.Oooo0o();
                                    } else {
                                        oooOO0OOooO0OO2 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                    }
                                }
                                jsonReader.OooO0o();
                                if (strOooOoOO7.equals("o")) {
                                    oooOO0O2 = oooOO0OOooO0OO2;
                                } else if (strOooOoOO7.equals("d") || strOooOoOO7.equals("g")) {
                                    oooOO0O.f10052OooOOO = true;
                                    arrayList2.add(oooOO0OOooO0OO2);
                                }
                            }
                            jsonReader.OooO0Oo();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((p123o00O0o0.OooOO0O) arrayList2.get(0));
                            }
                            break;
                        default:
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                            break;
                    }
                }
                o0o0o00 = new OooO00o(strOooOoOO6, gradientType2, oooOOO1, oooOOOOooO0Oo2 == null ? new OooOOO(Collections.singletonList(new p131o00O0oo0.o000OOo(100))) : oooOOOOooO0Oo2, oooOo00OooO0o3, oooOo00OooO0o4, oooOO0OOooO0OO, lineCapType, lineJoinType, fOooOOoo, arrayList2, oooOO0O2, zOooOOo6);
                break;
            case "mm":
                JsonReader.OooO00o oooO00o6 = o000O0o.f31112OooO00o;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strOooOoOO8 = null;
                while (jsonReader.OooOOO()) {
                    int iOooo7 = jsonReader.Oooo0(o000O0o.f31112OooO00o);
                    if (iOooo7 == 0) {
                        strOooOoOO8 = jsonReader.OooOoOO();
                    } else if (iOooo7 == 1) {
                        int iOooOo0O5 = jsonReader.OooOo0O();
                        if (iOooOo0O5 == 1) {
                            mergePathsMode = MergePaths.MergePathsMode.MERGE;
                        } else if (iOooOo0O5 == 2) {
                            mergePathsMode = MergePaths.MergePathsMode.ADD;
                        } else if (iOooOo0O5 == 3) {
                            mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                        } else if (iOooOo0O5 != 4) {
                            mergePathsMode = iOooOo0O5 != 5 ? MergePaths.MergePathsMode.MERGE : MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                        } else {
                            mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                        }
                    } else if (iOooo7 != 2) {
                        jsonReader.Oooo0OO();
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo = jsonReader.OooOOo();
                    }
                }
                MergePaths mergePaths = new MergePaths(strOooOoOO8, mergePathsMode, zOooOOo);
                oooOO0O.OooO00o("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                o0o0o00 = mergePaths;
                break;
            case "rc":
                JsonReader.OooO00o oooO00o7 = o000O0.f31102OooO00o;
                String strOooOoOO9 = null;
                o00Oo0<PointF, PointF> o00oo0OooO0O1 = null;
                OooOo00 oooOo00OooO0o5 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO3 = null;
                boolean zOooOOo7 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo8 = jsonReader.Oooo0(o000O0.f31102OooO00o);
                    if (iOooo8 == 0) {
                        strOooOoOO9 = jsonReader.OooOoOO();
                    } else if (iOooo8 == 1) {
                        o00oo0OooO0O1 = o0OOO0o.OooO0O0(jsonReader, oooOO0O);
                    } else if (iOooo8 == 2) {
                        oooOo00OooO0o5 = oo0o0Oo.OooO0o0(jsonReader, oooOO0O);
                    } else if (iOooo8 == 3) {
                        oooOO0OOooO0OO3 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                    } else if (iOooo8 != 4) {
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo7 = jsonReader.OooOOo();
                    }
                }
                o0o0o00 = new o00000(strOooOoOO9, o00oo0OooO0O1, oooOo00OooO0o5, oooOO0OOooO0OO3, zOooOOo7);
                break;
            case "rp":
                JsonReader.OooO00o oooO00o8 = o000O0Oo.f31111OooO00o;
                String strOooOoOO10 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO4 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO5 = null;
                o00O0O o00o0oOooO00o = null;
                boolean zOooOOo8 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo9 = jsonReader.Oooo0(o000O0Oo.f31111OooO00o);
                    if (iOooo9 == 0) {
                        strOooOoOO10 = jsonReader.OooOoOO();
                    } else if (iOooo9 == 1) {
                        oooOO0OOooO0OO4 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                    } else if (iOooo9 == 2) {
                        oooOO0OOooO0OO5 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                    } else if (iOooo9 == 3) {
                        o00o0oOooO00o = o0OO00O.OooO00o(jsonReader, oooOO0O);
                    } else if (iOooo9 != 4) {
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo8 = jsonReader.OooOOo();
                    }
                }
                o0o0o00 = new o00000O0(strOooOoOO10, oooOO0OOooO0OO4, oooOO0OOooO0OO5, o00o0oOooO00o, zOooOOo8);
                break;
            case "sh":
                JsonReader.OooO00o oooO00o9 = o000OOo0.f31118OooO00o;
                Oooo000 oooo000 = null;
                int iOooOo0O6 = 0;
                String strOooOoOO11 = null;
                boolean zOooOOo9 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo10 = jsonReader.Oooo0(o000OOo0.f31118OooO00o);
                    if (iOooo10 == 0) {
                        strOooOoOO11 = jsonReader.OooOoOO();
                    } else if (iOooo10 == 1) {
                        iOooOo0O6 = jsonReader.OooOo0O();
                    } else if (iOooo10 == 2) {
                        oooo000 = new Oooo000(o0000OO0.OooO00o(jsonReader, oooOO0O, o000O0Oo.OooO0OO(), o000O0O0.f31109OooO00o, false));
                    } else if (iOooo10 != 3) {
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo9 = jsonReader.OooOOo();
                    }
                }
                o0o0o00 = new o0000(strOooOoOO11, iOooOo0O6, oooo000, zOooOOo9);
                break;
            case "sr":
                JsonReader.OooO00o oooO00o10 = o000O00O.f31108OooO00o;
                String strOooOoOO12 = null;
                PolystarShape.Type typeOooO00o = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO6 = null;
                o00Oo0<PointF, PointF> o00oo0OooO0O2 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO7 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO8 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO9 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO10 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO11 = null;
                boolean zOooOOo10 = false;
                while (jsonReader.OooOOO()) {
                    switch (jsonReader.Oooo0(o000O00O.f31108OooO00o)) {
                        case 0:
                            strOooOoOO12 = jsonReader.OooOoOO();
                            break;
                        case 1:
                            typeOooO00o = PolystarShape.Type.OooO00o(jsonReader.OooOo0O());
                            break;
                        case 2:
                            oooOO0OOooO0OO6 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                            break;
                        case 3:
                            o00oo0OooO0O2 = o0OOO0o.OooO0O0(jsonReader, oooOO0O);
                            break;
                        case 4:
                            oooOO0OOooO0OO7 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                            break;
                        case 5:
                            oooOO0OOooO0OO9 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                            break;
                        case 6:
                            oooOO0OOooO0OO11 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                            break;
                        case 7:
                            oooOO0OOooO0OO8 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                            break;
                        case 8:
                            oooOO0OOooO0OO10 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                            break;
                        case 9:
                            zOooOOo10 = jsonReader.OooOOo();
                            break;
                        default:
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                            break;
                    }
                }
                o0o0o00 = new PolystarShape(strOooOoOO12, typeOooO00o, oooOO0OOooO0OO6, o00oo0OooO0O2, oooOO0OOooO0OO7, oooOO0OOooO0OO8, oooOO0OOooO0OO9, oooOO0OOooO0OO10, oooOO0OOooO0OO11, zOooOOo10);
                break;
            case "st":
                JsonReader.OooO00o oooO00o11 = o00.f31063OooO00o;
                ArrayList arrayList3 = new ArrayList();
                OooOOO oooOOOOooO0Oo3 = null;
                p123o00O0o0.OooOO0O oooOO0O3 = null;
                OooOO0 oooOO0OooO0O1 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO12 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                float fOooOOoo2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                boolean zOooOOo11 = false;
                String strOooOoOO13 = null;
                while (jsonReader.OooOOO()) {
                    switch (jsonReader.Oooo0(o00.f31063OooO00o)) {
                        case 0:
                            strOooOoOO13 = jsonReader.OooOoOO();
                            break;
                        case 1:
                            oooOO0OooO0O1 = oo0o0Oo.OooO0O0(jsonReader, oooOO0O);
                            break;
                        case 2:
                            oooOO0OOooO0OO12 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                            break;
                        case 3:
                            oooOOOOooO0Oo3 = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[jsonReader.OooOo0O() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[jsonReader.OooOo0O() - 1];
                            break;
                        case 6:
                            fOooOOoo2 = (float) jsonReader.OooOOoo();
                            break;
                        case 7:
                            zOooOOo11 = jsonReader.OooOOo();
                            break;
                        case 8:
                            jsonReader.OooO00o();
                            while (jsonReader.OooOOO()) {
                                jsonReader.OooO0O0();
                                p123o00O0o0.OooOO0O oooOO0OOooO0OO13 = null;
                                String strOooOoOO14 = null;
                                while (jsonReader.OooOOO()) {
                                    int iOooo11 = jsonReader.Oooo0(o00.f31064OooO0O0);
                                    if (iOooo11 == 0) {
                                        strOooOoOO14 = jsonReader.OooOoOO();
                                    } else if (iOooo11 != 1) {
                                        jsonReader.Oooo0OO();
                                        jsonReader.Oooo0o();
                                    } else {
                                        oooOO0OOooO0OO13 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                                    }
                                }
                                jsonReader.OooO0o();
                                Objects.requireNonNull(strOooOoOO14);
                                int iHashCode = strOooOoOO14.hashCode();
                                if (iHashCode != 100) {
                                    if (iHashCode != 103) {
                                        if (iHashCode == 111 && strOooOoOO14.equals("o")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strOooOoOO14.equals("g")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strOooOoOO14.equals("d")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                if (b == 0 || b == 1) {
                                    oooOO0O.f10052OooOOO = true;
                                    arrayList3.add(oooOO0OOooO0OO13);
                                } else if (b == 2) {
                                    oooOO0O3 = oooOO0OOooO0OO13;
                                }
                            }
                            jsonReader.OooO0Oo();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((p123o00O0o0.OooOO0O) arrayList3.get(0));
                            }
                            break;
                        default:
                            jsonReader.Oooo0o();
                            break;
                    }
                }
                o0o0o00 = new ShapeStroke(strOooOoOO13, oooOO0O3, arrayList3, oooOO0OooO0O1, oooOOOOooO0Oo3 == null ? new OooOOO(Collections.singletonList(new p131o00O0oo0.o000OOo(100))) : oooOOOOooO0Oo3, oooOO0OOooO0OO12, lineCapType2, lineJoinType2, fOooOOoo2, zOooOOo11);
                break;
            case "tm":
                JsonReader.OooO00o oooO00o12 = o00O0000.f31120OooO00o;
                String strOooOoOO15 = null;
                ShapeTrimPath.Type type2 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO14 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO15 = null;
                p123o00O0o0.OooOO0O oooOO0OOooO0OO16 = null;
                boolean zOooOOo12 = false;
                while (jsonReader.OooOOO()) {
                    int iOooo12 = jsonReader.Oooo0(o00O0000.f31120OooO00o);
                    if (iOooo12 == 0) {
                        oooOO0OOooO0OO14 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                    } else if (iOooo12 == 1) {
                        oooOO0OOooO0OO15 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                    } else if (iOooo12 == 2) {
                        oooOO0OOooO0OO16 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, false);
                    } else if (iOooo12 == 3) {
                        strOooOoOO15 = jsonReader.OooOoOO();
                    } else if (iOooo12 == 4) {
                        int iOooOo0O7 = jsonReader.OooOo0O();
                        if (iOooOo0O7 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (iOooOo0O7 != 2) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown trim path type ", iOooOo0O7));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type2 = type;
                    } else if (iOooo12 != 5) {
                        jsonReader.Oooo0o();
                    } else {
                        zOooOOo12 = jsonReader.OooOOo();
                    }
                }
                o0o0o00 = new ShapeTrimPath(strOooOoOO15, type2, oooOO0OOooO0OO14, oooOO0OOooO0OO15, oooOO0OOooO0OO16, zOooOOo12);
                break;
            case "tr":
                o0o0o00 = o0OO00O.OooO00o(jsonReader, oooOO0O);
                break;
            default:
                o000Oo0.OooO0OO("Unknown shape type " + strOooOoOO);
                o0o0o00 = null;
                break;
        }
        while (jsonReader.OooOOO()) {
            jsonReader.Oooo0o();
        }
        jsonReader.OooO0o();
        return o0o0o00;
    }
}
