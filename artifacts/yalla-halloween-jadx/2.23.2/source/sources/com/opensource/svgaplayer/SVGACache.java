package com.opensource.svgaplayer;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSVGACache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGACache.kt\ncom/opensource/svgaplayer/SVGACache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n1#2:120\n13579#3,2:121\n*S KotlinDebug\n*F\n+ 1 SVGACache.kt\ncom/opensource/svgaplayer/SVGACache\n*L\n63#1:121,2\n*E\n"})
public final class SVGACache {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static Type f20784OooO00o = Type.DEFAULT;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static String f20785OooO0O0 = "/";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/opensource/svgaplayer/SVGACache$Type;", "", "DEFAULT", "FILE", "com.opensource.svgaplayer"}, k = 1, mv = {1, 8, 0})
    public enum Type {
        DEFAULT,
        FILE
    }

    @NotNull
    public static File OooO00o(@NotNull String cacheKey) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return new File(OooO0o0() + cacheKey + '/');
    }

    @NotNull
    public static String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        String string = "";
        for (byte b : digest) {
            StringBuilder sbOooO00o = o0o0Oo.OooO00o(string);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            sbOooO00o.append(str2);
            string = sbOooO00o.toString();
        }
        return string;
    }

    @NotNull
    public static File OooO0OO(@NotNull String cacheKey) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return new File(OooO0o0() + cacheKey + ".svga");
    }

    public static void OooO0Oo(@NotNull String path) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            File file = new File(path);
            if (!file.exists()) {
                file = null;
            }
            if (file == null || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
            for (File file2 : fileArrListFiles) {
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        String absolutePath = file2.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                        OooO0Oo(absolutePath);
                    }
                    file2.delete();
                }
            }
        } catch (Exception error) {
            String msg = "Clear svga cache path: " + path + " fail";
            Intrinsics.checkNotNullParameter("SVGACache", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public static String OooO0o0() {
        if (!Intrinsics.areEqual(f20785OooO0O0, "/")) {
            File file = new File(f20785OooO0O0);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return f20785OooO0O0;
    }
}
