package p165o00OoOoo;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p041Ooooo0o.o00000;
import p144o00Oo.o00oOoo;
import p151o00Oo0o.o0000;
import p151o00Oo0o.o0000O00;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p156o00OoO00.OooOO0;
import p158o00OoOO.o00Oo0;
import p174o00OooOo.o00O0OOO;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements o0O0O00<ByteBuffer, o00> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f38168OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0O0 f38169OooO0oO = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<ImageHeaderParser> f38171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f38172OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f38173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OOo0 f38174OooO0o0;

    @VisibleForTesting
    public static class OooO00o {
    }

    @VisibleForTesting
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayDeque f38175OooO00o;

        public OooO0O0() {
            char[] cArr = o00OO0O0.f38351OooO00o;
            this.f38175OooO00o = new ArrayDeque(0);
        }

        public final synchronized void OooO00o(o0000O00 o0000o00) {
            o0000o00.f37774OooO0O0 = null;
            o0000o00.f37775OooO0OO = null;
            this.f38175OooO00o.offer(o0000o00);
        }
    }

    public o000OO00(Context context, ArrayList arrayList, OooOO0 oooOO1, OooO0o oooO0o) {
        OooO00o oooO00o = f38168OooO0o;
        this.f38170OooO00o = context.getApplicationContext();
        this.f38171OooO0O0 = arrayList;
        this.f38173OooO0Oo = oooO00o;
        this.f38174OooO0o0 = new o000OOo0(oooOO1, oooO0o);
        this.f38172OooO0OO = f38169OooO0oO;
    }

    public static int OooO0Oo(o0000 o0000Var, int i, int i2) {
        int iMin = Math.min(o0000Var.f37768OooO0oO / i2, o0000Var.f37766OooO0o / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbOooO00o = o00000.OooO00o("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbOooO00o.append(i2);
            sbOooO00o.append("], actual dimens: [");
            sbOooO00o.append(o0000Var.f37766OooO0o);
            sbOooO00o.append("x");
            sbOooO00o.append(o0000Var.f37768OooO0oO);
            sbOooO00o.append("]");
            Log.v("BufferGifDecoder", sbOooO00o.toString());
        }
        return iMax;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return !((Boolean) oo0o0oo.OooO0OO(o00O00.f38179OooO0O0)).booleanValue() && com.bumptech.glide.load.OooO00o.OooO0O0(this.f38171OooO0O0, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<o00> OooO0O0(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        o0000O00 o0000o00;
        ByteBuffer byteBuffer2 = byteBuffer;
        OooO0O0 oooO0O0 = this.f38172OooO0OO;
        synchronized (oooO0O0) {
            o0000O00 o0000o01 = (o0000O00) oooO0O0.f38175OooO00o.poll();
            if (o0000o01 == null) {
                o0000o01 = new o0000O00();
            }
            o0000o00 = o0000o01;
            o0000o00.f37774OooO0O0 = null;
            Arrays.fill(o0000o00.f37773OooO00o, (byte) 0);
            o0000o00.f37775OooO0OO = new o0000();
            o0000o00.f37776OooO0Oo = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            o0000o00.f37774OooO0O0 = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            o0000o00.f37774OooO0O0.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return OooO0OO(byteBuffer2, i, i2, o0000o00, oo0o0oo);
        } finally {
            this.f38172OooO0OO.OooO00o(o0000o00);
        }
    }

    @Nullable
    public final o0O0ooO OooO0OO(ByteBuffer byteBuffer, int i, int i2, o0000O00 o0000o00, oo0o0Oo oo0o0oo) throws Throwable {
        Bitmap.Config config;
        int i3 = o00O0OOO.f38347OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i4 = 2;
        try {
            o0000 o0000VarOooO0O0 = o0000o00.OooO0O0();
            if (o0000VarOooO0O0.f37764OooO0OO > 0 && o0000VarOooO0O0.f37763OooO0O0 == 0) {
                if (oo0o0oo.OooO0OO(o00O00.f38178OooO00o) == DecodeFormat.PREFER_RGB_565) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int iOooO0Oo = OooO0Oo(o0000VarOooO0O0, i, i2);
                OooO00o oooO00o = this.f38173OooO0Oo;
                o000OOo0 o000ooo1 = this.f38174OooO0o0;
                oooO00o.getClass();
                com.bumptech.glide.gifdecoder.OooO00o oooO00o2 = new com.bumptech.glide.gifdecoder.OooO00o(o000ooo1, o0000VarOooO0O0, byteBuffer, iOooO0Oo);
                oooO00o2.OooO(config);
                oooO00o2.OooO0O0();
                Bitmap bitmapOooO00o = oooO00o2.OooO00o();
                if (bitmapOooO00o == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00O0OOO.OooO00o(jElapsedRealtimeNanos));
                    }
                    return null;
                }
                o0O0ooO o0o0ooo = new o0O0ooO(new o00(new o00.OooO00o(new o00O000(OooO0OO.OooO0O0(this.f38170OooO00o), oooO00o2, i, i2, o00Oo0.f38017OooO0O0, bitmapOooO00o))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00O0OOO.OooO00o(jElapsedRealtimeNanos));
                }
                return o0o0ooo;
                if (Log.isLoggable("BufferGifDecoder", i4)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00O0OOO.OooO00o(jElapsedRealtimeNanos));
                }
                throw th;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + o00O0OOO.OooO00o(jElapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i4 = 2;
        }
    }
}
