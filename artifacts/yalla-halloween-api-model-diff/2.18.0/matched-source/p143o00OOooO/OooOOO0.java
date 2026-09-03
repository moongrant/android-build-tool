package p143o00OOooO;

import androidx.activity.result.OooO00o;
import com.app.base.fragment.CoinDetailFragment;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import p151o00Oo0Oo.Oooo000;
import p175o00OooOO.o0O00OOO;
import p187o00o00Oo.o0ooOOo;
import p409o0Oo0OOO.o;
import p517o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements o0ooOOo, OooO00o, Oooo000, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31918Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31919OoooO00;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f31918Oooo = i;
        this.f31919OoooO00 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailView this$0 = (MomentDetailView) this.f31919OoooO00;
        int i = MomentDetailView.f24956ooOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo00();
    }

    public final void OooO0O0(String content) {
        MomentSendActivity this$0 = (MomentSendActivity) this.f31919OoooO00;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        o00O00.OooO0O0("onMaskAdd content = " + content);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this$0.f22397o00o0O > this$0.f22396o00Ooo) {
            this$0.f22397o00o0O = timeInMillis;
            if (Intrinsics.areEqual(content, "@")) {
                this$0.OooOooO().f48928OooO0oo.OooO0o0(true);
            }
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31918Oooo) {
            case 0:
                ((CoinDetailFragment) this.f31919OoooO00).lambda$initView$1();
                break;
            case 3:
                TopicPostLatestFragment.m409initView$lambda9((TopicPostLatestFragment) this.f31919OoooO00);
                break;
            default:
                MainRoomPopularFragment.m476initView$lambda1((MainRoomPopularFragment) this.f31919OoooO00);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o this$0 = (o) this.f31919OoooO00;
        int i = o.f39123OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0OO();
    }
}
