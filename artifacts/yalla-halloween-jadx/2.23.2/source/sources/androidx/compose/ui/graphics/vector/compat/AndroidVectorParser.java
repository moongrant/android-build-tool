package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.foundation.layout.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.o0OoOo0;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0018J\u001e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002J\u001e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016J8\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002J0\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0002J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010&\u001a\u00020\u0002HÆ\u0003J\u001d\u0010)\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u0002HÆ\u0001J\t\u0010*\u001a\u00020\u0011HÖ\u0001J\t\u0010+\u001a\u00020\u0002HÖ\u0001J\u0013\u0010-\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "", "resConfig", "", "updateConfig", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "typedArray", "", "attrName", "resId", "defaultValue", "getNamedInt", "", "getNamedFloat", "", "getNamedBoolean", "index", "getFloat", "getInt", "getString", "defValue", "getDimension", "Lo0000Ooo/o0OoOo0;", "getNamedComplexColor", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "Lorg/xmlpull/v1/XmlPullParser;", "component1", "component2", "xmlParser", "config", "copy", "toString", "hashCode", "other", "equals", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "getConfig", "()I", "setConfig", "(I)V", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AndroidVectorParser {
    private int config;

    @NotNull
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(@NotNull XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.xmlParser = xmlParser;
        this.config = i;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    private final void updateConfig(int resConfig) {
        this.config = resConfig | this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    @NotNull
    public final AndroidVectorParser copy(@NotNull XmlPullParser xmlParser, int config) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        return new AndroidVectorParser(xmlParser, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(@NotNull TypedArray typedArray, int index, float defValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(index, defValue);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@NotNull TypedArray typedArray, int index, float defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f = typedArray.getFloat(index, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return f;
    }

    public final int getInt(@NotNull TypedArray typedArray, int index, int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i = typedArray.getInt(index, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return i;
    }

    public final boolean getNamedBoolean(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        boolean zOooO00o = oo000o.OooO00o(typedArray, this.xmlParser, attrName, resId, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return zOooO00o;
    }

    @Nullable
    public final ColorStateList getNamedColorStateList(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int resId) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ColorStateList colorStateListOooO0O0 = oo000o.OooO0O0(typedArray, this.xmlParser, theme, attrName, resId);
        updateConfig(typedArray.getChangingConfigurations());
        return colorStateListOooO0O0;
    }

    @NotNull
    public final o0OoOo0 getNamedComplexColor(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        o0OoOo0 result = oo000o.OooO0OO(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float getNamedFloat(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, float defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float fOooO0Oo = oo000o.OooO0Oo(typedArray, this.xmlParser, attrName, resId, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return fOooO0Oo;
    }

    public final int getNamedInt(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int iOooO0o0 = oo000o.OooO0o0(typedArray, this.xmlParser, attrName, resId, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return iOooO0o0;
    }

    @Nullable
    public final String getString(@NotNull TypedArray typedArray, int index) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(index);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + this.config;
    }

    @NotNull
    public final TypedArray obtainAttributes(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayOooO0oo, "obtainAttributes(\n      …          attrs\n        )");
        updateConfig(typedArrayOooO0oo.getChangingConfigurations());
        return typedArrayOooO0oo;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return OooO0O0.OooO00o(sb, this.config, ')');
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
