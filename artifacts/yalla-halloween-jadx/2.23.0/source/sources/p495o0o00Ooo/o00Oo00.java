package p495o0o00Ooo;

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
import p489o0o00OO0.OooO;
import p519o0o0O0oO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomCamelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomCamelManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomCamelManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class o00Oo00 extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00O00OO f48769OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f48770OooO0OO;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f48771OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48771OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f48771OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f48771OooO0Oo;
        }

        public final int hashCode() {
            return this.f48771OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48771OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<BaseWebView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseWebView invoke() {
            o00Oo00 o00oo00 = o00Oo00.this;
            BaseWebView baseWebView = new BaseWebView(o00oo00.f48470OooO00o);
            baseWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            baseWebView.setBackgroundColor(0);
            baseWebView.addJavascriptInterface(new o0O0o(o00oo00), "Yalla");
            return baseWebView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f48770OooO0OO = LazyKt.lazy(new OooO0O0());
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
        OooO0OO().OooO0Oo();
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
        o00O00OO o00o00oo2 = this.f48769OooO0O0;
        if (o00o00oo2 == null || !o00o00oo2.OooO0OO()) {
            return;
        }
        o00o00oo2.OooO0O0();
    }

    public final BaseWebView OooO0OO() {
        return (BaseWebView) this.f48770OooO0OO.getValue();
    }
}
