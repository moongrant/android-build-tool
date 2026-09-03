package p528o0o0OOOo;

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
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,284:1\n154#2:285\n*S KotlinDebug\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$1\n*L\n215#1:285\n*E\n"})
public final class oO0O00o0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53936OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(MomentReplyVM momentReplyVM) {
        super(3);
        this.f53936OooO0Oo = momentReplyVM;
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
                ComposerKt.traceEventStart(-1096935968, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReplyDialog.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentReplyDialog.kt:210)");
            }
            oO0O00.OooO0Oo(oO0O00.f53908OooO00o, composer2, 6);
            OooOO0.OooO0o0(null, Dp.m3765constructorimpl(6), o0oO0O0o.f47078o000o0O, composer2, 6, 4);
            oO0OO00o oo0oo00o = oO0OO00o.f53953OooO00o;
            MomentReplyVM momentReplyVM = this.f53936OooO0Oo;
            oo0oo00o.OooO00o(momentReplyVM.getSortType(), 384, composer2, new oO0O00O(momentReplyVM));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
