package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p423o0OoO0OO.o00O00OO;
import p466o0OooOoo.o0O0o00O;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO000 implements o0000O00 {
    @Override // p675oOooo0o.o0000O00
    public final void result(boolean z, Object obj) {
        String str = (String) obj;
        int i = ShowImageActivity.f25802Oooo00o;
        if (!z || str == null) {
            return;
        }
        File file = o0O0o00O.f47844OooO00o;
        String strValueOf = String.valueOf(o0O0o00O.OooO0Oo(new File(str)));
        if ((strValueOf.length() == 0) || Intrinsics.areEqual("null", o00O00OO.OooO0oo(strValueOf)) || StringsKt.isBlank(strValueOf)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strValueOf, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }
}
