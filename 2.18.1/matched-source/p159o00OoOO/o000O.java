package p159o00OoOO;

import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomService;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.OooO00o;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p177o00Ooooo.oO0OO00o;
import p351o0OOOOo.OooOOO;
import p374o0OOo0oO.o00oO0o;
import p445o0OoOo0o.o0O0o000;
import p515o0o0O00.o00O00;
import p527o0o0OO0.OooOOOO;
import p527o0o0OO0.OooOo00;
import p527o0o0OO0.Oooo000;
import p529o0o0OO0o.o00;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32423OooO0O0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f32422OooO00o = i;
        this.f32423OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        final FirebaseMessaging firebaseMessaging;
        Task<String> task;
        switch (this.f32422OooO00o) {
            case 0:
                MixedRoomService mixedRoomService = (MixedRoomService) this.f32423OooO0O0;
                int i = MixedRoomService.f11827OoooOOO;
                Objects.requireNonNull(mixedRoomService);
                o00O00.OooO0OO("MixedRoomService", "releaseUiHandler");
                mixedRoomService.OooO0oO(null);
                o00O00.OooO0OO("MixedRoomService", "releaseAudioChatService");
                o0O0o000 o0o0o000 = mixedRoomService.f11831Oooo0oo;
                if (o0o0o000 != null) {
                    o0o0o000.OooO00o();
                    mixedRoomService.f11828Oooo = null;
                }
                mixedRoomService.OooO0O0();
                mixedRoomService.OooO00o();
                mixedRoomService.stopSelf();
                return;
            case 1:
                oO0OO00o oo0oo00o = (oO0OO00o) this.f32423OooO0O0;
                String str = (String) obj;
                int i2 = oO0OO00o.f32907OoooooO;
                oo0oo00o.f32929Oooo0oO = str;
                TextView textView = oo0oo00o.f32935OoooOO0;
                if (textView != null) {
                    textView.setText(str);
                    return;
                }
                return;
            case 2:
                wa bindingDrawer = (wa) this.f32423OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50870OooO.setText("ID:" + ((String) obj));
                return;
            case 3:
                IMMessageService this$0 = (IMMessageService) this.f32423OooO0O0;
                Boolean isLogin = (Boolean) obj;
                int i3 = IMMessageService.f21662Oooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(isLogin, "isLogin");
                if (!isLogin.booleanValue()) {
                    this$0.OooO00o().disconnect();
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00(null), 2, null);
                    return;
                }
                OooO00o oooO00o = FirebaseMessaging.f19170OooOOO;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(OooOOO.OooO0OO());
                }
                o00oO0o o00oo0o2 = firebaseMessaging.f19176OooO0O0;
                if (o00oo0o2 != null) {
                    task = o00oo0o2.OooO0O0();
                } else {
                    final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f19182OooO0oo.execute(new Runnable() { // from class: o0OOoOOO.o00O0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            OooO00o oooO00o2 = FirebaseMessaging.f19170OooOOO;
                            Objects.requireNonNull(firebaseMessaging2);
                            try {
                                taskCompletionSource2.setResult(firebaseMessaging2.OooO00o());
                            } catch (Exception e) {
                                taskCompletionSource2.setException(e);
                            }
                        }
                    });
                    task = taskCompletionSource.getTask();
                }
                task.addOnSuccessListener(oo0OOoo.OooO00o.f53342OooO0o0);
                if (!(OooOo00.f43129OooO0OO != null)) {
                    OooOo00.f43129OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOOOO(false, null), 2, null);
                }
                this$0.f21663Oooo0o.OooO0o0();
                this$0.OooO00o().OooO0o0();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new Oooo000(null), 2, null);
                return;
            case 4:
                MainActivity this$1 = (MainActivity) this.f32423OooO0O0;
                MainActivity.OooO00o oooO00o2 = MainActivity.f21943ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo0();
                return;
            case 5:
                BadgeActivity this$2 = (BadgeActivity) this.f32423OooO0O0;
                BadgeActivity.OooO00o oooO00o3 = BadgeActivity.f23283OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOooO().f49495OooO0O0.f49900OooO0OO.OooO0O0((String) obj, this$2);
                return;
            case 6:
                RoomGameBoxDialog this$3 = (RoomGameBoxDialog) this.f32423OooO0O0;
                Integer it = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$3.f23750OooOO0o = it.intValue();
                this$3.OooOOOO(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
                return;
            default:
                MainRoomMineFragment.m470onLazyInit$lambda1((MainRoomMineFragment) this.f32423OooO0O0, (Boolean) obj);
                return;
        }
    }
}
