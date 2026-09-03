package p176o00OooOo;

import android.view.View;
import com.app.base.view.HeaderLayout;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32758Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function0 f32759OoooO00;

    public /* synthetic */ o0OO0O0(Function0 function0, int i) {
        this.f32758Oooo = i;
        this.f32759OoooO00 = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32758Oooo) {
            case 0:
                Function0 clickListener = this.f32759OoooO00;
                int i = HeaderLayout.f12057o00000o0;
                Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
                clickListener.invoke();
                break;
            default:
                Function0 function0 = this.f32759OoooO00;
                int i2 = ThemeLayout.f25234OoooO00;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
