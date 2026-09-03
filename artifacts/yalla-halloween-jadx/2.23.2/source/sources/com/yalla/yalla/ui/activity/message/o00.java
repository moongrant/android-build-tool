package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25337OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f25337OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity privateChatActivity = this.f25337OooO0Oo;
        UserInfo value = privateChatActivity.OooOo().getChatUserInfo().getValue();
        if (value != null) {
            ((YallaChatVM) privateChatActivity.f25246OooOo0O.getValue()).friendYallaChat(value.getUserId()).observe(privateChatActivity, new PrivateChatActivity.OooOOO(new o000OOo0(privateChatActivity)));
        }
        return Unit.INSTANCE;
    }
}
