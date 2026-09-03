package p220o00oO0o;

import OooO00o.OooO00o;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.StyleableRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import p028Oooo0o0.o0O0ooO;
import p081o000OoO.o000oOoO;
import p081o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final XmlPullParser f33680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33681OooO0O0;

    public o0ooOOo(XmlPullParser xmlParser) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.f33680OooO00o = xmlParser;
        this.f33681OooO0O0 = 0;
    }

    @NotNull
    public final o000oOoO OooO00o(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        o000oOoO result = o00oO0o.OooO0Oo(typedArray, this.f33680OooO00o, theme, attrName, i);
        OooO0o(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float OooO0O0(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float fOooO0o0 = o00oO0o.OooO0o0(typedArray, this.f33680OooO00o, attrName, i, f);
        OooO0o(typedArray.getChangingConfigurations());
        return fOooO0o0;
    }

    public final int OooO0OO(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int iOooO0o = o00oO0o.OooO0o(typedArray, this.f33680OooO00o, attrName, i, i2);
        OooO0o(typedArray.getChangingConfigurations());
        return iOooO0o;
    }

    @Nullable
    public final String OooO0Oo(@NotNull TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i);
        OooO0o(typedArray.getChangingConfigurations());
        return string;
    }

    public final void OooO0o(int i) {
        this.f33681OooO0O0 = i | this.f33681OooO0O0;
    }

    @NotNull
    public final TypedArray OooO0o0(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayOooOO0, "obtainAttributes(\n      …          attrs\n        )");
        OooO0o(typedArrayOooOO0.getChangingConfigurations());
        return typedArrayOooOO0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo2 = (o0ooOOo) obj;
        return Intrinsics.areEqual(this.f33680OooO00o, o0ooooo2.f33680OooO00o) && this.f33681OooO0O0 == o0ooooo2.f33681OooO0O0;
    }

    public final int hashCode() {
        return (this.f33680OooO00o.hashCode() * 31) + this.f33681OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AndroidVectorParser(xmlParser=");
        sbOooO0o0.append(this.f33680OooO00o);
        sbOooO0o0.append(", config=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f33681OooO0O0, ')');
    }
}
