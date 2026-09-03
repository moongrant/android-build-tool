package p496o0o00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p158o00OoOOO.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SelectDialogModel<String>> f49130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49131OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(ArrayList<SelectDialogModel<String>> arrayList, UserInfoEditActivity userInfoEditActivity) {
        super(3);
        this.f49130OooO0Oo = arrayList;
        this.f49131OooO0o0 = userInfoEditActivity;
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
                ComposerKt.traceEventStart(1329306182, i, -1, "com.yalla.yalla.ui.activity.user.UserInfoEditActivity.changeGender.<anonymous> (UserInfoEditActivity.kt:748)");
            }
            o00Oo0.OooO0O0(it, null, this.f49130OooO0Oo, null, false, new oO0000Oo(this.f49131OooO0o0), null, null, 0L, null, null, null, composer2, (i & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, 4058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
