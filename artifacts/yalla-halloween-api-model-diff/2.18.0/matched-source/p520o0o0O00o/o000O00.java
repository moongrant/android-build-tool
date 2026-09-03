package p520o0o0O00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.data.manager.SharedMessageVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p021OooOooo.o000oOoO;
import p581o0oOoOOo.oOo0o0oO;
import p608o0oo0O.OooOo;
import p625o0oo0oO0.o0000O0;
import p625o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o000O00 f42202OooO0O0 = new o000O00(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o000O00 f42203OooO0OO = new o000O00(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42204OooO00o;

    public /* synthetic */ o000O00(int i) {
        this.f42204OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f42204OooO00o) {
            case 0:
                SharedMessageVM.m298_get_unreadMessageCount_$lambda6$lambda4((Integer) obj);
                break;
            default:
                String url = (String) obj;
                int i = oOo0o0oO.OooOOO0.f46226OooO0O0;
                OooOo.OooO0OO("105003", o000oOoO.OooO00o(new Pair("type", 2)));
                Intrinsics.checkNotNullExpressionValue(url, "it");
                Intrinsics.checkNotNullParameter(url, "url");
                o0000O0.OooO00o.OooO0O0 action = new o0000O0.OooO00o.OooO0O0(url);
                o0000oo notInstall = o0000oo.f48659Oooo;
                Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                Intrinsics.checkNotNullParameter(action, "action");
                if (!PackManager.INSTANCE.isInstalledYallaChat()) {
                    notInstall.invoke();
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0418OooO00o(null), 2, null);
                } else {
                    action.invoke();
                }
                break;
        }
    }
}
