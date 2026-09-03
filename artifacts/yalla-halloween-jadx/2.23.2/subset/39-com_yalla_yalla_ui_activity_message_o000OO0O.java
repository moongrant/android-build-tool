package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.w3;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function1<Pair<? extends Integer, ? extends ChatMessage>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25371OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25371OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends ChatMessage> pair) {
        w3 w3Var;
        Pair<? extends Integer, ? extends ChatMessage> pair2 = pair;
        PrivateChatActivity privateChatActivity = this.f25371OooO0Oo;
        privateChatActivity.f25250OooOoOO = false;
        if (pair2 != null && (w3Var = privateChatActivity.f25248OooOoO) != null) {
            Intrinsics.checkNotNull(w3Var);
            if (w3Var.OooO0OO() && pair2.getSecond().getGiveRoomThemeInfo() != null) {
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = pair2.getSecond().getGiveRoomThemeInfo();
                w3 w3Var2 = privateChatActivity.f25248OooOoO;
                Intrinsics.checkNotNull(w3Var2);
                boolean isAcceptMsg = pair2.getSecond().getIsAcceptMsg();
                Integer first = pair2.getFirst();
                Intrinsics.checkNotNull(first);
                int iIntValue = first.intValue();
                Intrinsics.checkNotNull(giveRoomThemeInfo);
                w3Var2.OooOO0o(giveRoomThemeInfo.getThemeBgImgUrl(), iIntValue, giveRoomThemeInfo.getThemeVideoUrl(), isAcceptMsg);
            }
        }
        return Unit.INSTANCE;
    }
}
