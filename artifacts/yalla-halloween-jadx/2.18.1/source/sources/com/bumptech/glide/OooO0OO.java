package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p214o00oO0.o00OO000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0O000O;
import p219o00oO0O0.o0O00o0;
import p219o00oO0O0.o0O0o;
import p219o00oO0O0.o0oOOo;
import p221o00oOO.o0000O;
import p221o00oOO.o0000O0;
import p221o00oOO.o0000O00;
import p221o00oOO.o0000O0O;
import p221o00oOO.o0000oo;
import p221o00oOO.o000OO;
import p221o00oOO.o00Oo0;
import p221o00oOO.o00Ooo;
import p221o00oOO.o00oO0o;
import p221o00oOO.o0OOO0o;
import p221o00oOO.o0Oo0oo;
import p221o00oOO.o0ooOOo;
import p221o00oOO.oo000o;
import p222o00oOOO0.o00OOOO0;
import p222o00oOOO0.o00OOOOo;
import p222o00oOOO0.o00Oo00;
import p222o00oOOO0.o0oOO;
import p224o00oOOOo.oO;
import p224o00oOOOo.oO0O0;
import p224o00oOOOo.oO0O00o0;
import p224o00oOOOo.oO0O00oO;
import p224o00oOOOo.oO0O0Oo0;
import p224o00oOOOo.oO0OO0O;
import p224o00oOOOo.oO0oO000;
import p224o00oOOOo.oOO00;
import p224o00oOOOo.oOO0000;
import p224o00oOOOo.oOO000o;
import p224o00oOOOo.oOo0o0oO;
import p226o00oOOo0.oo00oO;
import p227o00oOOoO.oOO0O000;
import p227o00oOOoO.oOO0O00O;
import p229o00oOo00.OooOo00;
import p231o00oOo0o.o000OOo;
import p231o00oOo0o.o00O0O;
import p232o00oOoO.o00OO0O0;
import p232o00oOoO.o00OO0OO;
import p233o00oOoO0.o0O000;
import p233o00oOoO0.o0O00000;
import p234o00oOoOO.oOO0O0O;
import p235o00oOoOo.oOOO00;
import p238o00oOooO.O0O0;
import p238o00oOooO.oOOO0OOO;
import p238o00oOooO.oOOOOo0O;
import p238o00oOooO.oOOo0000;
import p238o00oOooO.oo00;
import p243o00oo00O.o000O000;
import p555o0oOOo.o00000O;
import p555o0oOOo.o00000OO;
import p555o0oOOo.o0000Ooo;
import p642o0ooOO.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static volatile boolean f12369OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile OooO0OO f12370o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO f12371Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00OO000 f12372Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oOOo f12373Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00000OO f12374Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o00O0O f12375OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0O00o0 f12376OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Registry f12377OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o000OOo f12378OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @GuardedBy("managers")
    public final List<OooOOO> f12379OoooOO0 = new ArrayList();

    public interface OooO00o {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public OooO0OO(@NonNull Context context, @NonNull o00OO000 o00oo001, @NonNull o00000OO o00000oo2, @NonNull o0oOOo o0oooo2, @NonNull o0O00o0 o0o00o1, @NonNull o000OOo o000ooo2, @NonNull o00O0O o00o0o2, int i, @NonNull OooO00o oooO00o, @NonNull Map<Class<?>, OooOOOO<?, ?>> map, @NonNull List<oOO0O0O<Object>> list, OooOO0 oooOO1) {
        o00000O0 oooO0OO;
        o00000O0 ooo0o0oo;
        this.f12372Oooo0o = o00oo001;
        this.f12373Oooo0oO = o0oooo2;
        this.f12376OoooO0 = o0o00o1;
        this.f12374Oooo0oo = o00000oo2;
        this.f12378OoooO0O = o000ooo2;
        this.f12375OoooO = o00o0o2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f12377OoooO00 = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        o00OO0OO o00oo0oo = registry.f12434OooO0oO;
        synchronized (o00oo0oo) {
            o00oo0oo.f33948OooO00o.add(defaultImageHeaderParser);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            oO0OO0O oo0oo0o = new oO0OO0O();
            o00OO0OO o00oo0oo2 = registry.f12434OooO0oO;
            synchronized (o00oo0oo2) {
                o00oo0oo2.f33948OooO00o.add(oo0oo0o);
            }
        }
        List<ImageHeaderParser> listOooO0o0 = registry.OooO0o0();
        oOOO0OOO oooo0ooo = new oOOO0OOO(context, listOooO0o0, o0oooo2, o0o00o1);
        oOO00 ooo00 = new oOO00(o0oooo2, new oOO00.OooOO0O());
        com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o2 = new com.bumptech.glide.load.resource.bitmap.OooO00o(registry.OooO0o0(), resources.getDisplayMetrics(), o0oooo2, o0o00o1);
        if (!oooOO1.OooO00o(OooO0o.OooO0O0.class) || i2 < 28) {
            oO0O0Oo0 oo0o0oo0 = new oO0O0Oo0(oooO00o2);
            oooO0OO = new com.bumptech.glide.load.resource.bitmap.OooO0OO(oooO00o2, o0o00o1);
            ooo0o0oo = oo0o0oo0;
        } else {
            oooO0OO = new oO0oO000();
            ooo0o0oo = new oOo0o0oO();
        }
        oOO0O000 ooo0o000 = new oOO0O000(context);
        o0000O00.OooO0OO oooO0OO2 = new o0000O00.OooO0OO(resources);
        o0000O00.OooO0o oooO0o = new o0000O00.OooO0o(resources);
        o0000O00.OooO0O0 oooO0O0 = new o0000O00.OooO0O0(resources);
        o0000O00.OooO00o oooO00o3 = new o0000O00.OooO00o(resources);
        oO0O0 oo0o0 = new oO0O0(o0o00o1);
        p230o00oOo0O.OooOO0O oooOO0O = new p230o00oOo0O.OooOO0O();
        p230o00oOo0O.OooOOOO oooOOOO = new p230o00oOo0O.OooOOOO();
        ContentResolver contentResolver = context.getContentResolver();
        oo000o oo000oVar = new oo000o();
        o00OO0O0 o00oo0o1 = registry.f12429OooO0O0;
        synchronized (o00oo0o1) {
            o00oo0o1.f33945OooO00o.add(new o00OO0O0.OooO00o<>(ByteBuffer.class, oo000oVar));
        }
        o0000oo o0000ooVar = new o0000oo(o0o00o1);
        o00OO0O0 o00oo0o2 = registry.f12429OooO0O0;
        synchronized (o00oo0o2) {
            o00oo0o2.f33945OooO00o.add(new o00OO0O0.OooO00o<>(InputStream.class, o0000ooVar));
        }
        registry.OooO0Oo("Bitmap", ByteBuffer.class, Bitmap.class, ooo0o0oo);
        registry.OooO0Oo("Bitmap", InputStream.class, Bitmap.class, oooO0OO);
        registry.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new oO(oooO00o2));
        registry.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ooo00);
        registry.OooO0Oo("Bitmap", AssetFileDescriptor.class, Bitmap.class, new oOO00(o0oooo2, new oOO00.OooO0OO()));
        o0000O0O.OooO00o<?> oooO00o4 = o0000O0O.OooO00o.f33713OooO00o;
        registry.OooO0O0(Bitmap.class, Bitmap.class, oooO00o4);
        registry.OooO0Oo("Bitmap", Bitmap.class, Bitmap.class, new oOO000o());
        registry.OooO0OO(Bitmap.class, oo0o0);
        registry.OooO0Oo("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new oO0O00o0(resources, ooo0o0oo));
        registry.OooO0Oo("BitmapDrawable", InputStream.class, BitmapDrawable.class, new oO0O00o0(resources, oooO0OO));
        registry.OooO0Oo("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new oO0O00o0(resources, ooo00));
        registry.OooO0OO(BitmapDrawable.class, new oO0O00oO(o0oooo2, oo0o0));
        registry.OooO0Oo("Gif", InputStream.class, oOOOOo0O.class, new O0O0(listOooO0o0, oooo0ooo, o0o00o1));
        registry.OooO0Oo("Gif", ByteBuffer.class, oOOOOo0O.class, oooo0ooo);
        registry.OooO0OO(oOOOOo0O.class, new oOOo0000());
        registry.OooO0O0(GifDecoder.class, GifDecoder.class, oooO00o4);
        registry.OooO0Oo("Bitmap", GifDecoder.class, Bitmap.class, new oo00(o0oooo2));
        registry.OooO0Oo("legacy_append", Uri.class, Drawable.class, ooo0o000);
        registry.OooO0Oo("legacy_append", Uri.class, Bitmap.class, new oOO0000(ooo0o000, o0oooo2));
        registry.OooO0oO(new oo00oO.OooO00o());
        registry.OooO0O0(File.class, ByteBuffer.class, new o00oO0o.OooO0O0());
        registry.OooO0O0(File.class, InputStream.class, new o0OOO0o.OooO());
        registry.OooO0Oo("legacy_append", File.class, File.class, new OooOo00());
        registry.OooO0O0(File.class, ParcelFileDescriptor.class, new o0OOO0o.OooO0O0());
        registry.OooO0O0(File.class, File.class, oooO00o4);
        registry.OooO0oO(new com.bumptech.glide.load.data.OooOo00.OooO00o(o0o00o1));
        registry.OooO0oO(new ParcelFileDescriptorRewinder.OooO00o());
        Class cls = Integer.TYPE;
        registry.OooO0O0(cls, InputStream.class, oooO0OO2);
        registry.OooO0O0(cls, ParcelFileDescriptor.class, oooO0O0);
        registry.OooO0O0(Integer.class, InputStream.class, oooO0OO2);
        registry.OooO0O0(Integer.class, ParcelFileDescriptor.class, oooO0O0);
        registry.OooO0O0(Integer.class, Uri.class, oooO0o);
        registry.OooO0O0(cls, AssetFileDescriptor.class, oooO00o3);
        registry.OooO0O0(Integer.class, AssetFileDescriptor.class, oooO00o3);
        registry.OooO0O0(cls, Uri.class, oooO0o);
        registry.OooO0O0(String.class, InputStream.class, new o0ooOOo.OooO0OO());
        registry.OooO0O0(Uri.class, InputStream.class, new o0ooOOo.OooO0OO());
        registry.OooO0O0(String.class, InputStream.class, new o0000O0.OooO0OO());
        registry.OooO0O0(String.class, ParcelFileDescriptor.class, new o0000O0.OooO0O0());
        registry.OooO0O0(String.class, AssetFileDescriptor.class, new o0000O0.OooO00o());
        registry.OooO0O0(Uri.class, InputStream.class, new o00Oo0.OooO0OO(context.getAssets()));
        registry.OooO0O0(Uri.class, ParcelFileDescriptor.class, new o00Oo0.OooO0O0(context.getAssets()));
        registry.OooO0O0(Uri.class, InputStream.class, new o00OOOOo.OooO00o(context));
        registry.OooO0O0(Uri.class, InputStream.class, new o00Oo00.OooO00o(context));
        if (i2 >= 29) {
            registry.OooO0O0(Uri.class, InputStream.class, new o0oOO.OooO0OO(context));
            registry.OooO0O0(Uri.class, ParcelFileDescriptor.class, new o0oOO.OooO0O0(context));
        }
        registry.OooO0O0(Uri.class, InputStream.class, new o000OO.OooO0o(contentResolver));
        registry.OooO0O0(Uri.class, ParcelFileDescriptor.class, new o000OO.OooO0O0(contentResolver));
        registry.OooO0O0(Uri.class, AssetFileDescriptor.class, new o000OO.OooO00o(contentResolver));
        registry.OooO0O0(Uri.class, InputStream.class, new o0000O.OooO00o());
        registry.OooO0O0(URL.class, InputStream.class, new o00oOOO0.o0O00o0.OooO00o());
        registry.OooO0O0(Uri.class, File.class, new o00oOO.o000OOo.OooO00o(context));
        registry.OooO0O0(o0Oo0oo.class, InputStream.class, new o00OOOO0.OooO00o());
        registry.OooO0O0(byte[].class, ByteBuffer.class, new o00Ooo.OooO00o());
        registry.OooO0O0(byte[].class, InputStream.class, new o00Ooo.OooO0o());
        registry.OooO0O0(Uri.class, Uri.class, oooO00o4);
        registry.OooO0O0(Drawable.class, Drawable.class, oooO00o4);
        registry.OooO0Oo("legacy_append", Drawable.class, Drawable.class, new oOO0O00O());
        registry.OooO0oo(Bitmap.class, BitmapDrawable.class, new p230o00oOo0O.OooOOO0(resources));
        registry.OooO0oo(Bitmap.class, byte[].class, oooOO0O);
        registry.OooO0oo(Drawable.class, byte[].class, new p230o00oOo0O.OooOOO(o0oooo2, oooOO0O, oooOOOO));
        registry.OooO0oo(oOOOOo0O.class, byte[].class, oooOOOO);
        if (i2 >= 23) {
            oOO00 ooo01 = new oOO00(o0oooo2, new oOO00.OooO0o());
            registry.OooO00o(ByteBuffer.class, Bitmap.class, ooo01);
            registry.OooO00o(ByteBuffer.class, BitmapDrawable.class, new oO0O00o0(resources, ooo01));
        }
        this.f12371Oooo = new OooO(context, o0o00o1, registry, new oOOO00(), oooO00o, map, list, o00oo001, oooOO1, i);
    }

    @NonNull
    public static OooOOO OooO(@NonNull Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return OooO0O0(context).f12378OoooO0O.OooO0O0(context);
    }

    @NonNull
    public static OooO0OO OooO0O0(@NonNull Context context) {
        if (f12370o000oOoO == null) {
            GeneratedAppGlideModule generatedAppGlideModuleOooO0OO = OooO0OO(context.getApplicationContext());
            synchronized (OooO0OO.class) {
                if (f12370o000oOoO == null) {
                    if (f12369OoooOOO) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    f12369OoooOOO = true;
                    OooO0o0(context, new OooO0o(), generatedAppGlideModuleOooO0OO);
                    f12369OoooOOO = false;
                }
            }
        }
        return f12370o000oOoO;
    }

    @Nullable
    public static GeneratedAppGlideModule OooO0OO(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            OooO0oO(e);
            throw null;
        } catch (InstantiationException e2) {
            OooO0oO(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            OooO0oO(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            OooO0oO(e4);
            throw null;
        }
    }

    @VisibleForTesting
    public static void OooO0o() {
        synchronized (OooO0OO.class) {
            if (f12370o000oOoO != null) {
                f12370o000oOoO.OooO0Oo().getApplicationContext().unregisterComponentCallbacks(f12370o000oOoO);
                f12370o000oOoO.f12372Oooo0o.OooO0oO();
            }
            f12370o000oOoO = null;
        }
    }

    @GuardedBy("Glide.class")
    public static void OooO0o0(@NonNull Context context, @NonNull OooO0o oooO0o, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.OooO0OO();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList<o0O00000> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(o0O000.OooO00o(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.OooO0Oo().isEmpty()) {
                Set<Class<?>> setOooO0Oo = generatedAppGlideModule.OooO0Oo();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o0O00000 o0o00000 = (o0O00000) it.next();
                    if (setOooO0Oo.contains(o0o00000.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + o0o00000);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (o0O00000 o0o00001 : arrayList) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Discovered GlideModule from manifest: ");
                    sbOooO0o0.append(o0o00001.getClass());
                    Log.d("Glide", sbOooO0o0.toString());
                }
            }
            oooO0o.f12392OooOOO = generatedAppGlideModule != null ? generatedAppGlideModule.OooO0o0() : null;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((o0O00000) it2.next()).OooO00o();
            }
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.OooO00o();
            }
            if (oooO0o.f12387OooO0oO == null) {
                int iOooO00o = o000OOo0.OooO00o();
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                }
                oooO0o.f12387OooO0oO = new o000OOo0(new ThreadPoolExecutor(iOooO00o, iOooO00o, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o000OOo0.OooO00o("source", false)));
            }
            if (oooO0o.f12388OooO0oo == null) {
                int i = o000OOo0.f48874Oooo0oo;
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                oooO0o.f12388OooO0oo = new o000OOo0(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o000OOo0.OooO00o("disk-cache", true)));
            }
            if (oooO0o.f12394OooOOOO == null) {
                int i2 = o000OOo0.OooO00o() >= 4 ? 2 : 1;
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
                oooO0o.f12394OooOOOO = new o000OOo0(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o000OOo0.OooO00o("animation", true)));
            }
            if (oooO0o.f12389OooOO0 == null) {
                oooO0o.f12389OooOO0 = new o0000Ooo(new o0000Ooo.OooO00o(applicationContext));
            }
            if (oooO0o.f12390OooOO0O == null) {
                oooO0o.f12390OooOO0O = new p231o00oOo0o.o00Ooo();
            }
            if (oooO0o.f12384OooO0Oo == null) {
                int i3 = oooO0o.f12389OooOO0.f44644OooO00o;
                if (i3 > 0) {
                    oooO0o.f12384OooO0Oo = new o0O000O(i3);
                } else {
                    oooO0o.f12384OooO0Oo = new o0O0o();
                }
            }
            if (oooO0o.f12386OooO0o0 == null) {
                oooO0o.f12386OooO0o0 = new p219o00oO0O0.o0O000(oooO0o.f12389OooOO0.f44647OooO0Oo);
            }
            if (oooO0o.f12385OooO0o == null) {
                oooO0o.f12385OooO0o = new o00000O(oooO0o.f12389OooOO0.f44645OooO0O0);
            }
            if (oooO0o.f12380OooO == null) {
                oooO0o.f12380OooO = new p555o0oOOo.o00000O0(applicationContext);
            }
            if (oooO0o.f12383OooO0OO == null) {
                oooO0o.f12383OooO0OO = new o00OO000(oooO0o.f12385OooO0o, oooO0o.f12380OooO, oooO0o.f12388OooO0oo, oooO0o.f12387OooO0oO, new o000OOo0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, o000OOo0.f48873Oooo0oO, TimeUnit.MILLISECONDS, new SynchronousQueue(), new o000OOo0.OooO00o("source-unlimited", false))), oooO0o.f12394OooOOOO);
            }
            List<oOO0O0O<Object>> list = oooO0o.f12395OooOOOo;
            if (list == null) {
                oooO0o.f12395OooOOOo = Collections.emptyList();
            } else {
                oooO0o.f12395OooOOOo = Collections.unmodifiableList(list);
            }
            OooOO0.OooO00o oooO00o = oooO0o.f12382OooO0O0;
            Objects.requireNonNull(oooO00o);
            OooOO0 oooOO1 = new OooOO0(oooO00o);
            OooO0OO oooO0OO = new OooO0OO(applicationContext, oooO0o.f12383OooO0OO, oooO0o.f12385OooO0o, oooO0o.f12384OooO0Oo, oooO0o.f12386OooO0o0, new o000OOo(oooO0o.f12392OooOOO, oooOO1), oooO0o.f12390OooOO0O, oooO0o.f12391OooOO0o, oooO0o.f12393OooOOO0, oooO0o.f12381OooO00o, oooO0o.f12395OooOOOo, oooOO1);
            for (o0O00000 o0o00002 : arrayList) {
                try {
                    o0o00002.OooO0O0(applicationContext, oooO0OO, oooO0OO.f12377OoooO00);
                } catch (AbstractMethodError e) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    sbOooO0o1.append(o0o00002.getClass().getName());
                    throw new IllegalStateException(sbOooO0o1.toString(), e);
                }
            }
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.OooO0O0(applicationContext, oooO0OO, oooO0OO.f12377OoooO00);
            }
            applicationContext.registerComponentCallbacks(oooO0OO);
            f12370o000oOoO = oooO0OO;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    public static void OooO0oO(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final void OooO00o() {
        o000O000.OooO00o();
        ((p243o00oo00O.o000OO) this.f12374Oooo0oo).OooO0o0(0L);
        this.f12373Oooo0oO.OooO0o0();
        this.f12376OoooO0.OooO0o0();
    }

    @NonNull
    public final Context OooO0Oo() {
        return this.f12371Oooo.getBaseContext();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    public final void OooO0oo(OooOOO oooOOO) {
        synchronized (this.f12379OoooOO0) {
            if (!this.f12379OoooOO0.contains(oooOOO)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f12379OoooOO0.remove(oooOOO);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        OooO00o();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        o000O000.OooO00o();
        synchronized (this.f12379OoooOO0) {
            Iterator it = this.f12379OoooOO0.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull((OooOOO) it.next());
            }
        }
        o00000O o00000o = (o00000O) this.f12374Oooo0oo;
        Objects.requireNonNull(o00000o);
        if (i >= 40) {
            o00000o.OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (o00000o) {
                j = o00000o.f34182OooO0O0;
            }
            o00000o.OooO0o0(j / 2);
        }
        this.f12373Oooo0oO.OooO00o(i);
        this.f12376OoooO0.OooO00o(i);
    }
}
