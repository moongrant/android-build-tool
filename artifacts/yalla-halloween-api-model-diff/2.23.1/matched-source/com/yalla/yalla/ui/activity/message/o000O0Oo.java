package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p675oO0Oo.s5;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPrivateChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity$initObserve$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,792:1\n1#2:793\n*E\n"})
public final class o000O0Oo extends Lambda implements Function1<Pair<? extends Integer, ? extends ChatMessage>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25364OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25364OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends ChatMessage> pair) {
        Pair<? extends Integer, ? extends ChatMessage> pair2 = pair;
        PrivateChatActivity privateChatActivity = this.f25364OooO0Oo;
        privateChatActivity.f25251OooOoOO = false;
        if (pair2 != null) {
            ChatMessage second = pair2.getSecond();
            if (second.getGiveRoomThemeInfo() != null) {
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = second.getGiveRoomThemeInfo();
                s5 s5Var = new s5(privateChatActivity, new o000O(privateChatActivity, second), o000OO00.f25369OooO0Oo);
                privateChatActivity.f25249OooOoO = s5Var;
                Intrinsics.checkNotNull(s5Var);
                boolean isAcceptMsg = second.getIsAcceptMsg();
                int iIntValue = pair2.getFirst().intValue();
                Intrinsics.checkNotNull(giveRoomThemeInfo);
                s5Var.OooOO0o(giveRoomThemeInfo.getThemeBgImgUrl(), iIntValue, giveRoomThemeInfo.getThemeVideoUrl(), isAcceptMsg);
                s5 s5Var2 = privateChatActivity.f25249OooOoO;
                Intrinsics.checkNotNull(s5Var2);
                s5Var2.OooO();
            }
        }
        return Unit.INSTANCE;
    }
}
