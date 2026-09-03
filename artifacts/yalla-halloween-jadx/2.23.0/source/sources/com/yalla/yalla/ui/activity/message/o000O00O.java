package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25815OooO0Oo;

    public o000O00O(PrivateChatActivity privateChatActivity) {
        this.f25815OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity privateChatActivity = this.f25815OooO0Oo;
        int itemCount = privateChatActivity.OooOo0O().getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (Intrinsics.areEqual(str2, privateChatActivity.OooOo0O().getData(i2).getMid())) {
                privateChatActivity.OooOo0O().notifyItemChanged(i2);
                return;
            }
        }
    }
}
