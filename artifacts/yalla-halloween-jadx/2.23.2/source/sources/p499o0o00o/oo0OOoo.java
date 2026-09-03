package p499o0o00o;

import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495o0o00Oo.OooOO0O;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomCamelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomCamelManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomCamelManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class oo0OOoo extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o000OO00 f50085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f50086OooO0OO;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f50087OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50087OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f50087OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50087OooO0Oo;
        }

        public final int hashCode() {
            return this.f50087OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50087OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<BaseWebView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseWebView invoke() {
            oo0OOoo oo0oooo = oo0OOoo.this;
            BaseWebView baseWebView = new BaseWebView(oo0oooo.f49626OooO00o);
            baseWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            baseWebView.setBackgroundColor(0);
            baseWebView.addJavascriptInterface(new o0O0oo00(oo0oooo), "Yalla");
            return baseWebView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f50086OooO0OO = LazyKt.lazy(new OooO0O0());
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
        OooO0OO().OooO0Oo();
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        o000OO00 o000oo01 = this.f50085OooO0O0;
        if (o000oo01 == null || !o000oo01.OooO0OO()) {
            return;
        }
        o000oo01.OooO0O0();
    }

    public final BaseWebView OooO0OO() {
        return (BaseWebView) this.f50086OooO0OO.getValue();
    }
}
