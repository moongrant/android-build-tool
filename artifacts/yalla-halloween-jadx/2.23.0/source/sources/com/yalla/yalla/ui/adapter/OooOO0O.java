package com.yalla.yalla.ui.adapter;

import android.widget.TextView;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.model.moment.MomentToShareFriend;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TextView f27419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Conversation f27420OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(TextView textView, Conversation conversation) {
        super(1);
        this.f27419OooO0Oo = textView;
        this.f27420OooO0o0 = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        Conversation conversation = this.f27420OooO0o0;
        String strOooO00o = conversation.getIsAcceptMsg() ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.XXX_shared_a_post_with_you), str2) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.You_shared_a_post_with_XXX), str2);
        TextView textView = this.f27419OooO0Oo;
        textView.setText(strOooO00o);
        if (conversation.getMomentType() != MomentToShareFriend.Poll.getValue()) {
            return null;
        }
        textView.setText(conversation.getIsAcceptMsg() ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.moment_poll_share_from_user), str2) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.moment_poll_share_to_user), str2));
        return null;
    }
}
