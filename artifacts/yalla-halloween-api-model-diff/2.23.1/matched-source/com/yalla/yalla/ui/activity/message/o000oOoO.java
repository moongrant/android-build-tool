package com.yalla.yalla.ui.activity.message;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000oOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f25376OooO0o0;

    public /* synthetic */ o000oOoO(KeyEvent.Callback callback, int i) {
        this.f25375OooO0Oo = i;
        this.f25376OooO0o0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25375OooO0Oo;
        KeyEvent.Callback callback = this.f25376OooO0o0;
        switch (i) {
            case 0:
                FriendRequestMessageActivity this$0 = (FriendRequestMessageActivity) callback;
                int i2 = FriendRequestMessageActivity.f25196OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
                o000o.OooOOoo(p565o0oOo000.o000OOo.message_clear_friend_request);
                o000o.OooOo(true);
                o000o.OooOo0(new o0ooOOo(this$0));
                o000o.OooOO0o();
                break;
            default:
                LiveEventBus.get("MainSearchSetText").post(((TextView) callback).getText().toString());
                break;
        }
    }
}
