package p524o0o0O0oO;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035OoooOO0.o0000Ooo;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.oOO00O;
import p381o0OOoOOO.oo00o;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;
import p546o0o0Ooo0.oO0O00oO;
import p579o0oOoOOo.b0;
import p649o0ooOOoo.ia;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43041OooO0O0;

    public /* synthetic */ o0O0O0O(Object obj, int i) {
        this.f43040OooO00o = i;
        this.f43041OooO0O0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long value;
        int i = 1;
        int i2 = 2;
        ia iaVar = null;
        ia iaVar2 = null;
        ia iaVar3 = null;
        switch (this.f43040OooO00o) {
            case 0:
                o0O0oo0o this$0 = (o0O0oo0o) this.f43041OooO0O0;
                Boolean isLogin = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(isLogin, "isLogin");
                if (!isLogin.booleanValue()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new o0000Ooo(this$0, i2), 0L);
                    ia iaVar4 = this$0.f43089OooO0o;
                    if (iaVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        iaVar4 = null;
                    }
                    FrameLayout frameLayout = iaVar4.f49650OooO00o;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "loginBinding.root");
                    oOO00O.OooO(frameLayout);
                    if (!oo000o.OooO0o0()) {
                        ia iaVar5 = this$0.f43089OooO0o;
                        if (iaVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            iaVar = iaVar5;
                        }
                        iaVar.f49652OooO0OO.setRotationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    } else {
                        ia iaVar6 = this$0.f43089OooO0o;
                        if (iaVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            iaVar3 = iaVar6;
                        }
                        iaVar3.f49652OooO0OO.setRotationY(180.0f);
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new oo00o(this$0, i), 0L);
                    ia iaVar7 = this$0.f43089OooO0o;
                    if (iaVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    } else {
                        iaVar2 = iaVar7;
                    }
                    FrameLayout frameLayout2 = iaVar2.f49650OooO00o;
                    Intrinsics.checkNotNullExpressionValue(frameLayout2, "loginBinding.root");
                    oOO00O.OooO00o(frameLayout2);
                }
                break;
            case 1:
                AccountActivity this$1 = (AccountActivity) this.f43041OooO0O0;
                Boolean it = (Boolean) obj;
                int i3 = AccountActivity.f21695Ooooo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                boolean zBooleanValue = it.booleanValue();
                LinearLayout linearLayout = this$1.OooOoo().f49420OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llAccountProtection");
                if (!zBooleanValue) {
                    oOO00O.OooO00o(linearLayout);
                } else {
                    oOO00O.OooO(linearLayout);
                }
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f43041OooO0O0;
                String it2 = (String) obj;
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                long currentTopicUserId = this$2.Oooo000().getCurrentTopicUserId();
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                Long value2 = oooOOO.OooOo().getValue();
                if (value2 != null && currentTopicUserId == value2.longValue() && (value = oooOOO.OooOo().getValue()) != null && currentTopicUserId == value.longValue()) {
                    Response response = (Response) this$2.Oooo000().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNullExpressionValue(it2, "it");
                        topicInfoModel.setDescribe(it2);
                    }
                    this$2.OooOooo().f51080OooO0o0.f49844OooO0oo.setText(it2);
                }
                break;
            case 3:
                oO0O00oO this$3 = (oO0O00oO) this.f43041OooO0O0;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (pair != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (this$3.OooO0Oo().OooO0OO()) {
                            RoomUserInfoModel roomUserInfoModel = this$3.f44534OooO0o0;
                            if (roomUserInfoModel != null && ((Number) pair.getFirst()).longValue() == roomUserInfoModel.getUserId()) {
                                b0 b0VarOooO0Oo = this$3.OooO0Oo();
                                int iIntValue = ((Number) pair.getSecond()).intValue();
                                b0VarOooO0Oo.f45912OoooO.f50459OooO0OO.setIdentityInfo(iIntValue);
                                b0VarOooO0Oo.f45912OoooO.f50462OooO0o0.f50203OooO0O0.OooO0OO(iIntValue, true, true);
                                RoomUserInfoModel roomUserInfoModel2 = this$3.f44534OooO0o0;
                                if (roomUserInfoModel2 != null) {
                                    roomUserInfoModel2.setRoomMemberType(((Number) pair.getSecond()).intValue());
                                }
                                RoomUserInfoModel roomUserInfoModel3 = this$3.f44534OooO0o0;
                                if (Intrinsics.areEqual(roomUserInfoModel3 != null ? Long.valueOf(roomUserInfoModel3.getUserId()) : null, OooOOO.f41216OooO00o.OooOo().getValue())) {
                                    break;
                                } else if (o00OO00O.f43313OooooOo.OooO00o().OooOOOO()) {
                                    if (((Number) pair.getSecond()).intValue() == 2) {
                                        b0.OooOO0o(this$3.OooO0Oo(), false, false, false, 15);
                                    } else {
                                        b0.OooOO0o(this$3.OooO0Oo(), true, true, true, 1);
                                    }
                                }
                            }
                        }
                        Result.m502constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m502constructorimpl(ResultKt.createFailure(th));
                        return;
                    }
                    break;
                }
                break;
            case 4:
                PremiumActivity this$4 = (PremiumActivity) this.f43041OooO0O0;
                PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                this$4.OoooO0(false);
                break;
            case 5:
                MainMomentsTopicFollowingFragment.m349initObserver$lambda0((MainMomentsTopicFollowingFragment) this.f43041OooO0O0, obj);
                break;
            case 6:
                TopicPostLatestFragment.m407initObserve$lambda8((TopicPostLatestFragment) this.f43041OooO0O0, (Long) obj);
                break;
            default:
                MainRoomPopularFragment.m479onLazyInit$lambda0((MainRoomPopularFragment) this.f43041OooO0O0, (Boolean) obj);
                break;
        }
    }
}
