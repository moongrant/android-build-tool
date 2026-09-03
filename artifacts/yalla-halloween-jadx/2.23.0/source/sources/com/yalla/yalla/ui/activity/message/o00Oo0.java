package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25911OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(1);
        this.f25911OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer it = num;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        int iIntValue = it.intValue();
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25911OooO0Oo;
        if (iIntValue > 0) {
            TextView textView = friendRequestMessageActivity.f25652OooOo0;
            if (textView != null) {
                com.code.android.util.o000OO00.OooOOOO(textView);
            }
            friendRequestMessageActivity.OooOoO0().f59046OooO0OO.OooO0Oo();
        } else {
            int i = FriendRequestMessageActivity.f25650OooOo0o;
            friendRequestMessageActivity.OooOoO0().f59046OooO0OO.OooO0o0();
            TextView textView2 = friendRequestMessageActivity.f25652OooOo0;
            if (textView2 != null) {
                com.code.android.util.o000OO00.OooO0O0(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
