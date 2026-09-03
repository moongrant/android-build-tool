package p584o0oOoOoO;

import android.content.Context;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p603o0oo00Oo.oO0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f46859Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f46860OoooO00;

    public /* synthetic */ c2(Object obj, int i) {
        this.f46859Oooo = i;
        this.f46860OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46859Oooo) {
            case 0:
                MainSearchUserFragment.m373initSearchHistory$lambda19$lambda16((MainSearchUserFragment) this.f46860OoooO00, view);
                break;
            default:
                SendMomentPollView this$0 = (SendMomentPollView) this.f46860OoooO00;
                int i = SendMomentPollView.f25205OoooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.send_moment_poll_remove_title));
                oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.send_moment_poll_remove_Remove));
                oo0ooo0.OooOo0o(new oO0000O(this$0));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
        }
    }
}
