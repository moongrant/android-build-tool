package p144o00OOooo;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.RoomEffectGiftPlayer;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.FaqTag;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import com.yalla.yalla.util.NetWork;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OOO.OooO00o;
import p169o00Ooo0.o0O0O00;
import p169o00Ooo0.oo000o;
import p255o00ooO0O.oOO00O;
import p489o0o000oO.o0OOO0o;
import p489o0o000oO.o0ooOOo;
import p526o0o0O0oO.o0O000;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32022OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32023OooO0O0;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f32022OooO00o = i;
        this.f32023OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f32022OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m53initObserve$lambda17((RoomInfoMemberListFragment) this.f32023OooO0O0, (Long) obj);
                break;
            case 1:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32023OooO0O0;
                List<Room.RoshamboModel> list = (List) obj;
                int i = RoomMoraGameListDialog.f12175Ooooo00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f12178OoooOOo.setNewData(list);
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                if (z) {
                    this$0.dismiss();
                }
                break;
            case 2:
                RoomEffectGiftPlayer.m255_init_$lambda0((RoomEffectGiftPlayer) this.f32023OooO0O0, ((Boolean) obj).booleanValue());
                break;
            case 3:
                GiftSendFragment.m289initData$lambda2((GiftSendFragment) this.f32023OooO0O0, (List) obj);
                break;
            case 4:
                va bindingDrawer = (va) this.f32023OooO0O0;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                if (((Number) pair.getFirst()).intValue() != VipState.Vip.getValue()) {
                    ImageView imageView = bindingDrawer.f50811OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(imageView, "bindingDrawer.ivKaVip");
                    oOO00O.OooO00o(imageView);
                } else if (((Number) pair.getSecond()).intValue() > VipLevel.Vip0.getValue()) {
                    ImageView imageView2 = bindingDrawer.f50811OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "bindingDrawer.ivKaVip");
                    oOO00O.OooO(imageView2);
                    bindingDrawer.f50811OooO0Oo.setImageResource(VipLevel.INSTANCE.OooO00o(((Number) pair.getSecond()).intValue()));
                }
                if (((Number) pair.getSecond()).intValue() <= 0) {
                    TextView textView = bindingDrawer.f50812OooO0o.f50894OooOo0o;
                    Intrinsics.checkNotNullExpressionValue(textView, "bindingDrawer.list.tvNotVip");
                    oOO00O.OooO(textView);
                    ImageView imageView3 = bindingDrawer.f50812OooO0o.f50878OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "bindingDrawer.list.ivVip");
                    oOO00O.OooO00o(imageView3);
                    break;
                } else {
                    TextView textView2 = bindingDrawer.f50812OooO0o.f50894OooOo0o;
                    Intrinsics.checkNotNullExpressionValue(textView2, "bindingDrawer.list.tvNotVip");
                    oOO00O.OooO00o(textView2);
                    ImageView imageView4 = bindingDrawer.f50812OooO0o.f50878OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "bindingDrawer.list.ivVip");
                    oOO00O.OooO(imageView4);
                    int i2 = o0O000.OooO00o.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(((Number) pair.getSecond()).intValue()).ordinal()];
                    if (i2 == 1) {
                        bindingDrawer.f50812OooO0o.f50878OooO0oO.setImageResource((((Number) pair.getFirst()).intValue() == VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) ? R.mipmap.main_ka_vip_frozen_1 : R.mipmap.main_ka_vip_1);
                        break;
                    } else if (i2 == 2) {
                        bindingDrawer.f50812OooO0o.f50878OooO0oO.setImageResource((((Number) pair.getFirst()).intValue() == VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) ? R.mipmap.main_ka_vip_frozen_2 : R.mipmap.main_ka_vip_2);
                        break;
                    } else if (i2 == 3) {
                        bindingDrawer.f50812OooO0o.f50878OooO0oO.setImageResource((((Number) pair.getFirst()).intValue() == VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) ? R.mipmap.main_ka_vip_frozen_3 : R.mipmap.main_ka_vip_3);
                        break;
                    } else if (i2 == 4) {
                        bindingDrawer.f50812OooO0o.f50878OooO0oO.setImageResource((((Number) pair.getFirst()).intValue() == VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) ? R.mipmap.main_ka_vip_frozen_4 : R.mipmap.main_ka_vip_4);
                        break;
                    } else if (i2 == 5) {
                        bindingDrawer.f50812OooO0o.f50878OooO0oO.setImageResource((((Number) pair.getFirst()).intValue() == VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) ? R.mipmap.main_ka_vip_frozen_5 : R.mipmap.main_ka_vip_5);
                        break;
                    }
                }
                break;
            case 5:
                VoteGameCreateActivity this$1 = (VoteGameCreateActivity) this.f32023OooO0O0;
                List list2 = (List) obj;
                VoteGameCreateActivity.OooO00o oooO00o = VoteGameCreateActivity.f23092OoooooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (list2.size() > 0) {
                    this$1.f23097Oooooo0 = (VoteGameGift) ((List) list2.get(0)).get(0);
                    oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this$1);
                    oooO00o2.OooO00o(OooO00o.OooO0Oo());
                    VoteGameGift voteGameGift = this$1.f23097Oooooo0;
                    oooO00o2.f48447OooO0OO = voteGameGift != null ? voteGameGift.getGiftImageUrl() : null;
                    oooO00o2.f48445OooO00o = 0;
                    oooO00o2.OooO0o(this$1.OooOoo().f50967OooO0OO);
                    this$1.OooOoo().f50968OooO0Oo.setOnClickListener(this$1);
                    break;
                }
                break;
            case 6:
                WalletActivity this$2 = (WalletActivity) this.f32023OooO0O0;
                long jLongValue = ((Long) obj).longValue();
                WalletActivity.OooO00o oooO00o3 = WalletActivity.f23287ooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (this$2.f23291Oooooo == 1.0d) {
                    this$2.OooOoo().f51133OooO0oO.setText(o0O0O00.OooO0Oo(jLongValue + ""));
                }
                break;
            case 7:
                FragmentActivity it = (FragmentActivity) this.f32023OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                if (url != null && !StringsKt.isBlank(url)) {
                    z = false;
                }
                if (!z) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.OooO00o("isReply", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    webPageInfo.OooO00o("region", String.valueOf(oo000o.OooO0O0()));
                    o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
                    webPageInfo.OooO00o("appVersion", o0ooOOo.OooO0O0());
                    StringBuilder sb = new StringBuilder();
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40953OooO00o;
                    sb.append(o0OOO0o.OooO0O0());
                    sb.append(' ');
                    sb.append(o0OOO0o.OooO0OO());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, sb.toString());
                    webPageInfo.OooO00o("sysVersion", o0OOO0o.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.RechargeOrSubscription.getValue()));
                    WebActivity.f22127ooOO.OooO00o(it, webPageInfo);
                    break;
                }
                break;
            default:
                GuessListFragment.m334onLazyInit$lambda2((GuessListFragment) this.f32023OooO0O0, (ApiResult) obj);
                break;
        }
    }
}
