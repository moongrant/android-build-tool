package p589o0oOooO0;

import android.graphics.Matrix;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.Layout;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p647o0ooOOOO.c6;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f47169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public c6 f47170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Matrix f47171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oo00oO f47172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<SVGAVideoShapeEntity> f47173OooO0o0;

    public o0O0000O(@NotNull JSONObject jSONObject) {
        boolean z;
        o0O0000O o0o0000o2 = this;
        o0o0000o2.f47170OooO0O0 = new c6(0.0d, 0.0d);
        o0o0000o2.f47171OooO0OO = new Matrix();
        o0o0000o2.f47173OooO0o0 = CollectionsKt.emptyList();
        o0o0000o2.f47169OooO00o = jSONObject.optDouble("alpha", 0.0d);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("layout");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optDouble("x", 0.0d);
            jSONObjectOptJSONObject.optDouble("y", 0.0d);
            o0o0000o2.f47170OooO0O0 = new c6(jSONObjectOptJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0.0d), jSONObjectOptJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0.0d));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transform");
        if (jSONObjectOptJSONObject2 != null) {
            double dOptDouble = jSONObjectOptJSONObject2.optDouble(ak.av, 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("b", 0.0d);
            double dOptDouble3 = jSONObjectOptJSONObject2.optDouble(ak.aF, 0.0d);
            double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("d", 1.0d);
            double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("tx", 0.0d);
            double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("ty", 0.0d);
            float f = (float) dOptDouble3;
            z = true;
            float f2 = (float) 0.0d;
            float[] fArr = {(float) dOptDouble, f, (float) dOptDouble5, (float) dOptDouble2, (float) dOptDouble4, (float) dOptDouble6, f2, f2, (float) 1.0d};
            o0o0000o2 = this;
            o0o0000o2.f47171OooO0OO.setValues(fArr);
        } else {
            z = true;
        }
        String strOptString = jSONObject.optString("clipPath");
        if (strOptString != null) {
            if (strOptString.length() <= 0 ? false : z) {
                o0o0000o2.f47172OooO0Oo = new oo00oO(strOptString);
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shapes");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList.add(new SVGAVideoShapeEntity(jSONObjectOptJSONObject3));
                }
            }
            o0o0000o2.f47173OooO0o0 = CollectionsKt.toList(arrayList);
        }
    }

    public o0O0000O(@NotNull FrameEntity frameEntity) {
        this.f47170OooO0O0 = new c6(0.0d, 0.0d);
        this.f47171OooO0OO = new Matrix();
        this.f47173OooO0o0 = CollectionsKt.emptyList();
        Float f = frameEntity.alpha;
        this.f47169OooO00o = f != null ? f.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Layout layout = frameEntity.layout;
        if (layout != null) {
            Float f2 = layout.x;
            if (f2 != null) {
                f2.floatValue();
            }
            Float f3 = layout.y;
            if (f3 != null) {
                f3.floatValue();
            }
            Float f4 = layout.width;
            double dFloatValue = f4 != null ? f4.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f5 = layout.height;
            this.f47170OooO0O0 = new c6(dFloatValue, f5 != null ? f5.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Transform transform = frameEntity.transform;
        if (transform != null) {
            float[] fArr = new float[9];
            Float f6 = transform.a;
            float fFloatValue = f6 != null ? f6.floatValue() : 1.0f;
            Float f7 = transform.b;
            float fFloatValue2 = f7 != null ? f7.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f8 = transform.c;
            float fFloatValue3 = f8 != null ? f8.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f9 = transform.d;
            float fFloatValue4 = f9 != null ? f9.floatValue() : 1.0f;
            Float f10 = transform.tx;
            float fFloatValue5 = f10 != null ? f10.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f11 = transform.ty;
            float fFloatValue6 = f11 != null ? f11.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue3;
            fArr[2] = fFloatValue5;
            fArr[3] = fFloatValue2;
            fArr[4] = fFloatValue4;
            fArr[5] = fFloatValue6;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            this.f47171OooO0OO.setValues(fArr);
        }
        String str = frameEntity.clipPath;
        if (str != null) {
            str = str.length() > 0 ? str : null;
            if (str != null) {
                this.f47172OooO0Oo = new oo00oO(str);
            }
        }
        List<ShapeEntity> list = frameEntity.shapes;
        Intrinsics.checkExpressionValueIsNotNull(list, "obj.shapes");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ShapeEntity it : list) {
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(new SVGAVideoShapeEntity(it));
        }
        this.f47173OooO0o0 = arrayList;
    }
}
