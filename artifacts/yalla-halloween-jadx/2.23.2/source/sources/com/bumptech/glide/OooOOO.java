package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o00OoO.o00O0O;
import o00OoO.o0Oo0oo;
import o00OoO.oo0o0Oo;
import p154o00Oo0oo.o0O0O00;
import p160o00OoOOO.Oooo0;
import p160o00OoOOO.Oooo000;
import p160o00OoOOO.o000000O;
import p160o00OoOOO.o00000O0;
import p160o00OoOOO.o00000OO;
import p160o00OoOOO.o0000O0;
import p160o00OoOOO.o0000O00;
import p160o00OoOOO.o0ooOOo;
import p161o00OoOOo.o000OO;
import p163o00OoOo0.o0OO00O;
import p165o00OoOoo.o00;
import p165o00OoOoo.o000OO00;
import p165o00OoOoo.o00O0000;
import p165o00OoOoo.o00O000o;
import p165o00OoOoo.o00O00O;
import p167o00Ooo0.o00oO0o;
import p167o00Ooo0.o0OOO0o;
import p168o00Ooo00.o00Oo0;
import p168o00Ooo00.o00Ooo;
import p168o00Ooo00.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {
    public static Registry OooO00o(OooO0OO oooO0OO, List<o0OOO0o> list, @Nullable o00oO0o o00oo0o2) {
        o0O0O00 o00oo0o3;
        o0O0O00 oooO0OO2;
        p156o00OoO00.OooOO0 oooOO1 = oooO0OO.f12944OooO0o0;
        OooO oooO = oooO0OO.f12945OooO0oO;
        Context applicationContext = oooO.getApplicationContext();
        OooOO0 oooOO2 = oooO.f12937OooO0oo;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        p169o00Ooo0O.OooOO0O oooOO0O = registry.f13008OooO0oO;
        synchronized (oooOO0O) {
            oooOO0O.f38234OooO00o.add(defaultImageHeaderParser);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.OooO(new p160o00OoOOO.o0O0O00());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListOooO0o = registry.OooO0o();
        p156o00OoO00.OooO0o oooO0o = oooO0OO.f12946OooO0oo;
        o000OO00 o000oo01 = new o000OO00(applicationContext, arrayListOooO0o, oooOO1, oooO0o);
        o0O0O00 o0000o1 = new o0000O0(oooOO1, new o0000O0.OooOO0O());
        com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o = new com.bumptech.glide.load.resource.bitmap.OooO00o(registry.OooO0o(), resources.getDisplayMetrics(), oooOO1, oooO0o);
        if (i < 28 || !oooOO2.f12965OooO00o.containsKey(OooO0o.OooO0O0.class)) {
            o00oo0o3 = new p160o00OoOOO.o00oO0o(oooO00o);
            oooO0OO2 = new com.bumptech.glide.load.resource.bitmap.OooO0OO(oooO00o, oooO0o);
        } else {
            oooO0OO2 = new o000000O();
            o00oo0o3 = new o0ooOOo();
        }
        if (i >= 28) {
            registry.OooO0Oo(new o00OoOo0.o00oO0o.OooO0OO(new p163o00OoOo0.o00oO0o(arrayListOooO0o, oooO0o)), InputStream.class, Drawable.class, "Animation");
            registry.OooO0Oo(new o00OoOo0.o00oO0o.OooO0O0(new p163o00OoOo0.o00oO0o(arrayListOooO0o, oooO0o)), ByteBuffer.class, Drawable.class, "Animation");
        }
        o0OO00O o0oo00o2 = new o0OO00O(applicationContext);
        Oooo0 oooo0 = new Oooo0(oooO0o);
        o0OoOo0 o0oooo1 = new o0OoOo0();
        o00Ooo o00ooo2 = new o00Ooo();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.OooO0O0(ByteBuffer.class, new o00OoO.OooO0OO());
        registry.OooO0O0(InputStream.class, new o00OoO.o0OOO0o(oooO0o));
        registry.OooO0Oo(o00oo0o3, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(oooO0OO2, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.OooO0Oo(new o00000O0(oooO00o), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        registry.OooO0Oo(new o0000O0(oooOO1, new o0000O0.OooO0OO()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(o0000o1, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        o00O0O o00o0o2 = o00OoO.o0OO00O.OooO00o.f37908OooO00o;
        registry.OooO00o(Bitmap.class, Bitmap.class, o00o0o2);
        registry.OooO0Oo(new o0000O00(), Bitmap.class, Bitmap.class, "Bitmap");
        registry.OooO0OO(Bitmap.class, oooo0);
        registry.OooO0Oo(new p160o00OoOOO.OooOo(resources, o00oo0o3), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0Oo(new p160o00OoOOO.OooOo(resources, oooO0OO2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0Oo(new p160o00OoOOO.OooOo(resources, o0000o1), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0OO(BitmapDrawable.class, new Oooo000(oooOO1, oooo0));
        registry.OooO0Oo(new o00O00O(arrayListOooO0o, o000oo01, oooO0o), InputStream.class, o00.class, "Animation");
        registry.OooO0Oo(o000oo01, ByteBuffer.class, o00.class, "Animation");
        registry.OooO0OO(o00.class, new o00O0000());
        registry.OooO00o(GifDecoder.class, GifDecoder.class, o00o0o2);
        registry.OooO0Oo(new o00O000o(oooOO1), GifDecoder.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(o0oo00o2, Uri.class, Drawable.class, "legacy_append");
        registry.OooO0Oo(new o00000OO(o0oo00o2, oooOO1), Uri.class, Bitmap.class, "legacy_append");
        registry.OooOO0(new o000OO.OooO00o());
        registry.OooO00o(File.class, ByteBuffer.class, new o00OoO.OooO0o.OooO0O0());
        registry.OooO00o(File.class, InputStream.class, new o00OoO.OooOO0O.OooO());
        registry.OooO0Oo(new p162o00OoOo.o00Ooo(), File.class, File.class, "legacy_append");
        registry.OooO00o(File.class, ParcelFileDescriptor.class, new o00OoO.OooOO0O.OooO0O0());
        registry.OooO00o(File.class, File.class, o00o0o2);
        registry.OooOO0(new com.bumptech.glide.load.data.OooOo00.OooO00o(oooO0o));
        if (!"robolectric".equals(str)) {
            registry.OooOO0(new ParcelFileDescriptorRewinder.OooO00o());
        }
        o00O0O oooO0OO3 = new o00OoO.OooOO0.OooO0OO(applicationContext);
        o00O0O oooO00o2 = new o00OoO.OooOO0.OooO00o(applicationContext);
        o00O0O oooO0O0 = new o00OoO.OooOO0.OooO0O0(applicationContext);
        Class cls = Integer.TYPE;
        registry.OooO00o(cls, InputStream.class, oooO0OO3);
        registry.OooO00o(Integer.class, InputStream.class, oooO0OO3);
        registry.OooO00o(cls, AssetFileDescriptor.class, oooO00o2);
        registry.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o2);
        registry.OooO00o(cls, Drawable.class, oooO0O0);
        registry.OooO00o(Integer.class, Drawable.class, oooO0O0);
        registry.OooO00o(Uri.class, InputStream.class, new o00OoO.o0ooOOo.OooO0O0(applicationContext));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new o00OoO.o0ooOOo.OooO00o(applicationContext));
        o00O0O oooO0OO4 = new o00OoO.o00oO0o.OooO0OO(resources);
        o00O0O oooO00o3 = new o00OoO.o00oO0o.OooO00o(resources);
        o00O0O oooO0O1 = new o00OoO.o00oO0o.OooO0O0(resources);
        registry.OooO00o(Integer.class, Uri.class, oooO0OO4);
        registry.OooO00o(cls, Uri.class, oooO0OO4);
        registry.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o3);
        registry.OooO00o(cls, AssetFileDescriptor.class, oooO00o3);
        registry.OooO00o(Integer.class, InputStream.class, oooO0O1);
        registry.OooO00o(cls, InputStream.class, oooO0O1);
        registry.OooO00o(String.class, InputStream.class, new o00OoO.OooO.OooO0OO());
        registry.OooO00o(Uri.class, InputStream.class, new o00OoO.OooO.OooO0OO());
        registry.OooO00o(String.class, InputStream.class, new o0Oo0oo.OooO0OO());
        registry.OooO00o(String.class, ParcelFileDescriptor.class, new o0Oo0oo.OooO0O0());
        registry.OooO00o(String.class, AssetFileDescriptor.class, new o0Oo0oo.OooO00o());
        registry.OooO00o(Uri.class, InputStream.class, new o00OoO.OooO00o.OooO0OO(applicationContext.getAssets()));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new o00OoO.OooO00o.OooO0O0(applicationContext.getAssets()));
        registry.OooO00o(Uri.class, InputStream.class, new o00OoOO0.OooOo00.OooO00o(applicationContext));
        registry.OooO00o(Uri.class, InputStream.class, new o00OoOO0.OooOo.OooO00o(applicationContext));
        if (i >= 29) {
            registry.OooO00o(Uri.class, InputStream.class, new o00OoOO0.Oooo000.OooO0OO(applicationContext));
            registry.OooO00o(Uri.class, ParcelFileDescriptor.class, new o00OoOO0.Oooo000.OooO0O0(applicationContext));
        }
        registry.OooO00o(Uri.class, InputStream.class, new oo0o0Oo.OooO0o(contentResolver));
        registry.OooO00o(Uri.class, ParcelFileDescriptor.class, new oo0o0Oo.OooO0O0(contentResolver));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new oo0o0Oo.OooO00o(contentResolver));
        registry.OooO00o(Uri.class, InputStream.class, new o00OoO.o0O0O00.OooO00o());
        registry.OooO00o(URL.class, InputStream.class, new o00OoOO0.Oooo0.OooO00o());
        registry.OooO00o(Uri.class, File.class, new o00OoO.OooOo.OooO00o(applicationContext));
        registry.OooO00o(o00OoO.OooOOO0.class, InputStream.class, new o00OoOO0.OooOOOO.OooO00o());
        registry.OooO00o(byte[].class, ByteBuffer.class, new o00OoO.OooO0O0.OooO00o());
        registry.OooO00o(byte[].class, InputStream.class, new o00OoO.OooO0O0.OooO0o());
        registry.OooO00o(Uri.class, Uri.class, o00o0o2);
        registry.OooO00o(Drawable.class, Drawable.class, o00o0o2);
        registry.OooO0Oo(new p163o00OoOo0.oo0o0Oo(), Drawable.class, Drawable.class, "legacy_append");
        registry.OooOO0O(Bitmap.class, BitmapDrawable.class, new p168o00Ooo00.o00O0O(resources));
        registry.OooOO0O(Bitmap.class, byte[].class, o0oooo1);
        registry.OooOO0O(Drawable.class, byte[].class, new o00Oo0(oooOO1, o0oooo1, o00ooo2));
        registry.OooOO0O(o00.class, byte[].class, o00ooo2);
        o0O0O00 o0000o2 = new o0000O0(oooOO1, new o0000O0.OooO0o());
        registry.OooO0Oo(o0000o2, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.OooO0Oo(new p160o00OoOOO.OooOo(resources, o0000o2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        for (o0OOO0o o0ooo0o2 : list) {
            try {
                o0ooo0o2.OooO0O0(applicationContext, oooO0OO, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(o0ooo0o2.getClass().getName()), e);
            }
        }
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0O0(applicationContext, oooO0OO, registry);
        }
        return registry;
    }
}
