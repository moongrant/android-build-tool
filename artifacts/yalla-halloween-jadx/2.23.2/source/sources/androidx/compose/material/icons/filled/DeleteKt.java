package androidx.compose.material.icons.filled;

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
import o000O0.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_delete", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Delete", "Landroidx/compose/material/icons/Icons$Filled;", "getDelete", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDelete.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/filled/DeleteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n122#2:56\n116#2,3:57\n119#2,3:61\n132#2,18:64\n152#2:101\n174#3:60\n694#4,2:82\n706#4,2:84\n708#4,11:90\n64#5,4:86\n*S KotlinDebug\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/filled/DeleteKt\n*L\n29#1:56\n29#1:57,3\n29#1:61,3\n30#1:64,18\n30#1:101\n29#1:60\n30#1:82,2\n30#1:84,2\n30#1:90,11\n30#1:86,4\n*E\n"})
public final class DeleteKt {

    @Nullable
    private static ImageVector _delete;

    @NotNull
    public static final ImageVector getDelete(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _delete;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Delete", Dp.m3775constructorimpl(24.0f), Dp.m3775constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1707getBlack0d7_KjU(), null);
        int iM2005getButtKaPHkGw = StrokeCap.INSTANCE.m2005getButtKaPHkGw();
        int iM2015getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2015getBevelLxFBmk8();
        PathBuilder pathBuilderOooO00o = Oooo000.OooO00o(6.0f, 19.0f);
        pathBuilderOooO00o.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderOooO00o.horizontalLineToRelative(8.0f);
        pathBuilderOooO00o.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderOooO00o.verticalLineTo(7.0f);
        pathBuilderOooO00o.horizontalLineTo(6.0f);
        pathBuilderOooO00o.verticalLineToRelative(12.0f);
        pathBuilderOooO00o.close();
        pathBuilderOooO00o.moveTo(19.0f, 4.0f);
        pathBuilderOooO00o.horizontalLineToRelative(-3.5f);
        pathBuilderOooO00o.lineToRelative(-1.0f, -1.0f);
        pathBuilderOooO00o.horizontalLineToRelative(-5.0f);
        pathBuilderOooO00o.lineToRelative(-1.0f, 1.0f);
        pathBuilderOooO00o.horizontalLineTo(5.0f);
        pathBuilderOooO00o.verticalLineToRelative(2.0f);
        pathBuilderOooO00o.horizontalLineToRelative(14.0f);
        pathBuilderOooO00o.verticalLineTo(4.0f);
        pathBuilderOooO00o.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m2223addPathoIyEayM$default(builder, pathBuilderOooO00o.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2005getButtKaPHkGw, iM2015getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _delete = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
