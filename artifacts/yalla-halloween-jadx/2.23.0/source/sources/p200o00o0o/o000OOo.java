package p200o00o0o;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import p245o00oo0o.o00O;
import p427o0OoOO00.oo000o;
import p466o0Oooo0o.oOO00O;
import p496o0o00o.o00O0;
import p579o0oOoo.oO000O0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements o00O.OooO00o, oOO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39126OooO0o0;

    public /* synthetic */ o000OOo(Object obj, Object obj2) {
        this.f39125OooO0Oo = obj;
        this.f39126OooO0o0 = obj2;
    }

    @Override // p466o0Oooo0o.oOO00O
    public final void OooO00o() {
        PremiumActivity this$0 = (PremiumActivity) this.f39125OooO0Oo;
        PremiumShopModel.PremiumInfo goods = (PremiumShopModel.PremiumInfo) this.f39126OooO0o0;
        int i = PremiumActivity.f27140Oooo0oO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(goods, "$goods");
        this$0.getClass();
        boolean z = true;
        if (!oO000O0.f56533OooO00o.OooO0O0()) {
            if (!(goods.getGooglePaySkuDetail() == null) && oo000o.OooO0O0(this$0)) {
                this$0.OooOooO(goods);
                return;
            }
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.google_play_useless);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (goods.getChannelSKU() != null) {
            PremiumShopModel.ChannelSKU channelSKU = goods.getChannelSKU();
            String sku = channelSKU != null ? channelSKU.getSku() : null;
            if (sku == null || sku.length() == 0 ? false : StringsKt.OooO0o(sku, "com.yalla.huawei.premium.")) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new o00O0(this$0, goods, null), 2, null);
                return;
            }
        }
        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.huawei_play_useless);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o2.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o0ooOoO();
    }
}
