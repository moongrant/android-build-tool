package p238o00oOooO;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import p042Ooooo0o.o000O0Oo;
import p214o00oO0.o00OOOO0;
import p215o00oO000.OooO;
import p215o00oO000.OooOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0O00o0;
import p219o00oO0O0.o0oOOo;
import p223o00oOOOO.oO0O00O;
import p243o00oo00O.o0000O0O;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oOOO0OOO implements o00000O0<ByteBuffer, oOOOOo0O> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f34062OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0O0 f34063OooO0oO = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f34064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<ImageHeaderParser> f34065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f34066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f34067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oOOOoo00 f34068OooO0o0;

    @VisibleForTesting
    public static class OooO00o {
    }

    @VisibleForTesting
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Queue<OooOO0> f34069OooO00o;

        public OooO0O0() {
            char[] cArr = o000O000.f34177OooO00o;
            this.f34069OooO00o = new ArrayDeque(0);
        }
    }

    public oOOO0OOO(Context context, List<ImageHeaderParser> list, o0oOOo o0oooo2, o0O00o0 o0o00o1) {
        OooO0O0 oooO0O0 = f34063OooO0oO;
        OooO00o oooO00o = f34062OooO0o;
        this.f34064OooO00o = context.getApplicationContext();
        this.f34065OooO0O0 = list;
        this.f34067OooO0Oo = oooO00o;
        this.f34068OooO0o0 = new oOOOoo00(o0oooo2, o0o00o1);
        this.f34066OooO0OO = oooO0O0;
    }

    public static int OooO0Oo(OooO oooO, int i, int i2) {
        int iMin = Math.min(oooO.f33604OooO0oO / i2, oooO.f33602OooO0o / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbOooO0O0.append(i2);
            sbOooO0O0.append("], actual dimens: [");
            sbOooO0O0.append(oooO.f33602OooO0o);
            sbOooO0O0.append("x");
            sbOooO0O0.append(oooO.f33604OooO0oO);
            sbOooO0O0.append("]");
            Log.v("BufferGifDecoder", sbOooO0O0.toString());
        }
        return iMax;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<o00oO000.OooOO0>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayDeque, java.util.Queue<o00oO000.OooOO0>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayDeque, java.util.Queue<o00oO000.OooOO0>] */
    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<oOOOOo0O> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        OooOO0 oooOO1;
        ByteBuffer byteBuffer2 = byteBuffer;
        OooO0O0 oooO0O0 = this.f34066OooO0OO;
        synchronized (oooO0O0) {
            OooOO0 oooOO2 = (OooOO0) oooO0O0.f34069OooO00o.poll();
            if (oooOO2 == null) {
                oooOO2 = new OooOO0();
            }
            oooOO1 = oooOO2;
            oooOO1.f33621OooO0O0 = null;
            Arrays.fill(oooOO1.f33620OooO00o, (byte) 0);
            oooOO1.f33622OooO0OO = new OooO();
            oooOO1.f33623OooO0Oo = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            oooOO1.f33621OooO0O0 = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            oooOO1.f33621OooO0O0.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            oOOo0O00 oooo0o00OooO0OO = OooO0OO(byteBuffer2, i, i2, oooOO1, o00000Var);
            OooO0O0 oooO0O1 = this.f34066OooO0OO;
            synchronized (oooO0O1) {
                oooOO1.f33621OooO0O0 = null;
                oooOO1.f33622OooO0OO = null;
                oooO0O1.f34069OooO00o.offer(oooOO1);
            }
            return oooo0o00OooO0OO;
        } catch (Throwable th) {
            OooO0O0 oooO0O2 = this.f34066OooO0OO;
            synchronized (oooO0O2) {
                oooOO1.f33621OooO0O0 = null;
                oooOO1.f33622OooO0OO = null;
                oooO0O2.f34069OooO00o.offer(oooOO1);
                throw th;
            }
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) o00000Var.OooO0OO(O0000000.f34058OooO0O0)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f34065OooO0O0;
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType imageTypeOooO00o = list.get(i).OooO00o(byteBuffer2);
                if (imageTypeOooO00o != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = imageTypeOooO00o;
                    break;
                }
                i++;
            }
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    @Nullable
    public final oOOo0O00 OooO0OO(ByteBuffer byteBuffer, int i, int i2, OooOO0 oooOO1, o00000 o00000Var) {
        int i3 = o0000O0O.f34164OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            OooO oooOOooO0O0 = oooOO1.OooO0O0();
            if (oooOOooO0O0.f33600OooO0OO > 0 && oooOOooO0O0.f33599OooO0O0 == 0) {
                Bitmap.Config config = o00000Var.OooO0OO(O0000000.f34057OooO00o) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iOooO0Oo = OooO0Oo(oooOOooO0O0, i, i2);
                OooO00o oooO00o = this.f34067OooO0Oo;
                oOOOoo00 oooooo00 = this.f34068OooO0o0;
                Objects.requireNonNull(oooO00o);
                com.bumptech.glide.gifdecoder.OooO00o oooO00o2 = new com.bumptech.glide.gifdecoder.OooO00o(oooooo00, oooOOooO0O0, byteBuffer, iOooO0Oo);
                oooO00o2.OooOO0(config);
                oooO00o2.f12447OooOO0O = (oooO00o2.f12447OooOO0O + 1) % oooO00o2.f12448OooOO0o.f33600OooO0OO;
                Bitmap bitmapOooO00o = oooO00o2.OooO00o();
                if (bitmapOooO00o == null) {
                    return null;
                }
                return new oOOo0O00(new oOOOOo0O(this.f34064OooO00o, oooO00o2, oO0O00O.f33799OooO0O0, i, i2, bitmapOooO00o));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Decoded GIF from stream in ");
                sbOooO0o0.append(o0000O0O.OooO00o(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sbOooO0o0.toString());
            }
        }
    }
}
