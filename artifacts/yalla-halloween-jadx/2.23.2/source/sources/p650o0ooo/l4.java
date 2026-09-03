package p650o0ooo;

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
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class l4 extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO00o f58376OooO;

    public interface OooO00o {
        void onClick(@NotNull View view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.activity_room_un_join_popup_layout;
    }

    @Override // p401o0Oo0O00.OooO
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
        OooO00o(o0OO00O.un_join);
        OooO00o(o0OO00O.un_join_follow);
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(@Nullable View view) {
        OooO00o oooO00o = this.f58376OooO;
        if (oooO00o != null) {
            Intrinsics.checkNotNull(view);
            oooO00o.onClick(view);
        }
    }
}
