package p605o0oo00oo;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p495o0o00OOO.Oooo0;
import p522o0o0O0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000Oo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0<String> f48287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f48288OooO0O0;

    public oO000Oo(Oooo0<String> oooo0, String str) {
        this.f48287OooO00o = oooo0;
        this.f48288OooO0O0 = str;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        boolean z = true;
        if (!(str == null || str.length() == 0) && o000Oo0.OooO0OO(str, 0) == 1038) {
            String strOooO0OO = oo0oOO0.OooO0OO(R.string.room_ban_toast);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        this.f48287OooO00o.postValue((String) new Response(true, this.f48288OooO0O0, false, null, 12, null));
    }
}
