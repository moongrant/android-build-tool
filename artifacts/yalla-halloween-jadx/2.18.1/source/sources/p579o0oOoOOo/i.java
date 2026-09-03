package p579o0oOoOOo;

import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p028Oooo0o0.o00O0O0O;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Fragment f45960OooO0Oo;

    public /* synthetic */ i(Fragment fragment) {
        this.f45960OooO0Oo = fragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        ExploreTagRoomListFragment.m327initView$lambda1((ExploreTagRoomListFragment) this.f45960OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        j this$0 = (j) this.f45960OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O o00o2 = o00O.f43140OooO00o;
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00o2.OooOO0(((Long) obj).longValue());
        if (roomUserInfoModelOooOO0 == null) {
            return;
        }
        Pair<Boolean, Integer> pairOooO0oO = this$0.OooO0oO(roomUserInfoModelOooOO0);
        if (pairOooO0oO.getFirst().booleanValue()) {
            this$0.f45966OoooO.remove(pairOooO0oO.getSecond().intValue());
        } else {
            if (this$0.f45966OoooO.size() >= 20) {
                String strOooO0OO = o000O0O0.OooO0OO(R.string.room_vote_game_master_select_ten_user);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            this$0.f45966OoooO.add(roomUserInfoModelOooOO0);
        }
        TextView textView = this$0.f41565Oooo0oO;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
            textView = null;
        }
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append(this$0.f45966OoooO.size());
        sbOooO00o.append("/20)");
        textView.setText(sbOooO00o.toString());
        baseQuickAdapter.notifyItemChanged(i);
    }
}
