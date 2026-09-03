package androidx.compose.material.icons.sharp;

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
import p261o00ooo.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_call", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Call", "Landroidx/compose/material/icons/Icons$Sharp;", "getCall", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/sharp/CallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n122#2:48\n116#2,3:49\n119#2,3:53\n132#2,18:56\n152#2:93\n174#3:52\n694#4,2:74\n706#4,2:76\n708#4,11:82\n64#5,4:78\n*S KotlinDebug\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/sharp/CallKt\n*L\n29#1:48\n29#1:49,3\n29#1:53,3\n30#1:56,18\n30#1:93\n29#1:52\n30#1:74,2\n30#1:76,2\n30#1:82,11\n30#1:78,4\n*E\n"})
public final class CallKt {

    @Nullable
    private static ImageVector _call;

    @NotNull
    public static final ImageVector getCall(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _call;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Call", Dp.m3775constructorimpl(24.0f), Dp.m3775constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1707getBlack0d7_KjU(), null);
        int iM2005getButtKaPHkGw = StrokeCap.INSTANCE.m2005getButtKaPHkGw();
        int iM2015getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2015getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o = o0000O0.OooO00o(21.0f, 15.46f, -5.27f, -0.61f);
        pathBuilderOooO00o.lineToRelative(-2.52f, 2.52f);
        pathBuilderOooO00o.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderOooO00o.lineToRelative(2.53f, -2.53f);
        pathBuilderOooO00o.lineTo(8.54f, 3.0f);
        pathBuilderOooO00o.horizontalLineTo(3.03f);
        pathBuilderOooO00o.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        pathBuilderOooO00o.verticalLineToRelative(-5.51f);
        pathBuilderOooO00o.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m2223addPathoIyEayM$default(builder, pathBuilderOooO00o.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2005getButtKaPHkGw, iM2015getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _call = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
