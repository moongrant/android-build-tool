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
import kotlin.KotlinVersion;
import kotlin.UByte;
import p215o00oO000.OooO;
import p215o00oO000.OooO0o;
import p219o00oO0O0.o0O00o0;
import p238o00oOooO.oOOOoo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements GifDecoder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte[] f12437OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @ColorInt
    public int[] f12438OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final GifDecoder.OooO00o f12440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ByteBuffer f12441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public short[] f12442OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f12443OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f12444OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte[] f12445OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @ColorInt
    public int[] f12446OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12447OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO f12448OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f12449OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Bitmap f12450OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f12451OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f12452OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f12453OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f12454OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Boolean f12455OooOOoo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColorInt
    public final int[] f12439OooO0O0 = new int[256];

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f12456OooOo00 = Bitmap.Config.ARGB_8888;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<o00oO000.OooO0o>] */
    public OooO00o(@NonNull GifDecoder.OooO00o oooO00o, OooO oooO, ByteBuffer byteBuffer, int i) {
        this.f12440OooO0OO = oooO00o;
        this.f12448OooOO0o = new OooO();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f12451OooOOOO = 0;
                this.f12448OooOO0o = oooO;
                this.f12447OooOO0O = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f12441OooO0Oo = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f12441OooO0Oo.order(ByteOrder.LITTLE_ENDIAN);
                this.f12449OooOOO = false;
                Iterator it = oooO.f33603OooO0o0.iterator();
                while (it.hasNext()) {
                    if (((OooO0o) it.next()).f33616OooO0oO == 3) {
                        this.f12449OooOOO = true;
                        break;
                    }
                }
                this.f12452OooOOOo = iHighestOneBit;
                int i2 = oooO.f33602OooO0o;
                this.f12453OooOOo = i2 / iHighestOneBit;
                int i3 = oooO.f33604OooO0oO;
                this.f12454OooOOo0 = i3 / iHighestOneBit;
                this.f12437OooO = ((oOOOoo00) this.f12440OooO0OO).OooO00o(i2 * i3);
                GifDecoder.OooO00o oooO00o2 = this.f12440OooO0OO;
                int i4 = this.f12453OooOOo * this.f12454OooOOo0;
                o0O00o0 o0o00o1 = ((oOOOoo00) oooO00o2).f34083OooO0O0;
                this.f12446OooOO0 = o0o00o1 == null ? new int[i4] : (int[]) o0o00o1.OooO0oO(i4, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap OooO() {
        Boolean bool = this.f12455OooOOoo;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f12456OooOo00;
        Bitmap bitmapOooO0Oo = ((oOOOoo00) this.f12440OooO0OO).f34082OooO00o.OooO0Oo(this.f12453OooOOo, this.f12454OooOOo0, config);
        bitmapOooO0Oo.setHasAlpha(true);
        return bitmapOooO0Oo;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<o00oO000.OooO0o>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<o00oO000.OooO0o>] */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public final synchronized Bitmap OooO00o() {
        if (this.f12448OooOO0o.f33600OooO0OO <= 0 || this.f12447OooOO0O < 0) {
            if (Log.isLoggable("OooO00o", 3)) {
                Log.d("OooO00o", "Unable to decode frame, frameCount=" + this.f12448OooOO0o.f33600OooO0OO + ", framePointer=" + this.f12447OooOO0O);
            }
            this.f12451OooOOOO = 1;
        }
        int i = this.f12451OooOOOO;
        if (i != 1 && i != 2) {
            this.f12451OooOOOO = 0;
            if (this.f12443OooO0o0 == null) {
                this.f12443OooO0o0 = ((oOOOoo00) this.f12440OooO0OO).OooO00o(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            OooO0o oooO0o = (OooO0o) this.f12448OooOO0o.f33603OooO0o0.get(this.f12447OooOO0O);
            int i2 = this.f12447OooOO0O - 1;
            OooO0o oooO0o2 = i2 >= 0 ? (OooO0o) this.f12448OooOO0o.f33603OooO0o0.get(i2) : null;
            int[] iArr = oooO0o.f33619OooOO0O;
            if (iArr == null) {
                iArr = this.f12448OooOO0o.f33598OooO00o;
            }
            this.f12438OooO00o = iArr;
            if (iArr == null) {
                if (Log.isLoggable("OooO00o", 3)) {
                    Log.d("OooO00o", "No valid color table found for frame #" + this.f12447OooOO0O);
                }
                this.f12451OooOOOO = 1;
                return null;
            }
            if (oooO0o.f33614OooO0o) {
                System.arraycopy(iArr, 0, this.f12439OooO0O0, 0, iArr.length);
                int[] iArr2 = this.f12439OooO0O0;
                this.f12438OooO00o = iArr2;
                iArr2[oooO0o.f33617OooO0oo] = 0;
                if (oooO0o.f33616OooO0oO == 2 && this.f12447OooOO0O == 0) {
                    this.f12455OooOOoo = Boolean.TRUE;
                }
            }
            return OooOO0O(oooO0o, oooO0o2);
        }
        if (Log.isLoggable("OooO00o", 3)) {
            Log.d("OooO00o", "Unable to decode frame, status=" + this.f12451OooOOOO);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void OooO0O0() {
        this.f12447OooOO0O = (this.f12447OooOO0O + 1) % this.f12448OooOO0o.f33600OooO0OO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0OO() {
        return this.f12448OooOO0o.f33600OooO0OO;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o00oO000.OooO0o>] */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0Oo() {
        int i;
        OooO oooO = this.f12448OooOO0o;
        int i2 = oooO.f33600OooO0OO;
        if (i2 <= 0 || (i = this.f12447OooOO0O) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return ((OooO0o) oooO.f33603OooO0o0.get(i)).f33609OooO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0o() {
        return this.f12447OooOO0O;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public final ByteBuffer OooO0o0() {
        return this.f12441OooO0Oo;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0oO() {
        return (this.f12446OooOO0.length * 4) + this.f12441OooO0Oo.limit() + this.f12437OooO.length;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int OooO0oo() {
        int i = this.f12448OooOO0o.f33608OooOO0o;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public final void OooOO0(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f12456OooOo00 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30, types: [short] */
    /* JADX WARN: Type inference failed for: r5v32 */
    public final Bitmap OooOO0O(OooO0o oooO0o, OooO0o oooO0o2) {
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
        int[] iArr = this.f12446OooOO0;
        if (oooO0o2 == null) {
            Bitmap bitmap2 = this.f12450OooOOO0;
            if (bitmap2 != null) {
                ((oOOOoo00) this.f12440OooO0OO).f34082OooO00o.OooO0O0(bitmap2);
            }
            this.f12450OooOOO0 = null;
            Arrays.fill(iArr, 0);
        }
        if (oooO0o2 != null && oooO0o2.f33616OooO0oO == 3 && this.f12450OooOOO0 == null) {
            Arrays.fill(iArr, 0);
        }
        if (oooO0o2 != null && (i10 = oooO0o2.f33616OooO0oO) > 0) {
            if (i10 == 2) {
                if (oooO0o.f33614OooO0o) {
                    i11 = 0;
                } else {
                    OooO oooO = this.f12448OooOO0o;
                    i11 = oooO.f33607OooOO0O;
                    if (oooO0o.f33619OooOO0O != null && oooO.f33606OooOO0 == oooO0o.f33617OooO0oo) {
                        i11 = 0;
                    }
                }
                int i12 = oooO0o2.f33613OooO0Oo;
                int i13 = this.f12452OooOOOo;
                int i14 = i12 / i13;
                int i15 = oooO0o2.f33611OooO0O0 / i13;
                int i16 = oooO0o2.f33612OooO0OO / i13;
                int i17 = oooO0o2.f33610OooO00o / i13;
                int i18 = this.f12453OooOOo;
                int i19 = (i15 * i18) + i17;
                int i20 = (i14 * i18) + i19;
                while (i19 < i20) {
                    int i21 = i19 + i16;
                    for (int i22 = i19; i22 < i21; i22++) {
                        iArr[i22] = i11;
                    }
                    i19 += this.f12453OooOOo;
                }
            } else if (i10 == 3 && (bitmap = this.f12450OooOOO0) != null) {
                int i23 = this.f12453OooOOo;
                bitmap.getPixels(iArr, 0, i23, 0, 0, i23, this.f12454OooOOo0);
            }
        }
        this.f12441OooO0Oo.position(oooO0o.f33618OooOO0);
        int i24 = oooO0o.f33612OooO0OO * oooO0o.f33613OooO0Oo;
        byte[] bArr = this.f12437OooO;
        if (bArr == null || bArr.length < i24) {
            this.f12437OooO = ((oOOOoo00) this.f12440OooO0OO).OooO00o(i24);
        }
        byte[] bArr2 = this.f12437OooO;
        if (this.f12442OooO0o == null) {
            this.f12442OooO0o = new short[4096];
        }
        short[] sArr = this.f12442OooO0o;
        if (this.f12444OooO0oO == null) {
            this.f12444OooO0oO = new byte[4096];
        }
        byte[] bArr3 = this.f12444OooO0oO;
        if (this.f12445OooO0oo == null) {
            this.f12445OooO0oo = new byte[4097];
        }
        byte[] bArr4 = this.f12445OooO0oo;
        int i25 = this.f12441OooO0Oo.get() & UByte.MAX_VALUE;
        int i26 = 1 << i25;
        int i27 = i26 + 1;
        int i28 = i26 + 2;
        int i29 = i25 + 1;
        int i30 = (1 << i29) - 1;
        for (int i31 = 0; i31 < i26; i31++) {
            sArr[i31] = 0;
            bArr3[i31] = (byte) i31;
        }
        byte[] bArr5 = this.f12443OooO0o0;
        OooO00o oooO00o = this;
        int i32 = i29;
        int i33 = i28;
        int i34 = i30;
        int i35 = 0;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (true) {
            if (i35 >= i24) {
                iArr = iArr;
                break;
            }
            if (i37 == 0) {
                int i44 = oooO00o.f12441OooO0Oo.get() & UByte.MAX_VALUE;
                if (i44 > 0) {
                    ByteBuffer byteBuffer = oooO00o.f12441OooO0Oo;
                    byteBuffer.get(oooO00o.f12443OooO0o0, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    oooO00o.f12451OooOOOO = 3;
                    break;
                }
                i37 = i44;
                i38 = 0;
            } else {
                i29 = i29;
                i35 = i35;
                iArr = iArr;
                i36 = i36;
            }
            i40 += (bArr5[i38] & UByte.MAX_VALUE) << i39;
            i38++;
            i37--;
            int i45 = i39 + 8;
            int i46 = i33;
            int i47 = i32;
            i35 = i35;
            i36 = i36;
            byte[] bArr6 = bArr5;
            int i48 = i41;
            while (true) {
                if (i45 < i47) {
                    oooO00o = this;
                    break;
                }
                OooO00o oooO00o2 = oooO00o;
                int i49 = i40 & i34;
                i40 >>= i47;
                i45 -= i47;
                if (i49 == i26) {
                    i46 = i28;
                    i34 = i30;
                    oooO00o = oooO00o2;
                    i47 = i29;
                    i36 = -1;
                    i9 = i48;
                } else {
                    if (i49 == i27) {
                        oooO00o = oooO00o2;
                        break;
                    }
                    if (i36 == -1) {
                        bArr2[i42] = bArr3[i49];
                        i42++;
                        i35++;
                        i9 = i49;
                    } else {
                        if (i49 >= i46) {
                            bArr4[i43] = (byte) i48;
                            i43++;
                            s = i36;
                        } else {
                            s = i49;
                        }
                        while (s >= i26) {
                            bArr4[i43] = bArr3[s];
                            i43++;
                            s = sArr[s];
                        }
                        int i50 = bArr3[s] & UByte.MAX_VALUE;
                        byte b = (byte) i50;
                        bArr2[i42] = b;
                        while (true) {
                            i42++;
                            i35++;
                            if (i43 <= 0) {
                                break;
                            }
                            i43--;
                            bArr2[i42] = bArr4[i43];
                        }
                        i9 = i50;
                        if (i46 < 4096) {
                            sArr[i46] = (short) i36;
                            bArr3[i46] = b;
                            i46++;
                            if ((i46 & i34) == 0 && i46 < 4096) {
                                i47++;
                                i34 += i46;
                            }
                        }
                    }
                    i36 = i49;
                    oooO00o = this;
                }
                i48 = i9;
                i45 = i45;
            }
            i32 = i47;
            bArr5 = bArr6;
            i41 = i48;
            i29 = i29;
            i39 = i45;
            i33 = i46;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i42, i24, (byte) 0);
        if (oooO0o.f33615OooO0o0 || this.f12452OooOOOo != 1) {
            int[] iArr2 = this.f12446OooOO0;
            int i51 = oooO0o.f33613OooO0Oo;
            int i52 = this.f12452OooOOOo;
            int i53 = i51 / i52;
            int i54 = oooO0o.f33611OooO0O0 / i52;
            int i55 = oooO0o.f33612OooO0OO / i52;
            int i56 = oooO0o.f33610OooO00o / i52;
            boolean z = this.f12447OooOO0O == 0;
            int i57 = this.f12453OooOOo;
            int i58 = this.f12454OooOOo0;
            byte[] bArr7 = this.f12437OooO;
            int[] iArr3 = this.f12438OooO00o;
            Boolean bool = this.f12455OooOOoo;
            int i59 = 0;
            int i60 = 0;
            int i61 = 1;
            int i62 = 8;
            while (i59 < i53) {
                Boolean bool2 = bool;
                if (oooO0o.f33615OooO0o0) {
                    if (i60 >= i53) {
                        int i63 = i61 + 1;
                        i = i53;
                        if (i63 == 2) {
                            i61 = i63;
                            i60 = 4;
                        } else if (i63 != 3) {
                            i61 = i63;
                            if (i63 == 4) {
                                i60 = 1;
                                i62 = 2;
                            }
                        } else {
                            i61 = i63;
                            i60 = 2;
                            i62 = 4;
                        }
                    } else {
                        i = i53;
                    }
                    i2 = i60 + i62;
                } else {
                    i = i53;
                    i2 = i60;
                    i60 = i59;
                }
                int i64 = i60 + i54;
                boolean z2 = i52 == 1;
                if (i64 < i58) {
                    int i65 = i64 * i57;
                    int i66 = i65 + i56;
                    int i67 = i66 + i55;
                    int i68 = i65 + i57;
                    if (i68 < i67) {
                        i67 = i68;
                    }
                    int i69 = i59 * i52 * oooO0o.f33612OooO0OO;
                    if (z2) {
                        bool = bool2;
                        int i70 = i66;
                        while (true) {
                            i3 = i55;
                            if (i70 >= i67) {
                                break;
                            }
                            int i71 = iArr3[bArr7[i69] & UByte.MAX_VALUE];
                            if (i71 != 0) {
                                iArr2[i70] = i71;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i52;
                            i70++;
                            i55 = i3;
                        }
                    } else {
                        i3 = i55;
                        int i72 = ((i67 - i66) * i52) + i69;
                        bool = bool2;
                        int i73 = i66;
                        while (i73 < i67) {
                            int i74 = i67;
                            int i75 = oooO0o.f33612OooO0OO;
                            int i76 = i56;
                            int i77 = i57;
                            int i78 = i69;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (true) {
                                if (i78 >= this.f12452OooOOOo + i69) {
                                    i7 = i58;
                                    break;
                                }
                                byte[] bArr8 = this.f12437OooO;
                                i7 = i58;
                                if (i78 >= bArr8.length || i78 >= i72) {
                                    break;
                                }
                                int i84 = this.f12438OooO00o[bArr8[i78] & UByte.MAX_VALUE];
                                if (i84 != 0) {
                                    i79 += (i84 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i80 += (i84 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i81 += (i84 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i82 += i84 & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i83++;
                                }
                                i78++;
                                i58 = i7;
                            }
                            int i85 = i75 + i69;
                            for (int i86 = i85; i86 < this.f12452OooOOOo + i85; i86++) {
                                byte[] bArr9 = this.f12437OooO;
                                if (i86 >= bArr9.length || i86 >= i72) {
                                    break;
                                }
                                int i87 = this.f12438OooO00o[bArr9[i86] & UByte.MAX_VALUE];
                                if (i87 != 0) {
                                    i79 += (i87 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i80 += (i87 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i81 += (i87 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i82 += i87 & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i83++;
                                }
                            }
                            int i88 = i83 == 0 ? 0 : ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                            if (i88 != 0) {
                                iArr2[i73] = i88;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i52;
                            i73++;
                            i67 = i74;
                            i56 = i76;
                            i57 = i77;
                            i58 = i7;
                        }
                    }
                    i4 = i56;
                    i5 = i57;
                    i6 = i58;
                } else {
                    i3 = i55;
                    i4 = i56;
                    i5 = i57;
                    i6 = i58;
                    bool = bool2;
                }
                i59++;
                i53 = i;
                i60 = i2;
                i54 = i54;
                i55 = i3;
                i56 = i4;
                i57 = i5;
                i58 = i6;
            }
            Boolean bool3 = bool;
            if (this.f12455OooOOoo == null) {
                this.f12455OooOOoo = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.f12446OooOO0;
            int i89 = oooO0o.f33613OooO0Oo;
            int i90 = oooO0o.f33611OooO0O0;
            int i91 = oooO0o.f33612OooO0OO;
            int i92 = oooO0o.f33610OooO00o;
            boolean z3 = this.f12447OooOO0O == 0;
            int i93 = this.f12453OooOOo;
            byte[] bArr10 = this.f12437OooO;
            int[] iArr5 = this.f12438OooO00o;
            byte b2 = -1;
            for (int i94 = 0; i94 < i89; i94++) {
                int i95 = (i94 + i90) * i93;
                int i96 = i95 + i92;
                int i97 = i96 + i91;
                int i98 = i95 + i93;
                if (i98 < i97) {
                    i97 = i98;
                }
                int i99 = oooO0o.f33612OooO0OO * i94;
                while (i96 < i97) {
                    int i100 = i89;
                    byte b3 = bArr10[i99];
                    int i101 = i90;
                    int i102 = b3 & UByte.MAX_VALUE;
                    if (i102 != b2) {
                        int i103 = iArr5[i102];
                        if (i103 != 0) {
                            iArr4[i96] = i103;
                        } else {
                            b2 = b3;
                        }
                    }
                    i99++;
                    i96++;
                    i89 = i100;
                    i90 = i101;
                }
            }
            Boolean bool4 = this.f12455OooOOoo;
            this.f12455OooOOoo = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || (this.f12455OooOOoo == null && z3 && b2 != -1));
        }
        if (this.f12449OooOOO && ((i8 = oooO0o.f33616OooO0oO) == 0 || i8 == 1)) {
            if (this.f12450OooOOO0 == null) {
                this.f12450OooOOO0 = OooO();
            }
            Bitmap bitmap3 = this.f12450OooOOO0;
            int i104 = this.f12453OooOOo;
            bitmap3.setPixels(iArr, 0, i104, 0, 0, i104, this.f12454OooOOo0);
        }
        Bitmap bitmapOooO = OooO();
        int i105 = this.f12453OooOOo;
        bitmapOooO.setPixels(iArr, 0, i105, 0, 0, i105, this.f12454OooOOo0);
        return bitmapOooO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void clear() {
        o0O00o0 o0o00o1;
        o0O00o0 o0o00o2;
        o0O00o0 o0o00o3;
        this.f12448OooOO0o = null;
        byte[] bArr = this.f12437OooO;
        if (bArr != null && (o0o00o3 = ((oOOOoo00) this.f12440OooO0OO).f34083OooO0O0) != null) {
            o0o00o3.OooO0o(bArr);
        }
        int[] iArr = this.f12446OooOO0;
        if (iArr != null && (o0o00o2 = ((oOOOoo00) this.f12440OooO0OO).f34083OooO0O0) != null) {
            o0o00o2.OooO0o(iArr);
        }
        Bitmap bitmap = this.f12450OooOOO0;
        if (bitmap != null) {
            ((oOOOoo00) this.f12440OooO0OO).f34082OooO00o.OooO0O0(bitmap);
        }
        this.f12450OooOOO0 = null;
        this.f12441OooO0Oo = null;
        this.f12455OooOOoo = null;
        byte[] bArr2 = this.f12443OooO0o0;
        if (bArr2 == null || (o0o00o1 = ((oOOOoo00) this.f12440OooO0OO).f34083OooO0O0) == null) {
            return;
        }
        o0o00o1.OooO0o(bArr2);
    }
}
