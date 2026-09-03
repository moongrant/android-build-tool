package p565o0oOo0;

import android.view.View;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.fragment.MainMomentTopicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p626o0oo0oOo.oO0O0;
import p626o0oo0oOo.oO0O00oO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000OO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45035Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45036OoooO00;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f45035Oooo = i;
        this.f45036OoooO00 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<Integer, oO0O0, Unit> function2;
        switch (this.f45035Oooo) {
            case 0:
                PrivateChatAdapter this$0 = (PrivateChatAdapter) this.f45036OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f23666OooOoOO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                MainMomentTopicFragment.m343initView$lambda2((MainMomentTopicFragment) this.f45036OoooO00, view);
                break;
            default:
                oO0O00oO this$1 = (oO0O00oO) this.f45036OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Object tag = view.getTag();
                if ((tag instanceof Integer) && (function2 = this$1.f48682OooO0O0) != 0) {
                    function2.invoke((Integer) tag, this$1.f48681OooO00o.get(((Number) tag).intValue()));
                    break;
                }
                break;
        }
    }
}
