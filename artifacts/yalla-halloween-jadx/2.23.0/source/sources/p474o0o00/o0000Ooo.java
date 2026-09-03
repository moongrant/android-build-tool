package p474o0o00;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47240OooO0Oo;

    public o0000Ooo(LoginActivity loginActivity) {
        this.f47240OooO0Oo = loginActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = ReOpenAccountActivity.f25288OooOo0;
        LoginActivity context = this.f47240OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) ReOpenAccountActivity.class));
    }
}
