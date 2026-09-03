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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.Oo0000;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "ThemeType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeMineActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n22#2,2:141\n1#3:143\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeMineActivity\n*L\n30#1:141,2\n*E\n"})
public final class RoomThemeMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26221OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(Oo0000.class), this, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ThemeType f26222OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public p527o0o0OO0.o00OO0O0 f26223OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ThemeType f26224OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public RoomThemeMineFragment f26225OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public RoomThemeCustomizeFragment f26226OooOo0o;

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

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.yalla.yalla.ui.activity.room.RoomThemeMineActivity$ThemeType[], still in use, count: 1, list:
      (r3v2 com.yalla.yalla.ui.activity.room.RoomThemeMineActivity$ThemeType[]) from 0x001d: INVOKE (r3v2 com.yalla.yalla.ui.activity.room.RoomThemeMineActivity$ThemeType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:30)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity$ThemeType;", "", "Mine", "Customize", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ThemeType {
        Mine,
        Customize;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(themeTypeArr);
        }

        public ThemeType() {
            super(str, i);
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }
    }

    public final void OooOo(ThemeType themeType) {
        if (this.f26224OooOo00 == themeType) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i == 1) {
            OooOoO0().f43700OooO0Oo.setBackgroundResource(0);
            OooOoO0().f43700OooO0Oo.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.white));
            OooOoO0().f43701OooO0o0.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
            OooOoO0().f43701OooO0o0.setBackgroundResource(p596o0oo000O.OooO0o.OooO0o0() ? p565o0oOo000.o0OOO0o.shape_whit_radius25_right : p565o0oOo000.o0OOO0o.shape_whit_radius25_left);
            return;
        }
        if (i != 2) {
            return;
        }
        OooOoO0().f43701OooO0o0.setBackgroundResource(0);
        OooOoO0().f43701OooO0o0.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.white));
        OooOoO0().f43700OooO0Oo.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
        OooOoO0().f43700OooO0Oo.setBackgroundResource(p596o0oo000O.OooO0o.OooO0o0() ? p565o0oOo000.o0OOO0o.shape_whit_radius25_left : p565o0oOo000.o0OOO0o.shape_whit_radius25_right);
    }

    public final void OooOoO(ThemeType themeType) {
        if (this.f26224OooOo00 == themeType) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
        p527o0o0OO0.o00OO0O0 o00oo0o1 = this.f26223OooOo0;
        if (o00oo0o1 != null) {
            p588o0oOooO0.o0O00oO0.OooO0O0(oooO00o, o00oo0o1);
        }
        int i = OooO00o.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i == 1) {
            RoomThemeMineFragment roomThemeMineFragment = this.f26225OooOo0O;
            if (roomThemeMineFragment == null) {
                this.f26225OooOo0O = new RoomThemeMineFragment();
                int id = OooOoO0().f43698OooO0O0.getId();
                RoomThemeMineFragment roomThemeMineFragment2 = this.f26225OooOo0O;
                Intrinsics.checkNotNull(roomThemeMineFragment2);
                p588o0oOooO0.o0O00oO0.OooO00o(oooO00o, id, roomThemeMineFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeMineFragment);
                p588o0oOooO0.o0O00oO0.OooO0OO(oooO00o, roomThemeMineFragment);
            }
            this.f26223OooOo0 = this.f26225OooOo0O;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = this.f26226OooOo0o;
            if (roomThemeCustomizeFragment == null) {
                this.f26226OooOo0o = new RoomThemeCustomizeFragment();
                int id2 = OooOoO0().f43698OooO0O0.getId();
                RoomThemeCustomizeFragment roomThemeCustomizeFragment2 = this.f26226OooOo0o;
                Intrinsics.checkNotNull(roomThemeCustomizeFragment2);
                p588o0oOooO0.o0O00oO0.OooO00o(oooO00o, id2, roomThemeCustomizeFragment2);
            } else {
                Intrinsics.checkNotNull(roomThemeCustomizeFragment);
                p588o0oOooO0.o0O00oO0.OooO0OO(oooO00o, roomThemeCustomizeFragment);
            }
            this.f26223OooOo0 = this.f26226OooOo0o;
        }
        this.f26224OooOo00 = themeType;
        oooO00o.OooO0o0();
    }

    public final Oo0000 OooOoO0() {
        return (Oo0000) this.f26221OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO0().f43701OooO0o0)) {
            ThemeType themeType = ThemeType.Mine;
            OooOo(themeType);
            OooOoO(themeType);
        } else if (Intrinsics.areEqual(view, OooOoO0().f43700OooO0Oo)) {
            ThemeType themeType2 = ThemeType.Customize;
            OooOo(themeType2);
            OooOoO(themeType2);
        } else if (Intrinsics.areEqual(view, OooOoO0().f43699OooO0OO)) {
            h0.OooO0O0("105037");
            p532o0o0OOOO.o0O0o000.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, null, false, null, 14);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setContentView(OooOoO0().f43697OooO00o);
        OooOoO0().f43701OooO0o0.setOnClickListener(this);
        OooOoO0().f43700OooO0Oo.setOnClickListener(this);
        OooOoO0().f43699OooO0OO.setOnClickListener(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (serializable = extras.getSerializable("THEME_TYPE")) == null) {
            serializable = ThemeType.Mine;
        }
        Intrinsics.checkNotNull(serializable);
        if (serializable instanceof ThemeType) {
            ThemeType themeType = (ThemeType) serializable;
            OooOo(themeType);
            OooOoO(themeType);
        }
    }
}
