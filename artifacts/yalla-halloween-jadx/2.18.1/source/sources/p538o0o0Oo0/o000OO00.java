package p538o0o0Oo0;

import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f43930Oooo0o;

    public o000OO00(PostDetailActivity postDetailActivity) {
        this.f43930Oooo0o = postDetailActivity;
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
            String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Input_a_maximum_of_xxx_characters), "500");
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
        if (TextUtils.isEmpty(string)) {
            PostDetailActivity postDetailActivity = this.f43930Oooo0o;
            PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            postDetailActivity.OooOooO().f50588OooOOO0.setImageResource(R.drawable.btn_send);
        } else {
            PostDetailActivity postDetailActivity2 = this.f43930Oooo0o;
            PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
            postDetailActivity2.OooOooO().f50588OooOOO0.setImageResource(R.drawable.btn_send2);
        }
    }
}
