package p612o0oo0OoO;

import androidx.compose.foundation.layout.oo000o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p620o0oo0oO0.o000OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public JSONObject f57420OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f57421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f57422OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f57423OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ArrayList f57424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f57425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ArrayList f57426OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57427OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f57428OooO0oo = 3;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f57429OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000OO0O f57430OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f57431OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final o000OO0O f57432OooO0OO;

        public OooO00o(@NotNull o000OO0O renderFrame, int i, @NotNull o000OO0O outputFrame) {
            Intrinsics.checkNotNullParameter(renderFrame, "renderFrame");
            Intrinsics.checkNotNullParameter(outputFrame, "outputFrame");
            this.f57430OooO00o = renderFrame;
            this.f57431OooO0O0 = i;
            this.f57432OooO0OO = outputFrame;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f57430OooO00o, oooO00o.f57430OooO00o) && this.f57431OooO0O0 == oooO00o.f57431OooO0O0 && Intrinsics.areEqual(this.f57432OooO0OO, oooO00o.f57432OooO0OO);
        }

        public final int hashCode() {
            return this.f57432OooO0OO.hashCode() + (((this.f57430OooO00o.hashCode() * 31) + this.f57431OooO0O0) * 31);
        }

        @NotNull
        public final String toString() {
            return "Data(renderFrame=" + this.f57430OooO00o + ", effectId=" + this.f57431OooO0O0 + ", outputFrame=" + this.f57432OooO0OO + ')';
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f57433OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<OooO00o> f57434OooO0O0;

        public OooO0O0(int i, @NotNull ArrayList data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57433OooO00o = i;
            this.f57434OooO0O0 = data;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f57433OooO00o == oooO0O0.f57433OooO00o && Intrinsics.areEqual(this.f57434OooO0O0, oooO0O0.f57434OooO0O0);
        }

        public final int hashCode() {
            return this.f57434OooO0O0.hashCode() + (this.f57433OooO00o * 31);
        }

        @NotNull
        public final String toString() {
            return "Datas(frameIndex=" + this.f57433OooO00o + ", data=" + this.f57434OooO0O0 + ')';
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f57435OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f57436OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f57437OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f57438OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f57439OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final o000OO0O f57440OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o000OO0O f57441OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f57442OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f57443OooO0oo;

        public OooO0OO(int i, int i2, boolean z, int i3, @NotNull o000OO0O rgbFrame, @NotNull o000OO0O alphaFrame, int i4, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(rgbFrame, "rgbFrame");
            Intrinsics.checkNotNullParameter(alphaFrame, "alphaFrame");
            this.f57436OooO00o = i;
            this.f57437OooO0O0 = i2;
            this.f57438OooO0OO = z;
            this.f57439OooO0Oo = i3;
            this.f57441OooO0o0 = rgbFrame;
            this.f57440OooO0o = alphaFrame;
            this.f57442OooO0oO = i4;
            this.f57443OooO0oo = z2;
            this.f57435OooO = z3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f57436OooO00o == oooO0OO.f57436OooO00o && this.f57437OooO0O0 == oooO0OO.f57437OooO0O0 && this.f57438OooO0OO == oooO0OO.f57438OooO0OO && this.f57439OooO0Oo == oooO0OO.f57439OooO0Oo && Intrinsics.areEqual(this.f57441OooO0o0, oooO0OO.f57441OooO0o0) && Intrinsics.areEqual(this.f57440OooO0o, oooO0OO.f57440OooO0o) && this.f57442OooO0oO == oooO0OO.f57442OooO0oO && this.f57443OooO0oo == oooO0OO.f57443OooO0oo && this.f57435OooO == oooO0OO.f57435OooO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14, types: [int] */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        public final int hashCode() {
            int i = ((this.f57436OooO00o * 31) + this.f57437OooO0O0) * 31;
            boolean z = this.f57438OooO0OO;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int iHashCode = (((this.f57440OooO0o.hashCode() + ((this.f57441OooO0o0.hashCode() + ((((i + r2) * 31) + this.f57439OooO0Oo) * 31)) * 31)) * 31) + this.f57442OooO0oO) * 31;
            boolean z2 = this.f57443OooO0oo;
            ?? r3 = z2;
            if (z2) {
                r3 = 1;
            }
            int i2 = (iHashCode + r3) * 31;
            boolean z3 = this.f57435OooO;
            return i2 + (z3 ? 1 : z3);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Descript(width=");
            sb.append(this.f57436OooO00o);
            sb.append(", height=");
            sb.append(this.f57437OooO0O0);
            sb.append(", isEffect=");
            sb.append(this.f57438OooO0OO);
            sb.append(", version=");
            sb.append(this.f57439OooO0Oo);
            sb.append(", rgbFrame=");
            sb.append(this.f57441OooO0o0);
            sb.append(", alphaFrame=");
            sb.append(this.f57440OooO0o);
            sb.append(", fps=");
            sb.append(this.f57442OooO0oO);
            sb.append(", hasAudio=");
            sb.append(this.f57443OooO0oo);
            sb.append(", hasBg=");
            return androidx.compose.animation.OooO0o.OooO00o(sb, this.f57435OooO, ')');
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final String f57444OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f57445OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f57446OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f57447OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f57448OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final String f57449OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f57450OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final String f57451OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f57452OooO0oo;

        public OooO0o(int i, int i2, int i3, @NotNull String effectTag, @NotNull String effectType, @NotNull String scaleMode, @NotNull String fontColor, int i4, @NotNull String textAlign) {
            Intrinsics.checkNotNullParameter(effectTag, "effectTag");
            Intrinsics.checkNotNullParameter(effectType, "effectType");
            Intrinsics.checkNotNullParameter(scaleMode, "scaleMode");
            Intrinsics.checkNotNullParameter(fontColor, "fontColor");
            Intrinsics.checkNotNullParameter(textAlign, "textAlign");
            this.f57445OooO00o = i;
            this.f57446OooO0O0 = i2;
            this.f57447OooO0OO = i3;
            this.f57448OooO0Oo = effectTag;
            this.f57450OooO0o0 = effectType;
            this.f57449OooO0o = scaleMode;
            this.f57451OooO0oO = fontColor;
            this.f57452OooO0oo = i4;
            this.f57444OooO = textAlign;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f57445OooO00o == oooO0o.f57445OooO00o && this.f57446OooO0O0 == oooO0o.f57446OooO0O0 && this.f57447OooO0OO == oooO0o.f57447OooO0OO && Intrinsics.areEqual(this.f57448OooO0Oo, oooO0o.f57448OooO0Oo) && Intrinsics.areEqual(this.f57450OooO0o0, oooO0o.f57450OooO0o0) && Intrinsics.areEqual(this.f57449OooO0o, oooO0o.f57449OooO0o) && Intrinsics.areEqual(this.f57451OooO0oO, oooO0o.f57451OooO0oO) && this.f57452OooO0oo == oooO0o.f57452OooO0oo && Intrinsics.areEqual(this.f57444OooO, oooO0o.f57444OooO);
        }

        public final int hashCode() {
            return this.f57444OooO.hashCode() + ((androidx.compose.animation.OooO0O0.OooO00o(this.f57451OooO0oO, androidx.compose.animation.OooO0O0.OooO00o(this.f57449OooO0o, androidx.compose.animation.OooO0O0.OooO00o(this.f57450OooO0o0, androidx.compose.animation.OooO0O0.OooO00o(this.f57448OooO0Oo, ((((this.f57445OooO00o * 31) + this.f57446OooO0O0) * 31) + this.f57447OooO0OO) * 31, 31), 31), 31), 31) + this.f57452OooO0oo) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Effect(effectWidth=");
            sb.append(this.f57445OooO00o);
            sb.append(", effectHeight=");
            sb.append(this.f57446OooO0O0);
            sb.append(", effectId=");
            sb.append(this.f57447OooO0OO);
            sb.append(", effectTag='");
            sb.append(this.f57448OooO0Oo);
            sb.append("', effectType='");
            sb.append(this.f57450OooO0o0);
            sb.append("', scaleMode='");
            sb.append(this.f57449OooO0o);
            sb.append("', fontColor='");
            sb.append(this.f57451OooO0oO);
            sb.append("', fontSize=");
            sb.append(this.f57452OooO0oo);
            sb.append(", textAlign=");
            return oo000o.OooO0O0(sb, this.f57444OooO, ')');
        }
    }

    public static OooO0O0 OooO00o(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new OooO0O0(0, new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(jSONObject2 == null ? new OooO00o(new o000OO0O(0, 0, 0, 0), 0, new o000OO0O(0, 0, 0, 0)) : new OooO00o(OooO0OO(jSONObject2.getJSONArray("renderFrame")), jSONObject2.optInt("effectId"), OooO0OO(jSONObject2.getJSONArray("outputFrame"))));
            }
        }
        return new OooO0O0(jSONObject.optInt("frameIndex"), arrayList);
    }

    public static OooO0o OooO0O0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new OooO0o(0, 0, 0, "", "", "", "", 0, "center");
        }
        int iOptInt = jSONObject.optInt("effectWidth");
        int iOptInt2 = jSONObject.optInt("effectHeight");
        int iOptInt3 = jSONObject.optInt("effectId");
        String strOptString = jSONObject.optString("effectTag");
        Intrinsics.checkNotNullExpressionValue(strOptString, "effect.optString(\"effectTag\")");
        String strOptString2 = jSONObject.optString("effectType");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "effect.optString(\"effectType\")");
        String strOptString3 = jSONObject.optString("scaleMode");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "effect.optString(\"scaleMode\")");
        String strOptString4 = jSONObject.optString("fontColor");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "effect.optString(\"fontColor\")");
        int iOptInt4 = jSONObject.optInt("fontSize");
        String strOptString5 = jSONObject.optString("textAlign");
        Intrinsics.checkNotNullExpressionValue(strOptString5, "effect.optString(\"textAlign\")");
        return new OooO0o(iOptInt, iOptInt2, iOptInt3, strOptString, strOptString2, strOptString3, strOptString4, iOptInt4, strOptString5);
    }

    public static o000OO0O OooO0OO(JSONArray jSONArray) {
        return jSONArray == null ? new o000OO0O(0, 0, 0, 0) : new o000OO0O((int) jSONArray.optDouble(0), (int) jSONArray.optDouble(1), (int) jSONArray.optDouble(2), (int) jSONArray.optDouble(3));
    }

    @NotNull
    public final String toString() {
        return "EvaAnimConfig(descript=" + this.f57423OooO0OO + ", effects=" + this.f57424OooO0Oo + ", datas=" + this.f57426OooO0o0 + ')';
    }
}
