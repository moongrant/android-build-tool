package p519o0o0O0oO;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOo00;
import com.code.android.util.o000O0;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.RandomActivityModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.dialog.WelcomeDialog;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000OO0;
import p427o0OoOO00.o0OOO0o;
import p466o0Oooo0o.oo00o;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ WelcomeDialog f52787OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<RandomActivityModel.DataBean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f52788OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RandomActivityModel.DataBean dataBean) {
            RandomActivityModel.DataBean dataBean2 = dataBean;
            if (OooOo00.OooO0O0(dataBean2 != null ? dataBean2.barId : null)) {
                RoomModel roomModel = new RoomModel();
                Intrinsics.checkNotNull(dataBean2);
                roomModel.setRoomIp(dataBean2.roomServerIP);
                roomModel.websocketaddr = dataBean2.websocketaddr;
                roomModel.setId(OooOOOO.OooOO0o(dataBean2.barId));
                roomModel.setName(dataBean2.barName);
                roomModel.setLevel(dataBean2.barLevel);
                roomModel.setSessionId(dataBean2.sessionId);
                OooOo.OooO0OO(575, null);
                if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                    SharedPreferences.Editor editorEdit = (TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o000O0.f10354OooO00o) : o000O0.f10354OooO00o.getSharedPreferences("Table_AppFirstStart", 0)).edit();
                    if (editorEdit != null) {
                        editorEdit.putBoolean("IsNewUserFirstEnterRoom", true).commit();
                    }
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Room_welcome_gohavefun);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<RandomActivityModel.DataBean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WelcomeDialog f52789OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(WelcomeDialog welcomeDialog) {
            super(1);
            this.f52789OooO0Oo = welcomeDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RandomActivityModel.DataBean> apiResult) {
            ApiResult<RandomActivityModel.DataBean> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f52789OooO0Oo.dismiss();
            return Unit.INSTANCE;
        }
    }

    public o5(WelcomeDialog welcomeDialog) {
        this.f52787OooO0oO = welcomeDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WelcomeDialog welcomeDialog = this.f52787OooO0oO;
        ((TaskViewModel) welcomeDialog.f27990OooO0oo.getValue()).getRoomInfoFromTaskEnter().observe(welcomeDialog.f27986OooO0Oo, new o0000OO0(OooO00o.f52788OooO0Oo, null, new OooO0O0(welcomeDialog), false, 10));
    }
}
