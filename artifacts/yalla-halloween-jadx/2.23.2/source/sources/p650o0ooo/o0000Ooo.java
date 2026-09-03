package p650o0ooo;

import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.model.StarsModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p031OoooO0.o0OoOo0;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.g2;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.O0O0;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAchievementBadgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementBadgeDialog.kt\ncom/yalla/yalla/ui/dialog/AchievementBadgeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class o0000Ooo extends o0O0ooO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o00000O f58470OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58471OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public g2 f58472OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f58473OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f58474OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f58475OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f58476OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull FragmentActivity activity) {
        super(activity, o000000O.FullscreenDialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58471OooOOO0 = activity;
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        this.f58476OooOOoo = o0Oo0oo.medal_select_bg;
    }

    public static final void OooO0Oo(o0000Ooo o0000ooo, int i, ViewHolder viewHolder) {
        int i2;
        o0000ooo.getClass();
        if (i == 1) {
            i2 = o0OOO0o.color_bronze;
        } else if (i == 2) {
            i2 = o0OOO0o.color_silver;
        } else if (i != 3) {
            i2 = i != 4 ? o0OOO0o.color_bronze : o0OOO0o.color_diamond;
        } else {
            i2 = o0OOO0o.color_gold;
        }
        ((AppCompatTextView) viewHolder.getView(o0OO00O.tvBadgeName)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(o0OO00O.tvBadgeDes)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(o0OO00O.tvBadgeObtainTime)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(o0OO00O.tv_qt)).setTextColor(o0000.OooO00o(i2));
    }

    public static final void OooO0o(o0000Ooo o0000ooo, int i, int i2, long j, ViewHolder viewHolder) {
        o0000ooo.getClass();
        int i3 = o0OO00O.tvBadgeObtainTime;
        viewHolder.setGone(i3, i == i2 && j > 0);
        viewHolder.setText(i3, o0000O.OooO00o(o0000.OooO0OO(o000000.user_badge_time), o0O0O0o0.OooO0OO(j, "dd/MM/yyyy")));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    public static final void OooO0o0(o0000Ooo o0000ooo, int i, int i2, AppCompatTextView appCompatTextView, BadgeDataModel badgeDataModel) {
        String strOooO00o;
        o0000ooo.getClass();
        String strOooO0Oo = o0O0O0Oo.OooO0Oo(String.valueOf(badgeDataModel.getCurrentvalue()));
        StarsModel stars = badgeDataModel.getStars();
        String strOooO0Oo2 = o0O0O0Oo.OooO0Oo(String.valueOf(stars != null ? Integer.valueOf(stars.getOneStars()) : null));
        StarsModel stars2 = badgeDataModel.getStars();
        String strOooO0Oo3 = o0O0O0Oo.OooO0Oo(String.valueOf(stars2 != null ? Integer.valueOf(stars2.getTwoStars()) : null));
        StarsModel stars3 = badgeDataModel.getStars();
        String strOooO0Oo4 = o0O0O0Oo.OooO0Oo(String.valueOf(stars3 != null ? Integer.valueOf(stars3.getThreeStars()) : null));
        StarsModel stars4 = badgeDataModel.getStars();
        String strOooO0Oo5 = o0O0O0Oo.OooO0Oo(String.valueOf(stars4 != null ? Integer.valueOf(stars4.getFourthStars()) : null));
        if (i == 0 || i == 1) {
            if (i2 == 0) {
                String progress = badgeDataModel.getProgress();
                String[] strArr = new String[1];
                if (o0000ooo.f58475OooOOo0) {
                    strOooO0Oo2 = o0OoOo0.OooO0O0(strOooO0Oo, "/", strOooO0Oo2);
                }
                strArr[0] = strOooO0Oo2;
                strOooO00o = o0000O.OooO00o(progress, strArr);
            } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo2);
            } else {
                strOooO00o = "";
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    strOooO00o = "";
                } else if (i2 == 0 || i2 == 1) {
                    strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo5);
                } else if (i2 == 2 || i2 == 3) {
                    String progress2 = badgeDataModel.getProgress();
                    String[] strArr2 = new String[1];
                    if (o0000ooo.f58475OooOOo0) {
                        strOooO0Oo5 = o0OoOo0.OooO0O0(strOooO0Oo, "/", strOooO0Oo5);
                    }
                    strArr2[0] = strOooO0Oo5;
                    strOooO00o = o0000O.OooO00o(progress2, strArr2);
                } else if (i2 != 4) {
                    strOooO00o = "";
                } else {
                    strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo5);
                }
            } else if (i2 == 0 || i2 == 1) {
                strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo4);
            } else if (i2 == 2) {
                String progress3 = badgeDataModel.getProgress();
                String[] strArr3 = new String[1];
                if (o0000ooo.f58475OooOOo0) {
                    strOooO0Oo4 = o0OoOo0.OooO0O0(strOooO0Oo, "/", strOooO0Oo4);
                }
                strArr3[0] = strOooO0Oo4;
                strOooO00o = o0000O.OooO00o(progress3, strArr3);
            } else if (i2 == 3 || i2 == 4) {
                strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo4);
            } else {
                strOooO00o = "";
            }
        } else if (i2 == 0) {
            strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo3);
        } else if (i2 == 1) {
            String progress4 = badgeDataModel.getProgress();
            String[] strArr4 = new String[1];
            if (o0000ooo.f58475OooOOo0) {
                strOooO0Oo3 = o0OoOo0.OooO0O0(strOooO0Oo, "/", strOooO0Oo3);
            }
            strArr4[0] = strOooO0Oo3;
            strOooO00o = o0000O.OooO00o(progress4, strArr4);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            strOooO00o = o0000O.OooO00o(badgeDataModel.getProgress(), strOooO0Oo3);
        } else {
            strOooO00o = "";
        }
        appCompatTextView.setText(strOooO00o);
    }

    public static final void OooO0oO(o0000Ooo o0000ooo, int i, int i2, int i3, ViewHolder viewHolder) {
        o0000ooo.getClass();
        if (i > i2) {
            i = 0;
        }
        Uri uriOooO00o = O0O0.OooO00o(i3, i);
        View view = viewHolder.getView(o0OO00O.sdv_medal);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.code.android.uikit.svga.SVGAView");
        SVGAView sVGAView = (SVGAView) view;
        int i4 = o0Oo0oo.icon_badge_no_pic;
        sVGAView.f13232OooOooO = i4;
        sVGAView.setImageResource(i4);
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sVGAView.OooOO0O(string, o0000ooo.f58471OooOOO0);
        sVGAView.OooOO0o();
    }

    public static final void OooO0oo(o0000Ooo o0000ooo, int i, ViewHolder viewHolder) {
        o0000ooo.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewHolder.getView(o0OO00O.iv_bronze);
        int i2 = o0000ooo.f58476OooOOoo;
        if (i <= 1) {
            appCompatImageView.setBackgroundResource(i2);
        } else {
            appCompatImageView.setBackground(null);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewHolder.getView(o0OO00O.iv_silver);
        if (i == 2) {
            appCompatImageView2.setBackgroundResource(i2);
        } else {
            appCompatImageView2.setBackground(null);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewHolder.getView(o0OO00O.iv_gold);
        if (i == 3) {
            appCompatImageView3.setBackgroundResource(i2);
        } else {
            appCompatImageView3.setBackground(null);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) viewHolder.getView(o0OO00O.iv_diamond);
        if (i == 4) {
            appCompatImageView4.setBackgroundResource(i2);
        } else {
            appCompatImageView4.setBackground(null);
        }
    }

    @Override // p650o0ooo.o0O0ooO
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        g2 g2VarInflate = g2.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(g2VarInflate, "inflate(...)");
        this.f58472OooOOOO = g2VarInflate;
        this.f58470OooOOO = new o00000O(this, getContext(), oo0o0Oo.user_item_badge_detail);
        g2 g2Var = this.f58472OooOOOO;
        g2 g2Var2 = null;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        g2Var.f43878OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext(), 0));
        androidx.recyclerview.widget.o000000 o000000Var = new androidx.recyclerview.widget.o000000();
        g2 g2Var3 = this.f58472OooOOOO;
        if (g2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var3 = null;
        }
        o000000Var.attachToRecyclerView(g2Var3.f43878OooO0o0);
        g2 g2Var4 = this.f58472OooOOOO;
        if (g2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var4 = null;
        }
        RecyclerView recyclerView = g2Var4.f43878OooO0o0;
        o00000O o00000o = this.f58470OooOOO;
        if (o00000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00000o = null;
        }
        recyclerView.setAdapter(o00000o);
        g2 g2Var5 = this.f58472OooOOOO;
        if (g2Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var5 = null;
        }
        g2Var5.f43878OooO0o0.addOnScrollListener(new o00000OO(this));
        g2 g2Var6 = this.f58472OooOOOO;
        if (g2Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var6 = null;
        }
        g2Var6.f43877OooO0Oo.setOnClickListener(this);
        g2 g2Var7 = this.f58472OooOOOO;
        if (g2Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var7 = null;
        }
        g2Var7.f43876OooO0OO.setOnClickListener(this);
        g2 g2Var8 = this.f58472OooOOOO;
        if (g2Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g2Var2 = g2Var8;
        }
        AppCompatImageView ivBadgeDetailClose = g2Var2.f43875OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivBadgeDetailClose, "ivBadgeDetailClose");
        oOO00O.OooO00o(ivBadgeDetailClose, false, 3);
    }

    @Override // p650o0ooo.o0O0ooO
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        g2 g2Var = this.f58472OooOOOO;
        g2 g2Var2 = null;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        boolean z = false;
        if (Intrinsics.areEqual(view, g2Var.f43876OooO0OO)) {
            o00000O o00000o = this.f58470OooOOO;
            if (o00000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00000o = null;
            }
            int size = o00000o.f13189OooOOoo.size();
            int i = this.f58473OooOOOo - 1;
            if (i >= 0 && i < size) {
                z = true;
            }
            if (z) {
                g2 g2Var3 = this.f58472OooOOOO;
                if (g2Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g2Var2 = g2Var3;
                }
                g2Var2.f43878OooO0o0.smoothScrollToPosition(this.f58473OooOOOo - 1);
                this.f58473OooOOOo--;
                return;
            }
            return;
        }
        g2 g2Var4 = this.f58472OooOOOO;
        if (g2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var4 = null;
        }
        if (Intrinsics.areEqual(view, g2Var4.f43877OooO0Oo)) {
            o00000O o00000o2 = this.f58470OooOOO;
            if (o00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00000o2 = null;
            }
            int size2 = o00000o2.f13189OooOOoo.size();
            int i2 = this.f58473OooOOOo + 1;
            if (i2 >= 0 && i2 < size2) {
                z = true;
            }
            if (z) {
                g2 g2Var5 = this.f58472OooOOOO;
                if (g2Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g2Var2 = g2Var5;
                }
                g2Var2.f43878OooO0o0.smoothScrollToPosition(this.f58473OooOOOo + 1);
                this.f58473OooOOOo++;
            }
        }
    }
}
