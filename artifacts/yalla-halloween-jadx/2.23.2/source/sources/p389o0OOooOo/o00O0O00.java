package p389o0OOooOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p138o00OOOo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O00 implements OooOO0 {
    @Override // p138o00OOOo.OooOO0
    public final void OooO00o(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null || StringsKt.isBlank(content)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(content, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }
}
