package p579o0oOoo;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.moment.PostSendGiftModel;
import com.yalla.yalla.model.moment.PostSendGiftModelData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p140o00OOooo.OooOO0;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p385o0OOooOO.oOO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo0oooO extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f56719OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0oooO(oO0O0O00 oo0o0o00, String str) {
        super(1);
        this.f56718OooO0Oo = oo0o0o00;
        this.f56719OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        PostSendGiftModel data;
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        int code = error.getCode();
        if (code == 3005) {
            PostSendGiftModelData postSendGiftModelData = (PostSendGiftModelData) OooOO0.OooO0O0(PostSendGiftModelData.class, error.getMessage());
            if (postSendGiftModelData != null && (data = postSendGiftModelData.getData()) != null) {
                data.setLocalGiftId(o0OoOo0.OooO(0L, this.f56719OooO0o0));
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                oOO00O.OooO0o((int) data.getLocalGiftId(), data.getRemainingNum(), data.getMinExpirationTime());
                o000O00O.OooO0O0(o0000.OooO0OO(data.getRemainingNum() > 0 ? oO00OOo0.Some_gifts_have_expired : oO00OOo0.The_gift_has_expired));
            }
        } else if (code != 3006) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        } else {
            o0OO00O o0oo00o2 = new o0OO00O(this.f56718OooO0Oo.f56573OooO00o);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.backpack_frozen));
            o0oo00o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
