package com.opensource.svgaplayer.entities;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSVGAVideoShapeEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAVideoShapeEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoShapeEntity\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n32#2,2:357\n1#3:359\n*S KotlinDebug\n*F\n+ 1 SVGAVideoShapeEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoShapeEntity\n*L\n107#1:357,2\n*E\n"})
public final class SVGAVideoShapeEntity {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Type f20802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public HashMap f20803OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO00o f20804OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Matrix f20805OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Path f20806OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f20807OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f20808OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f20809OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f20811OooO0o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public String f20810OooO0Oo = "butt";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public String f20812OooO0o0 = "miter";

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public float[] f20813OooO0oO = new float[0];
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ShapeEntity.ShapeType.values().length];
            try {
                iArr[ShapeEntity.ShapeType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeEntity.ShapeType.RECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeEntity.ShapeType.ELLIPSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeEntity.ShapeType.KEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShapeEntity.ShapeStyle.LineCap.values().length];
            try {
                iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ShapeEntity.ShapeStyle.LineJoin.values().length];
            try {
                iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "", "shape", "rect", "ellipse", "keep", "com.opensource.svgaplayer"}, k = 1, mv = {1, 8, 0})
    public enum Type {
        shape,
        rect,
        ellipse,
        keep
    }

    public SVGAVideoShapeEntity(@NotNull JSONObject obj) throws JSONException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Type type = Type.shape;
        this.f20802OooO00o = type;
        String strOptString = obj.optString("type");
        if (strOptString != null) {
            if (StringsKt__StringsJVMKt.equals(strOptString, "shape", true)) {
                this.f20802OooO00o = type;
            } else if (StringsKt__StringsJVMKt.equals(strOptString, "rect", true)) {
                this.f20802OooO00o = Type.rect;
            } else if (StringsKt__StringsJVMKt.equals(strOptString, "ellipse", true)) {
                this.f20802OooO00o = Type.ellipse;
            } else if (StringsKt__StringsJVMKt.equals(strOptString, "keep", true)) {
                this.f20802OooO00o = Type.keep;
            }
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = obj.optJSONObject("args");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "values.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObjectOptJSONObject.get(next);
                if (obj2 != null) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
                    map.put(next, obj2);
                }
            }
            this.f20803OooO0O0 = map;
        }
        JSONObject jSONObjectOptJSONObject2 = obj.optJSONObject("styles");
        if (jSONObjectOptJSONObject2 != null) {
            OooO00o oooO00o = new OooO00o();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("fill");
            if (jSONArrayOptJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "optJSONArray(\"fill\")");
                if (jSONArrayOptJSONArray.length() == 4) {
                    double dOooO0O0 = OooO0O0(jSONArrayOptJSONArray);
                    oooO00o.f20807OooO00o = Color.argb((int) (jSONArrayOptJSONArray.optDouble(3) * ((double) (jSONArrayOptJSONArray.optDouble(3) <= 1.0d ? 255.0f : 1.0f))), (int) (jSONArrayOptJSONArray.optDouble(0) * dOooO0O0), (int) (jSONArrayOptJSONArray.optDouble(1) * dOooO0O0), (int) (dOooO0O0 * jSONArrayOptJSONArray.optDouble(2)));
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("stroke");
            if (jSONArrayOptJSONArray2 != null) {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray2, "optJSONArray(\"stroke\")");
                if (jSONArrayOptJSONArray2.length() == 4) {
                    double dOooO0O1 = OooO0O0(jSONArrayOptJSONArray2);
                    oooO00o.f20808OooO0O0 = Color.argb((int) (jSONArrayOptJSONArray2.optDouble(3) * ((double) (jSONArrayOptJSONArray2.optDouble(3) <= 1.0d ? 255.0f : 1.0f))), (int) (jSONArrayOptJSONArray2.optDouble(0) * dOooO0O1), (int) (jSONArrayOptJSONArray2.optDouble(1) * dOooO0O1), (int) (dOooO0O1 * jSONArrayOptJSONArray2.optDouble(2)));
                }
            }
            oooO00o.f20809OooO0OO = (float) jSONObjectOptJSONObject2.optDouble("strokeWidth", 0.0d);
            String strOptString2 = jSONObjectOptJSONObject2.optString("lineCap", "butt");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "it.optString(\"lineCap\", \"butt\")");
            Intrinsics.checkNotNullParameter(strOptString2, "<set-?>");
            oooO00o.f20810OooO0Oo = strOptString2;
            String strOptString3 = jSONObjectOptJSONObject2.optString("lineJoin", "miter");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "it.optString(\"lineJoin\", \"miter\")");
            Intrinsics.checkNotNullParameter(strOptString3, "<set-?>");
            oooO00o.f20812OooO0o0 = strOptString3;
            oooO00o.f20811OooO0o = jSONObjectOptJSONObject2.optInt("miterLimit", 0);
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("lineDash");
            if (jSONArrayOptJSONArray3 != null) {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray3, "optJSONArray(\"lineDash\")");
                float[] fArr = new float[jSONArrayOptJSONArray3.length()];
                Intrinsics.checkNotNullParameter(fArr, "<set-?>");
                oooO00o.f20813OooO0oO = fArr;
                int length = jSONArrayOptJSONArray3.length();
                for (int i = 0; i < length; i++) {
                    oooO00o.f20813OooO0oO[i] = (float) jSONArrayOptJSONArray3.optDouble(i, 0.0d);
                }
            }
            this.f20804OooO0OO = oooO00o;
        }
        JSONObject jSONObjectOptJSONObject3 = obj.optJSONObject("transform");
        if (jSONObjectOptJSONObject3 != null) {
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{(float) jSONObjectOptJSONObject3.optDouble("a", 1.0d), (float) jSONObjectOptJSONObject3.optDouble("c", 0.0d), (float) jSONObjectOptJSONObject3.optDouble("tx", 0.0d), (float) jSONObjectOptJSONObject3.optDouble("b", 0.0d), (float) jSONObjectOptJSONObject3.optDouble("d", 1.0d), (float) jSONObjectOptJSONObject3.optDouble("ty", 0.0d), 0.0f, 0.0f, 1.0f});
            this.f20805OooO0Oo = matrix;
        }
    }

    public static float OooO00o(ShapeEntity.ShapeStyle.RGBAColor rGBAColor) {
        Float f = rGBAColor.r;
        if ((f == null ? 0.0f : f.floatValue()) > 1.0f) {
            return 1.0f;
        }
        Float f2 = rGBAColor.g;
        if ((f2 == null ? 0.0f : f2.floatValue()) > 1.0f) {
            return 1.0f;
        }
        Float f3 = rGBAColor.b;
        return (f3 != null ? f3.floatValue() : 0.0f) <= 1.0f ? 255.0f : 1.0f;
    }

    public static float OooO0O0(JSONArray jSONArray) {
        return (jSONArray.optDouble(0) > 1.0d || jSONArray.optDouble(1) > 1.0d || jSONArray.optDouble(2) > 1.0d) ? 1.0f : 255.0f;
    }

    public SVGAVideoShapeEntity(@NotNull ShapeEntity obj) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        float fFloatValue7;
        float fFloatValue8;
        float fFloatValue9;
        float fFloatValue10;
        float fFloatValue11;
        float fFloatValue12;
        float fFloatValue13;
        float fFloatValue14;
        float fFloatValue15;
        float fFloatValue16;
        String d;
        Intrinsics.checkNotNullParameter(obj, "obj");
        Type type = Type.shape;
        this.f20802OooO00o = type;
        ShapeEntity.ShapeType shapeType = obj.type;
        if (shapeType != null) {
            int i = OooO0O0.$EnumSwitchMapping$0[shapeType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    type = Type.rect;
                } else if (i == 3) {
                    type = Type.ellipse;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = Type.keep;
                }
            }
            this.f20802OooO00o = type;
        }
        HashMap map = new HashMap();
        ShapeEntity.ShapeArgs shapeArgs = obj.shape;
        if (shapeArgs != null && (d = shapeArgs.d) != null) {
            Intrinsics.checkNotNullExpressionValue(d, "d");
            map.put("d", d);
        }
        ShapeEntity.EllipseArgs ellipseArgs = obj.ellipse;
        if (ellipseArgs != null) {
            Float f = ellipseArgs.x;
            if (f == null) {
                fFloatValue13 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f, "it.x ?: 0.0f");
                fFloatValue13 = f.floatValue();
            }
            map.put("x", Float.valueOf(fFloatValue13));
            Float f2 = ellipseArgs.y;
            if (f2 == null) {
                fFloatValue14 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f2, "it.y ?: 0.0f");
                fFloatValue14 = f2.floatValue();
            }
            map.put("y", Float.valueOf(fFloatValue14));
            Float f3 = ellipseArgs.radiusX;
            if (f3 == null) {
                fFloatValue15 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f3, "it.radiusX ?: 0.0f");
                fFloatValue15 = f3.floatValue();
            }
            map.put("radiusX", Float.valueOf(fFloatValue15));
            Float f4 = ellipseArgs.radiusY;
            if (f4 == null) {
                fFloatValue16 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f4, "it.radiusY ?: 0.0f");
                fFloatValue16 = f4.floatValue();
            }
            map.put("radiusY", Float.valueOf(fFloatValue16));
        }
        ShapeEntity.RectArgs rectArgs = obj.rect;
        if (rectArgs != null) {
            Float f5 = rectArgs.x;
            if (f5 == null) {
                fFloatValue8 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f5, "it.x ?: 0.0f");
                fFloatValue8 = f5.floatValue();
            }
            map.put("x", Float.valueOf(fFloatValue8));
            Float f6 = rectArgs.y;
            if (f6 == null) {
                fFloatValue9 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f6, "it.y ?: 0.0f");
                fFloatValue9 = f6.floatValue();
            }
            map.put("y", Float.valueOf(fFloatValue9));
            Float f7 = rectArgs.width;
            if (f7 == null) {
                fFloatValue10 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f7, "it.width ?: 0.0f");
                fFloatValue10 = f7.floatValue();
            }
            map.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, Float.valueOf(fFloatValue10));
            Float f8 = rectArgs.height;
            if (f8 == null) {
                fFloatValue11 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f8, "it.height ?: 0.0f");
                fFloatValue11 = f8.floatValue();
            }
            map.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, Float.valueOf(fFloatValue11));
            Float f9 = rectArgs.cornerRadius;
            if (f9 == null) {
                fFloatValue12 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f9, "it.cornerRadius ?: 0.0f");
                fFloatValue12 = f9.floatValue();
            }
            map.put("cornerRadius", Float.valueOf(fFloatValue12));
        }
        this.f20803OooO0O0 = map;
        ShapeEntity.ShapeStyle shapeStyle = obj.styles;
        if (shapeStyle != null) {
            OooO00o oooO00o = new OooO00o();
            ShapeEntity.ShapeStyle.RGBAColor fill = shapeStyle.fill;
            if (fill != null) {
                Intrinsics.checkNotNullExpressionValue(fill, "fill");
                float fOooO00o = OooO00o(fill);
                Float f10 = fill.a;
                Intrinsics.checkNotNullExpressionValue(f10, "color.a");
                float f11 = f10.floatValue() <= 1.0f ? 255.0f : 1.0f;
                Float f12 = fill.a;
                int iFloatValue = (int) ((f12 != null ? f12.floatValue() : 0.0f) * f11);
                Float f13 = fill.r;
                int iFloatValue2 = (int) ((f13 != null ? f13.floatValue() : 0.0f) * fOooO00o);
                Float f14 = fill.g;
                int iFloatValue3 = (int) ((f14 != null ? f14.floatValue() : 0.0f) * fOooO00o);
                Float f15 = fill.b;
                oooO00o.f20807OooO00o = Color.argb(iFloatValue, iFloatValue2, iFloatValue3, (int) ((f15 != null ? f15.floatValue() : 0.0f) * fOooO00o));
            }
            ShapeEntity.ShapeStyle.RGBAColor stroke = shapeStyle.stroke;
            if (stroke != null) {
                Intrinsics.checkNotNullExpressionValue(stroke, "stroke");
                float fOooO00o2 = OooO00o(stroke);
                Float f16 = stroke.a;
                Intrinsics.checkNotNullExpressionValue(f16, "color.a");
                float f17 = f16.floatValue() <= 1.0f ? 255.0f : 1.0f;
                Float f18 = stroke.a;
                int iFloatValue4 = (int) ((f18 != null ? f18.floatValue() : 0.0f) * f17);
                Float f19 = stroke.r;
                int iFloatValue5 = (int) ((f19 != null ? f19.floatValue() : 0.0f) * fOooO00o2);
                Float f20 = stroke.g;
                int iFloatValue6 = (int) ((f20 != null ? f20.floatValue() : 0.0f) * fOooO00o2);
                Float f21 = stroke.b;
                oooO00o.f20808OooO0O0 = Color.argb(iFloatValue4, iFloatValue5, iFloatValue6, (int) ((f21 != null ? f21.floatValue() : 0.0f) * fOooO00o2));
            }
            Float f22 = shapeStyle.strokeWidth;
            if (f22 == null) {
                fFloatValue7 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f22, "it.strokeWidth ?: 0.0f");
                fFloatValue7 = f22.floatValue();
            }
            oooO00o.f20809OooO0OO = fFloatValue7;
            ShapeEntity.ShapeStyle.LineCap lineCap = shapeStyle.lineCap;
            if (lineCap != null) {
                Intrinsics.checkNotNullExpressionValue(lineCap, "lineCap");
                int i2 = OooO0O0.$EnumSwitchMapping$1[lineCap.ordinal()];
                if (i2 == 1) {
                    Intrinsics.checkNotNullParameter("butt", "<set-?>");
                    oooO00o.f20810OooO0Oo = "butt";
                } else if (i2 == 2) {
                    Intrinsics.checkNotNullParameter("round", "<set-?>");
                    oooO00o.f20810OooO0Oo = "round";
                } else if (i2 == 3) {
                    Intrinsics.checkNotNullParameter("square", "<set-?>");
                    oooO00o.f20810OooO0Oo = "square";
                }
            }
            ShapeEntity.ShapeStyle.LineJoin lineJoin = shapeStyle.lineJoin;
            if (lineJoin != null) {
                Intrinsics.checkNotNullExpressionValue(lineJoin, "lineJoin");
                int i3 = OooO0O0.$EnumSwitchMapping$2[lineJoin.ordinal()];
                if (i3 == 1) {
                    Intrinsics.checkNotNullParameter("bevel", "<set-?>");
                    oooO00o.f20812OooO0o0 = "bevel";
                } else if (i3 == 2) {
                    Intrinsics.checkNotNullParameter("miter", "<set-?>");
                    oooO00o.f20812OooO0o0 = "miter";
                } else if (i3 == 3) {
                    Intrinsics.checkNotNullParameter("round", "<set-?>");
                    oooO00o.f20812OooO0o0 = "round";
                }
            }
            Float f23 = shapeStyle.miterLimit;
            oooO00o.f20811OooO0o = (int) (f23 != null ? f23.floatValue() : 0.0f);
            float[] fArr = new float[3];
            Intrinsics.checkNotNullParameter(fArr, "<set-?>");
            oooO00o.f20813OooO0oO = fArr;
            Float lineDashI = shapeStyle.lineDashI;
            if (lineDashI != null) {
                Intrinsics.checkNotNullExpressionValue(lineDashI, "lineDashI");
                oooO00o.f20813OooO0oO[0] = lineDashI.floatValue();
            }
            Float lineDashII = shapeStyle.lineDashII;
            if (lineDashII != null) {
                Intrinsics.checkNotNullExpressionValue(lineDashII, "lineDashII");
                oooO00o.f20813OooO0oO[1] = lineDashII.floatValue();
            }
            Float lineDashIII = shapeStyle.lineDashIII;
            if (lineDashIII != null) {
                Intrinsics.checkNotNullExpressionValue(lineDashIII, "lineDashIII");
                oooO00o.f20813OooO0oO[2] = lineDashIII.floatValue();
            }
            this.f20804OooO0OO = oooO00o;
        }
        Transform transform = obj.transform;
        if (transform != null) {
            Matrix matrix = new Matrix();
            float[] fArr2 = new float[9];
            Float f24 = transform.a;
            if (f24 == null) {
                fFloatValue = 1.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f24, "it.a ?: 1.0f");
                fFloatValue = f24.floatValue();
            }
            Float f25 = transform.b;
            if (f25 == null) {
                fFloatValue2 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f25, "it.b ?: 0.0f");
                fFloatValue2 = f25.floatValue();
            }
            Float f26 = transform.c;
            if (f26 == null) {
                fFloatValue3 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f26, "it.c ?: 0.0f");
                fFloatValue3 = f26.floatValue();
            }
            Float f27 = transform.d;
            if (f27 == null) {
                fFloatValue4 = 1.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f27, "it.d ?: 1.0f");
                fFloatValue4 = f27.floatValue();
            }
            Float f28 = transform.tx;
            if (f28 == null) {
                fFloatValue5 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f28, "it.tx ?: 0.0f");
                fFloatValue5 = f28.floatValue();
            }
            Float f29 = transform.ty;
            if (f29 == null) {
                fFloatValue6 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f29, "it.ty ?: 0.0f");
                fFloatValue6 = f29.floatValue();
            }
            fArr2[0] = fFloatValue;
            fArr2[1] = fFloatValue3;
            fArr2[2] = fFloatValue5;
            fArr2[3] = fFloatValue2;
            fArr2[4] = fFloatValue4;
            fArr2[5] = fFloatValue6;
            fArr2[6] = 0.0f;
            fArr2[7] = 0.0f;
            fArr2[8] = 1.0f;
            matrix.setValues(fArr2);
            this.f20805OooO0Oo = matrix;
        }
    }
}
