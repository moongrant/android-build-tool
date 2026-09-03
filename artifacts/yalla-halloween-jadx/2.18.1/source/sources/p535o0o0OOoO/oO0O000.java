package p535o0o0OOoO;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.app.base.model.RoomModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.activity.main.MainActivity;
import p150o00Oo0Oo.OooOOOO;
import p254o00ooO0O.o000O0O0;
import p654o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0O000 implements o0OoOo0, OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ oO0O000 f43649OooO0Oo = new oO0O000();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ oO0O000 f43650OooO0o0 = new oO0O000();

    @Override // p654o0ooo.o0OoOo0
    public final void OooO00o(Object obj) {
        MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
        RoomStateManager.INSTANCE.enterRoom((RoomModel) obj, EnterRoomParentPage.OtherApp_Room);
    }

    @Override // p150o00Oo0Oo.OooOOOO
    public final void OooO0OO(Editable editable, int i, int i2) {
        if (editable != null) {
            editable.setSpan(new ForegroundColorSpan(o000O0O0.OooO00o(R.color.color_1BA1FD)), i, i2, 33);
        }
    }
}
