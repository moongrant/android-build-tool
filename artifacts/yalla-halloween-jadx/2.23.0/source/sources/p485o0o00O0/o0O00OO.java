package p485o0o00O0;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.k;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47890OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(MomentSendActivity momentSendActivity) {
        super(1);
        this.f47890OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel momentSendModel2 = momentSendModel;
        if (momentSendModel2 != null) {
            int i = oO00OOo0.send_successfully;
            MomentSendActivity momentSendActivity = this.f47890OooO0Oo;
            String strOooO0OO = o00oO0o.OooO0OO(momentSendActivity, i);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            LiveEventBus.get("Post_send_success").post(momentSendModel2);
            int i2 = MomentSendActivity.f26175Oooo0OO;
            EditTextSpan editTextSpan = momentSendActivity.OooOo().f58559OooO0o0;
            k spanManager = editTextSpan.getSpanManager();
            spanManager.OooO00o();
            spanManager.f56774OooO00o.clear();
            editTextSpan.setText("");
            editTextSpan.getMaskKeys().clear();
            momentSendActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
