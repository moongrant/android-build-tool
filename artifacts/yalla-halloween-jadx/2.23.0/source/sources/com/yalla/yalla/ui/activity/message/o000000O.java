package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.q2;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25797OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25797OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-605407946, iIntValue, -1, "com.yalla.yalla.ui.activity.message.PrivateChatActivity.initComposeView.<anonymous> (PrivateChatActivity.kt:242)");
            }
            q2 q2Var = q2.f53094OooO00o;
            int i = PrivateChatActivity.f25694Oooo000;
            PrivateChatActivity privateChatActivity = this.f25797OooO0Oo;
            q2Var.OooO00o(privateChatActivity.OooOo0o().getHalfDialogWebPageInfo(), new o000000(privateChatActivity), composer2, 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
