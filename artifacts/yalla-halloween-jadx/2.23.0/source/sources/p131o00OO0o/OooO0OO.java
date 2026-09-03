package p131o00OO0o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00OO0.OooOOO0;
import p041Ooooo0o.o00000;
import p124o00O0oO.Oooo0;
import p124o00O0oO.Oooo000;
import p126o00O0oOo.o00000O0;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o00000O;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o00000O0<ByteBuffer, OooO> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f37275OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0O0 f37276OooO0oO = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37277OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<ImageHeaderParser> f37278OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f37279OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f37280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f37281OooO0o0;

    @VisibleForTesting
    public static class OooO00o {
    }

    @VisibleForTesting
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayDeque f37282OooO00o;

        public OooO0O0() {
            char[] cArr = o0000oo.f54571OooO00o;
            this.f37282OooO00o = new ArrayDeque(0);
        }

        public final synchronized void OooO00o(Oooo0 oooo0) {
            oooo0.f36703OooO0O0 = null;
            oooo0.f36704OooO0OO = null;
            this.f37282OooO00o.offer(oooo0);
        }
    }

    public OooO0OO(Context context, ArrayList arrayList, p129o00O0ooo.o0000oo o0000ooVar, o0000 o0000Var) {
        OooO00o oooO00o = f37275OooO0o;
        this.f37277OooO00o = context.getApplicationContext();
        this.f37278OooO0O0 = arrayList;
        this.f37280OooO0Oo = oooO00o;
        this.f37281OooO0o0 = new OooO0o(o0000ooVar, o0000Var);
        this.f37279OooO0OO = f37276OooO0oO;
    }

    public static int OooO0Oo(Oooo000 oooo000, int i, int i2) {
        int iMin = Math.min(oooo000.f36713OooO0oO / i2, oooo000.f36711OooO0o / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbOooO00o = o00000.OooO00o("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbOooO00o.append(i2);
            sbOooO00o.append("], actual dimens: [");
            sbOooO00o.append(oooo000.f36711OooO0o);
            sbOooO00o.append("x");
            sbOooO00o.append(oooo000.f36713OooO0oO);
            sbOooO00o.append("]");
            Log.v("BufferGifDecoder", sbOooO00o.toString());
        }
        return iMax;
    }

    @Override // p126o00O0oOo.o00000O0
    public final p127o00O0oo.o0000<OooO> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull p126o00O0oOo.o00000 o00000Var) throws IOException {
        Oooo0 oooo0;
        ByteBuffer byteBuffer2 = byteBuffer;
        OooO0O0 oooO0O0 = this.f37279OooO0OO;
        synchronized (oooO0O0) {
            Oooo0 oooo1 = (Oooo0) oooO0O0.f37282OooO00o.poll();
            if (oooo1 == null) {
                oooo1 = new Oooo0();
            }
            oooo0 = oooo1;
            oooo0.f36703OooO0O0 = null;
            Arrays.fill(oooo0.f36702OooO00o, (byte) 0);
            oooo0.f36704OooO0OO = new Oooo000();
            oooo0.f36705OooO0Oo = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            oooo0.f36703OooO0O0 = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            oooo0.f36703OooO0O0.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return OooO0OO(byteBuffer2, i, i2, oooo0, o00000Var);
        } finally {
            this.f37279OooO0OO.OooO00o(oooo0);
        }
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull p126o00O0oOo.o00000 o00000Var) throws IOException {
        return !((Boolean) o00000Var.OooO0OO(OooOo00.f37313OooO0O0)).booleanValue() && com.bumptech.glide.load.OooO00o.OooO0O0(this.f37278OooO0O0, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Nullable
    public final OooOO0O OooO0OO(ByteBuffer byteBuffer, int i, int i2, Oooo0 oooo0, p126o00O0oOo.o00000 o00000Var) throws Throwable {
        Bitmap.Config config;
        int i3 = o00000O.f54564OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i4 = 2;
        try {
            Oooo000 oooo000OooO0O0 = oooo0.OooO0O0();
            if (oooo000OooO0O0.f36709OooO0OO > 0 && oooo000OooO0O0.f36708OooO0O0 == 0) {
                if (o00000Var.OooO0OO(OooOo00.f37312OooO00o) == DecodeFormat.PREFER_RGB_565) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int iOooO0Oo = OooO0Oo(oooo000OooO0O0, i, i2);
                OooO00o oooO00o = this.f37280OooO0Oo;
                OooO0o oooO0o = this.f37281OooO0o0;
                oooO00o.getClass();
                com.bumptech.glide.gifdecoder.OooO00o oooO00o2 = new com.bumptech.glide.gifdecoder.OooO00o(oooO0o, oooo000OooO0O0, byteBuffer, iOooO0Oo);
                oooO00o2.OooO(config);
                oooO00o2.OooO0O0();
                Bitmap bitmapOooO00o = oooO00o2.OooO00o();
                if (bitmapOooO00o == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00000O.OooO00o(jElapsedRealtimeNanos));
                    }
                    return null;
                }
                OooOO0O oooOO0O = new OooOO0O(new OooO(new OooO.OooO00o(new OooOOO(com.bumptech.glide.OooO0OO.OooO0O0(this.f37277OooO00o), oooO00o2, i, i2, OooOOO0.f37062OooO0O0, bitmapOooO00o))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00000O.OooO00o(jElapsedRealtimeNanos));
                }
                return oooOO0O;
                if (Log.isLoggable("BufferGifDecoder", i4)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00000O.OooO00o(jElapsedRealtimeNanos));
                }
                throw th;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00000O.OooO00o(jElapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i4 = 2;
        }
    }
}
