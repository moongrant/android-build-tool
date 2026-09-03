package p049Ooooooo;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class o0O000O extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000O f4213OooO00o = new o0O000O();

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void OooO00o(@NotNull o0 autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.f4210OooO0OO.registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void OooO0O0(@NotNull o0 autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.f4210OooO0OO.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(@NotNull View view, int i, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAutofillEvent(view, i, i2);
        if (i2 == 1) {
            str = "Autofill popup was shown.";
        } else if (i2 != 2) {
            str = i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
