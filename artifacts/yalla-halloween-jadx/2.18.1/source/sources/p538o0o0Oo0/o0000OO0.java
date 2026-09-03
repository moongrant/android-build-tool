package p538o0o0Oo0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p074o000O0oo.OooOOO;
import p168o00Ooo0.o0OoOo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43918Oooo0o;

    public o0000OO0(MomentSendActivity momentSendActivity) {
        this.f43918Oooo0o = momentSendActivity;
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
        o00O00.OooO0O0("addTextChangedListener string = " + ((Object) string));
        if (string.length() > 1000) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Input_a_maximum_of_1000_characters);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        MomentSendActivity momentSendActivity = this.f43918Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        if (o0OoOo0.OooO0Oo(momentSendActivity.OooOooO().f48988OooO0o) > 50) {
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.char_room_edit1);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                }
            }
        }
        this.f43918Oooo0o.Oooo0OO();
    }
}
