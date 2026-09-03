package p430o0OoOOO0;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.io.File;
import java.util.Timer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p357o0OOOoo0.OooOo00;
import p416o0Oo0ooo.y0;
import p579o0oOoo.oOO0O0O;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f45811OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f45812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public j5 f45813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f45814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oOO0O0O f45815OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f45816OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f45817OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOo00 f45818OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f45819OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Timer f45820OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00O00O f45821OooOO0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f45822OooO0Oo;

        public OooO00o(oOO00O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45822OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f45822OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f45822OooO0Oo;
        }

        public final int hashCode() {
            return this.f45822OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45822OooO0Oo.invoke(obj);
        }
    }

    public o00O00OO(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45812OooO00o = activity;
        this.f45815OooO0Oo = new oOO0O0O(activity);
        File file = y0.f45407OooO00o;
        this.f45816OooO0o = OooOOOO.OooO00o(((File) y0.f45412OooO0o0.getValue()).getPath(), File.separator);
        this.f45818OooO0oO = new OooOo00();
    }

    public final void OooO00o(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        chatBottomState.f25685OooO0oO.setValue(Boolean.FALSE);
        j5 j5Var = this.f45813OooO0O0;
        j5 j5Var2 = null;
        if (j5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j5Var = null;
        }
        j5Var.f58171OooO0o.f58597OooO0oO.setVisibility(8);
        j5 j5Var3 = this.f45813OooO0O0;
        if (j5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            j5Var2 = j5Var3;
        }
        j5Var2.f58171OooO0o.f58598OooO0oo.setVisibility(8);
    }
}
