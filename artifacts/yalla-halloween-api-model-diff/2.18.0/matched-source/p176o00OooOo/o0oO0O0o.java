package p176o00OooOo;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.FacePanelView;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p100o000oOoO.o0O00O;
import p532o0o0OOO.o00OO000;
import p560o0oOOoo.o0O0oo0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oO0O0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f32780OooO0OO;

    public /* synthetic */ o0oO0O0o(Object obj, Object obj2, int i) {
        this.f32778OooO00o = i;
        this.f32779OooO0O0 = obj;
        this.f32780OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        switch (this.f32778OooO00o) {
            case 0:
                Context context = (Context) this.f32779OooO0O0;
                FacePanelView this$0 = (FacePanelView) this.f32780OooO0OO;
                int i = FacePanelView.f11969Ooooo00;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new o0O0oo0o(this$0, null), 3, null);
                    break;
                }
                break;
            default:
                o0O00O voteDialog = (o0O00O) this.f32779OooO0O0;
                MixedRoomActivity activity = (MixedRoomActivity) this.f32780OooO0OO;
                Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                if (voteDialog.getValue() == null) {
                    voteDialog.setValue(new RoomVoteDialog(activity, o0O0oo0o.OooOOO0.f44812Oooo));
                }
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                o00OO000.f43217OoooOOO.setValue(Boolean.TRUE);
                RoomVoteDialog roomVoteDialog = (RoomVoteDialog) voteDialog.getValue();
                if (roomVoteDialog != null) {
                    roomVoteDialog.OooOO0();
                }
                o0O0oo0o.OooO0OO(voteDialog, activity);
                break;
        }
    }
}
