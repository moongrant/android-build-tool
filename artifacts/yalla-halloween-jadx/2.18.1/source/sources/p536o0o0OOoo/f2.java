package p536o0o0OOoo;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43783Oooo0o;

    public f2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        this.f43783Oooo0o = yallaTeamMessageActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() >= 300) {
            String strOooO00o = OooOo.OooO00o(this.f43783Oooo0o.getString(R.string.char_room_text_lenght), "300");
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!StringsKt.isBlank(strOooO00o)) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43783Oooo0o;
        YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
        yallaTeamMessageActivity.OooOoo();
    }
}
