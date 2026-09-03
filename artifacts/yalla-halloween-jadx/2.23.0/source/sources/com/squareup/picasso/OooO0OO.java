package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f21694OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f21695OooO0Oo = f21693OooOoO0.incrementAndGet();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO f21696OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Picasso f21697OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.squareup.picasso.OooO0o f21698OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OOO0o f21699OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00Ooo f21700OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f21701OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21702OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public com.squareup.picasso.OooO00o f21703OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00oO0o f21704OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ArrayList f21705OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Bitmap f21706OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Picasso.LoadedFrom f21707OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Future<?> f21708OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Exception f21709OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f21710OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f21711OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Picasso.Priority f21712OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final Object f21691OooOo0o = new Object();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f21690OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final AtomicInteger f21693OooOoO0 = new AtomicInteger();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO0O0 f21692OooOoO = new OooO0O0();

    public static class OooO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f21713OooO0Oo;

        public OooO(o0O0O00 o0o0o00) {
            this.f21713OooO0Oo = o0o0o00;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f21713OooO0Oo.key() + " returned input Bitmap but recycled it.");
        }
    }

    public static class OooO00o extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    public static class OooO0O0 extends o00oO0o {
        @Override // com.squareup.picasso.o00oO0o
        public final boolean OooO0O0(o00Ooo o00ooo2) {
            return true;
        }

        @Override // com.squareup.picasso.o00oO0o
        public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + o00ooo2);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class RunnableC0278OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f21714OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f21715OooO0o0;

        public RunnableC0278OooO0OO(o0O0O00 o0o0o00, RuntimeException runtimeException) {
            this.f21714OooO0Oo = o0o0o00;
            this.f21715OooO0o0 = runtimeException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new RuntimeException("Transformation " + this.f21714OooO0Oo.key() + " crashed with exception.", this.f21715OooO0o0);
        }
    }

    public static class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f21716OooO0Oo;

        public OooO0o(StringBuilder sb) {
            this.f21716OooO0Oo = sb;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f21716OooO0Oo.toString());
        }
    }

    public static class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f21717OooO0Oo;

        public OooOO0(o0O0O00 o0o0o00) {
            this.f21717OooO0Oo = o0o0o00;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f21717OooO0Oo.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public OooO0OO(Picasso picasso, OooOOO oooOOO, com.squareup.picasso.OooO0o oooO0o, o0OOO0o o0ooo0o2, com.squareup.picasso.OooO00o oooO00o, o00oO0o o00oo0o2) {
        this.f21697OooO0o0 = picasso;
        this.f21696OooO0o = oooOOO;
        this.f21698OooO0oO = oooO0o;
        this.f21699OooO0oo = o0ooo0o2;
        this.f21703OooOOO = oooO00o;
        this.f21694OooO = oooO00o.f21676OooO;
        o00Ooo o00ooo2 = oooO00o.f21678OooO0O0;
        this.f21700OooOO0 = o00ooo2;
        this.f21712OooOo0O = o00ooo2.f21806OooOOo0;
        this.f21701OooOO0O = oooO00o.f21682OooO0o0;
        this.f21702OooOO0o = oooO00o.f21681OooO0o;
        this.f21704OooOOO0 = o00oo0o2;
        this.f21710OooOo0 = o00oo0o2.OooO0Oo();
    }

    public static Bitmap OooO00o(List<o0O0O00> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            o0O0O00 o0o0o00 = list.get(i);
            try {
                Bitmap bitmapOooO00o = o0o0o00.OooO00o();
                if (bitmapOooO00o == null) {
                    StringBuilder sbOooO00o = o00OO.OooO00o("Transformation ");
                    sbOooO00o.append(o0o0o00.key());
                    sbOooO00o.append(" returned null after ");
                    sbOooO00o.append(i);
                    sbOooO00o.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<o0O0O00> it = list.iterator();
                    while (it.hasNext()) {
                        sbOooO00o.append(it.next().key());
                        sbOooO00o.append('\n');
                    }
                    Picasso.f21751OooOOO0.post(new OooO0o(sbOooO00o));
                    return null;
                }
                if (bitmapOooO00o == bitmap && bitmap.isRecycled()) {
                    Picasso.f21751OooOOO0.post(new OooO(o0o0o00));
                    return null;
                }
                if (bitmapOooO00o != bitmap && !bitmap.isRecycled()) {
                    Picasso.f21751OooOOO0.post(new OooOO0(o0o0o00));
                    return null;
                }
                i++;
                bitmap = bitmapOooO00o;
            } catch (RuntimeException e) {
                Picasso.f21751OooOOO0.post(new RunnableC0278OooO0OO(o0o0o00, e));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap OooO0OO(InputStream inputStream, o00Ooo o00ooo2) throws IOException {
        Oooo000 oooo000 = new Oooo000(inputStream);
        long jOooO0OO = oooo000.OooO0OO(65536);
        BitmapFactory.Options optionsOooO0OO = o00oO0o.OooO0OO(o00ooo2);
        boolean z = optionsOooO0OO != null && optionsOooO0OO.inJustDecodeBounds;
        StringBuilder sb = o000000O.f21773OooO00o;
        byte[] bArr = new byte[12];
        boolean z2 = oooo000.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
        oooo000.OooO00o(jOooO0OO);
        int i = o00ooo2.f21798OooO0oo;
        int i2 = o00ooo2.f21797OooO0oO;
        if (!z2) {
            if (z) {
                BitmapFactory.decodeStream(oooo000, null, optionsOooO0OO);
                o00oO0o.OooO00o(i2, i, optionsOooO0OO.outWidth, optionsOooO0OO.outHeight, optionsOooO0OO, o00ooo2);
                oooo000.OooO00o(jOooO0OO);
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(oooo000, null, optionsOooO0OO);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i3 = oooo000.read(bArr2);
            if (-1 == i3) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, i3);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsOooO0OO);
            o00oO0o.OooO00o(i2, i, optionsOooO0OO.outWidth, optionsOooO0OO.outHeight, optionsOooO0OO, o00ooo2);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsOooO0OO);
    }

    public static Bitmap OooO0o(o00Ooo o00ooo2, Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        int iCeil;
        float f5;
        int iCeil2;
        int i5;
        int i6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = o00ooo2.f21800OooOO0O;
        Matrix matrix = new Matrix();
        int i7 = 0;
        if (o00ooo2.OooO0OO()) {
            float f6 = o00ooo2.f21801OooOO0o;
            if (f6 != 0.0f) {
                if (o00ooo2.f21804OooOOOO) {
                    matrix.setRotate(f6, o00ooo2.f21803OooOOO0, o00ooo2.f21802OooOOO);
                } else {
                    matrix.setRotate(f6);
                }
            }
            boolean z2 = true;
            boolean z3 = o00ooo2.f21790OooO;
            int i8 = o00ooo2.f21797OooO0oO;
            int i9 = o00ooo2.f21798OooO0oo;
            if (z3) {
                float f7 = i8;
                float f8 = width;
                float f9 = f7 / f8;
                float f10 = i9;
                float f11 = height;
                float f12 = f10 / f11;
                if (f9 > f12) {
                    iCeil2 = (int) Math.ceil((f12 / f9) * f11);
                    f12 = f10 / iCeil2;
                    i5 = 0;
                    f5 = f9;
                    i6 = (height - iCeil2) / 2;
                    iCeil = width;
                } else {
                    iCeil = (int) Math.ceil((f9 / f12) * f8);
                    f5 = f7 / iCeil;
                    iCeil2 = height;
                    i5 = (width - iCeil) / 2;
                    i6 = 0;
                }
                if (((!z || width > i8 || height > i9) ? 1 : 0) != 0) {
                    matrix.preScale(f5, f12);
                }
                i3 = iCeil2;
                i2 = iCeil;
                i4 = i6;
                i7 = i5;
            } else {
                if (o00ooo2.f21799OooOO0) {
                    float f13 = i8 / width;
                    float f14 = i9 / height;
                    if (f13 >= f14) {
                        f13 = f14;
                    }
                    if (z && width <= i8 && height <= i9) {
                        z2 = false;
                    }
                    if (z2) {
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
                    if (z && width <= i8 && height <= i9) {
                        z2 = false;
                    }
                    if (z2) {
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

    public static void OooO0oO(o00Ooo o00ooo2) {
        Uri uri = o00ooo2.f21794OooO0Oo;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(o00ooo2.f21796OooO0o0);
        StringBuilder sb = f21690OooOo.get();
        sb.ensureCapacity(strValueOf.length() + 8);
        sb.replace(8, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean OooO0O0() {
        Future<?> future;
        if (this.f21703OooOOO != null) {
            return false;
        }
        ArrayList arrayList = this.f21705OooOOOO;
        return (arrayList == null || arrayList.isEmpty()) && (future = this.f21708OooOOo0) != null && future.cancel(false);
    }

    public final void OooO0Oo(com.squareup.picasso.OooO00o oooO00o) {
        boolean zRemove;
        boolean z = true;
        if (this.f21703OooOOO == oooO00o) {
            this.f21703OooOOO = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f21705OooOOOO;
            zRemove = arrayList != null ? arrayList.remove(oooO00o) : false;
        }
        if (zRemove && oooO00o.f21678OooO0O0.f21806OooOOo0 == this.f21712OooOo0O) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            ArrayList arrayList2 = this.f21705OooOOOO;
            boolean z2 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            com.squareup.picasso.OooO00o oooO00o2 = this.f21703OooOOO;
            if (oooO00o2 == null && !z2) {
                z = false;
            }
            if (z) {
                if (oooO00o2 != null) {
                    priority = oooO00o2.f21678OooO0O0.f21806OooOOo0;
                }
                if (z2) {
                    int size = this.f21705OooOOOO.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.Priority priority2 = ((com.squareup.picasso.OooO00o) this.f21705OooOOOO.get(i)).f21678OooO0O0.f21806OooOOo0;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.f21712OooOo0O = priority;
        }
        if (this.f21697OooO0o0.f21763OooOO0o) {
            o000000O.OooO0oo("Hunter", "removed", oooO00o.f21678OooO0O0.OooO0O0(), o000000O.OooO0o(this, "from "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    public final Bitmap OooO0o0() throws IOException {
        Bitmap bitmapOooO0o;
        boolean z;
        if (MemoryPolicy.OooO00o(this.f21701OooOO0O)) {
            bitmapOooO0o = ((OooOo) this.f21698OooO0oO).OooO00o(this.f21694OooO);
            if (bitmapOooO0o != null) {
                this.f21699OooO0oo.f21820OooO0O0.sendEmptyMessage(0);
                this.f21707OooOOo = Picasso.LoadedFrom.MEMORY;
                if (this.f21697OooO0o0.f21763OooOO0o) {
                    o000000O.OooO0oo("Hunter", "decoded", this.f21700OooOO0.OooO0O0(), "from cache");
                }
                return bitmapOooO0o;
            }
        } else {
            bitmapOooO0o = null;
        }
        o00Ooo o00ooo2 = this.f21700OooOO0;
        o00ooo2.f21793OooO0OO = this.f21710OooOo0 == 0 ? NetworkPolicy.OFFLINE.index : this.f21702OooOO0o;
        o00oO0o.OooO00o oooO00oOooO0o0 = this.f21704OooOOO0.OooO0o0(o00ooo2);
        if (oooO00oOooO0o0 != null) {
            this.f21707OooOOo = oooO00oOooO0o0.f21814OooO00o;
            this.f21711OooOo00 = oooO00oOooO0o0.f21817OooO0Oo;
            bitmapOooO0o = oooO00oOooO0o0.f21815OooO0O0;
            if (bitmapOooO0o == null) {
                InputStream inputStream = oooO00oOooO0o0.f21816OooO0OO;
                try {
                    Bitmap bitmapOooO0OO = OooO0OO(inputStream, this.f21700OooOO0);
                    StringBuilder sb = o000000O.f21773OooO00o;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    bitmapOooO0o = bitmapOooO0OO;
                } catch (Throwable th) {
                    StringBuilder sb2 = o000000O.f21773OooO00o;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
        }
        if (bitmapOooO0o != null) {
            if (this.f21697OooO0o0.f21763OooOO0o) {
                o000000O.OooO0oO("Hunter", "decoded", this.f21700OooOO0.OooO0O0());
            }
            o0OOO0o o0ooo0o2 = this.f21699OooO0oo;
            o0ooo0o2.getClass();
            int iOooO0Oo = o000000O.OooO0Oo(bitmapOooO0o);
            o0OOO0o.OooO00o oooO00o = o0ooo0o2.f21820OooO0O0;
            oooO00o.sendMessage(oooO00o.obtainMessage(2, iOooO0Oo, 0));
            o00Ooo o00ooo3 = this.f21700OooOO0;
            boolean z2 = true;
            if (o00ooo3.OooO0OO()) {
                z = true;
            } else {
                if (o00ooo3.f21795OooO0o != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || this.f21711OooOo00 != 0) {
                synchronized (f21691OooOo0o) {
                    if (this.f21700OooOO0.OooO0OO() || this.f21711OooOo00 != 0) {
                        bitmapOooO0o = OooO0o(this.f21700OooOO0, bitmapOooO0o, this.f21711OooOo00);
                        if (this.f21697OooO0o0.f21763OooOO0o) {
                            o000000O.OooO0oO("Hunter", "transformed", this.f21700OooOO0.OooO0O0());
                        }
                    }
                    List<o0O0O00> list = this.f21700OooOO0.f21795OooO0o;
                    if (list == null) {
                        z2 = false;
                    }
                    if (z2) {
                        bitmapOooO0o = OooO00o(list, bitmapOooO0o);
                        if (this.f21697OooO0o0.f21763OooOO0o) {
                            o000000O.OooO0oo("Hunter", "transformed", this.f21700OooOO0.OooO0O0(), "from custom transformations");
                        }
                    }
                }
                if (bitmapOooO0o != null) {
                    o0OOO0o o0ooo0o3 = this.f21699OooO0oo;
                    o0ooo0o3.getClass();
                    int iOooO0Oo2 = o000000O.OooO0Oo(bitmapOooO0o);
                    o0OOO0o.OooO00o oooO00o2 = o0ooo0o3.f21820OooO0O0;
                    oooO00o2.sendMessage(oooO00o2.obtainMessage(3, iOooO0Oo2, 0));
                }
            }
        }
        return bitmapOooO0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                OooO0oO(this.f21700OooOO0);
                                if (this.f21697OooO0o0.f21763OooOO0o) {
                                    o000000O.OooO0oO("Hunter", "executing", o000000O.OooO0o0(this));
                                }
                                Bitmap bitmapOooO0o0 = OooO0o0();
                                this.f21706OooOOOo = bitmapOooO0o0;
                                if (bitmapOooO0o0 == null) {
                                    OooOOO.OooO00o oooO00o = this.f21696OooO0o.f21729OooO0oo;
                                    oooO00o.sendMessage(oooO00o.obtainMessage(6, this));
                                } else {
                                    this.f21696OooO0o.OooO0O0(this);
                                }
                            } catch (IOException e) {
                                this.f21709OooOOoo = e;
                                OooOOO.OooO00o oooO00o2 = this.f21696OooO0o.f21729OooO0oo;
                                oooO00o2.sendMessageDelayed(oooO00o2.obtainMessage(5, this), 500L);
                            }
                        } catch (Downloader.ResponseException e2) {
                            if (!e2.f21674OooO0Oo || e2.f21675OooO0o0 != 504) {
                                this.f21709OooOOoo = e2;
                            }
                            OooOOO.OooO00o oooO00o3 = this.f21696OooO0o.f21729OooO0oo;
                            oooO00o3.sendMessage(oooO00o3.obtainMessage(6, this));
                        }
                    } catch (OutOfMemoryError e3) {
                        StringWriter stringWriter = new StringWriter();
                        this.f21699OooO0oo.OooO00o().OooO00o(new PrintWriter(stringWriter));
                        this.f21709OooOOoo = new RuntimeException(stringWriter.toString(), e3);
                        OooOOO.OooO00o oooO00o4 = this.f21696OooO0o.f21729OooO0oo;
                        oooO00o4.sendMessage(oooO00o4.obtainMessage(6, this));
                    }
                } catch (o000oOoO.OooO00o e4) {
                    this.f21709OooOOoo = e4;
                    OooOOO.OooO00o oooO00o5 = this.f21696OooO0o.f21729OooO0oo;
                    oooO00o5.sendMessageDelayed(oooO00o5.obtainMessage(5, this), 500L);
                }
            } catch (Exception e5) {
                this.f21709OooOOoo = e5;
                OooOOO.OooO00o oooO00o6 = this.f21696OooO0o.f21729OooO0oo;
                oooO00o6.sendMessage(oooO00o6.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
