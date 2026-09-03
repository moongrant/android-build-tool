package p434o0OoOOOO;

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
import p358o0OOOoo.o000oOoO;
import p405o0Oo0OOO.oO0O00oO;
import p466o0OooOoo.o0O0o00O;
import p590o0oOooo0.i0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f46977OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f46978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0O00oO f46979OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f46980OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final i0 f46981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f46982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46983OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000oOoO f46984OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f46985OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Timer f46986OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0O00o0 f46987OooOO0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f46988OooO0Oo;

        public OooO00o(oo00oO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46988OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46988OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46988OooO0Oo;
        }

        public final int hashCode() {
            return this.f46988OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46988OooO0Oo.invoke(obj);
        }
    }

    public o0oOOo(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46978OooO00o = activity;
        this.f46981OooO0Oo = new i0(activity);
        File file = o0O0o00O.f47844OooO00o;
        this.f46982OooO0o = OooOOOO.OooO00o(((File) o0O0o00O.f47849OooO0o0.getValue()).getPath(), File.separator);
        this.f46984OooO0oO = new o000oOoO();
    }

    public final void OooO00o(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        chatBottomState.f25230OooO0oO.setValue(Boolean.FALSE);
        oO0O00oO oo0o00oo = this.f46979OooO0O0;
        oO0O00oO oo0o00oo2 = null;
        if (oo0o00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oo0o00oo = null;
        }
        oo0o00oo.f44883OooO0o.f45239OooO0oO.setVisibility(8);
        oO0O00oO oo0o00oo3 = this.f46979OooO0O0;
        if (oo0o00oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oo0o00oo2 = oo0o00oo3;
        }
        oo0o00oo2.f44883OooO0o.f45240OooO0oo.setVisibility(8);
    }
}
