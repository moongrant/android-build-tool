package p520o0o0O0O0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApiList;
import com.yalla.yalla.common.model.ApiPage;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p522o0o0O0o.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicInfoModel>>, Unit> f42705OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApiList<ArrayList<TopicInfoModel>>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO000(Function1<? super Response<ArrayList<TopicInfoModel>>, Unit> function1) {
        this.f42705OooO00o = function1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f42705OooO00o.invoke(new Response<>(false, null, false, new Error(str != null ? Integer.valueOf(Integer.parseInt(str)) : null, str2), 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        Object objOooO0OO = o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, type)");
        AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) objOooO0OO;
        AbsJavaBeanApiList.PageModel page = absJavaBeanApiList.getPage();
        int pagesize = page != null ? page.getPagesize() : Integer.parseInt("15");
        Model model = absJavaBeanApiList.data;
        Response<ArrayList<TopicInfoModel>> response = new Response<>(true, model, o00oOoo.OooO00o((ArrayList) model, pagesize), null, 8, null);
        ApiPage page2 = response.getPage();
        AbsJavaBeanApiList.PageModel page3 = absJavaBeanApiList.getPage();
        page2.setPageIndex(page3 != null ? page3.getPageindex() : 1);
        response.getPage().setPageSize(pagesize);
        ApiPage page4 = response.getPage();
        AbsJavaBeanApiList.PageModel page5 = absJavaBeanApiList.getPage();
        page4.setDateSort(page5 != null ? Long.valueOf(page5.getDatesort()) : null);
        this.f42705OooO00o.invoke(response);
    }
}
