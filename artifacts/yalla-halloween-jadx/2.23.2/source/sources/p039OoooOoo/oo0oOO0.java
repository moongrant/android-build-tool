package p039OoooOoo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.OooOO0O.OooO0OO;
import androidx.camera.video.OooOO0O.OooO0o;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o000OO.OooO00o;
import p033OoooO0O.o0O0O00;
import p429o0OoOO.o00Ooo;
import p473o0OoooOo.o0OOO0;
import p506o0o00oOo.oO00OOOo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0oOO0 implements o000Oo0.OooO0OO, o0OOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1745OooO0o0;

    public /* synthetic */ oo0oOO0(Object obj, Object obj2) {
        this.f1744OooO0Oo = obj;
        this.f1745OooO0o0 = obj2;
    }

    @Override // p473o0OoooOo.o0OOO0
    public final void OooO0O0() {
        PremiumActivity this$0 = (PremiumActivity) this.f1744OooO0Oo;
        PremiumShopModel.PremiumInfo goods = (PremiumShopModel.PremiumInfo) this.f1745OooO0o0;
        int i = PremiumActivity.f26673Oooo0oO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(goods, "$goods");
        this$0.getClass();
        boolean z = true;
        if (!oOO0.f57167OooO00o.OooO0O0()) {
            if (!(goods.getGooglePaySkuDetail() == null) && o00Ooo.OooO0O0(this$0)) {
                this$0.OooOoo(goods);
                return;
            }
            String strOooO0OO = o0000.OooO0OO(o000000.google_play_useless);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (goods.getChannelSKU() != null) {
            PremiumShopModel.ChannelSKU channelSKU = goods.getChannelSKU();
            String sku = channelSKU != null ? channelSKU.getSku() : null;
            if (sku == null || sku.length() == 0 ? false : StringsKt__StringsKt.contains$default(sku, "com.yalla.huawei.premium.", false, 2, (Object) null)) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new oO00OOOo(this$0, goods, null), 2, null);
                return;
            }
        }
        String strOooO0OO2 = o0000.OooO0OO(o000000.huawei_play_useless);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        com.code.android.util.o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o2.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [OoooOoo.o00OO000] */
    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(final o000Oo0.OooO00o oooO00o) {
        final OooOO0O oooOO0O = (OooOO0O) this.f1744OooO0Oo;
        OooOO0O.OooOOO0 oooOOO0 = (OooOO0O.OooOOO0) this.f1745OooO0o0;
        oooOO0O.getClass();
        ?? r2 = new OooO00o() { // from class: OoooOoo.o00OO000
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                OooOO0O oooOO0O2 = oooOO0O;
                if (oooOO0O2.f3960OoooO == null) {
                    if (th instanceof EncodeException) {
                        oooOO0O2.OooOo(OooOO0O.EnumC0017OooOO0O.ERROR_ENCODER);
                    } else {
                        oooOO0O2.OooOo(OooOO0O.EnumC0017OooOO0O.ERROR_SOURCE);
                    }
                    oooOO0O2.f3960OoooO = th;
                    oooOO0O2.Oooo00o();
                    oooO00o.OooO0O0(null);
                }
            }
        };
        final androidx.camera.video.internal.audio.OooO00o oooO00o2 = oooOO0O.f3946OooOoo0;
        final OooOO0O.OooO0OO oooO0OO = oooOO0O.new OooO0OO(r2);
        o0O0O00 o0o0o00 = oooO00o2.f4040OooO00o;
        final o0O0O00 o0o0o01 = oooOO0O.f3921OooO0OO;
        o0o0o00.execute(new Runnable() { // from class: OooooO0.o00O0O0O
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.OooO00o oooO00o3 = oooO00o2;
                oooO00o3.getClass();
                int i = androidx.camera.video.internal.audio.OooO00o.OooO0OO.f4066OooO00o[oooO00o3.f4046OooO0oO.ordinal()];
                if (i == 1) {
                    oooO00o3.f4048OooOO0 = o0o0o01;
                    oooO00o3.f4049OooOO0O = oooO0OO;
                } else if (i == 2 || i == 3) {
                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                }
            }
        });
        oooOO0O.f3948OooOooo.OooOO0O(oooOO0O.new OooO0o(oooO00o, r2, oooOOO0), o0o0o01);
        return "audioEncodingFuture";
    }
}
