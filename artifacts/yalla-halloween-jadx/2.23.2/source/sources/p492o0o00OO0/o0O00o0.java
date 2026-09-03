package p492o0o00OO0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p423o0OoO0OO.o000;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49262OooO0Oo;

    public o0O00o0(MomentSendActivity momentSendActivity) {
        this.f49262OooO0Oo = momentSendActivity;
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
        o0000O00.OooO0O0("addTextChangedListener string = " + ((Object) string));
        int length = string.length();
        boolean z = true;
        MomentSendActivity momentSendActivity = this.f49262OooO0Oo;
        if (length > 1000) {
            String strOooO0OO = o000.OooO0OO(momentSendActivity, o000000.Input_a_maximum_of_1000_characters);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        int i4 = MomentSendActivity.f25726Oooo0OO;
        if (oOO.OooO0Oo(momentSendActivity.OooOo().f44321OooO0o0) > 50) {
            String strOooO0OO2 = o000.OooO0OO(momentSendActivity, o000000.char_room_edit1);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        momentSendActivity.OooOooo();
    }
}
