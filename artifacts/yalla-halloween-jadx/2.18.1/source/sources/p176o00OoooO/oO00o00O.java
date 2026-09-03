package p176o00OoooO;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.app.base.model.RandomActivityModel;
import com.app.base.model.RoomModel;
import com.app.base.view.dialog.WelcomeDialog;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p034OoooO0O.o0Oo0oo;
import p168o00Ooo0.o0O0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class oO00o00O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ WelcomeDialog f32863Oooo;

    public static final class OooO00o extends Lambda implements Function1<RandomActivityModel.DataBean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f32864Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RandomActivityModel.DataBean dataBean) {
            RandomActivityModel.DataBean dataBean2 = dataBean;
            if (OooO0OO.OooO0O0(dataBean2 != null ? dataBean2.barId : null)) {
                Intrinsics.checkNotNull(dataBean2);
                String str = dataBean2.roomServerIP;
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(str);
                roomModel.setId(o0O0O00.OooOOO0(dataBean2.barId));
                roomModel.setName(dataBean2.barName);
                roomModel.setLevel(dataBean2.barLevel);
                roomModel.setSessionId(dataBean2.sessionId);
                o0Oo0oo.OooO0o0(575, null);
                if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                    SharedPreferences.Editor editorEdit = (TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o0000O.f2657OooO00o) : o0000O.f2657OooO00o.getSharedPreferences("Table_AppFirstStart", 0)).edit();
                    if (editorEdit != null) {
                        editorEdit.putBoolean("IsNewUserFirstEnterRoom", true).commit();
                    }
                    RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Room_welcome_gohavefun);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<RandomActivityModel.DataBean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ WelcomeDialog f32865Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(WelcomeDialog welcomeDialog) {
            super(1);
            this.f32865Oooo0o = welcomeDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RandomActivityModel.DataBean> apiResult) {
            ApiResult<RandomActivityModel.DataBean> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32865Oooo0o.dismiss();
            return Unit.INSTANCE;
        }
    }

    public oO00o00O(WelcomeDialog welcomeDialog) {
        this.f32863Oooo = welcomeDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LiveData<ApiResult<RandomActivityModel.DataBean>> roomInfoFromTaskEnter = ((TaskViewModel) this.f32863Oooo.f12172OoooO00.getValue()).getRoomInfoFromTaskEnter();
        WelcomeDialog welcomeDialog = this.f32863Oooo;
        roomInfoFromTaskEnter.observe(welcomeDialog.f12169Oooo0o, new OooOo(OooO00o.f32864Oooo0o, null, new OooO0O0(welcomeDialog), false, 10));
    }
}
