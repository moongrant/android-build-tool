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
import o00OO00O.o00O0O;
import o00OO00O.o0O0O00;
import o00OO00O.o0OO00O;
import o00OO00O.o0OOO0o;
import o00OO00O.o0Oo0oo;
import o00OO0O0.o000OOo;
import o00OO0O0.o00Ooo;
import o00OO0O0.o00oO0o;
import o00OO0O0.o0OoOo0;
import o00OO0O0.oo0o0Oo;
import p126o00O0oOo.o00000O0;
import p129o00O0ooo.o0000;
import p129o00O0ooo.o0000oo;
import p130o00OO00o.o00000;
import p130o00OO00o.o000000;
import p132o00OO0o0.o000000O;
import p133o00OO0oO.Oooo0;
import p133o00OO0oO.Oooo000;
import p133o00OO0oO.o000oOoO;
import p134o00OO0oo.o0ooOOo;
import p134o00OO0oo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {
    public static Registry OooO00o(OooO0OO oooO0OO, List<o0ooOOo> list, @Nullable oo000o oo000oVar) {
        o00000O0 oooOOOO;
        o00000O0 oooO0OO2;
        o0000oo o0000ooVar = oooO0OO.f9853OooO0o0;
        OooO oooO = oooO0OO.f9854OooO0oO;
        Context applicationContext = oooO.getApplicationContext();
        OooOO0 oooOO1 = oooO.f9846OooO0oo;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        oo0O.OooO0O0 oooO0O0 = registry.f9917OooO0oO;
        synchronized (oooO0O0) {
            oooO0O0.f60887OooO00o.add(defaultImageHeaderParser);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.OooO(new o0OoOo0());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListOooO0o = registry.OooO0o();
        o0000 o0000Var = oooO0OO.f9855OooO0oo;
        p131o00OO0o.OooO0OO oooO0OO3 = new p131o00OO0o.OooO0OO(applicationContext, arrayListOooO0o, o0000ooVar, o0000Var);
        o00000O0 o000ooo2 = new o000OOo(o0000ooVar, new o000OOo.OooOO0O());
        com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o = new com.bumptech.glide.load.resource.bitmap.OooO00o(registry.OooO0o(), resources.getDisplayMetrics(), o0000ooVar, o0000Var);
        if (i < 28 || !oooOO1.f9874OooO00o.containsKey(OooO0o.OooO0O0.class)) {
            oooOOOO = new o00OO0O0.OooOOOO(oooO00o);
            oooO0OO2 = new com.bumptech.glide.load.resource.bitmap.OooO0OO(oooO00o, o0000Var);
        } else {
            oooO0OO2 = new o00Ooo();
            oooOOOO = new o00OO0O0.OooOo00();
        }
        if (i >= 28) {
            registry.OooO0Oo(new o00OO0OO.OooOO0O.OooO0OO(new o00OO0OO.OooOO0O(arrayListOooO0o, o0000Var)), InputStream.class, Drawable.class, "Animation");
            registry.OooO0Oo(new o00OO0OO.OooOO0O.OooO0O0(new o00OO0OO.OooOO0O(arrayListOooO0o, o0000Var)), ByteBuffer.class, Drawable.class, "Animation");
        }
        o00OO0OO.OooOo00 oooOo00 = new o00OO0OO.OooOo00(applicationContext);
        o00OO0O0.OooO0OO oooO0OO4 = new o00OO0O0.OooO0OO(o0000Var);
        Oooo000 oooo000 = new Oooo000();
        p133o00OO0oO.o0OoOo0 o0oooo0 = new p133o00OO0oO.o0OoOo0();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.OooO0O0(ByteBuffer.class, new o00OO00O.OooO0OO());
        registry.OooO0O0(InputStream.class, new o0OOO0o(o0000Var));
        registry.OooO0Oo(oooOOOO, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(oooO0OO2, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.OooO0Oo(new o00oO0o(oooO00o), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        registry.OooO0Oo(o000ooo2, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(new o000OOo(o0000ooVar, new o000OOo.OooO0OO()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        o00O0O o00o0o2 = o0OO00O.OooO00o.f37146OooO00o;
        registry.OooO00o(Bitmap.class, Bitmap.class, o00o0o2);
        registry.OooO0Oo(new oo0o0Oo(), Bitmap.class, Bitmap.class, "Bitmap");
        registry.OooO0OO(Bitmap.class, oooO0OO4);
        registry.OooO0Oo(new o00OO0O0.OooO00o(resources, oooOOOO), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0Oo(new o00OO0O0.OooO00o(resources, oooO0OO2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0Oo(new o00OO0O0.OooO00o(resources, o000ooo2), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        registry.OooO0OO(BitmapDrawable.class, new o00OO0O0.OooO0O0(o0000ooVar, oooO0OO4));
        registry.OooO0Oo(new p131o00OO0o.OooOo(arrayListOooO0o, oooO0OO3, o0000Var), InputStream.class, p131o00OO0o.OooO.class, "Animation");
        registry.OooO0Oo(oooO0OO3, ByteBuffer.class, p131o00OO0o.OooO.class, "Animation");
        registry.OooO0OO(p131o00OO0o.OooO.class, new p131o00OO0o.OooOO0());
        registry.OooO00o(GifDecoder.class, GifDecoder.class, o00o0o2);
        registry.OooO0Oo(new p131o00OO0o.OooOOOO(o0000ooVar), GifDecoder.class, Bitmap.class, "Bitmap");
        registry.OooO0Oo(oooOo00, Uri.class, Drawable.class, "legacy_append");
        registry.OooO0Oo(new o00OO0O0.o0OOO0o(oooOo00, o0000ooVar), Uri.class, Bitmap.class, "legacy_append");
        registry.OooOO0(new o00OO0O.OooO00o.C0432OooO00o());
        registry.OooO00o(File.class, ByteBuffer.class, new o00OO00O.OooO0o.OooO0O0());
        registry.OooO00o(File.class, InputStream.class, new o00OO00O.OooOO0O.OooO());
        registry.OooO0Oo(new o000000O(), File.class, File.class, "legacy_append");
        registry.OooO00o(File.class, ParcelFileDescriptor.class, new o00OO00O.OooOO0O.OooO0O0());
        registry.OooO00o(File.class, File.class, o00o0o2);
        registry.OooOO0(new com.bumptech.glide.load.data.OooOo00.OooO00o(o0000Var));
        if (!"robolectric".equals(str)) {
            registry.OooOO0(new ParcelFileDescriptorRewinder.OooO00o());
        }
        o00O0O oooO0OO5 = new o00OO00O.OooOO0.OooO0OO(applicationContext);
        o00O0O oooO00o2 = new o00OO00O.OooOO0.OooO00o(applicationContext);
        o00O0O oooO0O1 = new o00OO00O.OooOO0.OooO0O0(applicationContext);
        Class cls = Integer.TYPE;
        registry.OooO00o(cls, InputStream.class, oooO0OO5);
        registry.OooO00o(Integer.class, InputStream.class, oooO0OO5);
        registry.OooO00o(cls, AssetFileDescriptor.class, oooO00o2);
        registry.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o2);
        registry.OooO00o(cls, Drawable.class, oooO0O1);
        registry.OooO00o(Integer.class, Drawable.class, oooO0O1);
        registry.OooO00o(Uri.class, InputStream.class, new o00OO00O.o0ooOOo.OooO0O0(applicationContext));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new o00OO00O.o0ooOOo.OooO00o(applicationContext));
        o00O0O oooO0OO6 = new o00OO00O.o00oO0o.OooO0OO(resources);
        o00O0O oooO00o3 = new o00OO00O.o00oO0o.OooO00o(resources);
        o00O0O oooO0O2 = new o00OO00O.o00oO0o.OooO0O0(resources);
        registry.OooO00o(Integer.class, Uri.class, oooO0OO6);
        registry.OooO00o(cls, Uri.class, oooO0OO6);
        registry.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o3);
        registry.OooO00o(cls, AssetFileDescriptor.class, oooO00o3);
        registry.OooO00o(Integer.class, InputStream.class, oooO0O2);
        registry.OooO00o(cls, InputStream.class, oooO0O2);
        registry.OooO00o(String.class, InputStream.class, new o00OO00O.OooO.OooO0OO());
        registry.OooO00o(Uri.class, InputStream.class, new o00OO00O.OooO.OooO0OO());
        registry.OooO00o(String.class, InputStream.class, new o0Oo0oo.OooO0OO());
        registry.OooO00o(String.class, ParcelFileDescriptor.class, new o0Oo0oo.OooO0O0());
        registry.OooO00o(String.class, AssetFileDescriptor.class, new o0Oo0oo.OooO00o());
        registry.OooO00o(Uri.class, InputStream.class, new o00OO00O.OooO00o.OooO0OO(applicationContext.getAssets()));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new o00OO00O.OooO00o.OooO0O0(applicationContext.getAssets()));
        registry.OooO00o(Uri.class, InputStream.class, new o000000.OooO00o(applicationContext));
        registry.OooO00o(Uri.class, InputStream.class, new o00OO00o.o000000O.OooO00o(applicationContext));
        if (i >= 29) {
            registry.OooO00o(Uri.class, InputStream.class, new o00000.OooO0OO(applicationContext));
            registry.OooO00o(Uri.class, ParcelFileDescriptor.class, new o00000.OooO0O0(applicationContext));
        }
        registry.OooO00o(Uri.class, InputStream.class, new o00OO00O.oo0o0Oo.OooO0o(contentResolver));
        registry.OooO00o(Uri.class, ParcelFileDescriptor.class, new o00OO00O.oo0o0Oo.OooO0O0(contentResolver));
        registry.OooO00o(Uri.class, AssetFileDescriptor.class, new o00OO00O.oo0o0Oo.OooO00o(contentResolver));
        registry.OooO00o(Uri.class, InputStream.class, new o0O0O00.OooO00o());
        registry.OooO00o(URL.class, InputStream.class, new o00OO00o.o00000O0.OooO00o());
        registry.OooO00o(Uri.class, File.class, new o00OO00O.OooOo.OooO00o(applicationContext));
        registry.OooO00o(o00OO00O.OooOOO0.class, InputStream.class, new o00OO00o.o000OOo.OooO00o());
        registry.OooO00o(byte[].class, ByteBuffer.class, new o00OO00O.OooO0O0.OooO00o());
        registry.OooO00o(byte[].class, InputStream.class, new o00OO00O.OooO0O0.OooO0o());
        registry.OooO00o(Uri.class, Uri.class, o00o0o2);
        registry.OooO00o(Drawable.class, Drawable.class, o00o0o2);
        registry.OooO0Oo(new o00OO0OO.OooOo(), Drawable.class, Drawable.class, "legacy_append");
        registry.OooOO0O(Bitmap.class, BitmapDrawable.class, new Oooo0(resources));
        registry.OooOO0O(Bitmap.class, byte[].class, oooo000);
        registry.OooOO0O(Drawable.class, byte[].class, new o000oOoO(o0000ooVar, oooo000, o0oooo0));
        registry.OooOO0O(p131o00OO0o.OooO.class, byte[].class, o0oooo0);
        o00000O0 o000ooo3 = new o000OOo(o0000ooVar, new o000OOo.OooO0o());
        registry.OooO0Oo(o000ooo3, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.OooO0Oo(new o00OO0O0.OooO00o(resources, o000ooo3), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        for (o0ooOOo o0ooooo : list) {
            try {
                o0ooooo.OooO0O0(applicationContext, oooO0OO, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(o0ooooo.getClass().getName()), e);
            }
        }
        if (oo000oVar != null) {
            oo000oVar.OooO0O0(applicationContext, oooO0OO, registry);
        }
        return registry;
    }
}
