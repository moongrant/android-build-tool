package p159o00OoOO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o {

    public static final class OooO00o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32471Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f32471Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            Function0<Unit> function0 = this.f32471Oooo0o;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void OooO00o(@NotNull AppCompatActivity activity, @Nullable ProfileLimitModel profileLimitModel, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (profileLimitModel == null) {
            function0.invoke();
            return;
        }
        boolean z = false;
        String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(profileLimitModel.getBlockReason()));
        if (profileLimitModel.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() <= 0) {
            strOooO00o = OooOo.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(profileLimitModel.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
        oo0ooo0.OooOo0O(strOooO00o);
        if (z) {
            oo0ooo0.OooOOo(true);
        } else {
            oo0ooo0.OooOoOO(true);
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.Continue_));
            oo0ooo0.OooOo0o(new OooO00o(function0));
        }
        oo0ooo0.OooOOO0();
    }
}
