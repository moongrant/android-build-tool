package p486o0o00O00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48302OooO0Oo;

    public o00O000o(MainSearchActivity mainSearchActivity) {
        this.f48302OooO0Oo = mainSearchActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        MainSearchActivity mainSearchActivity = this.f48302OooO0Oo;
        Function1<? super String, Unit> function1 = mainSearchActivity.f25421OooOoO0;
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            function1.invoke(it);
        }
        o0OO000.OooO00o("101032");
        MainSearchActivity.OooOo(mainSearchActivity, mainSearchActivity.OooOoO().getSearchText());
    }
}
