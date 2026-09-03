package p279o0O00o0o;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.adapter.o00O00o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41831OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f41832OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f41833OooO0o0;

    public /* synthetic */ o00Oo0(int i, Object obj, Object obj2) {
        this.f41831OooO0Oo = i;
        this.f41833OooO0o0 = obj;
        this.f41832OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f41831OooO0Oo;
        Object obj = this.f41832OooO0o;
        Object obj2 = this.f41833OooO0o0;
        switch (i) {
            case 0:
                Snackbar snackbar = (Snackbar) obj2;
                snackbar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                snackbar.OooO0O0(1);
                break;
            default:
                o00O00o0 this$0 = (o00O00o0) obj2;
                YallaTeamMessage item = (YallaTeamMessage) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                Function1<? super YallaTeamMessage, Unit> function1 = this$0.f27619OooOOoo;
                if (function1 != null) {
                    function1.invoke(item);
                }
                break;
        }
    }
}
