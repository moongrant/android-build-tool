package p485o0o00O0;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f48221OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.PrivateChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.PostDetailActivity.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public oo00oO(MomentSendActivity momentSendActivity) {
        this.f48221OooO0Oo = momentSendActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        int i = MomentSendActivity.f26175Oooo0OO;
        MomentSendActivity momentSendActivity = this.f48221OooO0Oo;
        MomentAdapterTag momentAdapterTag = momentSendActivity.OooOoO0().getMomentAdapterTag();
        if (momentAdapterTag != null) {
            int i2 = OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
        }
        String strOooO0OO = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.send_successfully);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        momentSendActivity.finish();
    }
}
