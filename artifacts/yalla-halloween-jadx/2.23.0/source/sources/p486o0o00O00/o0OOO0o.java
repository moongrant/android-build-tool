package p486o0o00O00;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48388OooO0oO;

    public o0OOO0o(BlackListActivity blackListActivity) {
        this.f48388OooO0oO = blackListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BlackListActivity blackListActivity = this.f48388OooO0oO;
        if (BlackListActivity.OooOo0(blackListActivity)) {
            return;
        }
        boolean z = !blackListActivity.f25369OooOOo;
        blackListActivity.f25369OooOOo = z;
        if (z) {
            TextView textView = blackListActivity.f25371OooOOoo;
            Intrinsics.checkNotNull(textView);
            textView.setText(blackListActivity.getString(oO00OOo0.Done));
        } else {
            TextView textView2 = blackListActivity.f25371OooOOoo;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(blackListActivity.getString(oO00OOo0.Edit));
        }
        oo0o0Oo oo0o0oo = blackListActivity.f25374OooOo0O;
        if (oo0o0oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo = null;
        }
        oo0o0oo.notifyDataSetChanged();
    }
}
