package p142o00OOooO;

import android.graphics.Path;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.vm.event.EventSquareViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p028Oooo0o0.o00O0O0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p558o0oOOoo.o0O0o;
import p616o0oo0Ooo.oO0O00;
import p630o0ooO00.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31921OooO0O0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f31920OooO00o = i;
        this.f31921OooO0O0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31920OooO00o) {
            case 0:
                MainMomentFollowingFragment.m20initObserver$lambda4((MainMomentFollowingFragment) this.f31921OooO0O0, (Boolean) obj);
                break;
            case 1:
                PostDetailActivity this$0 = (PostDetailActivity) this.f31921OooO0O0;
                MomentDetailModel result = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$0.f22420Ooooo0o;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getId()) {
                    this$0.f22420Ooooo0o = result;
                }
                MomentDetailModel momentDetailModel2 = this$0.f22420Ooooo0o;
                if (momentDetailModel2 != null) {
                    this$0.Oooo000().setPostDetailModel(momentDetailModel2);
                    momentDetailModel2.setSessionId(this$0.f22435o0OO00O);
                    this$0.OooOooO().f50590OooOOOo.setPraiseCount(momentDetailModel2.getPraiseNum());
                    this$0.OooOooO().f50590OooOOOo.setCommentCount(momentDetailModel2.getCommentNum());
                    this$0.OooOooO().f50590OooOOOo.setGiftTotalPropValue(momentDetailModel2.getTotalPropValue());
                }
                break;
            case 2:
                o0O0o this$1 = (o0O0o) this.f31921OooO0O0;
                RoomPKResultModel roomPKResultModel = (RoomPKResultModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (roomPKResultModel != null) {
                    this$1.f44810OooO0OO = true;
                    ConstraintLayout constraintLayout = this$1.OooO0OO().f49277OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                    oOO00O.OooO(constraintLayout);
                    TextView textView = this$1.OooO0OO().f49293OooOOo0;
                    StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
                    sbOooO00o.append(roomPKResultModel.getPk_time_duration() / 60);
                    sbOooO00o.append(o000O0O0.OooO0OO(R.string.room_pk_minute));
                    sbOooO00o.append(')');
                    textView.setText(sbOooO00o.toString());
                    oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o2.f48429OooO0OO = roomPKResultModel.getRoom_a_picurl();
                    oooO00o2.f48427OooO00o = 0;
                    oooO00o2.OooO0oo(4, 0, 4, 0);
                    oooO00o2.f48454OooOoo0 = 2;
                    oooO00o2.OooO0o(this$1.OooO0OO().f49286OooOO0O);
                    this$1.OooO0OO().f49288OooOOO.setText(roomPKResultModel.getRoom_a_name());
                    oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o3.f48433OooO0oO = R.drawable.room_ic_pk_name_bg_left;
                    oooO00o3.f48427OooO00o = 1;
                    oooO00o3.OooO0oo(0, 0, 4, 0);
                    oooO00o3.OooO0o(this$1.OooO0OO().f49280OooO0Oo);
                    Path path = new Path();
                    path.moveTo(OooOo00.OooO00o(13), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float f = 66;
                    path.lineTo(OooOo00.OooO00o(f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float f2 = 40;
                    path.lineTo(OooOo00.OooO00o(f), OooOo00.OooO00o(f2));
                    path.lineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO00o(f2));
                    path.lineTo(OooOo00.OooO00o(15), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    this$1.OooO0OO().f49287OooOO0o.setClipPath(path);
                    oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o4.f48433OooO0oO = R.drawable.room_ic_pk_name_bg_right;
                    oooO00o4.f48427OooO00o = 1;
                    oooO00o4.OooO0oo(0, 0, 0, 4);
                    oooO00o4.OooO0o(this$1.OooO0OO().f49282OooO0o0);
                    this$1.OooO0OO().f49292OooOOo.setText(roomPKResultModel.getRoom_b_name());
                    oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o5.f48429OooO0OO = roomPKResultModel.getRoom_b_picurl();
                    oooO00o5.f48427OooO00o = 0;
                    oooO00o5.OooO0oo(0, 4, 0, 4);
                    oooO00o5.f48454OooOoo0 = 2;
                    oooO00o5.OooO0o(this$1.OooO0OO().f49287OooOO0o);
                    if (roomPKResultModel.getRoom_a_giftnumber() > roomPKResultModel.getRoom_b_giftnumber()) {
                        ImageView imageView = this$1.OooO0OO().f49283OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWinBlue");
                        oOO00O.OooO(imageView);
                        ImageView imageView2 = this$1.OooO0OO().f49284OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWinRed");
                        oOO00O.OooO00o(imageView2);
                    } else if (roomPKResultModel.getRoom_a_giftnumber() < roomPKResultModel.getRoom_b_giftnumber()) {
                        ImageView imageView3 = this$1.OooO0OO().f49283OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivWinBlue");
                        oOO00O.OooO00o(imageView3);
                        ImageView imageView4 = this$1.OooO0OO().f49284OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivWinRed");
                        oOO00O.OooO(imageView4);
                    } else {
                        ImageView imageView5 = this$1.OooO0OO().f49283OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivWinBlue");
                        oOO00O.OooO00o(imageView5);
                        ImageView imageView6 = this$1.OooO0OO().f49284OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivWinRed");
                        oOO00O.OooO00o(imageView6);
                    }
                    this$1.OooO0OO().f49290OooOOOO.setText(String.valueOf(roomPKResultModel.getRoom_a_giftnumber()));
                    this$1.OooO0OO().f49291OooOOOo.setText(String.valueOf(roomPKResultModel.getRoom_b_giftnumber()));
                    oO0O00.OooO00o oooO00o6 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o6.f48429OooO0OO = roomPKResultModel.getGift_picurl();
                    oooO00o6.f48427OooO00o = 0;
                    oooO00o6.OooO00o(OooO00o.OooO0Oo());
                    oooO00o6.OooO0o(this$1.OooO0OO().f49276OooO);
                    oO0O00.OooO00o oooO00o7 = new oO0O00.OooO00o(this$1.f44365OooO00o);
                    oooO00o7.f48429OooO0OO = roomPKResultModel.getGift_picurl();
                    oooO00o7.f48427OooO00o = 0;
                    oooO00o7.OooO00o(OooO00o.OooO0Oo());
                    oooO00o7.OooO0o(this$1.OooO0OO().f49285OooOO0);
                    this$1.OooO0OO().f49289OooOOO0.setProgress(Math.min(Math.max((int) ((((double) roomPKResultModel.getRoom_a_giftnumber()) / ((double) (roomPKResultModel.getRoom_b_giftnumber() + roomPKResultModel.getRoom_b_giftnumber()))) * ((double) 100)), 10), 90));
                } else if (this$1.f44810OooO0OO) {
                    ConstraintLayout constraintLayout2 = this$1.OooO0OO().f49277OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
                    oOO00O.OooO00o(constraintLayout2);
                }
                break;
            case 3:
                MainSearchRoomFragment.m370observerSearchText$lambda8((MainSearchRoomFragment) this.f31921OooO0O0, (String) obj);
                break;
            default:
                EventSquareViewModel squareVM = (EventSquareViewModel) this.f31921OooO0O0;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                o000O0<EventModel> squareEventPager = squareVM.getSquareEventPager();
                Iterator it = squareEventPager.f48682OooO0Oo.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!(((EventModel) it.next()).getId() == subscribeNotifyModel.getEventId())) {
                        i++;
                    }
                }
                if (i >= 0) {
                    EventModel eventModel = (EventModel) squareEventPager.f48682OooO0Oo.get(i);
                    eventModel.setEventNumber(subscribeNotifyModel.getSubscribeCount());
                    eventModel.setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                    squareEventPager.f48682OooO0Oo.set(i, (T) eventModel.clone());
                    squareEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
