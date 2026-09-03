package p142o00OOooO;

import androidx.activity.result.OooO00o;
import com.app.base.fragment.CoinDetailFragment;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import p150o00Oo0Oo.Oooo000;
import p174o00OooOO.o0O00OOO;
import p186o00o00Oo.o0ooOOo;
import p406o0Oo0OOO.oO00000;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements o0ooOOo, OooO00o, Oooo000, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31897OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31898OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f31897OooO0Oo = i;
        this.f31898OooO0o0 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailView this$0 = (MomentDetailView) this.f31898OooO0o0;
        int i = MomentDetailView.f24937OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo00();
    }

    public final void OooO0O0(String content) {
        MomentSendActivity this$0 = (MomentSendActivity) this.f31898OooO0o0;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        o00O00.OooO0O0("onMaskAdd content = " + content);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this$0.f22378o00O0O > this$0.f22385ooOO) {
            this$0.f22378o00O0O = timeInMillis;
            if (Intrinsics.areEqual(content, "@")) {
                this$0.OooOooO().f48991OooO0oo.OooO0o0(true);
            }
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31897OooO0Oo) {
            case 0:
                ((CoinDetailFragment) this.f31898OooO0o0).lambda$initView$1();
                break;
            case 3:
                TopicPostLatestFragment.m409initView$lambda9((TopicPostLatestFragment) this.f31898OooO0o0);
                break;
            default:
                MainRoomPopularFragment.m476initView$lambda1((MainRoomPopularFragment) this.f31898OooO0o0);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f31898OooO0o0;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0OO();
    }
}
