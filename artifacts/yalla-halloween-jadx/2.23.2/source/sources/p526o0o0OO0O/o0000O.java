package p526o0o0OO0O;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p423o0OoO0OO.o000OO00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f53270OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53271OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o0000O0 o0000o1, o0000O0.OooO0o oooO0o) {
        super(1);
        this.f53270OooO0Oo = o0000o1;
        this.f53271OooO0o0 = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String imagePath = str;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        boolean z = imagePath.length() > 0;
        o0000O0 o0000o1 = this.f53270OooO0Oo;
        if (z) {
            FragmentActivity fragmentActivity = o0000o1.f53272OooO00o;
            if (!StringsKt.isBlank(imagePath)) {
                try {
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f24677OooO0o0 = new o0000OO0(o0000o1);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", o000OO00.OooO00o(fragmentActivity, new File(imagePath)));
                    intent.setPackage(o0000o1.f53275OooO0Oo);
                    fragmentActivity.startActivityForResult(intent, o0000o1.f53274OooO0OO);
                } catch (Exception e) {
                    if (e instanceof ActivityNotFoundException) {
                        String strOooO00o = com.code.android.util.o0000O.OooO00o(o0000.OooO0OO(o000000.Please_install_XXX), o0000.OooO0OO(o000000.single_third_instagram));
                        if (!StringsKt.isBlank(strOooO00o)) {
                            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    }
                }
            }
            Function0<Unit> function0 = this.f53271OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }
        o0000o1.OooO00o().OooO0O0();
        return Unit.INSTANCE;
    }
}
