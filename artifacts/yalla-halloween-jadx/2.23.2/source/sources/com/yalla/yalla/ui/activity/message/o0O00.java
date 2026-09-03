package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25475OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SystemMessageActivity f25476OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SystemMessageActivity systemMessageActivity) {
            super(0);
            this.f25476OooO0Oo = systemMessageActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("104026");
            int i = SystemMessageActivity.f25309OooOo0o;
            p582o0oOoo0.o000 o000Var = (p582o0oOoo0.o000) this.f25476OooO0Oo.f25311OooOo0.getValue();
            o000Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(o000Var), null, null, new p582o0oOoo0.o0000OO0(null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public o0O00(SystemMessageActivity systemMessageActivity) {
        this.f25475OooO0oO = systemMessageActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0oo0000.OooO00o.OooO0O0("104025");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(context);
        o000o.OooOOoo(p562o0oOo000.o000000.message_clear_system_message);
        o000o.OooOo(true);
        o000o.OooOo0(new OooO00o(this.f25475OooO0oO));
        o000o.OooOO0o();
    }
}
