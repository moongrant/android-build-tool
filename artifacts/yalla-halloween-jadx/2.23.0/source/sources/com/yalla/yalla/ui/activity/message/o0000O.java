package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f25801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f25802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25803OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(ChatMessage chatMessage, PrivateChatActivity privateChatActivity, Integer num) {
        super(2);
        this.f25801OooO0Oo = chatMessage;
        this.f25803OooO0o0 = privateChatActivity;
        this.f25802OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        MoreModel moreModel2 = moreModel;
        Intrinsics.checkNotNull(moreModel2);
        MoreTag tag = moreModel2.getTag();
        MoreTag moreTag = MoreTag.copy;
        PrivateChatActivity privateChatActivity = this.f25803OooO0o0;
        if (tag == moreTag) {
            String message = this.f25801OooO0Oo.getMessage();
            String string = privateChatActivity.getString(oO00OOo0.Copied);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Copied)");
            p417o0OoO0.o0000O0O.OooO00o(privateChatActivity, message, string);
        } else if (moreModel2.getTag() == MoreTag.report) {
            p587o0oOooo.o0OO000.OooO00o("104001");
            int i = PrivateChatActivity.f25694Oooo000;
            long targetId = privateChatActivity.OooOo().getTargetId();
            PrivateChatAdapter privateChatAdapterOooOo0O = privateChatActivity.OooOo0O();
            UserInfo userInfo = privateChatActivity.OooOo().userInfo();
            Intrinsics.checkNotNull(userInfo);
            p430o0OoOOO0.o0O0ooO.OooO00o(targetId, privateChatAdapterOooOo0O, this.f25802OooO0o, userInfo);
        }
        return Unit.INSTANCE;
    }
}
