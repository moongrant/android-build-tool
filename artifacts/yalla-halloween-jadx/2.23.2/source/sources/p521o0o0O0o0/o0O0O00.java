package p521o0o0O0o0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f52981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52982OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(Long l, MomentDetailModel momentDetailModel) {
        super(1);
        this.f52981OooO0Oo = l;
        this.f52982OooO0o0 = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        long jLongValue = this.f52981OooO0Oo.longValue();
        MomentDetailModel momentDetailModel = this.f52982OooO0o0;
        LiveEventBus.get("POST_REMOVE_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
        String strOooO0OO = o0000.OooO0OO(o000000.post_operation_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
