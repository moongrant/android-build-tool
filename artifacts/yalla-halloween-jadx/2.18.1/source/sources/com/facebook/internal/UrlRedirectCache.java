package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "()V", "redirectContentTag", "", ViewHierarchyConstants.TAG_KEY, "urlRedirectFileLruCache", "Lcom/facebook/internal/FileLruCache;", "cacheUriRedirect", "", "fromUri", "Landroid/net/Uri;", "toUri", "clearCache", "getCache", "getRedirectedUri", ShareConstants.MEDIA_URI, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UrlRedirectCache {

    @NotNull
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();

    @NotNull
    private static final String redirectContentTag;

    @NotNull
    private static final String tag;

    @Nullable
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(UrlRedirectCache.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        tag = simpleName;
        redirectContentTag = Intrinsics.stringPlus(simpleName, "_Redirect");
    }

    private UrlRedirectCache() {
    }

    @JvmStatic
    public static final void cacheUriRedirect(@Nullable Uri fromUri, @Nullable Uri toUri) {
        if (fromUri == null || toUri == null) {
            return;
        }
        OutputStream outputStreamOpenPutStream = null;
        try {
            try {
                FileLruCache cache = getCache();
                String string = fromUri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "fromUri.toString()");
                outputStreamOpenPutStream = cache.openPutStream(string, redirectContentTag);
                String string2 = toUri.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toUri.toString()");
                byte[] bytes = string2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStreamOpenPutStream.write(bytes);
            } catch (IOException e) {
                Logger.INSTANCE.log(LoggingBehavior.CACHE, 4, tag, Intrinsics.stringPlus("IOException when accessing cache: ", e.getMessage()));
            }
        } finally {
            Utility utility = Utility.INSTANCE;
            Utility.closeQuietly(outputStreamOpenPutStream);
        }
    }

    @JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, tag, Intrinsics.stringPlus("clearCache failed ", e.getMessage()));
        }
    }

    @JvmStatic
    @NotNull
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        fileLruCache = urlRedirectFileLruCache;
        if (fileLruCache == null) {
            fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
        }
        urlRedirectFileLruCache = fileLruCache;
        return fileLruCache;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b2: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:44:0x00b2 */
    @JvmStatic
    @Nullable
    public static final Uri getRedirectedUri(@Nullable Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                FileLruCache cache = getCache();
                InputStream inputStream = cache.get(string, redirectContentTag);
                inputStreamReader = null;
                boolean z = false;
                while (inputStream != null) {
                    z = true;
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStream);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb = new StringBuilder();
                            for (int i = inputStreamReader4.read(cArr, 0, 128); i > 0; i = inputStreamReader4.read(cArr, 0, 128)) {
                                sb.append(cArr, 0, i);
                            }
                            Utility utility = Utility.INSTANCE;
                            Utility.closeQuietly(inputStreamReader4);
                            String string2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "urlBuilder.toString()");
                            if (hashSet.contains(string2)) {
                                if (Intrinsics.areEqual(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    break;
                                }
                                Logger.INSTANCE.log(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                                Utility.closeQuietly(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamReader = inputStreamReader4;
                            inputStream = cache.get(string2, redirectContentTag);
                            string = string2;
                        } catch (IOException e) {
                            e = e;
                            inputStreamReader = inputStreamReader4;
                            Logger.INSTANCE.log(LoggingBehavior.CACHE, 4, tag, Intrinsics.stringPlus("IOException when accessing cache: ", e.getMessage()));
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader3 = inputStreamReader4;
                            Utility utility2 = Utility.INSTANCE;
                            Utility.closeQuietly(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (z) {
                    Uri uri2 = Uri.parse(string);
                    Utility utility3 = Utility.INSTANCE;
                    Utility.closeQuietly(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader3 = inputStreamReader2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        Utility utility4 = Utility.INSTANCE;
        Utility.closeQuietly(inputStreamReader);
        return null;
    }
}
