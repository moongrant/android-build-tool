package p587o0oOooO;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O00O;
import com.yalla.yalla.manager.AppUIThemeConfig;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p431o0OoOO.OooOo00;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOOO0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOOO0OO0 f56825OooO00o = new oOOO0OO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList f56826OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String f56827OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final String f56828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final String f56829OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56830OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            oOOO0OO0.f56826OooO0O0.clear();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppUIThemeConfig.values().length];
            try {
                iArr[AppUIThemeConfig.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppUIThemeConfig.RAMADAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppUIThemeConfig.SEVEN_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56831OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56831OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56831OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56831OooO0Oo;
        }

        public final int hashCode() {
            return this.f56831OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56831OooO0Oo.invoke(obj);
        }
    }

    static {
        OooOo00.f46776OooO00o.observeForever(new OooO0OO(OooO00o.f56830OooO0Oo));
        f56827OooO0OO = "com.yalla.yalla.ui.activity.main.StartActivity";
        f56828OooO0Oo = OooOOOO.OooO00o(o000O00O.OooO00o().getPackageName(), ".YallaRamdan");
        f56829OooO0o0 = OooOOOO.OooO00o(o000O00O.OooO00o().getPackageName(), ".YallaAnniversary");
    }

    public static int OooO0O0(int i) {
        MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
        int i2 = OooO0O0.$EnumSwitchMapping$0[OooOo00.OooO00o(Integer.valueOf(i)).ordinal()];
        if (i2 == 1) {
            return o0OOO0o.ic_moment_comment_praise_color;
        }
        if (i2 == 2) {
            return o0OOO0o.ic_moment_comment_praise_color_ramdan;
        }
        if (i2 == 3) {
            return o0OOO0o.ic_moment_comment_praise_color_seven_year;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int OooO0OO(int i) {
        MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
        int i2 = OooO0O0.$EnumSwitchMapping$0[OooOo00.OooO00o(Integer.valueOf(i)).ordinal()];
        if (i2 == 1) {
            return oo0o0Oo.ic_main_header_bg_bottom;
        }
        if (i2 == 2) {
            return oo0o0Oo.ic_main_header_bg_bottom_ramadan;
        }
        if (i2 == 3) {
            return oo0o0Oo.ic_main_header_bg_bottom_seven_year;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int OooO0Oo(int i) {
        MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
        int i2 = OooO0O0.$EnumSwitchMapping$0[OooOo00.OooO00o(Integer.valueOf(i)).ordinal()];
        if (i2 == 1) {
            return oo0o0Oo.ic_moment_post_create;
        }
        if (i2 == 2) {
            return oo0o0Oo.ic_moment_post_create_ramdan;
        }
        if (i2 == 3) {
            return oo0o0Oo.ic_moment_post_create_seven_year;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static String OooO0o() {
        int i = OooO0O0.$EnumSwitchMapping$0[OooOo00.OooO00o(OooOo00.f46776OooO00o.getValue()).ordinal()];
        if (i == 1) {
            return "svga/anim_moment_thumb_up.svga";
        }
        if (i == 2) {
            return "svga/anim_moment_thumb_up_ramdan.svga";
        }
        if (i == 3) {
            return "svga/anim_moment_thumb_up_seven_year.svga";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Composable
    public static int OooO0o0(@Nullable Composer composer) {
        int i;
        composer.startReplaceableGroup(-427030173);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-427030173, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.momentHasPraiseDrawableId (UIThemeConfigDrawableIdUtils.kt:223)");
        }
        int i2 = OooO0O0.$EnumSwitchMapping$0[OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(OooOo00.f46776OooO00o, composer, 8).getValue()).ordinal()];
        if (i2 == 1) {
            i = oo0o0Oo.ic_has_praise;
        } else if (i2 == 2) {
            i = oo0o0Oo.ic_has_praise_ramdan;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = oo0o0Oo.ic_has_praise_seven_year;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return i;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654096295);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654096295, i, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.MainHeadBottomImage (UIThemeConfigDrawableIdUtils.kt:258)");
        }
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(OooOo00.f46776OooO00o, composerStartRestartGroup, 8).getValue();
        ImageKt.Image(PainterResources_androidKt.painterResource(OooO0OO(num != null ? num.intValue() : 0), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOOO0OOO(this, modifier, i, i2));
    }
}
