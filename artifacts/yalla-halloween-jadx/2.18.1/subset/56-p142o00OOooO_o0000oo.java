package p142o00OOooO;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFragment;
import com.app.base.protobuf.MessageIM;
import com.app.base.protobuf.room.Room;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.momentDetail.PostDetailTopicHeader;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OOO.OooO00o;
import p139o00OOOo0.o000Oo0;
import p139o00OOOo0.o0ooOOo;
import p168o00Ooo0.o00O0O;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oo0o0O0;
import p579o0oOoOOo.oOOO000o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31936OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31937OooO0O0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f31936OooO00o = i;
        this.f31937OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31936OooO00o) {
            case 0:
                MainMomentFragment.m33initObserver$lambda9((MainMomentFragment) this.f31937OooO0O0, obj);
                break;
            case 1:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f31937OooO0O0;
                MessageIM.SendGiftReply sendGiftReply = (MessageIM.SendGiftReply) obj;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (sendGiftReply != null) {
                    try {
                        if (sendGiftReply.getLuckyFlag() == 1) {
                            Objects.requireNonNull(o0ooOOo.OooO00o());
                            o000Oo0 o000oo1 = new o000Oo0(this$0);
                            String string = this$0.getString(R.string.lucky_gift_congratulation_content);
                            TextView textView = o000oo1.f31799OoooO;
                            if (textView != null) {
                                textView.setText(string);
                                o000oo1.f31799OoooO.setVisibility(0);
                            }
                            String str = "" + sendGiftReply.getLuckyMoney();
                            TextView textView2 = o000oo1.f31804o000oOoO;
                            if (textView2 != null) {
                                textView2.setText(str);
                                o000oo1.f31804o000oOoO.setVisibility(0);
                            }
                            o000oo1.show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31937OooO0O0;
                Response response = (Response) obj;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (response.getIsSuccess()) {
                    PostDetailTopicHeader postDetailTopicHeader = this$1.OooOooO().f50592OooOOo0;
                    TopicInfoModel topicInfoModel = (TopicInfoModel) response.getData();
                    postDetailTopicHeader.f22720OoooO0O = this$1;
                    postDetailTopicHeader.f22717OoooO = topicInfoModel;
                    postDetailTopicHeader.OooO0O0();
                    o00O00.OooO0O0("PostDetailTopicHeader = " + postDetailTopicHeader.getData());
                    if (postDetailTopicHeader.getData() != null && postDetailTopicHeader.getData().getId() > 0) {
                        postDetailTopicHeader.f22714Oooo0o.setVisibility(0);
                        postDetailTopicHeader.f22718OoooO0.setVisibility(0);
                        postDetailTopicHeader.f22715Oooo0oO.setImageResource(R.drawable.icon_head_default_circular);
                        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(postDetailTopicHeader.getContext());
                        oooO00o3.OooO00o(OooO00o.OooO0o());
                        oooO00o3.f48441OooOOOo = R.drawable.icon_head_default_circular;
                        oooO00o3.f48431OooO0o = R.drawable.icon_head_default_circular;
                        oooO00o3.OooO0oO(postDetailTopicHeader.f22721OoooOO0);
                        oooO00o3.f48429OooO0OO = postDetailTopicHeader.f22717OoooO.getImage();
                        oooO00o3.f48427OooO00o = 0;
                        oooO00o3.OooO0o(postDetailTopicHeader.f22715Oooo0oO);
                        Drawable drawableOooO0O0 = postDetailTopicHeader.getData().isOwner() ? OooOOO.OooO0O0(R.drawable.ic_topic_owner) : null;
                        if (postDetailTopicHeader.getData().isManager()) {
                            drawableOooO0O0 = OooOOO.OooO0O0(R.drawable.ic_topic_manager);
                        }
                        oo0o0O0.OooO0oO(postDetailTopicHeader.f22716Oooo0oo, drawableOooO0O0);
                        postDetailTopicHeader.f22716Oooo0oo.setText(postDetailTopicHeader.getData().getName());
                        postDetailTopicHeader.f22713Oooo.OooO00o(postDetailTopicHeader.getData().getJoinNum(), postDetailTopicHeader.getData().getDyNum(), postDetailTopicHeader.getData().getPropPriceTotal());
                        postDetailTopicHeader.f22719OoooO00.setText(postDetailTopicHeader.getActivity().getString(R.string.topic_description_hint));
                        if (!TextUtils.isEmpty(postDetailTopicHeader.getData().getDescribe())) {
                            postDetailTopicHeader.f22719OoooO00.setText(postDetailTopicHeader.getData().getDescribe());
                        }
                        break;
                    }
                }
                break;
            case 3:
                UserInfoActivity this$2 = (UserInfoActivity) this.f31937OooO0O0;
                String str2 = (String) obj;
                UserInfoActivity.OooO00o oooO00o4 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                o00O0O o00o0o2 = this$2.f23455Ooooo0o;
                if (o00o0o2 != null) {
                    o00o0o2.OooO00o(str2);
                }
                break;
            case 4:
                oOOO000o this$3 = (oOOO000o) this.f31937OooO0O0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.GetBonusReply");
                Room.GetBonusReply getBonusReply = (Room.GetBonusReply) obj;
                int i = this$3.f46106OoooOOO;
                if (i > 0 && i == getBonusReply.getBonusid() && !this$3.f46117o000oOoO) {
                    int state = getBonusReply.getState();
                    if (state == this$3.f46113OooooO0) {
                        this$3.f46117o000oOoO = true;
                        this$3.OooOO0O().f49387OooO0OO.setVisibility(4);
                        this$3.OooOO0O().f49390OooO0o0.setVisibility(4);
                        this$3.OooOO0O().f49388OooO0Oo.setVisibility(0);
                        this$3.OooOO0O().f49389OooO0o.setVisibility(0);
                        this$3.OooOO0O().f49395OooOO0o.setText(String.valueOf(getBonusReply.getBonuscount()));
                        if (getBonusReply.getBonustype() != 2) {
                            this$3.OooOO0O().f49396OooOOO.setImageResource(R.drawable.coin3);
                        } else {
                            oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(this$3.f41543Oooo0o);
                            oooO00o5.f48429OooO0OO = CloudImageUtilKt.imgFormat(getBonusReply.getGiftimg());
                            oooO00o5.f48427OooO00o = 0;
                            oooO00o5.f48441OooOOOo = R.drawable.room_dialog_lucky_golds_send_gift_item_default;
                            oooO00o5.OooO0o(this$3.OooOO0O().f49396OooOOO);
                        }
                        break;
                    } else if (state == this$3.f46114OooooOO) {
                        this$3.OooOOO0(getBonusReply.getBonusid(), getBonusReply.getBonustype());
                        break;
                    } else if (state == this$3.f46115OooooOo) {
                        String strOooO0OO = OooOOO.OooO0OO(R.string.lucky_golds_max_today);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o001 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            } else {
                                o0o0oooOooO0O0.run();
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                ((RoomThemeCustomizeVM) this.f31937OooO0O0).loadThemePrice();
                break;
        }
    }
}
