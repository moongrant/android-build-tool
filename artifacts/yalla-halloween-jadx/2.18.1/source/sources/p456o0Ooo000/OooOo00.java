package p456o0Ooo000;

import android.media.AudioRecord;
import android.os.Message;
import android.util.Log;
import com.will.codecs.audio.mp3.LameEncodc;
import com.will.codecs.audio.mp3.PCMFormat;
import io.agora.rtc.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p318o0O0oOo.o000O000;
import p455o0Ooo00.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooO0o {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f40386OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f40387OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioRecord f40388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O000 f40390OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f40391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOOO f40392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FileOutputStream f40393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f40394OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f40395OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public PCMFormat f40396OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ExecutorService f40397OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public double f40398OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public double f40399OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f40400OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:50:0x0068). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public final void run() {
            OooOo00 oooOo00;
            OooOo00 oooOo01 = OooOo00.this;
            if (oooOo01.f40388OooO00o == null) {
                oooOo01.f40394OooO0oO = false;
                return;
            }
            oooOo01.f40394OooO0oO = true;
            while (true) {
                oooOo00 = OooOo00.this;
                try {
                    try {
                        if (oooOo00.f40394OooO0oO) {
                            Log.e("jjfly", "jjfly--------" + OooOo00.this.f40391OooO0Oo + "-----" + OooOo00.this.f40388OooO00o);
                            OooOo00 oooOo02 = OooOo00.this;
                            int i = oooOo02.f40388OooO00o.read(oooOo02.f40391OooO0Oo, 0, oooOo02.f40389OooO0O0);
                            if (i > 0) {
                                OooOo00 oooOo03 = OooOo00.this;
                                o000O000 o000o001 = oooOo03.f40390OooO0OO;
                                byte[] bArr = oooOo03.f40391OooO0Oo;
                                int iOooO0Oo = o000o001.OooO0Oo(true);
                                if (iOooO0Oo == 0) {
                                    Log.e(o000O000.class.getSimpleName(), "Buffer overrun. Data will not be written");
                                } else {
                                    if (i <= iOooO0Oo) {
                                        iOooO0Oo = i;
                                    }
                                    for (int i2 = 0; i2 < iOooO0Oo; i2++) {
                                        byte[] bArr2 = o000o001.f36716OooO00o;
                                        int i3 = o000o001.f36719OooO0Oo;
                                        int i4 = i3 + 1;
                                        o000o001.f36719OooO0Oo = i4;
                                        bArr2[i3] = bArr[i2];
                                        if (i4 == o000o001.f36717OooO0O0) {
                                            o000o001.f36719OooO0Oo = 0;
                                        }
                                    }
                                }
                                OooOo00 oooOo04 = OooOo00.this;
                                byte[] bArr3 = oooOo04.f40391OooO0Oo;
                                Objects.requireNonNull(oooOo04);
                                long j = 0;
                                for (int i5 = 0; i5 < bArr3.length; i5++) {
                                    j += (long) (bArr3[i5] * bArr3[i5]);
                                }
                                double d = (j / ((double) i)) * 2.0d;
                                oooOo04.f40398OooOO0o = Math.log10(d) * 10.0d;
                                oooOo04.f40399OooOOO = d;
                                Log.e("OooOo00", String.valueOf(d) + "----");
                                Log.e("OooOo00", String.valueOf(oooOo04.f40398OooOO0o) + "----");
                                Log.e("jjfly", new StringBuilder(String.valueOf(OooOo00.this.f40398OooOO0o)).toString());
                            }
                        } else {
                            try {
                                break;
                            } catch (InterruptedException unused) {
                                int i6 = OooOo00.f40386OooOOOO;
                                Log.d("OooOo00", "Faile to join encode thread");
                                FileOutputStream fileOutputStream = OooOo00.this.f40393OooO0o0;
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        FileOutputStream fileOutputStream2 = OooOo00.this.f40393OooO0o0;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            oooOo00.f40388OooO00o.stop();
            OooOo00.this.f40388OooO00o.release();
            OooOo00 oooOo05 = OooOo00.this;
            oooOo05.f40388OooO00o = null;
            Message.obtain(oooOo05.f40392OooO0o.OooO00o(), 1).sendToTarget();
            int i7 = OooOo00.f40386OooOOOO;
            Log.d("OooOo00", "waiting for encoding thread");
            OooOo00.this.f40392OooO0o.join();
            Log.d("OooOo00", "done encoding thread");
            FileOutputStream fileOutputStream3 = OooOo00.this.f40393OooO0o0;
            if (fileOutputStream3 != null) {
                fileOutputStream3.close();
            }
        }
    }

    static {
        System.loadLibrary("mp3encoder");
    }

    public OooOo00() {
        PCMFormat pCMFormat = PCMFormat.PCM_16BIT;
        this.f40388OooO00o = null;
        this.f40393OooO0o0 = null;
        this.f40394OooO0oO = false;
        this.f40397OooOO0O = Executors.newFixedThreadPool(1);
        this.f40395OooO0oo = 22050;
        this.f40387OooO = 16;
        this.f40396OooOO0 = pCMFormat;
    }

    @Override // p455o0Ooo00.OooO0o
    public final void OooO00o() {
    }

    @Override // p455o0Ooo00.OooO0o
    public final String OooO0O0() {
        return this.f40400OooOOO0;
    }

    @Override // p455o0Ooo00.OooO0o
    public final void OooO0OO() {
        if (this.f40400OooOOO0 == null || !new File(this.f40400OooOOO0).exists()) {
            return;
        }
        new File(this.f40400OooOOO0).delete();
    }

    @Override // p455o0Ooo00.OooO0o
    public final double OooO0Oo() {
        return this.f40399OooOOO;
    }

    @Override // p455o0Ooo00.OooO0o
    public final void OooO0o0(String str) {
        if (str == null) {
            return;
        }
        this.f40400OooOOO0 = str;
        File file = new File(new File(str).getParent());
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // p455o0Ooo00.OooO0o
    public final void start() throws IOException {
        if (this.f40394OooO0oO) {
            return;
        }
        Log.d("OooOo00", "Start recording");
        Log.d("OooOo00", "BufferSize = " + this.f40389OooO0O0);
        if (this.f40388OooO00o == null) {
            int iOooO0O0 = this.f40396OooOO0.OooO0O0();
            int minBufferSize = AudioRecord.getMinBufferSize(this.f40395OooO0oo, this.f40387OooO, this.f40396OooOO0.OooO00o()) / iOooO0O0;
            int i = minBufferSize % Constants.ERR_ALREADY_IN_RECORDING;
            if (i != 0) {
                minBufferSize += 160 - i;
                Log.d("OooOo00", "Frame size: " + minBufferSize);
            }
            this.f40389OooO0O0 = minBufferSize * iOooO0O0;
            this.f40388OooO00o = new AudioRecord(1, this.f40395OooO0oo, this.f40387OooO, this.f40396OooOO0.OooO00o(), this.f40389OooO0O0);
            this.f40390OooO0OO = new o000O000(this.f40389OooO0O0 * 10);
            this.f40391OooO0Oo = new byte[this.f40389OooO0O0];
            int i2 = this.f40395OooO0oo;
            LameEncodc.lameinit(i2, 1, i2, 32, 7);
            this.f40393OooO0o0 = new FileOutputStream(this.f40400OooOOO0);
            OooOOOO oooOOOO = new OooOOOO(this.f40390OooO0OO, this.f40393OooO0o0, this.f40389OooO0O0);
            this.f40392OooO0o = oooOOOO;
            oooOOOO.start();
            AudioRecord audioRecord = this.f40388OooO00o;
            OooOOOO oooOOOO2 = this.f40392OooO0o;
            Objects.requireNonNull(oooOOOO2);
            try {
                oooOOOO2.f40384OoooO0O.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.e(OooOOOO.f40377OoooO, "Error when waiting handle to init");
            }
            audioRecord.setRecordPositionUpdateListener(oooOOOO2, oooOOOO2.f40379Oooo0o);
            this.f40388OooO00o.setPositionNotificationPeriod(Constants.ERR_ALREADY_IN_RECORDING);
        }
        this.f40388OooO00o.startRecording();
        this.f40397OooOO0O.execute(new OooO00o());
    }

    @Override // p455o0Ooo00.OooO0o
    public final void stop() throws IOException {
        Log.d("OooOo00", "stop recording");
        this.f40394OooO0oO = false;
    }
}
