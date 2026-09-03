package p143o00OOooO;

import OooO00o.OooO0OO;
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
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.oOO00O;
import p560o0oOOoo.o0oOOo;
import p618o0oo0Ooo.oO0O000o;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31942OooO0O0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f31941OooO00o = i;
        this.f31942OooO0O0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31941OooO00o) {
            case 0:
                MainMomentFollowingFragment.m20initObserver$lambda4((MainMomentFollowingFragment) this.f31942OooO0O0, (Boolean) obj);
                break;
            case 1:
                PostDetailActivity this$0 = (PostDetailActivity) this.f31942OooO0O0;
                MomentDetailModel result = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$0.f22439OooooOo;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getId()) {
                    this$0.f22439OooooOo = result;
                }
                MomentDetailModel momentDetailModel2 = this$0.f22439OooooOo;
                if (momentDetailModel2 != null) {
                    this$0.Oooo000().setPostDetailModel(momentDetailModel2);
                    momentDetailModel2.setSessionId(this$0.f22445o000OOo);
                    this$0.OooOooO().f50527OooOOOo.setPraiseCount(momentDetailModel2.getPraiseNum());
                    this$0.OooOooO().f50527OooOOOo.setCommentCount(momentDetailModel2.getCommentNum());
                    this$0.OooOooO().f50527OooOOOo.setGiftTotalPropValue(momentDetailModel2.getTotalPropValue());
                }
                break;
            case 2:
                o0oOOo this$1 = (o0oOOo) this.f31942OooO0O0;
                RoomPKResultModel roomPKResultModel = (RoomPKResultModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (roomPKResultModel != null) {
                    this$1.f44841OooO0OO = true;
                    ConstraintLayout constraintLayout = this$1.OooO0OO().f49214OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                    oOO00O.OooO(constraintLayout);
                    TextView textView = this$1.OooO0OO().f49230OooOOo0;
                    StringBuilder sbOooO0O0 = OooO0OO.OooO0O0('(');
                    sbOooO0O0.append(roomPKResultModel.getPk_time_duration() / 60);
                    sbOooO0O0.append(o000O0O0.OooO0OO(R.string.room_pk_minute));
                    sbOooO0O0.append(')');
                    textView.setText(sbOooO0O0.toString());
                    oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o2.f48447OooO0OO = roomPKResultModel.getRoom_a_picurl();
                    oooO00o2.f48445OooO00o = 0;
                    oooO00o2.OooO0oo(4, 0, 4, 0);
                    oooO00o2.f48472OooOoo0 = 2;
                    oooO00o2.OooO0o(this$1.OooO0OO().f49223OooOO0O);
                    this$1.OooO0OO().f49225OooOOO.setText(roomPKResultModel.getRoom_a_name());
                    oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o3.f48451OooO0oO = R.drawable.room_ic_pk_name_bg_left;
                    oooO00o3.f48445OooO00o = 1;
                    oooO00o3.OooO0oo(0, 0, 4, 0);
                    oooO00o3.OooO0o(this$1.OooO0OO().f49217OooO0Oo);
                    Path path = new Path();
                    path.moveTo(OooOo00.OooO00o(13), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float f = 66;
                    path.lineTo(OooOo00.OooO00o(f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float f2 = 40;
                    path.lineTo(OooOo00.OooO00o(f), OooOo00.OooO00o(f2));
                    path.lineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO00o(f2));
                    path.lineTo(OooOo00.OooO00o(15), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    this$1.OooO0OO().f49224OooOO0o.setClipPath(path);
                    oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o4.f48451OooO0oO = R.drawable.room_ic_pk_name_bg_right;
                    oooO00o4.f48445OooO00o = 1;
                    oooO00o4.OooO0oo(0, 0, 0, 4);
                    oooO00o4.OooO0o(this$1.OooO0OO().f49219OooO0o0);
                    this$1.OooO0OO().f49229OooOOo.setText(roomPKResultModel.getRoom_b_name());
                    oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o5.f48447OooO0OO = roomPKResultModel.getRoom_b_picurl();
                    oooO00o5.f48445OooO00o = 0;
                    oooO00o5.OooO0oo(0, 4, 0, 4);
                    oooO00o5.f48472OooOoo0 = 2;
                    oooO00o5.OooO0o(this$1.OooO0OO().f49224OooOO0o);
                    if (roomPKResultModel.getRoom_a_giftnumber() > roomPKResultModel.getRoom_b_giftnumber()) {
                        ImageView imageView = this$1.OooO0OO().f49220OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWinBlue");
                        oOO00O.OooO(imageView);
                        ImageView imageView2 = this$1.OooO0OO().f49221OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWinRed");
                        oOO00O.OooO00o(imageView2);
                    } else if (roomPKResultModel.getRoom_a_giftnumber() < roomPKResultModel.getRoom_b_giftnumber()) {
                        ImageView imageView3 = this$1.OooO0OO().f49220OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivWinBlue");
                        oOO00O.OooO00o(imageView3);
                        ImageView imageView4 = this$1.OooO0OO().f49221OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivWinRed");
                        oOO00O.OooO(imageView4);
                    } else {
                        ImageView imageView5 = this$1.OooO0OO().f49220OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivWinBlue");
                        oOO00O.OooO00o(imageView5);
                        ImageView imageView6 = this$1.OooO0OO().f49221OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivWinRed");
                        oOO00O.OooO00o(imageView6);
                    }
                    this$1.OooO0OO().f49227OooOOOO.setText(String.valueOf(roomPKResultModel.getRoom_a_giftnumber()));
                    this$1.OooO0OO().f49228OooOOOo.setText(String.valueOf(roomPKResultModel.getRoom_b_giftnumber()));
                    oO0O000o.OooO00o oooO00o6 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o6.f48447OooO0OO = roomPKResultModel.getGift_picurl();
                    oooO00o6.f48445OooO00o = 0;
                    oooO00o6.OooO00o(OooO00o.OooO0Oo());
                    oooO00o6.OooO0o(this$1.OooO0OO().f49213OooO);
                    oO0O000o.OooO00o oooO00o7 = new oO0O000o.OooO00o(this$1.f44372OooO00o);
                    oooO00o7.f48447OooO0OO = roomPKResultModel.getGift_picurl();
                    oooO00o7.f48445OooO00o = 0;
                    oooO00o7.OooO00o(OooO00o.OooO0Oo());
                    oooO00o7.OooO0o(this$1.OooO0OO().f49222OooOO0);
                    this$1.OooO0OO().f49226OooOOO0.setProgress(Math.min(Math.max((int) ((((double) roomPKResultModel.getRoom_a_giftnumber()) / ((double) (roomPKResultModel.getRoom_b_giftnumber() + roomPKResultModel.getRoom_b_giftnumber()))) * ((double) 100)), 10), 90));
                } else if (this$1.f44841OooO0OO) {
                    ConstraintLayout constraintLayout2 = this$1.OooO0OO().f49214OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
                    oOO00O.OooO00o(constraintLayout2);
                }
                break;
            case 3:
                MainSearchRoomFragment.m370observerSearchText$lambda8((MainSearchRoomFragment) this.f31942OooO0O0, (String) obj);
                break;
            default:
                EventSquareViewModel squareVM = (EventSquareViewModel) this.f31942OooO0O0;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                o000O0Oo<EventModel> squareEventPager = squareVM.getSquareEventPager();
                Iterator it = squareEventPager.f48702OooO0Oo.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!(((EventModel) it.next()).getId() == subscribeNotifyModel.getEventId())) {
                        i++;
                    }
                }
                if (i >= 0) {
                    EventModel eventModel = (EventModel) squareEventPager.f48702OooO0Oo.get(i);
                    eventModel.setEventNumber(subscribeNotifyModel.getSubscribeCount());
                    eventModel.setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                    squareEventPager.f48702OooO0Oo.set(i, (T) eventModel.clone());
                    squareEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
