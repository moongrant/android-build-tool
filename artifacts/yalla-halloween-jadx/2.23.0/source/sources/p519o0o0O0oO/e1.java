package p519o0o0O0oO;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class e1 extends OooOO0<String, String> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final TextView f52209OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final TextView f52210OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final TextView f52211OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ProgressBar f52212OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f52213OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f52214OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ProgressBar f52215OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final TextView f52216OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ProgressBar f52217OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f52218OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final TextView f52219OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(FragmentActivity context, long j, String roomName) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        View viewFindViewById = findViewById(oO00O0oO.tv_anno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_anno)");
        this.f52209OooO = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tv_crystal_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tv_crystal_gift_max)");
        this.f52210OooOO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.tv_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tv_crystal_gift)");
        this.f52211OooOO0O = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.pb_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.pb_crystal_gift)");
        this.f52212OooOO0o = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.tv_gold_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_gold_gift_max)");
        this.f52214OooOOO0 = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(oO00O0oO.tv_gold_gift_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.tv_gold_gift_progress)");
        this.f52213OooOOO = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(oO00O0oO.pb_gold_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.pb_gold_gift)");
        this.f52215OooOOOO = (ProgressBar) viewFindViewById7;
        View viewFindViewById8 = findViewById(oO00O0oO.tv_user_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.tv_user_max)");
        this.f52216OooOOOo = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(oO00O0oO.tv_user_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(R.id.tv_user_progress)");
        this.f52218OooOOo0 = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(oO00O0oO.pb_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(R.id.pb_user)");
        this.f52217OooOOo = (ProgressBar) viewFindViewById10;
        View viewFindViewById11 = findViewById(oO00O0oO.tv_room_level_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(R.id.tv_room_level_name)");
        this.f52219OooOOoo = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(oO00O0oO.ivRoomLevelClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(R.id.ivRoomLevelClose)");
        ((ImageView) viewFindViewById12).setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1 this$0 = this.f52187OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        });
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        d1 d1Var = new d1(this);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barid", String.valueOf(j));
        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44177o00ooo, linkedHashMapOooO00o, d1Var);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_room_level;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(@Nullable View view) {
    }
}
