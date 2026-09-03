package p669oO0Oo;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n154#2:370\n154#2:371\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$3\n*L\n327#1:370\n343#1:371\n*E\n"})
public final class o0OO00O extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f60696OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60697OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60698OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(CoroutineScope coroutineScope, LazyListState lazyListState, MutableState<Boolean> mutableState) {
        super(3);
        this.f60696OooO0Oo = coroutineScope;
        this.f60698OooO0o0 = lazyListState;
        this.f60697OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-849822101, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomApplyMicListDialog.kt:320)");
        }
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.New_Applications, composer2, 0), PaddingKt.m477paddingVpY3zN4(o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(16), 0.0f, 0.0f, Dp.m3765constructorimpl(12), 6, null), o0oO0O0o.f47000OooooOo, RoundedCornerShapeKt.RoundedCornerShape(50)), false, false, 0L, false, null, null, null, new o0Oo0oo(this.f60696OooO0Oo, this.f60698OooO0o0, this.f60697OooO0o), 253), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(4)), o0oO0O0o.f46993OoooOo0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
