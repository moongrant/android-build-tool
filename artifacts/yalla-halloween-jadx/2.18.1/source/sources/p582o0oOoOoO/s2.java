package p582o0oOoOoO;

import android.os.Looper;
import com.app.base.model.RoomMemberConveneResultModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends Lambda implements Function1<RoomMemberConveneResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46898Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(1);
        this.f46898Oooo0o = roomMemberConveneListDialog;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomMemberConveneResultModel roomMemberConveneResultModel) {
        this.f46898Oooo0o.f24162OoooOOo.clear();
        boolean z = true;
        this.f46898Oooo0o.OooOOOo(true);
        this.f46898Oooo0o.OooOOoo();
        String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_send_success);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
