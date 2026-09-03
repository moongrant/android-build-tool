package p650o0ooo;

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
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p401o0Oo0O00.OooO;
import p426o0OoO0o0.OooOOOO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h1 extends OooO<String, String> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final TextView f58253OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final TextView f58254OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final TextView f58255OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ProgressBar f58256OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f58257OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f58258OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ProgressBar f58259OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final TextView f58260OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ProgressBar f58261OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f58262OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final TextView f58263OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(FragmentActivity context, long j, String roomName) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        View viewFindViewById = findViewById(o0OO00O.tv_anno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58253OooO = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(o0OO00O.tv_crystal_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f58254OooOO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(o0OO00O.tv_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f58255OooOO0O = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(o0OO00O.pb_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f58256OooOO0o = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(o0OO00O.tv_gold_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f58258OooOOO0 = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(o0OO00O.tv_gold_gift_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f58257OooOOO = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(o0OO00O.pb_gold_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f58259OooOOOO = (ProgressBar) viewFindViewById7;
        View viewFindViewById8 = findViewById(o0OO00O.tv_user_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f58260OooOOOo = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(o0OO00O.tv_user_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f58262OooOOo0 = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(o0OO00O.pb_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f58261OooOOo = (ProgressBar) viewFindViewById10;
        View viewFindViewById11 = findViewById(o0OO00O.tv_room_level_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f58263OooOOoo = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(o0OO00O.ivRoomLevelClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        ((ImageView) viewFindViewById12).setOnClickListener(new f1(this, 0));
        o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        g1 g1Var = new g1(this);
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", String.valueOf(j));
        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43436o00ooo, linkedHashMapOooO00o, g1Var);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_room_level;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(@Nullable View view) {
    }
}
