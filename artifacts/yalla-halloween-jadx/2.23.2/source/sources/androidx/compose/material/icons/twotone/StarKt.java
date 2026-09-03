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
import o000O0.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p261o00ooo.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n122#2:75\n116#2,3:76\n119#2,3:80\n132#2,18:83\n152#2:120\n132#2,18:121\n152#2:158\n174#3:79\n694#4,2:101\n706#4,2:103\n708#4,11:109\n694#4,2:139\n706#4,2:141\n708#4,11:147\n64#5,4:105\n64#5,4:143\n*S KotlinDebug\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,3\n30#1:83,18\n30#1:120\n43#1:121,18\n43#1:158\n29#1:79\n30#1:101,2\n30#1:103,2\n30#1:109,11\n43#1:139,2\n43#1:141,2\n43#1:147,11\n30#1:105,4\n43#1:143,4\n*E\n"})
public final class StarKt {

    @Nullable
    private static ImageVector _star;

    @NotNull
    public static final ImageVector getStar(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Star", Dp.m3775constructorimpl(24.0f), Dp.m3775constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m1707getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2005getButtKaPHkGw = companion2.m2005getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2015getBevelLxFBmk8 = companion3.m2015getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o = o0000O0.OooO00o(12.0f, 15.4f, -3.76f, 2.27f);
        pathBuilderOooO00o.lineToRelative(1.0f, -4.28f);
        pathBuilderOooO00o.lineToRelative(-3.32f, -2.88f);
        pathBuilderOooO00o.lineToRelative(4.38f, -0.38f);
        pathBuilderOooO00o.lineToRelative(1.7f, -4.03f);
        pathBuilderOooO00o.lineToRelative(1.71f, 4.04f);
        pathBuilderOooO00o.lineToRelative(4.38f, 0.38f);
        ImageVector.Builder.m2223addPathoIyEayM$default(builder, o0OoOo0.OooO00o(pathBuilderOooO00o, -3.32f, 2.88f, 1.0f, 4.28f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2005getButtKaPHkGw, iM2015getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m1707getBlack0d7_KjU(), null);
        int iM2005getButtKaPHkGw2 = companion2.m2005getButtKaPHkGw();
        int iM2015getBevelLxFBmk9 = companion3.m2015getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o2 = o0000O0.OooO00o(22.0f, 9.24f, -7.19f, -0.62f);
        pathBuilderOooO00o2.lineTo(12.0f, 2.0f);
        pathBuilderOooO00o2.lineTo(9.19f, 8.63f);
        pathBuilderOooO00o2.lineTo(2.0f, 9.24f);
        pathBuilderOooO00o2.lineToRelative(5.46f, 4.73f);
        pathBuilderOooO00o2.lineTo(5.82f, 21.0f);
        pathBuilderOooO00o2.lineTo(12.0f, 17.27f);
        pathBuilderOooO00o2.lineTo(18.18f, 21.0f);
        pathBuilderOooO00o2.lineToRelative(-1.63f, -7.03f);
        pathBuilderOooO00o2.lineTo(22.0f, 9.24f);
        pathBuilderOooO00o2.close();
        pathBuilderOooO00o2.moveTo(12.0f, 15.4f);
        pathBuilderOooO00o2.lineToRelative(-3.76f, 2.27f);
        pathBuilderOooO00o2.lineToRelative(1.0f, -4.28f);
        pathBuilderOooO00o2.lineToRelative(-3.32f, -2.88f);
        pathBuilderOooO00o2.lineToRelative(4.38f, -0.38f);
        pathBuilderOooO00o2.lineTo(12.0f, 6.1f);
        pathBuilderOooO00o2.lineToRelative(1.71f, 4.04f);
        pathBuilderOooO00o2.lineToRelative(4.38f, 0.38f);
        pathBuilderOooO00o2.lineToRelative(-3.32f, 2.88f);
        pathBuilderOooO00o2.lineToRelative(1.0f, 4.28f);
        pathBuilderOooO00o2.lineTo(12.0f, 15.4f);
        pathBuilderOooO00o2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m2223addPathoIyEayM$default(builder, pathBuilderOooO00o2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2005getButtKaPHkGw2, iM2015getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _star = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
