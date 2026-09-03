package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o0oooO00.o00O0000.OooO00o;
import p115o00O00oO.o000O00;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OOo0;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f8737OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f8738OooO0O0 = {80, 75, 3, 4};

    public class OooO00o implements o0OoOo0<OooOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f8739OooO00o;

        public OooO00o(String str) {
            this.f8739OooO00o = str;
        }

        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(OooOO0 oooOO1) {
            OooOO0O.f8737OooO00o.remove(this.f8739OooO00o);
        }
    }

    public class OooO0O0 implements o0OoOo0<Throwable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f8740OooO00o;

        public OooO0O0(String str) {
            this.f8740OooO00o = str;
        }

        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(Throwable th) {
            OooOO0O.f8737OooO00o.remove(this.f8740OooO00o);
        }
    }

    public class OooO0OO implements Callable<o00Ooo<OooOO0>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f8741OooO00o;

        public OooO0OO(OooOO0 oooOO1) {
            this.f8741OooO00o = oooOO1;
        }

        @Override // java.util.concurrent.Callable
        public final o00Ooo<OooOO0> call() throws Exception {
            return new o00Ooo<>(this.f8741OooO00o);
        }
    }

    public static String OooO(@RawRes int i, Context context) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static o00oO0o<OooOO0> OooO00o(@Nullable String str, Callable<o00Ooo<OooOO0>> callable) {
        OooOO0 oooOO1 = str == null ? null : oOO00O.OooOO0.f60844OooO0O0.f60845OooO00o.get(str);
        if (oooOO1 != null) {
            return new o00oO0o<>(new OooO0OO(oooOO1), false);
        }
        HashMap map = f8737OooO00o;
        if (str != null && map.containsKey(str)) {
            return (o00oO0o) map.get(str);
        }
        o00oO0o<OooOO0> o00oo0o2 = new o00oO0o<>(callable, false);
        if (str != null) {
            o00oo0o2.OooO0OO(new OooO00o(str));
            o00oo0o2.OooO0O0(new OooO0O0(str));
            map.put(str, o00oo0o2);
        }
        return o00oo0o2;
    }

    @WorkerThread
    public static o00Ooo<OooOO0> OooO0O0(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return OooO0OO(context.getAssets().open(str), str2);
            }
            return OooO0oO(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new o00Ooo<>(e);
        }
    }

    @WorkerThread
    public static o00Ooo<OooOO0> OooO0OO(InputStream inputStream, @Nullable String str) {
        try {
            o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(inputStream));
            String[] strArr = JsonReader.f8932OooO0oo;
            return OooO0Oo(new com.airbnb.lottie.parser.moshi.OooO00o(o00o0000OooO0O0), str, true);
        } finally {
            o00O0.OooOOOO.OooO0O0(inputStream);
        }
    }

    public static o00Ooo OooO0Oo(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, @Nullable String str, boolean z) {
        try {
            OooOO0 oooOO0OooO00o = o000O00.OooO00o(oooO00o);
            if (str != null) {
                oOO00O.OooOO0.f60844OooO0O0.f60845OooO00o.put(str, oooOO0OooO00o);
            }
            return new o00Ooo(oooOO0OooO00o);
        } catch (Exception e) {
            return new o00Ooo(e);
        } finally {
            if (z) {
                o00O0.OooOOOO.OooO0O0(oooO00o);
            }
        }
    }

    @WorkerThread
    public static o00Ooo OooO0o(@RawRes int i, Context context, @Nullable String str) {
        Boolean bool;
        try {
            o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(context.getResources().openRawResource(i)));
            try {
                o00O0000 o00o0000OooO0O1 = o000O0Oo.OooO0O0(new o000OOo0(o00o0000OooO0O0));
                byte[] bArr = f8738OooO0O0;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        o00o0000OooO0O1.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (o00o0000OooO0O1.readByte() != bArr[i2]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i2++;
                }
            } catch (Exception unused) {
                o00O0.OooOO0.f35970OooO00o.getClass();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? OooO0oO(new ZipInputStream(o00o0000OooO0O0.new OooO00o()), str) : OooO0OO(o00o0000OooO0O0.new OooO00o(), str);
        } catch (Resources.NotFoundException e) {
            return new o00Ooo(e);
        }
    }

    public static o00oO0o OooO0o0(@RawRes int i, Context context, @Nullable String str) {
        return OooO00o(str, new OooOOOO(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    @WorkerThread
    public static o00Ooo<OooOO0> OooO0oO(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return OooO0oo(zipInputStream, str);
        } finally {
            o00O0.OooOOOO.OooO0O0(zipInputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public static o00Ooo<OooOO0> OooO0oo(ZipInputStream zipInputStream, @Nullable String str) {
        o000oOoO next;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            OooOO0 oooOO1 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(zipInputStream));
                    String[] strArr = JsonReader.f8932OooO0oo;
                    oooOO1 = (OooOO0) OooO0Oo(new com.airbnb.lottie.parser.moshi.OooO00o(o00o0000OooO0O0), null, false).f8920OooO00o;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (oooOO1 == null) {
                return new o00Ooo<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<o000oOoO> it = oooOO1.f8726OooO0Oo.values().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.f8878OooO0OO.equals(str2));
                if (next != null) {
                    next.f8879OooO0Oo = o00O0.OooOOOO.OooO0o0((Bitmap) entry.getValue(), next.f8876OooO00o, next.f8877OooO0O0);
                }
            }
            for (Map.Entry<String, o000oOoO> entry2 : oooOO1.f8726OooO0Oo.entrySet()) {
                if (entry2.getValue().f8879OooO0Oo == null) {
                    return new o00Ooo<>(new IllegalStateException("There is no image for " + entry2.getValue().f8878OooO0OO));
                }
            }
            if (str != null) {
                oOO00O.OooOO0.f60844OooO0O0.f60845OooO00o.put(str, oooOO1);
            }
            return new o00Ooo<>(oooOO1);
        } catch (IOException e) {
            return new o00Ooo<>(e);
        }
    }
}
