package com.yalla.yalla.ui.fragment.message;

import android.content.Intent;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageFragment f28046OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MessageFragment messageFragment) {
        super(0);
        this.f28046OooO0Oo = messageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("104015");
        MessageFragment messageFragment = this.f28046OooO0Oo;
        messageFragment.startActivity(new Intent(messageFragment.getActivity(), (Class<?>) SearchFriendActivity.class));
        return Unit.INSTANCE;
    }
}
