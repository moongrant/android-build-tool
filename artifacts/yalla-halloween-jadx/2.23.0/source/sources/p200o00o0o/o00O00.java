package p200o00o0o;

import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.adapter.o00O00O;
import com.yalla.yalla.ui.adapter.oOO00O;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import p139o00OOooO.OooO0o;
import p245o00oo0o.o00O;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00 implements o00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39129OooO0o0;

    public /* synthetic */ o00O00(Object obj, Object obj2) {
        this.f39128OooO0Oo = obj;
        this.f39129OooO0o0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TextView f30473OoooOOo;
        TextView f30473OoooOOo2;
        TextView f30473OoooOOo3;
        UserDefaultHeadActivity this$0 = (UserDefaultHeadActivity) this.f39128OooO0Oo;
        o00O00O this_apply = (o00O00O) this.f39129OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Object objOooOOO = baseQuickAdapter.OooOOO(i);
        Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.ui.adapter.UserDefaultHeadAdapterItem");
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = ((oOO00O) objOooOOO).f27689OooO0O0;
        if (userDefaultHeadItemModel != null) {
            this$0.f27217OooOo = i;
            this_apply.f27613OooOoO = i;
            this$0.f27220OooOo0O = userDefaultHeadItemModel;
            String strOooO0Oo = OooO0o.OooO0Oo(userDefaultHeadItemModel.getUrl());
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(strOooO0Oo, OooO0o.OooO0Oo((String) o000000O.OooO().getValue()))) {
                HeaderLayout headerLayout = this$0.f22755OooOO0;
                f30473OoooOOo = headerLayout != null ? headerLayout.getF30473OoooOOo() : null;
                if (f30473OoooOOo != null) {
                    f30473OoooOOo.setClickable(false);
                }
                HeaderLayout headerLayout2 = this$0.f22755OooOO0;
                if (headerLayout2 != null && (f30473OoooOOo2 = headerLayout2.getF30473OoooOOo()) != null) {
                    f30473OoooOOo2.setTextColor(-1962934273);
                }
            } else {
                HeaderLayout headerLayout3 = this$0.f22755OooOO0;
                f30473OoooOOo = headerLayout3 != null ? headerLayout3.getF30473OoooOOo() : null;
                if (f30473OoooOOo != null) {
                    f30473OoooOOo.setClickable(true);
                }
                HeaderLayout headerLayout4 = this$0.f22755OooOO0;
                if (headerLayout4 != null && (f30473OoooOOo3 = headerLayout4.getF30473OoooOOo()) != null) {
                    f30473OoooOOo3.setTextColor(-1);
                }
                this$0.OooOoO(userDefaultHeadItemModel.getUrl());
            }
            ((o00O00O) this$0.f27218OooOo0.getValue()).notifyDataSetChanged();
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o00oO0O();
    }
}
