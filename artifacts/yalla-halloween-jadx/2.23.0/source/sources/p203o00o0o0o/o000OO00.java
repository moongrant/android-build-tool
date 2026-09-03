package p203o00o0o0o;

import android.view.View;
import androidx.compose.animation.OooO;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.Exemplar;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOO.OooO00o;
import p245o00oo0o.o00O;
import p284o0O0OOoO.OooOO0O;
import p284o0O0OOoO.OooOOO;
import p284o0O0OOoO.OooOOO0;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.w3;
import p562o0oOo0O.o000oOoO;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO00 implements o00O.OooO00o, OooOOO0, o000oOoO, BaseQuickAdapter.OooO0O0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39176OooO0Oo;

    public /* synthetic */ o000OO00(Object obj) {
        this.f39176OooO0Oo = obj;
    }

    @Override // p284o0O0OOoO.OooOOO0
    public final void OooO00o(OooOO0O oooOO0O) {
        OooO00o oooO00o = (OooO00o) this.f39176OooO0Oo;
        synchronized (oooO00o) {
            if (oooO00o.f42012OooO0O0 instanceof OooOOO) {
                oooO00o.f42013OooO0OO.add(oooOO0O);
            }
            oooO00o.f42012OooO0O0.OooO00o(oooOO0O);
        }
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        BanEnterRoomListActivity this$0 = (BanEnterRoomListActivity) this.f39176OooO0Oo;
        int i = BanEnterRoomListActivity.f26465OooOooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f26476OooOoOO) {
            this$0.OooOo0o(this$0.f26477OooOoo, false);
        } else {
            this$0.OooOo0O(false);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        w3 this$0 = (w3) this.f39176OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        if (id == oO00O0oO.llBuyTheme) {
            if (o000000O.f46724OoooOoo.getValue() != null) {
                Object objOooOOO = baseQuickAdapter.OooOOO(i);
                Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                this$0.f53194OooOO0o.invoke((ThemeModel) objOooOOO);
            } else {
                OooO.OooO0O0(oOO00O.Create_Room_Tips, null, 2, null, o00O0.f45732OooO00o);
            }
            this$0.OooO0O0();
            return;
        }
        if (id != oO00O0oO.flSendTheme) {
            if (id == oO00O0oO.clRootView || id == oO00O0oO.ivClose) {
                this$0.OooO0O0();
            }
        } else {
            Object objOooOOO2 = baseQuickAdapter.OooOOO(i);
            Intrinsics.checkNotNull(objOooOOO2, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
            this$0.f53193OooOO0O.invoke((ThemeModel) objOooOOO2);
            this$0.OooO0O0();
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0Oo((Exemplar.Builder) this.f39176OooO0Oo, (AttributeKey) obj, obj2);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerErrorChanged(((o0O000o0) this.f39176OooO0Oo).f39266OooO0o);
    }
}
