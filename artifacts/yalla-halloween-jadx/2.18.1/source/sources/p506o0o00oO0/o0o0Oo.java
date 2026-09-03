package p506o0o00oO0;

import android.content.Intent;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p387o0OOoo0o.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO f41678Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f41679Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(o00OO o00oo2, Function0<Unit> function0) {
        super(1);
        this.f41678Oooo0o = o00oo2;
        this.f41679Oooo0oO = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String imagePath = str;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        if (imagePath.length() > 0) {
            o00OO o00oo2 = this.f41678Oooo0o;
            FragmentActivity fragmentActivity = o00oo2.f41627OooO00o;
            if (!StringsKt.isBlank(imagePath)) {
                try {
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f21687Oooo0oO = new o00OOOO0(o00oo2);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", o00O0O0.OooO0O0(fragmentActivity, new File(imagePath)));
                    intent.setPackage(o00oo2.f41630OooO0Oo);
                    fragmentActivity.startActivityForResult(intent, o00oo2.f41629OooO0OO);
                } catch (Exception e) {
                    e.printStackTrace();
                    String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Please_install_XXX), o000O0O0.OooO0OO(R.string.single_third_instagram));
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
            }
            Function0<Unit> function0 = this.f41679Oooo0oO;
            if (function0 != null) {
                function0.invoke();
            }
        }
        this.f41678Oooo0o.OooO00o().OooO0O0();
        return Unit.INSTANCE;
    }
}
