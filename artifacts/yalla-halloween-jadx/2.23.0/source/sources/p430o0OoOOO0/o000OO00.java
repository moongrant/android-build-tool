package p430o0OoOOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p574o0oOoOOo.oO0Oo0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f45779OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f45780OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Conversation f45781OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<oO0Oo0o0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0Oo0o0 invoke() {
            return (oO0Oo0o0) new ViewModelProvider(o000OO00.this.f45779OooO00o).get(oO0Oo0o0.class);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f45783OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45783OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f45783OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f45783OooO0Oo;
        }

        public final int hashCode() {
            return this.f45783OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45783OooO0Oo.invoke(obj);
        }
    }

    public o000OO00(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45779OooO00o = activity;
        this.f45780OooO0O0 = LazyKt.lazy(new OooO00o());
    }

    public static final void OooO00o(o000OO00 o000oo01, PrivateChatVM privateChatVM) {
        o000oo01.getClass();
        if (privateChatVM.userInfo() != null) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            PrivateChatActivity privateChatActivity = o000oo01.f45779OooO00o;
            UserInfo userInfo = privateChatVM.userInfo();
            Intrinsics.checkNotNull(userInfo);
            UserInfoActivity.OooO00o.OooO0O0(privateChatActivity, oo0ooO.OooO00o(userInfo.getUserId()), false, false, true, false);
        }
    }
}
