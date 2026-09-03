package p175o00OooOo;

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
import p100o000oOoO.o0O00OO;
import p530o0o0OOO.o00O;
import p558o0oOOoo.o0O0O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oO0O0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32757OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f32758OooO0OO;

    public /* synthetic */ o0oO0O0o(Object obj, Object obj2, int i) {
        this.f32756OooO00o = i;
        this.f32757OooO0O0 = obj;
        this.f32758OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        switch (this.f32756OooO00o) {
            case 0:
                Context context = (Context) this.f32757OooO0O0;
                FacePanelView this$0 = (FacePanelView) this.f32758OooO0OO;
                int i = FacePanelView.f11954OoooOo0;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new o0O0oo0o(this$0, null), 3, null);
                    break;
                }
                break;
            default:
                o0O00OO voteDialog = (o0O00OO) this.f32757OooO0O0;
                MixedRoomActivity activity = (MixedRoomActivity) this.f32758OooO0OO;
                Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                if (voteDialog.getValue() == null) {
                    voteDialog.setValue(new RoomVoteDialog(activity, o0O0O0Oo.OooOOO0.f44804Oooo0o));
                }
                o00O o00o2 = o00O.f43140OooO00o;
                o00O.f43186OoooOOO.setValue(Boolean.TRUE);
                RoomVoteDialog roomVoteDialog = (RoomVoteDialog) voteDialog.getValue();
                if (roomVoteDialog != null) {
                    roomVoteDialog.OooOO0();
                }
                o0O0O0Oo.OooO0OO(voteDialog, activity);
                break;
        }
    }
}
