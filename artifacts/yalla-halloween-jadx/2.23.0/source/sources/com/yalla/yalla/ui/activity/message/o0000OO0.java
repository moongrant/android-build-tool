package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<ChatMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25807OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25807OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(p400o0Oo0OO.OooOO0O<ChatMessage> oooOO0O, View view, Integer num) {
        p400o0Oo0OO.OooOO0O<ChatMessage> chatMessageBasePagingAdapter = oooOO0O;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        ArrayList arrayList = new ArrayList();
        if (data.getContentType() == 1) {
            MoreTag moreTag = MoreTag.copy;
            arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag));
            if (data.getIsAcceptMsg()) {
                arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Report), MoreTag.report));
            }
        } else if (data.getContentType() == 2 && data.getIsAcceptMsg()) {
            arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Report), MoreTag.report));
        }
        if (!arrayList.isEmpty()) {
            PrivateChatActivity privateChatActivity = this.f25807OooO0Oo;
            p157o00OoOO0.o00O0O o00o0o2 = new p157o00OoOO0.o00O0O(privateChatActivity, null);
            o00o0o2.OooOOO(arrayList);
            o00o0o2.OooOOo0(new o0000O(data, privateChatActivity, num2));
            o00o0o2.OooOO0o();
        }
        return Boolean.FALSE;
    }
}
