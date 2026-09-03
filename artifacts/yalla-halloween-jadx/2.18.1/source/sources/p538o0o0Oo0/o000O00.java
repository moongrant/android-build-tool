package p538o0o0Oo0;

import android.widget.LinearLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43923Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(MomentSendActivity momentSendActivity) {
        super(1);
        this.f43923Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            MomentSendActivity momentSendActivity = this.f43923Oooo0o;
            MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            momentSendActivity.OooOooO().f48988OooO0o.setHint(this.f43923Oooo0o.f22369Ooooo00);
            this.f43923Oooo0o.Oooo00O().setShareType(this.f43923Oooo0o.f22370Ooooo0o);
            this.f43923Oooo0o.OooOooO().f48991OooO0oo.OooO0OO(true);
            LinearLayout linearLayout = this.f43923Oooo0o.OooOooO().f48989OooO0o0;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutImage");
            o00O0O.OooO(linearLayout);
            this.f43923Oooo0o.OooOooO().f48988OooO0o.setMinLines(6);
        } else {
            MomentSendActivity momentSendActivity2 = this.f43923Oooo0o;
            MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22367o00oO0o;
            momentSendActivity2.OooOooO().f48991OooO0oo.OooO0OO(false);
            MomentSendActivity momentSendActivity3 = this.f43923Oooo0o;
            if (momentSendActivity3.f22370Ooooo0o == -1) {
                momentSendActivity3.f22370Ooooo0o = momentSendActivity3.Oooo00O().getShareType();
            }
            if (this.f43923Oooo0o.f22369Ooooo00.length() == 0) {
                MomentSendActivity momentSendActivity4 = this.f43923Oooo0o;
                momentSendActivity4.f22369Ooooo00 = momentSendActivity4.OooOooO().f48988OooO0o.getHint().toString();
            }
            this.f43923Oooo0o.Oooo00O().setShareType(21);
            this.f43923Oooo0o.OooOooO().f48988OooO0o.setHint(o000O0O0.OooO0OO(R.string.Send_Moment_Poll_Title_Hint));
            LinearLayout linearLayout2 = this.f43923Oooo0o.OooOooO().f48989OooO0o0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutImage");
            o00O0O.OooO00o(linearLayout2);
            this.f43923Oooo0o.OooOooO().f48988OooO0o.setMinLines(2);
        }
        return Unit.INSTANCE;
    }
}
