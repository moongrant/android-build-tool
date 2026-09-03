package p507o0o00ooo;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f50293OooO00o = new OooO00o();

    public static final class OooO00o implements Shape {
        @Override // androidx.compose.ui.graphics.Shape
        @NotNull
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public final Outline mo218createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(0.0f, 0.0f);
            Path.lineTo(Size.m1505getWidthimpl(j), 0.0f);
            Path.lineTo(Size.m1505getWidthimpl(j) / 2.0f, Size.m1502getHeightimpl(j));
            return new Outline.Generic(Path);
        }
    }
}
