package p519o0o0O0oO;

import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
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
import p370o0OOoO.OooOOO0;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p601o0oo0O0.o0000oo;
import p641o0ooOOOO.ra;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAchievementBadgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementBadgeDialog.kt\ncom/yalla/yalla/ui/dialog/AchievementBadgeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class o000 extends o00O0O00 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o0000O f52448OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f52449OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ra f52450OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f52451OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f52452OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f52453OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f52454OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(@NotNull FragmentActivity activity) {
        super(activity, oO00Oo00.FullscreenDialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52449OooOOO0 = activity;
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        this.f52454OooOOoo = oOo00OO0.medal_select_bg;
    }

    public static final void OooO0Oo(o000 o000Var, int i, ViewHolder viewHolder) {
        int i2;
        o000Var.getClass();
        if (i == 1) {
            i2 = oO00O0o.color_bronze;
        } else if (i == 2) {
            i2 = oO00O0o.color_silver;
        } else if (i != 3) {
            i2 = i != 4 ? oO00O0o.color_bronze : oO00O0o.color_diamond;
        } else {
            i2 = oO00O0o.color_gold;
        }
        ((AppCompatTextView) viewHolder.getView(oO00O0oO.tvBadgeName)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(oO00O0oO.tvBadgeDes)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(oO00O0oO.tvBadgeObtainTime)).setTextColor(o0000.OooO00o(i2));
        ((AppCompatTextView) viewHolder.getView(oO00O0oO.tv_qt)).setTextColor(o0000.OooO00o(i2));
    }

    public static final void OooO0o(o000 o000Var, int i, int i2, long j, ViewHolder viewHolder) {
        o000Var.getClass();
        int i3 = oO00O0oO.tvBadgeObtainTime;
        viewHolder.setGone(i3, i == i2 && j > 0);
        viewHolder.setText(i3, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.user_badge_time), o0000oo.OooO0OO(j, "dd/MM/yyyy")));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    public static final void OooO0o0(o000 o000Var, int i, int i2, AppCompatTextView appCompatTextView, BadgeDataModel badgeDataModel) {
        String strOooO00o;
        o000Var.getClass();
        String strOooO0Oo = OooOOOO.OooO0Oo(String.valueOf(badgeDataModel.getCurrentvalue()));
        StarsModel stars = badgeDataModel.getStars();
        String strOooO0Oo2 = OooOOOO.OooO0Oo(String.valueOf(stars != null ? Integer.valueOf(stars.getOneStars()) : null));
        StarsModel stars2 = badgeDataModel.getStars();
        String strOooO0Oo3 = OooOOOO.OooO0Oo(String.valueOf(stars2 != null ? Integer.valueOf(stars2.getTwoStars()) : null));
        StarsModel stars3 = badgeDataModel.getStars();
        String strOooO0Oo4 = OooOOOO.OooO0Oo(String.valueOf(stars3 != null ? Integer.valueOf(stars3.getThreeStars()) : null));
        StarsModel stars4 = badgeDataModel.getStars();
        String strOooO0Oo5 = OooOOOO.OooO0Oo(String.valueOf(stars4 != null ? Integer.valueOf(stars4.getFourthStars()) : null));
        if (i == 0 || i == 1) {
            if (i2 == 0) {
                String progress = badgeDataModel.getProgress();
                String[] strArr = new String[1];
                if (o000Var.f52453OooOOo0) {
                    strOooO0Oo2 = o0OoOo0.OooO00o(strOooO0Oo, "/", strOooO0Oo2);
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
                    if (o000Var.f52453OooOOo0) {
                        strOooO0Oo5 = o0OoOo0.OooO00o(strOooO0Oo, "/", strOooO0Oo5);
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
                if (o000Var.f52453OooOOo0) {
                    strOooO0Oo4 = o0OoOo0.OooO00o(strOooO0Oo, "/", strOooO0Oo4);
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
            if (o000Var.f52453OooOOo0) {
                strOooO0Oo3 = o0OoOo0.OooO00o(strOooO0Oo, "/", strOooO0Oo3);
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

    public static final void OooO0oO(o000 o000Var, int i, int i2, int i3, ViewHolder viewHolder) {
        o000Var.getClass();
        if (i > i2) {
            i = 0;
        }
        Uri uriOooO00o = oOo00o0o.OooO00o(i3, i);
        View view = viewHolder.getView(oO00O0oO.sdv_medal);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.code.android.uikit.svga.SVGAView");
        SVGAView sVGAView = (SVGAView) view;
        int i4 = oOo00OO0.icon_badge_no_pic;
        sVGAView.f10172OooOooO = i4;
        sVGAView.setImageResource(i4);
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
        sVGAView.OooOO0O(string, o000Var.f52449OooOOO0);
        sVGAView.OooOO0o();
    }

    public static final void OooO0oo(o000 o000Var, int i, ViewHolder viewHolder) {
        o000Var.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewHolder.getView(oO00O0oO.iv_bronze);
        int i2 = o000Var.f52454OooOOoo;
        if (i <= 1) {
            appCompatImageView.setBackgroundResource(i2);
        } else {
            appCompatImageView.setBackground(null);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewHolder.getView(oO00O0oO.iv_silver);
        if (i == 2) {
            appCompatImageView2.setBackgroundResource(i2);
        } else {
            appCompatImageView2.setBackground(null);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewHolder.getView(oO00O0oO.iv_gold);
        if (i == 3) {
            appCompatImageView3.setBackgroundResource(i2);
        } else {
            appCompatImageView3.setBackground(null);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) viewHolder.getView(oO00O0oO.iv_diamond);
        if (i == 4) {
            appCompatImageView4.setBackgroundResource(i2);
        } else {
            appCompatImageView4.setBackground(null);
        }
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ra raVarInflate = ra.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(raVarInflate, "inflate(layoutInflater, rootView, true)");
        this.f52450OooOOOO = raVarInflate;
        this.f52448OooOOO = new o0000O(this, getContext(), oO00OO0O.user_item_badge_detail);
        ra raVar = this.f52450OooOOOO;
        ra raVar2 = null;
        if (raVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar = null;
        }
        raVar.f58764OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext(), 0));
        o000OOo o000ooo2 = new o000OOo();
        ra raVar3 = this.f52450OooOOOO;
        if (raVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar3 = null;
        }
        o000ooo2.attachToRecyclerView(raVar3.f58764OooO0o0);
        ra raVar4 = this.f52450OooOOOO;
        if (raVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar4 = null;
        }
        RecyclerView recyclerView = raVar4.f58764OooO0o0;
        o0000O o0000o2 = this.f52448OooOOO;
        if (o0000o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000o2 = null;
        }
        recyclerView.setAdapter(o0000o2);
        ra raVar5 = this.f52450OooOOOO;
        if (raVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar5 = null;
        }
        raVar5.f58764OooO0o0.addOnScrollListener(new o0000OO0(this));
        ra raVar6 = this.f52450OooOOOO;
        if (raVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar6 = null;
        }
        raVar6.f58763OooO0Oo.setOnClickListener(this);
        ra raVar7 = this.f52450OooOOOO;
        if (raVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar7 = null;
        }
        raVar7.f58762OooO0OO.setOnClickListener(this);
        ra raVar8 = this.f52450OooOOOO;
        if (raVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            raVar2 = raVar8;
        }
        AppCompatImageView appCompatImageView = raVar2.f58761OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBadgeDetailClose");
        OooOOO0.OooO00o(appCompatImageView, false, 3);
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ra raVar = this.f52450OooOOOO;
        ra raVar2 = null;
        if (raVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar = null;
        }
        boolean z = false;
        if (Intrinsics.areEqual(view, raVar.f58762OooO0OO)) {
            o0000O o0000o2 = this.f52448OooOOO;
            if (o0000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0000o2 = null;
            }
            int size = o0000o2.f10111OooOOoo.size();
            int i = this.f52451OooOOOo - 1;
            if (i >= 0 && i < size) {
                z = true;
            }
            if (z) {
                ra raVar3 = this.f52450OooOOOO;
                if (raVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    raVar2 = raVar3;
                }
                raVar2.f58764OooO0o0.smoothScrollToPosition(this.f52451OooOOOo - 1);
                this.f52451OooOOOo--;
                return;
            }
            return;
        }
        ra raVar4 = this.f52450OooOOOO;
        if (raVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            raVar4 = null;
        }
        if (Intrinsics.areEqual(view, raVar4.f58763OooO0Oo)) {
            o0000O o0000o3 = this.f52448OooOOO;
            if (o0000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0000o3 = null;
            }
            int size2 = o0000o3.f10111OooOOoo.size();
            int i2 = this.f52451OooOOOo + 1;
            if (i2 >= 0 && i2 < size2) {
                z = true;
            }
            if (z) {
                ra raVar5 = this.f52450OooOOOO;
                if (raVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    raVar2 = raVar5;
                }
                raVar2.f58764OooO0o0.smoothScrollToPosition(this.f52451OooOOOo + 1);
                this.f52451OooOOOo++;
            }
        }
    }
}
