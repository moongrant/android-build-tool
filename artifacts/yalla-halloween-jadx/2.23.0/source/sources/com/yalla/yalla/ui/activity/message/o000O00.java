package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.WealthLevel;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.l5;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25813OooO0Oo;

    public o000O00(PrivateChatActivity privateChatActivity) {
        this.f25813OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (!it.booleanValue() || WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
            return;
        }
        PrivateChatActivity privateChatActivity = this.f25813OooO0Oo;
        p417o0OoO0.OooO.OooO00o(privateChatActivity, new l5(new o000Oo0(privateChatActivity)));
    }
}
