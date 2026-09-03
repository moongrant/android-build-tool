package p515o0o0O0O0;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f51783OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51784OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Long l, MomentDetailModel momentDetailModel) {
        super(1);
        this.f51783OooO0Oo = l;
        this.f51784OooO0o0 = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        long jLongValue = this.f51783OooO0Oo.longValue();
        MomentDetailModel momentDetailModel = this.f51784OooO0o0;
        LiveEventBus.get("POST_REMOVE_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_operation_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
