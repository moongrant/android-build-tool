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
import p574o0oOoOOo.oO;
import p574o0oOoOOo.oOo00o00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25917OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SystemMessageActivity f25918OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SystemMessageActivity systemMessageActivity) {
            super(0);
            this.f25918OooO0Oo = systemMessageActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p587o0oOooo.o0OO000.OooO00o("104026");
            int i = SystemMessageActivity.f25764OooOo0o;
            oO oOVar = (oO) this.f25918OooO0Oo.f25766OooOo0.getValue();
            oOVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(oOVar), null, null, new oOo00o00(null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public o0O00(SystemMessageActivity systemMessageActivity) {
        this.f25917OooO0oO = systemMessageActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p587o0oOooo.o0OO000.OooO00o("104025");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(context);
        o0oo00o2.OooOOoo(oO00OOo0.message_clear_system_message);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new OooO00o(this.f25917OooO0oO));
        o0oo00o2.OooOO0o();
    }
}
