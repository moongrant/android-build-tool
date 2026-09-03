package p176o00OoooO;

import android.view.View;
import com.app.base.view.dialog.WelcomeDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class oO00o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ WelcomeDialog f32856Oooo;

    public oO00o0(WelcomeDialog welcomeDialog) {
        this.f32856Oooo = welcomeDialog;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f32856Oooo.dismiss();
    }
}
