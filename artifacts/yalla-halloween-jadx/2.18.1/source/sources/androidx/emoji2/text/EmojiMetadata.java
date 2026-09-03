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
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class EmojiMetadata {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ThreadLocal<o000OOo0.OooO00o> f8102OooO0Oo = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8103OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooOo f8104OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile int f8105OooO0OO = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public EmojiMetadata(@NonNull OooOo oooOo, @IntRange(from = ULong.MIN_VALUE) int i) {
        this.f8104OooO0O0 = oooOo;
        this.f8103OooO00o = i;
    }

    public final int OooO00o(int i) {
        o000OOo0.OooO00o oooO00oOooO0o0 = OooO0o0();
        int iOooO00o = oooO00oOooO0o0.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = oooO00oOooO0o0.f28285OooO0O0;
        int i2 = iOooO00o + oooO00oOooO0o0.f28284OooO00o;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int OooO0O0() {
        o000OOo0.OooO00o oooO00oOooO0o0 = OooO0o0();
        int iOooO00o = oooO00oOooO0o0.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        int i = iOooO00o + oooO00oOooO0o0.f28284OooO00o;
        return oooO00oOooO0o0.f28285OooO0O0.getInt(oooO00oOooO0o0.f28285OooO0O0.getInt(i) + i);
    }

    public final short OooO0OO() {
        o000OOo0.OooO00o oooO00oOooO0o0 = OooO0o0();
        int iOooO00o = oooO00oOooO0o0.OooO00o(14);
        if (iOooO00o != 0) {
            return oooO00oOooO0o0.f28285OooO0O0.getShort(iOooO00o + oooO00oOooO0o0.f28284OooO00o);
        }
        return (short) 0;
    }

    public final int OooO0Oo() {
        o000OOo0.OooO00o oooO00oOooO0o0 = OooO0o0();
        int iOooO00o = oooO00oOooO0o0.OooO00o(4);
        if (iOooO00o != 0) {
            return oooO00oOooO0o0.f28285OooO0O0.getInt(iOooO00o + oooO00oOooO0o0.f28284OooO00o);
        }
        return 0;
    }

    public final o000OOo0.OooO00o OooO0o0() {
        ThreadLocal<o000OOo0.OooO00o> threadLocal = f8102OooO0Oo;
        o000OOo0.OooO00o oooO00o = threadLocal.get();
        if (oooO00o == null) {
            oooO00o = new o000OOo0.OooO00o();
            threadLocal.set(oooO00o);
        }
        o000OOo0.OooO0O0 oooO0O0 = this.f8104OooO0O0.f8138OooO00o;
        int i = this.f8103OooO00o;
        int iOooO00o = oooO0O0.OooO00o(6);
        if (iOooO00o != 0) {
            int i2 = iOooO00o + oooO0O0.f28284OooO00o;
            int i3 = (i * 4) + oooO0O0.f28285OooO0O0.getInt(i2) + i2 + 4;
            oooO00o.OooO0O0(oooO0O0.f28285OooO0O0.getInt(i3) + i3, oooO0O0.f28285OooO0O0);
        }
        return oooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(OooO0Oo()));
        sb.append(", codepoints:");
        int iOooO0O0 = OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            sb.append(Integer.toHexString(OooO00o(i)));
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        return sb.toString();
    }
}
