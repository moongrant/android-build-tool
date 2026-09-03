package p175o00OooOo;

import android.view.View;
import com.app.base.view.HeaderLayout;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32740Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0 f32741Oooo0oO;

    public /* synthetic */ o0OO00o0(Function0 function0, int i) {
        this.f32740Oooo0o = i;
        this.f32741Oooo0oO = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32740Oooo0o) {
            case 0:
                Function0 clickListener = this.f32741Oooo0oO;
                int i = HeaderLayout.f12042o00000O;
                Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
                clickListener.invoke();
                break;
            default:
                Function0 function0 = this.f32741Oooo0oO;
                int i2 = ThemeLayout.f25215Oooo0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
