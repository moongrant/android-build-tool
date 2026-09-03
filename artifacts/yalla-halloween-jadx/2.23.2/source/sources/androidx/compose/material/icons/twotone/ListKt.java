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
import o000O0.o000oOoO;
import o000O0.o00O0O;
import o000O0.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_list", "Landroidx/compose/ui/graphics/vector/ImageVector;", "List", "Landroidx/compose/material/icons/Icons$TwoTone;", "getList", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/twotone/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n122#2:110\n116#2,3:111\n119#2,3:115\n132#2,18:118\n152#2:155\n174#3:114\n694#4,2:136\n706#4,2:138\n708#4,11:144\n64#5,4:140\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/twotone/ListKt\n*L\n29#1:110\n29#1:111,3\n29#1:115,3\n30#1:118,18\n30#1:155\n29#1:114\n30#1:136,2\n30#1:138,2\n30#1:144,11\n30#1:140,4\n*E\n"})
public final class ListKt {

    @Nullable
    private static ImageVector _list;

    @NotNull
    public static final ImageVector getList(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _list;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.List", Dp.m3775constructorimpl(24.0f), Dp.m3775constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1707getBlack0d7_KjU(), null);
        int iM2005getButtKaPHkGw = StrokeCap.INSTANCE.m2005getButtKaPHkGw();
        int iM2015getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2015getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 11.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 3.0f, 17.0f, 2.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 7.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 7.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 7.0f, 13.0f, 14.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 7.0f, 11.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 7.0f, 17.0f, 14.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 7.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.close();
        o00O0O.OooO00o(pathBuilder, 3.0f, 13.0f, 2.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 11.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 3.0f, 17.0f, 2.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 7.0f);
        o00Oo0.OooO00o(pathBuilder, 3.0f, 7.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 7.0f, 13.0f, 14.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 7.0f, 11.0f, 2.0f);
        o00O0O.OooO00o(pathBuilder, 7.0f, 17.0f, 14.0f, -2.0f);
        o00Oo0.OooO00o(pathBuilder, 7.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m2223addPathoIyEayM$default(builder, o000oOoO.OooO00o(pathBuilder, 21.0f, 7.0f, 7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2005getButtKaPHkGw, iM2015getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _list = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
