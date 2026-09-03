package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43912Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f43912Oooo0o = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MomentMessageListActivity momentMessageListActivity = this.f43912Oooo0o;
        MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
        momentMessageListActivity.Oooo000(iIntValue);
        if (iIntValue == 0) {
            o0O00000.OooO0OO("Moments_notice_all");
        } else if (iIntValue == 1) {
            o0O00000.OooO0OO("Moments_notice_like");
        } else if (iIntValue == 2) {
            o0O00000.OooO0OO("Moments_notice_comment");
        } else if (iIntValue == 3) {
            o0O00000.OooO0OO("Moments_notice_at");
        } else if (iIntValue == 4) {
            o0O00000.OooO0OO("Moments_notice_gifts");
        } else if (iIntValue == 5) {
            o0O00000.OooO0OO("Moments_notice_other");
        }
        return Unit.INSTANCE;
    }
}
