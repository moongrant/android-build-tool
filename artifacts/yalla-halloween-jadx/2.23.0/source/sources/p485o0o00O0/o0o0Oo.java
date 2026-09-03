package p485o0o00O0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f48009OooO0Oo;

    public o0o0Oo(o00OOOOo o00ooooo2) {
        this.f48009OooO0Oo = o00ooooo2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (string.toString().length() >= 500) {
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Input_a_maximum_of_xxx_characters), "500");
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        this.f48009OooO0Oo.f47863OooO0OO.setValue(Boolean.valueOf(TextUtils.isEmpty(string)));
    }
}
