package o0;

import com.common.support.apmwrapper.model.NormalLogModel;
import com.common.support.apmwrapper.model.SecModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p267o00ooo0o.o00OO00O;
import p386o0OOoo0O.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OOo0 f26552OooO00o = new o000OOo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f26553OooO0O0 = null;

    public static final void OooO00o(@NotNull NormalLogModel logModel) {
        Intrinsics.checkNotNullParameter(logModel, "logModel");
        try {
            String json = f26552OooO00o.OooO0oo(logModel);
            o00OO00O o00oo00o = o00OO00O.f34919OooO00o;
            Intrinsics.checkNotNullExpressionValue(json, "json");
            o00oo00o.OooO00o("log", json);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void OooO0O0(@NotNull SecModel secModel) {
        Intrinsics.checkNotNullParameter(secModel, "secModel");
        try {
            String json = f26552OooO00o.OooO0oo(secModel);
            o00OO00O o00oo00o = o00OO00O.f34919OooO00o;
            Intrinsics.checkNotNullExpressionValue(json, "json");
            o00oo00o.OooO00o("sec", json);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
