package p357o0OOOoo0;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.will.codecs.audio.mp3.LameEncodc;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Thread implements AudioRecord.OnRecordPositionUpdateListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f43735OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f43736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f43737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f43738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo f43739OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final FileOutputStream f43740OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CountDownLatch f43741OooOO0 = new CountDownLatch(1);

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooOOOO> f43742OooO00o;

        public OooO00o(OooOOOO oooOOOO) {
            this.f43742OooO00o = new WeakReference<>(oooOOOO);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                OooOOOO oooOOOO = this.f43742OooO00o.get();
                while (oooOOOO.OooO00o() > 0) {
                }
                removeCallbacksAndMessages(null);
                byte[] bArr = oooOOOO.f43737OooO0o;
                int iLameflush = LameEncodc.lameflush(bArr);
                if (iLameflush > 0) {
                    try {
                        oooOOOO.f43740OooO0oo.write(bArr, 0, iLameflush);
                    } catch (IOException unused) {
                        Log.e("OooOOOO", "Lame flush error");
                    }
                }
                getLooper().quit();
            }
            super.handleMessage(message);
        }
    }

    public OooOOOO(OooOo oooOo, FileOutputStream fileOutputStream, int i) {
        this.f43740OooO0oo = fileOutputStream;
        this.f43739OooO0oO = oooOo;
        this.f43735OooO = i;
        byte[] bArr = new byte[i];
        this.f43738OooO0o0 = bArr;
        this.f43737OooO0o = new byte[(int) ((((double) (bArr.length * 2)) * 1.25d) + 7200.0d)];
    }

    public final int OooO00o() {
        OooOo oooOo = this.f43739OooO0oO;
        int iOooO00o = oooOo.OooO00o(false);
        byte[] bArr = this.f43738OooO0o0;
        if (iOooO00o == 0) {
            Log.d(OooOo.class.getSimpleName(), "No data");
            iOooO00o = 0;
        } else {
            int i = this.f43735OooO;
            if (i <= iOooO00o) {
                iOooO00o = i;
            }
            for (int i2 = 0; i2 < iOooO00o; i2++) {
                int i3 = oooOo.f43745OooO0OO;
                int i4 = i3 + 1;
                oooOo.f43745OooO0OO = i4;
                bArr[i2] = oooOo.f43743OooO00o[i3];
                if (i4 == oooOo.f43744OooO0O0) {
                    oooOo.f43745OooO0OO = 0;
                }
            }
        }
        Log.d("OooOOOO", "Read size: " + iOooO00o);
        if (iOooO00o <= 0) {
            return 0;
        }
        int i5 = iOooO00o / 2;
        short[] sArr = new short[i5];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        byte[] bArr2 = this.f43737OooO0o;
        int iLameencode = LameEncodc.lameencode(sArr, sArr, i5, bArr2);
        if (iLameencode < 0) {
            Log.e("OooOOOO", "Lame encoded size: " + iLameencode);
        }
        try {
            this.f43740OooO0oo.write(bArr2, 0, iLameencode);
        } catch (IOException unused) {
            Log.e("OooOOOO", "Unable to write to file");
        }
        return iOooO00o;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onMarkerReached(AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onPeriodicNotification(AudioRecord audioRecord) {
        OooO00o();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.f43736OooO0Oo = new OooO00o(this);
        this.f43741OooOO0.countDown();
        Looper.loop();
    }
}
