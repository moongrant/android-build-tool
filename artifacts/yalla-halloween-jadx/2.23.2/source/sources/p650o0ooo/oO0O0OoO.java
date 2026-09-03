package p650o0ooo;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.activity.OooOo00;
import androidx.appcompat.widget.AppCompatEditText;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0OoO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58889OooO0Oo;

    public oO0O0OoO(oO00OOOo oo00oooo) {
        this.f58889OooO0Oo = oo00oooo;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence content, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        o0000O00.OooO0O0("addTextChangedListener content = " + ((Object) content));
        AppCompatEditText appCompatEditText = this.f58889OooO0Oo.OooOO0().f44029OooOoOO;
        HashMap map = oOO.f57157OooO0Oo;
        if ((appCompatEditText != null ? appCompatEditText.getText().length() : 0) > 50) {
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Input_a_maximum_of_xxx_characters), "50");
            if (StringsKt.isBlank(strOooO00o)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
    }
}
