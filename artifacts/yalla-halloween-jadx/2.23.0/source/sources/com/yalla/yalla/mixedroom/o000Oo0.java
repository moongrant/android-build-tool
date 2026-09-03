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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000Oo0 {

    public static final class OooO00o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23520OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f23520OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            Function0<Unit> function0 = this.f23520OooO0Oo;
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
        String strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(profileLimitModel.getBlockReason()));
        if (profileLimitModel.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(profileLimitModel.getBlockReason())), p601o0oo0O0.o0000oo.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(activity);
        o0oo00o2.OooOo00(strOooO00o);
        if (z) {
            o0oo00o2.OooOOo0(true);
        } else {
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.Continue_));
            o0oo00o2.OooOo0(new OooO00o(function0));
        }
        o0oo00o2.OooOO0o();
    }
}
