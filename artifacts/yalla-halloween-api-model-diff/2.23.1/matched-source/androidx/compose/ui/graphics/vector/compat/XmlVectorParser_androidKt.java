package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p058o0000Ooo.o0OoOo0;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000\u001a<\u0010\u0017\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0018\u001a\u00020\n*\u00020\nH\u0000\u001a*\u0010\u0019\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u001a2\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u001a2\u0010 \u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a2\u0010!\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/StrokeCap;", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "getStrokeLineJoin", "Lorg/xmlpull/v1/XmlPullParser;", "", "isAtEnd", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "nestedGroups", "parseCurrentVectorNode", "seekToStartTag", "createVectorImageBuilder", "", "parsePath", "Lo0000Ooo/o0OoOo0;", "complexColor", "Landroidx/compose/ui/graphics/Brush;", "obtainBrushFromComplexColor", "parseClipPath", "parseGroup", "LINECAP_BUTT", "I", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_MITER", "LINEJOIN_ROUND", "LINEJOIN_BEVEL", "FILL_TYPE_WINDING", "", "SHAPE_CLIP_PATH", "Ljava/lang/String;", "SHAPE_GROUP", "SHAPE_PATH", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,726:1\n174#2:727\n174#2:728\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:727\n240#1:728\n*E\n"})
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;

    @NotNull
    private static final String SHAPE_CLIP_PATH = "clip-path";

    @NotNull
    private static final String SHAPE_GROUP = "group";

    @NotNull
    private static final String SHAPE_PATH = "path";

    @NotNull
    public static final ImageVector.Builder createVectorImageBuilder(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs) throws XmlPullParserException {
        long jM1717getUnspecified0d7_KjU;
        int iM1629getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            jM1717getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? Color.INSTANCE.m1717getUnspecified0d7_KjU() : ColorKt.Color(namedColorStateList.getDefaultColor());
        } else {
            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
        }
        long j = jM1717getUnspecified0d7_KjU;
        int i = androidVectorParser.getInt(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i == -1) {
            iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1629getSrcIn0nO6VwU();
        } else if (i == 3) {
            iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1631getSrcOver0nO6VwU();
        } else if (i == 5) {
            iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1629getSrcIn0nO6VwU();
        } else if (i != 9) {
            switch (i) {
                case 14:
                    iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1620getModulate0nO6VwU();
                    break;
                case 15:
                    iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1625getScreen0nO6VwU();
                    break;
                case 16:
                    iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1623getPlus0nO6VwU();
                    break;
                default:
                    iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1629getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM1629getSrcIn0nO6VwU = BlendMode.INSTANCE.m1628getSrcAtop0nO6VwU();
        }
        int i2 = iM1629getSrcIn0nO6VwU;
        float fM3775constructorimpl = Dp.m3775constructorimpl(dimension / res.getDisplayMetrics().density);
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(dimension2 / res.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new ImageVector.Builder(null, fM3775constructorimpl, fM3775constructorimpl2, namedFloat, namedFloat2, j, i2, namedBoolean, 1, null);
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m2244getStrokeLineCapCSYIeUk(int i, int i2) {
        if (i == 0) {
            return StrokeCap.INSTANCE.m2005getButtKaPHkGw();
        }
        if (i != 1) {
            return i != 2 ? i2 : StrokeCap.INSTANCE.m2007getSquareKaPHkGw();
        }
        return StrokeCap.INSTANCE.m2006getRoundKaPHkGw();
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m2245getStrokeLineCapCSYIeUk$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeCap.INSTANCE.m2005getButtKaPHkGw();
        }
        return m2244getStrokeLineCapCSYIeUk(i, i2);
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m2246getStrokeLineJoinkLtJ_vA(int i, int i2) {
        if (i == 0) {
            return StrokeJoin.INSTANCE.m2016getMiterLxFBmk8();
        }
        if (i != 1) {
            return i != 2 ? i2 : StrokeJoin.INSTANCE.m2015getBevelLxFBmk8();
        }
        return StrokeJoin.INSTANCE.m2017getRoundLxFBmk8();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m2247getStrokeLineJoinkLtJ_vA$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeJoin.INSTANCE.m2016getMiterLxFBmk8();
        }
        return m2246getStrokeLineJoinkLtJ_vA(i, i2);
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final Brush obtainBrushFromComplexColor(o0OoOo0 o0oooo1) {
        Shader shader = o0oooo1.f33739OooO00o;
        boolean z = true;
        if (!(shader != null) && o0oooo1.f33741OooO0OO == 0) {
            z = false;
        }
        if (z) {
            return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(o0oooo1.f33741OooO0OO), null);
        }
        return null;
    }

    public static final void parseClipPath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> listAddPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        typedArrayObtainAttributes.recycle();
        builder.addGroup((254 & 1) != 0 ? "" : string, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? VectorKt.getEmptyPath() : listAddPathNodes);
    }

    public static final int parseCurrentVectorNode(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @NotNull AttributeSet attrs, @Nullable Resources.Theme theme, @NotNull ImageVector.Builder builder, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !Intrinsics.areEqual(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i;
            }
            parseClipPath(androidVectorParser, res, theme, attrs, builder);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals(SHAPE_PATH)) {
                return i;
            }
            parsePath(androidVectorParser, res, theme, attrs, builder);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
            return i;
        }
        parseGroup(androidVectorParser, res, theme, attrs, builder);
        return i;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i);
    }

    public static final void parseGroup(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "rotation", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!oo000o.OooO0oO(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        List<PathNode> listAddPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
        o0OoOo0 namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int iM2244getStrokeLineCapCSYIeUk = m2244getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.INSTANCE.m2005getButtKaPHkGw());
        int iM2246getStrokeLineJoinkLtJ_vA = m2246getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.INSTANCE.m2015getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        o0OoOo0 namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        typedArrayObtainAttributes.recycle();
        Brush brushObtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
        Brush brushObtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
        PathFillType.Companion companion = PathFillType.INSTANCE;
        builder.m2224addPathoIyEayM(listAddPathNodes, namedInt == 0 ? companion.m1936getNonZeroRgk1Os() : companion.m1935getEvenOddRgk1Os(), str, brushObtainBrushFromComplexColor, namedFloat, brushObtainBrushFromComplexColor2, namedFloat3, namedFloat4, iM2244getStrokeLineCapCSYIeUk, iM2246getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
