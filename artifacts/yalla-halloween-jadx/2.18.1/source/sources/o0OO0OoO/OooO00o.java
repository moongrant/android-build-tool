package o0OO0OoO;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.app.base.model.RoomModel;
import com.google.android.gms.measurement.internal.zzfy;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.activity.main.MainActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements p654o0ooo.o0OoOo0, p150o00Oo0Oo.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f37476OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f37477OooO0o0 = new OooO00o();

    public static void OooO0O0(zzfy zzfyVar, String str) {
        zzfyVar.zzay().zzk().zza(str);
    }

    @Override // p654o0ooo.o0OoOo0
    public void OooO00o(Object obj) {
        MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
        RoomStateManager.INSTANCE.enterRoom((RoomModel) obj, EnterRoomParentPage.OtherApp_Room);
    }

    @Override // p150o00Oo0Oo.OooOOOO
    public void OooO0OO(Editable editable, int i, int i2) {
        if (editable != null) {
            editable.setSpan(new ForegroundColorSpan(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217)), i, i2, 33);
        }
    }
}
