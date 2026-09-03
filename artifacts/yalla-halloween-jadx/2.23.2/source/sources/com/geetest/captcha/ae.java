package com.geetest.captcha;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB)\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/geetest/captcha/utils/HttpUrl;", "", "", "toString", "Lcom/geetest/captcha/utils/HttpUrl$Builder;", "newBuilder", "baseUrl", "Ljava/lang/String;", "", NativeProtocol.WEB_DIALOG_PARAMS, "Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Builder", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class ae {
    public static final b a = new b(0);
    private final String b;
    private final Map<String, String> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/geetest/captcha/utils/HttpUrl$Builder;", "", "baseUrl", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Ljava/lang/String;Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "addQueryParameter", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, "build", "Lcom/geetest/captcha/utils/HttpUrl;", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        public final String a;

        @Nullable
        public final Map<String, String> b;

        public a(@NotNull String str, @Nullable Map<String, String> map) {
            this.a = str;
            this.b = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/geetest/captcha/utils/HttpUrl$Companion;", "", "()V", "parse", "Lcom/geetest/captcha/utils/HttpUrl;", "url", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        @Nullable
        public static ae a(@NotNull String str) {
            try {
                if (StringsKt.isBlank(str)) {
                    return null;
                }
                byte b = 0;
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) str).toString(), new String[]{"?"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                HashMap map = new HashMap();
                if (strArr.length == 1) {
                    return new ae(strArr[0], map, b);
                }
                if (strArr.length == 2) {
                    Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) strArr[1], new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    for (String str2 : (String[]) array2) {
                        Object[] array3 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array3 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        String[] strArr2 = (String[]) array3;
                        if (strArr2.length == 2) {
                            map.put(strArr2[0], strArr2[1]);
                        }
                    }
                    return new ae(strArr[0], map, b);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private ae(String str, Map<String, String> map) {
        this.b = str;
        this.c = map;
    }

    @NotNull
    public final a a() {
        return new a(this.b, this.c);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.c;
        if (map == null || map.isEmpty()) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append('?');
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            stringBuffer.append(key);
            stringBuffer.append('=');
            stringBuffer.append(value);
            stringBuffer.append(Typography.amp);
        }
        String string = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "sb.deleteCharAt(sb.length - 1).toString()");
        return string;
    }

    public /* synthetic */ ae(String str, Map map, byte b2) {
        this(str, map);
    }
}
