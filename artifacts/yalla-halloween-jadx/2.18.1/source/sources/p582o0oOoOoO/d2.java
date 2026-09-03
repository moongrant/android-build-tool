package p582o0oOoOoO;

import android.content.Context;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p601o0oo00Oo.oO0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d2 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46846Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f46847Oooo0oO;

    public /* synthetic */ d2(Object obj, int i) {
        this.f46846Oooo0o = i;
        this.f46847Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46846Oooo0o) {
            case 0:
                MainSearchUserFragment.m373initSearchHistory$lambda19$lambda16((MainSearchUserFragment) this.f46847Oooo0oO, view);
                break;
            default:
                SendMomentPollView this$0 = (SendMomentPollView) this.f46847Oooo0oO;
                int i = SendMomentPollView.f25186o000oOoO;
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
