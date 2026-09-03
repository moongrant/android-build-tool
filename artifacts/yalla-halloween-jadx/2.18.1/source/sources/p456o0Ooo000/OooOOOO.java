package p456o0Ooo000;

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
import p318o0O0oOo.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Thread implements AudioRecord.OnRecordPositionUpdateListener {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final String f40377OoooO = OooOOOO.class.getSimpleName();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o000O000 f40378Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f40379Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public byte[] f40380Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public byte[] f40381Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f40382OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public FileOutputStream f40383OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CountDownLatch f40384OoooO0O = new CountDownLatch(1);

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public WeakReference<OooOOOO> f40385OooO00o;

        public OooO00o(OooOOOO oooOOOO) {
            this.f40385OooO00o = new WeakReference<>(oooOOOO);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                OooOOOO oooOOOO = this.f40385OooO00o.get();
                while (oooOOOO.OooO0O0() > 0) {
                }
                removeCallbacksAndMessages(null);
                int iLameflush = LameEncodc.lameflush(oooOOOO.f40381Oooo0oo);
                if (iLameflush > 0) {
                    try {
                        oooOOOO.f40383OoooO00.write(oooOOOO.f40381Oooo0oo, 0, iLameflush);
                    } catch (IOException unused) {
                        Log.e(OooOOOO.f40377OoooO, "Lame flush error");
                    }
                }
                getLooper().quit();
            }
            super.handleMessage(message);
        }
    }

    public OooOOOO(o000O000 o000o001, FileOutputStream fileOutputStream, int i) {
        this.f40383OoooO00 = fileOutputStream;
        this.f40378Oooo = o000o001;
        this.f40382OoooO0 = i;
        byte[] bArr = new byte[i];
        this.f40380Oooo0oO = bArr;
        this.f40381Oooo0oo = new byte[(int) ((((double) (bArr.length * 2)) * 1.25d) + 7200.0d)];
    }

    public final Handler OooO00o() {
        try {
            this.f40384OoooO0O.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.e(f40377OoooO, "Error when waiting handle to init");
        }
        return this.f40379Oooo0o;
    }

    public final int OooO0O0() {
        o000O000 o000o001 = this.f40378Oooo;
        byte[] bArr = this.f40380Oooo0oO;
        int i = this.f40382OoooO0;
        int iOooO0Oo = o000o001.OooO0Oo(false);
        if (iOooO0Oo == 0) {
            Log.d(o000O000.class.getSimpleName(), "No data");
            i = 0;
        } else {
            if (i > iOooO0Oo) {
                i = iOooO0Oo;
            }
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = o000o001.f36716OooO00o;
                int i3 = o000o001.f36718OooO0OO;
                int i4 = i3 + 1;
                o000o001.f36718OooO0OO = i4;
                bArr[i2] = bArr2[i3];
                if (i4 == o000o001.f36717OooO0O0) {
                    o000o001.f36718OooO0OO = 0;
                }
            }
        }
        String str = f40377OoooO;
        Log.d(str, "Read size: " + i);
        if (i <= 0) {
            return 0;
        }
        int i5 = i / 2;
        short[] sArr = new short[i5];
        ByteBuffer.wrap(this.f40380Oooo0oO).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        int iLameencode = LameEncodc.lameencode(sArr, sArr, i5, this.f40381Oooo0oo);
        if (iLameencode < 0) {
            Log.e(str, "Lame encoded size: " + iLameencode);
        }
        try {
            this.f40383OoooO00.write(this.f40381Oooo0oo, 0, iLameencode);
        } catch (IOException unused) {
            Log.e(f40377OoooO, "Unable to write to file");
        }
        return i;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onMarkerReached(AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onPeriodicNotification(AudioRecord audioRecord) {
        OooO0O0();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.f40379Oooo0o = new OooO00o(this);
        this.f40384OoooO0O.countDown();
        Looper.loop();
    }
}
