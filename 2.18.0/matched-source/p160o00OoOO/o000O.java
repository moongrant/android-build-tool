package p160o00OoOO;

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
import p178o00Ooooo.oOo000o0;
import p352o0OOOOo.OooOOO;
import p376o0OOo0oO.o00oO0o;
import p448o0OoOo0o.o0O0o0;
import p517o0o0O00.o00O00;
import p529o0o0OO0.OooOOOO;
import p529o0o0OO0.OooOo00;
import p529o0o0OO0.Oooo000;
import p531o0o0OO0o.o000OOo0;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32445OooO0O0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f32444OooO00o = i;
        this.f32445OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        final FirebaseMessaging firebaseMessaging;
        Task<String> task;
        switch (this.f32444OooO00o) {
            case 0:
                MixedRoomService mixedRoomService = (MixedRoomService) this.f32445OooO0O0;
                int i = MixedRoomService.f11842OoooOoO;
                Objects.requireNonNull(mixedRoomService);
                o00O00.OooO0OO("MixedRoomService", "releaseUiHandler");
                mixedRoomService.OooO0oO(null);
                o00O00.OooO0OO("MixedRoomService", "releaseAudioChatService");
                o0O0o0 o0o0o0 = mixedRoomService.f11845OoooO0;
                if (o0o0o0 != null) {
                    o0o0o0.OooO00o();
                    mixedRoomService.f11847OoooO0O = null;
                }
                mixedRoomService.OooO0O0();
                mixedRoomService.OooO00o();
                mixedRoomService.stopSelf();
                return;
            case 1:
                oOo000o0 ooo000o0 = (oOo000o0) this.f32445OooO0O0;
                String str = (String) obj;
                int i2 = oOo000o0.f32952ooOO;
                ooo000o0.f32944OoooO00 = str;
                TextView textView = ooo000o0.f32948OoooOOo;
                if (textView != null) {
                    textView.setText(str);
                    return;
                }
                return;
            case 2:
                va bindingDrawer = (va) this.f32445OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50807OooO.setText("ID:" + ((String) obj));
                return;
            case 3:
                IMMessageService this$0 = (IMMessageService) this.f32445OooO0O0;
                Boolean isLogin = (Boolean) obj;
                int i3 = IMMessageService.f21681OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(isLogin, "isLogin");
                if (!isLogin.booleanValue()) {
                    this$0.OooO00o().disconnect();
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000OOo0(null), 2, null);
                    return;
                }
                OooO00o oooO00o = FirebaseMessaging.f19189OooOOO;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(OooOOO.OooO0OO());
                }
                o00oO0o o00oo0o2 = firebaseMessaging.f19195OooO0O0;
                if (o00oo0o2 != null) {
                    task = o00oo0o2.OooO0O0();
                } else {
                    final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f19201OooO0oo.execute(new Runnable() { // from class: o0OOoOOO.o00O0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            OooO00o oooO00o2 = FirebaseMessaging.f19189OooOOO;
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
                task.addOnSuccessListener(oo0OOoo.OooO00o.f53358OoooO00);
                if (!(OooOo00.f43148OooO0OO != null)) {
                    OooOo00.f43148OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOOOO(false, null), 2, null);
                }
                this$0.f21682Oooo.OooO0o0();
                this$0.OooO00o().OooO0o0();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new Oooo000(null), 2, null);
                return;
            case 4:
                MainActivity this$1 = (MainActivity) this.f32445OooO0O0;
                MainActivity.OooO00o oooO00o2 = MainActivity.f21962o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo0();
                return;
            case 5:
                BadgeActivity this$2 = (BadgeActivity) this.f32445OooO0O0;
                BadgeActivity.OooO00o oooO00o3 = BadgeActivity.f23302OoooooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOooO().f49432OooO0O0.f49837OooO0OO.OooO0O0((String) obj, this$2);
                return;
            case 6:
                RoomGameBoxDialog this$3 = (RoomGameBoxDialog) this.f32445OooO0O0;
                Integer it = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$3.f23769OooOO0o = it.intValue();
                this$3.OooOOOO(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
                return;
            default:
                MainRoomMineFragment.m470onLazyInit$lambda1((MainRoomMineFragment) this.f32445OooO0O0, (Boolean) obj);
                return;
        }
    }
}
