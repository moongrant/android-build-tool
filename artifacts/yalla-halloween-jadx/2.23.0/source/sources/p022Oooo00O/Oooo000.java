package p022Oooo00O;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import o0OO0o.OooOOO0;
import p245o00oo0o.o00O;
import p389o0OOoooO.oo0o0O0;
import p562o0oOo0O.o000oOoO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements o00O000.OooO0OO, o00O.OooO00o, o000oOoO, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f453OooO0Oo;

    public /* synthetic */ Oooo000(Object obj) {
        this.f453OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(OooOOO0 oooOOO0) {
        MomentDetailCommentFragment.init$lambda$0((MomentDetailCommentFragment) this.f453OooO0Oo, oooOOO0);
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f453OooO0Oo;
        int i = JoinTopicListActivity.f26043OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f453OooO0Oo;
        o0oo0oo2.getClass();
        o0oo0oo2.f840OooO0OO.execute(new o00Oo0(0, o0oo0oo2, oooO00o));
        return "updateSessionConfigAsync";
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).Oooo0o0();
    }
}
