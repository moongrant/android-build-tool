package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.MessageIM;
import p519o0o0O0oO.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 implements Observer<MessageIM.SendGiftReply> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25812OooO0Oo;

    public o000O0(PrivateChatActivity privateChatActivity) {
        this.f25812OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MessageIM.SendGiftReply sendGiftReply) {
        MessageIM.SendGiftReply sendGiftReply2 = sendGiftReply;
        PrivateChatActivity privateChatActivity = this.f25812OooO0Oo;
        if (sendGiftReply2 != null) {
            try {
                if (sendGiftReply2.getLuckyFlag() == 1) {
                    p519o0o0O0oO.o0O00O0o.OooO00o().getClass();
                    oO00OO0O oo00oo0o = new oO00OO0O(privateChatActivity);
                    String string = privateChatActivity.getString(oO00OOo0.lucky_gift_congratulation_content);
                    TextView textView = oo00oo0o.f52822OooOO0O;
                    if (textView != null) {
                        textView.setText(string);
                        oo00oo0o.f52822OooOO0O.setVisibility(0);
                    }
                    long luckyMoney = sendGiftReply2.getLuckyMoney();
                    StringBuilder sb = new StringBuilder();
                    sb.append(luckyMoney);
                    String string2 = sb.toString();
                    TextView textView2 = oo00oo0o.f52825OooOOO0;
                    if (textView2 != null) {
                        textView2.setText(string2);
                        oo00oo0o.f52825OooOOO0.setVisibility(0);
                    }
                    oo00oo0o.show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
