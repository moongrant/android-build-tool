package com.yalla.yalla.ui.activity.message;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.StoreCoinFragment;
import com.yalla.yalla.util.WebPageInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.o0OOO0;
import p650o0ooo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f25344OooO0o0;

    public /* synthetic */ o000000(int i, View.OnClickListener onClickListener) {
        this.f25343OooO0Oo = i;
        this.f25344OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = this.f25343OooO0Oo;
        int i3 = 0;
        View.OnClickListener onClickListener = this.f25344OooO0o0;
        switch (i2) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) onClickListener;
                MessageIM.SendGiftReply sendGiftReply = (MessageIM.SendGiftReply) obj;
                int i4 = PrivateChatActivity.f25239Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (sendGiftReply != null) {
                    try {
                        if (sendGiftReply.getLuckyFlag() == 1) {
                            p650o0ooo.o00O0OO0.OooO00o().getClass();
                            o0OOO0 o0ooo1 = new o0OOO0(this$0);
                            String string = this$0.getString(p562o0oOo000.o000000.lucky_gift_congratulation_content);
                            TextView textView = o0ooo1.f58692OooOO0O;
                            if (textView != null) {
                                textView.setText(string);
                                o0ooo1.f58692OooOO0O.setVisibility(0);
                            }
                            long luckyMoney = sendGiftReply.getLuckyMoney();
                            StringBuilder sb = new StringBuilder();
                            sb.append(luckyMoney);
                            String string2 = sb.toString();
                            TextView textView2 = o0ooo1.f58695OooOOO0;
                            if (textView2 != null) {
                                textView2.setText(string2);
                                o0ooo1.f58695OooOOO0.setVisibility(0);
                            }
                            o0ooo1.show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 1:
                RoomSettingActivity this$1 = (RoomSettingActivity) onClickListener;
                int i5 = RoomSettingActivity.f26191Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26200OooOoOO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$1.f26194OooOo0;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i6 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 2) {
                            i = i3;
                        }
                        i3 = i6;
                    }
                }
                if (i > -1 && (roomConfiguration = this$1.f26194OooOo0) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 2:
                o0OOOO0o this$2 = (o0OOOO0o) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (Intrinsics.areEqual(obj, (Object) 0)) {
                    AppCompatTextView selected = this$2.OooOO0().f43935OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(selected, "selected");
                    p423o0OoO0OO.o00O0O0O.OooO0oO(selected, this$2.f58704OooOO0o);
                } else {
                    AppCompatTextView selected2 = this$2.OooOO0().f43935OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(selected2, "selected");
                    p423o0OoO0OO.o00O0O0O.OooO0oO(selected2, this$2.f58703OooOO0O);
                }
                break;
            default:
                StoreCoinFragment this$3 = (StoreCoinFragment) onClickListener;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (!com.code.android.util.OooOo00.OooO00o(url)) {
                    o0oo0000.OooO00o.OooO0O0("105036");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    webPageInfo.f32280OooO = true;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_unique_id));
                    int i7 = WebActivity.f25130OooOoO0;
                    FragmentActivity fragmentActivityRequireActivity = this$3.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
        }
    }
}
