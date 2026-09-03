package p124o00O0oO;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f36703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo000 f36704OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f36702OooO00o = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36705OooO0Oo = 0;

    public final boolean OooO00o() {
        return this.f36704OooO0OO.f36708OooO0O0 != 0;
    }

    @NonNull
    public final Oooo000 OooO0O0() {
        byte[] bArr;
        if (this.f36703OooO0O0 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (OooO00o()) {
            return this.f36704OooO0OO;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO0OO());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f36704OooO0OO.f36711OooO0o = OooO0o();
            this.f36704OooO0OO.f36713OooO0oO = OooO0o();
            int iOooO0OO = OooO0OO();
            Oooo000 oooo000 = this.f36704OooO0OO;
            oooo000.f36714OooO0oo = (iOooO0OO & 128) != 0;
            oooo000.f36706OooO = (int) Math.pow(2.0d, (iOooO0OO & 7) + 1);
            this.f36704OooO0OO.f36715OooOO0 = OooO0OO();
            Oooo000 oooo001 = this.f36704OooO0OO;
            OooO0OO();
            oooo001.getClass();
            if (this.f36704OooO0OO.f36714OooO0oo && !OooO00o()) {
                Oooo000 oooo002 = this.f36704OooO0OO;
                oooo002.f36707OooO00o = OooO0o0(oooo002.f36706OooO);
                Oooo000 oooo003 = this.f36704OooO0OO;
                oooo003.f36716OooOO0O = oooo003.f36707OooO00o[oooo003.f36715OooOO0];
            }
        } else {
            this.f36704OooO0OO.f36708OooO0O0 = 1;
        }
        if (!OooO00o()) {
            boolean z = false;
            while (!z && !OooO00o() && this.f36704OooO0OO.f36709OooO0OO <= Integer.MAX_VALUE) {
                int iOooO0OO2 = OooO0OO();
                if (iOooO0OO2 == 33) {
                    int iOooO0OO3 = OooO0OO();
                    if (iOooO0OO3 == 1) {
                        OooO0oO();
                    } else if (iOooO0OO3 == 249) {
                        this.f36704OooO0OO.f36710OooO0Oo = new OooOo();
                        OooO0OO();
                        int iOooO0OO4 = OooO0OO();
                        OooOo oooOo = this.f36704OooO0OO.f36710OooO0Oo;
                        int i2 = (iOooO0OO4 & 28) >> 2;
                        oooOo.f36698OooO0oO = i2;
                        if (i2 == 0) {
                            oooOo.f36698OooO0oO = 1;
                        }
                        oooOo.f36696OooO0o = (iOooO0OO4 & 1) != 0;
                        int iOooO0o = OooO0o();
                        if (iOooO0o < 2) {
                            iOooO0o = 10;
                        }
                        OooOo oooOo2 = this.f36704OooO0OO.f36710OooO0Oo;
                        oooOo2.f36691OooO = iOooO0o * 10;
                        oooOo2.f36699OooO0oo = OooO0OO();
                        OooO0OO();
                    } else if (iOooO0OO3 == 254) {
                        OooO0oO();
                    } else if (iOooO0OO3 != 255) {
                        OooO0oO();
                    } else {
                        OooO0Oo();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f36702OooO00o;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                OooO0Oo();
                                if (bArr[0] == 1) {
                                    this.f36704OooO0OO.f36717OooOO0o = (bArr[1] & UByte.MAX_VALUE) | ((bArr[2] & UByte.MAX_VALUE) << 8);
                                }
                                if (this.f36705OooO0Oo <= 0) {
                                    break;
                                }
                            } while (!OooO00o());
                        } else {
                            OooO0oO();
                        }
                    }
                } else if (iOooO0OO2 == 44) {
                    Oooo000 oooo004 = this.f36704OooO0OO;
                    if (oooo004.f36710OooO0Oo == null) {
                        oooo004.f36710OooO0Oo = new OooOo();
                    }
                    this.f36704OooO0OO.f36710OooO0Oo.f36692OooO00o = OooO0o();
                    this.f36704OooO0OO.f36710OooO0Oo.f36693OooO0O0 = OooO0o();
                    this.f36704OooO0OO.f36710OooO0Oo.f36694OooO0OO = OooO0o();
                    this.f36704OooO0OO.f36710OooO0Oo.f36695OooO0Oo = OooO0o();
                    int iOooO0OO5 = OooO0OO();
                    boolean z2 = (iOooO0OO5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iOooO0OO5 & 7) + 1);
                    OooOo oooOo3 = this.f36704OooO0OO.f36710OooO0Oo;
                    oooOo3.f36697OooO0o0 = (iOooO0OO5 & 64) != 0;
                    if (z2) {
                        oooOo3.f36701OooOO0O = OooO0o0(iPow);
                    } else {
                        oooOo3.f36701OooOO0O = null;
                    }
                    this.f36704OooO0OO.f36710OooO0Oo.f36700OooOO0 = this.f36703OooO0O0.position();
                    OooO0OO();
                    OooO0oO();
                    if (!OooO00o()) {
                        Oooo000 oooo005 = this.f36704OooO0OO;
                        oooo005.f36709OooO0OO++;
                        oooo005.f36712OooO0o0.add(oooo005.f36710OooO0Oo);
                    }
                } else if (iOooO0OO2 != 59) {
                    this.f36704OooO0OO.f36708OooO0O0 = 1;
                } else {
                    z = true;
                }
            }
            Oooo000 oooo006 = this.f36704OooO0OO;
            if (oooo006.f36709OooO0OO < 0) {
                oooo006.f36708OooO0O0 = 1;
            }
        }
        return this.f36704OooO0OO;
    }

    public final int OooO0OO() {
        try {
            return this.f36703OooO0O0.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f36704OooO0OO.f36708OooO0O0 = 1;
            return 0;
        }
    }

    public final void OooO0Oo() {
        int iOooO0OO = OooO0OO();
        this.f36705OooO0Oo = iOooO0OO;
        if (iOooO0OO <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f36705OooO0Oo;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f36703OooO0O0.get(this.f36702OooO00o, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbOooO00o = o00000.OooO00o("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sbOooO00o.append(this.f36705OooO0Oo);
                    Log.d("GifHeaderParser", sbOooO00o.toString(), e);
                }
                this.f36704OooO0OO.f36708OooO0O0 = 1;
                return;
            }
        }
    }

    public final int OooO0o() {
        return this.f36703OooO0O0.getShort();
    }

    @Nullable
    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f36703OooO0O0.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
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
            this.f36704OooO0OO.f36708OooO0O0 = 1;
        }
        return iArr;
    }

    public final void OooO0oO() {
        int iOooO0OO;
        do {
            iOooO0OO = OooO0OO();
            this.f36703OooO0O0.position(Math.min(this.f36703OooO0O0.position() + iOooO0OO, this.f36703OooO0O0.limit()));
        } while (iOooO0OO > 0);
    }
}
