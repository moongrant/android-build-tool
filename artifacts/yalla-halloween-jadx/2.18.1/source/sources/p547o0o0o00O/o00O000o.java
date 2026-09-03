package p547o0o0o00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44595OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f44596OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f44597OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f44598OooO0Oo;

    public o00O000o(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f44595OooO00o = url;
        this.f44596OooO0O0 = i;
        this.f44597OooO0OO = new LinkedHashMap();
        this.f44598OooO0Oo = new LinkedHashMap();
    }

    @NotNull
    public final o00O000o OooO00o() {
        this.f44598OooO0Oo.put("Abnormal", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        return this;
    }

    @NotNull
    public final o00O000o OooO0O0(@NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f44597OooO0OO.put(key, obj);
        }
        return this;
    }
}
