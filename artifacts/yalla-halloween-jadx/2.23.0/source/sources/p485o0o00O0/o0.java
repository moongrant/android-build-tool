package p485o0o00O0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p417o0OoO0.o00oO0o;
import p579o0oOoo.oO00O0o0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47792OooO0Oo;

    public o0(MomentSendActivity momentSendActivity) {
        this.f47792OooO0Oo = momentSendActivity;
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
    public final void onTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO0.OooO0O0("addTextChangedListener string = " + ((Object) string));
        int length = string.length();
        boolean z = true;
        MomentSendActivity momentSendActivity = this.f47792OooO0Oo;
        if (length > 1000) {
            String strOooO0OO = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.Input_a_maximum_of_1000_characters);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        int i4 = MomentSendActivity.f26175Oooo0OO;
        if (oO00O0o0.OooO0Oo(momentSendActivity.OooOo().f58559OooO0o0) > 50) {
            String strOooO0OO2 = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.char_room_edit1);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        momentSendActivity.OooOooo();
    }
}
