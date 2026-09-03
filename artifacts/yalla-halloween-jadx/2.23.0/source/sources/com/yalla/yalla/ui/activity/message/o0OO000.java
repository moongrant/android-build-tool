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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f25957OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState) {
        super(0);
        this.f25956OooO0Oo = yallaTeamMessageActivity;
        this.f25957OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        p587o0oOooo.o0OO000.OooO00o("105142");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25956OooO0Oo;
        if (yallaTeamMessageActivity != null) {
            String message = this.f25957OooO0o0.getValue();
            Intrinsics.checkNotNullParameter(message, "message");
            if (!StringsKt.isBlank(message) && !yallaTeamMessageActivity.f25777OooOo0 && yallaTeamMessageActivity.f25776OooOo != null) {
                boolean z = true;
                if (StringsKt.trim((CharSequence) message).toString().length() < 10) {
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_yalla_team_send_tips);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    yallaTeamMessageActivity.f25777OooOo0 = true;
                    YallaTeamVM yallaTeamVMOooOoO0 = yallaTeamMessageActivity.OooOoO0();
                    String string = StringsKt.trim((CharSequence) message).toString();
                    com.yalla.yalla.ui.adapter.oo0o0O0 oo0o0o0 = yallaTeamMessageActivity.f25776OooOo;
                    Intrinsics.checkNotNull(oo0o0o0);
                    com.yalla.yalla.ui.adapter.oo0o0O0 oo0o0o1 = yallaTeamMessageActivity.f25776OooOo;
                    Intrinsics.checkNotNull(oo0o0o1);
                    YallaTeamFeedbackType yallaTeamFeedbackTypeOooOOO = oo0o0o0.OooOOO(oo0o0o1.f27694OooOoo0);
                    Intrinsics.checkNotNull(yallaTeamFeedbackTypeOooOOO);
                    yallaTeamVMOooOoO0.sendFeedback(string, yallaTeamFeedbackTypeOooOOO.getTypeId()).observe(yallaTeamMessageActivity, new p377o0OOoOo.o0000OO0(new o0oOo0O0(yallaTeamMessageActivity), null, new o0O0oo00(yallaTeamMessageActivity), false, 10));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
