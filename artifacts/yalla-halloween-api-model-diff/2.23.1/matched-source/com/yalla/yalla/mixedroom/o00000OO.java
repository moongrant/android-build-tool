package com.yalla.yalla.mixedroom;

import android.os.Looper;
import android.view.KeyEvent;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p575o0oOoOO.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f23052OooO0o0;

    public /* synthetic */ o00000OO(KeyEvent.Callback callback, int i) {
        this.f23051OooO0Oo = i;
        this.f23052OooO0o0 = callback;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomRunWayModel roomRunWayModel;
        int i = this.f23051OooO0Oo;
        TopicInfoModel topicInfoModel = null;
        boolean z = true;
        KeyEvent.Callback callback = this.f23052OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) callback;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                if ((obj instanceof RoomRunWayModel) && (roomRunWayModel = (RoomRunWayModel) obj) != null) {
                    if (roomRunWayModel.getGiftsubtype() == 600) {
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p393o0OOooo0.o0OO00O.f43560OooO00o;
                        int giftId = roomRunWayModel.getGiftId();
                        Map<Integer, GiftPropModel> value = p393o0OOooo0.o0OO00O.f43561OooO0O0.getValue();
                        if ((value != null ? value.get(Integer.valueOf(giftId)) : null) == null) {
                            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.vip6_send_for_userInfo_content);
                            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                                z = false;
                            }
                            if (!z) {
                                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                                } else {
                                    o000oo0OooO00o.run();
                                }
                                break;
                            }
                        }
                    }
                    long jOooO = com.code.android.util.o0OoOo0.OooO(0L, roomRunWayModel.getFromUserId());
                    ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                    RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jOooO));
                    if (roomUserInfoModelOooO0o0 != null) {
                        int giftId2 = roomRunWayModel.getGiftId();
                        roomRunWayModel.getGiftUserType();
                        mixedRoomActivity.OooOoOO(roomUserInfoModelOooO0o0, 0, giftId2, false);
                    }
                    break;
                }
                break;
            case 1:
                TopicInfoActivity this$0 = (TopicInfoActivity) callback;
                String str = (String) obj;
                int i3 = TopicInfoActivity.f25918OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel2 = this$0.f25922OooOo00;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel2 = null;
                }
                if (topicInfoModel2.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$0.f25922OooOo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel = topicInfoModel3;
                    }
                    Intrinsics.checkNotNull(str);
                    topicInfoModel.setDescribe(str);
                    this$0.OooOoO().setTopicDesc(str);
                }
                break;
            default:
                BaseWebView2 this$1 = (BaseWebView2) callback;
                String str2 = (String) obj;
                int i4 = BaseWebView2.f30867OooOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    o0OOOO0o.OooO0O0(this$1, str2);
                } else {
                    o0OOOO0o.OooO0O0(this$1, null);
                }
                break;
        }
    }
}
