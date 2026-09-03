package p487o0o00O;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.vm.account.LoginTouristVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartActivity.kt\ncom/yalla/yalla/ui/activity/main/StartActivityKt$GuestLoginContent$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n36#2:182\n1097#3,6:183\n*S KotlinDebug\n*F\n+ 1 StartActivity.kt\ncom/yalla/yalla/ui/activity/main/StartActivityKt$GuestLoginContent$1$2\n*L\n146#1:182\n146#1:183,6\n*E\n"})
public final class oo0o0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginTouristVM f48909OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(LoginTouristVM loginTouristVM) {
        super(3);
        this.f48909OooO0Oo = loginTouristVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1481688524, iIntValue, -1, "com.yalla.yalla.ui.activity.main.GuestLoginContent.<anonymous>.<anonymous> (StartActivity.kt:145)");
            }
            composer2.startReplaceableGroup(1157296644);
            LoginTouristVM loginTouristVM = this.f48909OooO0Oo;
            boolean zChanged = composer2.changed(loginTouristVM);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o00O0OO0(loginTouristVM);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o00OO000.OooO0O0((Function0) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
