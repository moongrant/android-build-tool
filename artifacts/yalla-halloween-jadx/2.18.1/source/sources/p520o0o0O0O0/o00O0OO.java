package p520o0o0O0O0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApiList;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p522o0o0O0o.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicInfoModel>>, Unit> f42699OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApiList<ArrayList<TopicInfoModel>>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O0OO(Function1<? super Response<ArrayList<TopicInfoModel>>, Unit> function1) {
        this.f42699OooO00o = function1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f42699OooO00o.invoke(new Response<>(true, null, false, new Error(str != null ? Integer.valueOf(Integer.parseInt(str)) : null, str2), 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        this.f42699OooO00o.invoke(new Response<>(true, absJavaBeanApiList != null ? (ArrayList) absJavaBeanApiList.data : null, o00oOoo.OooO0O0(absJavaBeanApiList != null ? (ArrayList) absJavaBeanApiList.data : null), null, 8, null));
    }
}
