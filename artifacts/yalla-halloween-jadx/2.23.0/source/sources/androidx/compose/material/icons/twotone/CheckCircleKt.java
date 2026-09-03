package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000Oo0;
import p259o00ooo.o000000;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_checkCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CheckCircle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCheckCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/twotone/CheckCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n122#2:73\n116#2,3:74\n119#2,3:78\n132#2,18:81\n152#2:118\n132#2,18:119\n152#2:156\n175#3:77\n694#4,2:99\n706#4,2:101\n708#4,11:107\n694#4,2:137\n706#4,2:139\n708#4,11:145\n53#5,4:103\n53#5,4:141\n*S KotlinDebug\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/twotone/CheckCircleKt\n*L\n29#1:73\n29#1:74,3\n29#1:78,3\n30#1:81,18\n30#1:118\n46#1:119,18\n46#1:156\n29#1:77\n30#1:99,2\n30#1:101,2\n30#1:107,11\n46#1:137,2\n46#1:139,2\n46#1:145,11\n30#1:103,4\n46#1:141,4\n*E\n"})
public final class CheckCircleKt {

    @Nullable
    private static ImageVector _checkCircle;

    @NotNull
    public static final ImageVector getCheckCircle(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _checkCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CheckCircle", Dp.m3765constructorimpl(24.0f), Dp.m3765constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m1696getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM1995getButtKaPHkGw = companion2.m1995getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2005getBevelLxFBmk8 = companion3.m2005getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o = o000Oo0.OooO00o(12.0f, 4.0f);
        pathBuilderOooO00o.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilderOooO00o.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilderOooO00o.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilderOooO00o.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilderOooO00o.close();
        pathBuilderOooO00o.moveTo(10.0f, 17.0f);
        pathBuilderOooO00o.lineToRelative(-4.0f, -4.0f);
        pathBuilderOooO00o.lineToRelative(1.41f, -1.41f);
        pathBuilderOooO00o.lineTo(10.0f, 14.17f);
        pathBuilderOooO00o.lineToRelative(6.59f, -6.59f);
        pathBuilderOooO00o.lineTo(18.0f, 9.0f);
        pathBuilderOooO00o.lineToRelative(-8.0f, 8.0f);
        pathBuilderOooO00o.close();
        ImageVector.Builder.m2213addPathoIyEayM$default(builder, pathBuilderOooO00o.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM1995getButtKaPHkGw, iM2005getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m1696getBlack0d7_KjU(), null);
        int iM1995getButtKaPHkGw2 = companion2.m1995getButtKaPHkGw();
        int iM2005getBevelLxFBmk9 = companion3.m2005getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o2 = o000Oo0.OooO00o(12.0f, 2.0f);
        pathBuilderOooO00o2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderOooO00o2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderOooO00o2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderOooO00o2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderOooO00o2.close();
        pathBuilderOooO00o2.moveTo(12.0f, 20.0f);
        pathBuilderOooO00o2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderOooO00o2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderOooO00o2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderOooO00o2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderOooO00o2.close();
        pathBuilderOooO00o2.moveTo(16.59f, 7.58f);
        pathBuilderOooO00o2.lineTo(10.0f, 14.17f);
        pathBuilderOooO00o2.lineToRelative(-2.59f, -2.58f);
        pathBuilderOooO00o2.lineTo(6.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m2213addPathoIyEayM$default(builder, o000000.OooO00o(pathBuilderOooO00o2, 4.0f, 4.0f, 8.0f, -8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM1995getButtKaPHkGw2, iM2005getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _checkCircle = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
