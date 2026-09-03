package p151o00Oo0o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f37774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000 f37775OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f37773OooO00o = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37776OooO0Oo = 0;

    public final boolean OooO00o() {
        return this.f37775OooO0OO.f37763OooO0O0 != 0;
    }

    @NonNull
    public final o0000 OooO0O0() {
        byte[] bArr;
        if (this.f37774OooO0O0 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (OooO00o()) {
            return this.f37775OooO0OO;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO0OO());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f37775OooO0OO.f37766OooO0o = OooO0o();
            this.f37775OooO0OO.f37768OooO0oO = OooO0o();
            int iOooO0OO = OooO0OO();
            o0000 o0000Var = this.f37775OooO0OO;
            o0000Var.f37769OooO0oo = (iOooO0OO & 128) != 0;
            o0000Var.f37761OooO = (int) Math.pow(2.0d, (iOooO0OO & 7) + 1);
            this.f37775OooO0OO.f37770OooOO0 = OooO0OO();
            o0000 o0000Var2 = this.f37775OooO0OO;
            OooO0OO();
            o0000Var2.getClass();
            if (this.f37775OooO0OO.f37769OooO0oo && !OooO00o()) {
                o0000 o0000Var3 = this.f37775OooO0OO;
                o0000Var3.f37762OooO00o = OooO0o0(o0000Var3.f37761OooO);
                o0000 o0000Var4 = this.f37775OooO0OO;
                o0000Var4.f37771OooOO0O = o0000Var4.f37762OooO00o[o0000Var4.f37770OooOO0];
            }
        } else {
            this.f37775OooO0OO.f37763OooO0O0 = 1;
        }
        if (!OooO00o()) {
            boolean z = false;
            while (!z && !OooO00o() && this.f37775OooO0OO.f37764OooO0OO <= Integer.MAX_VALUE) {
                int iOooO0OO2 = OooO0OO();
                if (iOooO0OO2 == 33) {
                    int iOooO0OO3 = OooO0OO();
                    if (iOooO0OO3 == 1) {
                        OooO0oO();
                    } else if (iOooO0OO3 == 249) {
                        this.f37775OooO0OO.f37765OooO0Oo = new o0000Ooo();
                        OooO0OO();
                        int iOooO0OO4 = OooO0OO();
                        o0000Ooo o0000ooo = this.f37775OooO0OO.f37765OooO0Oo;
                        int i2 = (iOooO0OO4 & 28) >> 2;
                        o0000ooo.f37784OooO0oO = i2;
                        if (i2 == 0) {
                            o0000ooo.f37784OooO0oO = 1;
                        }
                        o0000ooo.f37782OooO0o = (iOooO0OO4 & 1) != 0;
                        int iOooO0o = OooO0o();
                        if (iOooO0o < 2) {
                            iOooO0o = 10;
                        }
                        o0000Ooo o0000ooo2 = this.f37775OooO0OO.f37765OooO0Oo;
                        o0000ooo2.f37777OooO = iOooO0o * 10;
                        o0000ooo2.f37785OooO0oo = OooO0OO();
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
                            bArr = this.f37773OooO00o;
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
                                    this.f37775OooO0OO.f37772OooOO0o = (bArr[1] & UByte.MAX_VALUE) | ((bArr[2] & UByte.MAX_VALUE) << 8);
                                }
                                if (this.f37776OooO0Oo <= 0) {
                                    break;
                                }
                            } while (!OooO00o());
                        } else {
                            OooO0oO();
                        }
                    }
                } else if (iOooO0OO2 == 44) {
                    o0000 o0000Var5 = this.f37775OooO0OO;
                    if (o0000Var5.f37765OooO0Oo == null) {
                        o0000Var5.f37765OooO0Oo = new o0000Ooo();
                    }
                    this.f37775OooO0OO.f37765OooO0Oo.f37778OooO00o = OooO0o();
                    this.f37775OooO0OO.f37765OooO0Oo.f37779OooO0O0 = OooO0o();
                    this.f37775OooO0OO.f37765OooO0Oo.f37780OooO0OO = OooO0o();
                    this.f37775OooO0OO.f37765OooO0Oo.f37781OooO0Oo = OooO0o();
                    int iOooO0OO5 = OooO0OO();
                    boolean z2 = (iOooO0OO5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iOooO0OO5 & 7) + 1);
                    o0000Ooo o0000ooo3 = this.f37775OooO0OO.f37765OooO0Oo;
                    o0000ooo3.f37783OooO0o0 = (iOooO0OO5 & 64) != 0;
                    if (z2) {
                        o0000ooo3.f37787OooOO0O = OooO0o0(iPow);
                    } else {
                        o0000ooo3.f37787OooOO0O = null;
                    }
                    this.f37775OooO0OO.f37765OooO0Oo.f37786OooOO0 = this.f37774OooO0O0.position();
                    OooO0OO();
                    OooO0oO();
                    if (!OooO00o()) {
                        o0000 o0000Var6 = this.f37775OooO0OO;
                        o0000Var6.f37764OooO0OO++;
                        o0000Var6.f37767OooO0o0.add(o0000Var6.f37765OooO0Oo);
                    }
                } else if (iOooO0OO2 != 59) {
                    this.f37775OooO0OO.f37763OooO0O0 = 1;
                } else {
                    z = true;
                }
            }
            o0000 o0000Var7 = this.f37775OooO0OO;
            if (o0000Var7.f37764OooO0OO < 0) {
                o0000Var7.f37763OooO0O0 = 1;
            }
        }
        return this.f37775OooO0OO;
    }

    public final int OooO0OO() {
        try {
            return this.f37774OooO0O0.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f37775OooO0OO.f37763OooO0O0 = 1;
            return 0;
        }
    }

    public final void OooO0Oo() {
        int iOooO0OO = OooO0OO();
        this.f37776OooO0Oo = iOooO0OO;
        if (iOooO0OO <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f37776OooO0Oo;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f37774OooO0O0.get(this.f37773OooO00o, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbOooO00o = o00000.OooO00o("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sbOooO00o.append(this.f37776OooO0Oo);
                    Log.d("GifHeaderParser", sbOooO00o.toString(), e);
                }
                this.f37775OooO0OO.f37763OooO0O0 = 1;
                return;
            }
        }
    }

    public final int OooO0o() {
        return this.f37774OooO0O0.getShort();
    }

    @Nullable
    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f37774OooO0O0.get(bArr);
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
            this.f37775OooO0OO.f37763OooO0O0 = 1;
        }
        return iArr;
    }

    public final void OooO0oO() {
        int iOooO0OO;
        do {
            iOooO0OO = OooO0OO();
            this.f37774OooO0O0.position(Math.min(this.f37774OooO0O0.position() + iOooO0OO, this.f37774OooO0O0.limit()));
        } while (iOooO0OO > 0);
    }
}
