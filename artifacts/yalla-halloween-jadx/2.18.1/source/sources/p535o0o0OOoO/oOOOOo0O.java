package p535o0o0OOoO;

import android.view.View;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p649o0ooOOoo.e7;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOOOo0O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f43716Oooo;

    public oOOOOo0O(WebActivity webActivity) {
        this.f43716Oooo = webActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e7 e7Var = this.f43716Oooo.f22115OooooOO;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var = null;
        }
        e7Var.f49213OooO0o0.reload();
        this.f43716Oooo.OooOoOO();
    }
}
