package p519o0o0O0oO;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000O0;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class m4 extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO00o f52433OooO;

    public interface OooO00o {
        void onClick(@NotNull View view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.activity_room_un_join_popup_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.y = o0000O0.OooO00o(45);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.0f);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(80);
        }
        OooO00o(oO00O0oO.un_join);
        OooO00o(oO00O0oO.un_join_follow);
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(@Nullable View view) {
        OooO00o oooO00o = this.f52433OooO;
        if (oooO00o != null) {
            Intrinsics.checkNotNull(view);
            oooO00o.onClick(view);
        }
    }
}
