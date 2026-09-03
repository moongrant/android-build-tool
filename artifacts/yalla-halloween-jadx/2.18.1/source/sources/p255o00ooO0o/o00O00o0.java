package p255o00ooO0o;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00o0 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0 f34367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1 f34368OooO0o0;

    public /* synthetic */ o00O00o0(o00O0 o00o1, Function1 function1) {
        this.f34367OooO0Oo = o00o1;
        this.f34368OooO0o0 = function1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o00O0 this$0 = this.f34367OooO0Oo;
        Function1 onItemClick = this.f34368OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        if (this$0.f34363OooOO0o) {
            this$0.OooO0Oo();
        }
        onItemClick.invoke(Integer.valueOf(i));
    }
}
