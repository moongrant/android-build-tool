package p363o0OOOoo0;

import android.util.Log;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f38564OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f38565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38566OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOo f38567OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f38568OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f38569OooO0O0;

        public OooO00o(byte[] bArr, int i) {
            this.f38568OooO00o = bArr;
            this.f38569OooO0O0 = i;
        }
    }

    public Oooo0(File file) {
        this.f38565OooO00o = file;
    }

    @Override // p363o0OOOoo0.OooOOO0
    public final void OooO00o() {
        p361o0OOOoOo.Oooo0.OooO00o(this.f38567OooO0OO, "There was a problem closing the Crashlytics log file.");
        this.f38567OooO0OO = null;
    }

    @Override // p363o0OOOoo0.OooOOO0
    public final String OooO0O0() {
        byte[] bArrOooO0Oo = OooO0Oo();
        if (bArrOooO0Oo != null) {
            return new String(bArrOooO0Oo, f38564OooO0Oo);
        }
        return null;
    }

    @Override // p363o0OOOoo0.OooOOO0
    public final void OooO0OO(long j, String str) {
        OooO0o0();
        if (this.f38567OooO0OO == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.f38566OooO0O0 / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f38567OooO0OO.OooO00o(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", ZegoConstants.ZegoVideoDataAuxPublishingStream).replaceAll("\n", ZegoConstants.ZegoVideoDataAuxPublishingStream)).getBytes(f38564OooO0Oo));
            while (!this.f38567OooO0OO.OooO0oo() && this.f38567OooO0OO.OooOoOO() > this.f38566OooO0O0) {
                this.f38567OooO0OO.OooOOoo();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    public final byte[] OooO0Oo() {
        OooO00o oooO00o;
        if (this.f38565OooO00o.exists()) {
            OooO0o0();
            OooOo oooOo = this.f38567OooO0OO;
            if (oooOo == null) {
                oooO00o = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[oooOo.OooOoOO()];
                try {
                    this.f38567OooO0OO.OooO0o(new Oooo000(bArr, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                oooO00o = new OooO00o(bArr, iArr[0]);
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o == null) {
            return null;
        }
        int i = oooO00o.f38569OooO0O0;
        byte[] bArr2 = new byte[i];
        System.arraycopy(oooO00o.f38568OooO00o, 0, bArr2, 0, i);
        return bArr2;
    }

    public final void OooO0o0() {
        if (this.f38567OooO0OO == null) {
            try {
                this.f38567OooO0OO = new OooOo(this.f38565OooO00o);
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not open log file: ");
                sbOooO0o0.append(this.f38565OooO00o);
                Log.e("FirebaseCrashlytics", sbOooO0o0.toString(), e);
            }
        }
    }
}
