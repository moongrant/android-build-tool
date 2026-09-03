package p519o0o0O0oO;

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
import p158o00OoOOO.oo000o;
import p496o0o00o.o0OO0o00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52630OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f52631OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f52632OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o0OO0o00 o0oo0o01, String str, String str2) {
        super(3);
        this.f52630OooO0Oo = o0oo0o01;
        this.f52632OooO0o0 = str;
        this.f52631OooO0o = str2;
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
                ComposerKt.traceEventStart(-219877355, i, -1, "com.yalla.yalla.ui.dialog.DeletedFriendDialogUtil.showDeletedFriendDialog.<anonymous> (DeletedFriendDialogUtil.kt:41)");
            }
            oo000o.OooO0Oo(it, null, null, ComposableLambdaKt.composableLambda(composer2, 1368273354, true, new o0OoOoOo(this.f52632OooO0o0, this.f52631OooO0o)), false, false, null, null, o0000.OooO0OO(oO00OOo0.Delete), false, null, false, this.f52630OooO0Oo, null, false, false, null, o0O000Oo.f52629OooO0Oo, null, null, composer2, (i & 14) | 3072, 12582912, 913142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
