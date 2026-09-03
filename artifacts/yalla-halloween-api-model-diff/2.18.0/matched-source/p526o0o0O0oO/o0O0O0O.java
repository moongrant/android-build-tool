package p526o0o0O0oO;

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
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o000O0O0;
import p548o0o0Ooo0.oO0O00O;
import p651o0ooOOoo.ha;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43057OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43058OooO0O0;

    public /* synthetic */ o0O0O0O(Object obj, int i) {
        this.f43057OooO00o = i;
        this.f43058OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ha haVar = null;
        ha haVar2 = null;
        switch (this.f43057OooO00o) {
            case 0:
                o0O0O0Oo this$0 = (o0O0O0Oo) this.f43058OooO0O0;
                Boolean show = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f43060OooO0o != null) {
                    Intrinsics.checkNotNullExpressionValue(show, "show");
                    if (!show.booleanValue()) {
                        ha haVar3 = this$0.f43060OooO0o;
                        if (haVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                            haVar3 = null;
                        }
                        float width = haVar3.f49587OooO00o.getWidth();
                        if (oo000o.OooO0o0()) {
                            width = -width;
                        }
                        ha haVar4 = this$0.f43060OooO0o;
                        if (haVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            haVar = haVar4;
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(haVar.f49587OooO00o, "translationX", width);
                        objectAnimatorOfFloat.setDuration(500L);
                        objectAnimatorOfFloat.start();
                    } else {
                        ha haVar5 = this$0.f43060OooO0o;
                        if (haVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                        } else {
                            haVar2 = haVar5;
                        }
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(haVar2.f49587OooO00o, "translationX", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        objectAnimatorOfFloat2.setStartDelay(600L);
                        objectAnimatorOfFloat2.setDuration(500L);
                        objectAnimatorOfFloat2.start();
                    }
                    break;
                }
                break;
            case 1:
                AccountActivity this$1 = (AccountActivity) this.f43058OooO0O0;
                int i = AccountActivity.f21714OooooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoo().f49359OooO0o0.setText(((Boolean) ((Pair) obj).getFirst()).booleanValue() ? o000O0O0.OooO0OO(R.string.account_login_protection_turn_on) : o000O0O0.OooO0OO(R.string.account_login_protection_close));
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f43058OooO0O0;
                Long l = (Long) obj;
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.Oooo000().getTopicDetailLocal().getValue();
                if (Intrinsics.areEqual(value != null ? Long.valueOf(value.getId()) : null, l)) {
                    this$2.Oooo000().isFollow().setValue(Boolean.TRUE);
                }
                break;
            case 3:
                oO0O00O this$3 = (oO0O00O) this.f43058OooO0O0;
                Long l2 = (Long) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (l2 != null && this$3.OooO0Oo().OooO0OO()) {
                    RoomUserInfoModel roomUserInfoModel = this$3.f44441OooO0o0;
                    if (Intrinsics.areEqual(l2, roomUserInfoModel != null ? Long.valueOf(roomUserInfoModel.getUserId()) : null)) {
                        Pair<Boolean, Boolean> pairOooO0OO = this$3.OooO0OO(l2.longValue());
                        this$3.OooO0Oo().OooOOO(pairOooO0OO);
                        this$3.OooO0Oo().f45903OoooOOO.f50399OooO0o0.f50141OooO0OO.setImageResource(pairOooO0OO.getFirst().booleanValue() ? R.drawable.room_dialog_user_info_set_up_mic_down : R.drawable.room_dialog_user_info_set_up_mic_up);
                    }
                }
                break;
            default:
                TopicPostLatestFragment.m406initObserve$lambda7((TopicPostLatestFragment) this.f43058OooO0O0, (Long) obj);
                break;
        }
    }
}
