package p376o0OOoOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44060OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f44061OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f44062OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f44063OooO0Oo;

    public o0O0ooO(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f44060OooO00o = url;
        this.f44061OooO0O0 = i;
        this.f44062OooO0OO = new LinkedHashMap();
        this.f44063OooO0Oo = new LinkedHashMap();
    }

    @NotNull
    public final void OooO00o() {
        this.f44063OooO0Oo.put("Abnormal", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
    }

    @NotNull
    public final void OooO0O0(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f44062OooO0OO.put(key, obj);
        }
    }
}
