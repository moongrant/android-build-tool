package p526o0o0O0oO;

import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.application.App;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OOOO.OooO00o;
import p144o00OOooo.oo0oOO0;
import p255o00ooO0O.o0000O0;
import p500o0o00Oo0.OooOOO;
import p529o0o0OO0.o000oOoO;
import p532o0o0OOO.o00OO0O0;
import p537o0o0OOoO.oO0O00O;
import p619o0oo0o.o00000OO;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00oO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43118OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43119OooO0O0;

    public /* synthetic */ oo00oO(Object obj, int i) {
        this.f43118OooO00o = i;
        this.f43119OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer value;
        int i = 0;
        switch (this.f43118OooO00o) {
            case 0:
                va bindingDrawer = (va) this.f43119OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                DotView dotView = bindingDrawer.f50809OooO0O0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                dotView.OooO0OO(it.booleanValue());
                break;
            case 1:
                MainActivity activity = (MainActivity) this.f43119OooO0O0;
                Boolean it2 = (Boolean) obj;
                MainActivity.OooO00o oooO00o = MainActivity.f21962o00Ooo;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (!it2.booleanValue()) {
                    o0O0O0Oo o0o0o0ooOooOooo = activity.OooOooo();
                    Objects.requireNonNull(o0o0o0ooOooOooo);
                    o00000OO o00000oo2 = o00000OO.f48493OooO00o;
                    o00000OO.f48494OooO0O0.observe(o0o0o0ooOooOooo.f43059OooO0Oo, new o0O0O0O(o0o0o0ooOooOooo, i));
                } else {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    o000oOoO o000oooo2 = new o000oOoO();
                    try {
                        Intent intent = new Intent(App.f11473OoooO00, (Class<?>) IMMessageService.class);
                        App.f11473OoooO00.startService(intent);
                        activity.bindService(intent, o000oooo2, 1);
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    activity.f21973ooOO = o000oooo2;
                    activity.Oooo00o().updateMessageStateFailed();
                    Looper.myQueue().addIdleHandler(activity.f21972o0OoOo0);
                    o0000O0.OooO00o(LifecycleOwnerKt.getLifecycleScope(activity), new oO0O00O(null));
                    activity.OooOooO().OooO0Oo();
                    activity.Oooo000().OooO0Oo();
                    activity.OooOooo().OooO0Oo();
                    activity.Oooo00o().checkTermsService().observe(activity, new oo0oOO0(activity, 3));
                    OooOOO oooOOO = OooOOO.f41235OooO00o;
                    oooOOO.Oooo000();
                    OooO00o.OooO00o().OooO0O0(activity, ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), oooOOO.OooOo00().getValue());
                    if (oooOOO.OooOoo0().getValue() == null) {
                        activity.Oooo00o().getEventSettingState();
                    }
                }
                break;
            case 2:
                TopicCreateActivity this$0 = (TopicCreateActivity) this.f43119OooO0O0;
                String it3 = (String) obj;
                int i2 = TopicCreateActivity.f22568Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo().f50826OooO0OO.f50908OooO0Oo.setText(it3);
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                if (!StringsKt.isBlank(it3)) {
                    this$0.OooOoo().f50826OooO0OO.f50908OooO0Oo.setHint("");
                } else {
                    this$0.OooOoo().f50826OooO0OO.f50908OooO0Oo.setHint(R.string.Name_your_topic);
                }
                this$0.OooOooo();
                break;
            case 3:
                VipActivity this$1 = (VipActivity) this.f43119OooO0O0;
                VipActivity.OooO0O0 oooO0O0 = VipActivity.f23589OoooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (obj instanceof Boolean) {
                    this$1.Oooo000().getPersonalKaVipModel().setStealthVisit(((Boolean) obj).booleanValue());
                }
                break;
            case 4:
                RoomGameBoxDialog this$2 = (RoomGameBoxDialog) this.f43119OooO0O0;
                Integer num = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (num != null && num.intValue() == 1 && (value = o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.getValue()) != null && value.intValue() == 1) {
                    this$2.f23767OooOO0 = true;
                } else {
                    this$2.f23767OooOO0 = false;
                    this$2.f23768OooOO0O = 1;
                }
                this$2.OooOOOO(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
                break;
            case 5:
                MainExploreFragment.m337initObserver$lambda7((MainExploreFragment) this.f43119OooO0O0, (Pair) obj);
                break;
            default:
                MainRoomMineFollowingFragment.m463onLazyInit$lambda0((MainRoomMineFollowingFragment) this.f43119OooO0O0, (Boolean) obj);
                break;
        }
    }
}
