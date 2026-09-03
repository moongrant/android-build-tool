package com.yalla.yalla.ui.fragment;

import android.content.Intent;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MessageFragment f24067Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(MessageFragment messageFragment) {
        super(0);
        this.f24067Oooo0o = messageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Message_add");
        this.f24067Oooo0o.startActivity(new Intent(this.f24067Oooo0o.getActivity(), (Class<?>) SearchFriendActivity.class));
        return Unit.INSTANCE;
    }
}
