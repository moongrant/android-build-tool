package p487o0o00O;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48910OooO0oO;

    public oo0o0Oo(BlackListActivity blackListActivity) {
        this.f48910OooO0oO = blackListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BlackListActivity blackListActivity = this.f48910OooO0oO;
        if (BlackListActivity.OooOo0(blackListActivity)) {
            return;
        }
        boolean z = !blackListActivity.f24915OooOOo;
        blackListActivity.f24915OooOOo = z;
        if (z) {
            TextView textView = blackListActivity.f24917OooOOoo;
            Intrinsics.checkNotNull(textView);
            textView.setText(blackListActivity.getString(o000000.Done));
        } else {
            TextView textView2 = blackListActivity.f24917OooOOoo;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(blackListActivity.getString(o000000.Edit));
        }
        o000000 o000000Var = blackListActivity.f24920OooOo0O;
        if (o000000Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var = null;
        }
        o000000Var.notifyDataSetChanged();
    }
}
