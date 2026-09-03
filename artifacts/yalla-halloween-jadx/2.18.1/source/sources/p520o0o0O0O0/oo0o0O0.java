package p520o0o0O0O0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApiList;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<TopicInfoModel>, Unit> f42928OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApiList<TopicInfoModel>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0O0(Function1<? super Response<TopicInfoModel>, Unit> function1) {
        this.f42928OooO00o = function1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f42928OooO00o.invoke(new Response<>(false, null, false, new Error(str != null ? Integer.valueOf(Integer.parseInt(str)) : null, str2), 6, null));
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        try {
            Object objOooO0OO = o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, type)");
            this.f42928OooO00o.invoke(new Response<>(true, ((AbsJavaBeanApiList) objOooO0OO).data, false, null, 12, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
