package com.opensource.svgaplayer;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.SVGACache;
import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o0OO0O0O.OooOo00;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p022Oooo00O.o00O00OO;
import p022Oooo00O.o00OOOO0;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSVGAParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAParser.kt\ncom/opensource/svgaplayer/SVGAParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,566:1\n1#2:567\n*E\n"})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f20768OooO0OO = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ExecutorService f20769OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f20770OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f20771OooO0O0;

    public static class OooO00o {
    }

    public interface OooO0O0 {
        void OooO00o(@NotNull o00Ooo o00ooo2);

        void onError();
    }

    static {
        new OooO0OO(null);
        f20769OooO0Oo = Executors.newCachedThreadPool(new OooOo00());
    }

    public OooO0OO(@Nullable Context context) {
        this.f20770OooO00o = context != null ? context.getApplicationContext() : null;
        SVGACache.Type type = SVGACache.f20784OooO00o;
        SVGACache.Type type2 = SVGACache.Type.DEFAULT;
        Intrinsics.checkNotNullParameter(type2, "type");
        if (!(!Intrinsics.areEqual("/", SVGACache.OooO0o0()) && new File(SVGACache.OooO0o0()).exists()) && context != null) {
            SVGACache.f20785OooO0O0 = context.getCacheDir().getAbsolutePath() + "/svga/";
            File file = new File(SVGACache.OooO0o0());
            File file2 = file.exists() ^ true ? file : null;
            if (file2 != null) {
                file2.mkdirs();
            }
            SVGACache.f20784OooO00o = type2;
        }
        this.f20771OooO0O0 = new OooO00o();
    }

    public static boolean OooO(byte[] bArr) {
        return bArr.length > 4 && bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 3 && bArr[3] == 4;
    }

    public static /* synthetic */ void OooO0Oo(OooO0OO oooO0OO, FileInputStream fileInputStream, String str, OooO0O0 oooO0O0, boolean z, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        oooO0OO.OooO0OO(fileInputStream, str, oooO0O0, z, null);
    }

    public static byte[] OooO0o(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int iInflate = inflater.inflate(bArr2, 0, 2048);
                if (iInflate <= 0) {
                    inflater.end();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(byteArrayOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static void OooO0o0(File file, String str) throws IOException {
        String dstDirCanonicalPath = new File(str).getCanonicalPath();
        String outputFileCanonicalPath = file.getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(outputFileCanonicalPath, "outputFileCanonicalPath");
        Intrinsics.checkNotNullExpressionValue(dstDirCanonicalPath, "dstDirCanonicalPath");
        if (!StringsKt__StringsJVMKt.startsWith$default(outputFileCanonicalPath, dstDirCanonicalPath, false, 2, null)) {
            throw new IOException(o00O00OO.OooO00o("Found Zip Path Traversal Vulnerability with ", dstDirCanonicalPath));
        }
    }

    public static void OooO0oO(final OooO0O0 oooO0O0, final o00Ooo o00ooo2, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o0OO0O0O.Oooo000
            @Override // java.lang.Runnable
            public final void run() {
                o00Ooo videoItem = o00ooo2;
                Intrinsics.checkNotNullParameter(videoItem, "$videoItem");
                String msg = "================ " + str + " parser complete ================";
                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter(msg, "msg");
                com.opensource.svgaplayer.OooO0OO.OooO0O0 oooO0O1 = oooO0O0;
                if (oooO0O1 != null) {
                    oooO0O1.OooO00o(videoItem);
                }
            }
        });
    }

    public static void OooO0oo(Exception error, OooO0O0 oooO0O0, String str) {
        error.printStackTrace();
        String msg = "================ " + str + " parser error ================";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        String msg2 = str + " parse error";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        Intrinsics.checkNotNullParameter(error, "error");
        new Handler(Looper.getMainLooper()).post(new o00OOOO0(oooO0O0, 3));
    }

    public static byte[] OooOO0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStream.read(bArr, 0, 2048);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public static void OooOO0O(ByteArrayInputStream byteArrayInputStream, String str) throws Exception {
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("================ unzip prepare ================", "msg");
        File fileOooO00o = SVGACache.OooO00o(str);
        fileOooO00o.mkdirs();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(zipInputStream, null);
                            CloseableKt.closeFinally(bufferedInputStream, null);
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue(nextEntry, "zipInputStream.nextEntry ?: break");
                        String name = nextEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "zipItem.name");
                        if (!StringsKt__StringsKt.contains$default(name, "../", false, 2, (Object) null)) {
                            String name2 = nextEntry.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "zipItem.name");
                            if (!StringsKt__StringsKt.contains$default(name2, "/", false, 2, (Object) null)) {
                                File file = new File(fileOooO00o, nextEntry.getName());
                                String absolutePath = fileOooO00o.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath, "cacheDir.absolutePath");
                                OooO0o0(file, absolutePath);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int i = zipInputStream.read(bArr);
                                        if (i <= 0) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, i);
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("================ unzip complete ================", "msg");
                                    zipInputStream.closeEntry();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(zipInputStream, th3);
                            throw th4;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(bufferedInputStream, th);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (Exception error) {
            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("================ unzip error ================", "msg");
            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("error", "msg");
            Intrinsics.checkNotNullParameter(error, "error");
            SVGACache.Type type = SVGACache.f20784OooO00o;
            String absolutePath2 = fileOooO00o.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "cacheDir.absolutePath");
            SVGACache.OooO0Oo(absolutePath2);
            fileOooO00o.delete();
            throw error;
        }
    }

    public final void OooO00o(@NotNull final String name, @Nullable final OooO0O0 oooO0O0) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f20770OooO00o == null) {
            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("在配置 SVGAParser context 前, 无法解析 SVGA 文件。", "msg");
            return;
        }
        String msg = "================ decode " + name + " from assets ================";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        f20769OooO0Oo.execute(new Runnable() { // from class: o0OO0O0O.OooOOO
            @Override // java.lang.Runnable
            public final void run() {
                AssetManager assets;
                InputStream inputStreamOpen;
                String name2 = name;
                com.opensource.svgaplayer.OooO0OO.OooO0O0 oooO0O1 = oooO0O0;
                com.opensource.svgaplayer.OooO0OO this$0 = this.f42373OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(name2, "$name");
                try {
                    Context context = this$0.f20770OooO00o;
                    if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open(name2)) == null) {
                        return;
                    }
                    SVGACache.Type type = SVGACache.f20784OooO00o;
                    this$0.OooO0OO(inputStreamOpen, SVGACache.OooO0O0("file:///assets/" + name2), oooO0O1, true, name2);
                } catch (Exception e) {
                    this$0.getClass();
                    com.opensource.svgaplayer.OooO0OO.OooO0oo(e, oooO0O1, name2);
                }
            }
        });
    }

    public final void OooO0O0(String str, OooO0O0 oooO0O0, String str2) {
        String msg = "================ decode " + str2 + " from cache ================";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        String msg2 = "decodeFromCacheKey called with cacheKey : " + str;
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        if (this.f20770OooO00o == null) {
            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("在配置 SVGAParser context 前, 无法解析 SVGA 文件。", "msg");
            return;
        }
        try {
            File fileOooO00o = SVGACache.OooO00o(str);
            File file = new File(fileOooO00o, "movie.binary");
            File file2 = file.isFile() ? file : null;
            if (file2 != null) {
                try {
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("binary change to entity", "msg");
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("binary change to entity success", "msg");
                        MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(fileInputStream);
                        Intrinsics.checkNotNullExpressionValue(movieEntityDecode, "ADAPTER.decode(it)");
                        OooO0oO(oooO0O0, new o00Ooo(movieEntityDecode, fileOooO00o), str2);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception error) {
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("binary change to entity fail", "msg");
                    Intrinsics.checkNotNullParameter(error, "error");
                    fileOooO00o.delete();
                    file2.delete();
                    throw error;
                }
            }
            File file3 = new File(fileOooO00o, "movie.spec");
            File file4 = file3.isFile() ? file3 : null;
            if (file4 != null) {
                try {
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("spec change to entity", "msg");
                    FileInputStream fileInputStream2 = new FileInputStream(file4);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i = 2048;
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = fileInputStream2.read(bArr, 0, i);
                                if (i2 == -1) {
                                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("spec change to entity success", "msg");
                                    OooO0oO(oooO0O0, new o00Ooo(jSONObject, fileOooO00o), str2);
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                                    CloseableKt.closeFinally(fileInputStream2, null);
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                                i = 2048;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(fileInputStream2, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                } catch (Exception error2) {
                    String msg3 = str2 + " movie.spec change to entity fail";
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    Intrinsics.checkNotNullParameter(error2, "error");
                    fileOooO00o.delete();
                    file4.delete();
                    throw error2;
                }
            }
        } catch (Exception e) {
            OooO0oo(e, oooO0O0, str2);
        }
    }

    public final void OooO0OO(@NotNull final InputStream inputStream, @NotNull final String cacheKey, @Nullable final OooO0O0 oooO0O0, final boolean z, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        if (this.f20770OooO00o == null) {
            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("在配置 SVGAParser context 前, 无法解析 SVGA 文件。", "msg");
            return;
        }
        String msg = "================ decode " + str + " from input stream ================";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        f20769OooO0Oo.execute(new Runnable() { // from class: o0OO0O0O.OooOOOO
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                String tag;
                StringBuilder sb;
                com.opensource.svgaplayer.OooO0OO this$0 = this.f42381OooO0Oo;
                InputStream inputStream2 = inputStream;
                com.opensource.svgaplayer.OooO0OO.OooO0O0 oooO0O1 = oooO0O0;
                String str2 = str;
                boolean z2 = z;
                String cacheKey2 = cacheKey;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(inputStream2, "$inputStream");
                Intrinsics.checkNotNullParameter(cacheKey2, "$cacheKey");
                try {
                    try {
                        this$0.getClass();
                        byte[] bArrOooOO0 = com.opensource.svgaplayer.OooO0OO.OooOO0(inputStream2);
                        Unit unit = null;
                        if (bArrOooOO0 != null) {
                            boolean z3 = true;
                            if (com.opensource.svgaplayer.OooO0OO.OooO(bArrOooOO0)) {
                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("decode from zip file", "msg");
                                if (!SVGACache.OooO00o(cacheKey2).exists() || o000oOoO.f42398OooO00o) {
                                    int i = 0;
                                    synchronized (i) {
                                        if (!SVGACache.OooO00o(cacheKey2).exists()) {
                                            o000oOoO.f42398OooO00o = true;
                                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter("no cached, prepare to unzip", "msg");
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooOO0);
                                            try {
                                                com.opensource.svgaplayer.OooO0OO.OooOO0O(byteArrayInputStream, cacheKey2);
                                                o000oOoO.f42398OooO00o = false;
                                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                Intrinsics.checkNotNullParameter("unzip success", "msg");
                                                Unit unit2 = Unit.INSTANCE;
                                                CloseableKt.closeFinally(byteArrayInputStream, null);
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    CloseableKt.closeFinally(byteArrayInputStream, th);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                }
                                this$0.OooO0O0(cacheKey2, oooO0O1, str2);
                            } else {
                                if (SVGACache.f20784OooO00o != SVGACache.Type.DEFAULT) {
                                    z3 = false;
                                }
                                if (!z3) {
                                    com.opensource.svgaplayer.OooO0OO.f20769OooO0Oo.execute(new com.facebook.OooO(cacheKey2, bArrOooOO0));
                                }
                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("inflate start", "msg");
                                byte[] bArrOooO0o = com.opensource.svgaplayer.OooO0OO.OooO0o(bArrOooOO0);
                                if (bArrOooO0o != null) {
                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("inflate complete", "msg");
                                    MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrOooO0o);
                                    Intrinsics.checkNotNullExpressionValue(movieEntityDecode, "ADAPTER.decode(it)");
                                    o00Ooo o00ooo2 = new o00Ooo(movieEntityDecode, new File(cacheKey2));
                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("SVGAVideoEntity prepare start", "msg");
                                    o00ooo2.OooO0Oo(new com.opensource.svgaplayer.OooO0o(this$0, o00ooo2, oooO0O1, str2));
                                    unit = Unit.INSTANCE;
                                }
                                if (unit == null) {
                                    com.opensource.svgaplayer.OooO0OO.OooO0oo(new Exception("inflate(bytes) cause exception"), oooO0O1, str2);
                                }
                            }
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            com.opensource.svgaplayer.OooO0OO.OooO0oo(new Exception("readAsBytes(inputStream) cause exception"), oooO0O1, str2);
                        }
                        if (z2) {
                            inputStream2.close();
                        }
                        tag = "SVGAParser";
                        sb = new StringBuilder("================ decode ");
                    } catch (Exception e) {
                        this$0.getClass();
                        com.opensource.svgaplayer.OooO0OO.OooO0oo(e, oooO0O1, str2);
                        if (z2) {
                            inputStream2.close();
                        }
                        tag = "SVGAParser";
                        sb = new StringBuilder("================ decode ");
                    }
                    sb.append(str2);
                    sb.append(" from input stream end ================");
                    String msg2 = sb.toString();
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                } catch (Throwable th3) {
                    if (z2) {
                        inputStream2.close();
                    }
                    String msg3 = "================ decode " + str2 + " from input stream end ================";
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    throw th3;
                }
            }
        });
    }
}
