package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
public final class TypefaceEmojiRasterizer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ThreadLocal<p060o0000o0.o0OoOo0> f5647OooO0Oo = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f5648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0OoOo0 f5649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile int f5650OooO0OO = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HasGlyph {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TypefaceEmojiRasterizer(@NonNull o0OoOo0 o0oooo0, @IntRange(from = ULong.MIN_VALUE) int i) {
        this.f5649OooO0O0 = o0oooo0;
        this.f5648OooO00o = i;
    }

    public final int OooO00o(int i) {
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO = OooO0OO();
        int iOooO00o = o0oooo0OooO0OO.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = o0oooo0OooO0OO.f34261OooO0O0;
        int i2 = iOooO00o + o0oooo0OooO0OO.f34260OooO00o;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int OooO0O0() {
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO = OooO0OO();
        int iOooO00o = o0oooo0OooO0OO.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        int i = iOooO00o + o0oooo0OooO0OO.f34260OooO00o;
        return o0oooo0OooO0OO.f34261OooO0O0.getInt(o0oooo0OooO0OO.f34261OooO0O0.getInt(i) + i);
    }

    public final p060o0000o0.o0OoOo0 OooO0OO() {
        ThreadLocal<p060o0000o0.o0OoOo0> threadLocal = f5647OooO0Oo;
        p060o0000o0.o0OoOo0 o0oooo0 = threadLocal.get();
        if (o0oooo0 == null) {
            o0oooo0 = new p060o0000o0.o0OoOo0();
            threadLocal.set(o0oooo0);
        }
        p060o0000o0.o00O0O o00o0o2 = this.f5649OooO0O0.f5659OooO00o;
        int iOooO00o = o00o0o2.OooO00o(6);
        if (iOooO00o != 0) {
            int i = iOooO00o + o00o0o2.f34260OooO00o;
            int i2 = (this.f5648OooO00o * 4) + o00o0o2.f34261OooO0O0.getInt(i) + i + 4;
            o0oooo0.OooO0O0(o00o0o2.f34261OooO0O0.getInt(i2) + i2, o00o0o2.f34261OooO0O0);
        }
        return o0oooo0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        p060o0000o0.o0OoOo0 o0oooo0OooO0OO = OooO0OO();
        int iOooO00o = o0oooo0OooO0OO.OooO00o(4);
        sb.append(Integer.toHexString(iOooO00o != 0 ? o0oooo0OooO0OO.f34261OooO0O0.getInt(iOooO00o + o0oooo0OooO0OO.f34260OooO00o) : 0));
        sb.append(", codepoints:");
        int iOooO0O0 = OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            sb.append(Integer.toHexString(OooO00o(i)));
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        return sb.toString();
    }
}
