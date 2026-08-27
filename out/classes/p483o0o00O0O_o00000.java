package p483o0o00O0O;

import androidx.compose.material3.internal.o0000O0O;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.repository.Account;
import com.yalla.yalla.service.OooO0O0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p447o0Ooo00.OooOOO0;
import p621o0ooO0O.o000O0Oo;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nApiParamsInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiParamsInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiParamsInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class o00000 implements Interceptor {
    /* JADX WARN: Code duplicated, block: B:55:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        boolean z;
        boolean z2;
        int iOooO0o0;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (Intrinsics.areEqual(request.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return chain.proceed(request);
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        if (StringsKt__StringsJVMKt.equals(request.method(), "GET", true)) {
            HttpUrl.Builder builderNewBuilder2 = request.url().newBuilder();
            builderNewBuilder2.setQueryParameter("p", "2");
            OooOOO0.f93072OooO00o.getClass();
            builderNewBuilder2.setQueryParameter("v", String.valueOf(OooOOO0.OooO0oO()));
            String strQueryParameter = request.url().queryParameter("userid");
            if (strQueryParameter == null || StringsKt.isBlank(strQueryParameter)) {
                Account account = Account.f74684OooO00o;
                builderNewBuilder2.setQueryParameter("userid", String.valueOf(((Number) o0000O0O.OooO0OO()).longValue()));
            }
            String strQueryParameter2 = request.url().queryParameter("token");
            if (strQueryParameter2 == null || StringsKt.isBlank(strQueryParameter2)) {
                Account account2 = Account.f74684OooO00o;
                T value = Account.OooOOoo().getValue();
                Intrinsics.checkNotNull(value);
                builderNewBuilder2.setQueryParameter("token", (String) value);
            }
            String strQueryParameter3 = request.url().queryParameter("pagesize");
            if (strQueryParameter3 == null || StringsKt.isBlank(strQueryParameter3)) {
                builderNewBuilder2.setQueryParameter("pagesize", "15");
            }
            String strQueryParameter4 = request.url().queryParameter("region");
            if (strQueryParameter4 == null || StringsKt.isBlank(strQueryParameter4)) {
                Account account3 = Account.f74684OooO00o;
                Integer num = (Integer) Account.OooOOOO().getValue();
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue == -1) {
                    iIntValue = o000O0Oo.OooO0o0();
                }
                builderNewBuilder2.setQueryParameter("region", String.valueOf(iIntValue));
            }
            builderNewBuilder2.setQueryParameter("deviceLang", Locale.getDefault().getLanguage());
            builderNewBuilder2.setQueryParameter("smid", OooO0O0.f75449OooO00o);
            builderNewBuilder.url(builderNewBuilder2.build());
        } else if (StringsKt__StringsJVMKt.equals(request.method(), "POST", true)) {
            RequestBody requestBodyBody = request.body();
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            MediaType mediaTypeContentType = requestBodyBody != null ? requestBodyBody.contentType() : null;
            if (Intrinsics.areEqual(mediaTypeContentType != null ? mediaTypeContentType.type() : null, "application") && Intrinsics.areEqual(mediaTypeContentType.subtype(), "json")) {
                Request.Builder builderAddHeader = builderNewBuilder.addHeader("p", "2");
                OooOOO0.f93072OooO00o.getClass();
                Request.Builder builderAddHeader2 = builderAddHeader.addHeader("v", String.valueOf(OooOOO0.OooO0oO()));
                Account account4 = Account.f74684OooO00o;
                Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("userid", String.valueOf(((Number) o0000O0O.OooO0OO()).longValue()));
                T value2 = Account.OooOo00().getValue();
                Intrinsics.checkNotNull(value2);
                Request.Builder builderAddHeader4 = builderAddHeader3.addHeader("token", (String) value2);
                Integer num2 = (Integer) Account.OooOOOO().getValue();
                if (num2 == null) {
                    iOooO0o0 = o000O0Oo.OooO0o0();
                } else {
                    Integer num3 = num2.intValue() != -1 ? num2 : null;
                    if (num3 != null) {
                        iOooO0o0 = num3.intValue();
                    } else {
                        iOooO0o0 = o000O0Oo.OooO0o0();
                    }
                }
                Request.Builder builderAddHeader5 = builderAddHeader4.addHeader("region", String.valueOf(iOooO0o0));
                String language = Locale.getDefault().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                builderAddHeader5.addHeader("deviceLang", language).addHeader("smid", OooO0O0.f75449OooO00o);
            } else {
                FormBody.Builder builder = new FormBody.Builder(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
                boolean z3 = false;
                if (request.body() instanceof FormBody) {
                    RequestBody requestBodyBody2 = request.body();
                    Intrinsics.checkNotNull(requestBodyBody2, "null cannot be cast to non-null type okhttp3.FormBody");
                    FormBody formBody = (FormBody) requestBodyBody2;
                    int i = 0;
                    boolean z4 = false;
                    z2 = false;
                    for (int size = formBody.size(); i < size; size = size) {
                        String strName = formBody.name(i);
                        if (Intrinsics.areEqual(strName, "region")) {
                            z3 = true;
                        }
                        if (Intrinsics.areEqual(strName, "userid")) {
                            z4 = true;
                        }
                        if (Intrinsics.areEqual(strName, "token")) {
                            z2 = true;
                        }
                        builder.add(strName, formBody.value(i));
                        i++;
                    }
                    z = z3;
                    z3 = z4;
                } else {
                    z = false;
                    z2 = false;
                }
                builder.add("p", "2");
                OooOOO0.f93072OooO00o.getClass();
                builder.add("v", String.valueOf(OooOOO0.OooO0oO()));
                if (!z3) {
                    Account account5 = Account.f74684OooO00o;
                    builder.add("userid", String.valueOf(((Number) o0000O0O.OooO0OO()).longValue()));
                }
                if (!z2) {
                    Account account6 = Account.f74684OooO00o;
                    T value3 = Account.OooOOoo().getValue();
                    Intrinsics.checkNotNull(value3);
                    builder.add("token", (String) value3);
                }
                if (!z) {
                    Account account7 = Account.f74684OooO00o;
                    Integer num4 = (Integer) Account.OooOOOO().getValue();
                    int iIntValue2 = num4 != null ? num4.intValue() : -1;
                    if (iIntValue2 == -1) {
                        iIntValue2 = o000O0Oo.OooO0o0();
                    }
                    builder.add("region", String.valueOf(iIntValue2));
                }
                String language2 = Locale.getDefault().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
                builder.add("deviceLang", language2);
                builder.add("smid", OooO0O0.f75449OooO00o);
                builderNewBuilder.post(builder.build());
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
