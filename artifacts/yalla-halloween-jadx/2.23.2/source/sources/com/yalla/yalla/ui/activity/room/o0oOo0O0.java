package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.z;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ z f26485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ p205o00o0o0o.o000O f26486OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26487OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(z zVar, VoteGameCreateActivity voteGameCreateActivity, p205o00o0o0o.o000O o000o) {
        super(0);
        this.f26485OooO0Oo = zVar;
        this.f26487OooO0o0 = voteGameCreateActivity;
        this.f26486OooO0o = o000o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string = StringsKt.trim((CharSequence) this.f26485OooO0Oo.f45720OooO0O0.getText().toString()).toString();
        boolean z = true;
        if (string.length() == 0) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_vote_game_title_is_empty);
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
            int i = VoteGameCreateActivity.f26301OooOo;
            this.f26487OooO0o0.OooOo().f43725OooO.setText(string);
            this.f26486OooO0o.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
