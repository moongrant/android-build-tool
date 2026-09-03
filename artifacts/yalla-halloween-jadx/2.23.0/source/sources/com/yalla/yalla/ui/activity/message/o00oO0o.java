package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendRequestMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25914OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25914OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(p400o0Oo0OO.OooOO0O<FriendRequestMessage> oooOO0O, View view, Integer num) {
        p400o0Oo0OO.OooOO0O<FriendRequestMessage> adapter = oooOO0O;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        long targetUserId = adapter.getData(iIntValue).getTargetUserId();
        int i = FriendRequestMessageActivity.f25650OooOo0o;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25914OooO0Oo;
        friendRequestMessageActivity.getClass();
        p157o00OoOO0.o00O0O o00o0o2 = new p157o00OoOO0.o00O0O(friendRequestMessageActivity, null);
        MoreTag moreTag = MoreTag.delete;
        MoreModel item = new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = o00o0o2.f38233OooO0oo;
        arrayList.clear();
        arrayList.add(item);
        o00o0o2.f38231OooO.notifyDataSetChanged();
        o00o0o2.OooOOo0(new o0OOO0o(friendRequestMessageActivity, targetUserId));
        o00o0o2.OooOO0o();
        return Boolean.TRUE;
    }
}
