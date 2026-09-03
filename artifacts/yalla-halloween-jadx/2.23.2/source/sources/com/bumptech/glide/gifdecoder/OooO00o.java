package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p151o00Oo0o.o0000;
import p151o00Oo0o.o0000Ooo;
import p156o00OoO00.OooO0o;
import p165o00OoOoo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements GifDecoder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte[] f13011OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @ColorInt
    public int[] f13012OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final GifDecoder.OooO00o f13014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ByteBuffer f13015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public short[] f13016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f13017OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f13018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte[] f13019OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @ColorInt
    public int[] f13020OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13021OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0000 f13022OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f13023OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Bitmap f13024OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f13025OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13026OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13027OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f13028OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Boolean f13029OooOOoo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColorInt
    public final int[] f13013OooO0O0 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f13030OooOo00 = Bitmap.Config.ARGB_8888;

    public OooO00o(@NonNull o000OOo0 o000ooo1, o0000 o0000Var, ByteBuffer byteBuffer, int i) {
        this.f13014OooO0OO = o000ooo1;
        this.f13022OooOO0o = new o0000();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f13025OooOOOO = 0;
                this.f13022OooOO0o = o0000Var;
                this.f13021OooOO0O = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f13015OooO0Oo = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f13015OooO0Oo.order(ByteOrder.LITTLE_ENDIAN);
                this.f13023OooOOO = false;
                Iterator it = o0000Var.f37767OooO0o0.iterator();
                while (it.hasNext()) {
                    if (((o0000Ooo) it.next()).f37784OooO0oO == 3) {
                        this.f13023OooOOO = true;
                        break;
                    }
                }
                this.f13026OooOOOo = iHighestOneBit;
                int i2 = o0000Var.f37766OooO0o;
                this.f13027OooOOo = i2 / iHighestOneBit;
                int i3 = o0000Var.f37768OooO0oO;
                this.f13028OooOOo0 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                OooO0o oooO0o = ((o000OOo0) this.f13014OooO0OO).f38177OooO0O0;
                this.f13011OooO = oooO0o == null ? new byte[i4] : (byte[]) oooO0o.OooO0OO(i4, byte[].class);
                GifDecoder.OooO00o oooO00o = this.f13014OooO0OO;
                int i5 = this.f13027OooOOo * this.f13028OooOOo0;
                OooO0o oooO0o2 = ((o000OOo0) oooO00o).f38177OooO0O0;
                this.f13020OooOO0 = oooO0o2 == null ? new int[i5] : (int[]) oooO0o2.OooO0OO(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f13030OooOo00 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public final synchronized Bitmap OooO00o() {
        if (this.f13022OooOO0o.f37764OooO0OO <= 0 || this.f13021OooOO0O < 0) {
            if (Log.isLoggable("OooO00o", 3)) {
                Log.d("OooO00o", "Unable to decode frame, frameCount=" + this.f13022OooOO0o.f37764OooO0OO + ", framePointer=" + this.f13021OooOO0O);
            }
            this.f13025OooOOOO = 1;
        }
        int i = this.f13025OooOOOO;
        if (i != 1 && i != 2) {
            this.f13025OooOOOO = 0;
            if (this.f13017OooO0o0 == null) {
                OooO0o oooO0o = ((o000OOo0) this.f13014OooO0OO).f38177OooO0O0;
                this.f13017OooO0o0 = oooO0o == null ? new byte[255] : (byte[]) oooO0o.OooO0OO(255, byte[].class);
            }
            o0000Ooo o0000ooo = (o0000Ooo) this.f13022OooOO0o.f37767OooO0o0.get(this.f13021OooOO0O);
            int i2 = this.f13021OooOO0O - 1;
            o0000Ooo o0000ooo2 = i2 >= 0 ? (o0000Ooo) this.f13022OooOO0o.f37767OooO0o0.get(i2) : null;
            int[] iArr = o0000ooo.f37787OooOO0O;
            if (iArr == null) {
                iArr = this.f13022OooOO0o.f37762OooO00o;
            }
            this.f13012OooO00o = iArr;
            if (iArr == null) {
                if (Log.isLoggable("OooO00o", 3)) {
                    Log.d("OooO00o", "No valid color table found for frame #" + this.f13021OooOO0O);
                }
                this.f13025OooOOOO = 1;
                return null;
            }
            if (o0000ooo.f37782OooO0o) {
                System.arraycopy(iArr, 0, this.f13013OooO0O0, 0, iArr.length);
                int[] iArr2 = this.f13013OooO0O0;
                this.f13012OooO00o = iArr2;
                iArr2[o0000ooo.f37785OooO0oo] = 0;
                if (o0000ooo.f37784OooO0oO == 2 && this.f13021OooOO0O == 0) {
                    this.f13029OooOOoo = Boolean.TRUE;
                }
            }
            return OooOO0(o0000ooo, o0000ooo2);
        }
        if (Log.isLoggable("OooO00o", 3)) {
            Log.d("OooO00o", "Unable to decode frame, status=" + this.f13025OooOOOO);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void OooO0O0() {
        this.f13021OooOO0O = (this.f13021OooOO0O + 1) % this.f13022OooOO0o.f37764OooO0OO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0OO() {
        return this.f13022OooOO0o.f37764OooO0OO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0Oo() {
        int i = this.f13022OooOO0o.f37772OooOO0o;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0o() {
        return this.f13021OooOO0O;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0o0() {
        int i;
        o0000 o0000Var = this.f13022OooOO0o;
        int i2 = o0000Var.f37764OooO0OO;
        if (i2 <= 0 || (i = this.f13021OooOO0O) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return ((o0000Ooo) o0000Var.f37767OooO0o0.get(i)).f37777OooO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0oO() {
        return (this.f13020OooOO0.length * 4) + this.f13015OooO0Oo.limit() + this.f13011OooO.length;
    }

    public final Bitmap OooO0oo() {
        Boolean bool = this.f13029OooOOoo;
        Bitmap bitmapOooO0OO = ((o000OOo0) this.f13014OooO0OO).f38176OooO00o.OooO0OO(this.f13027OooOOo, this.f13028OooOOo0, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f13030OooOo00);
        bitmapOooO0OO.setHasAlpha(true);
        return bitmapOooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v31, types: [short] */
    /* JADX WARN: Type inference failed for: r5v33 */
    public final Bitmap OooOO0(o0000Ooo o0000ooo, o0000Ooo o0000ooo2) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        int i9;
        int i10;
        Bitmap bitmap;
        int i11;
        int[] iArr = this.f13020OooOO0;
        GifDecoder.OooO00o oooO00o = this.f13014OooO0OO;
        byte b2 = 0;
        if (o0000ooo2 == null) {
            Bitmap bitmap2 = this.f13024OooOOO0;
            if (bitmap2 != null) {
                ((o000OOo0) oooO00o).f38176OooO00o.OooO0Oo(bitmap2);
            }
            this.f13024OooOOO0 = null;
            Arrays.fill(iArr, 0);
        }
        if (o0000ooo2 != null && o0000ooo2.f37784OooO0oO == 3 && this.f13024OooOOO0 == null) {
            Arrays.fill(iArr, 0);
        }
        if (o0000ooo2 != null && (i10 = o0000ooo2.f37784OooO0oO) > 0) {
            if (i10 == 2) {
                if (o0000ooo.f37782OooO0o) {
                    i11 = 0;
                } else {
                    o0000 o0000Var = this.f13022OooOO0o;
                    i11 = o0000Var.f37771OooOO0O;
                    if (o0000ooo.f37787OooOO0O != null && o0000Var.f37770OooOO0 == o0000ooo.f37785OooO0oo) {
                        i11 = 0;
                    }
                }
                int i12 = o0000ooo2.f37781OooO0Oo;
                int i13 = this.f13026OooOOOo;
                int i14 = i12 / i13;
                int i15 = o0000ooo2.f37779OooO0O0 / i13;
                int i16 = o0000ooo2.f37780OooO0OO / i13;
                int i17 = o0000ooo2.f37778OooO00o / i13;
                int i18 = this.f13027OooOOo;
                int i19 = (i15 * i18) + i17;
                int i20 = (i14 * i18) + i19;
                while (i19 < i20) {
                    int i21 = i19 + i16;
                    for (int i22 = i19; i22 < i21; i22++) {
                        iArr[i22] = i11;
                    }
                    i19 += this.f13027OooOOo;
                }
            } else if (i10 == 3 && (bitmap = this.f13024OooOOO0) != null) {
                int i23 = this.f13027OooOOo;
                bitmap.getPixels(iArr, 0, i23, 0, 0, i23, this.f13028OooOOo0);
            }
        }
        this.f13015OooO0Oo.position(o0000ooo.f37786OooOO0);
        int i24 = o0000ooo.f37780OooO0OO * o0000ooo.f37781OooO0Oo;
        byte[] bArr = this.f13011OooO;
        if (bArr == null || bArr.length < i24) {
            OooO0o oooO0o = ((o000OOo0) oooO00o).f38177OooO0O0;
            this.f13011OooO = oooO0o == null ? new byte[i24] : (byte[]) oooO0o.OooO0OO(i24, byte[].class);
        }
        byte[] bArr2 = this.f13011OooO;
        if (this.f13016OooO0o == null) {
            this.f13016OooO0o = new short[4096];
        }
        short[] sArr = this.f13016OooO0o;
        if (this.f13018OooO0oO == null) {
            this.f13018OooO0oO = new byte[4096];
        }
        byte[] bArr3 = this.f13018OooO0oO;
        if (this.f13019OooO0oo == null) {
            this.f13019OooO0oo = new byte[4097];
        }
        byte[] bArr4 = this.f13019OooO0oo;
        int i25 = this.f13015OooO0Oo.get() & UByte.MAX_VALUE;
        int i26 = 1 << i25;
        int i27 = i26 + 1;
        int i28 = i26 + 2;
        int i29 = i25 + 1;
        int i30 = (1 << i29) - 1;
        for (int i31 = 0; i31 < i26; i31++) {
            sArr[i31] = 0;
            bArr3[i31] = (byte) i31;
        }
        byte[] bArr5 = this.f13017OooO0o0;
        OooO00o oooO00o2 = this;
        int i32 = i29;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = i28;
        int i42 = i30;
        int i43 = -1;
        while (true) {
            if (i33 >= i24) {
                iArr = iArr;
                b = b2;
                break;
            }
            if (i35 == 0) {
                int i44 = this.f13015OooO0Oo.get() & UByte.MAX_VALUE;
                if (i44 > 0) {
                    ByteBuffer byteBuffer = oooO00o2.f13015OooO0Oo;
                    byteBuffer.get(oooO00o2.f13017OooO0o0, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    oooO00o2.f13025OooOOOO = 3;
                    b = 0;
                    break;
                }
                i35 = i44;
                i36 = 0;
            } else {
                i29 = i29;
                i33 = i33;
                iArr = iArr;
                i43 = i43;
            }
            i38 += (bArr5[i36] & UByte.MAX_VALUE) << i37;
            i36++;
            i35--;
            int i45 = i37 + 8;
            int i46 = i41;
            int i47 = i32;
            i33 = i33;
            i43 = i43;
            byte[] bArr6 = bArr5;
            i39 = i39;
            while (true) {
                if (i45 < i47) {
                    oooO00o2 = this;
                    break;
                }
                OooO00o oooO00o3 = oooO00o2;
                int i48 = i38 & i42;
                i38 >>= i47;
                i45 -= i47;
                if (i48 == i26) {
                    i46 = i28;
                    i42 = i30;
                    oooO00o2 = oooO00o3;
                    i47 = i29;
                    i43 = -1;
                } else {
                    if (i48 == i27) {
                        oooO00o2 = oooO00o3;
                        break;
                    }
                    if (i43 == -1) {
                        bArr2[i34] = bArr3[i48];
                        i34++;
                        i33++;
                        i9 = i48;
                    } else {
                        if (i48 >= i46) {
                            bArr4[i40] = (byte) i39;
                            i40++;
                            s = i43;
                        } else {
                            s = i48;
                        }
                        while (s >= i26) {
                            bArr4[i40] = bArr3[s];
                            i40++;
                            s = sArr[s];
                        }
                        int i49 = bArr3[s] & UByte.MAX_VALUE;
                        byte b3 = (byte) i49;
                        bArr2[i34] = b3;
                        while (true) {
                            i34++;
                            i33++;
                            if (i40 <= 0) {
                                break;
                            }
                            i40--;
                            bArr2[i34] = bArr4[i40];
                        }
                        i9 = i49;
                        if (i46 < 4096) {
                            sArr[i46] = (short) i43;
                            bArr3[i46] = b3;
                            i46++;
                            if ((i46 & i42) == 0 && i46 < 4096) {
                                i47++;
                                i42 += i46;
                            }
                        }
                    }
                    i43 = i48;
                    i39 = i9;
                    i45 = i45;
                    oooO00o2 = this;
                }
            }
            i32 = i47;
            i41 = i46;
            bArr5 = bArr6;
            i29 = i29;
            b2 = 0;
            i37 = i45;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i34, i24, b);
        if (o0000ooo.f37783OooO0o0 || this.f13026OooOOOo != 1) {
            int[] iArr2 = this.f13020OooOO0;
            int i50 = o0000ooo.f37781OooO0Oo;
            int i51 = this.f13026OooOOOo;
            int i52 = i50 / i51;
            int i53 = o0000ooo.f37779OooO0O0 / i51;
            int i54 = o0000ooo.f37780OooO0OO / i51;
            int i55 = o0000ooo.f37778OooO00o / i51;
            boolean z = this.f13021OooOO0O == 0;
            int i56 = this.f13027OooOOo;
            int i57 = this.f13028OooOOo0;
            byte[] bArr7 = this.f13011OooO;
            int[] iArr3 = this.f13012OooO00o;
            Boolean bool = this.f13029OooOOoo;
            int i58 = 8;
            int i59 = 0;
            int i60 = 0;
            int i61 = 1;
            while (i59 < i52) {
                Boolean bool2 = bool;
                if (o0000ooo.f37783OooO0o0) {
                    if (i60 >= i52) {
                        int i62 = i61 + 1;
                        i = i52;
                        if (i62 == 2) {
                            i60 = 4;
                        } else if (i62 == 3) {
                            i58 = 4;
                            i61 = i62;
                            i60 = 2;
                        } else if (i62 == 4) {
                            i61 = i62;
                            i60 = 1;
                            i58 = 2;
                        }
                        i61 = i62;
                    } else {
                        i = i52;
                    }
                    i2 = i60 + i58;
                } else {
                    i = i52;
                    i2 = i60;
                    i60 = i59;
                }
                int i63 = i60 + i53;
                boolean z2 = i51 == 1;
                if (i63 < i57) {
                    int i64 = i63 * i56;
                    int i65 = i64 + i55;
                    int i66 = i65 + i54;
                    int i67 = i64 + i56;
                    if (i67 < i66) {
                        i66 = i67;
                    }
                    int i68 = i59 * i51 * o0000ooo.f37780OooO0OO;
                    if (z2) {
                        bool = bool2;
                        int i69 = i65;
                        while (true) {
                            i3 = i54;
                            if (i69 >= i66) {
                                break;
                            }
                            int i70 = iArr3[bArr7[i68] & UByte.MAX_VALUE];
                            if (i70 != 0) {
                                iArr2[i69] = i70;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i68 += i51;
                            i69++;
                            i54 = i3;
                        }
                    } else {
                        i3 = i54;
                        int i71 = ((i66 - i65) * i51) + i68;
                        bool = bool2;
                        int i72 = i65;
                        while (i72 < i66) {
                            int i73 = i66;
                            int i74 = o0000ooo.f37780OooO0OO;
                            int i75 = i55;
                            int i76 = i56;
                            int i77 = i68;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            while (true) {
                                if (i77 >= this.f13026OooOOOo + i68) {
                                    i7 = i57;
                                    break;
                                }
                                byte[] bArr8 = this.f13011OooO;
                                i7 = i57;
                                if (i77 >= bArr8.length || i77 >= i71) {
                                    break;
                                }
                                int i83 = this.f13012OooO00o[bArr8[i77] & UByte.MAX_VALUE];
                                if (i83 != 0) {
                                    i78 += (i83 >> 24) & 255;
                                    i79 += (i83 >> 16) & 255;
                                    i80 += (i83 >> 8) & 255;
                                    i81 += i83 & 255;
                                    i82++;
                                }
                                i77++;
                                i57 = i7;
                            }
                            int i84 = i74 + i68;
                            for (int i85 = i84; i85 < this.f13026OooOOOo + i84; i85++) {
                                byte[] bArr9 = this.f13011OooO;
                                if (i85 >= bArr9.length || i85 >= i71) {
                                    break;
                                }
                                int i86 = this.f13012OooO00o[bArr9[i85] & UByte.MAX_VALUE];
                                if (i86 != 0) {
                                    i78 += (i86 >> 24) & 255;
                                    i79 += (i86 >> 16) & 255;
                                    i80 += (i86 >> 8) & 255;
                                    i81 += i86 & 255;
                                    i82++;
                                }
                            }
                            int i87 = i82 == 0 ? 0 : ((i78 / i82) << 24) | ((i79 / i82) << 16) | ((i80 / i82) << 8) | (i81 / i82);
                            if (i87 != 0) {
                                iArr2[i72] = i87;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i68 += i51;
                            i72++;
                            i66 = i73;
                            i55 = i75;
                            i56 = i76;
                            i57 = i7;
                        }
                    }
                    i4 = i55;
                    i5 = i56;
                    i6 = i57;
                } else {
                    i3 = i54;
                    i4 = i55;
                    i5 = i56;
                    i6 = i57;
                    bool = bool2;
                }
                i59++;
                i52 = i;
                i60 = i2;
                i53 = i53;
                i54 = i3;
                i55 = i4;
                i56 = i5;
                i57 = i6;
            }
            Boolean bool3 = bool;
            if (this.f13029OooOOoo == null) {
                this.f13029OooOOoo = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.f13020OooOO0;
            int i88 = o0000ooo.f37781OooO0Oo;
            int i89 = o0000ooo.f37779OooO0O0;
            int i90 = o0000ooo.f37780OooO0OO;
            int i91 = o0000ooo.f37778OooO00o;
            byte b4 = this.f13021OooOO0O == 0 ? (byte) 1 : b;
            int i92 = this.f13027OooOOo;
            byte[] bArr10 = this.f13011OooO;
            int[] iArr5 = this.f13012OooO00o;
            byte b5 = -1;
            for (int i93 = b; i93 < i88; i93++) {
                int i94 = (i93 + i89) * i92;
                int i95 = i94 + i91;
                int i96 = i95 + i90;
                int i97 = i94 + i92;
                if (i97 < i96) {
                    i96 = i97;
                }
                int i98 = o0000ooo.f37780OooO0OO * i93;
                while (i95 < i96) {
                    int i99 = i88;
                    byte b6 = bArr10[i98];
                    int i100 = i89;
                    int i101 = b6 & UByte.MAX_VALUE;
                    if (i101 != b5) {
                        int i102 = iArr5[i101];
                        if (i102 != 0) {
                            iArr4[i95] = i102;
                        } else {
                            b5 = b6;
                        }
                    }
                    i98++;
                    i95++;
                    i88 = i99;
                    i89 = i100;
                }
            }
            Boolean bool4 = this.f13029OooOOoo;
            this.f13029OooOOoo = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.f13029OooOOoo != null || b4 == 0 || b5 == -1));
        }
        if (this.f13023OooOOO && ((i8 = o0000ooo.f37784OooO0oO) == 0 || i8 == 1)) {
            if (this.f13024OooOOO0 == null) {
                this.f13024OooOOO0 = OooO0oo();
            }
            Bitmap bitmap3 = this.f13024OooOOO0;
            int i103 = this.f13027OooOOo;
            bitmap3.setPixels(iArr, 0, i103, 0, 0, i103, this.f13028OooOOo0);
        }
        Bitmap bitmapOooO0oo = OooO0oo();
        int i104 = this.f13027OooOOo;
        bitmapOooO0oo.setPixels(iArr, 0, i104, 0, 0, i104, this.f13028OooOOo0);
        return bitmapOooO0oo;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void clear() {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        OooO0o oooO0o3;
        this.f13022OooOO0o = null;
        byte[] bArr = this.f13011OooO;
        GifDecoder.OooO00o oooO00o = this.f13014OooO0OO;
        if (bArr != null && (oooO0o3 = ((o000OOo0) oooO00o).f38177OooO0O0) != null) {
            oooO0o3.put(bArr);
        }
        int[] iArr = this.f13020OooOO0;
        if (iArr != null && (oooO0o2 = ((o000OOo0) oooO00o).f38177OooO0O0) != null) {
            oooO0o2.put(iArr);
        }
        Bitmap bitmap = this.f13024OooOOO0;
        if (bitmap != null) {
            ((o000OOo0) oooO00o).f38176OooO00o.OooO0Oo(bitmap);
        }
        this.f13024OooOOO0 = null;
        this.f13015OooO0Oo = null;
        this.f13029OooOOoo = null;
        byte[] bArr2 = this.f13017OooO0o0;
        if (bArr2 == null || (oooO0o = ((o000OOo0) oooO00o).f38177OooO0O0) == null) {
            return;
        }
        oooO0o.put(bArr2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public final ByteBuffer getData() {
        return this.f13015OooO0Oo;
    }
}
