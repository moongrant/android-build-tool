package com.common.support.apm.sailfishhttp.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.utils.JsonUtilKt;
import com.google.gson.reflect.TypeToken;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0014\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/common/support/apm/sailfishhttp/cookie/CookieManager;", "", "()V", "KEY_COOKIES", "", "SP_NAME", "appContextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "getCookies", "", "Lokhttp3/Cookie;", "init", "", "context", "saveCookies", CookieManager.KEY_COOKIES, "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CookieManager {

    @NotNull
    public static final CookieManager INSTANCE = new CookieManager();

    @NotNull
    private static final String KEY_COOKIES = "cookies";

    @NotNull
    private static final String SP_NAME = "sailfish_cookies";
    private static WeakReference<Context> appContextRef;

    private CookieManager() {
    }

    @NotNull
    public final List<Cookie> getCookies() {
        WeakReference<Context> weakReference = appContextRef;
        List<Cookie> listEmptyList = null;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContextRef");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context != null) {
            final String string = context.getSharedPreferences(SP_NAME, 0).getString(KEY_COOKIES, "");
            try {
                final List<Cookie> listEmptyList2 = (List) JsonUtilKt.getGson().OooO0Oo(string, new TypeToken<List<? extends Cookie>>() { // from class: com.common.support.apm.sailfishhttp.cookie.CookieManager$getCookies$1$cookieList$1
                }.getType());
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.cookie.CookieManager$getCookies$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "CookieStr: " + ((Object) string) + ", cookieList: " + listEmptyList2;
                    }
                }, 1, null);
                if (listEmptyList2 == null || listEmptyList2.isEmpty()) {
                    listEmptyList2 = CollectionsKt.emptyList();
                } else {
                    Intrinsics.checkNotNullExpressionValue(listEmptyList2, "{\n          cookieList\n        }");
                }
                listEmptyList = listEmptyList2;
            } catch (Exception e) {
                Sailfish.INSTANCE.customLog("CookieStr: " + ((Object) string) + ", parse error: " + e, 5);
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        return listEmptyList == null ? CollectionsKt.emptyList() : listEmptyList;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        appContextRef = new WeakReference<>(context);
    }

    public final void saveCookies(@NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        WeakReference<Context> weakReference = appContextRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContextRef");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_NAME, 0).edit();
        editorEdit.putString(KEY_COOKIES, JsonUtilKt.getGson().OooO0oo(cookies));
        editorEdit.apply();
    }
}
