package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o0oooo0.o0O00OO.OooO00o;
import p127o00O0oO.o000O000;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;
import p225o00oOOo.o00O;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Map<String, o00Oo0<OooOO0O>> f10057OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f10058OooO0O0 = {80, 75, 3, 4};

    public class OooO implements Callable<o0OoOo0<OooOO0O>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ WeakReference f10059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Context f10060OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ int f10061OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f10062OooO0Oo;

        public OooO(WeakReference weakReference, Context context, int i, String str) {
            this.f10059OooO00o = weakReference;
            this.f10060OooO0O0 = context;
            this.f10061OooO0OO = i;
            this.f10062OooO0Oo = str;
        }

        @Override // java.util.concurrent.Callable
        public final o0OoOo0<OooOO0O> call() throws Exception {
            Context context = (Context) this.f10059OooO00o.get();
            if (context == null) {
                context = this.f10060OooO0O0;
            }
            return OooOOO0.OooO0oo(context, this.f10061OooO0OO, this.f10062OooO0Oo);
        }
    }

    public class OooO00o implements Oooo000<OooOO0O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f10063OooO00o;

        public OooO00o(String str) {
            this.f10063OooO00o = str;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.airbnb.lottie.o00Oo0<com.airbnb.lottie.OooOO0O>>] */
        @Override // com.airbnb.lottie.Oooo000
        public final void OooO00o(OooOO0O oooOO0O) {
            OooOOO0.f10057OooO00o.remove(this.f10063OooO00o);
        }
    }

    public class OooO0O0 implements Oooo000<Throwable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f10064OooO00o;

        public OooO0O0(String str) {
            this.f10064OooO00o = str;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.airbnb.lottie.o00Oo0<com.airbnb.lottie.OooOO0O>>] */
        @Override // com.airbnb.lottie.Oooo000
        public final void OooO00o(Throwable th) {
            OooOOO0.f10057OooO00o.remove(this.f10064OooO00o);
        }
    }

    public class OooO0OO implements Callable<o0OoOo0<OooOO0O>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f10065OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f10066OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ String f10067OooO0OO;

        public OooO0OO(Context context, String str, String str2) {
            this.f10065OooO00o = context;
            this.f10066OooO0O0 = str;
            this.f10067OooO0OO = str2;
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
        @Override // java.util.concurrent.Callable
        public final o0OoOo0<OooOO0O> call() throws Exception {
            OooOO0O oooOO0O;
            o0OoOo0<OooOO0O> o0oooo1;
            OooOO0O oooOO0O2;
            Pair pair;
            p122o00O0o.o0OoOo0 o0oooo2;
            Context context = this.f10065OooO00o;
            p122o00O0o.o00O0O o00o0o2 = com.airbnb.lottie.OooO0o.f10036OooO0O0;
            if (o00o0o2 == null) {
                synchronized (p122o00O0o.o00O0O.class) {
                    o00o0o2 = com.airbnb.lottie.OooO0o.f10036OooO0O0;
                    if (o00o0o2 == null) {
                        Context applicationContext = context.getApplicationContext();
                        p122o00O0o.o0OoOo0 o0oooo3 = com.airbnb.lottie.OooO0o.f10037OooO0OO;
                        if (o0oooo3 == null) {
                            synchronized (p122o00O0o.o0OoOo0.class) {
                                o0oooo2 = com.airbnb.lottie.OooO0o.f10037OooO0OO;
                                if (o0oooo2 == null) {
                                    o0oooo2 = new p122o00O0o.o0OoOo0(new com.airbnb.lottie.OooO0OO(applicationContext));
                                    com.airbnb.lottie.OooO0o.f10037OooO0OO = o0oooo2;
                                }
                            }
                            o0oooo3 = o0oooo2;
                        }
                        o00o0o2 = new p122o00O0o.o00O0O(o0oooo3, new p122o00O0o.Oooo0());
                        com.airbnb.lottie.OooO0o.f10036OooO0O0 = o00o0o2;
                    }
                }
            }
            String str = this.f10066OooO0O0;
            String str2 = this.f10067OooO0OO;
            AutoCloseable autoCloseable = null;
            boolean z = false;
            if (str2 == null) {
                oooOO0O = null;
            } else {
                p122o00O0o.o0OoOo0 o0oooo4 = o00o0o2.f30956OooO00o;
                Objects.requireNonNull(o0oooo4);
                try {
                    File fileOooO0O0 = o0oooo4.OooO0O0();
                    FileExtension fileExtension = FileExtension.JSON;
                    File file = new File(fileOooO0O0, p122o00O0o.o0OoOo0.OooO00o(str, fileExtension, false));
                    if (!file.exists()) {
                        file = new File(o0oooo4.OooO0O0(), p122o00O0o.o0OoOo0.OooO00o(str, FileExtension.ZIP, false));
                        if (!file.exists()) {
                            file = null;
                        }
                    }
                    if (file == null) {
                        pair = null;
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        if (file.getAbsolutePath().endsWith(".zip")) {
                            fileExtension = FileExtension.ZIP;
                        }
                        file.getAbsolutePath();
                        o000Oo0.OooO00o();
                        pair = new Pair(fileExtension, fileInputStream);
                    }
                } catch (FileNotFoundException unused) {
                }
                if (pair == null) {
                    oooOO0O = null;
                } else {
                    FileExtension fileExtension2 = (FileExtension) pair.first;
                    InputStream inputStream = (InputStream) pair.second;
                    OooOO0O oooOO0O3 = (fileExtension2 == FileExtension.ZIP ? OooOOO0.OooOO0O(new ZipInputStream(inputStream), str) : OooOOO0.OooO0o0(inputStream, str)).f10248OooO00o;
                    if (oooOO0O3 != null) {
                        oooOO0O = oooOO0O3;
                    } else {
                        oooOO0O = null;
                    }
                }
            }
            if (oooOO0O != null) {
                o0oooo1 = new o0OoOo0<>(oooOO0O);
            } else {
                o000Oo0.OooO00o();
                o000Oo0.OooO00o();
                try {
                    try {
                        p122o00O0o.Oooo000 oooo000OooO00o = o00o0o2.f30957OooO0O0.OooO00o(str);
                        try {
                            if (oooo000OooO00o.f30955Oooo0o.getResponseCode() / 100 == 2) {
                                z = true;
                            }
                        } catch (IOException unused2) {
                        }
                        if (z) {
                            o0oooo1 = o00o0o2.OooO00o(str, oooo000OooO00o.f30955Oooo0o.getInputStream(), oooo000OooO00o.f30955Oooo0o.getContentType(), str2);
                            o000Oo0.OooO00o();
                        } else {
                            o0oooo1 = new o0OoOo0<>(new IllegalArgumentException(oooo000OooO00o.OooO00o()));
                        }
                        try {
                            oooo000OooO00o.close();
                        } catch (IOException e) {
                            o000Oo0.OooO0Oo("LottieFetchResult close failed ", e);
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e2) {
                                o000Oo0.OooO0Oo("LottieFetchResult close failed ", e2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    o0OoOo0<OooOO0O> o0oooo5 = new o0OoOo0<>(e3);
                    if (0 != 0) {
                        try {
                            autoCloseable.close();
                        } catch (IOException e4) {
                            o000Oo0.OooO0Oo("LottieFetchResult close failed ", e4);
                        }
                    }
                    o0oooo1 = o0oooo5;
                }
            }
            String str3 = this.f10067OooO0OO;
            if (str3 != null && (oooOO0O2 = o0oooo1.f10248OooO00o) != null) {
                o00O.f33854OooO0O0.OooO00o(str3, oooOO0O2);
            }
            return o0oooo1;
        }
    }

    public class OooO0o implements Callable<o0OoOo0<OooOO0O>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f10068OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f10069OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ String f10070OooO0OO;

        public OooO0o(Context context, String str, String str2) {
            this.f10068OooO00o = context;
            this.f10069OooO0O0 = str;
            this.f10070OooO0OO = str2;
        }

        @Override // java.util.concurrent.Callable
        public final o0OoOo0<OooOO0O> call() throws Exception {
            return OooOOO0.OooO0Oo(this.f10068OooO00o, this.f10069OooO0O0, this.f10070OooO0OO);
        }
    }

    public class OooOO0 implements Callable<o0OoOo0<OooOO0O>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f10071OooO00o;

        public OooOO0(OooOO0O oooOO0O) {
            this.f10071OooO00o = oooOO0O;
        }

        @Override // java.util.concurrent.Callable
        public final o0OoOo0<OooOO0O> call() throws Exception {
            return new o0OoOo0<>(this.f10071OooO00o);
        }
    }

    public static o00Oo0<OooOO0O> OooO(Context context, String str) {
        return OooOO0(context, str, "url_" + str);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.airbnb.lottie.o00Oo0<com.airbnb.lottie.OooOO0O>>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.airbnb.lottie.o00Oo0<com.airbnb.lottie.OooOO0O>>] */
    public static o00Oo0<OooOO0O> OooO00o(@Nullable String str, Callable<o0OoOo0<OooOO0O>> callable) {
        OooOO0O oooOO0O;
        if (str == null) {
            oooOO0O = null;
        } else {
            o00O o00o2 = o00O.f33854OooO0O0;
            Objects.requireNonNull(o00o2);
            oooOO0O = o00o2.f33855OooO00o.get(str);
        }
        if (oooOO0O != null) {
            return new o00Oo0<>(new OooOO0(oooOO0O), false);
        }
        if (str != null) {
            ?? r0 = f10057OooO00o;
            if (r0.containsKey(str)) {
                return (o00Oo0) r0.get(str);
            }
        }
        o00Oo0<OooOO0O> o00oo1 = new o00Oo0<>(callable, false);
        if (str != null) {
            o00oo1.OooO0O0(new OooO00o(str));
            o00oo1.OooO00o(new OooO0O0(str));
            f10057OooO00o.put(str, o00oo1);
        }
        return o00oo1;
    }

    public static o00Oo0<OooOO0O> OooO0O0(Context context, String str) {
        return OooO0OO(context, str, "asset_" + str);
    }

    public static o00Oo0<OooOO0O> OooO0OO(Context context, String str, @Nullable String str2) {
        return OooO00o(str2, new OooO0o(context.getApplicationContext(), str, str2));
    }

    @WorkerThread
    public static o0OoOo0<OooOO0O> OooO0Oo(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return OooO0o0(context.getAssets().open(str), str2);
            }
            return OooOO0O(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new o0OoOo0<>((Throwable) e);
        }
    }

    public static o0OoOo0<OooOO0O> OooO0o(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            OooOO0O oooOO0OOooO00o = o000O000.OooO00o(jsonReader);
            if (str != null) {
                o00O.f33854OooO0O0.OooO00o(str, oooOO0OOooO00o);
            }
            return new o0OoOo0<>(oooOO0OOooO00o);
        } catch (Exception e) {
            return new o0OoOo0<>((Throwable) e);
        } finally {
            if (z) {
                o000O0Oo.OooO0O0(jsonReader);
            }
        }
    }

    @WorkerThread
    public static o0OoOo0<OooOO0O> OooO0o0(InputStream inputStream, @Nullable String str) {
        try {
            o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO(inputStream));
            String[] strArr = JsonReader.f10250OoooO00;
            return OooO0o(new com.airbnb.lottie.parser.moshi.OooO00o(o0ooooOooO0OO), str, true);
        } finally {
            o000O0Oo.OooO0O0(inputStream);
        }
    }

    public static o00Oo0<OooOO0O> OooO0oO(Context context, @RawRes int i, @Nullable String str) {
        return OooO00o(str, new OooO(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    @WorkerThread
    public static o0OoOo0<OooOO0O> OooO0oo(Context context, @RawRes int i, @Nullable String str) {
        Boolean bool;
        try {
            o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO(context.getResources().openRawResource(i)));
            try {
                o0oOOo o0ooooOooO0O0 = ((o0O00OO) o0ooooOooO0OO).OooO0O0();
                byte[] bArr = f10058OooO0O0;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        ((o0O00OO) o0ooooOooO0O0).close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (((o0O00OO) o0ooooOooO0O0).readByte() != bArr[i2]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i2++;
                }
            } catch (Exception unused) {
                o000Oo0.OooO0O0();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? OooOO0O(new ZipInputStream(((o0O00OO) o0ooooOooO0OO).new OooO00o()), str) : OooO0o0(((o0O00OO) o0ooooOooO0OO).new OooO00o(), str);
        } catch (Resources.NotFoundException e) {
            return new o0OoOo0<>((Throwable) e);
        }
    }

    public static o00Oo0<OooOO0O> OooOO0(Context context, String str, @Nullable String str2) {
        return OooO00o(str2, new OooO0OO(context, str, str2));
    }

    @WorkerThread
    public static o0OoOo0<OooOO0O> OooOO0O(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return OooOO0o(zipInputStream, str);
        } finally {
            o000O0Oo.OooO0O0(zipInputStream);
        }
    }

    @WorkerThread
    public static o0OoOo0<OooOO0O> OooOO0o(ZipInputStream zipInputStream, @Nullable String str) {
        OooOo next;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            OooOO0O oooOO0O = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO(zipInputStream));
                    String[] strArr = JsonReader.f10250OoooO00;
                    oooOO0O = OooO0o(new com.airbnb.lottie.parser.moshi.OooO00o(o0ooooOooO0OO), null, false).f10248OooO00o;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (oooOO0O == null) {
                return new o0OoOo0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<OooOo> it = oooOO0O.f10044OooO0Oo.values().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.f10076OooO0OO.equals(str2));
                if (next != null) {
                    next.f10077OooO0Oo = o000O0Oo.OooO0o0((Bitmap) entry.getValue(), next.f10074OooO00o, next.f10075OooO0O0);
                }
            }
            for (Map.Entry<String, OooOo> entry2 : oooOO0O.f10044OooO0Oo.entrySet()) {
                if (entry2.getValue().f10077OooO0Oo == null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("There is no image for ");
                    sbOooO0o0.append(entry2.getValue().f10076OooO0OO);
                    return new o0OoOo0<>((Throwable) new IllegalStateException(sbOooO0o0.toString()));
                }
            }
            if (str != null) {
                o00O.f33854OooO0O0.OooO00o(str, oooOO0O);
            }
            return new o0OoOo0<>(oooOO0O);
        } catch (IOException e) {
            return new o0OoOo0<>((Throwable) e);
        }
    }

    public static String OooOOO0(Context context, @RawRes int i) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("rawRes");
        sbOooO0o0.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sbOooO0o0.append(i);
        return sbOooO0o0.toString();
    }
}
