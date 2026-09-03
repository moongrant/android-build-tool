package p535o0o0Oo0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,287:1\n154#2:288\n*S KotlinDebug\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$1\n*L\n218#1:288\n*E\n"})
public final class oO0O0OoO extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f54092OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(MomentReplyVM momentReplyVM) {
        super(3);
        this.f54092OooO0Oo = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1096935968, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReplyDialog.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentReplyDialog.kt:215)");
            }
            oO000Oo.OooO0Oo(oO000Oo.f53881OooO00o, composer2, 6);
            OooOO0.OooO0o0(null, Dp.m3775constructorimpl(6), o0OOo000.f48272o000o0o0, composer2, 6, 4);
            oO0o0o oo0o0o = oO0o0o.f54122OooO00o;
            MomentReplyVM momentReplyVM = this.f54092OooO0Oo;
            oo0o0o.OooO00o(momentReplyVM.getSortType(), 384, composer2, new oO000o00(momentReplyVM));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
