package p601o0oo00Oo;

import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o0ooOOo;
import p153o00Oo0oO.o000000O;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48172Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(MomentDetailView momentDetailView) {
        super(0);
        this.f48172Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Monents_follow");
        MomentDetailView momentDetailView = this.f48172Oooo0o;
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        String strValueOf = String.valueOf(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel2 = momentDetailView.f24941Oooo0oo;
        o000000O.OooO00o(strValueOf, o0ooOOo.OooO00o(sb, (momentDetailModel2 == null || !momentDetailModel2.getIsFollow()) ? 0 : 1, ""), new o0O0oo0o(momentDetailView, momentDetailView.getContext()));
        return null;
    }
}
