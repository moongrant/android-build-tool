package p607o0oo0OOo;

import androidx.compose.foundation.layout.oo000o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p069o0000ooO.o0OO00O;
import p614o0oo0o0O.o000OOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public JSONObject f56905OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f56906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f56907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f56908OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ArrayList f56909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f56910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ArrayList f56911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f56912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f56913OooO0oo = 3;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f56914OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000OOo0 f56915OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f56916OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final o000OOo0 f56917OooO0OO;

        public OooO00o(@NotNull o000OOo0 renderFrame, int i, @NotNull o000OOo0 outputFrame) {
            Intrinsics.checkNotNullParameter(renderFrame, "renderFrame");
            Intrinsics.checkNotNullParameter(outputFrame, "outputFrame");
            this.f56915OooO00o = renderFrame;
            this.f56916OooO0O0 = i;
            this.f56917OooO0OO = outputFrame;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f56915OooO00o, oooO00o.f56915OooO00o) && this.f56916OooO0O0 == oooO00o.f56916OooO0O0 && Intrinsics.areEqual(this.f56917OooO0OO, oooO00o.f56917OooO0OO);
        }

        public final int hashCode() {
            return this.f56917OooO0OO.hashCode() + (((this.f56915OooO00o.hashCode() * 31) + this.f56916OooO0O0) * 31);
        }

        @NotNull
        public final String toString() {
            return "Data(renderFrame=" + this.f56915OooO00o + ", effectId=" + this.f56916OooO0O0 + ", outputFrame=" + this.f56917OooO0OO + ')';
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f56918OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<OooO00o> f56919OooO0O0;

        public OooO0O0(int i, @NotNull ArrayList data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f56918OooO00o = i;
            this.f56919OooO0O0 = data;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f56918OooO00o == oooO0O0.f56918OooO00o && Intrinsics.areEqual(this.f56919OooO0O0, oooO0O0.f56919OooO0O0);
        }

        public final int hashCode() {
            return this.f56919OooO0O0.hashCode() + (this.f56918OooO00o * 31);
        }

        @NotNull
        public final String toString() {
            return "Datas(frameIndex=" + this.f56918OooO00o + ", data=" + this.f56919OooO0O0 + ')';
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f56920OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f56921OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f56922OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f56923OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f56924OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final o000OOo0 f56925OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o000OOo0 f56926OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f56927OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f56928OooO0oo;

        public OooO0OO(int i, int i2, boolean z, int i3, @NotNull o000OOo0 rgbFrame, @NotNull o000OOo0 alphaFrame, int i4, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(rgbFrame, "rgbFrame");
            Intrinsics.checkNotNullParameter(alphaFrame, "alphaFrame");
            this.f56921OooO00o = i;
            this.f56922OooO0O0 = i2;
            this.f56923OooO0OO = z;
            this.f56924OooO0Oo = i3;
            this.f56926OooO0o0 = rgbFrame;
            this.f56925OooO0o = alphaFrame;
            this.f56927OooO0oO = i4;
            this.f56928OooO0oo = z2;
            this.f56920OooO = z3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f56921OooO00o == oooO0OO.f56921OooO00o && this.f56922OooO0O0 == oooO0OO.f56922OooO0O0 && this.f56923OooO0OO == oooO0OO.f56923OooO0OO && this.f56924OooO0Oo == oooO0OO.f56924OooO0Oo && Intrinsics.areEqual(this.f56926OooO0o0, oooO0OO.f56926OooO0o0) && Intrinsics.areEqual(this.f56925OooO0o, oooO0OO.f56925OooO0o) && this.f56927OooO0oO == oooO0OO.f56927OooO0oO && this.f56928OooO0oo == oooO0OO.f56928OooO0oo && this.f56920OooO == oooO0OO.f56920OooO;
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
            int i = ((this.f56921OooO00o * 31) + this.f56922OooO0O0) * 31;
            boolean z = this.f56923OooO0OO;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int iHashCode = (((this.f56925OooO0o.hashCode() + ((this.f56926OooO0o0.hashCode() + ((((i + r2) * 31) + this.f56924OooO0Oo) * 31)) * 31)) * 31) + this.f56927OooO0oO) * 31;
            boolean z2 = this.f56928OooO0oo;
            ?? r3 = z2;
            if (z2) {
                r3 = 1;
            }
            int i2 = (iHashCode + r3) * 31;
            boolean z3 = this.f56920OooO;
            return i2 + (z3 ? 1 : z3);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Descript(width=");
            sb.append(this.f56921OooO00o);
            sb.append(", height=");
            sb.append(this.f56922OooO0O0);
            sb.append(", isEffect=");
            sb.append(this.f56923OooO0OO);
            sb.append(", version=");
            sb.append(this.f56924OooO0Oo);
            sb.append(", rgbFrame=");
            sb.append(this.f56926OooO0o0);
            sb.append(", alphaFrame=");
            sb.append(this.f56925OooO0o);
            sb.append(", fps=");
            sb.append(this.f56927OooO0oO);
            sb.append(", hasAudio=");
            sb.append(this.f56928OooO0oo);
            sb.append(", hasBg=");
            return androidx.compose.animation.OooO0o.OooO00o(sb, this.f56920OooO, ')');
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final String f56929OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f56930OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f56931OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f56932OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f56933OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final String f56934OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f56935OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final String f56936OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f56937OooO0oo;

        public OooO0o(int i, int i2, int i3, @NotNull String effectTag, @NotNull String effectType, @NotNull String scaleMode, @NotNull String fontColor, int i4, @NotNull String textAlign) {
            Intrinsics.checkNotNullParameter(effectTag, "effectTag");
            Intrinsics.checkNotNullParameter(effectType, "effectType");
            Intrinsics.checkNotNullParameter(scaleMode, "scaleMode");
            Intrinsics.checkNotNullParameter(fontColor, "fontColor");
            Intrinsics.checkNotNullParameter(textAlign, "textAlign");
            this.f56930OooO00o = i;
            this.f56931OooO0O0 = i2;
            this.f56932OooO0OO = i3;
            this.f56933OooO0Oo = effectTag;
            this.f56935OooO0o0 = effectType;
            this.f56934OooO0o = scaleMode;
            this.f56936OooO0oO = fontColor;
            this.f56937OooO0oo = i4;
            this.f56929OooO = textAlign;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f56930OooO00o == oooO0o.f56930OooO00o && this.f56931OooO0O0 == oooO0o.f56931OooO0O0 && this.f56932OooO0OO == oooO0o.f56932OooO0OO && Intrinsics.areEqual(this.f56933OooO0Oo, oooO0o.f56933OooO0Oo) && Intrinsics.areEqual(this.f56935OooO0o0, oooO0o.f56935OooO0o0) && Intrinsics.areEqual(this.f56934OooO0o, oooO0o.f56934OooO0o) && Intrinsics.areEqual(this.f56936OooO0oO, oooO0o.f56936OooO0oO) && this.f56937OooO0oo == oooO0o.f56937OooO0oo && Intrinsics.areEqual(this.f56929OooO, oooO0o.f56929OooO);
        }

        public final int hashCode() {
            return this.f56929OooO.hashCode() + ((o0OO00O.OooO00o(this.f56936OooO0oO, o0OO00O.OooO00o(this.f56934OooO0o, o0OO00O.OooO00o(this.f56935OooO0o0, o0OO00O.OooO00o(this.f56933OooO0Oo, ((((this.f56930OooO00o * 31) + this.f56931OooO0O0) * 31) + this.f56932OooO0OO) * 31, 31), 31), 31), 31) + this.f56937OooO0oo) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Effect(effectWidth=");
            sb.append(this.f56930OooO00o);
            sb.append(", effectHeight=");
            sb.append(this.f56931OooO0O0);
            sb.append(", effectId=");
            sb.append(this.f56932OooO0OO);
            sb.append(", effectTag='");
            sb.append(this.f56933OooO0Oo);
            sb.append("', effectType='");
            sb.append(this.f56935OooO0o0);
            sb.append("', scaleMode='");
            sb.append(this.f56934OooO0o);
            sb.append("', fontColor='");
            sb.append(this.f56936OooO0oO);
            sb.append("', fontSize=");
            sb.append(this.f56937OooO0oo);
            sb.append(", textAlign=");
            return oo000o.OooO00o(sb, this.f56929OooO, ')');
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
                arrayList.add(jSONObject2 == null ? new OooO00o(new o000OOo0(0, 0, 0, 0), 0, new o000OOo0(0, 0, 0, 0)) : new OooO00o(OooO0OO(jSONObject2.getJSONArray("renderFrame")), jSONObject2.optInt("effectId"), OooO0OO(jSONObject2.getJSONArray("outputFrame"))));
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

    public static o000OOo0 OooO0OO(JSONArray jSONArray) {
        return jSONArray == null ? new o000OOo0(0, 0, 0, 0) : new o000OOo0((int) jSONArray.optDouble(0), (int) jSONArray.optDouble(1), (int) jSONArray.optDouble(2), (int) jSONArray.optDouble(3));
    }

    @NotNull
    public final String toString() {
        return "EvaAnimConfig(descript=" + this.f56908OooO0OO + ", effects=" + this.f56909OooO0Oo + ", datas=" + this.f56911OooO0o0 + ')';
    }
}
