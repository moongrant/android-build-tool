package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function3<h3<FriendRequestMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25472OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25472OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(h3<FriendRequestMessage> h3Var, View view, Integer num) {
        h3<FriendRequestMessage> adapter = h3Var;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        long targetUserId = adapter.getData(iIntValue).getTargetUserId();
        int i = FriendRequestMessageActivity.f25195OooOo0o;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25472OooO0Oo;
        friendRequestMessageActivity.getClass();
        p205o00o0o0o.o000O0o o000o0o2 = new p205o00o0o0o.o000O0o(friendRequestMessageActivity, null);
        MoreTag moreTag = MoreTag.delete;
        MoreModel item = new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = o000o0o2.f39375OooO0oo;
        arrayList.clear();
        arrayList.add(item);
        o000o0o2.f39373OooO.notifyDataSetChanged();
        o000o0o2.OooOOo0(new o0OOO0o(friendRequestMessageActivity, targetUserId));
        o000o0o2.OooOO0o();
        return Boolean.TRUE;
    }
}
