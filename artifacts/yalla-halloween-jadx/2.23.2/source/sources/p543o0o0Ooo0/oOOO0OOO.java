package p543o0o0Ooo0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOOO0OOO f55535OooO0Oo = new oOOO0OOO();

    public oOOO0OOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        String strOooO0OO = o0000.OooO0OO(o000000.item_in_use_now);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
