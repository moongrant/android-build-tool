package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class p7 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44294Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List<String> f44295Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(VoteGameCreateActivity voteGameCreateActivity, List<String> list) {
        super(1);
        this.f44294Oooo0o = voteGameCreateActivity;
        this.f44295Oooo0oO = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        VoteGameCreateActivity.Period period;
        int iIntValue = num.intValue();
        VoteGameCreateActivity voteGameCreateActivity = this.f44294Oooo0o;
        if (iIntValue == 0) {
            period = VoteGameCreateActivity.Period.FiveMin;
        } else if (iIntValue == 1) {
            period = VoteGameCreateActivity.Period.TenMin;
        } else if (iIntValue == 2) {
            period = VoteGameCreateActivity.Period.ThirtyMin;
        } else if (iIntValue != 3) {
            period = iIntValue != 4 ? VoteGameCreateActivity.Period.FiveMin : VoteGameCreateActivity.Period.Infinite;
        } else {
            period = VoteGameCreateActivity.Period.SixtyMin;
        }
        voteGameCreateActivity.f23078OooooOO = period;
        voteGameCreateActivity.OooOoo().f51035OooO0oo.setText(this.f44295Oooo0oO.get(iIntValue));
        return null;
    }
}
