package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p420o0Oo0ooO.oO00OOo0;
import p420o0Oo0ooO.oO00o00;
import p420o0Oo0ooO.oO00o000;
import p420o0Oo0ooO.oO00o00O;
import p420o0Oo0ooO.oOOoOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final oO00OOo0 f19708Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f19709Oooo0o = f19705Oooooo.incrementAndGet();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Picasso f19710Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final com.squareup.picasso.OooOO0 f19711Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f19712OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f19713OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final oO00o00 f19714OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Oooo0 f19715OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f19716OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public com.squareup.picasso.OooO00o f19717OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public List<com.squareup.picasso.OooO00o> f19718OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Bitmap f19719OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Future<?> f19720OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Picasso.LoadedFrom f19721OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Exception f19722Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f19723Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f19724OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Picasso.Priority f19725OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final o0OoOo0 f19726o000oOoO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final Object f19704OooooOo = new Object();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f19706Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final AtomicInteger f19705Oooooo = new AtomicInteger();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final OooO0O0 f19707OoooooO = new OooO0O0();

    public static class OooO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO00o00O f19727Oooo0o;

        public OooO(oO00o00O oo00o00o) {
            this.f19727Oooo0o = oo00o00o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transformation ");
            sbOooO0o0.append(this.f19727Oooo0o.key());
            sbOooO0o0.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    public static class OooO00o extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    public static class OooO0O0 extends o0OoOo0 {
        @Override // com.squareup.picasso.o0OoOo0
        public final boolean OooO0OO(Oooo0 oooo0) {
            return true;
        }

        @Override // com.squareup.picasso.o0OoOo0
        public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + oooo0);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class RunnableC0177OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO00o00O f19728Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f19729Oooo0oO;

        public RunnableC0177OooO0OO(oO00o00O oo00o00o, RuntimeException runtimeException) {
            this.f19728Oooo0o = oo00o00o;
            this.f19729Oooo0oO = runtimeException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transformation ");
            sbOooO0o0.append(this.f19728Oooo0o.key());
            sbOooO0o0.append(" crashed with exception.");
            throw new RuntimeException(sbOooO0o0.toString(), this.f19729Oooo0oO);
        }
    }

    public static class OooO0o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f19730Oooo0o;

        public OooO0o(StringBuilder sb) {
            this.f19730Oooo0o = sb;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f19730Oooo0o.toString());
        }
    }

    public static class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO00o00O f19731Oooo0o;

        public OooOO0(oO00o00O oo00o00o) {
            this.f19731Oooo0o = oo00o00o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transformation ");
            sbOooO0o0.append(this.f19731Oooo0o.key());
            sbOooO0o0.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    public OooO0OO(Picasso picasso, com.squareup.picasso.OooOO0 oooOO1, oO00OOo0 oo00ooo0, oO00o00 oo00o00, com.squareup.picasso.OooO00o oooO00o, o0OoOo0 o0oooo1) {
        this.f19710Oooo0oO = picasso;
        this.f19711Oooo0oo = oooOO1;
        this.f19708Oooo = oo00ooo0;
        this.f19714OoooO00 = oo00o00;
        this.f19717OoooOOO = oooO00o;
        this.f19713OoooO0 = oooO00o.f19690OooO;
        Oooo0 oooo0 = oooO00o.f19692OooO0O0;
        this.f19715OoooO0O = oooo0;
        this.f19725OooooOO = oooo0.f19781OooOOo0;
        this.f19712OoooO = oooO00o.f19696OooO0o0;
        this.f19716OoooOO0 = oooO00o.f19695OooO0o;
        this.f19726o000oOoO = o0oooo1;
        this.f19724OooooO0 = o0oooo1.OooO0o0();
    }

    public static Bitmap OooO00o(List<oO00o00O> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            oO00o00O oo00o00o = list.get(i);
            try {
                Bitmap bitmapOooO00o = oo00o00o.OooO00o();
                if (bitmapOooO00o == null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transformation ");
                    sbOooO0o0.append(oo00o00o.key());
                    sbOooO0o0.append(" returned null after ");
                    sbOooO0o0.append(i);
                    sbOooO0o0.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<oO00o00O> it = list.iterator();
                    while (it.hasNext()) {
                        sbOooO0o0.append(it.next().key());
                        sbOooO0o0.append('\n');
                    }
                    Picasso.f19790OooOOO.post(new OooO0o(sbOooO0o0));
                    return null;
                }
                if (bitmapOooO00o == bitmap && bitmap.isRecycled()) {
                    Picasso.f19790OooOOO.post(new OooO(oo00o00o));
                    return null;
                }
                if (bitmapOooO00o != bitmap && !bitmap.isRecycled()) {
                    Picasso.f19790OooOOO.post(new OooOO0(oo00o00o));
                    return null;
                }
                i++;
                bitmap = bitmapOooO00o;
            } catch (RuntimeException e) {
                Picasso.f19790OooOOO.post(new RunnableC0177OooO0OO(oo00o00o, e));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap OooO0OO(InputStream inputStream, Oooo0 oooo0) throws IOException {
        oO00o000 oo00o000 = new oO00o000(inputStream);
        long jOooO0O0 = oo00o000.OooO0O0(65536);
        BitmapFactory.Options optionsOooO0Oo = o0OoOo0.OooO0Oo(oooo0);
        boolean z = optionsOooO0Oo != null && optionsOooO0Oo.inJustDecodeBounds;
        StringBuilder sb = o00oO0o.f19821OooO00o;
        byte[] bArr = new byte[12];
        boolean z2 = oo00o000.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
        oo00o000.OooO00o(jOooO0O0);
        if (!z2) {
            if (z) {
                BitmapFactory.decodeStream(oo00o000, null, optionsOooO0Oo);
                o0OoOo0.OooO0O0(oooo0.f19772OooO0oO, oooo0.f19773OooO0oo, optionsOooO0Oo, oooo0);
                oo00o000.OooO00o(jOooO0O0);
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(oo00o000, null, optionsOooO0Oo);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = oo00o000.read(bArr2);
            if (-1 == i) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsOooO0Oo);
            o0OoOo0.OooO0O0(oooo0.f19772OooO0oO, oooo0.f19773OooO0oo, optionsOooO0Oo, oooo0);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsOooO0Oo);
    }

    public static boolean OooO0o(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    public static Bitmap OooO0oO(Oooo0 oooo0, Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int iCeil;
        int i5;
        int i6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = oooo0.f19775OooOO0O;
        Matrix matrix = new Matrix();
        int i7 = 0;
        if (oooo0.OooO0OO()) {
            int i8 = oooo0.f19772OooO0oO;
            int i9 = oooo0.f19773OooO0oo;
            float f6 = oooo0.f19776OooOO0o;
            if (f6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (oooo0.f19779OooOOOO) {
                    matrix.setRotate(f6, oooo0.f19778OooOOO0, oooo0.f19777OooOOO);
                } else {
                    matrix.setRotate(f6);
                }
            }
            if (oooo0.f19765OooO) {
                float f7 = i8;
                float f8 = width;
                float f9 = f7 / f8;
                float f10 = i9;
                float f11 = height;
                float f12 = f10 / f11;
                if (f9 > f12) {
                    iCeil = (int) Math.ceil((f12 / f9) * f11);
                    i6 = (height - iCeil) / 2;
                    f12 = f10 / iCeil;
                    f5 = f9;
                    i5 = width;
                } else {
                    int iCeil2 = (int) Math.ceil((f9 / f12) * f8);
                    f5 = f7 / iCeil2;
                    iCeil = height;
                    i7 = (width - iCeil2) / 2;
                    i5 = iCeil2;
                    i6 = 0;
                }
                if (OooO0o(z, width, height, i8, i9)) {
                    matrix.preScale(f5, f12);
                }
                i4 = i6;
                i2 = i5;
                i3 = iCeil;
            } else {
                if (oooo0.f19774OooOO0) {
                    float f13 = i8 / width;
                    float f14 = i9 / height;
                    if (f13 >= f14) {
                        f13 = f14;
                    }
                    if (OooO0o(z, width, height, i8, i9)) {
                        matrix.preScale(f13, f13);
                    }
                } else if ((i8 != 0 || i9 != 0) && (i8 != width || i9 != height)) {
                    if (i8 != 0) {
                        f = i8;
                        f2 = width;
                    } else {
                        f = i9;
                        f2 = height;
                    }
                    float f15 = f / f2;
                    if (i9 != 0) {
                        f3 = i9;
                        f4 = height;
                    } else {
                        f3 = i8;
                        f4 = width;
                    }
                    float f16 = f3 / f4;
                    if (OooO0o(z, width, height, i8, i9)) {
                        matrix.preScale(f15, f16);
                    }
                }
                i2 = width;
                i3 = height;
                i4 = 0;
            }
        } else {
            i2 = width;
            i3 = height;
            i4 = 0;
        }
        if (i != 0) {
            matrix.preRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i7, i4, i2, i3, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void OooO0oo(Oooo0 oooo0) {
        Uri uri = oooo0.f19769OooO0Oo;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(oooo0.f19771OooO0o0);
        StringBuilder sb = f19706Oooooo0.get();
        sb.ensureCapacity(strValueOf.length() + 8);
        sb.replace(8, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    public final boolean OooO0O0() {
        Future<?> future;
        if (this.f19717OoooOOO != null) {
            return false;
        }
        ?? r0 = this.f19718OoooOOo;
        return (r0 == 0 || r0.isEmpty()) && (future = this.f19720OoooOoO) != null && future.cancel(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    public final void OooO0Oo(com.squareup.picasso.OooO00o oooO00o) {
        boolean zRemove;
        boolean z = true;
        if (this.f19717OoooOOO == oooO00o) {
            this.f19717OoooOOO = null;
            zRemove = true;
        } else {
            ?? r0 = this.f19718OoooOOo;
            zRemove = r0 != 0 ? r0.remove(oooO00o) : false;
        }
        if (zRemove && oooO00o.f19692OooO0O0.f19781OooOOo0 == this.f19725OooooOO) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            ?? r3 = this.f19718OoooOOo;
            boolean z2 = (r3 == 0 || r3.isEmpty()) ? false : true;
            com.squareup.picasso.OooO00o oooO00o2 = this.f19717OoooOOO;
            if (oooO00o2 == null && !z2) {
                z = false;
            }
            if (z) {
                if (oooO00o2 != null) {
                    priority = oooO00o2.f19692OooO0O0.f19781OooOOo0;
                }
                if (z2) {
                    int size = this.f19718OoooOOo.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.Priority priority2 = ((com.squareup.picasso.OooO00o) this.f19718OoooOOo.get(i)).f19692OooO0O0.f19781OooOOo0;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.f19725OooooOO = priority;
        }
        if (this.f19710Oooo0oO.f19804OooOOO0) {
            o00oO0o.OooOO0("Hunter", "removed", oooO00o.f19692OooO0O0.OooO0O0(), o00oO0o.OooO0oo(this, "from "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    public final Bitmap OooO0o0() throws IOException {
        Bitmap bitmapOooO0oO;
        boolean z;
        if (MemoryPolicy.OooO00o(this.f19712OoooO)) {
            bitmapOooO0oO = ((oOOoOOO0) this.f19708Oooo).OooO00o(this.f19713OoooO0);
            if (bitmapOooO0oO != null) {
                this.f19714OoooO00.f39776OooO0O0.sendEmptyMessage(0);
                this.f19721OoooOoo = Picasso.LoadedFrom.MEMORY;
                if (this.f19710Oooo0oO.f19804OooOOO0) {
                    o00oO0o.OooOO0("Hunter", "decoded", this.f19715OoooO0O.OooO0O0(), "from cache");
                }
                return bitmapOooO0oO;
            }
        } else {
            bitmapOooO0oO = null;
        }
        Oooo0 oooo0 = this.f19715OoooO0O;
        oooo0.f19768OooO0OO = this.f19724OooooO0 == 0 ? NetworkPolicy.OFFLINE.index : this.f19716OoooOO0;
        o0OoOo0.OooO00o oooO00oOooO0o = this.f19726o000oOoO.OooO0o(oooo0);
        if (oooO00oOooO0o != null) {
            this.f19721OoooOoo = oooO00oOooO0o.f19822OooO00o;
            this.f19723Ooooo0o = oooO00oOooO0o.f19825OooO0Oo;
            bitmapOooO0oO = oooO00oOooO0o.f19823OooO0O0;
            if (bitmapOooO0oO == null) {
                InputStream inputStream = oooO00oOooO0o.f19824OooO0OO;
                try {
                    Bitmap bitmapOooO0OO = OooO0OO(inputStream, this.f19715OoooO0O);
                    o00oO0o.OooO0OO(inputStream);
                    bitmapOooO0oO = bitmapOooO0OO;
                } catch (Throwable th) {
                    o00oO0o.OooO0OO(inputStream);
                    throw th;
                }
            }
        }
        if (bitmapOooO0oO != null) {
            if (this.f19710Oooo0oO.f19804OooOOO0) {
                o00oO0o.OooO("Hunter", "decoded", this.f19715OoooO0O.OooO0O0());
            }
            oO00o00 oo00o00 = this.f19714OoooO00;
            Objects.requireNonNull(oo00o00);
            int iOooO0o = o00oO0o.OooO0o(bitmapOooO0oO);
            oO00o00.OooO00o oooO00o = oo00o00.f39776OooO0O0;
            oooO00o.sendMessage(oooO00o.obtainMessage(2, iOooO0o, 0));
            Oooo0 oooo1 = this.f19715OoooO0O;
            boolean z2 = true;
            if (oooo1.OooO0OO()) {
                z = true;
            } else {
                if (oooo1.f19770OooO0o != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || this.f19723Ooooo0o != 0) {
                synchronized (f19704OooooOo) {
                    if (this.f19715OoooO0O.OooO0OO() || this.f19723Ooooo0o != 0) {
                        bitmapOooO0oO = OooO0oO(this.f19715OoooO0O, bitmapOooO0oO, this.f19723Ooooo0o);
                        if (this.f19710Oooo0oO.f19804OooOOO0) {
                            o00oO0o.OooO("Hunter", "transformed", this.f19715OoooO0O.OooO0O0());
                        }
                    }
                    List<oO00o00O> list = this.f19715OoooO0O.f19770OooO0o;
                    if (list == null) {
                        z2 = false;
                    }
                    if (z2) {
                        bitmapOooO0oO = OooO00o(list, bitmapOooO0oO);
                        if (this.f19710Oooo0oO.f19804OooOOO0) {
                            o00oO0o.OooOO0("Hunter", "transformed", this.f19715OoooO0O.OooO0O0(), "from custom transformations");
                        }
                    }
                }
                if (bitmapOooO0oO != null) {
                    oO00o00 oo00o01 = this.f19714OoooO00;
                    Objects.requireNonNull(oo00o01);
                    int iOooO0o2 = o00oO0o.OooO0o(bitmapOooO0oO);
                    oO00o00.OooO00o oooO00o2 = oo00o01.f39776OooO0O0;
                    oooO00o2.sendMessage(oooO00o2.obtainMessage(3, iOooO0o2, 0));
                }
            }
        }
        return bitmapOooO0oO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    OooO0oo(this.f19715OoooO0O);
                    if (this.f19710Oooo0oO.f19804OooOOO0) {
                        o00oO0o.OooO("Hunter", "executing", o00oO0o.OooO0oO(this));
                    }
                    Bitmap bitmapOooO0o0 = OooO0o0();
                    this.f19719OoooOo0 = bitmapOooO0o0;
                    if (bitmapOooO0o0 == null) {
                        this.f19711Oooo0oo.OooO0OO(this);
                    } else {
                        this.f19711Oooo0oo.OooO0O0(this);
                    }
                } catch (OooOOOO.OooO00o e) {
                    this.f19722Ooooo00 = e;
                    com.squareup.picasso.OooOO0.OooO00o oooO00o = this.f19711Oooo0oo.f19742OooO0oo;
                    oooO00o.sendMessageDelayed(oooO00o.obtainMessage(5, this), 500L);
                } catch (IOException e2) {
                    this.f19722Ooooo00 = e2;
                    com.squareup.picasso.OooOO0.OooO00o oooO00o2 = this.f19711Oooo0oo.f19742OooO0oo;
                    oooO00o2.sendMessageDelayed(oooO00o2.obtainMessage(5, this), 500L);
                }
            } catch (Downloader.ResponseException e3) {
                if (!e3.f19687Oooo0o || e3.f19688Oooo0oO != 504) {
                    this.f19722Ooooo00 = e3;
                }
                this.f19711Oooo0oo.OooO0OO(this);
            } catch (Exception e4) {
                this.f19722Ooooo00 = e4;
                this.f19711Oooo0oo.OooO0OO(this);
            } catch (OutOfMemoryError e5) {
                StringWriter stringWriter = new StringWriter();
                this.f19714OoooO00.OooO00o().OooO00o(new PrintWriter(stringWriter));
                this.f19722Ooooo00 = new RuntimeException(stringWriter.toString(), e5);
                this.f19711Oooo0oo.OooO0OO(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
