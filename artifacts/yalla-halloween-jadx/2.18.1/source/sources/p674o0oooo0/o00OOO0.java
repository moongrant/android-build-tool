package p674o0oooo0;

import kotlin.jvm.JvmName;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@JvmName(name = "-Base64")
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final byte[] f52034OooO00o;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f52034OooO00o = oooO00o.OooO0OO("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").data;
        oooO00o.OooO0OO("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
