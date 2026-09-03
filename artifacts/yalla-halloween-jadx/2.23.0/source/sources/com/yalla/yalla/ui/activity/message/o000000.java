package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25796OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f25796OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PrivateChatActivity.f25694Oooo000;
        this.f25796OooO0Oo.OooOo0o().setHalfDialogWebPageInfo(WebPageInfo.f32815OooOOo);
        return Unit.INSTANCE;
    }
}
