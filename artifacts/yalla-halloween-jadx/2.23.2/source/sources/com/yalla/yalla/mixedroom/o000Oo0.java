package com.yalla.yalla.mixedroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.ProfileLimitModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000Oo0 {

    public static final class OooO00o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23063OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f23063OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            Function0<Unit> function0 = this.f23063OooO0Oo;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(@NotNull AppCompatActivity activity, @Nullable ProfileLimitModel profileLimitModel, @Nullable Function0 function0) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (profileLimitModel == null) {
            function0.invoke();
            return;
        }
        String strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.RoomInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(profileLimitModel.getBlockReason()));
        if (profileLimitModel.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(profileLimitModel.getBlockReason())), o0O0O0o0.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        o000O o000o = new o000O(activity);
        o000o.OooOo00(strOooO00o);
        if (z) {
            o000o.OooOOo0(true);
        } else {
            o000o.OooOo(true);
            o000o.OooOOOo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Continue_));
            o000o.OooOo0(new OooO00o(function0));
        }
        o000o.OooOO0o();
    }
}
