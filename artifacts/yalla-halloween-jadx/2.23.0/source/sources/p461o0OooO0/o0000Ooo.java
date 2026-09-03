package p461o0OooO0;

import android.util.Log;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import o0OooO0.o00000OO.OooO0O0;
import p285o0O0OOoo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo implements o000000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f46644OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f46645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f46646OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000OO f46647OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f46648OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f46649OooO0O0;

        public OooO00o(byte[] bArr, int i) {
            this.f46648OooO00o = bArr;
            this.f46649OooO0O0 = i;
        }
    }

    public o0000Ooo(File file) {
        this.f46645OooO00o = file;
    }

    @Override // p461o0OooO0.o000000
    public final void OooO00o() {
        o000oOoO.OooO00o(this.f46647OooO0OO, "There was a problem closing the Crashlytics log file.");
        this.f46647OooO0OO = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // p461o0OooO0.o000000
    public final String OooO0O0() {
        OooO00o oooO00o;
        byte[] bArr;
        if (this.f46645OooO00o.exists()) {
            OooO0Oo();
            o00000OO o00000oo2 = this.f46647OooO0OO;
            if (o00000oo2 == null) {
                oooO00o = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[o00000oo2.Oooo00o()];
                try {
                    o00000OO o00000oo3 = this.f46647OooO0OO;
                    synchronized (o00000oo3) {
                        int iOooo0 = o00000oo3.f46635OooO0oO.f46638OooO00o;
                        for (int i = 0; i < o00000oo3.f46633OooO0o; i++) {
                            o00000OO.OooO00o oooO00oOooOOo = o00000oo3.OooOOo(iOooo0);
                            o00000OO.OooO0O0 oooO0O0 = o00000oo3.new OooO0O0(oooO00oOooOOo);
                            int i2 = oooO00oOooOOo.f46639OooO0O0;
                            try {
                                oooO0O0.read(bArr2, iArr[0], i2);
                                iArr[0] = iArr[0] + i2;
                                oooO0O0.close();
                                iOooo0 = o00000oo3.Oooo0(oooO00oOooOOo.f46638OooO00o + 4 + oooO00oOooOOo.f46639OooO0O0);
                            } catch (Throwable th) {
                                oooO0O0.close();
                                throw th;
                            }
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
            int i3 = oooO00o.f46649OooO0O0;
            bArr = new byte[i3];
            System.arraycopy(oooO00o.f46648OooO00o, 0, bArr, 0, i3);
        }
        if (bArr != null) {
            return new String(bArr, f46644OooO0Oo);
        }
        return null;
    }

    @Override // p461o0OooO0.o000000
    public final void OooO0OO(long j, String str) {
        OooO0Oo();
        int i = this.f46646OooO0O0;
        if (this.f46647OooO0OO == null) {
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
            this.f46647OooO0OO.OooO00o(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", ZegoConstants.ZegoVideoDataAuxPublishingStream).replaceAll("\n", ZegoConstants.ZegoVideoDataAuxPublishingStream)).getBytes(f46644OooO0Oo));
            while (!this.f46647OooO0OO.OooOOo0() && this.f46647OooO0OO.Oooo00o() > i) {
                this.f46647OooO0OO.OooOo0();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void OooO0Oo() {
        File file = this.f46645OooO00o;
        if (this.f46647OooO0OO == null) {
            try {
                this.f46647OooO0OO = new o00000OO(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
