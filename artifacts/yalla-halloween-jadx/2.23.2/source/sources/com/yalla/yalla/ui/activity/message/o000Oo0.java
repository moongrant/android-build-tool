package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function3<h3<ChatMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25375OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25375OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(h3<ChatMessage> h3Var, View view, Integer num) {
        h3<ChatMessage> chatMessageBasePagingAdapter = h3Var;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        ArrayList arrayList = new ArrayList();
        if (data.getContentType() == 1) {
            MoreTag moreTag = MoreTag.copy;
            arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag));
            if (data.getIsAcceptMsg()) {
                arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Report), MoreTag.report));
            }
        } else if (data.getContentType() == 2 && data.getIsAcceptMsg()) {
            arrayList.add(new MoreModel(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Report), MoreTag.report));
        }
        if (!arrayList.isEmpty()) {
            PrivateChatActivity privateChatActivity = this.f25375OooO0Oo;
            p205o00o0o0o.o000O0o o000o0o2 = new p205o00o0o0o.o000O0o(privateChatActivity, null);
            o000o0o2.OooOOO(arrayList);
            o000o0o2.OooOOo0(new o000O0o(data, privateChatActivity, num2));
            o000o0o2.OooOO0o();
        }
        return Boolean.FALSE;
    }
}
