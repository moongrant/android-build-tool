package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.l8;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l8 f26938OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ p157o00OoOO0.o0OO00O f26939OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26940OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(l8 l8Var, VoteGameCreateActivity voteGameCreateActivity, p157o00OoOO0.o0OO00O o0oo00o2) {
        super(0);
        this.f26938OooO0Oo = l8Var;
        this.f26940OooO0o0 = voteGameCreateActivity;
        this.f26939OooO0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string = StringsKt.trim((CharSequence) this.f26938OooO0Oo.f58373OooO0O0.getText().toString()).toString();
        boolean z = true;
        if (string.length() == 0) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_title_is_empty);
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
            int i = VoteGameCreateActivity.f26755OooOo;
            this.f26940OooO0o0.OooOo().f58522OooO.setText(string);
            this.f26939OooO0o.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
