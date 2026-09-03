package com.yalla.yalla.common.manager.data;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p625o0oo0oO0.o0000O0;
import p625o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o00O0O f20649OooO0O0 = new o00O0O(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o00O0O f20650OooO0OO = new o00O0O(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20651OooO00o;

    public /* synthetic */ o00O0O(int i) {
        this.f20651OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20651OooO00o) {
            case 0:
                SharedMainMessageManager.m278_get_userDot_$lambda11$lambda9((Boolean) obj);
                break;
            default:
                String url = (String) obj;
                TaskActivity.OooO00o oooO00o = TaskActivity.f22080o00ooo;
                p608o0oo0O.OooOo.OooO0OO("105003", p021OooOooo.o000oOoO.OooO00o(new Pair("type", 1)));
                Intrinsics.checkNotNull(url);
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
