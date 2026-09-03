package p524o0o0O0oO;

import android.animation.ObjectAnimator;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p546o0o0Ooo0.oO0O00oO;
import p649o0ooOOoo.ia;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00oO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43039OooO0O0;

    public /* synthetic */ o0O00oO0(Object obj, int i) {
        this.f43038OooO00o = i;
        this.f43039OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ia iaVar = null;
        ia iaVar2 = null;
        switch (this.f43038OooO00o) {
            case 0:
                o0O0oo0o this$0 = (o0O0oo0o) this.f43039OooO0O0;
                Boolean show = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f43089OooO0o != null) {
                    Intrinsics.checkNotNullExpressionValue(show, "show");
                    if (!show.booleanValue()) {
                        ia iaVar3 = this$0.f43089OooO0o;
                        if (iaVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                            iaVar3 = null;
                        }
                        float width = iaVar3.f49650OooO00o.getWidth();
                        if (oo000o.OooO0o0()) {
                            width = -width;
                        }
                        ia iaVar4 = this$0.f43089OooO0o;
                        if (iaVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            iaVar = iaVar4;
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(iaVar.f49650OooO00o, "translationX", width);
                        objectAnimatorOfFloat.setDuration(500L);
                        objectAnimatorOfFloat.start();
                    } else {
                        ia iaVar5 = this$0.f43089OooO0o;
                        if (iaVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            iaVar2 = iaVar5;
                        }
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(iaVar2.f49650OooO00o, "translationX", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        objectAnimatorOfFloat2.setStartDelay(600L);
                        objectAnimatorOfFloat2.setDuration(500L);
                        objectAnimatorOfFloat2.start();
                    }
                    break;
                }
                break;
            case 1:
                AccountActivity this$1 = (AccountActivity) this.f43039OooO0O0;
                int i = AccountActivity.f21695Ooooo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoo().f49422OooO0o0.setText(((Boolean) ((Pair) obj).getFirst()).booleanValue() ? o000O0O0.OooO0OO(R.string.account_login_protection_turn_on) : o000O0O0.OooO0OO(R.string.account_login_protection_close));
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f43039OooO0O0;
                Long l = (Long) obj;
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.Oooo000().getTopicDetailLocal().getValue();
                if (Intrinsics.areEqual(value != null ? Long.valueOf(value.getId()) : null, l)) {
                    this$2.Oooo000().isFollow().setValue(Boolean.TRUE);
                }
                break;
            case 3:
                oO0O00oO this$3 = (oO0O00oO) this.f43039OooO0O0;
                Long l2 = (Long) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (l2 != null && this$3.OooO0Oo().OooO0OO()) {
                    RoomUserInfoModel roomUserInfoModel = this$3.f44534OooO0o0;
                    if (Intrinsics.areEqual(l2, roomUserInfoModel != null ? Long.valueOf(roomUserInfoModel.getUserId()) : null)) {
                        Pair<Boolean, Boolean> pairOooO0OO = this$3.OooO0OO(l2.longValue());
                        this$3.OooO0Oo().OooOOO(pairOooO0OO);
                        this$3.OooO0Oo().f45912OoooO.f50462OooO0o0.f50204OooO0OO.setImageResource(pairOooO0OO.getFirst().booleanValue() ? R.drawable.room_dialog_user_info_set_up_mic_down : R.drawable.room_dialog_user_info_set_up_mic_up);
                    }
                }
                break;
            default:
                TopicPostLatestFragment.m406initObserve$lambda7((TopicPostLatestFragment) this.f43039OooO0O0, (Long) obj);
                break;
        }
    }
}
