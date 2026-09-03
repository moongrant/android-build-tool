package p587o0oOooOO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Lambda implements Function1<GifFaceBuyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ q f56740OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q qVar) {
        super(1);
        this.f56740OooO0Oo = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GifFaceBuyModel gifFaceBuyModel) {
        GifListJson gifListJsonCopy;
        GifFaceBuyModel gifFaceBuyModel2 = gifFaceBuyModel;
        String strOooO0OO = o0000.OooO0OO(o000000.face_buy_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        q qVar = this.f56740OooO0Oo;
        GifListJson value = qVar.f56935OooO0O0.getValue();
        if (value != null && (gifListJsonCopy = value.copy((8191 & 1) != 0 ? value.catalogId : 0, (8191 & 2) != 0 ? value.buyType : 0, (8191 & 4) != 0 ? value.isCanUse : false, (8191 & 8) != 0 ? value.isNew : false, (8191 & 16) != 0 ? value.expireTime : 0L, (8191 & 32) != 0 ? value.dayNum : 0, (8191 & 64) != 0 ? value.payType : 0, (8191 & 128) != 0 ? value.price : 0, (8191 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? value.promotionPrice : 0, (8191 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? value.folderName : null, (8191 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? value.folderIcon : null, (8191 & 2048) != 0 ? value.themeConfig : null, (8191 & 4096) != 0 ? value.item : null)) != null) {
            gifListJsonCopy.setThemeConfig(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getThemeConfig() : null);
            gifListJsonCopy.setCanUse(true);
            gifListJsonCopy.setExpireTime(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getExpireTime() : 0L);
            gifListJsonCopy.setDayNum(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getDayNum() : 1);
            qVar.f56935OooO0O0.postValue(gifListJsonCopy);
        }
        return Unit.INSTANCE;
    }
}
