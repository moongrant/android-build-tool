package com.yalla.yalla.ui.adapter;

import android.os.Looper;
import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f27148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessage.SatisfactionSurvey f27149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f27150OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(Ref.IntRef intRef, o00O0O00 o00o0o01, YallaTeamMessage.SatisfactionSurvey satisfactionSurvey) {
        super(1);
        this.f27148OooO0Oo = intRef;
        this.f27150OooO0o0 = o00o0o01;
        this.f27149OooO0o = satisfactionSurvey;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        Ref.IntRef intRef = this.f27148OooO0Oo;
        int i = intRef.element;
        boolean z = true;
        if (i >= 0 && i < 11) {
            Function2<? super Long, ? super Integer, Unit> function2 = this.f27150OooO0o0.f27142OooOo00;
            if (function2 != null) {
                function2.invoke(Long.valueOf(this.f27149OooO0o.getMessageId()), Integer.valueOf(intRef.element));
            }
        } else {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_select_score);
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
        }
        return Unit.INSTANCE;
    }
}
