package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.x3;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function1<Pair<? extends Integer, ? extends ChatMessage>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25821OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25821OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends ChatMessage> pair) {
        x3 x3Var;
        Pair<? extends Integer, ? extends ChatMessage> pair2 = pair;
        PrivateChatActivity privateChatActivity = this.f25821OooO0Oo;
        privateChatActivity.f25705OooOoOO = false;
        if (pair2 != null && (x3Var = privateChatActivity.f25703OooOoO) != null) {
            Intrinsics.checkNotNull(x3Var);
            if (x3Var.OooO0OO() && pair2.getSecond().getGiveRoomThemeInfo() != null) {
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = pair2.getSecond().getGiveRoomThemeInfo();
                x3 x3Var2 = privateChatActivity.f25703OooOoO;
                Intrinsics.checkNotNull(x3Var2);
                boolean isAcceptMsg = pair2.getSecond().getIsAcceptMsg();
                Integer first = pair2.getFirst();
                Intrinsics.checkNotNull(first);
                int iIntValue = first.intValue();
                Intrinsics.checkNotNull(giveRoomThemeInfo);
                x3Var2.OooOO0o(giveRoomThemeInfo.getThemeBgImgUrl(), iIntValue, giveRoomThemeInfo.getThemeVideoUrl(), isAcceptMsg);
            }
        }
        return Unit.INSTANCE;
    }
}
