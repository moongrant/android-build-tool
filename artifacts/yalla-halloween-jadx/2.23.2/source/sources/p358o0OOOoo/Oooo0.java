package p358o0OOOoo;

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

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends Thread implements AudioRecord.OnRecordPositionUpdateListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f42916OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f42917OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f42918OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f42919OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OoOo0 f42920OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final FileOutputStream f42921OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CountDownLatch f42922OooOO0 = new CountDownLatch(1);

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<Oooo0> f42923OooO00o;

        public OooO00o(Oooo0 oooo0) {
            this.f42923OooO00o = new WeakReference<>(oooo0);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                Oooo0 oooo0 = this.f42923OooO00o.get();
                while (oooo0.OooO00o() > 0) {
                }
                removeCallbacksAndMessages(null);
                byte[] bArr = oooo0.f42918OooO0o;
                int iLameflush = LameEncodc.lameflush(bArr);
                if (iLameflush > 0) {
                    try {
                        oooo0.f42921OooO0oo.write(bArr, 0, iLameflush);
                    } catch (IOException unused) {
                        Log.e("Oooo0", "Lame flush error");
                    }
                }
                getLooper().quit();
            }
            super.handleMessage(message);
        }
    }

    public Oooo0(o0OoOo0 o0oooo1, FileOutputStream fileOutputStream, int i) {
        this.f42921OooO0oo = fileOutputStream;
        this.f42920OooO0oO = o0oooo1;
        this.f42916OooO = i;
        byte[] bArr = new byte[i];
        this.f42919OooO0o0 = bArr;
        this.f42918OooO0o = new byte[(int) ((((double) (bArr.length * 2)) * 1.25d) + 7200.0d)];
    }

    public final int OooO00o() {
        o0OoOo0 o0oooo1 = this.f42920OooO0oO;
        int iOooO00o = o0oooo1.OooO00o(false);
        byte[] bArr = this.f42919OooO0o0;
        if (iOooO00o == 0) {
            Log.d(o0OoOo0.class.getSimpleName(), "No data");
            iOooO00o = 0;
        } else {
            int i = this.f42916OooO;
            if (i <= iOooO00o) {
                iOooO00o = i;
            }
            for (int i2 = 0; i2 < iOooO00o; i2++) {
                int i3 = o0oooo1.f42942OooO0OO;
                int i4 = i3 + 1;
                o0oooo1.f42942OooO0OO = i4;
                bArr[i2] = o0oooo1.f42940OooO00o[i3];
                if (i4 == o0oooo1.f42941OooO0O0) {
                    o0oooo1.f42942OooO0OO = 0;
                }
            }
        }
        Log.d("Oooo0", "Read size: " + iOooO00o);
        if (iOooO00o <= 0) {
            return 0;
        }
        int i5 = iOooO00o / 2;
        short[] sArr = new short[i5];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        byte[] bArr2 = this.f42918OooO0o;
        int iLameencode = LameEncodc.lameencode(sArr, sArr, i5, bArr2);
        if (iLameencode < 0) {
            Log.e("Oooo0", "Lame encoded size: " + iLameencode);
        }
        try {
            this.f42921OooO0oo.write(bArr2, 0, iLameencode);
        } catch (IOException unused) {
            Log.e("Oooo0", "Unable to write to file");
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
        this.f42917OooO0Oo = new OooO00o(this);
        this.f42922OooOO0.countDown();
        Looper.loop();
    }
}
