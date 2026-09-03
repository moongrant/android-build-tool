package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.YallaTeamFeedbackType;
import com.yalla.yalla.ui.vm.message.YallaTeamVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f25515OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState) {
        super(0);
        this.f25514OooO0Oo = yallaTeamMessageActivity;
        this.f25515OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("105142");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25514OooO0Oo;
        if (yallaTeamMessageActivity != null) {
            String message = this.f25515OooO0o0.getValue();
            Intrinsics.checkNotNullParameter(message, "message");
            if (!StringsKt.isBlank(message) && !yallaTeamMessageActivity.f25322OooOo0 && yallaTeamMessageActivity.f25321OooOo != null) {
                boolean z = true;
                if (StringsKt.trim((CharSequence) message).toString().length() < 10) {
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_yalla_team_send_tips);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    yallaTeamMessageActivity.f25322OooOo0 = true;
                    YallaTeamVM yallaTeamVMOooOoO0 = yallaTeamMessageActivity.OooOoO0();
                    String string = StringsKt.trim((CharSequence) message).toString();
                    com.yalla.yalla.ui.adapter.oo0oOO0 oo0ooo0 = yallaTeamMessageActivity.f25321OooOo;
                    Intrinsics.checkNotNull(oo0ooo0);
                    com.yalla.yalla.ui.adapter.oo0oOO0 oo0ooo1 = yallaTeamMessageActivity.f25321OooOo;
                    Intrinsics.checkNotNull(oo0ooo1);
                    YallaTeamFeedbackType yallaTeamFeedbackTypeOooOOO = oo0ooo0.OooOOO(oo0ooo1.f27238OooOoo0);
                    Intrinsics.checkNotNull(yallaTeamFeedbackTypeOooOOO);
                    yallaTeamVMOooOoO0.sendFeedback(string, yallaTeamFeedbackTypeOooOOO.getTypeId()).observe(yallaTeamMessageActivity, new p384o0OOoo0O.o000oOoO(new o0oOo0O0(yallaTeamMessageActivity), null, new o0O0oo00(yallaTeamMessageActivity), false, 10));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
