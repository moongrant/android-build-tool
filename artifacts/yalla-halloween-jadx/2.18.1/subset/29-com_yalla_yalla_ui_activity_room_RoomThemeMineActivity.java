package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment;
import com.yalla.yalla.ui.fragment.RoomThemeMineFragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p462o0Ooo0o.o0000Ooo;
import p584o0oOoo.o000O;
import p598o0oo00O.oO00000o;
import p649o0ooOOoo.ve;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "ThemeType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22993Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22994OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ve.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ThemeType f22995Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public Fragment f22996Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public RoomThemeMineFragment f22997OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public RoomThemeCustomizeFragment f22998OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public ThemeType f22999OooooOo;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @NotNull ThemeType type) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Intent intent = new Intent(context, (Class<?>) RoomThemeMineActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("THEME_TYPE", type);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeType.values().length];
            iArr[ThemeType.Mine.ordinal()] = 1;
            iArr[ThemeType.Customize.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity$ThemeType;", "", "Mine", "Customize", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum ThemeType {
        Mine,
        Customize
    }

    public final void OooOoo(ThemeType themeType) {
        if (this.f22995Ooooo00 == themeType) {
            return;
        }
        int i = OooO0O0.$EnumSwitchMapping$0[themeType.ordinal()];
        int i2 = R.drawable.shape_whit_radius25_right;
        if (i == 1) {
            OooOooO().f50814OooO0Oo.setBackgroundResource(0);
            OooOooO().f50814OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.white));
            OooOooO().f50815OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            TextView textView = OooOooO().f50815OooO0o0;
            if (!oo000o.OooO0o0()) {
                i2 = R.drawable.shape_whit_radius25_left;
            }
            textView.setBackgroundResource(i2);
            return;
        }
        if (i != 2) {
            return;
        }
        OooOooO().f50815OooO0o0.setBackgroundResource(0);
        OooOooO().f50815OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.white));
        OooOooO().f50814OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        TextView textView2 = OooOooO().f50814OooO0Oo;
        if (oo000o.OooO0o0()) {
            i2 = R.drawable.shape_whit_radius25_left;
        }
        textView2.setBackgroundResource(i2);
    }

    public final ve OooOooO() {
        return (ve) this.f22994OoooOoo.getValue();
    }

    public final void OooOooo(ThemeType themeType) {
        if (this.f22995Ooooo00 == themeType) {
            return;
        }
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(getSupportFragmentManager());
        Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
        Fragment fragment = this.f22996Ooooo0o;
        if (fragment != null) {
            o0000Ooo.OooO0O0(oooO00o, fragment);
        }
        int i = OooO0O0.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i == 1) {
            RoomThemeMineFragment roomThemeMineFragment = this.f22997OooooO0;
            if (roomThemeMineFragment == null) {
                this.f22997OooooO0 = new RoomThemeMineFragment();
                int id = OooOooO().f50812OooO0O0.getId();
                RoomThemeMineFragment roomThemeMineFragment2 = this.f22997OooooO0;
                Intrinsics.checkNotNull(roomThemeMineFragment2);
                o0000Ooo.OooO00o(oooO00o, id, roomThemeMineFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeMineFragment);
                o0000Ooo.OooO0OO(oooO00o, roomThemeMineFragment);
            }
            this.f22996Ooooo0o = this.f22997OooooO0;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = this.f22998OooooOO;
            if (roomThemeCustomizeFragment == null) {
                this.f22998OooooOO = new RoomThemeCustomizeFragment();
                int id2 = OooOooO().f50812OooO0O0.getId();
                RoomThemeCustomizeFragment roomThemeCustomizeFragment2 = this.f22998OooooOO;
                Intrinsics.checkNotNull(roomThemeCustomizeFragment2);
                o0000Ooo.OooO00o(oooO00o, id2, roomThemeCustomizeFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeCustomizeFragment);
                o0000Ooo.OooO0OO(oooO00o, roomThemeCustomizeFragment);
            }
            this.f22996Ooooo0o = this.f22998OooooOO;
        }
        this.f22995Ooooo00 = themeType;
        oooO00o.OooO0oO();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f50815OooO0o0)) {
            ThemeType themeType = ThemeType.Mine;
            OooOoo(themeType);
            OooOooo(themeType);
        } else if (Intrinsics.areEqual(view, OooOooO().f50814OooO0Oo)) {
            ThemeType themeType2 = ThemeType.Customize;
            OooOoo(themeType2);
            OooOooo(themeType2);
        } else if (Intrinsics.areEqual(view, OooOooO().f50813OooO0OO)) {
            o0O00000.OooO0OO("Me_store_CreateTheme");
            o000O.OooO00o(oO00000o.f47706OooO00o, null);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setContentView(OooOooO().f50811OooO00o);
        OooOooO().f50815OooO0o0.setOnClickListener(this);
        OooOooO().f50814OooO0Oo.setOnClickListener(this);
        OooOooO().f50813OooO0OO.setOnClickListener(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (serializable = extras.getSerializable("THEME_TYPE")) == null) {
            serializable = ThemeType.Mine;
        }
        Intrinsics.checkNotNullExpressionValue(serializable, "intent.extras?.getSerial…E_TYPE) ?: ThemeType.Mine");
        if (serializable instanceof ThemeType) {
            ThemeType themeType = (ThemeType) serializable;
            OooOoo(themeType);
            OooOooo(themeType);
        }
    }
}
