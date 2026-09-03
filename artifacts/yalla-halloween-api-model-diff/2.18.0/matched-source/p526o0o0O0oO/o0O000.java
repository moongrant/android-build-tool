package p526o0o0O0oO;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p144o00OOooo.o00O0O0;
import p144o00OOooo.o00O0O00;
import p144o00OOooo.o00O0O0O;
import p144o00OOooo.o00O0OO;
import p144o00OOooo.o00O0OO0;
import p144o00OOooo.o00OO000;
import p144o00OOooo.o00OO00O;
import p144o00OOooo.oo0oOO0;
import p160o00OoOO.o000O;
import p169o00Ooo0.o00O0O;
import p177o00OoooO.oO00o00;
import p255o00ooO0O.oOO00O;
import p499o0o00Oo.OooOOO0;
import p500o0o00Oo0.OooOOO;
import p503o0o00o.o000;
import p503o0o00o.o0000O0;
import p503o0o00o.o0000OO0;
import p524o0o0O0o.o00O00O;
import p527o0o0O0oo.oo0oO0;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.ga;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O000 extends oo0oO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public oO00o00 f43037OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f43038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Integer[] f43039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ga f43040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43041OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public va f43042OooO0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip1.ordinal()] = 1;
            iArr[VipLevel.Vip2.ordinal()] = 2;
            iArr[VipLevel.Vip3.ordinal()] = 3;
            iArr[VipLevel.Vip4.ordinal()] = 4;
            iArr[VipLevel.Vip5.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0O000(@NotNull MainActivity activity, @NotNull ga binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f43038OooO0Oo = activity;
        this.f43040OooO0o0 = binding;
        this.f43039OooO0o = new Integer[]{Integer.valueOf(R.string.single_language_English), Integer.valueOf(R.string.single_language_Arabic), Integer.valueOf(R.string.single_language_Turkish), Integer.valueOf(R.string.single_language_Indonesia), Integer.valueOf(R.string.single_language_Japanese), Integer.valueOf(R.string.single_language_Portugal), Integer.valueOf(R.string.single_language_Espana), Integer.valueOf(R.string.single_language_Hindi), Integer.valueOf(R.string.single_language_Urdu)};
    }

    @Override // p527o0o0O0oo.oo0oO0
    public final void OooO00o() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        MediatorLiveData<Boolean> drawerTaskDot = sharedMainMessageManager.getDrawerTaskDot();
        int i = 1;
        if (drawerTaskDot != null) {
            drawerTaskDot.observe(this.f43038OooO0Oo, new o0000O0(this, i));
        }
        MediatorLiveData<Boolean> storeDot = sharedMainMessageManager.getStoreDot();
        if (storeDot != null) {
            storeDot.observe(this.f43038OooO0Oo, new o0000OO0(this, i));
        }
        MediatorLiveData<Boolean> premiumDot = sharedMainMessageManager.getPremiumDot();
        if (premiumDot != null) {
            premiumDot.observe(this.f43038OooO0Oo, new o0oOOo(this, 0));
        }
        MediatorLiveData<Boolean> vipDot = sharedMainMessageManager.getVipDot();
        if (vipDot != null) {
            vipDot.observe(this.f43038OooO0Oo, new o000(this, i));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p527o0o0O0oo.oo0oO0
    public final void OooO0O0() {
        final va vaVarOooO00o = va.OooO00o(this.f43040OooO0o0.f49478OooOO0.inflate());
        Intrinsics.checkNotNullExpressionValue(vaVarOooO00o, "bind(binding.vsDrawer.inflate())");
        this.f43042OooO0oo = vaVarOooO00o;
        int i = 1;
        this.f43041OooO0oO = true;
        OooOOO oooOOO = OooOOO.f41235OooO00o;
        oooOOO.OooOoO().observe(this.f43038OooO0Oo, new o00O0O00(vaVarOooO00o, i));
        oooOOO.OooO0oO().observe(this.f43038OooO0Oo, new o00O0O0(new o00O0O(this.f43038OooO0Oo, vaVarOooO00o.f50815OooO0oo), i));
        int i2 = 0;
        oooOOO.OooOO0O().observe(this.f43038OooO0Oo, new o0O0o(vaVarOooO00o, this, i2));
        MediatorLiveData<Boolean> drawUserDot = SharedMainMessageManager.INSTANCE.getDrawUserDot();
        if (drawUserDot != null) {
            drawUserDot.observe(this.f43038OooO0Oo, new oo00oO(vaVarOooO00o, i2));
        }
        oooOOO.OooO0oo().observe(this.f43038OooO0Oo, new Observer() { // from class: o0o0O0oO.o0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                o0O000 this$0 = this.f43033OooO00o;
                va bindingDrawer = vaVarOooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this$0.f43038OooO0Oo);
                oooO00o.f48447OooO0OO = o00O00O.OooO00o((String) obj);
                oooO00o.f48445OooO00o = 0;
                oooO00o.OooO00o(OooO00o.OooO0o0());
                oooO00o.OooO0o(bindingDrawer.f50810OooO0OO);
            }
        });
        int i3 = 2;
        oooOOO.OooOoO0().observe(this.f43038OooO0Oo, new o000O(vaVarOooO00o, i3));
        ((MutableLiveData) OooOOO.f41249OooOOOo.getValue()).observe(this.f43038OooO0Oo, new o00OO00O(vaVarOooO00o, i));
        int i4 = 3;
        oooOOO.OooO0OO().observe(this.f43038OooO0Oo, new o00O0OO(vaVarOooO00o, i4));
        oooOOO.OooO0o().observe(this.f43038OooO0Oo, new o00OO000(vaVarOooO00o, i3));
        vaVarOooO00o.f50812OooO0o.f50887OooOOo.setShowProtection(true);
        oooOOO.OooOOO0().observe(this.f43038OooO0Oo, new oo0oOO0(vaVarOooO00o, i3));
        oooOOO.OooOO0().observe(this.f43038OooO0Oo, new o00O0OO0(vaVarOooO00o, i3));
        oooOOO.OooOOO().observe(this.f43038OooO0Oo, new Observer() { // from class: o0o0O0oO.o0O00000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                o0O000 this$0 = this.f43043OooO00o;
                va bindingDrawer = vaVarOooO00o;
                Integer region = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                Intrinsics.checkNotNullExpressionValue(region, "region");
                if (region.intValue() > this$0.f43039OooO0o.length - 1) {
                    bindingDrawer.f50812OooO0o.f50891OooOo0.setText("");
                    TextView textView = bindingDrawer.f50812OooO0o.f50891OooOo0;
                    Intrinsics.checkNotNullExpressionValue(textView, "bindingDrawer.list.tvLanguage");
                    oOO00O.OooO00o(textView);
                    return;
                }
                TextView textView2 = bindingDrawer.f50812OooO0o.f50891OooOo0;
                Intrinsics.checkNotNullExpressionValue(textView2, "bindingDrawer.list.tvLanguage");
                oOO00O.OooO(textView2);
                bindingDrawer.f50812OooO0o.f50891OooOo0.setText(this$0.f43039OooO0o[region.intValue()].intValue());
            }
        });
        oooOOO.OooO().observe(this.f43038OooO0Oo, new o00O0O0O(vaVarOooO00o, 4));
        oooOOO.OooOoo().observe(this.f43038OooO0Oo, new o00OOO00.OooO00o(vaVarOooO00o, i4));
        OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
        if (OooOOO0.OooO00o().OooOO0O() == 0) {
            ImageView imageView = vaVarOooO00o.f50812OooO0o.f50876OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "bindingDrawer.list.firstChargeReward");
            oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = vaVarOooO00o.f50812OooO0o.f50876OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "bindingDrawer.list.firstChargeReward");
            oOO00O.OooO(imageView2);
        }
        DrawerLayout drawerLayout = this.f43040OooO0o0.f49472OooO0OO;
        o0O00oO0 o0o00oo1 = new o0O00oO0(this, vaVarOooO00o);
        Objects.requireNonNull(drawerLayout);
        if (drawerLayout.f8066OoooooO == null) {
            drawerLayout.f8066OoooooO = new ArrayList();
        }
        drawerLayout.f8066OoooooO.add(o0o00oo1);
        va vaVar = this.f43042OooO0oo;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
            vaVar = null;
        }
        View view = vaVar.f50817OooOO0O;
        Intrinsics.checkNotNullExpressionValue(view, "bindingDrawer.vTopBg");
        oOO00O.OooO0oO(view, new o0O000Oo(this));
        LinearLayout linearLayout = vaVar.f50812OooO0o.f50888OooOOo0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "bindingDrawer.list.navTask");
        oOO00O.OooO0oO(linearLayout, new o0O000o0(this));
        LinearLayout linearLayout2 = vaVar.f50812OooO0o.f50883OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "bindingDrawer.list.navRecharge");
        oOO00O.OooO0oO(linearLayout2, new o0O00(this));
        ImageView imageView3 = vaVar.f50812OooO0o.f50876OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView3, "bindingDrawer.list.firstChargeReward");
        oOO00O.OooO0oO(imageView3, new o0OoO00O(this));
        LinearLayout linearLayout3 = vaVar.f50812OooO0o.f50884OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "bindingDrawer.list.navPremium");
        oOO00O.OooO0oO(linearLayout3, new o0O00O0o(this));
        LinearLayout linearLayout4 = vaVar.f50812OooO0o.f50880OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "bindingDrawer.list.navKAVip");
        oOO00O.OooO0oO(linearLayout4, new o0O00O(this));
        LinearLayout linearLayout5 = vaVar.f50812OooO0o.f50886OooOOOo;
        Intrinsics.checkNotNullExpressionValue(linearLayout5, "bindingDrawer.list.navStore");
        oOO00O.OooO0oO(linearLayout5, new o0O00OO(this));
        LinearLayout linearLayout6 = vaVar.f50812OooO0o.f50882OooOO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "bindingDrawer.list.navLevel");
        oOO00O.OooO0oO(linearLayout6, new o0oO0Ooo(this));
        LinearLayout linearLayout7 = vaVar.f50812OooO0o.f50881OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout7, "bindingDrawer.list.navLanguage");
        oOO00O.OooO0oO(linearLayout7, new o0O00o00(this));
        LinearLayout linearLayout8 = vaVar.f50812OooO0o.f50871OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout8, "bindingDrawer.list.navFAQ");
        oOO00O.OooO0oO(linearLayout8, new o0O000O(this));
        LinearLayout linearLayout9 = vaVar.f50812OooO0o.f50885OooOOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout9, "bindingDrawer.list.navSetting");
        oOO00O.OooO0oO(linearLayout9, new o0OoOoOo(this));
    }

    @Override // p527o0o0O0oo.oo0oO0
    public final void OooO0OO() {
        DrawerLayout drawerLayout = this.f43040OooO0o0.f49470OooO00o;
        oo000o oo000oVar = new oo000o() { // from class: o0o0O0oO.o0O0000O
            @Override // o000O0O0.oo000o
            public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat insets) {
                o0O000 this$0 = this.f43045Oooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                if (this$0.f43041OooO0oO) {
                    p619o0oo0o.oOO00O ooo00o = p619o0oo0o.oOO00O.f48599OooO00o;
                    va vaVar = this$0.f43042OooO0oo;
                    va vaVar2 = null;
                    if (vaVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                        vaVar = null;
                    }
                    View view2 = vaVar.f50817OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(view2, "bindingDrawer.vTopBg");
                    ooo00o.OooO00o(view2, insets, true);
                    va vaVar3 = this$0.f43042OooO0oo;
                    if (vaVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                    } else {
                        vaVar2 = vaVar3;
                    }
                    NetImageView netImageView = vaVar2.f50810OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(netImageView, "bindingDrawer.ivHeader");
                    ooo00o.OooO00o(netImageView, insets, false);
                }
                return insets;
            }
        };
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
        ViewCompat.OooOOO.OooOo0(drawerLayout, oo000oVar);
        super.OooO0OO();
    }
}
