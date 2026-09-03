package p519o0o0O0oO;

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
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.GuessGiftListFragment;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;
import p641o0ooOOOO.u7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0000o0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Context f52798OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final u7 f52799OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0000o0(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52798OooOO0O = context;
        u7 u7VarInflate = u7.inflate(LayoutInflater.from(context), this.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(u7VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f52799OooOO0o = u7VarInflate;
        Window window = this.f52534OooO0o0.getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        if (context instanceof FragmentActivity) {
            u7VarInflate.f58969OooOO0O.setText(o0000.OooO0OO(oO00OOo0.room_dialog_guess_list_title));
            u7VarInflate.f58962OooO0OO.setOnClickListener(this);
            OooOO0(0);
            u7VarInflate.f58959OooO.setOnClickListener(this);
            u7VarInflate.f58971OooOOO.setOnClickListener(this);
            u7VarInflate.f58974OooOOOo.setOnClickListener(this);
            u7VarInflate.f58961OooO0O0.setOnClickListener(this);
            oO0000O oo0000o = new oO0000O(context, CollectionsKt.mutableListOf(new GuessGiftListFragment((FragmentActivity) context), new GuessListFragment(context, 0, 2, 2, null)));
            ViewPager2 viewPager2 = u7VarInflate.f58975OooOOo;
            viewPager2.setAdapter(oo0000o);
            viewPager2.registerOnPageChangeCallback(new oO00000o(this));
            LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").observe((LifecycleOwner) context, new oO0000Oo(this));
        }
    }

    public final void OooOO0(int i) {
        u7 u7Var = this.f52799OooOO0o;
        u7Var.f58959OooO.setSelected(i == 0);
        u7Var.f58971OooOOO.setSelected(i == 1);
        if (i == 0 && OooO.OooO0o0()) {
            u7Var.f58959OooO.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_dialog_guess_list_table_right));
            u7Var.f58971OooOOO.setBackground(null);
        } else if (i == 0) {
            u7Var.f58959OooO.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_dialog_guess_list_table_left));
            u7Var.f58971OooOOO.setBackground(null);
        } else if (i == 1 && OooO.OooO0o0()) {
            u7Var.f58959OooO.setBackground(null);
            u7Var.f58971OooOOO.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_dialog_guess_list_table_left));
        } else if (i == 1) {
            u7Var.f58959OooO.setBackground(null);
            u7Var.f58971OooOOO.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_dialog_guess_list_table_right));
        }
        u7Var.f58966OooO0oO.setImageResource(u7Var.f58959OooO.isSelected() ? oOo00OO0.room_dialog_guessing_gift : oOo00OO0.icon_room_bottom_game_box_mora);
    }

    @Override // p519o0o0O0oO.o00O00OO, android.view.View.OnClickListener
    public final void onClick(@NotNull View v) throws Throwable {
        Intrinsics.checkNotNullParameter(v, "v");
        super.onClick(v);
        u7 u7Var = this.f52799OooOO0o;
        boolean zAreEqual = Intrinsics.areEqual(v, u7Var.f58959OooO);
        ViewPager2 viewPager2 = u7Var.f58975OooOOo;
        if (zAreEqual) {
            viewPager2.setCurrentItem(0, false);
            return;
        }
        if (Intrinsics.areEqual(v, u7Var.f58971OooOOO)) {
            viewPager2.setCurrentItem(1, false);
            return;
        }
        if (!Intrinsics.areEqual(v, u7Var.f58962OooO0OO)) {
            if (Intrinsics.areEqual(v, u7Var.f58974OooOOOo)) {
                OooO0O0();
                return;
            }
            if (Intrinsics.areEqual(v, u7Var.f58961OooO0O0)) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                Context context = this.f52798OooOO0O;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, (FragmentActivity) context, String.valueOf(o000000O.OooOOo0().getValue()), false, 12);
                return;
            }
            return;
        }
        Context context2 = this.f52532OooO0Oo;
        o0OO00O o0oo00o2 = new o0OO00O(context2);
        View childAt = o0oo00o2.f10135OooO0OO.getChildAt(0);
        if (childAt == null) {
            throw new Throwable("Must be called after setContentView");
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        int iRoundToInt = MathKt.roundToInt(Resources.getSystem().getDisplayMetrics().widthPixels * 1.0f);
        layoutParams.width = iRoundToInt;
        childAt.setLayoutParams(layoutParams);
        Window windowOooO0Oo = o0oo00o2.OooO0Oo();
        WindowManager.LayoutParams attributes = windowOooO0Oo != null ? windowOooO0Oo.getAttributes() : null;
        if (attributes != null) {
            attributes.width = iRoundToInt;
        }
        Intrinsics.checkNotNull(o0oo00o2, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        o0oo00o2.OooO0oo();
        o0oo00o2.OooOO0O(WindowAnim.BottomWithAlpha);
        o0oo00o2.OooOOO0().f38471OooO00o.setBackgroundResource(oOo00OO0.room_shape_dialog_guess_list_bg);
        o0oo00o2.OooOoO0(oO00OOo0.room_dialog_guess_list_title);
        o0oo00o2.OooOOO0().f38477OooO0oO.setTextColor(o0000.OooO00o(oO00O0o.white));
        View viewInflate = View.inflate(context2, oO00OO0O.room_dialog_guess_list_directions, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layou…ss_list_directions, null)");
        o0oo00o2.OooOOo(viewInflate);
        int i = oOo00OO0.room_dialog_guess_list_direction;
        o0oo00o2.OooOoOO();
        o0oo00o2.OooOOO0().f38473OooO0OO.setImageResource(i);
        o0oo00o2.OooOOo0(false);
        o0oo00o2.OooOO0o();
    }
}
