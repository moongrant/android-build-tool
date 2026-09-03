package p267o00ooo0o;

import com.common.support.apm.model.CModel;
import com.tencent.mars.xlog.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p269o00oooOO.z;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OO00O f34919OooO00o = new o00OO00O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static z f34920OooO0O0;

    public final void OooO00o(@NotNull String tag, @NotNull String data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        z zVar = f34920OooO0O0;
        if (zVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collector");
            throw null;
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        if (zVar.f34953OooO0O0.get() == 1) {
            if (zVar.f34959OooO0o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xlogWriter");
                throw null;
            }
            CModel log = new CModel(tag, data);
            Intrinsics.checkNotNullParameter(log, "log");
            Log.d("", log.toJson());
        }
    }
}
