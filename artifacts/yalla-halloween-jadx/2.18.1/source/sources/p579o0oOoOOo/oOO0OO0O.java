package p579o0oOoOOo;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.easydialog.WindowAnim;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.GuessGiftListFragment;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o000000O;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.ef;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOO0OO0O extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Context f46095OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ef f46096OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO0OO0O(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46095OoooO = context;
        ef efVarInflate = ef.inflate(LayoutInflater.from(context), this.f41545Oooo0oo, true);
        Intrinsics.checkNotNullExpressionValue(efVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f46096OoooOO0 = efVarInflate;
        Window window = this.f41544Oooo0oO.getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        if (context instanceof FragmentActivity) {
            efVarInflate.f49266OooOO0O.setText(o000O0O0.OooO0OO(R.string.room_dialog_guess_list_title));
            efVarInflate.f49259OooO0OO.setOnClickListener(this);
            OooOO0O(0);
            efVarInflate.f49256OooO.setOnClickListener(this);
            efVarInflate.f49268OooOOO.setOnClickListener(this);
            efVarInflate.f49271OooOOOo.setOnClickListener(this);
            efVarInflate.f49258OooO0O0.setOnClickListener(this);
            efVarInflate.f49272OooOOo.setAdapter(new oOO0O0O(CollectionsKt.mutableListOf(new GuessGiftListFragment((FragmentActivity) context), new GuessListFragment(context, 0, 2, 2, null)), context));
            efVarInflate.f49272OooOOo.registerOnPageChangeCallback(new oOO0O0O0(this));
            LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").observe((LifecycleOwner) context, new o000000O(this, 6));
        }
    }

    public final void OooOO0O(int i) {
        this.f46096OoooOO0.f49256OooO.setSelected(i == 0);
        this.f46096OoooOO0.f49268OooOOO.setSelected(i == 1);
        if (i == 0 && oo000o.OooO0o0()) {
            this.f46096OoooOO0.f49256OooO.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_dialog_guess_list_table_right));
            this.f46096OoooOO0.f49268OooOOO.setBackground(null);
        } else if (i == 0) {
            this.f46096OoooOO0.f49256OooO.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_dialog_guess_list_table_left));
            this.f46096OoooOO0.f49268OooOOO.setBackground(null);
        } else if (i == 1 && oo000o.OooO0o0()) {
            this.f46096OoooOO0.f49256OooO.setBackground(null);
            this.f46096OoooOO0.f49268OooOOO.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_dialog_guess_list_table_left));
        } else if (i == 1) {
            this.f46096OoooOO0.f49256OooO.setBackground(null);
            this.f46096OoooOO0.f49268OooOOO.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_dialog_guess_list_table_right));
        }
        ef efVar = this.f46096OoooOO0;
        efVar.f49263OooO0oO.setImageResource(efVar.f49256OooO.isSelected() ? R.drawable.room_dialog_guessing_gift : R.drawable.icon_room_bottom_game_box_mora);
    }

    @Override // p502o0o00o0.o00000O, android.view.View.OnClickListener
    public final void onClick(@NotNull View v) throws Throwable {
        Intrinsics.checkNotNullParameter(v, "v");
        super.onClick(v);
        if (Intrinsics.areEqual(v, this.f46096OoooOO0.f49256OooO)) {
            this.f46096OoooOO0.f49272OooOOo.setCurrentItem(0, false);
            return;
        }
        if (Intrinsics.areEqual(v, this.f46096OoooOO0.f49268OooOOO)) {
            this.f46096OoooOO0.f49272OooOOo.setCurrentItem(1, false);
            return;
        }
        if (!Intrinsics.areEqual(v, this.f46096OoooOO0.f49259OooO0OO)) {
            if (Intrinsics.areEqual(v, this.f46096OoooOO0.f49271OooOOOo)) {
                OooO0O0();
                return;
            } else {
                if (Intrinsics.areEqual(v, this.f46096OoooOO0.f49258OooO0O0)) {
                    UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
                    Context context = this.f46095OoooO;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    UserInfoActivity.OooO00o.OooO0Oo(oooO00o, (FragmentActivity) context, String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()), false, 12);
                    return;
                }
                return;
            }
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f41543Oooo0o);
        View childAt = oo0ooo0.f34201OooO0OO.getChildAt(0);
        if (childAt == null) {
            throw new Throwable("Must be called after setContentView");
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        int iRoundToInt = MathKt.roundToInt(Resources.getSystem().getDisplayMetrics().widthPixels * 1.0f);
        layoutParams.width = iRoundToInt;
        childAt.setLayoutParams(layoutParams);
        Window windowOooO0o0 = oo0ooo0.OooO0o0();
        WindowManager.LayoutParams attributes = windowOooO0o0 != null ? windowOooO0o0.getAttributes() : null;
        if (attributes != null) {
            attributes.width = iRoundToInt;
        }
        Intrinsics.checkNotNull(oo0ooo0, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        oo0ooo0.OooO();
        oo0ooo0.OooOO0o(WindowAnim.BottomWithAlpha);
        oo0ooo0.OooOOO().f34395OooO00o.setBackgroundResource(R.drawable.room_shape_dialog_guess_list_bg);
        oo0ooo0.OooOoo(R.string.room_dialog_guess_list_title);
        oo0ooo0.OooOOO().f34401OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
        View viewInflate = View.inflate(this.f41543Oooo0o, R.layout.room_dialog_guess_list_directions, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layou…ss_list_directions, null)");
        oo0ooo0.OooOo00(viewInflate);
        oo0ooo0.OooOooo();
        oo0ooo0.OooOOO().f34397OooO0OO.setImageResource(R.drawable.room_dialog_guess_list_direction);
        oo0ooo0.OooOOo(false);
        oo0ooo0.OooOOO0();
    }
}
