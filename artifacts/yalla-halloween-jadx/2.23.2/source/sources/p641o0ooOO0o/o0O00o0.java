package p641o0ooOO0o;

import java.util.List;
import kotlin.jvm.JvmField;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0oOO f57845OooO00o = new o0oOO();

    @NotNull
    List<Cookie> loadForRequest(@NotNull o0O000O o0o000o);

    void saveFromResponse(@NotNull o0O000O o0o000o, @NotNull List<Cookie> list);
}
