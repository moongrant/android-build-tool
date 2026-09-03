package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.MessageIM;
import com.app.base.protobuf.room.Room;
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
import kotlin.text.StringsKt;
import p593o0oOoooO.h0;
import p675oO0Oo.oO0O00;
import p675oO0Oo.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25342OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f25343OooO0o0;

    public /* synthetic */ o000000(int i, View.OnClickListener onClickListener) {
        this.f25342OooO0Oo = i;
        this.f25343OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = this.f25342OooO0Oo;
        int i3 = 0;
        View.OnClickListener onClickListener = this.f25343OooO0o0;
        switch (i2) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) onClickListener;
                MessageIM.SendGiftReply sendGiftReply = (MessageIM.SendGiftReply) obj;
                int i4 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (sendGiftReply != null) {
                    try {
                        if (sendGiftReply.getLuckyFlag() == 1) {
                            p675oO0Oo.o0OO000.OooO00o().getClass();
                            oO0O00 oo0o00 = new oO0O00(this$0);
                            String string = this$0.getString(p565o0oOo000.o000OOo.lucky_gift_congratulation_content);
                            TextView textView = oo0o00.f59672OooOO0O;
                            if (textView != null) {
                                textView.setText(string);
                                oo0o00.f59672OooOO0O.setVisibility(0);
                            }
                            long luckyMoney = sendGiftReply.getLuckyMoney();
                            StringBuilder sb = new StringBuilder();
                            sb.append(luckyMoney);
                            String string2 = sb.toString();
                            TextView textView2 = oo0o00.f59675OooOOO0;
                            if (textView2 != null) {
                                textView2.setText(string2);
                                oo0o00.f59675OooOOO0.setVisibility(0);
                            }
                            oo0o00.show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 1:
                RoomSettingActivity this$1 = (RoomSettingActivity) onClickListener;
                int i5 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26202OooOoOO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$1.f26196OooOo0;
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
                if (i > -1 && (roomConfiguration = this$1.f26196OooOo0) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 2:
                oO0O00oO this$2 = (oO0O00oO) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.GetBonusReply");
                Room.GetBonusReply getBonusReply = (Room.GetBonusReply) obj;
                long j = this$2.f59687OooOOO;
                if (j > 0 && j == getBonusReply.getBonusid() && !this$2.f59688OooOOO0) {
                    int state = getBonusReply.getState();
                    if (state == this$2.f59695OooOo0) {
                        this$2.f59688OooOOO0 = true;
                        this$2.OooOO0().f43942OooO0OO.setVisibility(4);
                        this$2.OooOO0().f43945OooO0o0.setVisibility(4);
                        this$2.OooOO0().f43943OooO0Oo.setVisibility(0);
                        this$2.OooOO0().f43944OooO0o.setVisibility(0);
                        this$2.OooOO0().f43950OooOO0o.setText(String.valueOf(getBonusReply.getBonuscount()));
                        if (getBonusReply.getBonustype() == 2) {
                            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$2.f59572OooO0Oo);
                            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(getBonusReply.getGiftimg());
                            oooO00o.f43125OooO00o = 0;
                            oooO00o.f43139OooOOOo = p565o0oOo000.o0OOO0o.room_dialog_lucky_golds_send_gift_item_default;
                            oooO00o.OooO0Oo(this$2.OooOO0().f43951OooOOO);
                        } else {
                            this$2.OooOO0().f43951OooOOO.setImageResource(p565o0oOo000.o0OOO0o.coin3);
                        }
                        break;
                    } else if (state == this$2.f59697OooOo0O) {
                        this$2.OooOO0o(getBonusReply.getBonustype(), getBonusReply.getBonusid());
                        break;
                    } else if (state == this$2.f59698OooOo0o || state == this$2.f59694OooOo) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.lucky_golds_max_today);
                        if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) == 0) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                StoreCoinFragment this$3 = (StoreCoinFragment) onClickListener;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                h0.OooO0O0("105035");
                if (!com.code.android.util.OooOo00.OooO00o(url)) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32289OooO0o0 = url;
                    webPageInfo.f32286OooO = true;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_unique_id));
                    int i7 = WebActivity.f25131OooOoO0;
                    FragmentActivity fragmentActivityRequireActivity = this$3.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
        }
    }
}
