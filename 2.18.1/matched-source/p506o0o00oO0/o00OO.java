package p506o0o00oO0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.vm.ShareLogViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p437o0OoOOOo.o0O0oo0o;
import p502o0o00o0.o00000O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.h8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public ShareLogViewModel f41628OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41629OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f41630OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f41631OooO0o0;

    public static final class OooO00o extends o00000O {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f41632OoooO;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @NotNull
        public final Lazy f41633OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        @Nullable
        public String f41634OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        @Nullable
        public ShareType f41635OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        @Nullable
        public Function1<? super String, Unit> f41636OoooOo0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @Nullable
        public String f41637o000oOoO;

        /* JADX INFO: renamed from: o0o00oO0.o00OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0397OooO00o extends Lambda implements Function0<h8> {
            public C0397OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final h8 invoke() {
                h8 h8VarInflate = h8.inflate(LayoutInflater.from(OooO00o.this.f41543Oooo0o), OooO00o.this.f41545Oooo0oo, true);
                Intrinsics.checkNotNullExpressionValue(h8VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
                return h8VarInflate;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull FragmentActivity activity) {
            super(activity, 0);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f41632OoooO = activity;
            this.f41633OoooOO0 = LazyKt.lazy(new C0397OooO00o());
            OooOO0O().f49528OooO0o0.setOnClickListener(new o0O0oo0o(this, 1));
        }

        @Override // p502o0o00o0.o00000O
        public final void OooOO0() {
            super.OooOO0();
            TextView textView = OooOO0O().f49527OooO0Oo;
            String str = this.f41634OoooOOO;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            ViewGroup.LayoutParams layoutParams = OooOO0O().f49525OooO0O0.getLayoutParams();
            layoutParams.height = this.f41635OoooOOo == ShareType.Events ? (int) (((double) layoutParams.width) * 0.564d) : layoutParams.width;
            OooOO0O().f49525OooO0O0.setLayoutParams(layoutParams);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f41632OoooO);
            String str2 = this.f41637o000oOoO;
            oooO00o.f48429OooO0OO = str2 != null ? str2 : "";
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(OooOO0O().f49525OooO0O0);
        }

        public final h8 OooOO0O() {
            return (h8) this.f41633OoooOO0.getValue();
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Web.ordinal()] = 2;
            iArr[ShareType.Events.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            return new OooO00o(o00OO.this.f41627OooO00o);
        }
    }

    public o00OO(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41627OooO00o = activity;
        this.f41628OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f41629OooO0OO = 1703;
        this.f41630OooO0Oo = "com.instagram.android";
        this.f41631OooO0o0 = LazyKt.lazy(new OooO0OO());
    }

    public final OooO00o OooO00o() {
        return (OooO00o) this.f41631OooO0o0.getValue();
    }
}
