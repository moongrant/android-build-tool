package p100o000oOoo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImageKt;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Alignment f35502OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f35503OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f35504OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f35505OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000O0.OooO0O0, o0000O0.OooO0O0> f35506OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000O0.OooO0O0, Unit> f35507OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ ContentScale f35508OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f35509OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f35510OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f35511OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f35512OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f35513OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object obj, String str, Modifier modifier, Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function1, Function1<? super o0000O0.OooO0O0, Unit> function2, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, int i3) {
            super(2);
            this.f35503OooO0Oo = obj;
            this.f35505OooO0o0 = str;
            this.f35504OooO0o = modifier;
            this.f35506OooO0oO = function1;
            this.f35507OooO0oo = function2;
            this.f35502OooO = alignment;
            this.f35508OooOO0 = contentScale;
            this.f35509OooOO0O = f;
            this.f35510OooOO0o = colorFilter;
            this.f35512OooOOO0 = i;
            this.f35511OooOOO = i2;
            this.f35513OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O00.OooO00o(this.f35503OooO0Oo, this.f35505OooO0o0, this.f35504OooO0o, this.f35506OooO0oO, this.f35507OooO0oo, this.f35502OooO, this.f35508OooOO0, this.f35509OooOO0O, this.f35510OooOO0o, this.f35512OooOOO0, composer, this.f35511OooOOO | 1, this.f35513OooOOOO);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@Nullable Object obj, @Nullable String str, @Nullable Modifier modifier, @Nullable Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function1, @Nullable Function1<? super o0000O0.OooO0O0, Unit> function2, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3) {
        Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function3;
        int i4;
        int iM2139getDefaultFilterQualityfv9h1I;
        Composer composerStartRestartGroup = composer.startRestartGroup(-941517612);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 8) != 0) {
            i4 = i2 & (-7169);
            function3 = o0000O0.f35466OooOOoo;
        } else {
            function3 = function1;
            i4 = i2;
        }
        Function1<? super o0000O0.OooO0O0, Unit> function4 = (i3 & 16) != 0 ? null : function2;
        Alignment center = (i3 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : colorFilter;
        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            i4 &= -1879048193;
            iM2139getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2139getDefaultFilterQualityfv9h1I();
        } else {
            iM2139getDefaultFilterQualityfv9h1I = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i4, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i5 = i4 << 3;
        AsyncImageKt.OooO00o(obj, str, o000O0o.OooO00o(o000Oo0.f35516OooO00o, composerStartRestartGroup), modifier2, function3, function4, center, fit, f2, colorFilter2, iM2139getDefaultFilterQualityfv9h1I, composerStartRestartGroup, (i4 & 112) | 520 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i4 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(obj, str, modifier2, function3, function4, center, fit, f2, colorFilter2, iM2139getDefaultFilterQualityfv9h1I, i2, i3));
    }
}
