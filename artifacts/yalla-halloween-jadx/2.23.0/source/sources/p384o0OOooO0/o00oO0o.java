package p384o0OOooO0;

import android.graphics.Matrix;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.Layout;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p330o0OO0Ooo.OooO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSVGAVideoSpriteFrameEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAVideoSpriteFrameEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteFrameEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1#2:96\n1549#3:97\n1620#3,3:98\n*S KotlinDebug\n*F\n+ 1 SVGAVideoSpriteFrameEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteFrameEntity\n*L\n89#1:97\n89#1:98,3\n*E\n"})
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f44322OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO f44323OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Matrix f44324OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00O0O f44325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<SVGAVideoShapeEntity> f44326OooO0o0;

    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    public o00oO0o(@NotNull JSONObject obj) {
        int i;
        int i2;
        o00oO0o o00oo0o2;
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f44323OooO0O0 = new OooO(0.0d, 0.0d);
        Matrix matrix = new Matrix();
        this.f44324OooO0OO = matrix;
        this.f44326OooO0o0 = CollectionsKt.emptyList();
        this.f44322OooO00o = obj.optDouble("alpha", 0.0d);
        JSONObject jSONObjectOptJSONObject = obj.optJSONObject("layout");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optDouble("x", 0.0d);
            jSONObjectOptJSONObject.optDouble("y", 0.0d);
            this.f44323OooO0O0 = new OooO(jSONObjectOptJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0.0d), jSONObjectOptJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0.0d));
        }
        JSONObject jSONObjectOptJSONObject2 = obj.optJSONObject("transform");
        if (jSONObjectOptJSONObject2 != null) {
            double dOptDouble = jSONObjectOptJSONObject2.optDouble("a", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("b", 0.0d);
            double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("c", 0.0d);
            double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("d", 1.0d);
            double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("tx", 0.0d);
            double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("ty", 0.0d);
            i2 = 0;
            float f = (float) dOptDouble3;
            i = 1;
            matrix.setValues(new float[]{(float) dOptDouble, f, (float) dOptDouble5, (float) dOptDouble2, (float) dOptDouble4, (float) dOptDouble6, 0.0f, 0.0f, 1.0f});
        } else {
            i = 1;
            i2 = 0;
        }
        String strOptString = obj.optString("clipPath");
        if (strOptString == null) {
            o00oo0o2 = this;
        } else if ((strOptString.length() > 0 ? i : i2) != 0) {
            o00O0O o00o0o2 = new o00O0O(strOptString);
            o00oo0o2 = this;
            o00oo0o2.f44325OooO0Oo = o00o0o2;
        } else {
            o00oo0o2 = this;
        }
        JSONArray jSONArrayOptJSONArray = obj.optJSONArray("shapes");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i3 = i2; i3 < length; i3++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject3 != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject3, "optJSONObject(i)");
                    arrayList.add(new SVGAVideoShapeEntity(jSONObjectOptJSONObject3));
                }
            }
            o00oo0o2.f44326OooO0o0 = CollectionsKt.toList(arrayList);
        }
    }

    public o00oO0o(@NotNull FrameEntity obj) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f44323OooO0O0 = new OooO(0.0d, 0.0d);
        Matrix matrix = new Matrix();
        this.f44324OooO0OO = matrix;
        this.f44326OooO0o0 = CollectionsKt.emptyList();
        Float f = obj.alpha;
        this.f44322OooO00o = f != null ? f.floatValue() : 0.0f;
        Layout layout = obj.layout;
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
            double dFloatValue = f4 != null ? f4.floatValue() : 0.0f;
            Float f5 = layout.height;
            this.f44323OooO0O0 = new OooO(dFloatValue, f5 != null ? f5.floatValue() : 0.0f);
        }
        Transform transform = obj.transform;
        if (transform != null) {
            float[] fArr = new float[9];
            Float f6 = transform.a;
            if (f6 == null) {
                fFloatValue = 1.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f6, "it.a ?: 1.0f");
                fFloatValue = f6.floatValue();
            }
            Float f7 = transform.b;
            if (f7 == null) {
                fFloatValue2 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f7, "it.b ?: 0.0f");
                fFloatValue2 = f7.floatValue();
            }
            Float f8 = transform.c;
            if (f8 == null) {
                fFloatValue3 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f8, "it.c ?: 0.0f");
                fFloatValue3 = f8.floatValue();
            }
            Float f9 = transform.d;
            if (f9 == null) {
                fFloatValue4 = 1.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f9, "it.d ?: 1.0f");
                fFloatValue4 = f9.floatValue();
            }
            Float f10 = transform.tx;
            if (f10 == null) {
                fFloatValue5 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f10, "it.tx ?: 0.0f");
                fFloatValue5 = f10.floatValue();
            }
            Float f11 = transform.ty;
            if (f11 == null) {
                fFloatValue6 = 0.0f;
            } else {
                Intrinsics.checkNotNullExpressionValue(f11, "it.ty ?: 0.0f");
                fFloatValue6 = f11.floatValue();
            }
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue3;
            fArr[2] = fFloatValue5;
            fArr[3] = fFloatValue2;
            fArr[4] = fFloatValue4;
            fArr[5] = fFloatValue6;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
        }
        String str = obj.clipPath;
        if (str != null) {
            str = str.length() > 0 ? str : null;
            if (str != null) {
                this.f44325OooO0Oo = new o00O0O(str);
            }
        }
        List<ShapeEntity> list = obj.shapes;
        Intrinsics.checkNotNullExpressionValue(list, "obj.shapes");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ShapeEntity it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(new SVGAVideoShapeEntity(it));
        }
        this.f44326OooO0o0 = arrayList;
    }
}
