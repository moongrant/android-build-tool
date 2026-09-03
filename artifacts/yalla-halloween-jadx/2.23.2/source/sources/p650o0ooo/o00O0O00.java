package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p506o0o00oOo.oOOO00Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58541OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f58542OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f58543OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(oOOO00Oo oooo00oo, String str, String str2) {
        super(3);
        this.f58541OooO0Oo = oooo00oo;
        this.f58543OooO0o0 = str;
        this.f58542OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-219877355, i, -1, "com.yalla.yalla.ui.dialog.DeletedFriendDialogUtil.showDeletedFriendDialog.<anonymous> (DeletedFriendDialogUtil.kt:42)");
            }
            o000O0Oo.OooO0Oo(it, null, null, ComposableLambdaKt.composableLambda(composer2, 1368273354, true, new oo00o(this.f58543OooO0o0, this.f58542OooO0o)), false, false, null, null, o0000.OooO0OO(o000000.Delete), false, null, false, this.f58541OooO0Oo, null, false, false, null, o00O0.f58522OooO0Oo, null, null, composer2, (i & 14) | 3072, 12582912, 913142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
