package p357o0OOOoo0;

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
import p356o0OOOoo.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements o0Oo0oo {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f43747OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f43748OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioRecord f43749OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43750OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOo f43751OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f43752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOOO f43753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FileOutputStream f43754OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43755OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f43756OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final PCMFormat f43757OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ExecutorService f43758OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public double f43759OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public double f43760OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f43761OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FileOutputStream fileOutputStream;
            OooOo00 oooOo00 = OooOo00.this;
            if (oooOo00.f43749OooO00o == null) {
                oooOo00.f43755OooO0oO = false;
                return;
            }
            oooOo00.f43755OooO0oO = true;
            while (oooOo00.f43755OooO0oO) {
                try {
                    Log.e("jjfly", "jjfly--------" + oooOo00.f43752OooO0Oo + "-----" + oooOo00.f43749OooO00o);
                    int i = oooOo00.f43749OooO00o.read(oooOo00.f43752OooO0Oo, 0, oooOo00.f43750OooO0O0);
                    if (i > 0) {
                        OooOo oooOo = oooOo00.f43751OooO0OO;
                        byte[] bArr = oooOo00.f43752OooO0Oo;
                        int iOooO00o = oooOo.OooO00o(true);
                        if (iOooO00o == 0) {
                            Log.e(OooOo.class.getSimpleName(), "Buffer overrun. Data will not be written");
                        } else {
                            if (i <= iOooO00o) {
                                iOooO00o = i;
                            }
                            for (int i2 = 0; i2 < iOooO00o; i2++) {
                                int i3 = oooOo.f43746OooO0Oo;
                                int i4 = i3 + 1;
                                oooOo.f43746OooO0Oo = i4;
                                oooOo.f43743OooO00o[i3] = bArr[i2];
                                if (i4 == oooOo.f43744OooO0O0) {
                                    oooOo.f43746OooO0Oo = 0;
                                }
                            }
                        }
                        long j = 0;
                        for (byte b : oooOo00.f43752OooO0Oo) {
                            j += (long) (b * b);
                        }
                        double d = (j / ((double) i)) * 2.0d;
                        oooOo00.f43759OooOO0o = Math.log10(d) * 10.0d;
                        oooOo00.f43760OooOOO = d;
                        Log.e("OooOo00", String.valueOf(d) + "----");
                        Log.e("OooOo00", String.valueOf(oooOo00.f43759OooOO0o) + "----");
                        Log.e("jjfly", new StringBuilder(String.valueOf(oooOo00.f43759OooOO0o)).toString());
                    }
                } catch (InterruptedException unused) {
                    int i5 = OooOo00.f43747OooOOOO;
                    Log.d("OooOo00", "Faile to join encode thread");
                    fileOutputStream = oooOo00.f43754OooO0o0;
                    if (fileOutputStream == null) {
                        return;
                    }
                } finally {
                    FileOutputStream fileOutputStream2 = oooOo00.f43754OooO0o0;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            oooOo00.f43749OooO00o.stop();
            oooOo00.f43749OooO00o.release();
            oooOo00.f43749OooO00o = null;
            OooOOOO oooOOOO = oooOo00.f43753OooO0o;
            oooOOOO.getClass();
            try {
                oooOOOO.f43741OooOO0.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                Log.e("OooOOOO", "Error when waiting handle to init");
            }
            Message.obtain(oooOOOO.f43736OooO0Oo, 1).sendToTarget();
            int i6 = OooOo00.f43747OooOOOO;
            Log.d("OooOo00", "waiting for encoding thread");
            oooOo00.f43753OooO0o.join();
            Log.d("OooOo00", "done encoding thread");
            fileOutputStream = oooOo00.f43754OooO0o0;
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

    public OooOo00() {
        PCMFormat pCMFormat = PCMFormat.PCM_16BIT;
        this.f43749OooO00o = null;
        this.f43754OooO0o0 = null;
        this.f43755OooO0oO = false;
        this.f43758OooOO0O = Executors.newFixedThreadPool(1);
        this.f43756OooO0oo = 22050;
        this.f43748OooO = 16;
        this.f43757OooOO0 = pCMFormat;
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final void OooO00o() {
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final void OooO0O0() {
        if (this.f43761OooOOO0 == null || !new File(this.f43761OooOOO0).exists()) {
            return;
        }
        new File(this.f43761OooOOO0).delete();
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final double OooO0OO() {
        return this.f43760OooOOO;
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final void OooO0Oo(String str) {
        if (str == null) {
            return;
        }
        this.f43761OooOOO0 = str;
        File file = new File(new File(str).getParent());
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final void start() throws IOException {
        if (this.f43755OooO0oO) {
            return;
        }
        Log.d("OooOo00", "Start recording");
        Log.d("OooOo00", "BufferSize = " + this.f43750OooO0O0);
        if (this.f43749OooO00o == null) {
            PCMFormat pCMFormat = this.f43757OooOO0;
            int iOooO0O0 = pCMFormat.OooO0O0();
            int iOooO00o = pCMFormat.OooO00o();
            int i = this.f43748OooO;
            int i2 = this.f43756OooO0oo;
            int minBufferSize = AudioRecord.getMinBufferSize(i2, i, iOooO00o) / iOooO0O0;
            int i3 = minBufferSize % Constants.ERR_ALREADY_IN_RECORDING;
            if (i3 != 0) {
                minBufferSize += 160 - i3;
                Log.d("OooOo00", "Frame size: " + minBufferSize);
            }
            this.f43750OooO0O0 = minBufferSize * iOooO0O0;
            this.f43749OooO00o = new AudioRecord(1, this.f43756OooO0oo, this.f43748OooO, pCMFormat.OooO00o(), this.f43750OooO0O0);
            this.f43751OooO0OO = new OooOo(this.f43750OooO0O0 * 10);
            this.f43752OooO0Oo = new byte[this.f43750OooO0O0];
            LameEncodc.lameinit(i2, 1, i2, 32, 7);
            this.f43754OooO0o0 = new FileOutputStream(this.f43761OooOOO0);
            OooOOOO oooOOOO = new OooOOOO(this.f43751OooO0OO, this.f43754OooO0o0, this.f43750OooO0O0);
            this.f43753OooO0o = oooOOOO;
            oooOOOO.start();
            AudioRecord audioRecord = this.f43749OooO00o;
            OooOOOO oooOOOO2 = this.f43753OooO0o;
            oooOOOO2.getClass();
            try {
                oooOOOO2.f43741OooOO0.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.e("OooOOOO", "Error when waiting handle to init");
            }
            audioRecord.setRecordPositionUpdateListener(oooOOOO2, oooOOOO2.f43736OooO0Oo);
            this.f43749OooO00o.setPositionNotificationPeriod(Constants.ERR_ALREADY_IN_RECORDING);
        }
        this.f43749OooO00o.startRecording();
        this.f43758OooOO0O.execute(new OooO00o());
    }

    @Override // p356o0OOOoo.o0Oo0oo
    public final void stop() throws IOException {
        Log.d("OooOo00", "stop recording");
        this.f43755OooO0oO = false;
    }
}
