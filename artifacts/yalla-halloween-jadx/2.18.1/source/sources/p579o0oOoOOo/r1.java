package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.UserReturnRewardModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.AutoImage;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502o0o00o0.o00000O;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.l8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class r1 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46260OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f46261OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public UserReturnRewardModel f46262o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooOo.OooO0O0("101049");
            r1.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooOo.OooO0O0("101049");
            r1.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            r1 r1Var = r1.this;
            Objects.requireNonNull(r1Var);
            o00O00.OooO0O0("用户召回奖励 \nData:'" + r1Var.f46262o000oOoO + '\'');
            OooOo.OooO0O0("101048");
            UserReturnRewardModel userReturnRewardModel = r1Var.f46262o000oOoO;
            if (userReturnRewardModel != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                webPageInfo.OooO0Oo(o00O0.OooO0oO(userReturnRewardModel.getActionH5Url()));
                webPageInfo.f21220OoooO0 = true;
                WebActivity.f22108OoooooO.OooO00o(r1Var.f41543Oooo0o, webPageInfo);
            }
            r1Var.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<l8> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final l8 invoke() {
            l8 l8VarInflate = l8.inflate(LayoutInflater.from(r1.this.f41543Oooo0o), r1.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(l8VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return l8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f46260OoooO = fragmentActivity;
        this.f46261OoooOO0 = LazyKt.lazy(new OooO0o());
        ConstraintLayout constraintLayout = OooOO0O().f49916OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setGravity(17);
        }
        ConstraintLayout constraintLayout2 = OooOO0O().f49916OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
        o00O0O.OooO0Oo(constraintLayout2, new OooO00o());
        ImageView imageView = OooOO0O().f49918OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o00O0O.OooO0Oo(imageView, new OooO0O0());
        AutoImage autoImage = OooOO0O().f49917OooO0O0;
        Intrinsics.checkNotNullExpressionValue(autoImage, "binding.autoImage");
        o00O0O.OooO0Oo(autoImage, new OooO0OO());
    }

    public final l8 OooOO0O() {
        return (l8) this.f46261OoooOO0.getValue();
    }
}
