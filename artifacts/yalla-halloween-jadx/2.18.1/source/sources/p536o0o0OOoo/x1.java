package p536o0o0OOoo;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;
import p596o0oo0.OooOOOO;
import p596o0oo0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43887Oooo0o;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ SystemMessageActivity f43888Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SystemMessageActivity systemMessageActivity) {
            super(0);
            this.f43888Oooo0o = systemMessageActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SystemMessageActivity systemMessageActivity = this.f43888Oooo0o;
            SystemMessageActivity.OooO00o oooO00o = SystemMessageActivity.f22242OooooOO;
            OooOo00 oooOo00OooOooo = systemMessageActivity.OooOooo();
            Objects.requireNonNull(oooOo00OooOooo);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(oooOo00OooOooo), null, null, new OooOOOO(null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(SystemMessageActivity systemMessageActivity) {
        super(0L, 1, null);
        this.f43887Oooo0o = systemMessageActivity;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
        SystemMessageActivity systemMessageActivity = this.f43887Oooo0o;
        oo0ooo0.OooOo0(R.string.message_clear_system_message);
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOo0o(new OooO00o(systemMessageActivity));
        oo0ooo0.OooOOO0();
    }
}
