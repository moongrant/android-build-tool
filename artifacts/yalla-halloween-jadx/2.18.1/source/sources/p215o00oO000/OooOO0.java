package p215o00oO000;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.UByte;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f33621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO f33622OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f33620OooO00o = new byte[256];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33623OooO0Oo = 0;

    public final boolean OooO00o() {
        return this.f33622OooO0OO.f33599OooO0O0 != 0;
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<o00oO000.OooO0o>] */
    @NonNull
    public final OooO OooO0O0() {
        if (this.f33621OooO0O0 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (OooO00o()) {
            return this.f33622OooO0OO;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO0OO());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f33622OooO0OO.f33602OooO0o = OooO0o();
            this.f33622OooO0OO.f33604OooO0oO = OooO0o();
            int iOooO0OO = OooO0OO();
            OooO oooO = this.f33622OooO0OO;
            oooO.f33605OooO0oo = (iOooO0OO & 128) != 0;
            oooO.f33597OooO = (int) Math.pow(2.0d, (iOooO0OO & 7) + 1);
            this.f33622OooO0OO.f33606OooOO0 = OooO0OO();
            OooO oooO2 = this.f33622OooO0OO;
            OooO0OO();
            Objects.requireNonNull(oooO2);
            if (this.f33622OooO0OO.f33605OooO0oo && !OooO00o()) {
                OooO oooO3 = this.f33622OooO0OO;
                oooO3.f33598OooO00o = OooO0o0(oooO3.f33597OooO);
                OooO oooO4 = this.f33622OooO0OO;
                oooO4.f33607OooOO0O = oooO4.f33598OooO00o[oooO4.f33606OooOO0];
            }
        } else {
            this.f33622OooO0OO.f33599OooO0O0 = 1;
        }
        if (!OooO00o()) {
            boolean z = false;
            while (!z && !OooO00o() && this.f33622OooO0OO.f33600OooO0OO <= Integer.MAX_VALUE) {
                int iOooO0OO2 = OooO0OO();
                if (iOooO0OO2 == 33) {
                    int iOooO0OO3 = OooO0OO();
                    if (iOooO0OO3 == 1) {
                        OooO0oO();
                    } else if (iOooO0OO3 == 249) {
                        this.f33622OooO0OO.f33601OooO0Oo = new OooO0o();
                        OooO0OO();
                        int iOooO0OO4 = OooO0OO();
                        OooO0o oooO0o = this.f33622OooO0OO.f33601OooO0Oo;
                        int i2 = (iOooO0OO4 & 28) >> 2;
                        oooO0o.f33616OooO0oO = i2;
                        if (i2 == 0) {
                            oooO0o.f33616OooO0oO = 1;
                        }
                        oooO0o.f33614OooO0o = (iOooO0OO4 & 1) != 0;
                        int iOooO0o = OooO0o();
                        if (iOooO0o < 2) {
                            iOooO0o = 10;
                        }
                        OooO0o oooO0o2 = this.f33622OooO0OO.f33601OooO0Oo;
                        oooO0o2.f33609OooO = iOooO0o * 10;
                        oooO0o2.f33617OooO0oo = OooO0OO();
                        OooO0OO();
                    } else if (iOooO0OO3 == 254) {
                        OooO0oO();
                    } else if (iOooO0OO3 != 255) {
                        OooO0oO();
                    } else {
                        OooO0Oo();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < 11; i3++) {
                            sb2.append((char) this.f33620OooO00o[i3]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                OooO0Oo();
                                byte[] bArr = this.f33620OooO00o;
                                if (bArr[0] == 1) {
                                    this.f33622OooO0OO.f33608OooOO0o = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
                                }
                                if (this.f33623OooO0Oo <= 0) {
                                    break;
                                }
                            } while (!OooO00o());
                        } else {
                            OooO0oO();
                        }
                    }
                } else if (iOooO0OO2 == 44) {
                    OooO oooO5 = this.f33622OooO0OO;
                    if (oooO5.f33601OooO0Oo == null) {
                        oooO5.f33601OooO0Oo = new OooO0o();
                    }
                    oooO5.f33601OooO0Oo.f33610OooO00o = OooO0o();
                    this.f33622OooO0OO.f33601OooO0Oo.f33611OooO0O0 = OooO0o();
                    this.f33622OooO0OO.f33601OooO0Oo.f33612OooO0OO = OooO0o();
                    this.f33622OooO0OO.f33601OooO0Oo.f33613OooO0Oo = OooO0o();
                    int iOooO0OO5 = OooO0OO();
                    boolean z2 = (iOooO0OO5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iOooO0OO5 & 7) + 1);
                    OooO0o oooO0o3 = this.f33622OooO0OO.f33601OooO0Oo;
                    oooO0o3.f33615OooO0o0 = (iOooO0OO5 & 64) != 0;
                    if (z2) {
                        oooO0o3.f33619OooOO0O = OooO0o0(iPow);
                    } else {
                        oooO0o3.f33619OooOO0O = null;
                    }
                    this.f33622OooO0OO.f33601OooO0Oo.f33618OooOO0 = this.f33621OooO0O0.position();
                    OooO0OO();
                    OooO0oO();
                    if (!OooO00o()) {
                        OooO oooO6 = this.f33622OooO0OO;
                        oooO6.f33600OooO0OO++;
                        oooO6.f33603OooO0o0.add(oooO6.f33601OooO0Oo);
                    }
                } else if (iOooO0OO2 != 59) {
                    this.f33622OooO0OO.f33599OooO0O0 = 1;
                } else {
                    z = true;
                }
            }
            OooO oooO7 = this.f33622OooO0OO;
            if (oooO7.f33600OooO0OO < 0) {
                oooO7.f33599OooO0O0 = 1;
            }
        }
        return this.f33622OooO0OO;
    }

    public final int OooO0OO() {
        try {
            return this.f33621OooO0O0.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f33622OooO0OO.f33599OooO0O0 = 1;
            return 0;
        }
    }

    public final void OooO0Oo() {
        int iOooO0OO = OooO0OO();
        this.f33623OooO0Oo = iOooO0OO;
        if (iOooO0OO <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f33623OooO0Oo;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f33621OooO0O0.get(this.f33620OooO00o, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sbOooO0O0.append(this.f33623OooO0Oo);
                    Log.d("GifHeaderParser", sbOooO0O0.toString(), e);
                }
                this.f33622OooO0OO.f33599OooO0O0 = 1;
                return;
            }
        }
    }

    public final int OooO0o() {
        return this.f33621OooO0O0.getShort();
    }

    @Nullable
    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f33621OooO0O0.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & UByte.MAX_VALUE) << 16) | (-16777216) | ((bArr[i4] & UByte.MAX_VALUE) << 8) | (bArr[i5] & UByte.MAX_VALUE);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f33622OooO0OO.f33599OooO0O0 = 1;
        }
        return iArr;
    }

    public final void OooO0oO() {
        int iOooO0OO;
        do {
            iOooO0OO = OooO0OO();
            this.f33621OooO0O0.position(Math.min(this.f33621OooO0O0.position() + iOooO0OO, this.f33621OooO0O0.limit()));
        } while (iOooO0OO > 0);
    }
}
