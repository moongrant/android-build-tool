package p648o0ooo;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p417o0OoO0.o00000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f59778OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f59779OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(oo000o oo000oVar, oo000o.OooO0o oooO0o) {
        super(1);
        this.f59778OooO0Oo = oo000oVar;
        this.f59779OooO0o0 = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String imagePath = str;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        boolean z = imagePath.length() > 0;
        oo000o oo000oVar = this.f59778OooO0Oo;
        if (z) {
            FragmentActivity fragmentActivity = oo000oVar.f59784OooO00o;
            if (!StringsKt.isBlank(imagePath)) {
                try {
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o0Oo0oo(oo000oVar);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", o00000.OooO00o(fragmentActivity, new File(imagePath)));
                    intent.setPackage(oo000oVar.f59787OooO0Oo);
                    fragmentActivity.startActivityForResult(intent, oo000oVar.f59786OooO0OO);
                } catch (Exception e) {
                    if (e instanceof ActivityNotFoundException) {
                        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Please_install_XXX), o0000.OooO0OO(oO00OOo0.single_third_instagram));
                        if (!StringsKt.isBlank(strOooO00o)) {
                            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    }
                }
            }
            Function0<Unit> function0 = this.f59779OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }
        oo000oVar.OooO00o().OooO0O0();
        return Unit.INSTANCE;
    }
}
