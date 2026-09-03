package p142o00OOooO;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.MoraGiftListModel;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.RoomItemInfoModelTag;
import com.facebook.appevents.codeless.OooO0O0;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o0000O0;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.Oooo0;
import p522o0o0O0o.o00;
import p579o0oOoOOo.O0000000;
import p579o0oOoOOo.m;
import p579o0oOoOOo.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31957OooO0O0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f31956OooO00o = i;
        this.f31957OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = 1;
        int i2 = 0;
        OooO0OO<MoraGiftListModel> oooO0OO = null;
        switch (this.f31956OooO00o) {
            case 0:
                MomentListFeaturedFragment.m38initObserver$lambda6((MomentListFeaturedFragment) this.f31957OooO0O0, (Integer) obj);
                break;
            case 1:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31957OooO0O0;
                int i3 = MixedRoomActivity.f11764o00000oO;
                Objects.requireNonNull(mixedRoomActivity);
                if (obj instanceof Dialog) {
                    p.OooO00o(false, true, new Function1() { // from class: o00OoOO.o0OOO0o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            Object obj3 = obj;
                            m mVar = (m) obj2;
                            int i4 = MixedRoomActivity.f11764o00000oO;
                            Objects.requireNonNull(mixedRoomActivity2);
                            o00.OooO00o((Dialog) obj3, mVar.f41544Oooo0oO);
                            mixedRoomActivity2.f11782o00000Oo = mVar;
                            return null;
                        }
                    });
                }
                break;
            case 2:
                GiftBlindWebManager this$0 = (GiftBlindWebManager) this.f31957OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0.f20886OooO00o), new Oooo0(this$0, null));
                break;
            case 3:
                Observer observer = (Observer) this.f31957OooO0O0;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserve.<no name provided>.invokeSuspend$lambda-0");
                observer.onChanged(obj);
                break;
            case 4:
                PhoneNumberActivity this$1 = (PhoneNumberActivity) this.f31957OooO0O0;
                PhoneNumberActivity.OooO00o oooO00o = PhoneNumberActivity.f21819OooooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 5:
                PostDetailCommentSonListActivity this$2 = (PostDetailCommentSonListActivity) this.f31957OooO0O0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (zBooleanValue) {
                    this$2.Oooo000().f49456OooO0Oo.setCursorVisible(true);
                    this$2.Oooo000().f49455OooO0OO.setVisibility(8);
                    this$2.Oooo000().f49455OooO0OO.setOnClickListener(null);
                } else {
                    this$2.Oooo000().f49456OooO0Oo.setCursorVisible(false);
                    this$2.Oooo000().f49455OooO0OO.setVisibility(0);
                    this$2.Oooo000().f49455OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o0Oo0.o00O00OO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PostDetailCommentSonListActivity.OooO00o oooO00o3 = PostDetailCommentSonListActivity.f22473o0ooOOo;
                            o00OOO0 onLogin = o00OOO0.f43968Oooo0o;
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                Objects.requireNonNull(onLogin);
                                return;
                            }
                            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                            if (activityOooO0O0 != null) {
                                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                            }
                        }
                    });
                }
                break;
            case 6:
                TopicSettingActivity this$3 = (TopicSettingActivity) this.f31957OooO0O0;
                String it = (String) obj;
                TopicSettingActivity.OooO00o oooO00o3 = TopicSettingActivity.f22666OooooO0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                TopicInfoModel topicInfoModel = this$3.f22668Ooooo00;
                if (topicInfoModel != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    topicInfoModel.setDescribe(it);
                }
                this$3.OooOoo().f49370OooO0oO.setText(it);
                break;
            case 7:
                RoomSettingActivity this$4 = (RoomSettingActivity) this.f31957OooO0O0;
                Boolean bool = (Boolean) obj;
                RoomSettingActivity.OooO00o oooO00o4 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                for (Object obj2 : this$4.f22971Ooooo00) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.EnterRoomAllow) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(!Intrinsics.areEqual(bool, Boolean.TRUE)));
                        this$4.OooOoo().notifyDataSetChanged();
                    } else {
                        i2 = i4;
                    }
                    break;
                }
                break;
            case 8:
                UserInfoEditActivity this$5 = (UserInfoEditActivity) this.f31957OooO0O0;
                UserInfoEditActivity.OooO00o oooO00o5 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                this$5.OooOooo().f50504OooOOO0.setText(o0O0O00.OooOO0((String) obj));
                this$5.f23506o00Ooo.setValue(null);
                break;
            case 9:
                O0000000 this$6 = (O0000000) this.f31957OooO0O0;
                List<MoraGiftListModel> it2 = (List) obj;
                Intrinsics.checkNotNullParameter(this$6, "this$0");
                OooO0OO<MoraGiftListModel> oooO0OO2 = this$6.f45873OoooOO0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO2;
                }
                oooO0OO.setNewData(it2);
                this$6.OooOO0O().f49793OooOoO0.postDelayed(new OooO0O0(this$6, i), 200L);
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                this$6.f45875OoooOOo = it2;
                break;
            default:
                WalletCoinFragment.m438iniView$lambda16((WalletCoinFragment) this.f31957OooO0O0, obj);
                break;
        }
    }
}
