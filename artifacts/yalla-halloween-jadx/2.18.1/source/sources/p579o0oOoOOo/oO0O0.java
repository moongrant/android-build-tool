package p579o0oOoOOo;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.model.StarsModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.o00oO0o;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p478o0OooooO.oO0OoOO0;
import p502o0o00o0.o0000oo;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.bi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0 extends o0000oo {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO0OO<BadgeDataModel> f46027OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public bi f46028OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f46029OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f46030OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f46031OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final int f46032Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46033o000oOoO;

    public static final class OooO00o extends OooO0OO<BadgeDataModel> {
        public OooO00o(Context context) {
            super(context, R.layout.user_item_badge_detail);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
            if (oooO0o == null || badgeDataModel == null) {
                return;
            }
            int type = badgeDataModel.getType();
            oooO0o.OooOO0(R.id.tvBadgeName, badgeDataModel.getName());
            oooO0o.OooOO0(R.id.tvBadgeDes, badgeDataModel.getRemark());
            oO0O0.OooO0o(oO0O0.this, type, type, badgeDataModel.getSetTime(), oooO0o);
            Objects.requireNonNull(oO0O0.this);
            ((AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_bronze)).setImageResource(type > 0 ? R.drawable.icon_badge_bronze : R.drawable.user_badge_dialog_copper_not_obtain);
            ((AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_silver)).setImageResource(type > 1 ? R.drawable.icon_badge_silver : R.drawable.user_badge_dialog_silver_not_obtain);
            ((AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_gold)).setImageResource(type > 2 ? R.drawable.icon_badge_gold : R.drawable.user_badge_dialog_glod_not_obtain);
            ((AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_diamond)).setImageResource(type > 3 ? R.drawable.icon_badge_diamond : R.drawable.user_badge_dialog_diamond_not_obtain);
            oO0O0.OooO0oo(oO0O0.this, type, oooO0o);
            oO0O0.OooO0Oo(oO0O0.this, type, oooO0o);
            oO0O0.OooO0oO(oO0O0.this, type, type, badgeDataModel.getMedalId(), oooO0o);
            oO0O0 oo0o0 = oO0O0.this;
            View viewOooO0Oo = oooO0o.OooO0Oo(R.id.tv_qt);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.tv_qt)");
            oO0O0.OooO0o0(oo0o0, type, type, (AppCompatTextView) viewOooO0Oo, badgeDataModel);
            View viewOooO0Oo2 = oooO0o.OooO0Oo(R.id.iv_bronze);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView<AppCompatImageView>(R.id.iv_bronze)");
            o00O0O.OooO0Oo(viewOooO0Oo2, new oO0O000o(oO0O0.this, type, badgeDataModel, oooO0o));
            View viewOooO0Oo3 = oooO0o.OooO0Oo(R.id.iv_silver);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo3, "helper.getView<AppCompatImageView>(R.id.iv_silver)");
            o00O0O.OooO0Oo(viewOooO0Oo3, new oO0O00(oO0O0.this, type, badgeDataModel, oooO0o));
            View viewOooO0Oo4 = oooO0o.OooO0Oo(R.id.iv_gold);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView<AppCompatImageView>(R.id.iv_gold)");
            o00O0O.OooO0Oo(viewOooO0Oo4, new oO0O00O(oO0O0.this, type, badgeDataModel, oooO0o));
            View viewOooO0Oo5 = oooO0o.OooO0Oo(R.id.iv_diamond);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo5, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
            o00O0O.OooO0Oo(viewOooO0Oo5, new oO0O00o0(oO0O0.this, type, badgeDataModel, oooO0o));
            if (oO0O0.this.f46031OoooOoo) {
                View viewOooO0Oo6 = oooO0o.OooO0Oo(R.id.iv_diamond_line);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo6, "helper.getView<AppCompat…ew>(R.id.iv_diamond_line)");
                o00O0O.OooO(viewOooO0Oo6);
                View viewOooO0Oo7 = oooO0o.OooO0Oo(R.id.iv_diamond);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo7, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
                o00O0O.OooO(viewOooO0Oo7);
            } else {
                View viewOooO0Oo8 = oooO0o.OooO0Oo(R.id.iv_diamond_line);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo8, "helper.getView<AppCompat…ew>(R.id.iv_diamond_line)");
                o00O0O.OooO00o(viewOooO0Oo8);
                View viewOooO0Oo9 = oooO0o.OooO0Oo(R.id.iv_diamond);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo9, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
                o00O0O.OooO00o(viewOooO0Oo9);
            }
            View viewOooO0Oo10 = oooO0o.OooO0Oo(R.id.clDialogBadge);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo10, "helper.getView<FrameLayout>(R.id.clDialogBadge)");
            o00O0O.OooO0Oo(viewOooO0Oo10, new oO0O00oO(oO0O0.this));
        }
    }

    public static final class OooO0O0 extends RecyclerView.o00O0O {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                oO0O0 oo0o0 = oO0O0.this;
                RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                oo0o0.f46029OoooOo0 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                bi biVar = oO0O0.this.f46028OoooOOo;
                OooO0OO<BadgeDataModel> oooO0OO = null;
                if (biVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    biVar = null;
                }
                AppCompatImageView appCompatImageView = biVar.f49065OooO0OO;
                int i2 = oO0O0.this.f46029OoooOo0;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                if (i2 == 0) {
                    o00O0O.OooO00o(appCompatImageView);
                } else {
                    o00O0O.OooO(appCompatImageView);
                }
                bi biVar2 = oO0O0.this.f46028OoooOOo;
                if (biVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    biVar2 = null;
                }
                AppCompatImageView appCompatImageView2 = biVar2.f49066OooO0Oo;
                oO0O0 oo0o1 = oO0O0.this;
                int i3 = oo0o1.f46029OoooOo0;
                OooO0OO<BadgeDataModel> oooO0OO2 = oo0o1.f46027OoooOOO;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO2;
                }
                int size = oooO0OO.getData().size() - 1;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                if (i3 == size) {
                    o00O0O.OooO00o(appCompatImageView2);
                } else {
                    o00O0O.OooO(appCompatImageView2);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(@NotNull FragmentActivity activity) {
        super(activity, R.style.FullscreenDialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46033o000oOoO = activity;
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        this.f46032Ooooo00 = R.drawable.medal_select_bg;
    }

    public static final void OooO0Oo(oO0O0 oo0o0, int i, OooO0o oooO0o) {
        Objects.requireNonNull(oo0o0);
        int i2 = R.color.color_bronze;
        if (i != 1) {
            if (i == 2) {
                i2 = R.color.color_silver;
            } else if (i == 3) {
                i2 = R.color.color_gold;
            } else if (i == 4) {
                i2 = R.color.color_diamond;
            }
        }
        ((AppCompatTextView) oooO0o.OooO0Oo(R.id.tvBadgeName)).setTextColor(o000O0O0.OooO00o(i2));
        ((AppCompatTextView) oooO0o.OooO0Oo(R.id.tvBadgeDes)).setTextColor(o000O0O0.OooO00o(i2));
        ((AppCompatTextView) oooO0o.OooO0Oo(R.id.tvBadgeObtainTime)).setTextColor(o000O0O0.OooO00o(i2));
        ((AppCompatTextView) oooO0o.OooO0Oo(R.id.tv_qt)).setTextColor(o000O0O0.OooO00o(i2));
    }

    public static final void OooO0o(oO0O0 oo0o0, int i, int i2, long j, OooO0o oooO0o) {
        Objects.requireNonNull(oo0o0);
        oooO0o.OooO0oO(R.id.tvBadgeObtainTime, i == i2 && j > 0);
        oooO0o.OooOO0(R.id.tvBadgeObtainTime, OooOo.OooO00o(OooOOO.OooO0OO(R.string.user_badge_time), o00O0.f48624OooO00o.OooO0OO(j, "dd/MM/yyyy")));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    public static final void OooO0o0(oO0O0 oo0o0, int i, int i2, AppCompatTextView appCompatTextView, BadgeDataModel badgeDataModel) {
        String strOooO00o;
        Objects.requireNonNull(oo0o0);
        String strOooO0Oo = o0O0O00.OooO0Oo(String.valueOf(badgeDataModel.getCurrentvalue()));
        StarsModel stars = badgeDataModel.getStars();
        String strOooO0Oo2 = o0O0O00.OooO0Oo(String.valueOf(stars != null ? Integer.valueOf(stars.getOneStars()) : null));
        StarsModel stars2 = badgeDataModel.getStars();
        String strOooO0Oo3 = o0O0O00.OooO0Oo(String.valueOf(stars2 != null ? Integer.valueOf(stars2.getTwoStars()) : null));
        StarsModel stars3 = badgeDataModel.getStars();
        String strOooO0Oo4 = o0O0O00.OooO0Oo(String.valueOf(stars3 != null ? Integer.valueOf(stars3.getThreeStars()) : null));
        StarsModel stars4 = badgeDataModel.getStars();
        String strOooO0Oo5 = o0O0O00.OooO0Oo(String.valueOf(stars4 != null ? Integer.valueOf(stars4.getFourthStars()) : null));
        if (i == 0 || i == 1) {
            if (i2 == 0) {
                String progress = badgeDataModel.getProgress();
                String[] strArr = new String[1];
                if (oo0o0.f46030OoooOoO) {
                    strOooO0Oo2 = strOooO0Oo + '/' + strOooO0Oo2;
                }
                strArr[0] = strOooO0Oo2;
                strOooO00o = OooOo.OooO00o(progress, strArr);
            } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo2);
            } else {
                strOooO00o = "";
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    strOooO00o = "";
                } else if (i2 == 0 || i2 == 1) {
                    strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo5);
                } else if (i2 == 2 || i2 == 3) {
                    String progress2 = badgeDataModel.getProgress();
                    String[] strArr2 = new String[1];
                    if (oo0o0.f46030OoooOoO) {
                        strOooO0Oo5 = strOooO0Oo + '/' + strOooO0Oo5;
                    }
                    strArr2[0] = strOooO0Oo5;
                    strOooO00o = OooOo.OooO00o(progress2, strArr2);
                } else if (i2 != 4) {
                    strOooO00o = "";
                } else {
                    strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo5);
                }
            } else if (i2 == 0 || i2 == 1) {
                strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo4);
            } else if (i2 == 2) {
                String progress3 = badgeDataModel.getProgress();
                String[] strArr3 = new String[1];
                if (oo0o0.f46030OoooOoO) {
                    strOooO0Oo4 = strOooO0Oo + '/' + strOooO0Oo4;
                }
                strArr3[0] = strOooO0Oo4;
                strOooO00o = OooOo.OooO00o(progress3, strArr3);
            } else if (i2 == 3 || i2 == 4) {
                strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo4);
            } else {
                strOooO00o = "";
            }
        } else if (i2 == 0) {
            strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo3);
        } else if (i2 == 1) {
            String progress4 = badgeDataModel.getProgress();
            String[] strArr4 = new String[1];
            if (oo0o0.f46030OoooOoO) {
                strOooO0Oo3 = strOooO0Oo + '/' + strOooO0Oo3;
            }
            strArr4[0] = strOooO0Oo3;
            strOooO00o = OooOo.OooO00o(progress4, strArr4);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            strOooO00o = OooOo.OooO00o(badgeDataModel.getProgress(), strOooO0Oo3);
        } else {
            strOooO00o = "";
        }
        appCompatTextView.setText(strOooO00o);
    }

    public static final void OooO0oO(oO0O0 oo0o0, int i, int i2, int i3, OooO0o oooO0o) {
        Objects.requireNonNull(oo0o0);
        if (i > i2) {
            i = 0;
        }
        Uri uriOooO00o = o00oO0o.OooO00o(i3, i);
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.sdv_medal);
        Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type com.yalla.yalla.common.ui.view.SVGAView");
        SVGAView sVGAView = (SVGAView) viewOooO0Oo;
        sVGAView.f21010OooooO0 = R.drawable.icon_badge_no_pic;
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
        sVGAView.OooO0oo(string, oo0o0.f46033o000oOoO);
        sVGAView.OooO();
    }

    public static final void OooO0oo(oO0O0 oo0o0, int i, OooO0o oooO0o) {
        Objects.requireNonNull(oo0o0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_bronze);
        if (i <= 1) {
            appCompatImageView.setBackgroundResource(oo0o0.f46032Ooooo00);
        } else {
            appCompatImageView.setBackground(null);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_silver);
        if (i == 2) {
            appCompatImageView2.setBackgroundResource(oo0o0.f46032Ooooo00);
        } else {
            appCompatImageView2.setBackground(null);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_gold);
        if (i == 3) {
            appCompatImageView3.setBackgroundResource(oo0o0.f46032Ooooo00);
        } else {
            appCompatImageView3.setBackground(null);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) oooO0o.OooO0Oo(R.id.iv_diamond);
        if (i == 4) {
            appCompatImageView4.setBackgroundResource(oo0o0.f46032Ooooo00);
        } else {
            appCompatImageView4.setBackground(null);
        }
    }

    @Override // p502o0o00o0.o0000oo
    public final void OooO0O0(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        bi biVarInflate = bi.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(biVarInflate, "inflate(layoutInflater, rootView, true)");
        this.f46028OoooOOo = biVarInflate;
        this.f46027OoooOOO = new OooO00o(getContext());
        bi biVar = this.f46028OoooOOo;
        bi biVar2 = null;
        if (biVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar = null;
        }
        biVar.f49067OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext(), 0));
        o000OOo o000ooo2 = new o000OOo();
        bi biVar3 = this.f46028OoooOOo;
        if (biVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar3 = null;
        }
        o000ooo2.attachToRecyclerView(biVar3.f49067OooO0o0);
        bi biVar4 = this.f46028OoooOOo;
        if (biVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar4 = null;
        }
        RecyclerView recyclerView = biVar4.f49067OooO0o0;
        OooO0OO<BadgeDataModel> oooO0OO = this.f46027OoooOOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        bi biVar5 = this.f46028OoooOOo;
        if (biVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar5 = null;
        }
        biVar5.f49067OooO0o0.addOnScrollListener(new OooO0O0());
        bi biVar6 = this.f46028OoooOOo;
        if (biVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar6 = null;
        }
        biVar6.f49066OooO0Oo.setOnClickListener(this);
        bi biVar7 = this.f46028OoooOOo;
        if (biVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar7 = null;
        }
        biVar7.f49065OooO0OO.setOnClickListener(this);
        bi biVar8 = this.f46028OoooOOo;
        if (biVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            biVar2 = biVar8;
        }
        AppCompatImageView appCompatImageView = biVar2.f49064OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBadgeDetailClose");
        oO0OoOO0.OooO0O0(appCompatImageView, false, 3);
    }

    @Override // p502o0o00o0.o0000oo
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        bi biVar = this.f46028OoooOOo;
        bi biVar2 = null;
        if (biVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar = null;
        }
        boolean z = false;
        if (Intrinsics.areEqual(view, biVar.f49065OooO0OO)) {
            OooO0OO<BadgeDataModel> oooO0OO = this.f46027OoooOOO;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            int size = oooO0OO.getData().size();
            int i = this.f46029OoooOo0 - 1;
            if (i >= 0 && i < size) {
                z = true;
            }
            if (z) {
                bi biVar3 = this.f46028OoooOOo;
                if (biVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    biVar2 = biVar3;
                }
                biVar2.f49067OooO0o0.smoothScrollToPosition(this.f46029OoooOo0 - 1);
                this.f46029OoooOo0--;
                return;
            }
            return;
        }
        bi biVar4 = this.f46028OoooOOo;
        if (biVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            biVar4 = null;
        }
        if (Intrinsics.areEqual(view, biVar4.f49066OooO0Oo)) {
            OooO0OO<BadgeDataModel> oooO0OO2 = this.f46027OoooOOO;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            int size2 = oooO0OO2.getData().size();
            int i2 = this.f46029OoooOo0 + 1;
            if (i2 >= 0 && i2 < size2) {
                z = true;
            }
            if (z) {
                bi biVar5 = this.f46028OoooOOo;
                if (biVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    biVar2 = biVar5;
                }
                biVar2.f49067OooO0o0.smoothScrollToPosition(this.f46029OoooOo0 + 1);
                this.f46029OoooOo0++;
            }
        }
    }
}
