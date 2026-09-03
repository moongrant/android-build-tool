package p176o00OoooO;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.oOO00O;
import p146o00Oo000.OooO0O0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oO0OOo0o extends OooO0O0<String, String> {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f32870Ooooo0o = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final TextView f32871OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final TextView f32872OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final TextView f32873OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ProgressBar f32874OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f32875OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final ProgressBar f32876OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final TextView f32877OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final TextView f32878OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final ProgressBar f32879OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final TextView f32880Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final TextView f32881o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(Context context, long j, String roomName) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        View viewFindViewById = findViewById(R.id.tv_anno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_anno)");
        this.f32872OoooO0 = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_crystal_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tv_crystal_gift_max)");
        this.f32873OoooO0O = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tv_crystal_gift)");
        this.f32871OoooO = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.pb_crystal_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.pb_crystal_gift)");
        this.f32874OoooOO0 = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_gold_gift_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_gold_gift_max)");
        this.f32881o000oOoO = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_gold_gift_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.tv_gold_gift_progress)");
        this.f32875OoooOOO = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.pb_gold_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.pb_gold_gift)");
        this.f32876OoooOOo = (ProgressBar) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_user_max);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.tv_user_max)");
        this.f32877OoooOo0 = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.tv_user_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(R.id.tv_user_progress)");
        this.f32878OoooOoO = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.pb_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(R.id.pb_user)");
        this.f32879OoooOoo = (ProgressBar) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.tv_room_level_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(R.id.tv_room_level_name)");
        this.f32880Ooooo00 = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.ivRoomLevelClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(R.id.ivRoomLevelClose)");
        ((ImageView) viewFindViewById12).setOnClickListener(new oOO00O(this, 1));
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        ooOOOOoo oooooooo = new ooOOOOoo(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", String.valueOf(j));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32337o0ooOO0, mapOooO0O0, oooooooo);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_room_level;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(@Nullable View view) {
    }
}
