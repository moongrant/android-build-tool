package p634o0ooO0oO;

import java.util.List;
import kotlin.jvm.JvmField;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o00O0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0OO f57200OooO00o = new o00O0OO();

    @NotNull
    List<Cookie> loadForRequest(@NotNull o00OO o00oo2);

    void saveFromResponse(@NotNull o00OO o00oo2, @NotNull List<Cookie> list);
}
