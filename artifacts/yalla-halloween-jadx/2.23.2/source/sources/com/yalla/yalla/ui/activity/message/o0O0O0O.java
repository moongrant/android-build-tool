package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25499OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25499OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        Intrinsics.checkNotNull(num2);
        int iIntValue = num2.intValue();
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25499OooO0Oo;
        if (iIntValue > 0) {
            TextView textView = yallaTeamMessageActivity.f25324OooOo0O;
            if (textView != null) {
                com.code.android.util.o000O.OooOOOO(textView);
            }
        } else {
            TextView textView2 = yallaTeamMessageActivity.f25324OooOo0O;
            if (textView2 != null) {
                com.code.android.util.o000O.OooO0O0(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
