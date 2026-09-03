package p539o0o0OoOO;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.GifFaceBuyModel;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class f1 extends Lambda implements Function1<GifFaceBuyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ v0 f55537OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(v0 v0Var) {
        super(1);
        this.f55537OooO0Oo = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GifFaceBuyModel gifFaceBuyModel) {
        GifListJson gifListJsonCopy;
        GifFaceBuyModel gifFaceBuyModel2 = gifFaceBuyModel;
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.face_buy_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        v0 v0Var = this.f55537OooO0Oo;
        GifListJson value = v0Var.f55720OooO0O0.getValue();
        if (value != null && (gifListJsonCopy = value.copy((8191 & 1) != 0 ? value.catalogId : 0, (8191 & 2) != 0 ? value.buyType : 0, (8191 & 4) != 0 ? value.isCanUse : false, (8191 & 8) != 0 ? value.isNew : false, (8191 & 16) != 0 ? value.expireTime : 0L, (8191 & 32) != 0 ? value.dayNum : 0, (8191 & 64) != 0 ? value.payType : 0, (8191 & 128) != 0 ? value.price : 0, (8191 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? value.promotionPrice : 0, (8191 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? value.folderName : null, (8191 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? value.folderIcon : null, (8191 & 2048) != 0 ? value.themeConfig : null, (8191 & 4096) != 0 ? value.item : null)) != null) {
            gifListJsonCopy.setThemeConfig(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getThemeConfig() : null);
            gifListJsonCopy.setCanUse(true);
            gifListJsonCopy.setExpireTime(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getExpireTime() : 0L);
            gifListJsonCopy.setDayNum(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getDayNum() : 1);
            v0Var.f55720OooO0O0.postValue(gifListJsonCopy);
        }
        return Unit.INSTANCE;
    }
}
