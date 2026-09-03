package p558o0oOOoo;

import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.common.ui.view.BaseWebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502o0o00o0.o00000O;
import p545o0o0OoOo.c8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO0 extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00000O f44706OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f44707OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<BaseWebView> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseWebView invoke() {
            BaseWebView baseWebView = new BaseWebView(o00O0OO0.this.f44365OooO00o);
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            baseWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            baseWebView.setBackgroundColor(0);
            baseWebView.addJavascriptInterface(new o00O0O0O(o00o0oo1), "Yalla");
            return baseWebView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44707OooO0OO = LazyKt.lazy(new OooO00o());
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
        OooO0OO().OooO0OO();
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        o00000O o00000o = this.f44706OooO0O0;
        if (o00000o == null || !o00000o.OooO0OO()) {
            return;
        }
        o00000o.OooO0O0();
    }

    public final BaseWebView OooO0OO() {
        return (BaseWebView) this.f44707OooO0OO.getValue();
    }
}
