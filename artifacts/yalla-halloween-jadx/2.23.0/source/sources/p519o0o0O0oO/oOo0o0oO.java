package p519o0o0O0oO;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oO00O0o0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o0oO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f53017OooO0Oo;

    public oOo0o0oO(oO0o0000 oo0o0000) {
        this.f53017OooO0Oo = oo0o0000;
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
        OooOOO0.OooO0O0("addTextChangedListener content = " + ((Object) content));
        AppCompatEditText appCompatEditText = this.f53017OooO0Oo.OooOO0().f59316OooOoOO;
        HashMap map = oO00O0o0.f56540OooO0Oo;
        if ((appCompatEditText != null ? appCompatEditText.getText().length() : 0) > 50) {
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Input_a_maximum_of_xxx_characters), "50");
            if (StringsKt.isBlank(strOooO00o)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }
}
