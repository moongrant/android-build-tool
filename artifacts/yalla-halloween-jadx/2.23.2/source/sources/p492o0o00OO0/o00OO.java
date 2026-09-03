package p492o0o00OO0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f49170OooO0Oo;

    public o00OO(o00OOO0 o00ooo1) {
        this.f49170OooO0Oo = o00ooo1;
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
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Input_a_maximum_of_xxx_characters), "500");
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        this.f49170OooO0Oo.f49180OooO0OO.setValue(Boolean.valueOf(TextUtils.isEmpty(string)));
    }
}
