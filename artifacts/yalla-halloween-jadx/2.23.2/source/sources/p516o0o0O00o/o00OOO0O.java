package p516o0o0O00o;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.OooO0O0;
import com.code.android.util.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f51444OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(float f) {
        super(1);
        this.f51444OooO0Oo = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        long j = o0OOo000.f48135OooO0O0;
        float f = this.f51444OooO0Oo;
        OooO0O0.Oooo0o(drawWithContent, j, 0L, 0L, CornerRadiusKt.CornerRadius(o0000O0.OooO00o(f), o0000O0.OooO00o(f)), null, 0.0f, null, BlendMode.INSTANCE.m1604getClear0nO6VwU(), 118, null);
        drawWithContent.drawContent();
        return Unit.INSTANCE;
    }
}
