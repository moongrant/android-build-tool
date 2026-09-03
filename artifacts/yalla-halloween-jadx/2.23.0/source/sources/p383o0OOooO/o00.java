package p383o0OOooO;

import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00O0OOO.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00 implements OooO {
    @Override // o00O0OOO.OooO
    public final void OooO00o(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null || StringsKt.isBlank(content)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(content, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}
