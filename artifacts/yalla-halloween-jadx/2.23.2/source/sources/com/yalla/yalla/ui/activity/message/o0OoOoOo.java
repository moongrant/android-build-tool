package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import com.yalla.yalla.data.db.table.SystemMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function1<SystemMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25526OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(SystemMessageActivity systemMessageActivity) {
        super(1);
        this.f25526OooO0Oo = systemMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SystemMessage systemMessage) {
        boolean z = systemMessage != null;
        SystemMessageActivity systemMessageActivity = this.f25526OooO0Oo;
        if (z) {
            TextView textView = systemMessageActivity.f25313OooOo0O;
            if (textView != null) {
                com.code.android.util.o000O.OooOOOO(textView);
            }
            systemMessageActivity.OooOoO0().f45222OooO0OO.OooO0Oo();
        } else {
            TextView textView2 = systemMessageActivity.f25313OooOo0O;
            if (textView2 != null) {
                com.code.android.util.o000O.OooO0O0(textView2);
            }
            systemMessageActivity.OooOoO0().f45222OooO0OO.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
