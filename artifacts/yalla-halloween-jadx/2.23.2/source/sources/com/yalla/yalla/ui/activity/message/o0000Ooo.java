package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f25356OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PrivateChatActivity.f25239Oooo000;
        this.f25356OooO0Oo.OooOo0o().setHalfDialogWebPageInfo(WebPageInfo.f32279OooOOo);
        return Unit.INSTANCE;
    }
}
