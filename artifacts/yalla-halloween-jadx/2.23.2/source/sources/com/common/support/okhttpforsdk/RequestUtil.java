package com.common.support.okhttpforsdk;

import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u0007\u001a\u00020\u00062*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000bJK\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/common/support/okhttpforsdk/RequestUtil;", "", "", "Lkotlin/Pair;", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lo0ooOO0o/o0O00000;", "createFormBody", "([Lkotlin/Pair;)Lo0ooOO0o/o0O00000;", "", "data", "Lo0ooOO0o/o0oO0Ooo;", "createProtoBufBody", "url", "path", "Lo0ooOO0o/o0O00O0o;", "createGetRequest", "(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)Lo0ooOO0o/o0O00O0o;", "requestBody", "createPostRequest", "Lo0ooOO0o/o0O00O0o$OooO00o;", "createRequestBuilder", "(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)Lo0ooOO0o/o0O00O0o$OooO00o;", "Lo0ooOO0o/o0O000Oo;", "MEDIA_TYPE_PROTOBUF", "Lo0ooOO0o/o0O000Oo;", "MEDIA_TYPE_JSON", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RequestUtil {

    @NotNull
    public static final RequestUtil INSTANCE = new RequestUtil();

    @JvmField
    @NotNull
    public static final o0O000Oo MEDIA_TYPE_JSON;

    @JvmField
    @NotNull
    public static final o0O000Oo MEDIA_TYPE_PROTOBUF;

    static {
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        MEDIA_TYPE_PROTOBUF = o0O000Oo.OooO00o.OooO00o("application/x-protobuf");
        MEDIA_TYPE_JSON = o0O000Oo.OooO00o.OooO00o("application/json; charset=utf-8");
    }

    private RequestUtil() {
    }

    public static /* synthetic */ o0O00O0o createGetRequest$default(RequestUtil requestUtil, String str, String str2, Pair[] pairArr, int i, Object obj) throws IllegalArgumentException {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return requestUtil.createGetRequest(str, str2, pairArr);
    }

    public static /* synthetic */ o0O00O0o createPostRequest$default(RequestUtil requestUtil, String str, String str2, o0oO0Ooo o0oo0ooo2, int i, Object obj) throws IllegalArgumentException {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return requestUtil.createPostRequest(str, str2, o0oo0ooo2);
    }

    public static /* synthetic */ o0O00O0o.OooO00o createRequestBuilder$default(RequestUtil requestUtil, String str, String str2, Pair[] pairArr, int i, Object obj) throws IllegalArgumentException {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return requestUtil.createRequestBuilder(str, str2, pairArr);
    }

    @NotNull
    public final o0O00000 createFormBody(@NotNull Pair<String, String>... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : params) {
            String name = pair.getFirst();
            String value = pair.getSecond();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(o0O000O.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
            arrayList2.add(o0O000O.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
        }
        return new o0O00000(arrayList, arrayList2);
    }

    @NotNull
    public final o0O00O0o createGetRequest(@NotNull String url, @NotNull String path, @NotNull Pair<String, ? extends Object>... params) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        o0O00O0o.OooO00o oooO00oCreateRequestBuilder = createRequestBuilder(url, path, (Pair[]) Arrays.copyOf(params, params.length));
        oooO00oCreateRequestBuilder.OooO0o("GET", null);
        return oooO00oCreateRequestBuilder.OooO0O0();
    }

    @NotNull
    public final o0O00O0o createPostRequest(@NotNull String url, @NotNull String path, @NotNull o0oO0Ooo requestBody) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        o0O00O0o.OooO00o oooO00oCreateRequestBuilder = createRequestBuilder(url, path, new Pair[0]);
        oooO00oCreateRequestBuilder.OooO0oO(requestBody);
        return oooO00oCreateRequestBuilder.OooO0O0();
    }

    @NotNull
    public final o0oO0Ooo createProtoBufBody(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return o0oO0Ooo.OooO00o.OooO0OO(o0oO0Ooo.Companion, data, MEDIA_TYPE_PROTOBUF, 0, 6);
    }

    @NotNull
    public final o0O00O0o.OooO00o createRequestBuilder(@NotNull String url, @NotNull String path, @NotNull Pair<String, ? extends Object>... params) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(url, "<this>");
        o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
        oooO00o.OooO0oO(null, url);
        o0O000O.OooO00o oooO00oOooO0o = oooO00o.OooO0OO().OooO0o();
        if (!StringsKt.isBlank(path)) {
            Intrinsics.checkNotNullParameter(path, "pathSegments");
            int i = 0;
            do {
                int iOooO0o0 = oO000o00.OooO0o0(i, path.length(), path, "/\\");
                oooO00oOooO0o.OooO0oo(path, i, iOooO0o0, iOooO0o0 < path.length(), false);
                i = iOooO0o0 + 1;
            } while (i <= path.length());
        }
        for (Pair<String, ? extends Object> pair : params) {
            oooO00oOooO0o.OooO0O0(pair.getFirst(), pair.getSecond().toString());
        }
        o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o();
        o0O000O url2 = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url2, "url");
        oooO00o2.f57834OooO00o = url2;
        return oooO00o2;
    }
}
