package p590o0oOooo0;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
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
import p187o00o00o0.OooO;
import p205o00o0o0o.o000O;
import p381o0OOoOo0.Oooo000;
import p391o0OOooo0.oo0o0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l f57151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f57152OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, String str) {
        super(1);
        this.f57151OooO0Oo = lVar;
        this.f57152OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        PostSendGiftModel data;
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        int code = error.getCode();
        if (code == 3005) {
            PostSendGiftModelData postSendGiftModelData = (PostSendGiftModelData) OooO.OooO0O0(PostSendGiftModelData.class, error.getMessage());
            if (postSendGiftModelData != null && (data = postSendGiftModelData.getData()) != null) {
                data.setLocalGiftId(o0OoOo0.OooO(0L, this.f57152OooO0o0));
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                oo0o0Oo.OooO0o((int) data.getLocalGiftId(), data.getRemainingNum(), data.getMinExpirationTime());
                o000O00.OooO0O0(o0000.OooO0OO(data.getRemainingNum() > 0 ? o000000.Some_gifts_have_expired : o000000.The_gift_has_expired));
            }
        } else if (code != 3006) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        } else {
            o000O o000o = new o000O(this.f57151OooO0Oo.f57130OooO00o);
            o000o.OooOo00(o0000.OooO0OO(o000000.backpack_frozen));
            o000o.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
