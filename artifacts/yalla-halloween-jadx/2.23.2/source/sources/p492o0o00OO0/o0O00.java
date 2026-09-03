package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
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
import p423o0OoO0OO.o000;
import p557o0oOOooO.oOo0000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49203OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(MomentSendActivity momentSendActivity) {
        super(1);
        this.f49203OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel momentSendModel2 = momentSendModel;
        if (momentSendModel2 != null) {
            int i = o000000.send_successfully;
            MomentSendActivity momentSendActivity = this.f49203OooO0Oo;
            String strOooO0OO = o000.OooO0OO(momentSendActivity, i);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            LiveEventBus.get("Post_send_success").post(momentSendModel2);
            int i2 = MomentSendActivity.f25726Oooo0OO;
            EditTextSpan editTextSpan = momentSendActivity.OooOo().f44321OooO0o0;
            oOo0000O spanManager = editTextSpan.getSpanManager();
            spanManager.OooO00o();
            spanManager.f56176OooO00o.clear();
            editTextSpan.setText("");
            editTextSpan.getMaskKeys().clear();
            momentSendActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
