package com.opensource.svgaplayer.entities;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p589o0oOooO0.o0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class SVGAVideoShapeEntity {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Type f19438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Map<String, ? extends Object> f19439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO00o f19440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Matrix f19441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Path f19442OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f19443OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f19444OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f19445OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19447OooO0o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public String f19446OooO0Oo = "butt";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public String f19448OooO0o0 = "miter";

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public float[] f19449OooO0oO = new float[0];
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "", "shape", "rect", "ellipse", "keep", "library_release"}, k = 1, mv = {1, 4, 0})
    public enum Type {
        shape,
        rect,
        ellipse,
        keep
    }

    public SVGAVideoShapeEntity(@NotNull JSONObject jSONObject) throws JSONException {
        Type type = Type.shape;
        this.f19438OooO00o = type;
        String strOptString = jSONObject.optString("type");
        if (strOptString != null) {
            if (StringsKt.OooO(strOptString, "shape")) {
                this.f19438OooO00o = type;
            } else if (StringsKt.OooO(strOptString, "rect")) {
                this.f19438OooO00o = Type.rect;
            } else if (StringsKt.OooO(strOptString, "ellipse")) {
                this.f19438OooO00o = Type.ellipse;
            } else if (StringsKt.OooO(strOptString, "keep")) {
                this.f19438OooO00o = Type.keep;
            }
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("args");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkExpressionValueIsNotNull(itKeys, "values.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectOptJSONObject.get(next);
                if (obj != null) {
                    map.put(next, obj);
                }
            }
            this.f19439OooO0O0 = map;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("styles");
        if (jSONObjectOptJSONObject2 != null) {
            OooO00o oooO00o = new OooO00o();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("fill");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                double dOptDouble = jSONArrayOptJSONArray.optDouble(3);
                double d = KotlinVersion.MAX_COMPONENT_VALUE;
                oooO00o.f19443OooO00o = Color.argb((int) (dOptDouble * d), (int) (jSONArrayOptJSONArray.optDouble(0) * d), (int) (jSONArrayOptJSONArray.optDouble(1) * d), (int) (d * jSONArrayOptJSONArray.optDouble(2)));
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("stroke");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() == 4) {
                double dOptDouble2 = jSONArrayOptJSONArray2.optDouble(3);
                double d2 = KotlinVersion.MAX_COMPONENT_VALUE;
                oooO00o.f19444OooO0O0 = Color.argb((int) (dOptDouble2 * d2), (int) (jSONArrayOptJSONArray2.optDouble(0) * d2), (int) (jSONArrayOptJSONArray2.optDouble(1) * d2), (int) (jSONArrayOptJSONArray2.optDouble(2) * d2));
            }
            oooO00o.f19445OooO0OO = (float) jSONObjectOptJSONObject2.optDouble("strokeWidth", 0.0d);
            String strOptString2 = jSONObjectOptJSONObject2.optString("lineCap", "butt");
            Intrinsics.checkExpressionValueIsNotNull(strOptString2, "it.optString(\"lineCap\", \"butt\")");
            oooO00o.f19446OooO0Oo = strOptString2;
            String strOptString3 = jSONObjectOptJSONObject2.optString("lineJoin", "miter");
            Intrinsics.checkExpressionValueIsNotNull(strOptString3, "it.optString(\"lineJoin\", \"miter\")");
            oooO00o.f19448OooO0o0 = strOptString3;
            oooO00o.f19447OooO0o = jSONObjectOptJSONObject2.optInt("miterLimit", 0);
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("lineDash");
            if (jSONArrayOptJSONArray3 != null) {
                oooO00o.f19449OooO0oO = new float[jSONArrayOptJSONArray3.length()];
                int length = jSONArrayOptJSONArray3.length();
                for (int i = 0; i < length; i++) {
                    oooO00o.f19449OooO0oO[i] = (float) jSONArrayOptJSONArray3.optDouble(i, 0.0d);
                }
            }
            this.f19440OooO0OO = oooO00o;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transform");
        if (jSONObjectOptJSONObject3 != null) {
            Matrix matrix = new Matrix();
            float f = (float) 0.0d;
            matrix.setValues(new float[]{(float) jSONObjectOptJSONObject3.optDouble(ak.av, 1.0d), (float) jSONObjectOptJSONObject3.optDouble(ak.aF, 0.0d), (float) jSONObjectOptJSONObject3.optDouble("tx", 0.0d), (float) jSONObjectOptJSONObject3.optDouble("b", 0.0d), (float) jSONObjectOptJSONObject3.optDouble("d", 1.0d), (float) jSONObjectOptJSONObject3.optDouble("ty", 0.0d), f, f, (float) 1.0d});
            this.f19441OooO0Oo = matrix;
        }
    }

    public SVGAVideoShapeEntity(@NotNull ShapeEntity shapeEntity) {
        String str;
        Type type = Type.shape;
        this.f19438OooO00o = type;
        ShapeEntity.ShapeType shapeType = shapeEntity.type;
        if (shapeType != null) {
            int i = o0O0o.$EnumSwitchMapping$0[shapeType.ordinal()];
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
            this.f19438OooO00o = type;
        }
        HashMap map = new HashMap();
        ShapeEntity.ShapeArgs shapeArgs = shapeEntity.shape;
        if (shapeArgs != null && (str = shapeArgs.d) != null) {
            map.put("d", str);
        }
        ShapeEntity.EllipseArgs ellipseArgs = shapeEntity.ellipse;
        if (ellipseArgs != null) {
            Float f = ellipseArgs.x;
            map.put("x", f == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f);
            Float f2 = ellipseArgs.y;
            map.put("y", f2 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f2);
            Float f3 = ellipseArgs.radiusX;
            map.put("radiusX", f3 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f3);
            Float f4 = ellipseArgs.radiusY;
            map.put("radiusY", f4 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f4);
        }
        ShapeEntity.RectArgs rectArgs = shapeEntity.rect;
        if (rectArgs != null) {
            Float f5 = rectArgs.x;
            map.put("x", f5 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f5);
            Float f6 = rectArgs.y;
            map.put("y", f6 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f6);
            Float f7 = rectArgs.width;
            map.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f7 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f7);
            Float f8 = rectArgs.height;
            map.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f8 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f8);
            Float f9 = rectArgs.cornerRadius;
            map.put("cornerRadius", f9 == null ? Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : f9);
        }
        this.f19439OooO0O0 = map;
        ShapeEntity.ShapeStyle shapeStyle = shapeEntity.styles;
        if (shapeStyle != null) {
            OooO00o oooO00o = new OooO00o();
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor = shapeStyle.fill;
            if (rGBAColor != null) {
                Float f10 = rGBAColor.a;
                float fFloatValue = f10 != null ? f10.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                float f11 = KotlinVersion.MAX_COMPONENT_VALUE;
                int i2 = (int) (fFloatValue * f11);
                Float f12 = rGBAColor.r;
                int iFloatValue = (int) ((f12 != null ? f12.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f11);
                Float f13 = rGBAColor.g;
                int iFloatValue2 = (int) ((f13 != null ? f13.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f11);
                Float f14 = rGBAColor.b;
                oooO00o.f19443OooO00o = Color.argb(i2, iFloatValue, iFloatValue2, (int) ((f14 != null ? f14.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f11));
            }
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor2 = shapeStyle.stroke;
            if (rGBAColor2 != null) {
                Float f15 = rGBAColor2.a;
                float fFloatValue2 = f15 != null ? f15.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                float f16 = KotlinVersion.MAX_COMPONENT_VALUE;
                int i3 = (int) (fFloatValue2 * f16);
                Float f17 = rGBAColor2.r;
                int iFloatValue3 = (int) ((f17 != null ? f17.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f16);
                Float f18 = rGBAColor2.g;
                int iFloatValue4 = (int) ((f18 != null ? f18.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f16);
                Float f19 = rGBAColor2.b;
                oooO00o.f19444OooO0O0 = Color.argb(i3, iFloatValue3, iFloatValue4, (int) ((f19 != null ? f19.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f16));
            }
            Float f20 = shapeStyle.strokeWidth;
            oooO00o.f19445OooO0OO = f20 != null ? f20.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            ShapeEntity.ShapeStyle.LineCap lineCap = shapeStyle.lineCap;
            if (lineCap != null) {
                int i4 = o0O0o.$EnumSwitchMapping$1[lineCap.ordinal()];
                if (i4 == 1) {
                    oooO00o.f19446OooO0Oo = "butt";
                } else if (i4 == 2) {
                    oooO00o.f19446OooO0Oo = "round";
                } else if (i4 == 3) {
                    oooO00o.f19446OooO0Oo = "square";
                }
            }
            ShapeEntity.ShapeStyle.LineJoin lineJoin = shapeStyle.lineJoin;
            if (lineJoin != null) {
                int i5 = o0O0o.$EnumSwitchMapping$2[lineJoin.ordinal()];
                if (i5 == 1) {
                    oooO00o.f19448OooO0o0 = "bevel";
                } else if (i5 == 2) {
                    oooO00o.f19448OooO0o0 = "miter";
                } else if (i5 == 3) {
                    oooO00o.f19448OooO0o0 = "round";
                }
            }
            Float f21 = shapeStyle.miterLimit;
            oooO00o.f19447OooO0o = (int) (f21 != null ? f21.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            oooO00o.f19449OooO0oO = new float[3];
            Float f22 = shapeStyle.lineDashI;
            if (f22 != null) {
                oooO00o.f19449OooO0oO[0] = f22.floatValue();
            }
            Float f23 = shapeStyle.lineDashII;
            if (f23 != null) {
                oooO00o.f19449OooO0oO[1] = f23.floatValue();
            }
            Float f24 = shapeStyle.lineDashIII;
            if (f24 != null) {
                oooO00o.f19449OooO0oO[2] = f24.floatValue();
            }
            this.f19440OooO0OO = oooO00o;
        }
        Transform transform = shapeEntity.transform;
        if (transform != null) {
            Matrix matrix = new Matrix();
            float[] fArr = new float[9];
            Float f25 = transform.a;
            float fFloatValue3 = f25 != null ? f25.floatValue() : 1.0f;
            Float f26 = transform.b;
            float fFloatValue4 = f26 != null ? f26.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f27 = transform.c;
            float fFloatValue5 = f27 != null ? f27.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f28 = transform.d;
            float fFloatValue6 = f28 != null ? f28.floatValue() : 1.0f;
            Float f29 = transform.tx;
            float fFloatValue7 = f29 != null ? f29.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f30 = transform.ty;
            float fFloatValue8 = f30 != null ? f30.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            fArr[0] = fFloatValue3;
            fArr[1] = fFloatValue5;
            fArr[2] = fFloatValue7;
            fArr[3] = fFloatValue4;
            fArr[4] = fFloatValue6;
            fArr[5] = fFloatValue8;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
            this.f19441OooO0Oo = matrix;
        }
    }
}
