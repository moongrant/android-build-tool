package p434o0OoOOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.session.o0000O00;
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
import p582o0oOoo0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f46935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f46936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Conversation f46937OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<o0000O0O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O0O invoke() {
            return (o0000O0O) new ViewModelProvider(o00OO.this.f46935OooO00o).get(o0000O0O.class);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f46939OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46939OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46939OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46939OooO0Oo;
        }

        public final int hashCode() {
            return this.f46939OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46939OooO0Oo.invoke(obj);
        }
    }

    public o00OO(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46935OooO00o = activity;
        this.f46936OooO0O0 = LazyKt.lazy(new OooO00o());
    }

    public static final void OooO00o(o00OO o00oo2, PrivateChatVM privateChatVM) {
        o00oo2.getClass();
        if (privateChatVM.userInfo() != null) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            PrivateChatActivity privateChatActivity = o00oo2.f46935OooO00o;
            UserInfo userInfo = privateChatVM.userInfo();
            Intrinsics.checkNotNull(userInfo);
            UserInfoActivity.OooO00o.OooO0O0(privateChatActivity, o0000O00.OooO00o(userInfo.getUserId()), false, false, true, false);
        }
    }
}
