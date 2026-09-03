package p358o0OOOoo;

import android.media.AudioRecord;
import android.os.Message;
import android.util.Log;
import com.will.codecs.audio.mp3.LameEncodc;
import com.will.codecs.audio.mp3.PCMFormat;
import io.agora.rtc.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p360o0OOOooO.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o000000O {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f42924OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f42925OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioRecord f42926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f42927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OoOo0 f42928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f42929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Oooo0 f42930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FileOutputStream f42931OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f42932OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f42933OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final PCMFormat f42934OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ExecutorService f42935OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public double f42936OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public double f42937OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f42938OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FileOutputStream fileOutputStream;
            o000oOoO o000oooo2 = o000oOoO.this;
            if (o000oooo2.f42926OooO00o == null) {
                o000oooo2.f42932OooO0oO = false;
                return;
            }
            o000oooo2.f42932OooO0oO = true;
            while (o000oooo2.f42932OooO0oO) {
                try {
                    Log.e("jjfly", "jjfly--------" + o000oooo2.f42929OooO0Oo + "-----" + o000oooo2.f42926OooO00o);
                    int i = o000oooo2.f42926OooO00o.read(o000oooo2.f42929OooO0Oo, 0, o000oooo2.f42927OooO0O0);
                    if (i > 0) {
                        o0OoOo0 o0oooo1 = o000oooo2.f42928OooO0OO;
                        byte[] bArr = o000oooo2.f42929OooO0Oo;
                        int iOooO00o = o0oooo1.OooO00o(true);
                        if (iOooO00o == 0) {
                            Log.e(o0OoOo0.class.getSimpleName(), "Buffer overrun. Data will not be written");
                        } else {
                            if (i <= iOooO00o) {
                                iOooO00o = i;
                            }
                            for (int i2 = 0; i2 < iOooO00o; i2++) {
                                int i3 = o0oooo1.f42943OooO0Oo;
                                int i4 = i3 + 1;
                                o0oooo1.f42943OooO0Oo = i4;
                                o0oooo1.f42940OooO00o[i3] = bArr[i2];
                                if (i4 == o0oooo1.f42941OooO0O0) {
                                    o0oooo1.f42943OooO0Oo = 0;
                                }
                            }
                        }
                        long j = 0;
                        for (byte b : o000oooo2.f42929OooO0Oo) {
                            j += (long) (b * b);
                        }
                        double d = (j / ((double) i)) * 2.0d;
                        o000oooo2.f42936OooOO0o = Math.log10(d) * 10.0d;
                        o000oooo2.f42937OooOOO = d;
                        Log.e("o000oOoO", String.valueOf(d) + "----");
                        Log.e("o000oOoO", String.valueOf(o000oooo2.f42936OooOO0o) + "----");
                        Log.e("jjfly", new StringBuilder(String.valueOf(o000oooo2.f42936OooOO0o)).toString());
                    }
                } catch (InterruptedException unused) {
                    int i5 = o000oOoO.f42924OooOOOO;
                    Log.d("o000oOoO", "Faile to join encode thread");
                    fileOutputStream = o000oooo2.f42931OooO0o0;
                    if (fileOutputStream == null) {
                        return;
                    }
                } finally {
                    FileOutputStream fileOutputStream2 = o000oooo2.f42931OooO0o0;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            o000oooo2.f42926OooO00o.stop();
            o000oooo2.f42926OooO00o.release();
            o000oooo2.f42926OooO00o = null;
            Oooo0 oooo0 = o000oooo2.f42930OooO0o;
            oooo0.getClass();
            try {
                oooo0.f42922OooOO0.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                Log.e("Oooo0", "Error when waiting handle to init");
            }
            Message.obtain(oooo0.f42917OooO0Oo, 1).sendToTarget();
            int i6 = o000oOoO.f42924OooOOOO;
            Log.d("o000oOoO", "waiting for encoding thread");
            o000oooo2.f42930OooO0o.join();
            Log.d("o000oOoO", "done encoding thread");
            fileOutputStream = o000oooo2.f42931OooO0o0;
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
            }
        }
    }

    static {
        System.loadLibrary("mp3encoder");
    }

    public o000oOoO() {
        PCMFormat pCMFormat = PCMFormat.PCM_16BIT;
        this.f42926OooO00o = null;
        this.f42931OooO0o0 = null;
        this.f42932OooO0oO = false;
        this.f42935OooOO0O = Executors.newFixedThreadPool(1);
        this.f42933OooO0oo = 22050;
        this.f42925OooO = 16;
        this.f42934OooOO0 = pCMFormat;
    }

    @Override // p360o0OOOooO.o000000O
    public final void OooO00o() {
    }

    @Override // p360o0OOOooO.o000000O
    public final void OooO0O0() {
        if (this.f42938OooOOO0 == null || !new File(this.f42938OooOOO0).exists()) {
            return;
        }
        new File(this.f42938OooOOO0).delete();
    }

    @Override // p360o0OOOooO.o000000O
    public final double OooO0OO() {
        return this.f42937OooOOO;
    }

    @Override // p360o0OOOooO.o000000O
    public final void OooO0Oo(String str) {
        if (str == null) {
            return;
        }
        this.f42938OooOOO0 = str;
        File file = new File(new File(str).getParent());
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // p360o0OOOooO.o000000O
    public final void start() throws IOException {
        if (this.f42932OooO0oO) {
            return;
        }
        Log.d("o000oOoO", "Start recording");
        Log.d("o000oOoO", "BufferSize = " + this.f42927OooO0O0);
        if (this.f42926OooO00o == null) {
            PCMFormat pCMFormat = this.f42934OooOO0;
            int iOooO0O0 = pCMFormat.OooO0O0();
            int iOooO00o = pCMFormat.OooO00o();
            int i = this.f42925OooO;
            int i2 = this.f42933OooO0oo;
            int minBufferSize = AudioRecord.getMinBufferSize(i2, i, iOooO00o) / iOooO0O0;
            int i3 = minBufferSize % Constants.ERR_ALREADY_IN_RECORDING;
            if (i3 != 0) {
                minBufferSize += 160 - i3;
                Log.d("o000oOoO", "Frame size: " + minBufferSize);
            }
            this.f42927OooO0O0 = minBufferSize * iOooO0O0;
            this.f42926OooO00o = new AudioRecord(1, this.f42933OooO0oo, this.f42925OooO, pCMFormat.OooO00o(), this.f42927OooO0O0);
            this.f42928OooO0OO = new o0OoOo0(this.f42927OooO0O0 * 10);
            this.f42929OooO0Oo = new byte[this.f42927OooO0O0];
            LameEncodc.lameinit(i2, 1, i2, 32, 7);
            this.f42931OooO0o0 = new FileOutputStream(this.f42938OooOOO0);
            Oooo0 oooo0 = new Oooo0(this.f42928OooO0OO, this.f42931OooO0o0, this.f42927OooO0O0);
            this.f42930OooO0o = oooo0;
            oooo0.start();
            AudioRecord audioRecord = this.f42926OooO00o;
            Oooo0 oooo1 = this.f42930OooO0o;
            oooo1.getClass();
            try {
                oooo1.f42922OooOO0.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.e("Oooo0", "Error when waiting handle to init");
            }
            audioRecord.setRecordPositionUpdateListener(oooo1, oooo1.f42917OooO0Oo);
            this.f42926OooO00o.setPositionNotificationPeriod(Constants.ERR_ALREADY_IN_RECORDING);
        }
        this.f42926OooO00o.startRecording();
        this.f42935OooOO0O.execute(new OooO00o());
    }

    @Override // p360o0OOOooO.o000000O
    public final void stop() throws IOException {
        Log.d("o000oOoO", "stop recording");
        this.f42932OooO0oO = false;
    }
}
