package p528o0o0OOO;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainMomentFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/ComposableSingletons$MainMomentFollowingFragmentKt$lambda-1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,355:1\n154#2:356\n*S KotlinDebug\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/ComposableSingletons$MainMomentFollowingFragmentKt$lambda-1$1$1$1\n*L\n157#1:356\n*E\n"})
public final class o000O00 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Drawable f53347OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(Drawable drawable) {
        super(1);
        this.f53347OooO0Oo = drawable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope drawBehind = drawScope;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Drawable drawable = this.f53347OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(0, -drawBehind.mo320roundToPx0680j_4(Dp.m3775constructorimpl(8)), (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
        }
        if (drawable != null) {
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
        }
        return Unit.INSTANCE;
    }
}
