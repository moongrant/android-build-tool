package androidx.compose.material.icons.outlined;

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
import p259o00ooo.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "Landroidx/compose/material/icons/Icons$Outlined;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayArrow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/outlined/PlayArrowKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,46:1\n122#2:47\n116#2,3:48\n119#2,3:52\n132#2,18:55\n152#2:92\n175#3:51\n694#4,2:73\n706#4,2:75\n708#4,11:81\n53#5,4:77\n*S KotlinDebug\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/outlined/PlayArrowKt\n*L\n29#1:47\n29#1:48,3\n29#1:52,3\n30#1:55,18\n30#1:92\n29#1:51\n30#1:73,2\n30#1:75,2\n30#1:81,11\n30#1:77,4\n*E\n"})
public final class PlayArrowKt {

    @Nullable
    private static ImageVector _playArrow;

    @NotNull
    public static final ImageVector getPlayArrow(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PlayArrow", Dp.m3765constructorimpl(24.0f), Dp.m3765constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1696getBlack0d7_KjU(), null);
        int iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
        int iM2005getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2005getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o = o0O0O00.OooO00o(10.0f, 8.64f, 15.27f, 12.0f);
        pathBuilderOooO00o.lineTo(10.0f, 15.36f);
        pathBuilderOooO00o.verticalLineTo(8.64f);
        pathBuilderOooO00o.moveTo(8.0f, 5.0f);
        pathBuilderOooO00o.verticalLineToRelative(14.0f);
        pathBuilderOooO00o.lineToRelative(11.0f, -7.0f);
        pathBuilderOooO00o.lineTo(8.0f, 5.0f);
        pathBuilderOooO00o.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m2213addPathoIyEayM$default(builder, pathBuilderOooO00o.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM1995getButtKaPHkGw, iM2005getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
