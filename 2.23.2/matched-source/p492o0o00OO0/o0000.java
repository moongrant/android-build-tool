package p492o0o00OO0;

import android.content.Context;
import androidx.lifecycle.Observer;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;
import o000O0.OooOo;
import p499o0o00o.o0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49108OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f49107OooO0Oo = i;
        this.f49108OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object it) {
        int i = this.f49107OooO0Oo;
        Object obj = this.f49108OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                Long l = (Long) it;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = o000O00O.f13421OooO00o;
                if (Intrinsics.areEqual(this$0, OooO0O0.OooO0O0())) {
                    MomentDetailModel momentDetailModel = (MomentDetailModel) OooOo.OooO00o(this$0);
                    if (Intrinsics.areEqual(l, momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null)) {
                        this$0.finish();
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                o0OO0.OooO0O0((MixedRoomActivity) obj, true);
                break;
            default:
                MainRoomFragment.initObserver$lambda$0((MainRoomFragment) obj, (Boolean) it);
                break;
        }
    }
}
