package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment;
import com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment;
import com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.l7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "ThemeType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomThemeMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeMineActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n22#2,2:141\n1#3:143\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeMineActivity\n*L\n30#1:141,2\n*E\n"})
public final class RoomThemeMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26673OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(l7.class), this, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ThemeType f26674OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public p508o0o0O.OooOO0O f26675OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ThemeType f26676OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public RoomThemeMineFragment f26677OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public RoomThemeCustomizeFragment f26678OooOo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeType.values().length];
            try {
                iArr[ThemeType.Mine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeType.Customize.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity$ThemeType;", "", "Mine", "Customize", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum ThemeType {
        Mine,
        Customize
    }

    public final void OooOo(ThemeType themeType) {
        if (this.f26676OooOo00 == themeType) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i == 1) {
            OooOoO0().f58370OooO0Oo.setBackgroundResource(0);
            OooOoO0().f58370OooO0Oo.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.white));
            OooOoO0().f58371OooO0o0.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9));
            OooOoO0().f58371OooO0o0.setBackgroundResource(p591o0oo000O.OooO.OooO0o0() ? oOo00OO0.shape_whit_radius25_right : oOo00OO0.shape_whit_radius25_left);
            return;
        }
        if (i != 2) {
            return;
        }
        OooOoO0().f58371OooO0o0.setBackgroundResource(0);
        OooOoO0().f58371OooO0o0.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.white));
        OooOoO0().f58370OooO0Oo.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9));
        OooOoO0().f58370OooO0Oo.setBackgroundResource(p591o0oo000O.OooO.OooO0o0() ? oOo00OO0.shape_whit_radius25_left : oOo00OO0.shape_whit_radius25_right);
    }

    public final void OooOoO(ThemeType themeType) {
        if (this.f26676OooOo00 == themeType) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
        p508o0o0O.OooOO0O oooOO0O = this.f26675OooOo0;
        if (oooOO0O != null) {
            p401o0Oo0OO0.o0OoOo0.OooO0O0(oooO00o, oooOO0O);
        }
        int i = OooO00o.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i == 1) {
            RoomThemeMineFragment roomThemeMineFragment = this.f26677OooOo0O;
            if (roomThemeMineFragment == null) {
                this.f26677OooOo0O = new RoomThemeMineFragment();
                int id = OooOoO0().f58368OooO0O0.getId();
                RoomThemeMineFragment roomThemeMineFragment2 = this.f26677OooOo0O;
                Intrinsics.checkNotNull(roomThemeMineFragment2);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id, roomThemeMineFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeMineFragment);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, roomThemeMineFragment);
            }
            this.f26675OooOo0 = this.f26677OooOo0O;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = this.f26678OooOo0o;
            if (roomThemeCustomizeFragment == null) {
                this.f26678OooOo0o = new RoomThemeCustomizeFragment();
                int id2 = OooOoO0().f58368OooO0O0.getId();
                RoomThemeCustomizeFragment roomThemeCustomizeFragment2 = this.f26678OooOo0o;
                Intrinsics.checkNotNull(roomThemeCustomizeFragment2);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id2, roomThemeCustomizeFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeCustomizeFragment);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, roomThemeCustomizeFragment);
            }
            this.f26675OooOo0 = this.f26678OooOo0o;
        }
        this.f26676OooOo00 = themeType;
        oooO00o.OooO0o0();
    }

    public final l7 OooOoO0() {
        return (l7) this.f26673OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO0().f58371OooO0o0)) {
            ThemeType themeType = ThemeType.Mine;
            OooOo(themeType);
            OooOoO(themeType);
        } else if (Intrinsics.areEqual(view, OooOoO0().f58370OooO0Oo)) {
            ThemeType themeType2 = ThemeType.Customize;
            OooOo(themeType2);
            OooOoO(themeType2);
        } else if (Intrinsics.areEqual(view, OooOoO0().f58369OooO0OO)) {
            p587o0oOooo.o0OO000.OooO00o("105037");
            p526o0o0OOO0.oo0oOO0.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, null, false, null, 14);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setContentView(OooOoO0().f58367OooO00o);
        OooOoO0().f58371OooO0o0.setOnClickListener(this);
        OooOoO0().f58370OooO0Oo.setOnClickListener(this);
        OooOoO0().f58369OooO0OO.setOnClickListener(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (serializable = extras.getSerializable("THEME_TYPE")) == null) {
            serializable = ThemeType.Mine;
        }
        Intrinsics.checkNotNullExpressionValue(serializable, "intent.extras?.getSerial…E_TYPE) ?: ThemeType.Mine");
        if (serializable instanceof ThemeType) {
            ThemeType themeType = (ThemeType) serializable;
            OooOo(themeType);
            OooOoO(themeType);
        }
    }
}
