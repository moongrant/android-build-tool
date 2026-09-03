package p290o0O0Oo0O;

import android.util.Log;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import o0O0Oo0O.OooOOO0.OooO0O0;
import p289o0O0Oo0.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f41600OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f41601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f41602OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO0 f41603OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f41604OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f41605OooO0O0;

        public OooO00o(byte[] bArr, int i) {
            this.f41604OooO00o = bArr;
            this.f41605OooO0O0 = i;
        }
    }

    public OooOOO(File file) {
        this.f41601OooO00o = file;
    }

    @Override // p290o0O0Oo0O.OooO0OO
    public final void OooO00o() {
        OooOO0O.OooO00o(this.f41603OooO0OO, "There was a problem closing the Crashlytics log file.");
        this.f41603OooO0OO = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // p290o0O0Oo0O.OooO0OO
    public final String OooO0O0() {
        OooO00o oooO00o;
        byte[] bArr;
        if (this.f41601OooO00o.exists()) {
            OooO0Oo();
            OooOOO0 oooOOO0 = this.f41603OooO0OO;
            if (oooOOO0 == null) {
                oooO00o = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[oooOOO0.Oooo0()];
                try {
                    OooOOO0 oooOOO1 = this.f41603OooO0OO;
                    synchronized (oooOOO1) {
                        try {
                            int iOooo0O0 = oooOOO1.f41611OooO0oO.f41614OooO00o;
                            for (int i = 0; i < oooOOO1.f41609OooO0o; i++) {
                                OooOOO0.OooO00o oooO00oOooOo00 = oooOOO1.OooOo00(iOooo0O0);
                                OooOOO0.OooO0O0 oooO0O0 = oooOOO1.new OooO0O0(oooO00oOooOo00);
                                int i2 = oooO00oOooOo00.f41615OooO0O0;
                                try {
                                    oooO0O0.read(bArr2, iArr[0], i2);
                                    iArr[0] = iArr[0] + i2;
                                    oooO0O0.close();
                                    iOooo0O0 = oooOOO1.Oooo0O0(oooO00oOooOo00.f41614OooO00o + 4 + oooO00oOooOo00.f41615OooO0O0);
                                } catch (Throwable th) {
                                    oooO0O0.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                oooO00o = new OooO00o(bArr2, iArr[0]);
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o == null) {
            bArr = null;
        } else {
            int i3 = oooO00o.f41605OooO0O0;
            bArr = new byte[i3];
            System.arraycopy(oooO00o.f41604OooO00o, 0, bArr, 0, i3);
        }
        if (bArr != null) {
            return new String(bArr, f41600OooO0Oo);
        }
        return null;
    }

    @Override // p290o0O0Oo0O.OooO0OO
    public final void OooO0OO(long j, String str) {
        OooO0Oo();
        int i = this.f41602OooO0O0;
        if (this.f41603OooO0OO == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = i / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.f41603OooO0OO.OooO00o(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", ZegoConstants.ZegoVideoDataAuxPublishingStream).replaceAll("\n", ZegoConstants.ZegoVideoDataAuxPublishingStream)).getBytes(f41600OooO0Oo));
            while (!this.f41603OooO0OO.OooOOo() && this.f41603OooO0OO.Oooo0() > i) {
                this.f41603OooO0OO.OooOo();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void OooO0Oo() {
        File file = this.f41601OooO00o;
        if (this.f41603OooO0OO == null) {
            try {
                this.f41603OooO0OO = new OooOOO0(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
