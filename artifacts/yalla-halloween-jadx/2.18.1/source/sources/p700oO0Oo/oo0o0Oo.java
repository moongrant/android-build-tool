package p700oO0Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p596o0oo0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f52920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f52921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Conversation f52922OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<OooOOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            return (OooOOO0) new ViewModelProvider(oo0o0Oo.this.f52920OooO00o).get(OooOOO0.class);
        }
    }

    public oo0o0Oo(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52920OooO00o = activity;
        this.f52921OooO0O0 = LazyKt.lazy(new OooO00o());
    }

    public static final void OooO00o(oo0o0Oo oo0o0oo, PrivateChatVM privateChatVM) {
        Objects.requireNonNull(oo0o0oo);
        o0O00000.OooO0OO("Message_chat_profile");
        if (privateChatVM.userInfo() != null) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            PrivateChatActivity privateChatActivity = oo0o0oo.f52920OooO00o;
            StringBuilder sb = new StringBuilder();
            UserInfo userInfo = privateChatVM.userInfo();
            Intrinsics.checkNotNull(userInfo);
            sb.append(userInfo.getUserId());
            sb.append("");
            oooO00o.OooO0OO(privateChatActivity, sb.toString(), false, false, true, false);
        }
    }
}
