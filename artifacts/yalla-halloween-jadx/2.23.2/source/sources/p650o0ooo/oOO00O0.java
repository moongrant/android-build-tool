package p650o0ooo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOo00;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.RandomActivityModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p429o0OoOO.o0Oo0oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function1<RandomActivityModel.DataBean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO00O0 f58938OooO0Oo = new oOO00O0();

    public oOO00O0() {
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
            roomModel.setId(o0O0O0Oo.OooOO0o(dataBean2.barId));
            roomModel.setName(dataBean2.barName);
            roomModel.setLevel(dataBean2.barLevel);
            roomModel.setSessionId(dataBean2.sessionId);
            p545o0oO0O00.OooOo00.OooO0O0(575, null);
            if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                SharedPreferences.Editor editorEdit = (TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o000O00O.f13421OooO00o) : o000O00O.f13421OooO00o.getSharedPreferences("Table_AppFirstStart", 0)).edit();
                if (editorEdit != null) {
                    editorEdit.putBoolean("IsNewUserFirstEnterRoom", true).commit();
                }
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Room_welcome_gohavefun);
            }
        }
        return Unit.INSTANCE;
    }
}
